package p230o00oOoO0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p206o00o0oOO.o0O00000;
import p206o00o0oOO.o0O0000O;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class o0000OO0 extends o0O0000O<o000O00, o000O00O, SubtitleDecoderException> implements o000O000 {
    public o0000OO0() {
        super(new o000O00[2], new o000O00O[2]);
        int i = this.f39419OooO0oO;
        DecoderInputBuffer[] decoderInputBufferArr = this.f39418OooO0o0;
        o00O000o.OooO0Oo(i == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.OooOO0(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
    }

    @Override // p230o00oOoO0.o000O000
    public final void OooO00o(long j) {
    }

    @Override // p206o00o0oOO.o0O0000O
    @Nullable
    public final SubtitleDecoderException OooO0o0(DecoderInputBuffer decoderInputBuffer, o0O00000 o0o00000, boolean z) {
        o000O00 o000o01 = (o000O00) decoderInputBuffer;
        o000O00O o000o00o2 = (o000O00O) o0o00000;
        try {
            ByteBuffer byteBuffer = o000o01.f11674OooO0o;
            byteBuffer.getClass();
            o000o00o2.OooO(o000o01.f11677OooO0oo, OooO0oO(byteBuffer.array(), byteBuffer.limit(), z), o000o01.f40116OooOO0o);
            o000o00o2.f39410OooO0Oo &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    public abstract o000 OooO0oO(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;
}
