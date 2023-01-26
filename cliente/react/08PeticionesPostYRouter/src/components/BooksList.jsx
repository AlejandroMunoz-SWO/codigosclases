import { useState, useEffect} from 'react';
import BookService from '../http/BookService';
import Books from '../pages/Books'

const BooksList = () => {

  const [data,setData] = useState([])

  useEffect(()=>{
    BookService.getAll().then(
          res => setData(res.data)
        )
        .catch(err=>console.error(err))
    },[])
 

  return (
    <div>
       <Books books ={data} />
    </div>
  );
}

export default BooksList;
