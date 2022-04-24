package com.example.gestionetudiants;

import com.example.gestionetudiants.entities.Etudiant;
import com.example.gestionetudiants.enumerations.StudentGenre;
import com.example.gestionetudiants.repositories.EtudiantRepository;
import com.example.gestionetudiants.security.services.SecurityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;

@SpringBootApplication
@EnableSwagger2
public class GestionEtudiantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionEtudiantsApplication.class, args);
    }


    //@Bean
    CommandLineRunner commandLineRunner(EtudiantRepository etudiantRepository){

        return args -> {
           etudiantRepository.save(new Etudiant(null, "sabri", "ssaaa", "sa@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "aitsalah", "karima", "aitsa@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "rouita", "salma", "rouita@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "tajia", "wissale", "ettaji@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "ouardi", "marwa", "marwa@gmail.com", new Date(), StudentGenre.FEMININ, true));

            etudiantRepository.save(new Etudiant(null, "sabri", "wissale", "wiss1@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "sabri", "wissale", "wiss2@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "sabri", "wissale", "wiss3@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "sabri", "wissale", "wiss4@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "sabri", "wissale", "wiss5@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "sabri", "wissale", "wiss6@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "sabri", "wissale", "wiss7@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "sabri", "wissale", "wiss8@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "sabri", "wissale", "wiss9@gmail.com", new Date(), StudentGenre.FEMININ, true));
            etudiantRepository.save(new Etudiant(null, "sabri", "wissale", "wiss10@gmail.com", new Date(), StudentGenre.FEMININ, true));

            etudiantRepository.save(new Etudiant(null, "elmia", "hamza", "elmi@gmail.com", new Date(), StudentGenre.MASCULIN, true));


            etudiantRepository.findAll().forEach(e->
            {
                System.out.println("nom : " + e.getNom());
            });

        };
    }


    //@Bean
    CommandLineRunner saveUsers(SecurityService securityService){
        return args ->{
            securityService.saveNewUser("mohamed","1234","1234");
            securityService.saveNewUser("wissale","1234","1234");
            securityService.saveNewUser("basma","1234","1234");

            securityService.saveNewRole("USER","");
            securityService.saveNewRole("ADMIN","");

            securityService.addRoleToUser("wissale","USER");
            securityService.addRoleToUser("wissale","ADMIN");
            securityService.addRoleToUser("basma","USER");
            securityService.addRoleToUser("mohamed","USER");


        };
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



}
