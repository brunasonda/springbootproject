package com.factoria.springbootproject.services;
import com.factoria.springbootproject.models.TextMachine;
import com.factoria.springbootproject.repositories.TextMachineRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TextMachineService {
    private final TextMachineRepository textMachineRepository;

    public TextMachineService(TextMachineRepository textMachineRepository) {
        this.textMachineRepository = textMachineRepository;
    }

    public List<TextMachine> getAllTextMachine(){
        return textMachineRepository.findAll();
    }

    public TextMachine addPhrase(TextMachine newPhrase){
        return textMachineRepository.save(newPhrase);
    }

    public void updatePhrase(Long id, TextMachine updatedPhrase) {
    }

    public void deletePhrase(Long id) {
    }
}
