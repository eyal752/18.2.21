package com.company;

import lombok.Getter;
import lombok.Setter;

public class Surgeon extends Doctor {

    private @Getter @Setter String m_department ;

    private @Getter @Setter int m_yearsOfExprience;

    public Surgeon (int doctor_id, String doctor_name, String hospital){

        super(doctor_id,doctor_name,hospital);

        this.m_department=m_department;

        this.m_yearsOfExprience= m_yearsOfExprience;




    }




 public void operate(){

     System.out.println("starting to operate");





    }




}
