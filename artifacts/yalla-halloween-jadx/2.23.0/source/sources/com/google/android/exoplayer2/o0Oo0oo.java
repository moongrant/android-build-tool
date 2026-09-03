package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p203o00o0o0o.o0O00OOO;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0Oo0oo extends o0ooOOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @IntRange(from = 1)
    public final int f12852OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f12853OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f12850OooO0oo = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f12849OooO = o0O00.Oooo00O(2);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o0O00OOO f12851OooOO0 = new o0O00OOO();

    public o0Oo0oo(@IntRange(from = 1) int i) {
        o00O000o.OooO0O0(i > 0, "maxStars must be a positive integer");
        this.f12852OooO0o = i;
        this.f12853OooO0oO = -1.0f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o0Oo0oo)) {
            return false;
        }
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
        return this.f12852OooO0o == o0oo0oo2.f12852OooO0o && this.f12853OooO0oO == o0oo0oo2.f12853OooO0oO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12852OooO0o), Float.valueOf(this.f12853OooO0oO)});
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(o0ooOOo.f12867OooO0Oo, 2);
        bundle.putInt(f12850OooO0oo, this.f12852OooO0o);
        bundle.putFloat(f12849OooO, this.f12853OooO0oO);
        return bundle;
    }

    public o0Oo0oo(@IntRange(from = 1) int i, @FloatRange(from = 0.0d) float f) {
        o00O000o.OooO0O0(i > 0, "maxStars must be a positive integer");
        o00O000o.OooO0O0(f >= 0.0f && f <= ((float) i), "starRating is out of range [0, maxStars]");
        this.f12852OooO0o = i;
        this.f12853OooO0oO = f;
    }
}
