package br.com.meli.praticahql.controller;

import br.com.meli.praticahql.model.Diary;
import br.com.meli.praticahql.model.Patient;
import br.com.meli.praticahql.model.Turn;
import br.com.meli.praticahql.model.TurnStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.meli.praticahql.model.Dentist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class Populate {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("aulabancos");
    EntityManager em = factory.createEntityManager();

    @GetMapping("/populate")
    public String populate(){
        List <Dentist> listDentist = new ArrayList<>();
        List <Diary> listDiary = new ArrayList<>();
        List <Patient> listPatient = new ArrayList<>();
        List <TurnStatus> listTurnStatus = new ArrayList<>();
        List <Turn> listTurn = new ArrayList<>();

        for(int i=0;i<100;i++){
            listDentist.add(new Dentist("name"+i, "", "address", "dni", LocalDate.of(2000, Month.JANUARY, 11), "phone", "email", "codeMP"));
            listDiary.add(new Diary(LocalDate.now(), LocalDate.now(), listDentist.get(i)));
            listPatient.add(new Patient("name", "String lastName", "String address", "String dni",LocalDate.now() , "String phone","email"));
            listTurnStatus.add(new TurnStatus(i%2==0?"Final":"Remarcado"," "));
            listTurn.add(new Turn(LocalDate.now(), listDiary.get(i), listTurnStatus.get(i), listPatient.get(i)));
        }

        em.getTransaction().begin();
        listDentist.forEach(o -> em.persist(o));
        listDiary.forEach(o -> em.persist(o));
        listPatient.forEach(o -> em.persist(o));
        listTurnStatus.forEach(o -> em.persist(o));
        listTurn.forEach(o -> em.persist(o));

        em.getTransaction().commit();
        em.clear();

        return "populated";
    }
}
