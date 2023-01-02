using BiblioAPI.Config;
using BiblioAPI.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace BiblioAPI.Controllers
{
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

        [HttpPost("save")]
        public async Task<ActionResult> Post(Book book)
        {
            _context.Add(book);  // añado al contexto
            await _context.SaveChangesAsync();

            return Ok();    
        }


        
    }
}
