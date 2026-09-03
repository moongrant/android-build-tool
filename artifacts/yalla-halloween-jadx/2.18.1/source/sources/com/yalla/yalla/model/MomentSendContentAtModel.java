package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p058o0000OoO.OooO;
import p516o0o0O000.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u0003J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/model/MomentSendContentAtModel;", "Ljava/io/Serializable;", "idStr", "", "nameStr", "(Ljava/lang/String;Ljava/lang/String;)V", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "uid", "getUid", "setUid", "toJSONString", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MomentSendContentAtModel implements Serializable {
    public static final int $stable = 8;

    @NotNull
    private String name;

    @NotNull
    private String uid;

    public MomentSendContentAtModel(@NotNull String idStr, @NotNull String nameStr) {
        Intrinsics.checkNotNullParameter(idStr, "idStr");
        Intrinsics.checkNotNullParameter(nameStr, "nameStr");
        this.uid = idStr;
        this.name = nameStr;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setUid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    @NotNull
    public final String toJSONString() {
        return o0Oo0oo.OooO0O0(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MomentSendContentAtModel(uid='");
        sbOooO0o0.append(this.uid);
        sbOooO0o0.append("', name='");
        return OooO.OooO00o(sbOooO0o0, this.name, "')");
    }
}
