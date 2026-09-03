package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/AccountBindResult;", "Ljava/io/Serializable;", "()V", "openId", "", "getOpenId", "()Ljava/lang/String;", "setOpenId", "(Ljava/lang/String;)V", "unionId", "getUnionId", "setUnionId", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AccountBindResult implements Serializable {
    public static final int $stable = 8;

    @SerializedName("unionId")
    @Nullable
    private String unionId = "";

    @SerializedName("openId")
    @Nullable
    private String openId = "";

    @Nullable
    public final String getOpenId() {
        return this.openId;
    }

    @Nullable
    public final String getUnionId() {
        return this.unionId;
    }

    public final void setOpenId(@Nullable String str) {
        this.openId = str;
    }

    public final void setUnionId(@Nullable String str) {
        this.unionId = str;
    }
}
