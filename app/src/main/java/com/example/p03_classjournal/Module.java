package com.example.p03_classjournal;

import java.io.Serializable;

public class Module implements Serializable{

        private String code;


        public String getCode(){
            return code;
        }



        public Module (String code){
            this.code=code;

        }
    }


