package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0.0D;
        int number = 0;
        for (Pupil pupil : pupils) {
            sum += sumByPupil(pupil);
            number += pupil.subjects().size();
        }
        return sum / number;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            rsl.add(new Label(pupil.name(), averageScore(List.of(pupil))));
        }
        return rsl;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        Map<String, Integer> sum = sumBySubjects(pupils);
        for (String key : sum.keySet()) {
            rsl.add(new Label(key, (double) sum.get(key) / pupils.size()));
        }
        return rsl;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        for (Pupil pupil : pupils) {
            rsl.add(new Label(pupil.name(), sumByPupil(pupil)));
        }
        rsl.sort(Comparator.naturalOrder());
        return rsl.get(rsl.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        Map<String, Integer> sum = sumBySubjects(pupils);
        for (String key : sum.keySet()) {
            rsl.add(new Label(key, (double) sum.get(key)));
        }
        rsl.sort(Comparator.naturalOrder());
        return rsl.get(rsl.size() - 1);
    }

    private static Double sumByPupil(Pupil pupil) {
        double rsl = 0.0;
        for (Subject subject : pupil.subjects()) {
            rsl += subject.score();
        }
        return rsl;
    }

    private static Map<String, Integer> sumBySubjects(List<Pupil> pupils) {
        Map<String, Integer> rsl = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                rsl.merge(subject.name(), subject.score(), (prev, now) -> prev + now);
            }
        }
        return rsl;
    }
}
