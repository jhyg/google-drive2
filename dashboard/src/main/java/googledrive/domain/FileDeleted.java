package googledrive.domain;

import googledrive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class FileDeleted extends AbstractEvent {

    private Long id;
}
