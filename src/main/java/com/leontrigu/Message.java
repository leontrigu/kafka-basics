package com.leontrigu;

import java.time.LocalDateTime;

public record Message(String message, LocalDateTime created) {
}
