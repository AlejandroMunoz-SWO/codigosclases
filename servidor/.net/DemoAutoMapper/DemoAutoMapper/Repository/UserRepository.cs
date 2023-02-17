using DemoAutoMapper.Config;
using DemoAutoMapper.Models;
using DemoAutoMapper.Repository.Interface;
using Microsoft.EntityFrameworkCore;

namespace DemoAutoMapper.Repository
{
    public class UserRepository : IUserRepository
    {
        private readonly AppDbContext _context;

        public UserRepository(AppDbContext context)
        {
            _context = context;
                
        }
        public async Task CreateUser(User user)
        {
            _context.Add(user);
            await _context.SaveChangesAsync();  
        }

        public async Task<List<User>> GetAllUsers()
        {
            return await _context.Users.ToListAsync();
        }
    }
}
