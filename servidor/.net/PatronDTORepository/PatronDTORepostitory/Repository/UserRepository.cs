
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using PatronesUno.Config;
using PatronesUno.Models;
using PatronesUno.Repository.Interface;

namespace PatronesUno.Repository
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
            _context.Users.Add(user);
            await _context.SaveChangesAsync();
        }

        public async Task<List<User>> GetAllUsers()
        {
           return  await _context.Users.ToListAsync();
        }
    }
}
