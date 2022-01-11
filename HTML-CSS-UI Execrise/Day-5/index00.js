import ReactDOM from 'react-dom';
import './index.css';
import React, { useState } from "react";


//working with forms

function Login(props) {

  const[email,setemail] = useState("");
  const[pwd,setpwd] = useState("");
 
  const changeHandler =(event) =>{
    var val=event.target.value;
      if (event.target.name=="email"){
        setemail(val);
      }else if (event.target.name=="pwd"){
          setpwd(val);
      }

      
  }

const handleSubmit = () =>{
    if(email==="admin@123" && pwd==="pass"){
      alert("login successfull")
  }else{
    alert("invalid credentials")
  }
  }
        
        
        return (<div className="App auth-wrapper auth-inner">
        
         
            <form onSubmit={handleSubmit} >
                <h3>Login Up</h3>
                
               
                <div className="form-group">
                    <label>Email address</label>
                    <input name="email" type="email"  onChange={changeHandler} className="form-control" placeholder="Enter email"  />
                </div>             

                <div className="form-group">
                    <label>Password</label>
                    <input name="pwd" type="password"  onChange={changeHandler} className="form-control" placeholder="Enter password"   />
                </div>

               

                <button type="submit" className="btn btn-primary btn-block pad ">Login</button>
                <p className="forgot-password text-right">
                    New to site <a href="hook_signup.js">sign up?</a>
                </p>
            </form></div>
        );
    
}

ReactDOM.render(
  <React.StrictMode>
    <Login />
  </React.StrictMode>,
  document.getElementById('root')
);