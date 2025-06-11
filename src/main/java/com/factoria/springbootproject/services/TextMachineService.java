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
        public void updatePhrase(Long id, TextMachine updatedPhrase) {
            TextMachine existingPhrase = textMachineRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Frase no encontrada!"));

            existingPhrase.setAuthor(updatedPhrase.getAuthor());
            existingPhrase.setPhrase(updatedPhrase.getPhrase());

            textMachineRepository.save(existingPhrase);
        }
    }

    public void deletePhrase(Long id) {
        if (textMachineRepository.existsById(id)){
            textMachineRepository.deleteById(id);
        } else {
            System.out.println("Id no encontrado!");
        }
    }
}
