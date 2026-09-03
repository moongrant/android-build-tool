package o000O00;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import p092o000o0O0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface OooOO0<I, O, E extends DecoderException> {
    @Nullable
    O OooO0O0() throws DecoderException;

    void OooO0OO(o000OOo o000ooo2) throws DecoderException;

    @Nullable
    I OooO0Oo() throws DecoderException;

    void flush();

    void release();
}
