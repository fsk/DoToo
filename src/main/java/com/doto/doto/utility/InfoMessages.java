package com.doto.doto.utility;

public enum InfoMessages {

    EVENT_NOT_FOUND_MESSAGE("Bugün hic eventiniz yok. Guzel bir gun gecirmeniz dilegiyle");
    private final String message;

    InfoMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
