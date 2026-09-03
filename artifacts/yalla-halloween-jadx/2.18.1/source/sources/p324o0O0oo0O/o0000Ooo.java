package p324o0O0oo0O;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.Objects;
import p294o0O0Oo0o.o000000;
import p294o0O0Oo0o.o000OOo;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0000Ooo extends o000000<o0000O0O, o000OO, SubtitleDecoderException> implements o0000oo {
    public o0000Ooo() {
        super(new o0000O0O[2], new o000OO[2]);
        o00000O0.OooO0Oo(this.f35829OooO0oO == this.f35828OooO0o0.length);
        for (DecoderInputBuffer decoderInputBuffer : this.f35828OooO0o0) {
            decoderInputBuffer.OooO0oO(1024);
        }
    }

    @Override // p324o0O0oo0O.o0000oo
    public final void OooO00o(long j) {
    }

    @Override // p294o0O0Oo0o.o000000
    @Nullable
    public final DecoderException OooO0o0(DecoderInputBuffer decoderInputBuffer, o000OOo o000ooo2, boolean z) {
        o0000O0O o0000o0o2 = (o0000O0O) decoderInputBuffer;
        o000OO o000oo2 = (o000OO) o000ooo2;
        try {
            ByteBuffer byteBuffer = o0000o0o2.f13642Oooo0oO;
            Objects.requireNonNull(byteBuffer);
            o000oo2.OooO0o(o0000o0o2.f13640Oooo, OooOO0(byteBuffer.array(), byteBuffer.limit(), z), o0000o0o2.f36904OoooO);
            o000oo2.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    public abstract o0000O00 OooOO0(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;
}
