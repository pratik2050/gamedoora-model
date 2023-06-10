package dto.reviewDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class TaskDTO {

    private long id;

    private String description;

    private boolean isDone;
}
