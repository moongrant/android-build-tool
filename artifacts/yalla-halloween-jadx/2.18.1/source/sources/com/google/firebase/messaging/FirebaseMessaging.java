package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.OooO00o;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0O0O0Oo.OooOO0;
import p351o0OOOOo.OooOOO;
import p373o0OOo0o0.o0000;
import p373o0OOo0o0.o00000O;
import p373o0OOo0o0.o00000OO;
import p374o0OOo0oO.o00oO0o;
import p375o0OOo0oo.o0OOO0o;
import p381o0OOoOOO.o00O0;
import p381o0OOoOOO.o00O00OO;
import p381o0OOoOOO.o00OOO0;
import p381o0OOoOOO.o00OOOOo;
import p381o0OOoOOO.oo00o;
import p381o0OOoOOO.oo0O;
import p381o0OOoOOO.oo0o0O0;
import p381o0OOoOOO.oo0oOO0;
import p382o0OOoOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @GuardedBy("FirebaseMessaging.class")
    public static com.google.firebase.messaging.OooO00o f19170OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final long f19171OooOOO0 = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    @SuppressLint({"FirebaseUnknownNullness"})
    @VisibleForTesting
    public static OooOO0 f19172OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @GuardedBy("FirebaseMessaging.class")
    @VisibleForTesting
    public static ScheduledThreadPoolExecutor f19173OooOOOo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Executor f19174OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f19175OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o00oO0o f19176OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p377o0OOoO00.OooOOO f19177OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f19178OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo0O f19179OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo0o0O0 f19180OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f19181OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Executor f19182OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final oo0oOO0 f19183OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f19184OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o00O00OO f19185OooOO0o;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000 f19186OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @GuardedBy("this")
        public boolean f19187OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        @GuardedBy("this")
        public o00000OO<p351o0OOOOo.OooOO0> f19188OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        @GuardedBy("this")
        public Boolean f19189OooO0Oo;

        public OooO00o(o0000 o0000Var) {
            this.f19186OooO00o = o0000Var;
        }

        public final synchronized void OooO00o() {
            if (this.f19187OooO0O0) {
                return;
            }
            Boolean boolOooO0OO = OooO0OO();
            this.f19189OooO0Oo = boolOooO0OO;
            if (boolOooO0OO == null) {
                o00000OO<p351o0OOOOo.OooOO0> o00000oo2 = new o00000OO() { // from class: o0OOoOOO.o00O0O0O
                    @Override // p373o0OOo0o0.o00000OO
                    public final void OooO00o(o00000O o00000o) {
                        FirebaseMessaging.OooO00o oooO00o = this.f38763OooO00o;
                        if (oooO00o.OooO0O0()) {
                            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                            OooO00o oooO00o2 = FirebaseMessaging.f19170OooOOO;
                            firebaseMessaging.OooO0oo();
                        }
                    }
                };
                this.f19188OooO0OO = o00000oo2;
                this.f19186OooO00o.OooO00o(o00000oo2);
            }
            this.f19187OooO0O0 = true;
        }

        public final synchronized boolean OooO0O0() {
            Boolean bool;
            OooO00o();
            bool = this.f19189OooO0Oo;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f19175OooO00o.OooO0oO();
        }

        @Nullable
        public final Boolean OooO0OO() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            OooOOO oooOOO = FirebaseMessaging.this.f19175OooO00o;
            oooOOO.OooO00o();
            Context context = oooOOO.f38263OooO00o;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(OooOOO oooOOO, @Nullable o00oO0o o00oo0o2, o0OOO0o<o00000> o0ooo0o2, o0OOO0o<HeartBeatInfo> o0ooo0o3, p377o0OOoO00.OooOOO oooOOO2, @Nullable OooOO0 oooOO1, o0000 o0000Var) {
        oooOOO.OooO00o();
        final oo0oOO0 oo0ooo0 = new oo0oOO0(oooOOO.f38263OooO00o);
        final oo0o0O0 oo0o0o0 = new oo0o0O0(oooOOO, oo0ooo0, o0ooo0o2, o0ooo0o3, oooOOO2);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        int i = 0;
        this.f19184OooOO0O = false;
        f19172OooOOOO = oooOO1;
        this.f19175OooO00o = oooOOO;
        this.f19176OooO0O0 = o00oo0o2;
        this.f19177OooO0OO = oooOOO2;
        this.f19181OooO0oO = new OooO00o(o0000Var);
        oooOOO.OooO00o();
        final Context context = oooOOO.f38263OooO00o;
        this.f19178OooO0Oo = context;
        o00O00OO o00o00oo2 = new o00O00OO();
        this.f19185OooOO0o = o00o00oo2;
        this.f19183OooOO0 = oo0ooo0;
        this.f19180OooO0o0 = oo0o0o0;
        this.f19179OooO0o = new oo0O(executorServiceNewSingleThreadExecutor);
        this.f19182OooO0oo = scheduledThreadPoolExecutor;
        this.f19174OooO = threadPoolExecutor;
        oooOOO.OooO00o();
        Context context2 = oooOOO.f38263OooO00o;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(o00o00oo2);
        } else {
            Log.w("FirebaseMessaging", "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        int i2 = 3;
        if (o00oo0o2 != null) {
            o00oo0o2.OooO0OO();
        }
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: o0OOoOOO.o00O0O00
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = this.f38762Oooo0o;
                if (firebaseMessaging.f19181OooO0oO.OooO0O0()) {
                    firebaseMessaging.OooO0oo();
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i3 = o00OOOOo.f38795OooOO0;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: o0OOoOOO.o00OOOO0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0o0Oo o0o0oo;
                Context context3 = context;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                oo0oOO0 oo0ooo1 = oo0ooo0;
                oo0o0O0 oo0o0o1 = oo0o0o0;
                synchronized (o0o0Oo.class) {
                    WeakReference<o0o0Oo> weakReference = o0o0Oo.f38820OooO0O0;
                    o0o0oo = weakReference != null ? weakReference.get() : null;
                    if (o0o0oo == null) {
                        SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                        o0o0Oo o0o0oo2 = new o0o0Oo(sharedPreferences, scheduledExecutorService);
                        synchronized (o0o0oo2) {
                            o0o0oo2.f38821OooO00o = o00OOO00.OooO00o(sharedPreferences, scheduledExecutorService);
                        }
                        o0o0Oo.f38820OooO0O0 = new WeakReference<>(o0o0oo2);
                        o0o0oo = o0o0oo2;
                    }
                }
                return new o00OOOOo(firebaseMessaging, oo0ooo1, o0o0oo, oo0o0o1, context3, scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new p142o00OOooO.OooOOO(this, i2));
        scheduledThreadPoolExecutor.execute(new oo00o(this, i));
    }

    @NonNull
    public static synchronized com.google.firebase.messaging.OooO00o OooO0Oo(Context context) {
        if (f19170OooOOO == null) {
            f19170OooOOO = new com.google.firebase.messaging.OooO00o(context);
        }
        return f19170OooOOO;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull OooOOO oooOOO) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) oooOOO.OooO0O0(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final synchronized void OooO(long j) {
        OooO0OO(new o00OOO0(this, Math.min(Math.max(30L, 2 * j), f19171OooOOO0)), j);
        this.f19184OooOO0O = true;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final String OooO00o() throws IOException {
        Task<String> orDefault;
        o00oO0o o00oo0o2 = this.f19176OooO0O0;
        if (o00oo0o2 != null) {
            try {
                return (String) Tasks.await(o00oo0o2.OooO0O0());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final com.google.firebase.messaging.OooO00o.C0153OooO00o c0153OooO00oOooO0o = OooO0o();
        if (!OooOO0(c0153OooO00oOooO0o)) {
            return c0153OooO00oOooO0o.f19193OooO00o;
        }
        final String strOooO0O0 = oo0oOO0.OooO0O0(this.f19175OooO00o);
        final oo0O oo0o = this.f19179OooO0o;
        synchronized (oo0o) {
            orDefault = oo0o.f38830OooO0O0.getOrDefault(strOooO0O0, null);
            if (orDefault == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strOooO0O0);
                }
                oo0o0O0 oo0o0o0 = this.f19180OooO0o0;
                orDefault = oo0o0o0.OooO00o(oo0o0o0.OooO0OO(oo0oOO0.OooO0O0(oo0o0o0.f38831OooO00o), "*", new Bundle())).onSuccessTask(this.f19174OooO, new SuccessContinuation() { // from class: o0OOoOOO.o00O00o0
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        FirebaseMessaging firebaseMessaging = this.f38757OooO00o;
                        String str = strOooO0O0;
                        OooO00o.C0153OooO00o c0153OooO00o = c0153OooO00oOooO0o;
                        String str2 = (String) obj;
                        OooO00o oooO00oOooO0Oo = FirebaseMessaging.OooO0Oo(firebaseMessaging.f19178OooO0Oo);
                        String strOooO0o0 = firebaseMessaging.OooO0o0();
                        String strOooO00o = firebaseMessaging.f19183OooOO0.OooO00o();
                        synchronized (oooO00oOooO0Oo) {
                            String strOooO00o2 = OooO00o.C0153OooO00o.OooO00o(str2, strOooO00o, System.currentTimeMillis());
                            if (strOooO00o2 != null) {
                                SharedPreferences.Editor editorEdit = oooO00oOooO0Oo.f19191OooO00o.edit();
                                editorEdit.putString(oooO00oOooO0Oo.OooO00o(strOooO0o0, str), strOooO00o2);
                                editorEdit.commit();
                            }
                        }
                        if (c0153OooO00o == null || !str2.equals(c0153OooO00o.f19193OooO00o)) {
                            OooOOO oooOOO = firebaseMessaging.f19175OooO00o;
                            oooOOO.OooO00o();
                            if ("[DEFAULT]".equals(oooOOO.f38264OooO0O0)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Invoking onNewToken for app: ");
                                    OooOOO oooOOO2 = firebaseMessaging.f19175OooO00o;
                                    oooOOO2.OooO00o();
                                    sbOooO0o0.append(oooOOO2.f38264OooO0O0);
                                    Log.d("FirebaseMessaging", sbOooO0o0.toString());
                                }
                                Intent intent = new Intent(FirebaseMessagingService.ACTION_NEW_TOKEN);
                                intent.putExtra(FirebaseMessagingService.EXTRA_TOKEN, str2);
                                new o00O00O(firebaseMessaging.f19178OooO0Oo).OooO0OO(intent);
                            }
                        }
                        return Tasks.forResult(str2);
                    }
                }).continueWithTask(oo0o.f38829OooO00o, new Continuation() { // from class: o0OOoOOO.o00OO0OO
                    /* JADX WARN: Type inference failed for: r2v0, types: [OooOooo.o00oO0o, java.util.Map<java.lang.String, com.google.android.gms.tasks.Task<java.lang.String>>] */
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        oo0O oo0o2 = oo0o;
                        String str = strOooO0O0;
                        synchronized (oo0o2) {
                            oo0o2.f38830OooO0O0.remove(str);
                        }
                        return task;
                    }
                });
                oo0o.f38830OooO0O0.put(strOooO0O0, orDefault);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strOooO0O0);
            }
        }
        try {
            return (String) Tasks.await(orDefault);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    @NonNull
    public final Task<Void> OooO0O0() {
        if (this.f19176OooO0O0 != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f19182OooO0oo.execute(new com.facebook.bolts.OooOOO(this, taskCompletionSource, 1));
            return taskCompletionSource.getTask();
        }
        if (OooO0o() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new o00O0(this, taskCompletionSource2, 0));
        return taskCompletionSource2.getTask();
    }

    public final void OooO0OO(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f19173OooOOOo == null) {
                f19173OooOOOo = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f19173OooOOOo.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    @Nullable
    @VisibleForTesting
    public final com.google.firebase.messaging.OooO00o.C0153OooO00o OooO0o() {
        com.google.firebase.messaging.OooO00o.C0153OooO00o c0153OooO00oOooO0O0;
        com.google.firebase.messaging.OooO00o oooO00oOooO0Oo = OooO0Oo(this.f19178OooO0Oo);
        String strOooO0o0 = OooO0o0();
        String strOooO0O0 = oo0oOO0.OooO0O0(this.f19175OooO00o);
        synchronized (oooO00oOooO0Oo) {
            c0153OooO00oOooO0O0 = com.google.firebase.messaging.OooO00o.C0153OooO00o.OooO0O0(oooO00oOooO0Oo.f19191OooO00o.getString(oooO00oOooO0Oo.OooO00o(strOooO0o0, strOooO0O0), null));
        }
        return c0153OooO00oOooO0O0;
    }

    public final String OooO0o0() {
        OooOOO oooOOO = this.f19175OooO00o;
        oooOOO.OooO00o();
        return "[DEFAULT]".equals(oooOOO.f38264OooO0O0) ? "" : this.f19175OooO00o.OooO0Oo();
    }

    public final synchronized void OooO0oO(boolean z) {
        this.f19184OooOO0O = z;
    }

    public final void OooO0oo() {
        o00oO0o o00oo0o2 = this.f19176OooO0O0;
        if (o00oo0o2 != null) {
            o00oo0o2.getToken();
        } else if (OooOO0(OooO0o())) {
            synchronized (this) {
                if (!this.f19184OooOO0O) {
                    OooO(0L);
                }
            }
        }
    }

    @VisibleForTesting
    public final boolean OooOO0(@Nullable com.google.firebase.messaging.OooO00o.C0153OooO00o c0153OooO00o) {
        if (c0153OooO00o != null) {
            if (!(System.currentTimeMillis() > c0153OooO00o.f19195OooO0OO + com.google.firebase.messaging.OooO00o.C0153OooO00o.f19192OooO0Oo || !this.f19183OooOO0.OooO00o().equals(c0153OooO00o.f19194OooO0O0))) {
                return false;
            }
        }
        return true;
    }
}
