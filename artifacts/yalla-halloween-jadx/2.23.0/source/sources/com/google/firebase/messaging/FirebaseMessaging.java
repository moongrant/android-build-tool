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
import p029Oooo0oo.o0O0o0;
import p029Oooo0oo.o0oOo0O0;
import p314o0O0oOo0.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final long f20228OooOO0o = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    @SuppressLint({"FirebaseUnknownNullness"})
    @VisibleForTesting
    public static p176o00o0.o0OoOo0 f20229OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @GuardedBy("FirebaseMessaging.class")
    public static o0000O00 f20230OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @GuardedBy("FirebaseMessaging.class")
    @VisibleForTesting
    public static ScheduledThreadPoolExecutor f20231OooOOOO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Executor f20232OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p281o0O0O0oO.OooOO0 f20233OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o0O0o00O.OooO00o f20234OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0o0.OooO f20235OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f20236OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00000O f20237OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OOO0o f20238OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f20239OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Executor f20240OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o0O0O00 f20241OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f20242OooOO0O;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O0o000.OooO0o f20243OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @GuardedBy("this")
        public boolean f20244OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        @GuardedBy("this")
        public Boolean f20245OooO0OO;

        public OooO00o(o0O0o000.OooO0o oooO0o) {
            this.f20243OooO00o = oooO0o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [com.google.firebase.messaging.o00oO0o] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final synchronized void OooO00o() {
            if (this.f20244OooO0O0) {
                return;
            }
            Boolean boolOooO0O0 = OooO0O0();
            this.f20245OooO0OO = boolOooO0O0;
            if (boolOooO0O0 == null) {
                this.f20243OooO00o.OooO00o(new o0O0o000.OooO0O0() { // from class: com.google.firebase.messaging.o00oO0o
                    @Override // o0O0o000.OooO0O0
                    public final void OooO00o(o0O0o000.OooO00o oooO00o) {
                        boolean zBooleanValue;
                        FirebaseMessaging.OooO00o oooO00o2 = this.f20370OooO00o;
                        synchronized (oooO00o2) {
                            oooO00o2.OooO00o();
                            Boolean bool = oooO00o2.f20245OooO0OO;
                            zBooleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f20233OooO00o.OooO0oo();
                        }
                        if (zBooleanValue) {
                            o0000O00 o0000o00 = FirebaseMessaging.f20230OooOOO0;
                            FirebaseMessaging.this.OooO();
                        }
                    }
                });
            }
            this.f20244OooO0O0 = true;
        }

        @Nullable
        public final Boolean OooO0O0() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            p281o0O0O0oO.OooOO0 oooOO1 = FirebaseMessaging.this.f20233OooO00o;
            oooOO1.OooO00o();
            Context context = oooOO1.f41949OooO00o;
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

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(p281o0O0O0oO.OooOO0 oooOO1, @Nullable o0O0o00O.OooO00o oooO00o, p298o0O0o00o.OooO0OO<o000OO0O> oooO0OO, p298o0O0o00o.OooO0OO<HeartBeatInfo> oooO0OO2, o0O0o0.OooO oooO, @Nullable p176o00o0.o0OoOo0 o0oooo0, o0O0o000.OooO0o oooO0o) {
        oooOO1.OooO00o();
        Context context = oooOO1.f41949OooO00o;
        final o0O0O00 o0o0o00 = new o0O0O00(context);
        final o0OOO0o o0ooo0o2 = new o0OOO0o(oooOO1, o0o0o00, oooO0OO, oooO0OO2, oooO);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.f20242OooOO0O = false;
        f20229OooOOO = o0oooo0;
        this.f20233OooO00o = oooOO1;
        this.f20234OooO0O0 = oooO00o;
        this.f20235OooO0OO = oooO;
        this.f20239OooO0oO = new OooO00o(oooO0o);
        oooOO1.OooO00o();
        final Context context2 = oooOO1.f41949OooO00o;
        this.f20236OooO0Oo = context2;
        o0OoOo0 o0oooo1 = new o0OoOo0();
        this.f20241OooOO0 = o0o0o00;
        this.f20238OooO0o0 = o0ooo0o2;
        this.f20237OooO0o = new o00000O(executorServiceNewSingleThreadExecutor);
        this.f20240OooO0oo = scheduledThreadPoolExecutor;
        this.f20232OooO = threadPoolExecutor;
        oooOO1.OooO00o();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(o0oooo1);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (oooO00o != null) {
            oooO00o.OooO0O0();
        }
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: com.google.firebase.messaging.o00Oo0
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue;
                o0000O00 o0000o00 = FirebaseMessaging.f20230OooOOO0;
                FirebaseMessaging firebaseMessaging = this.f20368OooO0Oo;
                FirebaseMessaging.OooO00o oooO00o2 = firebaseMessaging.f20239OooO0oO;
                synchronized (oooO00o2) {
                    oooO00o2.OooO00o();
                    Boolean bool = oooO00o2.f20245OooO0OO;
                    zBooleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f20233OooO00o.OooO0oo();
                }
                if (zBooleanValue) {
                    firebaseMessaging.OooO();
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i2 = o0000O.f20305OooOO0;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.o000OO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0000O0O o0000o0o2;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                o0O0O00 o0o0o01 = o0o0o00;
                o0OOO0o o0ooo0o3 = o0ooo0o2;
                synchronized (o0000O0O.class) {
                    WeakReference<o0000O0O> weakReference = o0000O0O.f20323OooO0Oo;
                    o0000o0o2 = weakReference != null ? weakReference.get() : null;
                    if (o0000o0o2 == null) {
                        o0000O0O o0000o0o3 = new o0000O0O(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledExecutorService);
                        o0000o0o3.OooO0O0();
                        o0000O0O.f20323OooO0Oo = new WeakReference<>(o0000o0o3);
                        o0000o0o2 = o0000o0o3;
                    }
                }
                return new o0000O(firebaseMessaging, o0o0o01, o0000o0o2, o0ooo0o3, context3, scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new o00Ooo(this));
        scheduledThreadPoolExecutor.execute(new p045Oooooo.o0ooOOo(this, i));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void OooO0OO(long j, o0000oo o0000ooVar) {
        synchronized (FirebaseMessaging.class) {
            if (f20231OooOOOO == null) {
                f20231OooOOOO = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f20231OooOOOO.schedule(o0000ooVar, j, TimeUnit.SECONDS);
        }
    }

    @NonNull
    public static synchronized o0000O00 OooO0Oo(Context context) {
        if (f20230OooOOO0 == null) {
            f20230OooOOO0 = new o0000O00(context);
        }
        return f20230OooOOO0;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull p281o0O0O0oO.OooOO0 oooOO1) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) oooOO1.OooO0O0(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final void OooO() {
        o0O0o00O.OooO00o oooO00o = this.f20234OooO0O0;
        if (oooO00o != null) {
            oooO00o.getToken();
        } else if (OooOO0O(OooO0o())) {
            synchronized (this) {
                if (!this.f20242OooOO0O) {
                    OooOO0(0L);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String OooO00o() throws IOException {
        Task taskContinueWithTask;
        o0O0o00O.OooO00o oooO00o = this.f20234OooO0O0;
        if (oooO00o != null) {
            try {
                return (String) Tasks.await(oooO00o.OooO0OO());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final o0000O00.OooO00o oooO00oOooO0o = OooO0o();
        if (!OooOO0O(oooO00oOooO0o)) {
            return oooO00oOooO0o.f20320OooO00o;
        }
        final String strOooO0OO = o0O0O00.OooO0OO(this.f20233OooO00o);
        final o00000O o00000o = this.f20237OooO0o;
        synchronized (o00000o) {
            taskContinueWithTask = (Task) o00000o.f20296OooO0O0.getOrDefault(strOooO0OO, null);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strOooO0OO);
                }
                o0OOO0o o0ooo0o2 = this.f20238OooO0o0;
                taskContinueWithTask = o0ooo0o2.OooO00o(o0ooo0o2.OooO0OO(new Bundle(), o0O0O00.OooO0OO(o0ooo0o2.f20376OooO00o), "*")).onSuccessTask(this.f20232OooO, new SuccessContinuation() { // from class: com.google.firebase.messaging.oo000o
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        FirebaseMessaging firebaseMessaging = this.f20387OooO0Oo;
                        String str = strOooO0OO;
                        o0000O00.OooO00o oooO00o2 = oooO00oOooO0o;
                        String str2 = (String) obj;
                        o0000O00 o0000o00OooO0Oo = FirebaseMessaging.OooO0Oo(firebaseMessaging.f20236OooO0Oo);
                        String strOooO0o0 = firebaseMessaging.OooO0o0();
                        String strOooO00o = firebaseMessaging.f20241OooOO0.OooO00o();
                        synchronized (o0000o00OooO0Oo) {
                            String strOooO00o2 = o0000O00.OooO00o.OooO00o(System.currentTimeMillis(), str2, strOooO00o);
                            if (strOooO00o2 != null) {
                                SharedPreferences.Editor editorEdit = o0000o00OooO0Oo.f20318OooO00o.edit();
                                editorEdit.putString(o0000O00.OooO00o(strOooO0o0, str), strOooO00o2);
                                editorEdit.commit();
                            }
                        }
                        if (oooO00o2 == null || !str2.equals(oooO00o2.f20320OooO00o)) {
                            p281o0O0O0oO.OooOO0 oooOO1 = firebaseMessaging.f20233OooO00o;
                            oooOO1.OooO00o();
                            if ("[DEFAULT]".equals(oooOO1.f41950OooO0O0)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                                    oooOO1.OooO00o();
                                    sb.append(oooOO1.f41950OooO0O0);
                                    Log.d("FirebaseMessaging", sb.toString());
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new o000oOoO(firebaseMessaging.f20236OooO0Oo).OooO0OO(intent);
                            }
                        }
                        return Tasks.forResult(str2);
                    }
                }).continueWithTask(o00000o.f20295OooO00o, new Continuation() { // from class: com.google.firebase.messaging.o00000O0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        o00000O o00000o2 = o00000o;
                        String str = strOooO0OO;
                        synchronized (o00000o2) {
                            o00000o2.f20296OooO0O0.remove(str);
                        }
                        return task;
                    }
                });
                o00000o.f20296OooO0O0.put(strOooO0OO, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strOooO0OO);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    @NonNull
    public final void OooO0O0() {
        if (this.f20234OooO0O0 != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f20240OooO0oo.execute(new o0O0o0(2, this, taskCompletionSource));
            taskCompletionSource.getTask();
            return;
        }
        if (OooO0o() == null) {
            Tasks.forResult(null);
            return;
        }
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new o0oOo0O0(1, this, taskCompletionSource2));
        taskCompletionSource2.getTask();
    }

    @Nullable
    @VisibleForTesting
    public final o0000O00.OooO00o OooO0o() {
        o0000O00.OooO00o oooO00oOooO0O0;
        o0000O00 o0000o00OooO0Oo = OooO0Oo(this.f20236OooO0Oo);
        String strOooO0o0 = OooO0o0();
        String strOooO0OO = o0O0O00.OooO0OO(this.f20233OooO00o);
        synchronized (o0000o00OooO0Oo) {
            oooO00oOooO0O0 = o0000O00.OooO00o.OooO0O0(o0000o00OooO0Oo.f20318OooO00o.getString(o0000O00.OooO00o(strOooO0o0, strOooO0OO), null));
        }
        return oooO00oOooO0O0;
    }

    public final String OooO0o0() {
        p281o0O0O0oO.OooOO0 oooOO1 = this.f20233OooO00o;
        oooOO1.OooO00o();
        return "[DEFAULT]".equals(oooOO1.f41950OooO0O0) ? "" : oooOO1.OooO0Oo();
    }

    public final boolean OooO0oO() {
        boolean zBooleanValue;
        OooO00o oooO00o = this.f20239OooO0oO;
        synchronized (oooO00o) {
            oooO00o.OooO00o();
            Boolean bool = oooO00o.f20245OooO0OO;
            zBooleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f20233OooO00o.OooO0oo();
        }
        return zBooleanValue;
    }

    public final synchronized void OooO0oo(boolean z) {
        this.f20242OooOO0O = z;
    }

    public final synchronized void OooOO0(long j) {
        OooO0OO(j, new o0000oo(this, Math.min(Math.max(30L, 2 * j), f20228OooOO0o)));
        this.f20242OooOO0O = true;
    }

    @VisibleForTesting
    public final boolean OooOO0O(@Nullable o0000O00.OooO00o oooO00o) {
        if (oooO00o != null) {
            return (System.currentTimeMillis() > (oooO00o.f20322OooO0OO + o0000O00.OooO00o.f20319OooO0Oo) ? 1 : (System.currentTimeMillis() == (oooO00o.f20322OooO0OO + o0000O00.OooO00o.f20319OooO0Oo) ? 0 : -1)) > 0 || !this.f20241OooOO0.OooO00o().equals(oooO00o.f20321OooO0O0);
        }
        return true;
    }
}
