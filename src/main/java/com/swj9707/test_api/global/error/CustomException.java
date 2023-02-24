package com.swj9707.test_api.global.error;

import com.swj9707.test_api.global.enums.CustomError;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomException extends RuntimeException {
    final CustomError errorCode;
}