package p425o0OoO0o;

import androidx.annotation.Nullable;
import androidx.media3.common.OooOO0;
import androidx.media3.common.o000oOoO;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.trackselection.OooO0o;
import java.util.Arrays;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class OooOo implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000oOoO f46744OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f46745OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int[] f46746OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0[] f46747OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f46748OooO0o0;

    public OooOo(o000oOoO o000oooo2, int[] iArr) {
        OooOO0[] oooOO0Arr;
        o00Oo0.OooO0Oo(iArr.length > 0);
        o000oooo2.getClass();
        this.f46744OooO00o = o000oooo2;
        int length = iArr.length;
        this.f46745OooO0O0 = length;
        this.f46747OooO0Oo = new OooOO0[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            oooOO0Arr = o000oooo2.f6768OooO0oO;
            if (i >= length2) {
                break;
            }
            this.f46747OooO0Oo[i] = oooOO0Arr[iArr[i]];
            i++;
        }
        Arrays.sort(this.f46747OooO0Oo, new OooOo00());
        this.f46746OooO0OO = new int[this.f46745OooO0O0];
        int i2 = 0;
        while (true) {
            int i3 = this.f46745OooO0O0;
            if (i2 >= i3) {
                long[] jArr = new long[i3];
                return;
            }
            int[] iArr2 = this.f46746OooO0OO;
            OooOO0 oooOO1 = this.f46747OooO0Oo[i2];
            int i4 = 0;
            while (true) {
                if (i4 >= oooOO0Arr.length) {
                    i4 = -1;
                    break;
                } else if (oooOO1 == oooOO0Arr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            iArr2[i2] = i4;
            i2++;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.OooO0o
    public final /* synthetic */ void OooO(boolean z) {
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final OooOO0 OooO0O0(int i) {
        return this.f46747OooO0Oo[i];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int OooO0OO(int i) {
        return this.f46746OooO0OO[i];
    }

    @Override // androidx.media3.exoplayer.trackselection.OooO0o
    public void OooO0Oo(float f) {
    }

    @Override // androidx.media3.exoplayer.trackselection.OooO0o
    public void OooO0o() {
    }

    @Override // androidx.media3.exoplayer.trackselection.OooO0o
    public final /* synthetic */ void OooO0o0() {
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int OooO0oO(int i) {
        for (int i2 = 0; i2 < this.f46745OooO0O0; i2++) {
            if (this.f46746OooO0OO[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final o000oOoO OooO0oo() {
        return this.f46744OooO00o;
    }

    @Override // androidx.media3.exoplayer.trackselection.OooO0o
    public void OooOO0() {
    }

    @Override // androidx.media3.exoplayer.trackselection.OooO0o
    public final OooOO0 OooOO0O() {
        OooO00o();
        return this.f46747OooO0Oo[0];
    }

    @Override // androidx.media3.exoplayer.trackselection.OooO0o
    public final /* synthetic */ void OooOO0o() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return this.f46744OooO00o == oooOo.f46744OooO00o && Arrays.equals(this.f46746OooO0OO, oooOo.f46746OooO0OO);
    }

    public final int hashCode() {
        if (this.f46748OooO0o0 == 0) {
            this.f46748OooO0o0 = Arrays.hashCode(this.f46746OooO0OO) + (System.identityHashCode(this.f46744OooO00o) * 31);
        }
        return this.f46748OooO0o0;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.f46746OooO0OO.length;
    }
}
