package co.com.sofkau.entrenamento.curso;

import co.com.sofkau.entrenamiento.curso.commands.AgregarDirectrizMentoria;
import co.com.sofkau.entrenamiento.curso.values.CursoId;
import co.com.sofkau.entrenamiento.curso.values.Directiz;
import co.com.sofkau.entrenamiento.curso.values.MentoriaId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AgregarDirectrizMentoriaUseCaseTest {

    @InjectMocks
    private AgregarDirectrizMentoriaUseCase useCase;

    @Test
    void agregarDirectrizAMentoria(){
        //arrange
        CursoId cursoId = CursoId.of("001");
        MentoriaId mentoriaId = MentoriaId.of("M001");
        Directiz directiz = new Directiz ("Directriz de Mentoria");
        var command = new AgregarDirectrizMentoria( cursoId, mentoriaId, directiz);
    }
}
