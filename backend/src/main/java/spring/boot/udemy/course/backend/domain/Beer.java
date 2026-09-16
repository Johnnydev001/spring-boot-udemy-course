package spring.boot.udemy.course.backend.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data 
@Builder 
public class Beer {

    private UUID id;
    private Integer quantity;
    private String brand;
    private BigDecimal price;
    private LocalDateTime createdDateTime;
    private String type;
    
}
