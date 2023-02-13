using AutoMapper;
using Microsoft.AspNetCore.Mvc;
using PatronesUno.DTO;
using PatronesUno.Models;
using PatronesUno.Repository.Interface;

namespace PatronesUno.Controllers
{
    [Route("/api/user")]
    public class UserController : Controller
    {

        private readonly IUserRepository _userRepository;

        public UserController(IUserRepository userRepository)
        {
            _userRepository = userRepository;

        }

        [HttpPost("save")]
        public async Task<ActionResult> Create([FromBody] CreateUserDTO createUserDTO)
        {

            var user = new User();

            user.UserName = createUserDTO.UserName;
            user.Password = createUserDTO.Password;
            user.Email = createUserDTO.Email;
            user.Surname = createUserDTO.Surname;
            user.ClientName = createUserDTO.ClientName;
         
         
            await _userRepository.CreateUser(user);

            return Ok(createUserDTO);

        }
        [HttpGet("list")]
        public async Task<ActionResult<List<User>>> GetUser(){

            return await _userRepository.GetAllUsers();

        }

      


       
    }
}
