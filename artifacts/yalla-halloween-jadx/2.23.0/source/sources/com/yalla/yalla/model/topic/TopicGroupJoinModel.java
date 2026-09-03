package com.yalla.yalla.model.topic;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/topic/TopicGroupJoinModel;", "Ljava/io/Serializable;", "()V", "circleId", "", "getCircleId", "()J", "setCircleId", "(J)V", "credentialCode", "", "getCredentialCode", "()Ljava/lang/String;", "setCredentialCode", "(Ljava/lang/String;)V", "groupOpenId", "getGroupOpenId", "setGroupOpenId", "openId", "getOpenId", "setOpenId", "thirdTag", "getThirdTag", "setThirdTag", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicGroupJoinModel implements Serializable {
    public static final int $stable = 8;
    private long circleId;

    @NotNull
    private String openId = "";

    @NotNull
    private String thirdTag = "";

    @NotNull
    private String groupOpenId = "";

    @SerializedName("credentialcode")
    @NotNull
    private String credentialCode = "";

    public final long getCircleId() {
        return this.circleId;
    }

    @NotNull
    public final String getCredentialCode() {
        return this.credentialCode;
    }

    @NotNull
    public final String getGroupOpenId() {
        return this.groupOpenId;
    }

    @NotNull
    public final String getOpenId() {
        return this.openId;
    }

    @NotNull
    public final String getThirdTag() {
        return this.thirdTag;
    }

    public final void setCircleId(long j) {
        this.circleId = j;
    }

    public final void setCredentialCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.credentialCode = str;
    }

    public final void setGroupOpenId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupOpenId = str;
    }

    public final void setOpenId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.openId = str;
    }

    public final void setThirdTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdTag = str;
    }
}
