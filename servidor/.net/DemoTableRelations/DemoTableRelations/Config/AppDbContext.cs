using DemoTableRelations.Models;
using Microsoft.EntityFrameworkCore;

namespace DemoTableRelations.Config
{
    public class AppDbContext : DbContext
    {

        public AppDbContext(DbContextOptions<AppDbContext> options) :base(options) 
        {

        }

        public DbSet<User> Users{ get; set; }
        public DbSet<Web> Webs { get; set; }
    }
}
