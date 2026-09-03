package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface OooO0OO {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f7749OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final MediaFormat f7750OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final androidx.media3.common.OooOO0 f7751OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Surface f7752OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final MediaCrypto f7753OooO0o0;

        public OooO00o(OooO0o oooO0o, MediaFormat mediaFormat, androidx.media3.common.OooOO0 oooOO1, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            this.f7749OooO00o = oooO0o;
            this.f7750OooO0O0 = mediaFormat;
            this.f7751OooO0OO = oooOO1;
            this.f7752OooO0Oo = surface;
            this.f7753OooO0o0 = mediaCrypto;
        }
    }

    public interface OooO0O0 {
        OooO0OO OooO00o(OooO00o oooO00o) throws IOException;
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public interface InterfaceC0149OooO0OO {
    }

    void OooO(long j, int i, int i2, int i3);

    @RequiresApi(23)
    void OooO00o(InterfaceC0149OooO0OO interfaceC0149OooO0OO, Handler handler);

    MediaFormat OooO0O0();

    void OooO0OO(int i);

    @Nullable
    ByteBuffer OooO0Oo(int i);

    void OooO0o();

    @RequiresApi(23)
    void OooO0o0(Surface surface);

    void OooO0oO(int i, o000O00.OooO oooO, long j);

    @RequiresApi(19)
    void OooO0oo(Bundle bundle);

    @RequiresApi(21)
    void OooOO0(int i, long j);

    int OooOO0O();

    int OooOO0o(MediaCodec.BufferInfo bufferInfo);

    @Nullable
    ByteBuffer OooOOO(int i);

    void OooOOO0(int i, boolean z);

    void flush();

    void release();
}
