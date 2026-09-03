package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p466o0OooO0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public interface SampleStream {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadDataResult {
    }

    void OooO00o() throws IOException;

    boolean OooO0O0();

    int OooO0OO(long j);

    int OooO0Oo(o0000O0O o0000o0o2, DecoderInputBuffer decoderInputBuffer, boolean z);
}
