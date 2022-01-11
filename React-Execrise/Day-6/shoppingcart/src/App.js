import { useState } from 'react';
import React from 'react'
import './App.css';
import ProductTable from './tables/ProductTable';


const App = () =>{
  const productList = [
    {id:1,productName:'One Plus 13',brandName:'oneplus',price:70000,noOfQuantity:'10',image:<img src="https://images.unsplash.com/photo-1628582091924-296b8ec1fffe?ixlib=rb-1.2.1" alt="oneplus" />},
    {id:2,productName:'Dell Intel',brandName:'Dell',price:50000,noOfQuantity:'10',image:<img src="https://images.unsplash.com/photo-1588872657578-7efd1f1555ed?ixlib=rb-1.2.1" alt="dell" />},
    {id:3,productName:'Jio Hotspot',brandName:'Hotspot',price:2000,noOfQuantity:'10',image:<img src="https://images.unsplash.com/photo-1594025149461-6338fc34e3f2?ixlib=rb-1.2.1" alt="jio" />},
    {id:4,productName:'Refrigerator',brandName:'LG',price:40000,noOfQuantity:'10',image:<img src="https://images.unsplash.com/photo-1542331325-bebfc9b990d7?ixlib=rb-1.2.1" alt="lg" />},
    {id:5,productName:'HeadPhones',brandName:'Sony',price:1000,noOfQuantity:'10',image:<img src="https://media.istockphoto.com/photos/headphone-isolated-on-white-background-picture-id1211511209?b=1" alt="head" />},
    {id:6,productName:'HealthCareDevices',brandName:'Reliable Pulse',price:2000,noOfQuantity:'10',image:<img src="https://media.istockphoto.com/photos/stethoscope-or-phonendoscope-on-a-doctors-white-desk-on-cloudy-of-picture-id1137049930?b=1" alt="plus" />},
    
  ];

  const [products,setProducts] = useState(productList);

  return(
    <div className='container'>
      <h1>Welcome to Shopping..!!</h1>
      <div className='flex-row'>
        <div className='flex-largs'>
          <h2>Product lists</h2>
         <ProductTable products={products} />
        </div>
      </div>
    </div>
  );

}
export default App;