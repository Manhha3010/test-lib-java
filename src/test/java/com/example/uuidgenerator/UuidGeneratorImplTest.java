package com.example.uuidgenerator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class UuidGeneratorImplTest {

    private final UuidGenerator generator = new UuidGeneratorImpl();

    @Test
    void generateUuid_returnsValidUuid() {
        String uuid = generator.generateUuid();
        // UUID format: 8-4-4-4-12 hexadecimal characters
        assertThat(uuid).matches("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
    }
}
