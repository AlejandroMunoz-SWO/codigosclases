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

        [HttpGet("{id}")]
        public async Task<ActionResult<Book>> GetBook(int id)
        {
            return await _context.Books.Include(x => x.Author).FirstOrDefaultAsync(X => X.Id == id);
        }

        [HttpGet("list")]
        public async Task<ActionResult<List<Book>>> Get()
        {
           return await _context.Books.ToListAsync();
        }

        [HttpPost("save")]
        public async Task<ActionResult> Post(Book book)
        {

            var authorExist = await _context.Authors.AnyAsync(x => x.Id == book.AuthorId);

            if (!authorExist)
            {
                return BadRequest($"No existe el autor con Id : {book.AuthorId}");
            }

            _context.Add(book);  // añado al contexto
            await _context.SaveChangesAsync();

            return Ok();    
        }


        
    }
}
