package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends OooOo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @IntRange(from = 1)
    public final int f6625OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f6626OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f6623OooO0oo = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f6622OooO = o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.animation.core.OooO0OO f6624OooOO0 = new androidx.compose.animation.core.OooO0OO();

    public OooOo(@IntRange(from = 1) int i) {
        p080o000OoO.o00Oo0.OooO0O0(i > 0, "maxStars must be a positive integer");
        this.f6625OooO0o = i;
        this.f6626OooO0oO = -1.0f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return this.f6625OooO0o == oooOo.f6625OooO0o && this.f6626OooO0oO == oooOo.f6626OooO0oO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6625OooO0o), Float.valueOf(this.f6626OooO0oO)});
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(OooOo00.f6627OooO0Oo, 2);
        bundle.putInt(f6623OooO0oo, this.f6625OooO0o);
        bundle.putFloat(f6622OooO, this.f6626OooO0oO);
        return bundle;
    }

    public OooOo(@IntRange(from = 1) int i, @FloatRange(from = 0.0d) float f) {
        p080o000OoO.o00Oo0.OooO0O0(i > 0, "maxStars must be a positive integer");
        p080o000OoO.o00Oo0.OooO0O0(f >= 0.0f && f <= ((float) i), "starRating is out of range [0, maxStars]");
        this.f6625OooO0o = i;
        this.f6626OooO0oO = f;
    }
}
