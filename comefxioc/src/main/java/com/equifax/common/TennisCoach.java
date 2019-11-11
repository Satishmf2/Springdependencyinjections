package com.equifax.common;

import org.springframework.stereotype.Component;

@Component("Thatsillycoach")
public class TennisCoach implements Coach {
    public String getDailyWorkout() {
        return "Practise daily";
    }
}
