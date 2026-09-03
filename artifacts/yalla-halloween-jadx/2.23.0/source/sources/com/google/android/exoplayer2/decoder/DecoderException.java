package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DecoderException extends Exception {
    public DecoderException(@Nullable ParserException parserException) {
        super(parserException);
    }
}
