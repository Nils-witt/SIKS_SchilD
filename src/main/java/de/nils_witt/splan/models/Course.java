/*
 * Copyright (c) 2021.
 */

package de.nils_witt.splan.models;

public class Course {
    private String grade = "";
    private String subject = "";
    private String group = "";
    private boolean exams = false;

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setExams(boolean exams) {
        this.exams = exams;
    }
}
