package androidx.media3.exoplayer.source;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class UnrecognizedInputFormatException extends ParserException {
    public UnrecognizedInputFormatException(String str) {
        super(str, null, false, 1);
    }
}
