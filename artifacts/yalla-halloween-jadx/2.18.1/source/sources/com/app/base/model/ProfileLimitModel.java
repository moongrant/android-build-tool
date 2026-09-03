package com.app.base.model;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/app/base/model/ProfileLimitModel;", "Ljava/io/Serializable;", "()V", "blockReason", "", "getBlockReason", "()Ljava/lang/String;", "setBlockReason", "(Ljava/lang/String;)V", "expireTime", "", "getExpireTime", "()J", "setExpireTime", "(J)V", "operationType", "", "getOperationType", "()I", "setOperationType", "(I)V", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ProfileLimitModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private String blockReason;
    private long expireTime;
    private int operationType;

    @Nullable
    public final String getBlockReason() {
        return this.blockReason;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final int getOperationType() {
        return this.operationType;
    }

    public final void setBlockReason(@Nullable String str) {
        this.blockReason = str;
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setOperationType(int i) {
        this.operationType = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ProfileLimitModel(operationType=");
        sbOooO0o0.append(this.operationType);
        sbOooO0o0.append(", expireTime=");
        sbOooO0o0.append(this.expireTime);
        sbOooO0o0.append(", blockReason=");
        return o00oO0o.OooO0O0(sbOooO0o0, this.blockReason, ')');
    }
}
