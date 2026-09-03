package com.yalla.yalla.common.manager.googlepay;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/PayResult;", "T", "", "data", "error", "Lcom/yalla/yalla/common/manager/googlepay/PayError;", "(Ljava/lang/Object;Lcom/yalla/yalla/common/manager/googlepay/PayError;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getError", "()Lcom/yalla/yalla/common/manager/googlepay/PayError;", "setError", "(Lcom/yalla/yalla/common/manager/googlepay/PayError;)V", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PayResult<T> {
    public static final int $stable = 8;

    @Nullable
    private T data;

    @Nullable
    private PayError error;

    public PayResult(@Nullable T t, @Nullable PayError payError) {
        this.data = t;
        this.error = payError;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final PayError getError() {
        return this.error;
    }

    public final void setData(@Nullable T t) {
        this.data = t;
    }

    public final void setError(@Nullable PayError payError) {
        this.error = payError;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("PayResult(data=");
        sbOooO0o0.append(this.data);
        sbOooO0o0.append(", error=");
        sbOooO0o0.append(this.error);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public /* synthetic */ PayResult(Object obj, PayError payError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : payError);
    }
}
