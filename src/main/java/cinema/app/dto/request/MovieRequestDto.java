package cinema.app.dto.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class MovieRequestDto {
    @NotNull
    private String title;
    @Size(max = 200)
    private String description;
}
