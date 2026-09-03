package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.OooOo;
import java.io.IOException;
import java.nio.ByteBuffer;
import p206o00o0oOO.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface OooO0OO {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f12514OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final MediaFormat f12515OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooOo f12516OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Surface f12517OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final MediaCrypto f12518OooO0o0;

        public OooO00o(OooO0o oooO0o, MediaFormat mediaFormat, OooOo oooOo, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            this.f12514OooO00o = oooO0o;
            this.f12515OooO0O0 = mediaFormat;
            this.f12516OooO0OO = oooOo;
            this.f12517OooO0Oo = surface;
            this.f12518OooO0o0 = mediaCrypto;
        }
    }

    public interface OooO0O0 {
        OooO0OO OooO00o(OooO00o oooO00o) throws IOException;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public interface InterfaceC0207OooO0OO {
    }

    @RequiresApi(21)
    void OooO(int i, long j);

    MediaFormat OooO00o();

    @RequiresApi(23)
    void OooO0O0(InterfaceC0207OooO0OO interfaceC0207OooO0OO, Handler handler);

    void OooO0OO(int i);

    @Nullable
    ByteBuffer OooO0Oo(int i);

    void OooO0o();

    @RequiresApi(23)
    void OooO0o0(Surface surface);

    @RequiresApi(19)
    void OooO0oO(Bundle bundle);

    void OooO0oo(long j, int i, int i2, int i3);

    int OooOO0();

    int OooOO0O(MediaCodec.BufferInfo bufferInfo);

    void OooOO0o(int i, o0oOOo o0oooo, long j);

    @Nullable
    ByteBuffer OooOOO(int i);

    void OooOOO0(int i, boolean z);

    void flush();

    void release();
}
