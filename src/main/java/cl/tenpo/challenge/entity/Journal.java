package cl.tenpo.challenge.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Table(name = "journal")
@Data
public class Journal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalTime date;
    private String endpoint;
    private String request;
    private String response;

    public void setDate(LocalTime date) {
        this.date = date;
    }
    public LocalTime getDate() {
        return date;
    }
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    public String getEndpoint() {
        return endpoint;
    }

    public void setRequest(String request) {
        this.request = request;
    }
    public String getRequest() {
        return request;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    public String getResponse() {
        return response;
    }


}
