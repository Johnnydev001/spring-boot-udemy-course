package spring.boot.udemy.course.backend.exception;

import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
//public class ExceptionController {
//
//    @ExceptionHandler(NotFoundException.class)
//    public ResponseEntity handleNotFoundException() {
//        return ResponseEntity.notFound().build();
//    }
//
//    @ExceptionHandler(IllegalArgumentException.class)
//    public ResponseEntity handleBadRequest() {
//        return ResponseEntity.badRequest().build();
//    }
//
//    @ExceptionHandler(IllegalArgumentException.class)
//    public ResponseEntity handleIllegalArgumentException(){
//        return ResponseEntity.badRequest().body("Illegal argument");
//    }
//
//}
