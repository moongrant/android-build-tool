package o000O00;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f33919OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public byte[] f33920OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public byte[] f33921OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f33922OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public int[] f33923OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33924OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public int[] f33925OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f33926OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f33927OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final OooO00o f33928OooOO0;

    @RequiresApi(24)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f33929OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f33930OooO0O0 = OooO0OO.OooO00o();

        public OooO00o(MediaCodec.CryptoInfo cryptoInfo) {
            this.f33929OooO00o = cryptoInfo;
        }
    }

    public OooO() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f33919OooO = cryptoInfo;
        this.f33928OooOO0 = o00.f34910OooO00o >= 24 ? new OooO00o(cryptoInfo) : null;
    }
}
