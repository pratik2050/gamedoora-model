package dto.reviewDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CommentsDTO {

    private long id;

    private String context;

    private long commentableId;

    private String type;
}
