package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f6619OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f6620OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f6621OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooOOOO f6616OooO0oO = new OooOOOO(1.0f);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f6617OooO0oo = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f6615OooO = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.animation.Oooo0 f6618OooOO0 = new androidx.compose.animation.Oooo0();

    public OooOOOO(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this(f, 1.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooOOOO.class != obj.getClass()) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        return this.f6619OooO0Oo == oooOOOO.f6619OooO0Oo && this.f6621OooO0o0 == oooOOOO.f6621OooO0o0;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f6621OooO0o0) + ((Float.floatToRawIntBits(this.f6619OooO0Oo) + 527) * 31);
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f6617OooO0oo, this.f6619OooO0Oo);
        bundle.putFloat(f6615OooO, this.f6621OooO0o0);
        return bundle;
    }

    public final String toString() {
        return o00.OooOOO("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f6619OooO0Oo), Float.valueOf(this.f6621OooO0o0));
    }

    public OooOOOO(@FloatRange(from = 0.0d, fromInclusive = false) float f, @FloatRange(from = 0.0d, fromInclusive = false) float f2) {
        p080o000OoO.o00Oo0.OooO00o(f > 0.0f);
        p080o000OoO.o00Oo0.OooO00o(f2 > 0.0f);
        this.f6619OooO0Oo = f;
        this.f6621OooO0o0 = f2;
        this.f6620OooO0o = Math.round(f * 1000.0f);
    }
}
