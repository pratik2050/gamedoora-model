package mapper.reviewMapper;

import dto.reviewDTO.TenantUserDTO;
import mapper.BaseMapper;
import com.gamedoora.model.dao.TenantUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class TenantUserMapper extends BaseMapper {

    public abstract TenantUserDTO tenantUserToTenantUserDto(TenantUser tenantUser);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract TenantUser tenantUserDtoToTenantUser(TenantUserDTO tenantUserDTO);
}
