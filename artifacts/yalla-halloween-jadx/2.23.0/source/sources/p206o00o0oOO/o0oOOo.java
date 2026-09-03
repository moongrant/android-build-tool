package p206o00o0oOO;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0oOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f39425OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public byte[] f39426OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public byte[] f39427OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f39428OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public int[] f39429OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f39430OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public int[] f39431OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f39432OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f39433OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final OooO00o f39434OooOO0;

    @RequiresApi(24)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f39435OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f39436OooO0O0 = o0oOO.OooO00o();

        public OooO00o(MediaCodec.CryptoInfo cryptoInfo) {
            this.f39435OooO00o = cryptoInfo;
        }
    }

    public o0oOOo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f39425OooO = cryptoInfo;
        this.f39434OooOO0 = o0O00.f40595OooO00o >= 24 ? new OooO00o(cryptoInfo) : null;
    }
}
