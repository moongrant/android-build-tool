package p303o0O0o00o;

import android.media.MediaCodec;
import p294o0O0Oo0o.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodec f36243OooO00o;

    public o0OoOo0(MediaCodec mediaCodec) {
        this.f36243OooO00o = mediaCodec;
    }

    @Override // p303o0O0o00o.OooOo
    public final void OooO00o(int i, o0OO00O o0oo00o2, long j) {
        this.f36243OooO00o.queueSecureInputBuffer(i, 0, o0oo00o2.f35837OooO, j, 0);
    }

    @Override // p303o0O0o00o.OooOo
    public final void OooO0O0(int i, int i2, long j, int i3) {
        this.f36243OooO00o.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // p303o0O0o00o.OooOo
    public final void flush() {
    }

    @Override // p303o0O0o00o.OooOo
    public final void shutdown() {
    }

    @Override // p303o0O0o00o.OooOo
    public final void start() {
    }
}
