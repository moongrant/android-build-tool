package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends OooOo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f6688OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f6689OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f6686OooO0oo = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f6685OooO = o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.ui.graphics.colorspace.OooOo00 f6687OooOO0 = new androidx.compose.ui.graphics.colorspace.OooOo00();

    public Oooo000() {
        this.f6688OooO0o = false;
        this.f6689OooO0oO = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        Oooo000 oooo000 = (Oooo000) obj;
        return this.f6689OooO0oO == oooo000.f6689OooO0oO && this.f6688OooO0o == oooo000.f6688OooO0o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f6688OooO0o), Boolean.valueOf(this.f6689OooO0oO)});
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(OooOo00.f6627OooO0Oo, 3);
        bundle.putBoolean(f6686OooO0oo, this.f6688OooO0o);
        bundle.putBoolean(f6685OooO, this.f6689OooO0oO);
        return bundle;
    }

    public Oooo000(boolean z) {
        this.f6688OooO0o = true;
        this.f6689OooO0oO = z;
    }
}
