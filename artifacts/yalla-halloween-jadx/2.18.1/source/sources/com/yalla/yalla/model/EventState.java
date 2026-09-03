package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/EventState;", "", "()V", "Deleted", "", "getDeleted", "()I", "setDeleted", "(I)V", "Ended", "getEnded", "setEnded", "InProgress", "getInProgress", "setInProgress", "NotStarted", "getNotStarted", "setNotStarted", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class EventState {
    private static int NotStarted;

    @NotNull
    public static final EventState INSTANCE = new EventState();
    private static int InProgress = 1;
    private static int Ended = 2;
    private static int Deleted = 3;
    public static final int $stable = 8;

    private EventState() {
    }

    public final int getDeleted() {
        return Deleted;
    }

    public final int getEnded() {
        return Ended;
    }

    public final int getInProgress() {
        return InProgress;
    }

    public final int getNotStarted() {
        return NotStarted;
    }

    public final void setDeleted(int i) {
        Deleted = i;
    }

    public final void setEnded(int i) {
        Ended = i;
    }

    public final void setInProgress(int i) {
        InProgress = i;
    }

    public final void setNotStarted(int i) {
        NotStarted = i;
    }
}
