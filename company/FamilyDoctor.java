package com.company;

import lombok.Getter;
import lombok.Setter;

  public class FamilyDoctor {

    private  @Getter @Setter boolean m_is_occupied;

    private @Getter  String m_string_clinc ;


    public void acceptClient(){

        if (m_is_occupied){

            System.out.println("the doctor is busy");

        }

        else m_is_occupied = true;


    }



    public void finisApointment(){

        m_is_occupied=true;
      }


    }

