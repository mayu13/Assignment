
package com.example.myassignment.rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoachingSummary {

    @SerializedName("activeTodo")
    @Expose
    private Boolean activeTodo;
    @SerializedName("activeChat")
    @Expose
    private Boolean activeChat;
    @SerializedName("numberOfTodoItems")
    @Expose
    private Integer numberOfTodoItems;
    @SerializedName("numberOfCompletedTodoItems")
    @Expose
    private Integer numberOfCompletedTodoItems;
    @SerializedName("selected")
    @Expose
    private Boolean selected;

    public Boolean getActiveTodo() {
        return activeTodo;
    }

    public void setActiveTodo(Boolean activeTodo) {
        this.activeTodo = activeTodo;
    }

    public Boolean getActiveChat() {
        return activeChat;
    }

    public void setActiveChat(Boolean activeChat) {
        this.activeChat = activeChat;
    }

    public Integer getNumberOfTodoItems() {
        return numberOfTodoItems;
    }

    public void setNumberOfTodoItems(Integer numberOfTodoItems) {
        this.numberOfTodoItems = numberOfTodoItems;
    }

    public Integer getNumberOfCompletedTodoItems() {
        return numberOfCompletedTodoItems;
    }

    public void setNumberOfCompletedTodoItems(Integer numberOfCompletedTodoItems) {
        this.numberOfCompletedTodoItems = numberOfCompletedTodoItems;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

}
