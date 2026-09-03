package p072o000O0oO;

import androidx.media3.exoplayer.offline.Download;
import java.util.Comparator;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000000 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long j = ((Download) obj).f7767OooO0OO;
        long j2 = ((Download) obj2).f7767OooO0OO;
        int i = o00.f34910OooO00o;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
