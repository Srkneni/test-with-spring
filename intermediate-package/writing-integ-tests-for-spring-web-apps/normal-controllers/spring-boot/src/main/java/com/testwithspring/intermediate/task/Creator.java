package com.testwithspring.intermediate.task;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
class Creator {

    @Column(name = "creator_id", nullable = false)
    private Long userId;

    /**
     * Required by Hibernate.
     */
    private Creator() {}

    Creator(Long userId) {
        this.userId = userId;
    }

    Long getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userId", this.userId)
                .build();
    }
}
