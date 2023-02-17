using DemoAutoMapper.Models;
using Microsoft.EntityFrameworkCore;

namespace DemoAutoMapper.Config
{
    public class AppDbContext : DbContext
    {

        public AppDbContext(DbContextOptions<AppDbContext> options) :base(options) 
        {

        }

        public DbSet<User> Users { get; set; }
    }
}
