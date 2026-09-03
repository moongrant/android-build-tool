package p241o00oo0O;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.trackselection.OooO0o;
import java.util.Arrays;
import java.util.List;
import p226o00oOo00.o000O00O;
import p235o00oOooO.o00OO000;
import p235o00oOooO.o00OOO0;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class o0000oo implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O00O f40392OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f40393OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int[] f40394OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo[] f40395OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f40396OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f40397OooO0o0;

    public o0000oo(o000O00O o000o00o2, int[] iArr) {
        OooOo[] oooOoArr;
        o00O000o.OooO0Oo(iArr.length > 0);
        o000o00o2.getClass();
        this.f40392OooO00o = o000o00o2;
        int length = iArr.length;
        this.f40393OooO0O0 = length;
        this.f40395OooO0Oo = new OooOo[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            oooOoArr = o000o00o2.f39876OooO0oO;
            if (i >= length2) {
                break;
            }
            this.f40395OooO0Oo[i] = oooOoArr[iArr[i]];
            i++;
        }
        Arrays.sort(this.f40395OooO0Oo, new o0000O00());
        this.f40394OooO0OO = new int[this.f40393OooO0O0];
        int i2 = 0;
        while (true) {
            int i3 = this.f40393OooO0O0;
            if (i2 >= i3) {
                this.f40397OooO0o0 = new long[i3];
                return;
            }
            int[] iArr2 = this.f40394OooO0OO;
            OooOo oooOo = this.f40395OooO0Oo[i2];
            int i4 = 0;
            while (true) {
                if (i4 >= oooOoArr.length) {
                    i4 = -1;
                    break;
                } else if (oooOo == oooOoArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            iArr2[i2] = i4;
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int OooO(int i) {
        for (int i2 = 0; i2 < this.f40393OooO0O0; i2++) {
            if (this.f40394OooO0OO[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final OooOo OooO0O0(int i) {
        return this.f40395OooO0Oo[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int OooO0OO(int i) {
        return this.f40394OooO0OO[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public final /* synthetic */ boolean OooO0Oo(long j, o00OO000 o00oo001, List list) {
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public void OooO0o() {
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public void OooO0o0(float f) {
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public final /* synthetic */ void OooO0oo() {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final o000O00O OooOO0() {
        return this.f40392OooO00o;
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public final /* synthetic */ void OooOO0O(boolean z) {
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public void OooOO0o() {
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int OooOOO(OooOo oooOo) {
        for (int i = 0; i < this.f40393OooO0O0; i++) {
            if (this.f40395OooO0Oo[i] == oooOo) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public int OooOOO0(long j, List<? extends o00OOO0> list) {
        return list.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public final OooOo OooOOOo() {
        return this.f40395OooO0Oo[OooO00o()];
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0o
    public final /* synthetic */ void OooOOo() {
    }

    public final boolean OooOOoo(int i, long j) {
        return this.f40397OooO0o0[i] > j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o0000oo o0000ooVar = (o0000oo) obj;
        return this.f40392OooO00o == o0000ooVar.f40392OooO00o && Arrays.equals(this.f40394OooO0OO, o0000ooVar.f40394OooO0OO);
    }

    public final int hashCode() {
        if (this.f40396OooO0o == 0) {
            this.f40396OooO0o = Arrays.hashCode(this.f40394OooO0OO) + (System.identityHashCode(this.f40392OooO00o) * 31);
        }
        return this.f40396OooO0o;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.f40394OooO0OO.length;
    }
}
