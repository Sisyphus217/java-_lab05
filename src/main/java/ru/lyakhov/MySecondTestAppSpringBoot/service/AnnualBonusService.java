package ru.lyakhov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.lyakhov.MySecondTestAppSpringBoot.model.Positions;

@Service
public interface AnnualBonusService {
    double calculate(Positions positions, double salary, double bonus, int workDays);
}
