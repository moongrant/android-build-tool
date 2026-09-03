package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import o000Oo0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p028Oooo0oO.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u0011X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/TrustedDevice;", "Ljava/io/Serializable;", "()V", "appType", "", "getAppType", "()I", "id", "", "getId", "()J", "isCurrent", "", "()Z", "lastLoginTime", "getLastLoginTime", "phoneBrand", "", "getPhoneBrand", "()Ljava/lang/String;", "phoneType", "getPhoneType", "userId", "getUserId", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TrustedDevice implements Serializable {
    public static final int $stable = 0;
    private final long id;
    private final boolean isCurrent;
    private final long lastLoginTime;
    private final long userId;

    @NotNull
    private final String phoneBrand = "";

    @NotNull
    private final String phoneType = "";
    private final int appType = 1;

    public final int getAppType() {
        return this.appType;
    }

    public final long getId() {
        return this.id;
    }

    public final long getLastLoginTime() {
        return this.lastLoginTime;
    }

    @NotNull
    public final String getPhoneBrand() {
        return this.phoneBrand;
    }

    @NotNull
    public final String getPhoneType() {
        return this.phoneType;
    }

    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: isCurrent, reason: from getter */
    public final boolean getIsCurrent() {
        return this.isCurrent;
    }

    @NotNull
    public String toString() {
        long j = this.id;
        long j2 = this.userId;
        String str = this.phoneBrand;
        String str2 = this.phoneType;
        int i = this.appType;
        long j3 = this.lastLoginTime;
        boolean z = this.isCurrent;
        StringBuilder sbOooO00o = o00O0000.OooO00o("id:", j, ",userId:");
        sbOooO00o.append(j2);
        sbOooO00o.append(",phoneBrand:");
        sbOooO00o.append(str);
        sbOooO00o.append(",phoneType:");
        sbOooO00o.append(str2);
        sbOooO00o.append(",appType:");
        sbOooO00o.append(i);
        OooO0O0.OooO00o(sbOooO00o, ",lastLoginTime:", j3, ",isCurrent:");
        sbOooO00o.append(z);
        return sbOooO00o.toString();
    }
}
