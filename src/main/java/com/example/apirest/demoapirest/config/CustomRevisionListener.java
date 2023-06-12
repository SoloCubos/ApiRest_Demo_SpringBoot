package com.example.apirest.demoapirest.config;

import org.hibernate.envers.RevisionListener;

import com.example.apirest.demoapirest.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener{

    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity; 
    }
    
}
