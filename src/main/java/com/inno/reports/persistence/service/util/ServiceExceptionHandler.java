package com.inno.reports.persistence.service.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


/**
 * Created by nethmih on 21.04.19.
 */

@ControllerAdvice
public class ServiceExceptionHandler extends ResponseEntityExceptionHandler {


    private static final Logger LOG = LoggerFactory.getLogger(ServiceExceptionHandler.class);

    private static ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

    @ExceptionHandler(Exception.class)
    public static ResponseEntity<Object> handleException(Exception e) {

        String error = "Server Error";
        return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST, error, e.toString()));

    }


    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {


        LOG.error(ex.getMessage(), ex);
        String error = "Missing Servlet Request ";
        return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST, error, ex.toString()));
    }


    @Override
    protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
                                                        HttpStatus status, WebRequest request) {


        LOG.error(ex.getMessage(), ex);

        String error = "Type mismatch";
        return buildResponseEntity(new ApiError(HttpStatus.BAD_REQUEST, error, ex.toString()));

    }


    @Override
    protected ResponseEntity<Object> handleNoHandlerFoundException(
            NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {


        LOG.error(ex.getMessage(), ex);

        String error = "Handler not found";
        return buildResponseEntity(new ApiError(HttpStatus.NOT_FOUND, error, ex.toString()));
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public static ResponseEntity<Object> handleSQLException(Exception e) {

        LOG.error(e.getMessage(), e);

        String error = "Malformed SQL request";
        return buildResponseEntity(new ApiError(HttpStatus.CONFLICT, error, e.toString()));
    }


}
