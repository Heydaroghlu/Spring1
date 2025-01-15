package Kapital.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY )
    private Address address;
}
