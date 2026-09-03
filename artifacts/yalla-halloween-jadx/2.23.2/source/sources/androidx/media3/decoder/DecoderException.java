package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class DecoderException extends Exception {
    public DecoderException(@Nullable ParserException parserException) {
        super(parserException);
    }
}
