using Microsoft.AspNetCore.Mvc;
using ModelsAndControllers.Models;

namespace ModelsAndControllers.Controllers
{
    public class AutorController : Controller
    {
        [HttpGet("/autores")]
        public ActionResult<List<Autor>>Get()
        {
            List<Autor> autores = new List<Autor>();

            autores.Add(new Autor(1, "Camilo José Cela"));
            autores.Add(new Autor(2, "Otero Pedrayo"));

            return autores;

        }
    }
}
