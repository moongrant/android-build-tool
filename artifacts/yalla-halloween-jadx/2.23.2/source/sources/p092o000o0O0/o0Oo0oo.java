package p092o000o0O0;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000O00.OooOO0O;
import o000O00.OooOOO0;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class o0Oo0oo extends OooOOO0<o000OOo, o000000, SubtitleDecoderException> implements oo0o0Oo {
    public o0Oo0oo() {
        super(new o000OOo[2], new o000000[2]);
        int i = this.f33940OooO0oO;
        DecoderInputBuffer[] decoderInputBufferArr = this.f33939OooO0o0;
        o00Oo0.OooO0Oo(i == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.OooOO0(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
    }

    @Override // p092o000o0O0.oo0o0Oo
    public final void OooO00o(long j) {
    }

    @Override // o000O00.OooOOO0
    @Nullable
    public final SubtitleDecoderException OooO0o0(DecoderInputBuffer decoderInputBuffer, OooOO0O oooOO0O, boolean z) {
        o000OOo o000ooo2 = (o000OOo) decoderInputBuffer;
        o000000 o000000Var = (o000000) oooOO0O;
        try {
            ByteBuffer byteBuffer = o000ooo2.f7084OooO0o;
            byteBuffer.getClass();
            o000000Var.OooO(o000ooo2.f7087OooO0oo, OooO0oO(byteBuffer.array(), byteBuffer.limit(), z), o000ooo2.f35192OooOO0o);
            o000000Var.f33931OooO0Oo &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    public abstract o0OO00O OooO0oO(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;
}
