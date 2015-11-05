package com.omoto.choco.models;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Slf4j
@Data
@Table(name = "test")
public class TestClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private UUID tenantId;

    private String sampleText;
}
