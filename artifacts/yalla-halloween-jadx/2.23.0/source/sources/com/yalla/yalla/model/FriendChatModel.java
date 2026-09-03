package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/yalla/yalla/model/FriendChatModel;", "Ljava/io/Serializable;", "()V", "credentialCode", "", "getCredentialCode", "()Ljava/lang/String;", "setCredentialCode", "(Ljava/lang/String;)V", "friendOpenId", "getFriendOpenId", "setFriendOpenId", "localAuthCode", "getLocalAuthCode", "setLocalAuthCode", "localBindChatFriendChatType", "", "getLocalBindChatFriendChatType", "()I", "setLocalBindChatFriendChatType", "(I)V", "localUserId", "", "getLocalUserId", "()J", "setLocalUserId", "(J)V", "localUserName", "getLocalUserName", "setLocalUserName", "openId", "getOpenId", "setOpenId", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FriendChatModel implements Serializable {
    public static final int $stable = 8;
    private int localBindChatFriendChatType;
    private long localUserId;

    @NotNull
    private String openId = "";

    @NotNull
    private String friendOpenId = "";

    @SerializedName("credentialcode")
    @NotNull
    private String credentialCode = "";

    @NotNull
    private String localUserName = "";

    @NotNull
    private String localAuthCode = "";

    @NotNull
    public final String getCredentialCode() {
        return this.credentialCode;
    }

    @NotNull
    public final String getFriendOpenId() {
        return this.friendOpenId;
    }

    @NotNull
    public final String getLocalAuthCode() {
        return this.localAuthCode;
    }

    public final int getLocalBindChatFriendChatType() {
        return this.localBindChatFriendChatType;
    }

    public final long getLocalUserId() {
        return this.localUserId;
    }

    @NotNull
    public final String getLocalUserName() {
        return this.localUserName;
    }

    @NotNull
    public final String getOpenId() {
        return this.openId;
    }

    public final void setCredentialCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.credentialCode = str;
    }

    public final void setFriendOpenId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.friendOpenId = str;
    }

    public final void setLocalAuthCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localAuthCode = str;
    }

    public final void setLocalBindChatFriendChatType(int i) {
        this.localBindChatFriendChatType = i;
    }

    public final void setLocalUserId(long j) {
        this.localUserId = j;
    }

    public final void setLocalUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localUserName = str;
    }

    public final void setOpenId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.openId = str;
    }
}
