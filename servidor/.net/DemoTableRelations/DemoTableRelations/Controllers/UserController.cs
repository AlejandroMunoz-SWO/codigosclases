using DemoTableRelations.Config;
using DemoTableRelations.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace DemoTableRelations.Controllers
{
    [Route("/api/user")]
    public class UserController : Controller
    {

        private readonly AppDbContext _context;

        public UserController(AppDbContext context)
        {
            _context = context;
        }

        [HttpPost("save")]
        public async Task<ActionResult> SaveUser([FromBody] User user)
        {
            _context.Add(user);
            await _context.SaveChangesAsync(); 

            return Ok(user);

        }

        [HttpGet("list")]
        public async Task<ActionResult<List<User>>> UsersList()
        {
            return await _context.Users.ToListAsync();
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<User>> GetUser(int id)
        {
            var userExist = await _context.Users.AnyAsync(x => x.Id == id);

            if (!userExist)
            {
                return BadRequest($"EL usuario con id {id} no existe");
            }

            return await _context.Users.Include(x=>x.Webs).FirstOrDefaultAsync(x => x.Id == id);

        }
        
    }
}
