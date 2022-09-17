package controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WorkerController {

    @GetMapping("/assign")
    public ResponseEntity<String> assignNewFileName(@RequestParam("name") String name){
//        здесь должен быть метод из сервиса, который преобразует имя в новый формат
        return ResponseEntity.ok("A new file name is:");
    }
}
