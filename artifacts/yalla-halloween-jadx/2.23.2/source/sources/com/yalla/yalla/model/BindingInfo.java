package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/BindingInfo;", "Ljava/io/Serializable;", "()V", "account", "", "getAccount", "()Ljava/lang/String;", "setAccount", "(Ljava/lang/String;)V", "sources", "", "getSources", "()I", "setSources", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BindingInfo implements Serializable {
    public static final int $stable = 8;

    @SerializedName("account")
    @Nullable
    private String account;

    @SerializedName("sources")
    private int sources;

    @Nullable
    public final String getAccount() {
        return this.account;
    }

    public final int getSources() {
        return this.sources;
    }

    public final void setAccount(@Nullable String str) {
        this.account = str;
    }

    public final void setSources(int i) {
        this.sources = i;
    }
}
