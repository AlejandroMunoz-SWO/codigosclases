import React from 'react'
import {  Link  } from 'react-router-dom'

export default function Navigation() {
  return (
    <div>
      <ul>
        <li>
          <Link  to= '/' >Inicio</Link>
        </li>

        <li>
          <Link  to= '/save' >Guardar Libro</Link>
        </li>
      </ul>
    </div>
  )
}
