package p319o0O0oOo0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.OooO0OO;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0000oo implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TrackGroup f36764OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f36765OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int[] f36766OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Format[] f36767OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f36768OooO0o0;

    public o0000oo(TrackGroup trackGroup, int... iArr) {
        o00000O0.OooO0Oo(iArr.length > 0);
        Objects.requireNonNull(trackGroup);
        this.f36764OooO00o = trackGroup;
        int length = iArr.length;
        this.f36765OooO0O0 = length;
        this.f36767OooO0Oo = new Format[length];
        for (int i = 0; i < iArr.length; i++) {
            this.f36767OooO0Oo[i] = trackGroup.f14602Oooo0oO[iArr[i]];
        }
        Arrays.sort(this.f36767OooO0Oo, new Comparator() { // from class: o0O0oOo0.o0000O00
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Format) obj2).f13125OoooO - ((Format) obj).f13125OoooO;
            }
        });
        this.f36766OooO0OO = new int[this.f36765OooO0O0];
        int i2 = 0;
        while (true) {
            int i3 = this.f36765OooO0O0;
            if (i2 >= i3) {
                long[] jArr = new long[i3];
                return;
            }
            int[] iArr2 = this.f36766OooO0OO;
            Format format = this.f36767OooO0Oo[i2];
            int i4 = 0;
            while (true) {
                Format[] formatArr = trackGroup.f14602Oooo0oO;
                if (i4 >= formatArr.length) {
                    i4 = -1;
                    break;
                } else if (format == formatArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            iArr2[i2] = i4;
            i2++;
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0OO
    public final /* synthetic */ void OooO() {
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0OO
    public final TrackGroup OooO00o() {
        return this.f36764OooO00o;
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0OO
    public void OooO0OO() {
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0OO
    public final Format OooO0Oo(int i) {
        return this.f36767OooO0Oo[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0OO
    public void OooO0o() {
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0OO
    public void OooO0o0() {
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0OO
    public final int OooO0oO(int i) {
        return this.f36766OooO0OO[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0OO
    public final Format OooO0oo() {
        Format[] formatArr = this.f36767OooO0Oo;
        OooO0O0();
        return formatArr[0];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o0000oo o0000ooVar = (o0000oo) obj;
        return this.f36764OooO00o == o0000ooVar.f36764OooO00o && Arrays.equals(this.f36766OooO0OO, o0000ooVar.f36766OooO0OO);
    }

    public final int hashCode() {
        if (this.f36768OooO0o0 == 0) {
            this.f36768OooO0o0 = Arrays.hashCode(this.f36766OooO0OO) + (System.identityHashCode(this.f36764OooO00o) * 31);
        }
        return this.f36768OooO0o0;
    }

    @Override // com.google.android.exoplayer2.trackselection.OooO0OO
    public final int length() {
        return this.f36766OooO0OO.length;
    }
}
