package com.google.android.exoplayer2.extractor;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public interface Extractor {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    void OooO(o0OoOo0 o0oooo1);

    void OooO0Oo(long j, long j2);

    boolean OooO0o(o000oOoO o000oooo2) throws IOException;

    int OooO0o0(o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException;

    void release();
}
