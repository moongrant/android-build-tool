package p313o0O0oOo;

import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o000O0Oo.OooO;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@AnyThread
public final class o000000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("ConfigCacheClient.class")
    public static final HashMap f42540OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO f42541OooO0o0 = new OooO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f42542OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O0 f42543OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public Task<o000000O> f42544OooO0OO = null;

    public static class OooO00o<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final CountDownLatch f42545OooO0Oo = new CountDownLatch(1);

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.f42545OooO0Oo.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(@NonNull Exception exc) {
            this.f42545OooO0Oo.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(TResult tresult) {
            this.f42545OooO0Oo.countDown();
        }
    }

    public o000000(ScheduledExecutorService scheduledExecutorService, o0000O0 o0000o1) {
        this.f42542OooO00o = scheduledExecutorService;
        this.f42543OooO0O0 = o0000o1;
    }

    public static Object OooO00o(Task task, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o oooO00o = new OooO00o();
        Executor executor = f42541OooO0o0;
        task.addOnSuccessListener(executor, oooO00o);
        task.addOnFailureListener(executor, oooO00o);
        task.addOnCanceledListener(executor, oooO00o);
        if (!oooO00o.f42545OooO0Oo.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized o000000 OooO0OO(ScheduledExecutorService scheduledExecutorService, o0000O0 o0000o1) {
        String str;
        HashMap map;
        str = o0000o1.f42565OooO0O0;
        map = f42540OooO0Oo;
        if (!map.containsKey(str)) {
            map.put(str, new o000000(scheduledExecutorService, o0000o1));
        }
        return (o000000) map.get(str);
    }

    public final synchronized Task<o000000O> OooO0O0() {
        Task<o000000O> task = this.f42544OooO0OO;
        if (task == null || (task.isComplete() && !this.f42544OooO0OO.isSuccessful())) {
            Executor executor = this.f42542OooO00o;
            final o0000O0 o0000o1 = this.f42543OooO0O0;
            Objects.requireNonNull(o0000o1);
            this.f42544OooO0OO = Tasks.call(executor, new Callable() { // from class: o0O0oOo.oo0o0Oo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    FileInputStream fileInputStreamOpenFileInput;
                    o000000O o000000oOooO00o;
                    o0000O0 o0000o2 = o0000o1;
                    synchronized (o0000o2) {
                        FileInputStream fileInputStream = null;
                        o000000oOooO00o = null;
                        try {
                            try {
                                fileInputStreamOpenFileInput = o0000o2.f42564OooO00o.openFileInput(o0000o2.f42565OooO0O0);
                                try {
                                    int iAvailable = fileInputStreamOpenFileInput.available();
                                    byte[] bArr = new byte[iAvailable];
                                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                    o000000oOooO00o = o000000O.OooO00o(new JSONObject(new String(bArr, "UTF-8")));
                                    fileInputStreamOpenFileInput.close();
                                } catch (FileNotFoundException | JSONException unused) {
                                    if (fileInputStreamOpenFileInput != null) {
                                        fileInputStreamOpenFileInput.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileInputStream = fileInputStreamOpenFileInput;
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (FileNotFoundException | JSONException unused2) {
                            fileInputStreamOpenFileInput = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    return o000000oOooO00o;
                }
            });
        }
        return this.f42544OooO0OO;
    }
}
