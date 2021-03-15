package com.company.biulder;

public class Person {
    // variables which we divided
    private String fname;
    private String lname;
    private int age;
    private int height;
    private int weight;

    // class builder that can return variables as much as we need
    public static class Builder {
        private Person newPerson; //new variable

        public Builder() {
            newPerson = new Person(); //now we start create person
        }

        public Builder withfName(String name){ //if we call this method we will fill in the First Name field
            newPerson.fname = name;
            return this;
        }

        public Builder withlName(String surname){ //if we call this method we will fill in the Last Name field
            newPerson.lname = surname;
            return this;
        }

        public Builder withAge(int age){ //if we call this method we will fill in the Age field
            newPerson.age = age;
            return this;
        }

        public Builder withHeight(int height){ //if we call this method we will fill in the Height field
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight){ //if we call this method we will fill in the Weight field
            newPerson.weight = weight;
            return this;
        }

        public Person build(){ //return created person
            return newPerson;
        }

    }
}
