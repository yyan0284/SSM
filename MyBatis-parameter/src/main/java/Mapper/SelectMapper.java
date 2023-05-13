package Mapper;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface SelectMapper {
    Map<String,Object> getFruitByIdToMap(@Param("fid") int fid);
}
