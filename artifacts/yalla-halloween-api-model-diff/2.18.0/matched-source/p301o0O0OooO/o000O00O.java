package p301o0O0OooO;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import p319o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f36041OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f36042OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TrackOutput.OooO00o f36043OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f36044OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final byte[] f36045OooO0o0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public o000O00O(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        byte b = 0;
        int i4 = 1;
        o00000O0.OooO00o((i == 0) ^ (bArr2 == null));
        this.f36041OooO00o = z;
        this.f36042OooO0O0 = str;
        this.f36044OooO0Oo = i;
        this.f36045OooO0o0 = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    if (!str.equals("cbcs")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0 || b == 1) {
                i4 = 2;
            } else if (b != 2 && b != 3) {
                StringBuilder sb = new StringBuilder(str.length() + 68);
                sb.append("Unsupported protection scheme type '");
                sb.append(str);
                sb.append("'. Assuming AES-CTR crypto mode.");
                Log.w("TrackEncryptionBox", sb.toString());
            }
        }
        this.f36043OooO0OO = new TrackOutput.OooO00o(i4, bArr, i2, i3);
    }
}
