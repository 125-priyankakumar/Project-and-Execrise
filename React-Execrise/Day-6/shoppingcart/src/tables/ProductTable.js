import React from "react";


const ProductTable = (props) => {

    return(
    
        <table>
            
            <thead>
                <tr>
                    <th>ProductName</th>
                    <th>BrandName</th>
                    <th>Price</th>
                    <th>NoOfQuantity</th>
                    <th>image</th>
                </tr>
            </thead>
            <tbody>
                {props.products.length > 0 ? (
                    props.products.map( (Product) =>
                <tr key={Product.id}>
                    <td>{Product.productName}</td>
                    <td>{Product.brandName}</td>
                    <td>{Product.price}</td>
                    <td>{Product.noOfQuantity}</td>
                    <td>{Product.image}</td>
                    
                </tr>
                )):(
                    <tr>
                        <td colSpan={6}>No User Found.</td>
                    </tr>
                )}
            </tbody>
            
        </table>
      
    );

}

export default ProductTable;