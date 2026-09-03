package com.yalla.yalla.model.topic;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/topic/TopicGroupCreateModel;", "Ljava/io/Serializable;", "()V", "credentialCode", "", "getCredentialCode", "()Ljava/lang/String;", "setCredentialCode", "(Ljava/lang/String;)V", "openId", "getOpenId", "setOpenId", "thirdTag", "getThirdTag", "setThirdTag", "userId", "", "getUserId", "()J", "setUserId", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicGroupCreateModel implements Serializable {
    public static final int $stable = 8;
    private long userId;

    @NotNull
    private String thirdTag = "";

    @NotNull
    private String openId = "";

    @SerializedName("credentialcode")
    @NotNull
    private String credentialCode = "";

    @NotNull
    public final String getCredentialCode() {
        return this.credentialCode;
    }

    @NotNull
    public final String getOpenId() {
        return this.openId;
    }

    @NotNull
    public final String getThirdTag() {
        return this.thirdTag;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setCredentialCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.credentialCode = str;
    }

    public final void setOpenId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.openId = str;
    }

    public final void setThirdTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thirdTag = str;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }
}
