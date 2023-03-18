package ma.enset.patientsmvc;

import ma.enset.patientsmvc.entities.Patient;
import ma.enset.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvcApplication.class, args);
    }

@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient(null,"Anas",new Date(),false,300)
            );patientRepository.save(
                    new Patient(null,"Marouane",new Date(),false,120)
            );patientRepository.save(
                    new Patient(null,"Akram",new Date(),false,102)
            );
            patientRepository.findAll().forEach(p->{
                System.out.println(p.getNom());
            });
        };
    }






}
