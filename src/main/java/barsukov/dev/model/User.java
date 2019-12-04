package barsukov.dev.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@Builder
public class User {

    private Long id;

    private String fullName;

    @JsonIgnore
    private Map<Long, PhonebookNode> phonebook;
}
