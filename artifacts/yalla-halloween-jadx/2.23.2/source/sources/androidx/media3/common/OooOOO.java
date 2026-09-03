package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends OooOo00 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f6472OooO0oO = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.animation.OooOo f6473OooO0oo = new androidx.compose.animation.OooOo();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f6474OooO0o;

    public OooOOO() {
        this.f6474OooO0o = -1.0f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof OooOOO) {
            return this.f6474OooO0o == ((OooOOO) obj).f6474OooO0o;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6474OooO0o)});
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(OooOo00.f6627OooO0Oo, 1);
        bundle.putFloat(f6472OooO0oO, this.f6474OooO0o);
        return bundle;
    }

    public OooOOO(@FloatRange(from = 0.0d, to = TextSelectionMouseDetectorKt.ClicksSlop) float f) {
        p080o000OoO.o00Oo0.OooO0O0(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f6474OooO0o = f;
    }
}
