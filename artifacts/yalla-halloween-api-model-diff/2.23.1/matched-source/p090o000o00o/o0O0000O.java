package p090o000o00o;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;
import p080o000OoO.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0O0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f35070OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f35071OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TrackOutput.OooO00o f35072OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f35073OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final byte[] f35074OooO0o0;

    public o0O0000O(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        byte b = 0;
        int i4 = 1;
        o00O0O.OooO00o((i == 0) ^ (bArr2 == null));
        this.f35070OooO00o = z;
        this.f35071OooO0O0 = str;
        this.f35073OooO0Oo = i;
        this.f35074OooO0o0 = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b = -1;
                    }
                    break;
                case 3046671:
                    b = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    Log.OooO0o("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f35072OooO0OO = new TrackOutput.OooO00o(i4, bArr, i2, i3);
    }
}
