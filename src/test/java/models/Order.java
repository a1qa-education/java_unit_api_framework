package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long petId;
    private int quantity;
    private Long id;
    private String shipDate;
    private boolean complete;
    private String status;
}