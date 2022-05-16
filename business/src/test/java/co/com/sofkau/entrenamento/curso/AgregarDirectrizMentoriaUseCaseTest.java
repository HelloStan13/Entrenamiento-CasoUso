package co.com.sofkau.entrenamento.curso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.curso.commands.AgregarDirectrizMentoria;
import co.com.sofkau.entrenamiento.curso.events.MentoriaCreada;
import co.com.sofkau.entrenamiento.curso.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class AgregarDirectrizMentoriaUseCaseTest {

    @InjectMocks
    private AgregarDirectrizMentoriaUseCase useCase;
    @Mock
    private DomainEventRepository repository;

    @Test
    void agregarDirectrizAMentoria() {
        //arrange
        CursoId cursoId = CursoId.of("001");
        MentoriaId mentoriaId = MentoriaId.of("M001");
        Directiz directiz = new Directiz("Directriz de Mentoria");
        var command = new AgregarDirectrizMentoria(cursoId, mentoriaId, directiz);

        }
        //act
        private List<DomainEvent> history(){
            CursoId cursoId = CursoId.of("002");
            MentoriaId mentoriaId = MentoriaId.of("M002");
            Nombre nombre = new Nombre("Casos de usos DDD");
            Fecha fecha = new Fecha(LocalDateTime.now(), LocalDate.now());
            var event = new MentoriaCreada(
                    mentoriaId,
                    nombre,
                    fecha
            );
            event.setAggregateRootId("00010");
            return List.of(event);
        }

}

