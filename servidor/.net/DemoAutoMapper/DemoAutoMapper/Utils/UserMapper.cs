using AutoMapper;
using DemoAutoMapper.DTO;
using DemoAutoMapper.Models;

namespace DemoAutoMapper.Utils
{
    public class UserMapper : Profile
    {

        public UserMapper()
        {
            CreateMap<User, CreateUserDTO>();
            CreateMap<CreateUserDTO, User>();
            CreateMap<User,UserResponseDTO>();
            CreateMap<UserResponseDTO,User>();


        }
    }
}
