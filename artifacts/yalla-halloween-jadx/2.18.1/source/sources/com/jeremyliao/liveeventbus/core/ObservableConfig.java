package com.jeremyliao.liveeventbus.core;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableConfig {
    public Boolean lifecycleObserverAlwaysActive = null;
    public Boolean autoClear = null;

    public ObservableConfig autoClear(boolean z) {
        this.autoClear = Boolean.valueOf(z);
        return this;
    }

    public ObservableConfig lifecycleObserverAlwaysActive(boolean z) {
        this.lifecycleObserverAlwaysActive = Boolean.valueOf(z);
        return this;
    }
}
