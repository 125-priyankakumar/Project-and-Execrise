import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import { useState } from 'react';
const CurContext = React.createContext();

export default class CurrencyCalculator extends React.Component {
 
  render() {
    return (   
     
      <CurContext.Provider value={10}>
        <Tool/>
        </CurContext.Provider>
      
    )
  }
}

function Tool(props){

  return(
    <div>
      <Currency curr={props.curr}/>
    </div>
  )
}

class Currency extends React.Component{
  static contextType = CurContext;
  constructor(props)
  {
    super(props);
    this.state = {
      value:''
     };
     this.handleChange = this.handleChange.bind(this);
     this.handleSubmit = this.handleSubmit.bind(this);
    };
  handleChange(event){
    this.setState({value: event.target.value})
   
  }
  
  handleSubmit(event){
    event.preventDefault();
   
  }
  
  render(){
    const val=this.state.value;
     this.context=this.state.value
    return( 
   <div className='container'>
      <h1>Currency Convertion</h1>
       <form  onSubmit={this.handleSubmit}>
        <lable>Enter amount in Dollar:           
        <input type="text"  style={{marginLeft:"10px"}} value={this.state.value} onChange={this.handleChange} /> <br></br> <br></br>
        </lable>
          </form>
       
       <p>$${this.state.value} is {this.context*73.93} Rupees</p>
      <p>$${this.state.value} is {this.context*115.42} Yen</p>
      <div className="row">
              <button onClick={() => alert('Thank you for using this app')}>
                Close
              </button>
        </div>
      </div>
      )
  }
}

ReactDOM.render(
  <CurrencyCalculator />,
  document.getElementById("root")
);
