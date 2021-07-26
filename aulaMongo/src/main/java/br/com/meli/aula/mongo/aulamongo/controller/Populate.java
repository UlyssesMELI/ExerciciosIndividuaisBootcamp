package br.com.meli.aula.mongo.aulamongo.controller;

import br.com.meli.aula.mongo.aulamongo.model.*;
import br.com.meli.aula.mongo.aulamongo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Populate {

    private DentistService dentistService;
    private DiaryService diaryService;
    private PatientService patientService;
    private TurnService turnService;
    private TurnStatusService turnStatusService;

    @Autowired
    public Populate(DentistService dentistService, DiaryService diaryService, PatientService patientService, TurnService turnService, TurnStatusService turnStatusService) {
        this.dentistService = dentistService;
        this.diaryService = diaryService;
        this.patientService = patientService;
        this.turnService = turnService;
        this.turnStatusService = turnStatusService;
    }

    @GetMapping("/populate")
    public String populate(){
        List<Dentist> listDentist = new ArrayList<>();
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

        listDentist.forEach(o -> this.dentistService.insert(o));
        listDiary.forEach(o -> this.diaryService.insert(o));
        listPatient.forEach(o -> this.patientService.insert(o));
        listTurnStatus.forEach(o -> this.turnStatusService.insert(o));
        listTurn.forEach(o -> this.turnService.insert(o));

        return "populated";
    }


}
