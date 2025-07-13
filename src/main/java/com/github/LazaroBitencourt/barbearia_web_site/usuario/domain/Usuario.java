package com.github.LazaroBitencourt.barbearia_web_site.usuario.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "Integer", name = "id_usuario", unique = true, nullable = false)
    private Long id;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String senha;
    private String fotoUrl;
    @Column(nullable = false)
    private String primeiroNome;
    private String sobreNome;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;
    private Boolean statusUsuario;
    private LocalDateTime dataHoraCriacao = LocalDateTime.now();
    private LocalDateTime dataHoraUltimaAtualizacao;
}
