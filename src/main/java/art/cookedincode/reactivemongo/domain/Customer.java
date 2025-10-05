package art.cookedincode.reactivemongo.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by Georgi Ivanov
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    private Integer id;

    @NotBlank
    private String customerName;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
}
