package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes.dex */
public abstract class cj extends Observable {
    public final Runnable AFInAppEventType;
    private long valueOf;
    public final String values;
    public final Map<String, Object> AFInAppEventParameterName = new HashMap();
    public e AFKeystoreWrapper = e.NOT_STARTED;

    public enum e {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public cj(String str, Runnable runnable) {
        this.AFInAppEventType = runnable;
        this.values = str;
    }

    public abstract void AFInAppEventType(Context context);

    public final void AFKeystoreWrapper() {
        this.AFInAppEventParameterName.put("source", this.values);
        this.AFInAppEventParameterName.putAll(new ci());
        this.AFInAppEventParameterName.put(com.umeng.analytics.pro.ak.aS, Long.valueOf(System.currentTimeMillis() - this.valueOf));
        this.AFKeystoreWrapper = e.FINISHED;
        setChanged();
        notifyObservers();
    }

    public final void valueOf() {
        this.valueOf = System.currentTimeMillis();
        this.AFKeystoreWrapper = e.STARTED;
        addObserver(new Observer() { // from class: com.appsflyer.internal.cj.2
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                cj.this.AFInAppEventType.run();
            }
        });
    }
}
