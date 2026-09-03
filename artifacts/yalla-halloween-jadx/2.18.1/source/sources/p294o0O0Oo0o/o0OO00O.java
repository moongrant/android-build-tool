package p294o0O0Oo0o;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f35837OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public byte[] f35838OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public byte[] f35839OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f35840OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public int[] f35841OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f35842OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public int[] f35843OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f35844OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f35845OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final OooO00o f35846OooOO0;

    @RequiresApi(24)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f35847OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f35848OooO0O0 = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public OooO00o(MediaCodec.CryptoInfo cryptoInfo) {
            this.f35847OooO00o = cryptoInfo;
        }

        public static void OooO00o(OooO00o oooO00o, int i, int i2) {
            oooO00o.f35848OooO0O0.set(i, i2);
            oooO00o.f35847OooO00o.setPattern(oooO00o.f35848OooO0O0);
        }
    }

    public o0OO00O() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f35837OooO = cryptoInfo;
        this.f35846OooOO0 = o000OOo0.f36740OooO00o >= 24 ? new OooO00o(cryptoInfo) : null;
    }
}
