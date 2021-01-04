package com.sicredi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "session_votin")
public class SessionVoting {

    @Id
    private String _id;

    @DBRef
    private User user;

    @DBRef
    private Session session;

    @Field("vote")
    private boolean vote;

    public SessionVoting ( ){}

    public SessionVoting ( String _id , User user , Session session , boolean vote ) {
        this._id = _id;
        this.user = user;
        this.session = session;
        this.vote = vote;
    }

    public String get_id () {
        return _id;
    }

    public void set_id (String _id) {
        this._id = _id;
    }

    public User getUser () {
        return user;
    }

    public void setUser (User user) {
        this.user = user;
    }

    public Session getSession () {
        return session;
    }

    public void setSession (Session session) {
        this.session = session;
    }

    public boolean isVote () {
        return vote;
    }

    public void setVote (boolean vote) {
        this.vote = vote;
    }
}
