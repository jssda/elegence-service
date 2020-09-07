package pers.jssd.test.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentCourses implements Serializable {
    private Long id;

    private Long studentId;

    private Long courseId;

    private Date startTime;

    private Integer score;

    private static final long serialVersionUID = 1L;
}