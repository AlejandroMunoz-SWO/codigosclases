using AutoMapper;
using PatronesUno.DTO;
using PatronesUno.Models;

namespace PatronesUno.Utils
{
    public class AutoMapperProfile : Profile
    {
        public AutoMapperProfile()
        {
            CreateMap<User, CreateUserDTO>();
            CreateMap<CreateUserDTO, User>();
        }
    }
}
