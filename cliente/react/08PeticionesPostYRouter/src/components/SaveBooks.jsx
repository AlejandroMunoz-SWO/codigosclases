import {useState, useEffect} from 'react'
import BookService from '../http/BookService';
import { useNavigate} from 'react-router-dom';

export default function SaveBooks() {

  const navigate = useNavigate()
  
  const [data, setData] = useState({
    title: '',
    author: ''
  }) 

  const handleChange = ({target}) => {
    setData({
      ...data,
      [target.name]:[target.value]
    })
  }

  const handleSubmit = (e) => {
    e.preventDefault()

    // console.log(data.title[0])
    // console.log(data.author[0])

    BookService.save(data.title[0],data.author[0]).then(
      res=>{
         navigate("/")
      }
    )
  }

  return (
    <div>
      <form onSubmit={handleSubmit}>
          <input type="text" name='title' placeholder='Título' value={data.title}
              onChange={handleChange}
              autoComplete='off' 
          />

          <br />

           <input type="text" name='author' placeholder='Autor' value={data.author} 
            onChange={ handleChange }
            autoComplete='off' 
         />

        <button type='submit'>Guardar</button>
      </form>
    </div>
  )
}
