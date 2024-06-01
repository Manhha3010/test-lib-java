package com.example.uuidgenerator;

import java.util.UUID;

public class UuidGeneratorImpl implements UuidGenerator{
    @Override
    public String generateUuid() {
        return UUID.randomUUID().toString();
    }
}
