package com.work.shop.exception;

import lombok.Data;

@Data
public class BaseException extends ApiException {

    public BaseException() {
        setCode(this.getClass().getSimpleName());
    }
}
