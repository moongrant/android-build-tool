package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends OooOo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f6470OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f6471OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f6468OooO0oo = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f6467OooO = o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.animation.OooO0o f6469OooOO0 = new androidx.compose.animation.OooO0o();

    public OooOO0O() {
        this.f6470OooO0o = false;
        this.f6471OooO0oO = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return this.f6471OooO0oO == oooOO0O.f6471OooO0oO && this.f6470OooO0o == oooOO0O.f6470OooO0o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f6470OooO0o), Boolean.valueOf(this.f6471OooO0oO)});
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(OooOo00.f6627OooO0Oo, 0);
        bundle.putBoolean(f6468OooO0oo, this.f6470OooO0o);
        bundle.putBoolean(f6467OooO, this.f6471OooO0oO);
        return bundle;
    }

    public OooOO0O(boolean z) {
        this.f6470OooO0o = true;
        this.f6471OooO0oO = z;
    }
}
