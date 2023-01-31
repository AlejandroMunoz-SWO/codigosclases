using BiblioAPI.Config;
using BiblioAPI.Migrations;
using BiblioAPI.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace BiblioAPI.Controllers
{
    [Route("/api/author")]
    public class AuthorController : Controller
    {
        private readonly DBBooksContext _context;

        public AuthorController(DBBooksContext context)
        {
            _context = context;
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<Author>> GetAuthor(int id)
        {
            var authorExist = await _context.Authors.AnyAsync(x => x.Id == id);

            if (!authorExist)
            {
                return BadRequest($"No existe el autor con Id : {id}");
            }

            return await _context.Authors.Include(x=>x.Books).FirstOrDefaultAsync(x => x.Id == id);


        }

        [HttpGet("all")]
        public async Task<ActionResult<List<Author>>> GegAuthor(int id)
        {
            return await _context.Authors.Include(x=>x.Books).ToListAsync();
        }


        [HttpPost("save")]
        public async Task<ActionResult> SaveAuthor(Author author)
        {
            _context.Add(author);

            await _context.SaveChangesAsync();

            return Ok();
        }

     
       

        
    }
}
