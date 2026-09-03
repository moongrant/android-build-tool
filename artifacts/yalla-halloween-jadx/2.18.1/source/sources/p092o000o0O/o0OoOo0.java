package p092o000o0O;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Map<String, Lock> f29265OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f29266OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Lock f29267OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f29268OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public FileChannel f29269OooO0Oo;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.concurrent.locks.Lock>] */
    public o0OoOo0(@NonNull String str, @NonNull File file, boolean z) {
        Lock reentrantLock;
        File file2 = new File(file, OooOo00.OooO0Oo(str, ".lck"));
        this.f29266OooO00o = file2;
        String absolutePath = file2.getAbsolutePath();
        ?? r4 = f29265OooO0o0;
        synchronized (r4) {
            reentrantLock = (Lock) r4.get(absolutePath);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                r4.put(absolutePath, reentrantLock);
            }
        }
        this.f29267OooO0O0 = reentrantLock;
        this.f29268OooO0OO = z;
    }

    public final void OooO00o() {
        FileChannel fileChannel = this.f29269OooO0Oo;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f29267OooO0O0.unlock();
    }
}
