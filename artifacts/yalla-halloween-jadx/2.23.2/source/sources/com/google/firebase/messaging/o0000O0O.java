package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final long f19852OooO = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final /* synthetic */ int f19853OooOO0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f19854OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO0o f19855OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Ooo f19856OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final FirebaseMessaging f19857OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ScheduledExecutorService f19858OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("pendingOperations")
    public final p190o00o0O.OooO f19859OooO0o0 = new p190o00o0O.OooO();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f19860OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0000oo f19861OooO0oo;

    public o0000O0O(FirebaseMessaging firebaseMessaging, o0OOO0o o0ooo0o2, o0000oo o0000ooVar, o00Ooo o00ooo2, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f19857OooO0Oo = firebaseMessaging;
        this.f19855OooO0O0 = o0ooo0o2;
        this.f19861OooO0oo = o0000ooVar;
        this.f19856OooO0OO = o00ooo2;
        this.f19854OooO00o = context;
        this.f19858OooO0o = scheduledExecutorService;
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
        String strOooO00o = this.f19857OooO0Oo.OooO00o();
        o00Ooo o00ooo2 = this.f19856OooO0OO;
        o00ooo2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        OooO00o(o00ooo2.OooO00o(o00ooo2.OooO0OO(bundle, strOooO00o, "/topics/" + str)));
    }

    @WorkerThread
    public final void OooO0OO(String str) throws IOException {
        String strOooO00o = this.f19857OooO0Oo.OooO00o();
        o00Ooo o00ooo2 = this.f19856OooO0OO;
        o00ooo2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        OooO00o(o00ooo2.OooO00o(o00ooo2.OooO0OO(bundle, strOooO00o, "/topics/" + str)));
    }

    public final synchronized void OooO0o(boolean z) {
        this.f19860OooO0oO = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o0(o0000O00 o0000o00) {
        synchronized (this.f19859OooO0o0) {
            String str = o0000o00.f19851OooO0OO;
            if (this.f19859OooO0o0.containsKey(str)) {
                ArrayDeque arrayDeque = (ArrayDeque) this.f19859OooO0o0.getOrDefault(str, null);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f19859OooO0o0.remove(str);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @WorkerThread
    public final boolean OooO0oO() throws IOException {
        byte b;
        while (true) {
            synchronized (this) {
                o0000O00 o0000o00OooO00o = this.f19861OooO0oo.OooO00o();
                boolean z = true;
                if (o0000o00OooO00o == null) {
                    if (OooO0Oo()) {
                        Log.d("FirebaseMessaging", "topic sync succeeded");
                    }
                    return true;
                }
                try {
                    String str = o0000o00OooO00o.f19850OooO0O0;
                    int iHashCode = str.hashCode();
                    if (iHashCode != 83) {
                        if (iHashCode == 85 && str.equals("U")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals("S")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    String str2 = o0000o00OooO00o.f19849OooO00o;
                    if (b == 0) {
                        OooO0O0(str2);
                        if (OooO0Oo()) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + str2 + " succeeded.");
                        }
                    } else if (b == 1) {
                        OooO0OO(str2);
                        if (OooO0Oo()) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + str2 + " succeeded.");
                        }
                    } else if (OooO0Oo()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + o0000o00OooO00o + ".");
                    }
                } catch (IOException e) {
                    if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                        Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
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
                this.f19861OooO0oo.OooO0OO(o0000o00OooO00o);
                OooO0o0(o0000o00OooO00o);
            }
        }
    }

    public final void OooO0oo(long j) {
        this.f19858OooO0o.schedule(new o000OO(this, this.f19854OooO00o, this.f19855OooO0O0, Math.min(Math.max(30L, 2 * j), f19852OooO)), j, TimeUnit.SECONDS);
        synchronized (this) {
            this.f19860OooO0oO = true;
        }
    }
}
