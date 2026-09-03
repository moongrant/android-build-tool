package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.ULong;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DeviceInfo implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f10904OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f10905OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f10906OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f10907OooOO0O;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f10908OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE)
    public final int f10909OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE)
    public final int f10910OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String f10911OooO0oO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f10912OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f10913OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f10914OooO0OO;

        public OooO00o(int i) {
            this.f10912OooO00o = i;
        }

        public final DeviceInfo OooO00o() {
            o00O000o.OooO00o(this.f10913OooO0O0 <= this.f10914OooO0OO);
            return new DeviceInfo(this);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    static {
        new OooO00o(0).OooO00o();
        f10905OooO0oo = o0O00.Oooo00O(0);
        f10904OooO = o0O00.Oooo00O(1);
        f10906OooOO0 = o0O00.Oooo00O(2);
        f10907OooOO0O = o0O00.Oooo00O(3);
    }

    public DeviceInfo(OooO00o oooO00o) {
        this.f10908OooO0Oo = oooO00o.f10912OooO00o;
        this.f10910OooO0o0 = oooO00o.f10913OooO0O0;
        this.f10909OooO0o = oooO00o.f10914OooO0OO;
        oooO00o.getClass();
        this.f10911OooO0oO = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.f10908OooO0Oo == deviceInfo.f10908OooO0Oo && this.f10910OooO0o0 == deviceInfo.f10910OooO0o0 && this.f10909OooO0o == deviceInfo.f10909OooO0o && o0O00.OooO00o(this.f10911OooO0oO, deviceInfo.f10911OooO0oO);
    }

    public final int hashCode() {
        int i = (((((527 + this.f10908OooO0Oo) * 31) + this.f10910OooO0o0) * 31) + this.f10909OooO0o) * 31;
        String str = this.f10911OooO0oO;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.f10908OooO0Oo;
        if (i != 0) {
            bundle.putInt(f10905OooO0oo, i);
        }
        int i2 = this.f10910OooO0o0;
        if (i2 != 0) {
            bundle.putInt(f10904OooO, i2);
        }
        int i3 = this.f10909OooO0o;
        if (i3 != 0) {
            bundle.putInt(f10906OooOO0, i3);
        }
        String str = this.f10911OooO0oO;
        if (str != null) {
            bundle.putString(f10907OooOO0O, str);
        }
        return bundle;
    }
}
