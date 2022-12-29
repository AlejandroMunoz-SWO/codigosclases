namespace ModelsAndControllers.Models
{
    public class Autor
    {
        public int Id { get; set; }
        public string Nombre { get; set; }

        public Autor(int Id, string Nombre)
        {
            this.Id = Id;
            this.Nombre = Nombre;

        }


    }
}
