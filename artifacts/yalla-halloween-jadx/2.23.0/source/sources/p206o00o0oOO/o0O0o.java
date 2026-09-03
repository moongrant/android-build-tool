package p206o00o0oOO;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import p230o00oOoO0.o000O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface o0O0o<I, O, E extends DecoderException> {
    void OooO0O0(o000O00 o000o01) throws DecoderException;

    @Nullable
    O OooO0OO() throws DecoderException;

    @Nullable
    I OooO0Oo() throws DecoderException;

    void flush();

    void release();
}
