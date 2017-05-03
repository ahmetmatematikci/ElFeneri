package com.bebektakvimi.ahmetmatematikci.sharedprenfecesornekleri;

import java.util.Objects;

/**
 * Created by a on 19.04.2017.
 */

public class LoadCommand extends Command {
    public LoadCommand(MenuReceiver mr) {
        super(mr);
    }

    @Override
    public void Run(Objects... args) {
        super.receiver.LoadAction();
    }
}
