package com.yalla.yalla.model;

import Oooo000.o00oO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/model/DataMessage;", "", "type", "", "info", "", "(ILjava/lang/String;)V", "getInfo", "()Ljava/lang/String;", "getType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class DataMessage {
    public static final int $stable = 0;

    @NotNull
    private final String info;
    private final int type;

    public DataMessage(int i, @NotNull String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.type = i;
        this.info = info;
    }

    public static /* synthetic */ DataMessage copy$default(DataMessage dataMessage, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dataMessage.type;
        }
        if ((i2 & 2) != 0) {
            str = dataMessage.info;
        }
        return dataMessage.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final DataMessage copy(int type, @NotNull String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return new DataMessage(type, info);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataMessage)) {
            return false;
        }
        DataMessage dataMessage = (DataMessage) other;
        return this.type == dataMessage.type && Intrinsics.areEqual(this.info, dataMessage.info);
    }

    @NotNull
    public final String getInfo() {
        return this.info;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.info.hashCode() + (this.type * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DataMessage(type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append(", info=");
        return o00oO0o.OooO0O0(sbOooO0o0, this.info, ')');
    }
}
