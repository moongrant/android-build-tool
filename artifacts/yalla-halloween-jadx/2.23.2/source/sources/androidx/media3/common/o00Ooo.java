package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import kotlin.ULong;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo implements OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE)
    public final int f6869OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE, to = 359)
    public final int f6870OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE)
    public final int f6871OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @FloatRange(from = 0.0d, fromInclusive = false)
    public final float f6872OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o00Ooo f6864OooO0oo = new o00Ooo(0, 1.0f, 0, 0);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f6863OooO = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f6865OooOO0 = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f6866OooOO0O = o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f6867OooOO0o = o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.foundation.OooO00o f6868OooOOO0 = new androidx.compose.foundation.OooO00o();

    @UnstableApi
    public o00Ooo(@IntRange(from = ULong.MIN_VALUE) int i, @FloatRange(from = 0.0d, fromInclusive = false) float f, @IntRange(from = ULong.MIN_VALUE) int i2, @IntRange(from = ULong.MIN_VALUE, to = 359) int i3) {
        this.f6869OooO0Oo = i;
        this.f6871OooO0o0 = i2;
        this.f6870OooO0o = i3;
        this.f6872OooO0oO = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return this.f6869OooO0Oo == o00ooo2.f6869OooO0Oo && this.f6871OooO0o0 == o00ooo2.f6871OooO0o0 && this.f6870OooO0o == o00ooo2.f6870OooO0o && this.f6872OooO0oO == o00ooo2.f6872OooO0oO;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f6872OooO0oO) + ((((((217 + this.f6869OooO0Oo) * 31) + this.f6871OooO0o0) * 31) + this.f6870OooO0o) * 31);
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f6863OooO, this.f6869OooO0Oo);
        bundle.putInt(f6865OooOO0, this.f6871OooO0o0);
        bundle.putInt(f6866OooOO0O, this.f6870OooO0o);
        bundle.putFloat(f6867OooOO0o, this.f6872OooO0oO);
        return bundle;
    }
}
