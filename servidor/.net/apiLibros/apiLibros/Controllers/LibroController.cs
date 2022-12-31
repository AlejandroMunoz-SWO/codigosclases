using apiLibros.Config;
using apiLibros.Models;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace apiLibros.Controllers
{
    [Route("/api/libro")]
    [ApiController]
   
    public class LibroController : Controller
    {

        private readonly DBApiLibrosContext db;

        public LibroController(DBApiLibrosContext db)
        {
            this.db = db;
        }

        [HttpGet]
        [Route("list")]

        public async Task<ActionResult<List<Libro>>> Get()
        {
            List<Libro> libros = await db.Libros.ToListAsync();
            return Ok(libros);
        }

        [HttpGet("{id}" , Name ="GetLibro")]
        public async Task<ActionResult> GetLibro(int id)
        {
            var libro = await db.Libros.FirstOrDefaultAsync( x => x.Id == id );

            if (libro == null) { return NotFound(); }

            return Ok(libro);

        }

        [HttpPost]
        public async Task<ActionResult> PostLibro(Libro libro)
        {
            db.Libros.Add(libro);
            await db.SaveChangesAsync();

            return CreatedAtAction(nameof(GetLibro), new { id = libro.Id }, libro);

        }

        [HttpDelete("{id}")]
        public async Task<ActionResult> Delete(int id)
        {
            var libro = await db.Libros.FirstOrDefaultAsync(x => x.Id == id);

            if(libro == null) return NotFound();

            db.Entry(libro).State = EntityState.Deleted;

            await db.SaveChangesAsync();

            return NoContent();


        }


        [HttpPut]
        public async Task<ActionResult> PutBook(int id, Libro libro)
        {
            if (id != libro.Id) return NotFound();

            db.Entry<Libro>(libro).State = EntityState.Modified;

            await db.SaveChangesAsync();


            return NoContent();
        }

       

    }
}
