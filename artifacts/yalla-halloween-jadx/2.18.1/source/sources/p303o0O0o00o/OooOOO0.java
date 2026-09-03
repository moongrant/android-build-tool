package p303o0O0o00o;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends DecoderInputBuffer {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final DecoderInputBuffer f36228OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f36229OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f36230OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f36231OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public long f36232o000oOoO;

    public OooOOO0() {
        super(2);
        this.f36228OoooO = new DecoderInputBuffer(2);
        clear();
    }

    public final void OooOO0() {
        super.clear();
        this.f36230OoooOOO = 0;
        this.f36232o000oOoO = -9223372036854775807L;
        this.f13640Oooo = -9223372036854775807L;
        if (this.f36229OoooOO0) {
            OooOOO(this.f36228OoooO);
            this.f36229OoooOO0 = false;
        }
    }

    public final void OooOO0O() {
        super.clear();
        this.f36230OoooOOO = 0;
        this.f36232o000oOoO = -9223372036854775807L;
        this.f13640Oooo = -9223372036854775807L;
        this.f36228OoooO.clear();
        this.f36229OoooOO0 = false;
    }

    public final boolean OooOO0o() {
        return this.f36230OoooOOO == 0;
    }

    public final void OooOOO(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer = decoderInputBuffer.f13642Oooo0oO;
        if (byteBuffer != null) {
            decoderInputBuffer.OooO0oo();
            OooO0oO(byteBuffer.remaining());
            this.f13642Oooo0oO.put(byteBuffer);
        }
        if (decoderInputBuffer.isEndOfStream()) {
            setFlags(4);
        }
        if (decoderInputBuffer.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        if (decoderInputBuffer.isKeyFrame()) {
            setFlags(1);
        }
        int i = this.f36230OoooOOO + 1;
        this.f36230OoooOOO = i;
        long j = decoderInputBuffer.f13640Oooo;
        this.f13640Oooo = j;
        if (i == 1) {
            this.f36232o000oOoO = j;
        }
        decoderInputBuffer.clear();
    }

    public final boolean OooOOO0() {
        ByteBuffer byteBuffer;
        return this.f36230OoooOOO >= this.f36231OoooOOo || ((byteBuffer = this.f13642Oooo0oO) != null && byteBuffer.position() >= 3072000) || this.f36229OoooOO0;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, p294o0O0Oo0o.o0Oo0oo
    public final void clear() {
        OooOO0O();
        this.f36231OoooOOo = 32;
    }
}
