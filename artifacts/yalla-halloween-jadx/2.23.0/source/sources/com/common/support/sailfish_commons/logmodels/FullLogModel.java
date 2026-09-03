package com.common.support.sailfish_commons.logmodels;

import androidx.annotation.Keep;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020\u000fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006$"}, d2 = {"Lcom/common/support/sailfish_commons/logmodels/FullLogModel;", "Lcom/common/support/sailfish_commons/logmodels/BaseModel;", "()V", "isMainThread", "", "()Z", "setMainThread", "(Z)V", "level", "", "getLevel", "()I", "setLevel", "(I)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "showLevel", "getShowLevel", "setShowLevel", "threadId", "", "getThreadId", "()J", "setThreadId", "(J)V", "threadName", "getThreadName", "setThreadName", "time", "getTime", "setTime", "toString", "sailfish-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FullLogModel extends BaseModel {
    private boolean isMainThread;
    private int level;
    private long threadId;
    private long time;

    @NotNull
    private String showLevel = "";

    @NotNull
    private String threadName = "";

    @NotNull
    private String message = "";

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getShowLevel() {
        return this.showLevel;
    }

    public final long getThreadId() {
        return this.threadId;
    }

    @NotNull
    public final String getThreadName() {
        return this.threadName;
    }

    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: isMainThread, reason: from getter */
    public final boolean getIsMainThread() {
        return this.isMainThread;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setMainThread(boolean z) {
        this.isMainThread = z;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setShowLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.showLevel = str;
    }

    public final void setThreadId(long j) {
        this.threadId = j;
    }

    public final void setThreadName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.threadName = str;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FullLogModel(time=");
        sb.append(this.time);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", showLevel='");
        sb.append(this.showLevel);
        sb.append("', isMainThread=");
        sb.append(this.isMainThread);
        sb.append(", threadName='");
        sb.append(this.threadName);
        sb.append("', threadId=");
        sb.append(this.threadId);
        sb.append(", message='");
        return o0O00o0.OooO0O0(sb, this.message, "')");
    }
}
