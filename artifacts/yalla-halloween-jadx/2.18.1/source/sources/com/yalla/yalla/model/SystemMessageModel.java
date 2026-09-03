package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/model/SystemMessageModel;", "", "()V", "data", "Lcom/yalla/yalla/model/SystemMessageData;", "getData", "()Lcom/yalla/yalla/model/SystemMessageData;", "setData", "(Lcom/yalla/yalla/model/SystemMessageData;)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "time", "getTime", "setTime", "type", "", "getType", "()I", "setType", "(I)V", "uid", "getUid", "setUid", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SystemMessageModel {
    public static final int $stable = 8;

    @Nullable
    private SystemMessageData data;

    @SerializedName("type_code")
    private int type;

    @SerializedName(alternate = {"Content"}, value = "content")
    @NotNull
    private String message = "";

    @SerializedName("datetime")
    @NotNull
    private String time = "";

    @NotNull
    private String uid = "";

    @Nullable
    public final SystemMessageData getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public final void setData(@Nullable SystemMessageData systemMessageData) {
        this.data = systemMessageData;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.time = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SystemMessageModel(type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append(", message='");
        sbOooO0o0.append(this.message);
        sbOooO0o0.append("', time='");
        sbOooO0o0.append(this.time);
        sbOooO0o0.append("', data=");
        sbOooO0o0.append(this.data);
        sbOooO0o0.append(", uid='");
        return OooO.OooO00o(sbOooO0o0, this.uid, "')");
    }
}
