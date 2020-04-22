package pl.todolist.tdapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private boolean isComplete = false;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the Description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param Description the Describtion to set
     */
    public void setDescribtion(String description) {
        this.description = description;
    }

    /**
     * @return boolean return the isComplete
     */
    public boolean isIsComplete() {
        return isComplete;
    }

    /**
     * @param isComplete the isComplete to set
     */
    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

}