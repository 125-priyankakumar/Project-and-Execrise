import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
class Calculator extends React.Component
{
  constructor(props)
  {
    super(props);
    this.state = {
      a : parseInt(props.a),
      b : parseInt(props.b),
      c : "",
      result:0
    };
    this.AdditionHandler = this.AdditionHandler.bind(this);
    this.SubtractionHandler = this.SubtractionHandler.bind(this);
    this.MultipulicationHandler = this.MultipulicationHandler.bind(this);
    this.divisionHandler = this.divisionHandler.bind(this);
  }

  AdditionHandler()
  {
    this.setState(
      {c: "+"}
    );
    this.setState(i =>(
      {result:i.a+i.b}
    ));
  }
  SubtractionHandler()
  {
    this.setState(
      {c: "-"}
    );

    this.setState(i =>(
      {result : i.a-i.b}
    ));
  }

  MultipulicationHandler()
  { this.setState(
    {c: "*"}
  );
    this.setState(i=>(
      {result : i.a*i.b}
    ));
   
  }

  divisionHandler()
  { this.setState(
    {c: "/"}
  );
    this.setState(i=>(
      {result : i.a/i.b}
    ));
    
  }

  render()
  {
    return(<div>
     <h1>{this.state.a}{this.state.c}{this.state.b} is {this.state.result}</h1>
      <button onClick={this.AdditionHandler}>+</button><br></br>
      <button onClick={this.SubtractionHandler}>-</button> <br></br>
      <button onClick={this.MultipulicationHandler}>*</button><br></br>
      <button onClick={this.divisionHandler}>/</button><br></br>
    
    </div>
    );
  }
}

ReactDOM.render(
  <Calculator a="9" b="10"/>,
  document.getElementById("root")
);