package com.comrade.domine;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "TOPIC_TYPE")
public class TopicTypeEntity {

    @Column(name = "TOPIC_TYPE_ID")
    private Long topicTypeId;

    @Column(name = "TOPIC_TYPE_NAME")
    private String topicTypeName;

}
