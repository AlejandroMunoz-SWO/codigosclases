using BiblioAPI.Config;
using BiblioAPI.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace BiblioAPI.Controllers
{
    [Route("/api/book")]
    public class BookController : Controller
    {

        private readonly DBBooksContext _context;

        public BookController(DBBooksContext context)
        {
            _context = context;       
        }

        [HttpGet("list")]
        public async Task<ActionResult<List<Book>>> Get()
        {
           return await _context.Books.ToListAsync();
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<Book>> Show(int id)
        {
            var book = await _context.Books.FindAsync(id);

            return Ok(book);

        }



        [HttpPost("save")]
        public async Task<ActionResult> Post(Book book)
        {
            _context.Add(book);  // añado al contexto
            await _context.SaveChangesAsync(); 

            return Ok(book);    
        }



        [HttpPut("update/{id}")]
        public async Task<ActionResult> Put(int id, Book book)
        {
            _context.Entry(book).State= EntityState.Modified;
            await _context.SaveChangesAsync();

            return Ok(book);
        }

        [HttpDelete("delete/{id}")]
        public async Task<ActionResult> Delete(int id)
        {
            Book libro = await _context.Books.FindAsync(id);

            _context.Remove(libro);

            await _context.SaveChangesAsync();

            return NoContent();



        }



 
    }
}
