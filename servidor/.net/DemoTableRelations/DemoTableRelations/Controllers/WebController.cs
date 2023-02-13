using DemoTableRelations.Config;
using DemoTableRelations.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace DemoTableRelations.Controllers
{
    [Route("/api/web")]
    public class WebController : Controller
    {

        private readonly AppDbContext _context;

        public WebController(AppDbContext context)
        {
            _context = context;
        }

        [HttpPost("save")]
        public async Task<ActionResult> SaveWeb([FromBody] Web web)
        {
            _context.Add(web);

            await _context.SaveChangesAsync();

            return Ok(web);

        }

        [HttpGet("list")]
        public async Task<ActionResult<List<Web>>> WebsList()
        {
            return await _context.Webs.ToListAsync();
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<Web>> WebsById(int id)
        {
            var webExists = await _context.Webs.AnyAsync(x => x.Id == id);

            if (!webExists)
            {
                return BadRequest($"La web con id {id} no exite");
            }

            return await _context.Webs.Include(x => x.User).FirstOrDefaultAsync(x=>x.Id == id);

        }


        
    }
}
