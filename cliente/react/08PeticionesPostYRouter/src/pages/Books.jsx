import React from 'react';

const BooksList = ({books}) => {
  return (
    <>
      <table>
        <thead>
          <tr>
            <th>Título</th>
            <th>Autor</th>
          </tr>
        </thead>

        <tbody>
          {
            books.map((books,i) => {
              return(
                <tr key={i}>
                  <td>{books.title}</td>
                  <td>{books.author}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </>
  );
}

export default BooksList;
