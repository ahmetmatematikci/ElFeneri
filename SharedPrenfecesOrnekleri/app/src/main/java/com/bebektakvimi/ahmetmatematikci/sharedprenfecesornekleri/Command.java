package com.bebektakvimi.ahmetmatematikci.sharedprenfecesornekleri;

import java.util.Objects;

/**
 * Created by a on 19.04.2017.
 */

public abstract class Command {
    protected MenuReceiver receiver;

    public Command(MenuReceiver receiver) {
        this.receiver = receiver;
    }

    public abstract void Run(Objects...args);
}
