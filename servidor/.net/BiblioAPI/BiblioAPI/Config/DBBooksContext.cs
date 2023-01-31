using BiblioAPI.Models;
using Microsoft.EntityFrameworkCore;

namespace BiblioAPI.Config
{
    public class DBBooksContext  : DbContext
    {

        public DBBooksContext(DbContextOptions<DBBooksContext> options) :base(options)
        {

        }

        public DbSet<Book> Books { get; set; }
        public DbSet<Author> Authors { get; set; }
    }
}
