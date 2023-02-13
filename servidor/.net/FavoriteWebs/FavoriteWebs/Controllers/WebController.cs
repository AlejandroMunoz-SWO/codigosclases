using FavoriteWebs.Config;
using FavoriteWebs.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace FavoriteWebs.Controllers
{
    public class WebController : Controller
    {

        private readonly AppDBContext _context;

        public WebController(AppDBContext context)
        {
            _context = context;
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<Web>> GetWeb(int id)
        {
            return await _context.Webs.Include(x=> x.User).FirstOrDefaultAsync(x=> x.Id == id);
        }

    

        [HttpPost("save")]
        public async Task<ActionResult> Save([FromBody] Web web)
        {
        
               _context.Add(web);

               await _context.SaveChangesAsync();

               return Ok(web);
            
        }

        [HttpGet("list")]
        public async Task<ActionResult<List<Web>>> GetWebs()
        {
            return await _context.Webs.ToListAsync();
        }


       
    }
}
