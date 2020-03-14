package com.aws.codestar.projecttemplates;

import com.aws.codestar.projecttemplates.controller.DatabaseHandler;
import com.aws.codestar.projecttemplates.controller.Team;
import com.aws.codestar.projecttemplates.controller.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.activation.DataHandler;

/** Simple class to start up the application.
 *
 * @SpringBootApplication adds:
 *  @Configuration
 *  @EnableAutoConfiguration
 *  @ComponentScan
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        DatabaseHandler databaseHandler = new DatabaseHandler();

        User user = new User("Danila", "ddneprov_24@mail.ru", "12345");
        Team team = new Team("Армада", 20, "City Football");

        databaseHandler.setNewUser(user);
        databaseHandler.setNewTeam(team);
    }

}
