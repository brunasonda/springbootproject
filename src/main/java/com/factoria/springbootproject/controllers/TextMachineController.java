package com.factoria.springbootproject.controllers;
import com.factoria.springbootproject.models.TextMachine;
import com.factoria.springbootproject.services.TextMachineService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

public class TextMachineController {
    private final TextMachineService textMachineService;

    public TextMachineController(TextMachineService textMachineService) {
        this.textMachineService = textMachineService;
    }

    @GetMapping("/lista") //Listar
    public List<TextMachine> getAllTextMachine() {
        return textMachineService.getAllTextMachine();
    }
}