package com.common.support.apmwrapper.model;

import com.facebook.internal.AnalyticsEvents;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/common/support/apmwrapper/model/ApmLogModel;", "", "()V", "path", "", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "requestId", "getRequestId", "setRequestId", "spendTimeUs", "", "getSpendTimeUs", "()J", "setSpendTimeUs", "(J)V", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "", "getStatus", "()I", "setStatus", "(I)V", "ApmWrapper_release"}, k = 1, mv = {1, 4, 0})
public final class ApmLogModel {

    @SerializedName("SpendTimeUs")
    private long spendTimeUs;

    @SerializedName("Status")
    private int status;

    @SerializedName("RequestId")
    @NotNull
    private String requestId = "";

    @SerializedName("Path")
    @NotNull
    private String path = "";

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    public final long getSpendTimeUs() {
        return this.spendTimeUs;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.path = str;
    }

    public final void setRequestId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requestId = str;
    }

    public final void setSpendTimeUs(long j) {
        this.spendTimeUs = j;
    }

    public final void setStatus(int i) {
        this.status = i;
    }
}
