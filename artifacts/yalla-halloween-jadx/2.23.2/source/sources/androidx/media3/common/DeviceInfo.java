package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.ULong;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceInfo implements OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f6217OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE)
    public final int f6218OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE)
    public final int f6219OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String f6220OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final DeviceInfo f6212OooO0oo = new OooO00o(0).OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f6211OooO = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f6213OooOO0 = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f6214OooOO0O = o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f6215OooOO0o = o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.animation.OooO00o f6216OooOOO0 = new androidx.compose.animation.OooO00o();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f6221OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f6222OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f6223OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public String f6224OooO0Oo;

        public OooO00o(int i) {
            this.f6221OooO00o = i;
        }

        public final DeviceInfo OooO00o() {
            p080o000OoO.o00Oo0.OooO00o(this.f6222OooO0O0 <= this.f6223OooO0OO);
            return new DeviceInfo(this);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    public DeviceInfo(OooO00o oooO00o) {
        this.f6217OooO0Oo = oooO00o.f6221OooO00o;
        this.f6219OooO0o0 = oooO00o.f6222OooO0O0;
        this.f6218OooO0o = oooO00o.f6223OooO0OO;
        this.f6220OooO0oO = oooO00o.f6224OooO0Oo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.f6217OooO0Oo == deviceInfo.f6217OooO0Oo && this.f6219OooO0o0 == deviceInfo.f6219OooO0o0 && this.f6218OooO0o == deviceInfo.f6218OooO0o && o00.OooO00o(this.f6220OooO0oO, deviceInfo.f6220OooO0oO);
    }

    public final int hashCode() {
        int i = (((((527 + this.f6217OooO0Oo) * 31) + this.f6219OooO0o0) * 31) + this.f6218OooO0o) * 31;
        String str = this.f6220OooO0oO;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.f6217OooO0Oo;
        if (i != 0) {
            bundle.putInt(f6211OooO, i);
        }
        int i2 = this.f6219OooO0o0;
        if (i2 != 0) {
            bundle.putInt(f6213OooOO0, i2);
        }
        int i3 = this.f6218OooO0o;
        if (i3 != 0) {
            bundle.putInt(f6214OooOO0O, i3);
        }
        String str = this.f6220OooO0oO;
        if (str != null) {
            bundle.putString(f6215OooOO0o, str);
        }
        return bundle;
    }
}
