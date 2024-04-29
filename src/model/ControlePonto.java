package model;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ControlePonto {

    public String registraEntrada(Funcionario funcionario) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String textoEntrada = "Entrada: " + funcionario.getIdFunc() + " - " + funcionario.getNome() +
                " Data e Hora: " + formatter.format(agora);
        return textoEntrada;
    }

    public String registraSaida(Funcionario funcionario) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String textoSaida = "Saída: " + funcionario.getIdFunc() + " - " + funcionario.getNome() +
                " Data e Hora: " + formatter.format(agora);
        return textoSaida;
    }
}


