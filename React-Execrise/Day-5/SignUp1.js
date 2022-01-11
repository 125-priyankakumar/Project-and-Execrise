import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';


class Signup extends React.Component{
  constructor(props){
    super(props);
     this.state = {
       isDisabled:true
     }                                                                                                 
     this.submitForm = this.submitForm.bind(this);
  }
  validateEmail(email){
   const pattern = /[a-zA-Z0-9]+[\.]?([a-zA-Z0-9]+)?[\@][a-z]{3,9}[\.][a-z]{2,5}/g;
   const result = pattern.test(email);
   if(result===true){
     this.setState({
       emailError:false,
       email:email
     })
   } else{
     this.setState({
       emailError:true
     })
   }
 }
 handleChange(e){
  const target = e.target;
  const value = target.type === 'checkbox' ? target.checked : target.value;
  const name = target.name;
  this.setState({
    [name]: value
  });
  if(e.target.name==='firstname'){
    if(e.target.value==='' || e.target.value===null ){
      this.setState({
        firstnameError:true
      })
    } else {
      this.setState({
        firstnameError:false,     
        firstName:e.target.value
      })
    }
  }
  if(e.target.name==='lastname'){
    if(e.target.value==='' || e.target.value===null){
      this.setState({
        lastnameError:true
      })
    } else {
      this.setState({
        lastnameError:false,
        lastName:e.target.value
      })
    }
  }
  if(e.target.name==='email'){
   this.validateEmail(e.target.value);
  }
  if(e.target.name==='password'){
    if(e.target.value==='' || e.target.value===null){
      this.setState({
        passwordError:true
      })
    } else {
      this.setState({
        passwordError:false,
        password:e.target.value
      })
    }
 }
 if(this.state.firstnameError===false && this.state.lastnameError===false && 
  this.state.emailError===false && this.state.passwordError===false){
    this.setState({
      isDisabled:false
    })
 }
}
submitForm(e){
  e.preventDefault();
  const data = {
   firstName: this.state.firstName,
   lastName: this.state.lastName,
   email: this.state.email,
   password: this.state.password
  }
}
handleSubmit(e){
  alert("Signup_Sucessfully");
  e.preventDefault();
 }

render(){
return(
<div class="container">
<form>
    <h1>SIGNUP FORM</h1>
    <div>
    <label htmlFor="firstname">FristName:</label>
       <input type="text" id="firstname" name="firstname"  placeholder="Enter firstname" onChange={(e)=>{this.handleChange(e)}} />
            {this.state.firstnameError ? <span>Please Enter the Frist name</span> : ''}            
    </div>

     <div>
     <label htmlFor="lastname">Lastname:</label>
      <input type="text" id="lastname" name="lastname"  placeholder="Enter lastname" onChange={(e)=>{this.handleChange(e)}} />
      {this.state.lastnameError ? <span>Please Enter the Last name</span> : ''}
    </div>
     <div>
     <label htmlFor="email">Email:</label>
      <input type="email" id="email" name="email" placeholder="Enter your email" onChange={(e)=>{this.handleChange(e)}} />
      {this.state.emailError ? <span>Please Enter valid email address</span> : ''}
      </div>
      <div>
     <label htmlFor="password">Password :</label>
      <input type="password" id="password" name="password" placeholder="Password" onChange={(e)=>{this.handleChange(e)}} />
      {this.state.passwordError ? <span>Please enter some value</span> : ''}
      </div>
      <button disabled={this.state.isDisabled} onClick={this.submitForm}>Signup</button>
    </form>
    </div>    
);
}
}
ReactDOM.render(  <Signup /> ,
document.getElementById('root')
);
  
