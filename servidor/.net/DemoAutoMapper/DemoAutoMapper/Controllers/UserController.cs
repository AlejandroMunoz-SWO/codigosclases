using AutoMapper;
using DemoAutoMapper.DTO;
using DemoAutoMapper.Models;
using DemoAutoMapper.Repository.Interface;
using Microsoft.AspNetCore.Mvc;

namespace DemoAutoMapper.Controllers
{
    [Route("/api/user")]
    public class UserController : Controller
    {

        private readonly IMapper _mapper;

        private readonly IUserRepository _userRepository;

        public UserController(IMapper mapper , IUserRepository userRepository)
        {
            _mapper = mapper;
            _userRepository = userRepository;

        }

        [HttpGet("list")]
        public async Task<ActionResult<List<UserResponseDTO>>> GetAllUserNames()
        {
            var users = await _userRepository.GetAllUsers();    

            return _mapper.Map<List<UserResponseDTO>>(users);
        }


    


        
    }


}
