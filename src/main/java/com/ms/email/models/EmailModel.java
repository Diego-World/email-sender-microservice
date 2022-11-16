package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

// anotações: @Data @Entity e @Table
// @Data serve para gerar automaticamente os getters, settters e construtores
// @Entity serve para definir que esta classe vai ser uma entidade
// @Table serve para atribuir um nome a tabela criada no banco de dados local "ms-email"
// @Column para definir propriedades (columnDefinition = "Text") para aumentar o limite de caracteres na coluna


    @Data
    @Entity
    @Table(name = "TB_EMAIL")
    public class EmailModel implements Serializable {
        public static final long seriaVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long emailId;
        private String ownerRef;
        // ref do proprietario que está enviando a mensagem,
        // uma ref do usuario para quem esta sendo enviado o email;
        // Usado em um possível end point para listar todos os emails enviados para x usuario;
        private String emailFrom;
        private String emailTo;
        private String subject;
        @Column(columnDefinition = "TEXT")
        private String text;
        private LocalDateTime sendDateEmail;
        private StatusEmail statusEmail;

    }


