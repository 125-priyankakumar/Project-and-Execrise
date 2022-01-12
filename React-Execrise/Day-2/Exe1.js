function Matrix(data) {
   for (i = 0; i < data.length; i++)
       {
        for (j = 0; j < data.length; j++)
         {
          if (data[i][j] !== 1 && i === j || data[i][j] && i !== j)
            return false;
           else if (data[i][j] !== 0 && i !== j || data[i][j] && i !== j)
            return false;
          }
        }
      return true;
    }
    console.log(Matrix([[1, 0, 0], [0, 1, 0], [0, 0, 1]]))
    console.log(Matrix([[1, 0, 0],  [0, 1, 0],  [1, 0, 1]]))

