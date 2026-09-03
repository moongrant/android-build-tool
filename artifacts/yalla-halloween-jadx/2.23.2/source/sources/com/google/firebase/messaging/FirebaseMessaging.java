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
import p022Oooo00O.o00OOO00;
import p022Oooo00O.o00OOOO0;
import p045Oooooo.o000O0;
import p045Oooooo.o000O00;
import p233o00oOoOO.o0OoO00O;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final long f19756OooOO0o = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    @SuppressLint({"FirebaseUnknownNullness"})
    @VisibleForTesting
    public static o0OoO00O f19757OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @GuardedBy("FirebaseMessaging.class")
    public static o0000Ooo f19758OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @GuardedBy("FirebaseMessaging.class")
    @VisibleForTesting
    public static ScheduledThreadPoolExecutor f19759OooOOOO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Executor f19760OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p626o0ooO.o0OOO0o f19761OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final o0O0o0.OooO00o f19762OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p302o0O0o0OO.o0000O0O f19763OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f19764OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00000O0 f19765OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00Ooo f19766OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f19767OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Executor f19768OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o0OOO0o f19769OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f19770OooOO0O;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O0o00O.OooO0o f19771OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @GuardedBy("this")
        public boolean f19772OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        @GuardedBy("this")
        public Boolean f19773OooO0OO;

        public OooO00o(o0O0o00O.OooO0o oooO0o) {
            this.f19771OooO00o = oooO0o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [com.google.firebase.messaging.o00O0O] */
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
            if (this.f19772OooO0O0) {
                return;
            }
            Boolean boolOooO0O0 = OooO0O0();
            this.f19773OooO0OO = boolOooO0O0;
            if (boolOooO0O0 == null) {
                this.f19771OooO00o.OooO0O0(new o0O0o00O.OooO0O0() { // from class: com.google.firebase.messaging.o00O0O
                    @Override // o0O0o00O.OooO0O0
                    public final void OooO00o(o0O0o00O.OooO00o oooO00o) {
                        boolean zBooleanValue;
                        FirebaseMessaging.OooO00o oooO00o2 = this.f19896OooO00o;
                        synchronized (oooO00o2) {
                            oooO00o2.OooO00o();
                            Boolean bool = oooO00o2.f19773OooO0OO;
                            zBooleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f19761OooO00o.OooO0oo();
                        }
                        if (zBooleanValue) {
                            o0000Ooo o0000ooo = FirebaseMessaging.f19758OooOOO0;
                            FirebaseMessaging.this.OooO();
                        }
                    }
                });
            }
            this.f19772OooO0O0 = true;
        }

        @Nullable
        public final Boolean OooO0O0() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            p626o0ooO.o0OOO0o o0ooo0o2 = FirebaseMessaging.this.f19761OooO00o;
            o0ooo0o2.OooO00o();
            Context context = o0ooo0o2.f57662OooO00o;
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

    public FirebaseMessaging(p626o0ooO.o0OOO0o o0ooo0o2, @Nullable o0O0o0.OooO00o oooO00o, p301o0O0o0O.OooO0o<p315o0O0oOo.o0000O> oooO0o, p301o0O0o0O.OooO0o<HeartBeatInfo> oooO0o2, p302o0O0o0OO.o0000O0O o0000o0o2, @Nullable o0OoO00O o0ooo00o2, o0O0o00O.OooO0o oooO0o3) {
        o0ooo0o2.OooO00o();
        Context context = o0ooo0o2.f57662OooO00o;
        final o0OOO0o o0ooo0o3 = new o0OOO0o(context);
        final o00Ooo o00ooo2 = new o00Ooo(o0ooo0o2, o0ooo0o3, oooO0o, oooO0o2, o0000o0o2);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        this.f19770OooOO0O = false;
        f19757OooOOO = o0ooo00o2;
        this.f19761OooO00o = o0ooo0o2;
        this.f19762OooO0O0 = oooO00o;
        this.f19763OooO0OO = o0000o0o2;
        this.f19767OooO0oO = new OooO00o(oooO0o3);
        o0ooo0o2.OooO00o();
        final Context context2 = o0ooo0o2.f57662OooO00o;
        this.f19764OooO0Oo = context2;
        Oooo000 oooo000 = new Oooo000();
        this.f19769OooOO0 = o0ooo0o3;
        this.f19766OooO0o0 = o00ooo2;
        this.f19765OooO0o = new o00000O0(executorServiceNewSingleThreadExecutor);
        this.f19768OooO0oo = scheduledThreadPoolExecutor;
        this.f19760OooO = threadPoolExecutor;
        o0ooo0o2.OooO00o();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(oooo000);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (oooO00o != null) {
            oooO00o.OooO0O0();
        }
        int i = 2;
        scheduledThreadPoolExecutor.execute(new o000O00(this, i));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i2 = o0000O0O.f19853OooOO0;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.o0000O0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0000oo o0000ooVar;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                o0OOO0o o0ooo0o4 = o0ooo0o3;
                o00Ooo o00ooo3 = o00ooo2;
                synchronized (o0000oo.class) {
                    WeakReference<o0000oo> weakReference = o0000oo.f19870OooO0Oo;
                    o0000ooVar = weakReference != null ? weakReference.get() : null;
                    if (o0000ooVar == null) {
                        o0000oo o0000ooVar2 = new o0000oo(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledExecutorService);
                        o0000ooVar2.OooO0O0();
                        o0000oo.f19870OooO0Oo = new WeakReference<>(o0000ooVar2);
                        o0000ooVar = o0000ooVar2;
                    }
                }
                return new o0000O0O(firebaseMessaging, o0ooo0o4, o0000ooVar, o00ooo3, context3, scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new o00OOO00(this));
        scheduledThreadPoolExecutor.execute(new o00OOOO0(this, i));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static void OooO0OO(long j, o0000 o0000Var) {
        synchronized (FirebaseMessaging.class) {
            if (f19759OooOOOO == null) {
                f19759OooOOOO = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f19759OooOOOO.schedule(o0000Var, j, TimeUnit.SECONDS);
        }
    }

    @NonNull
    public static synchronized o0000Ooo OooO0Oo(Context context) {
        if (f19758OooOOO0 == null) {
            f19758OooOOO0 = new o0000Ooo(context);
        }
        return f19758OooOOO0;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull p626o0ooO.o0OOO0o o0ooo0o2) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) o0ooo0o2.OooO0O0(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final void OooO() {
        o0O0o0.OooO00o oooO00o = this.f19762OooO0O0;
        if (oooO00o != null) {
            oooO00o.getToken();
        } else if (OooOO0O(OooO0o())) {
            synchronized (this) {
                if (!this.f19770OooOO0O) {
                    OooOO0(0L);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String OooO00o() throws IOException {
        Task taskContinueWithTask;
        o0O0o0.OooO00o oooO00o = this.f19762OooO0O0;
        if (oooO00o != null) {
            try {
                return (String) Tasks.await(oooO00o.OooO0OO());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final o0000Ooo.OooO00o oooO00oOooO0o = OooO0o();
        if (!OooOO0O(oooO00oOooO0o)) {
            return oooO00oOooO0o.f19867OooO00o;
        }
        final String strOooO0OO = o0OOO0o.OooO0OO(this.f19761OooO00o);
        final o00000O0 o00000o1 = this.f19765OooO0o;
        synchronized (o00000o1) {
            taskContinueWithTask = (Task) o00000o1.f19836OooO0O0.getOrDefault(strOooO0OO, null);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strOooO0OO);
                }
                o00Ooo o00ooo2 = this.f19766OooO0o0;
                taskContinueWithTask = o00ooo2.OooO00o(o00ooo2.OooO0OO(new Bundle(), o0OOO0o.OooO0OO(o00ooo2.f19897OooO00o), "*")).onSuccessTask(this.f19760OooO, new SuccessContinuation() { // from class: com.google.firebase.messaging.o0OoOo0
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        FirebaseMessaging firebaseMessaging = this.f19913OooO0Oo;
                        String str = strOooO0OO;
                        o0000Ooo.OooO00o oooO00o2 = oooO00oOooO0o;
                        String str2 = (String) obj;
                        o0000Ooo o0000oooOooO0Oo = FirebaseMessaging.OooO0Oo(firebaseMessaging.f19764OooO0Oo);
                        String strOooO0o0 = firebaseMessaging.OooO0o0();
                        String strOooO00o = firebaseMessaging.f19769OooOO0.OooO00o();
                        synchronized (o0000oooOooO0Oo) {
                            String strOooO00o2 = o0000Ooo.OooO00o.OooO00o(System.currentTimeMillis(), str2, strOooO00o);
                            if (strOooO00o2 != null) {
                                SharedPreferences.Editor editorEdit = o0000oooOooO0Oo.f19865OooO00o.edit();
                                editorEdit.putString(o0000Ooo.OooO00o(strOooO0o0, str), strOooO00o2);
                                editorEdit.commit();
                            }
                        }
                        if (oooO00o2 == null || !str2.equals(oooO00o2.f19867OooO00o)) {
                            p626o0ooO.o0OOO0o o0ooo0o2 = firebaseMessaging.f19761OooO00o;
                            o0ooo0o2.OooO00o();
                            if ("[DEFAULT]".equals(o0ooo0o2.f57663OooO0O0)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                                    o0ooo0o2.OooO00o();
                                    sb.append(o0ooo0o2.f57663OooO0O0);
                                    Log.d("FirebaseMessaging", sb.toString());
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new OooOo(firebaseMessaging.f19764OooO0Oo).OooO0OO(intent);
                            }
                        }
                        return Tasks.forResult(str2);
                    }
                }).continueWithTask(o00000o1.f19835OooO00o, new Continuation() { // from class: com.google.firebase.messaging.o00000
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        o00000O0 o00000o2 = o00000o1;
                        String str = strOooO0OO;
                        synchronized (o00000o2) {
                            o00000o2.f19836OooO0O0.remove(str);
                        }
                        return task;
                    }
                });
                o00000o1.f19836OooO0O0.put(strOooO0OO, taskContinueWithTask);
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
        if (this.f19762OooO0O0 != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f19768OooO0oo.execute(new o000O0(1, this, taskCompletionSource));
            taskCompletionSource.getTask();
            return;
        }
        if (OooO0o() == null) {
            Tasks.forResult(null);
            return;
        }
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new Runnable() { // from class: com.google.firebase.messaging.Oooo0
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = this.f19815OooO0Oo;
                TaskCompletionSource taskCompletionSource3 = taskCompletionSource2;
                o0000Ooo o0000ooo = FirebaseMessaging.f19758OooOOO0;
                firebaseMessaging.getClass();
                try {
                    o00Ooo o00ooo2 = firebaseMessaging.f19766OooO0o0;
                    o00ooo2.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    Tasks.await(o00ooo2.OooO00o(o00ooo2.OooO0OO(bundle, o0OOO0o.OooO0OO(o00ooo2.f19897OooO00o), "*")));
                    o0000Ooo o0000oooOooO0Oo = FirebaseMessaging.OooO0Oo(firebaseMessaging.f19764OooO0Oo);
                    String strOooO0o0 = firebaseMessaging.OooO0o0();
                    String strOooO0OO = o0OOO0o.OooO0OO(firebaseMessaging.f19761OooO00o);
                    synchronized (o0000oooOooO0Oo) {
                        String strOooO00o = o0000Ooo.OooO00o(strOooO0o0, strOooO0OO);
                        SharedPreferences.Editor editorEdit = o0000oooOooO0Oo.f19865OooO00o.edit();
                        editorEdit.remove(strOooO00o);
                        editorEdit.commit();
                    }
                    taskCompletionSource3.setResult(null);
                } catch (Exception e) {
                    taskCompletionSource3.setException(e);
                }
            }
        });
        taskCompletionSource2.getTask();
    }

    @Nullable
    @VisibleForTesting
    public final o0000Ooo.OooO00o OooO0o() {
        o0000Ooo.OooO00o oooO00oOooO0O0;
        o0000Ooo o0000oooOooO0Oo = OooO0Oo(this.f19764OooO0Oo);
        String strOooO0o0 = OooO0o0();
        String strOooO0OO = o0OOO0o.OooO0OO(this.f19761OooO00o);
        synchronized (o0000oooOooO0Oo) {
            oooO00oOooO0O0 = o0000Ooo.OooO00o.OooO0O0(o0000oooOooO0Oo.f19865OooO00o.getString(o0000Ooo.OooO00o(strOooO0o0, strOooO0OO), null));
        }
        return oooO00oOooO0O0;
    }

    public final String OooO0o0() {
        p626o0ooO.o0OOO0o o0ooo0o2 = this.f19761OooO00o;
        o0ooo0o2.OooO00o();
        return "[DEFAULT]".equals(o0ooo0o2.f57663OooO0O0) ? "" : o0ooo0o2.OooO0Oo();
    }

    public final boolean OooO0oO() {
        boolean zBooleanValue;
        OooO00o oooO00o = this.f19767OooO0oO;
        synchronized (oooO00o) {
            oooO00o.OooO00o();
            Boolean bool = oooO00o.f19773OooO0OO;
            zBooleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f19761OooO00o.OooO0oo();
        }
        return zBooleanValue;
    }

    public final synchronized void OooO0oo(boolean z) {
        this.f19770OooOO0O = z;
    }

    public final synchronized void OooOO0(long j) {
        OooO0OO(j, new o0000(this, Math.min(Math.max(30L, 2 * j), f19756OooOO0o)));
        this.f19770OooOO0O = true;
    }

    @VisibleForTesting
    public final boolean OooOO0O(@Nullable o0000Ooo.OooO00o oooO00o) {
        if (oooO00o != null) {
            return (System.currentTimeMillis() > (oooO00o.f19869OooO0OO + o0000Ooo.OooO00o.f19866OooO0Oo) ? 1 : (System.currentTimeMillis() == (oooO00o.f19869OooO0OO + o0000Ooo.OooO00o.f19866OooO0Oo) ? 0 : -1)) > 0 || !this.f19769OooOO0.OooO00o().equals(oooO00o.f19868OooO0O0);
        }
        return true;
    }
}
