package com.itl.consulting.test_task.controller.van;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/van")
@RequiredArgsConstructor
@Tag(name = "Контроллер для работы с сущностью Вагон")
public class VanController {

    @GetMapping()
    @Operation(summary = "Получение данных о вагоне")
    public String catalog(String name) {
        return "Hello " + name;
    }
}
