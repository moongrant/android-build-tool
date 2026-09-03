package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00Ooo implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f12827OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f12828OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f12829OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o00Ooo f12825OooO0oO = new o00Ooo(1.0f, 1.0f);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f12826OooO0oo = o0O00.Oooo00O(0);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f12824OooO = o0O00.Oooo00O(1);

    public o00Ooo(@FloatRange(from = 0.0d, fromInclusive = false) float f, @FloatRange(from = 0.0d, fromInclusive = false) float f2) {
        o00O000o.OooO00o(f > 0.0f);
        o00O000o.OooO00o(f2 > 0.0f);
        this.f12827OooO0Oo = f;
        this.f12829OooO0o0 = f2;
        this.f12828OooO0o = Math.round(f * 1000.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00Ooo.class != obj.getClass()) {
            return false;
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        return this.f12827OooO0Oo == o00ooo2.f12827OooO0Oo && this.f12829OooO0o0 == o00ooo2.f12829OooO0o0;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f12829OooO0o0) + ((Float.floatToRawIntBits(this.f12827OooO0Oo) + 527) * 31);
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f12826OooO0oo, this.f12827OooO0Oo);
        bundle.putFloat(f12824OooO, this.f12829OooO0o0);
        return bundle;
    }

    public final String toString() {
        return o0O00.OooOO0o("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f12827OooO0Oo), Float.valueOf(this.f12829OooO0o0));
    }
}
