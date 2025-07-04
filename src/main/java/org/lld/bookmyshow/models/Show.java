package org.lld.bookmyshow.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.lld.bookmyshow.models.enums.Feature;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Screen screen;

//    @OneToMany
//    private ShowSeatStatus showSeatStatus;
//
//    @OneToMany
//    private ShowSeatType showSeatType;

    @Enumerated(EnumType.ORDINAL)
    private List<Feature> features;
}
