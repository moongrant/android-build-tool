package o000O00;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33931OooO0Oo;

    public final boolean OooO0o(int i) {
        return (this.f33931OooO0Oo & i) == i;
    }

    public final void OooO0o0(int i) {
        this.f33931OooO0Oo = i | this.f33931OooO0Oo;
    }

    public final boolean OooO0oO() {
        return OooO0o(Integer.MIN_VALUE);
    }
}
