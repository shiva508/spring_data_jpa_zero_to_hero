package com.comrade.domine;

import jakarta.persistence.*;

@Entity
@Table(name = "TOPIC")
public class TopicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TOPIC_ID")
    private Long topicId;

    @Column(name = "TOPIC_NAME")
    private String topicName;

}
