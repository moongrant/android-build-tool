package p247o00oo0oO;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooO;
import kotlin.ULong;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0oOOo implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE)
    public final int f40864OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE, to = 359)
    public final int f40865OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE)
    public final int f40866OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @FloatRange(from = 0.0d, fromInclusive = false)
    public final float f40867OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o0oOOo f40860OooO0oo = new o0oOOo(0, 1.0f, 0, 0);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f40859OooO = o0O00.Oooo00O(0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f40861OooOO0 = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f40862OooOO0O = o0O00.Oooo00O(2);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f40863OooOO0o = o0O00.Oooo00O(3);

    public o0oOOo(@IntRange(from = ULong.MIN_VALUE) int i, @FloatRange(from = 0.0d, fromInclusive = false) float f, @IntRange(from = ULong.MIN_VALUE) int i2, @IntRange(from = ULong.MIN_VALUE, to = 359) int i3) {
        this.f40864OooO0Oo = i;
        this.f40866OooO0o0 = i2;
        this.f40865OooO0o = i3;
        this.f40867OooO0oO = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0oOOo)) {
            return false;
        }
        o0oOOo o0oooo = (o0oOOo) obj;
        return this.f40864OooO0Oo == o0oooo.f40864OooO0Oo && this.f40866OooO0o0 == o0oooo.f40866OooO0o0 && this.f40865OooO0o == o0oooo.f40865OooO0o && this.f40867OooO0oO == o0oooo.f40867OooO0oO;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f40867OooO0oO) + ((((((217 + this.f40864OooO0Oo) * 31) + this.f40866OooO0o0) * 31) + this.f40865OooO0o) * 31);
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f40859OooO, this.f40864OooO0Oo);
        bundle.putInt(f40861OooOO0, this.f40866OooO0o0);
        bundle.putInt(f40862OooOO0O, this.f40865OooO0o);
        bundle.putFloat(f40863OooOO0o, this.f40867OooO0oO);
        return bundle;
    }
}
