package p294o0O0Oo0o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;

/* JADX INFO: loaded from: classes2.dex */
public interface oo0o0Oo<I, O, E extends DecoderException> {
    @Nullable
    O OooO0O0() throws DecoderException;

    @Nullable
    I OooO0OO() throws DecoderException;

    void OooO0Oo(I i) throws DecoderException;

    void flush();

    void release();
}
