package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.UnstableApi;
import java.io.File;
import java.io.IOException;
import o000Oo0.OooO;
import o000Oo0.OooOo;
import o000Oo0.OooOo00;
import o000Oo0.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str, IOException iOException) {
            super(str, iOException);
        }
    }

    public interface OooO00o {
        void OooO00o(Cache cache, OooO oooO);

        void OooO0O0(OooO oooO);

        void OooO0Oo(Cache cache, OooO oooO, o00Oo0 o00oo1);
    }

    @WorkerThread
    void OooO(OooO oooO);

    OooOo OooO00o(String str);

    void OooO0O0(OooO oooO);

    long OooO0OO(long j, long j2, String str);

    @WorkerThread
    o00Oo0 OooO0Oo(long j, long j2, String str) throws InterruptedException, CacheException;

    long OooO0o(long j, long j2, String str);

    @Nullable
    @WorkerThread
    o00Oo0 OooO0o0(long j, long j2, String str) throws CacheException;

    @WorkerThread
    File OooO0oO(long j, long j2, String str) throws CacheException;

    @WorkerThread
    void OooO0oo(String str, OooOo00 oooOo00) throws CacheException;

    @WorkerThread
    void OooOO0(File file, long j) throws CacheException;

    @WorkerThread
    void OooOO0O(String str);
}
