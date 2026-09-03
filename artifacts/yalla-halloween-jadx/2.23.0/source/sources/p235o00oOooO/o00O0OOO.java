package p235o00oOooO;

import com.google.android.exoplayer2.extractor.OooO0O0;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.o00O0O;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O0OOO implements o00OO00O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f40244OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00O0O[] f40245OooO0O0;

    public o00O0OOO(int[] iArr, o00O0O[] o00o0oArr) {
        this.f40244OooO00o = iArr;
        this.f40245OooO0O0 = o00o0oArr;
    }

    public final TrackOutput OooO00o(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f40244OooO00o;
            if (i2 >= iArr.length) {
                Log.OooO0OO("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new OooO0O0();
            }
            if (i == iArr[i2]) {
                return this.f40245OooO0O0[i2];
            }
            i2++;
        }
    }
}
