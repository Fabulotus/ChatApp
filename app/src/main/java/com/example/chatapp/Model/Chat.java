package com.example.chatapp.Model;

import android.text.format.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Chat {

    private String sender;
    private String receiver;
    private String message;
    private Long timestamp;
    private String showDate;

    public Chat(String sender, String receiver, String message, Long timestamp) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.timestamp = timestamp;
        }

    public Chat() {
    }

    public String getShowDate() {
        if (this.timestamp !=null){
            Date msgDate = new Date(this.timestamp);
            if (DateUtils.isToday(this.timestamp)) {
                SimpleDateFormat sfd = new SimpleDateFormat("HH:mm");
                this.showDate = sfd.format(msgDate);
            } else {
                SimpleDateFormat sfd = new SimpleDateFormat("dd--MM HH:mm");
                this.showDate = sfd.format(msgDate);
            }
        }
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
