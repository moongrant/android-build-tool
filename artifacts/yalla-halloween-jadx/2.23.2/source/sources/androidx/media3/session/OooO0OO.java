package androidx.media3.session;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f9253OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f9254OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f9255OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f9256OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Bundle f9257OooO0oo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f9247OooO = p080o000OoO.o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f9248OooOO0 = p080o000OoO.o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f9249OooOO0O = p080o000OoO.o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f9250OooOO0o = p080o000OoO.o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f9252OooOOO0 = p080o000OoO.o00.Oooo00o(4);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final androidx.compose.foundation.layout.o00oO0o f9251OooOOO = new androidx.compose.foundation.layout.o00oO0o();

    public OooO0OO(int i, int i2, String str, int i3, Bundle bundle) {
        this.f9253OooO0Oo = i;
        this.f9255OooO0o0 = i2;
        this.f9254OooO0o = str;
        this.f9256OooO0oO = i3;
        this.f9257OooO0oo = bundle;
    }

    @Override // androidx.media3.common.OooO0OO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9247OooO, this.f9253OooO0Oo);
        bundle.putString(f9248OooOO0, this.f9254OooO0o);
        bundle.putInt(f9249OooOO0O, this.f9256OooO0oO);
        bundle.putBundle(f9250OooOO0o, this.f9257OooO0oo);
        bundle.putInt(f9252OooOOO0, this.f9255OooO0o0);
        return bundle;
    }
}
