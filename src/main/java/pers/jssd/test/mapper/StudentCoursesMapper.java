package pers.jssd.test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import pers.jssd.test.pojo.StudentCourses;
import pers.jssd.test.pojo.StudentCoursesExample;

@Mapper
public interface StudentCoursesMapper {
    long countByExample(StudentCoursesExample example);

    int deleteByExample(StudentCoursesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudentCourses record);

    int insertSelective(StudentCourses record);

    List<StudentCourses> selectByExample(StudentCoursesExample example);

    StudentCourses selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudentCourses record, @Param("example") StudentCoursesExample example);

    int updateByExample(@Param("record") StudentCourses record, @Param("example") StudentCoursesExample example);

    int updateByPrimaryKeySelective(StudentCourses record);

    int updateByPrimaryKey(StudentCourses record);
}