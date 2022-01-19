package com.midori.apimaster.common.DTO;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Builder
@Data
public class ResponseDTO {
    protected LocalDateTime timestamp;
    protected String message;
    protected Map<?,?> data;
}
