package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo000 extends o0ooOOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f11331OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f11332OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f11329OooO0oo = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f11328OooO = o0O00.Oooo00O(2);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final androidx.compose.animation.o000oOoO f11330OooOO0 = new androidx.compose.animation.o000oOoO();

    public Oooo000() {
        this.f11331OooO0o = false;
        this.f11332OooO0oO = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        Oooo000 oooo000 = (Oooo000) obj;
        return this.f11332OooO0oO == oooo000.f11332OooO0oO && this.f11331OooO0o == oooo000.f11331OooO0o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11331OooO0o), Boolean.valueOf(this.f11332OooO0oO)});
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(o0ooOOo.f12867OooO0Oo, 0);
        bundle.putBoolean(f11329OooO0oo, this.f11331OooO0o);
        bundle.putBoolean(f11328OooO, this.f11332OooO0oO);
        return bundle;
    }

    public Oooo000(boolean z) {
        this.f11331OooO0o = true;
        this.f11332OooO0oO = z;
    }
}
