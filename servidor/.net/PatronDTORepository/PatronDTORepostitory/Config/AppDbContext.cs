using Microsoft.EntityFrameworkCore;
using PatronesUno.Models;

namespace PatronesUno.Config
{
    public class AppDbContext: DbContext
    {
        public AppDbContext(DbContextOptions<AppDbContext> options) : base(options) 
        {

        }

        public DbSet<User> Users { get; set; }
    }
}
