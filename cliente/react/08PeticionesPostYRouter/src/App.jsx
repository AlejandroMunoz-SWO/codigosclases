import React from 'react'
import './App.css'
import BooksList from './components/BooksList'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import SaveBooks from './components/SaveBooks'
import NotFound from './components/NotFound'
import Navigation from './components/Navigation'


function App() {

  return (

      <BrowserRouter>

        <Navigation />

        <Routes>
          <Route exact path='/' element={<BooksList />} />
          <Route exact path='/save' element={<SaveBooks />} />
          <Route path='*' element={<NotFound />} />
        </Routes>
      </BrowserRouter>
  )
}

export default App
