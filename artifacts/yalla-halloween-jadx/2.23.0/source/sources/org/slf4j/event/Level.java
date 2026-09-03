package org.slf4j.event;

import com.google.firebase.perf.FirebasePerformance;

/* JADX INFO: loaded from: classes5.dex */
public enum Level {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, FirebasePerformance.HttpMethod.TRACE);

    private int levelInt;
    private String levelStr;

    Level(int i, String str) {
        this.levelInt = i;
        this.levelStr = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.levelStr;
    }
}
