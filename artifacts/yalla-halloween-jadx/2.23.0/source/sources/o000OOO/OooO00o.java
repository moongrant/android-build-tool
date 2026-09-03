package o000OOO;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.OooOOOO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final HashMap f34885OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f34886OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final File f34887OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    @NotNull
    public final Lock f34888OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public FileChannel f34889OooO0Oo;

    public OooO00o(@NotNull String name, @Nullable File file, boolean z) {
        Lock lock;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f34886OooO00o = z;
        this.f34887OooO0O0 = file != null ? new File(file, OooOOOO.OooO00o(name, ".lck")) : null;
        HashMap map = f34885OooO0o0;
        synchronized (map) {
            Object reentrantLock = map.get(name);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(name, reentrantLock);
            }
            lock = (Lock) reentrantLock;
        }
        this.f34888OooO0OO = lock;
    }

    public final void OooO00o(boolean z) {
        this.f34888OooO0OO.lock();
        if (z) {
            File file = this.f34887OooO0O0;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f34889OooO0Oo = channel;
            } catch (IOException e) {
                this.f34889OooO0Oo = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void OooO0O0() {
        try {
            FileChannel fileChannel = this.f34889OooO0Oo;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f34888OooO0OO.unlock();
    }
}
