package com.example.datafull;


    public class Student {
        private int studentID;
        private String studenteName;

        public Student() {
        }

        public Student(int id, String studentname) {
            this.studentID = id;
            this.studenteName = studentname;
        }

        public void setID(int id) {
            this.studentID = id;
        }

        public int getID() {
            return this.studentID;
        }

        public void setStudenteName(String studentname) {
            this.studenteName = studentname;
        }

        public String getStudenteName() {
            return this.studenteName;
        }
    }

