package p303o0O0o00o;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import p318o0O0oOo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class OooOo00 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O00 f36233OooO00o = new o0000O00();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O00 f36234OooO0O0 = new o0000O00();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayDeque<MediaCodec.BufferInfo> f36235OooO0OO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f36236OooO0Oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public MediaFormat f36237OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public MediaFormat f36238OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public IllegalStateException f36239OooO0oO;

    public final int OooO00o(MediaCodec.BufferInfo bufferInfo) {
        o0000O00 o0000o00 = this.f36234OooO0O0;
        if (o0000o00.f36697OooO0OO == 0) {
            return -1;
        }
        int iOooO0O0 = o0000o00.OooO0O0();
        if (iOooO0O0 >= 0) {
            MediaCodec.BufferInfo bufferInfoRemove = this.f36235OooO0OO.remove();
            bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
        } else if (iOooO0O0 == -2) {
            this.f36238OooO0o0 = this.f36236OooO0Oo.remove();
        }
        return iOooO0O0;
    }

    public final void OooO0O0() {
        this.f36237OooO0o = this.f36236OooO0Oo.isEmpty() ? null : this.f36236OooO0Oo.getLast();
        o0000O00 o0000o00 = this.f36233OooO00o;
        o0000o00.f36695OooO00o = 0;
        o0000o00.f36696OooO0O0 = -1;
        o0000o00.f36697OooO0OO = 0;
        o0000O00 o0000o01 = this.f36234OooO0O0;
        o0000o01.f36695OooO00o = 0;
        o0000o01.f36696OooO0O0 = -1;
        o0000o01.f36697OooO0OO = 0;
        this.f36235OooO0OO.clear();
        this.f36236OooO0Oo.clear();
        this.f36239OooO0oO = null;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.f36239OooO0oO = codecException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.f36233OooO00o.OooO00o(i);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        MediaFormat mediaFormat = this.f36237OooO0o;
        if (mediaFormat != null) {
            this.f36234OooO0O0.OooO00o(-2);
            this.f36236OooO0Oo.add(mediaFormat);
            this.f36237OooO0o = null;
        }
        this.f36234OooO0O0.OooO00o(i);
        this.f36235OooO0OO.add(bufferInfo);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f36234OooO0O0.OooO00o(-2);
        this.f36236OooO0Oo.add(mediaFormat);
        this.f36237OooO0o = null;
    }
}
