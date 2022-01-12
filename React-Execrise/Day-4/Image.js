import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

class Img extends React.Component
{
  constructor()
  {
    super();
    this.toggleHandler = this.toggleHandler.bind(this);
    this.a=true;
  }

  toggleHandler()
  {
    this.a=!this.a;
    console.log(this.a)
    if(this.a)
    {
      document.getElementById("image").innerHTML="<img src='react.png'></img>"
      console.log(this.image)
    }else{
      document.getElementById("image").innerHTML="<img src='js.png'></img>"
      console.log(this.image)
    }
    
   
  }  
 render()
  {
    return(
    <>
   <div id="image">

   </div>
   <div>
   <button onClick={this.toggleHandler}>Click here!!!!</button>
   </div>
    </>
    );
  }
}

ReactDOM.render(
  <Img />,
  document.getElementById("root")
);