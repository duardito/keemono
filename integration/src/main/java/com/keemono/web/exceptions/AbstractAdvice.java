package com.keemono.web.exceptions;

import com.keemono.common.exceptions.ServiceErrors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by edu on 27/01/2015.
 */
@ControllerAdvice
public class AbstractAdvice {

    @ExceptionHandler(ServiceErrors.class)
    @ResponseBody
    public ResponseEntity serviceException(final ServiceErrors serviceErrors){
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }
}
