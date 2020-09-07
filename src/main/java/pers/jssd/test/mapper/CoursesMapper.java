package pers.jssd.test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pers.jssd.test.pojo.Courses;
import pers.jssd.test.pojo.CoursesExample;

@Mapper
public interface CoursesMapper {
    long countByExample(CoursesExample example);

    int deleteByExample(CoursesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Courses record);

    int insertSelective(Courses record);

    List<Courses> selectByExample(CoursesExample example);

    Courses selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Courses record, @Param("example") CoursesExample example);

    int updateByExample(@Param("record") Courses record, @Param("example") CoursesExample example);

    int updateByPrimaryKeySelective(Courses record);

    int updateByPrimaryKey(Courses record);
}