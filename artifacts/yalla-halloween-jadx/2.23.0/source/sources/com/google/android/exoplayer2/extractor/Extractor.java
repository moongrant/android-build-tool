package com.google.android.exoplayer2.extractor;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p209o00o0oo0.o00O0O0;
import p209o00o0oo0.o00O0O00;
import p209o00o0oo0.o00OO0O0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface Extractor {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    void OooO0O0(long j, long j2);

    boolean OooO0Oo(o00O0O00 o00o0o01) throws IOException;

    int OooO0oO(o00O0O00 o00o0o01, o00OO0O0 o00oo0o1) throws IOException;

    void OooO0oo(o00O0O0 o00o0o0);

    void release();
}
