package o0000O0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Comparator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34053OooO0Oo;

    public /* synthetic */ OooO0o(int i) {
        this.f34053OooO0Oo = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f34053OooO0Oo) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            default:
                return com.google.android.exoplayer2.trackselection.OooO0O0.OooOOO0.OooO0OO((com.google.android.exoplayer2.trackselection.OooO0O0.OooOOO0) obj, (com.google.android.exoplayer2.trackselection.OooO0O0.OooOOO0) obj2);
        }
    }
}
