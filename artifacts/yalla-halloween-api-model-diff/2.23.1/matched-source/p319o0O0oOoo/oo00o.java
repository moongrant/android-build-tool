package p319o0O0oOoo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.OooO0O0;
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
import org.json.JSONException;
import org.json.JSONObject;
import p319o0O0oOoo.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
@AnyThread
public final class oo00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("ConfigCacheClient.class")
    public static final HashMap f42002OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0O0 f42003OooO0o0 = new OooO0O0(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f42004OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0oOO0 f42005OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public Task<o00O0> f42006OooO0OO = null;

    public static class OooO00o<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final CountDownLatch f42007OooO0Oo = new CountDownLatch(1);

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.f42007OooO0Oo.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(@NonNull Exception exc) {
            this.f42007OooO0Oo.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(TResult tresult) {
            this.f42007OooO0Oo.countDown();
        }
    }

    public oo00o(ScheduledExecutorService scheduledExecutorService, oo0oOO0 oo0ooo0) {
        this.f42004OooO00o = scheduledExecutorService;
        this.f42005OooO0O0 = oo0ooo0;
    }

    public static Object OooO00o(Task task, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        OooO00o oooO00o = new OooO00o();
        Executor executor = f42003OooO0o0;
        task.addOnSuccessListener(executor, oooO00o);
        task.addOnFailureListener(executor, oooO00o);
        task.addOnCanceledListener(executor, oooO00o);
        if (!oooO00o.f42007OooO0Oo.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public static synchronized oo00o OooO0OO(ScheduledExecutorService scheduledExecutorService, oo0oOO0 oo0ooo0) {
        String str;
        HashMap map;
        str = oo0ooo0.f42016OooO0O0;
        map = f42002OooO0Oo;
        if (!map.containsKey(str)) {
            map.put(str, new oo00o(scheduledExecutorService, oo0ooo0));
        }
        return (oo00o) map.get(str);
    }

    public final synchronized Task<o00O0> OooO0O0() {
        Task<o00O0> task = this.f42006OooO0OO;
        if (task == null || (task.isComplete() && !this.f42006OooO0OO.isSuccessful())) {
            Executor executor = this.f42004OooO00o;
            final oo0oOO0 oo0ooo0 = this.f42005OooO0O0;
            Objects.requireNonNull(oo0ooo0);
            final int i = 1;
            this.f42006OooO0OO = Tasks.call(executor, new Callable() { // from class: androidx.media3.session.oo0o0O0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    FileInputStream fileInputStreamOpenFileInput;
                    p319o0O0oOoo.o00O0 o00o0OooO00o;
                    switch (i) {
                        case 0:
                            byte[] bArr = (byte[]) oo0ooo0;
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                            p080o000OoO.o00O0O.OooO0O0(bitmapDecodeByteArray != null, "Could not decode image data");
                            return bitmapDecodeByteArray;
                        default:
                            oo0oOO0 oo0ooo1 = (oo0oOO0) oo0ooo0;
                            synchronized (oo0ooo1) {
                                FileInputStream fileInputStream = null;
                                o00o0OooO00o = null;
                                try {
                                    try {
                                        fileInputStreamOpenFileInput = oo0ooo1.f42015OooO00o.openFileInput(oo0ooo1.f42016OooO0O0);
                                        try {
                                            int iAvailable = fileInputStreamOpenFileInput.available();
                                            byte[] bArr2 = new byte[iAvailable];
                                            fileInputStreamOpenFileInput.read(bArr2, 0, iAvailable);
                                            o00o0OooO00o = p319o0O0oOoo.o00O0.OooO00o(new JSONObject(new String(bArr2, "UTF-8")));
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
                            return o00o0OooO00o;
                    }
                }
            });
        }
        return this.f42006OooO0OO;
    }
}
