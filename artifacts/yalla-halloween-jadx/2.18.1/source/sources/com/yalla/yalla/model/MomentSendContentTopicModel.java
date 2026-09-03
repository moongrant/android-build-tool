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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\u0003J\b\u0010\n\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/model/MomentSendContentTopicModel;", "Ljava/io/Serializable;", "txStr", "", "(Ljava/lang/String;)V", "tx", "getTx", "()Ljava/lang/String;", "setTx", "toJSONString", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MomentSendContentTopicModel implements Serializable {
    public static final int $stable = 8;

    @NotNull
    private String tx;

    public MomentSendContentTopicModel(@NotNull String txStr) {
        Intrinsics.checkNotNullParameter(txStr, "txStr");
        this.tx = txStr;
    }

    @NotNull
    public final String getTx() {
        return this.tx;
    }

    public final void setTx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tx = str;
    }

    @NotNull
    public final String toJSONString() {
        return o0Oo0oo.OooO0O0(this);
    }

    @NotNull
    public String toString() {
        return OooO.OooO00o(OooO00o.OooO00o.OooO0o0("MomentSendContentTopicModel(tx='"), this.tx, "')");
    }
}
