package com.mapper;


import com.pojo.PetsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PetsMapper {
    List<PetsInfo> queryPetsInfoByBaseId(Integer base_id);
}