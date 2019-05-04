package com.example.p03_classjournal;

import java.io.Serializable;

public class Module implements Serializable{

        private String code;
        private String grade;
        private int week;

        public String getCode(){
            return code;
        }

        public String getGrade(){
            return grade;

        }

        public int getWeek(){
            return week;
        }

        public Module (String code, String grade, int Week){
            this.code=code;
            this.grade=grade;
            this.week=week;
        }
    }


