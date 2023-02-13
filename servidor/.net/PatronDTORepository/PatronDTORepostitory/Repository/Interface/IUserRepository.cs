using Microsoft.AspNetCore.Mvc;
using PatronesUno.DTO;
using PatronesUno.Models;

namespace PatronesUno.Repository.Interface
{
    public interface IUserRepository
    {
         Task CreateUser(User user);
         Task<List<User>> GetAllUsers();
    }
}
