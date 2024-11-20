//package med.voll.spring.mth.api;
//
//
//import org.flywaydb.core.Flyway;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class FlywayConfiguration {
//
//    @Bean
//    public Flyway flyway(DataSource dataSource) {
//        Flyway flyway = Flyway.configure()
//                .dataSource(dataSource)
//                .cleanDisabled(false) // Habilita a limpeza do histórico
//                .load();
//        flyway.clean(); // Limpa o histórico de migrations
//        return flyway;
//    }
//}