package p381o0OOoOOO;

import OooO00o.OooO00o;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.facebook.internal.OooOOO;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final long f38794OooO = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final /* synthetic */ int f38795OooOO0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38796OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0oOO0 f38797OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo0o0O0 f38798OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final FirebaseMessaging f38799OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ScheduledExecutorService f38800OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("pendingOperations")
    public final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f38801OooO0o0 = new Oooo0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f38802OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0o0Oo f38803OooO0oo;

    public o00OOOOo(FirebaseMessaging firebaseMessaging, oo0oOO0 oo0ooo0, o0o0Oo o0o0oo, oo0o0O0 oo0o0o0, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f38799OooO0Oo = firebaseMessaging;
        this.f38797OooO0O0 = oo0ooo0;
        this.f38803OooO0oo = o0o0oo;
        this.f38798OooO0OO = oo0o0o0;
        this.f38796OooO00o = context;
        this.f38800OooO0o = scheduledExecutorService;
    }

    @WorkerThread
    public static <T> void OooO00o(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static boolean OooO0Oo() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @WorkerThread
    public final void OooO0O0(String str) throws IOException {
        oo0o0O0 oo0o0o0 = this.f38798OooO0OO;
        String strOooO00o = this.f38799OooO0Oo.OooO00o();
        Objects.requireNonNull(oo0o0o0);
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        OooO00o(oo0o0o0.OooO00o(oo0o0o0.OooO0OO(strOooO00o, "/topics/" + str, bundle)));
    }

    @WorkerThread
    public final void OooO0OO(String str) throws IOException {
        oo0o0O0 oo0o0o0 = this.f38798OooO0OO;
        String strOooO00o = this.f38799OooO0Oo.OooO00o();
        Objects.requireNonNull(oo0o0o0);
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        OooO00o(oo0o0o0.OooO00o(oo0o0o0.OooO0OO(strOooO00o, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [OooOooo.o00oO0o, java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [OooOooo.o00oO0o, java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>>] */
    /* JADX WARN: Type inference failed for: r2v7, types: [OooOooo.o00oO0o, java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>>] */
    @WorkerThread
    public final boolean OooO0o() throws IOException {
        boolean z;
        while (true) {
            synchronized (this) {
                o00OOO0O o00ooo0oOooO00o = this.f38803OooO0oo.OooO00o();
                if (o00ooo0oOooO00o == null) {
                    if (OooO0Oo()) {
                        Log.d("FirebaseMessaging", "topic sync succeeded");
                    }
                    return true;
                }
                try {
                    String str = o00ooo0oOooO00o.f38787OooO0O0;
                    byte b = -1;
                    int iHashCode = str.hashCode();
                    if (iHashCode != 83) {
                        if (iHashCode == 85 && str.equals("U")) {
                            b = 1;
                        }
                    } else if (str.equals("S")) {
                        b = 0;
                    }
                    if (b == 0) {
                        OooO0O0(o00ooo0oOooO00o.f38786OooO00o);
                        if (OooO0Oo()) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + o00ooo0oOooO00o.f38786OooO00o + " succeeded.");
                        }
                    } else if (b == 1) {
                        OooO0OO(o00ooo0oOooO00o.f38786OooO00o);
                        if (OooO0Oo()) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + o00ooo0oOooO00o.f38786OooO00o + " succeeded.");
                        }
                    } else if (OooO0Oo()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + o00ooo0oOooO00o + ".");
                    }
                    z = true;
                } catch (IOException e) {
                    if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Topic operation failed: ");
                        sbOooO0o0.append(e.getMessage());
                        sbOooO0o0.append(". Will retry Topic operation.");
                        Log.e("FirebaseMessaging", sbOooO0o0.toString());
                    } else {
                        if (e.getMessage() != null) {
                            throw e;
                        }
                        Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    }
                    z = false;
                }
                if (!z) {
                    return false;
                }
                o0o0Oo o0o0oo = this.f38803OooO0oo;
                synchronized (o0o0oo) {
                    o00OOO00 o00ooo01 = o0o0oo.f38821OooO00o;
                    String str2 = o00ooo0oOooO00o.f38788OooO0OO;
                    synchronized (o00ooo01.f38783OooO0Oo) {
                        if (o00ooo01.f38783OooO0Oo.remove(str2)) {
                            o00ooo01.f38784OooO0o0.execute(new OooOOO(o00ooo01, 1));
                        }
                    }
                }
                synchronized (this.f38801OooO0o0) {
                    String str3 = o00ooo0oOooO00o.f38788OooO0OO;
                    if (this.f38801OooO0o0.containsKey(str3)) {
                        ArrayDeque arrayDeque = (ArrayDeque) this.f38801OooO0o0.getOrDefault(str3, null);
                        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                        if (taskCompletionSource != null) {
                            taskCompletionSource.setResult(null);
                        }
                        if (arrayDeque.isEmpty()) {
                            this.f38801OooO0o0.remove(str3);
                        }
                    }
                }
            }
        }
    }

    public final synchronized void OooO0o0(boolean z) {
        this.f38802OooO0oO = z;
    }

    public final void OooO0oO(long j) {
        this.f38800OooO0o.schedule(new o00Oo00(this, this.f38796OooO00o, this.f38797OooO0O0, Math.min(Math.max(30L, 2 * j), f38794OooO)), j, TimeUnit.SECONDS);
        OooO0o0(true);
    }
}
