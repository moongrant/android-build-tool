package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p203o00o0o0o.o00OOO0O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface SampleStream {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadDataResult {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadFlags {
    }

    void OooO00o() throws IOException;

    boolean OooO0O0();

    int OooOOO(o00OOO0O o00ooo0o, DecoderInputBuffer decoderInputBuffer, int i);

    int OooOOOo(long j);
}
