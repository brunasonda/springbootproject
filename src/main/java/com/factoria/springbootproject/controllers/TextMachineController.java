package com.factoria.springbootproject.controllers;
import com.factoria.springbootproject.models.TextMachine;
import com.factoria.springbootproject.services.TextMachineService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class TextMachineController {
    private final TextMachineService textMachineService;

    public TextMachineController(TextMachineService textMachineService) {
        this.textMachineService = textMachineService;
    }

    @GetMapping("/list")
    public List<TextMachine> getAllTextMachine() {
        return textMachineService.getAllTextMachine();
    }

    @GetMapping("/find/{id}")
    public TextMachine findById(@PathVariable Long id) {
        return textMachineService.findById(id);
    }

    @PostMapping("/add")
    public void addPhrase(@RequestBody TextMachine newPhrase) {
        textMachineService.addPhrase(newPhrase);
    }
    @PutMapping("/update/{id}")
    public void updatePhrase(
            @PathVariable Long id,
            @RequestBody TextMachine updatedPhrase) {
        textMachineService.updatePhrase(id, updatedPhrase);
    }
    @DeleteMapping("/delete/{id}")
    public void deletePhrase(@PathVariable Long id) {
        textMachineService.deletePhrase(id);
    }
}
