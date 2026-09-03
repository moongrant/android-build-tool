package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.IOException;
import p246o00oo0o0.o00;
import p246o00oo0o0.o000OO0O;
import p246o00oo0o0.o00O00;
import p246o00oo0o0.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public interface OooO00o {
        void OooO00o(Cache cache, o000OO0O o000oo0o2);

        void OooO0OO(Cache cache, o000OO0O o000oo0o2, o00O00 o00o01);

        void OooO0Oo(o000OO0O o000oo0o2);
    }

    @WorkerThread
    void OooO(File file, long j) throws CacheException;

    o00O0000 OooO00o(String str);

    @WorkerThread
    void OooO0O0(String str, o00 o00Var) throws CacheException;

    void OooO0OO(o000OO0O o000oo0o2);

    long OooO0Oo(long j, long j2, String str);

    @Nullable
    @WorkerThread
    o00O00 OooO0o(long j, long j2, String str) throws CacheException;

    @WorkerThread
    o00O00 OooO0o0(long j, long j2, String str) throws InterruptedException, CacheException;

    long OooO0oO(long j, long j2, String str);

    @WorkerThread
    File OooO0oo(long j, long j2, String str) throws CacheException;

    @WorkerThread
    void OooOO0(o000OO0O o000oo0o2);
}
