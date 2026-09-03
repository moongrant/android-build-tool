package androidx.work;

/* JADX INFO: loaded from: classes.dex */
public enum WorkInfo$State {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean OooO00o() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
