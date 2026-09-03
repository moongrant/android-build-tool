package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import java.util.Arrays;
import p203o00o0o0o.o0O000Oo;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00Oo0 extends o0ooOOo {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f12821OooO0oO = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o0O000Oo f12822OooO0oo = new o0O000Oo();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f12823OooO0o;

    public o00Oo0() {
        this.f12823OooO0o = -1.0f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00Oo0) {
            return this.f12823OooO0o == ((o00Oo0) obj).f12823OooO0o;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f12823OooO0o)});
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(o0ooOOo.f12867OooO0Oo, 1);
        bundle.putFloat(f12821OooO0oO, this.f12823OooO0o);
        return bundle;
    }

    public o00Oo0(@FloatRange(from = 0.0d, to = TextSelectionMouseDetectorKt.ClicksSlop) float f) {
        o00O000o.OooO0O0(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f12823OooO0o = f;
    }
}
