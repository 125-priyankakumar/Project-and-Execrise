import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';


const CurContext = React.createContext();

export default class CurrencyCalculator extends React.Component {
 
  render() {
    return (   
     
      <CurContext.Provider value={73.9}>
        <Tool/>
        </CurContext.Provider>
      
    )
  }
}

function Tool(){
  return(
    <div>
      <Currency />
    </div>
  )
}

class Currency extends React.Component{
  
  constructor(props)
  {
    super(props);
    this.state = {  dollar:'',inr:''  };
    this.handleChangeinr = this.handleChangeinr.bind(this);
    
    this.handleChangedlr = this.handleChangedlr.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    };

  handleChangeinr(event){

    this.setState({inr: event.target.value})   
    this.setState({dollar: event.target.value/this.context})   
    
  }
  handleChangedlr(event){
   
    this.setState({dollar: event.target.value})   
    this.setState({inr: event.target.value*this.context})  

  }
  handleSubmit(event){
    event.preventDefault();
}
  
  static contextType = CurContext;
  render(){
     
    return( 
       <div className='container'>
      <h1>Currency Converter</h1>
        <form  onSubmit={this.handleSubmit}>
        <label>Dollar: </label>        
        <input type="text"  style={{margin:"0px 0px 0px 15px"}} value={this.state.dollar} onChange={this.handleChangedlr} /> <br></br> <br></br>
        <label>Rupees: </label>
        <input type="text"  style={{margin:"10px 0px 0px 5px"}} value={this.state.inr} onChange={this.handleChangeinr} />
        <div className="row">
              <button onClick={() => alert('Thank you using this App')}>
                Close
              </button>
          </div>
        </form>
      
      </div>
      )
  }
}

ReactDOM.render(
  <CurrencyCalculator />,
  document.getElementById("root")
);