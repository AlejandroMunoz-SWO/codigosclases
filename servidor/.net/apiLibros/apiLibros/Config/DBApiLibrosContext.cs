using apiLibros.Models;
using Microsoft.EntityFrameworkCore;

namespace apiLibros.Config
{
    public class DBApiLibrosContext : DbContext
    {
        public DBApiLibrosContext(DbContextOptions<DBApiLibrosContext> options) :base(options)
        {

        }

        public DbSet<Libro> Libros { get; set; }
    }
}
