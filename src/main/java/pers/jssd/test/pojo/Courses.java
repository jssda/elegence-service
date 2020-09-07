package pers.jssd.test.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Courses implements Serializable {
    private Long id;

    private String name;

    private static final long serialVersionUID = 1L;
}