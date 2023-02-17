using DemoAutoMapper.Models;

namespace DemoAutoMapper.Repository.Interface
{
    public interface IUserRepository
    {
        Task CreateUser(User user);
        Task<List<User>> GetAllUsers();
    }
}
