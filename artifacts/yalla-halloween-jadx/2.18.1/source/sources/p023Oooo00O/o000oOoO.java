package p023Oooo00O;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import kotlin.jvm.internal.FloatCompanionObject;
import p466o0OooO0.o0000O0O;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements SampleStream {
    public static Oooo0 OooO0o0(float f) {
        return new Oooo0(Float.valueOf(f), oo0O.OooO0O0(FloatCompanionObject.INSTANCE), Float.valueOf(0.01f));
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public void OooO00o() {
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int OooO0OO(long j) {
        return 0;
    }

    @Override // com.google.android.exoplayer2.source.SampleStream
    public int OooO0Oo(o0000O0O o0000o0o2, DecoderInputBuffer decoderInputBuffer, boolean z) {
        decoderInputBuffer.setFlags(4);
        return -4;
    }
}
