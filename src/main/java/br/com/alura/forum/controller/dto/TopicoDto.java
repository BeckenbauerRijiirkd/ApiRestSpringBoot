package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.com.alura.forum.model.Topico;

public class TopicoDto {
    
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriação;
    
    public TopicoDto(Topico topico){
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriação = topico.getDataCriacao();
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return LocalDateTime return the dataCriação
     */
    public LocalDateTime getDataCriação() {
        return dataCriação;
    }

    /**
     * @param dataCriação the dataCriação to set
     */
    public void setDataCriação(LocalDateTime dataCriação) {
        this.dataCriação = dataCriação;
    }

    public static Page<TopicoDto> converter(Page<Topico> topicos){
        return topicos.map(TopicoDto::new);
    }

}
