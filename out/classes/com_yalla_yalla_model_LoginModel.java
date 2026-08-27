package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.user.MyUserInfoModel;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/model/LoginModel;", "", "<init>", "()V", "isFirst", "", "()Z", "setFirst", "(Z)V", "token", "Lcom/yalla/yalla/model/LoginToken;", "getToken", "()Lcom/yalla/yalla/model/LoginToken;", "setToken", "(Lcom/yalla/yalla/model/LoginToken;)V", "isBindRemind", "setBindRemind", "isGameFirst", "setGameFirst", "data", "Lcom/yalla/yalla/model/user/MyUserInfoModel;", "getData", "()Lcom/yalla/yalla/model/user/MyUserInfoModel;", "Common_YallaRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginModel {
    public static final int $stable = 8;

    @SerializedName(alternate = {"userInfo"}, value = "data")
    @Nullable
    private final MyUserInfoModel data;
    private boolean isBindRemind;
    private boolean isFirst;
    private boolean isGameFirst;

    @Nullable
    private LoginToken token;

    @Nullable
    public final MyUserInfoModel getData() {
        return this.data;
    }

    @Nullable
    public final LoginToken getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: isBindRemind, reason: from getter */
    public final boolean getIsBindRemind() {
        return this.isBindRemind;
    }

    /* JADX INFO: renamed from: isFirst, reason: from getter */
    public final boolean getIsFirst() {
        return this.isFirst;
    }

    /* JADX INFO: renamed from: isGameFirst, reason: from getter */
    public final boolean getIsGameFirst() {
        return this.isGameFirst;
    }

    public final void setBindRemind(boolean z) {
        this.isBindRemind = z;
    }

    public final void setFirst(boolean z) {
        this.isFirst = z;
    }

    public final void setGameFirst(boolean z) {
        this.isGameFirst = z;
    }

    public final void setToken(@Nullable LoginToken loginToken) {
        this.token = loginToken;
    }
}
