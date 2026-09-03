package com.google.android.exoplayer2.device;

import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceInfo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f13647OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f13648OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f13649OooO0OO;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    public DeviceInfo(int i, int i2) {
        this.f13648OooO0O0 = i;
        this.f13649OooO0OO = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.f13647OooO00o == deviceInfo.f13647OooO00o && this.f13648OooO0O0 == deviceInfo.f13648OooO0O0 && this.f13649OooO0OO == deviceInfo.f13649OooO0OO;
    }

    public final int hashCode() {
        return ((((527 + this.f13647OooO00o) * 31) + this.f13648OooO0O0) * 31) + this.f13649OooO0OO;
    }
}
