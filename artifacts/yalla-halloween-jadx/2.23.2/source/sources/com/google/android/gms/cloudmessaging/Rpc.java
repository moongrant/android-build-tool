package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.compiler.plugins.kotlin.OooO0O0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p190o00o0O.OooOo;
import p253o00ooO0O.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public class Rpc {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static PendingIntent f14097OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static int f14098OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final zzz f14099OooOO0 = zzz.zza;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Pattern f14100OooOO0O = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f14102OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final zzt f14103OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f14104OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Messenger f14105OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public zzd f14107OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("responseCallbacks")
    public final OooOo<String, TaskCompletionSource<Bundle>> f14101OooO00o = new OooOo<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Messenger f14106OooO0o0 = new Messenger(new o0000oo(this, Looper.getMainLooper()));

    public Rpc(@NonNull Context context) {
        this.f14102OooO0O0 = context;
        this.f14103OooO0OO = new zzt(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14104OooO0Oo = scheduledThreadPoolExecutor;
    }

    public static synchronized String OooO0O0() {
        int i;
        i = f14098OooO0oo;
        f14098OooO0oo = i + 1;
        return Integer.toString(i);
    }

    public static synchronized void OooO0OO(Context context, Intent intent) {
        if (f14097OooO == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            f14097OooO = com.google.android.gms.internal.cloudmessaging.zza.zza(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
        }
        intent.putExtra("app", f14097OooO);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    @AnyThread
    public final Task<Bundle> OooO00o(Bundle bundle) {
        final String strOooO0O0 = OooO0O0();
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f14101OooO00o) {
            this.f14101OooO00o.put(strOooO0O0, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f14103OooO0OO.zzb() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        OooO0OO(this.f14102OooO0O0, intent);
        intent.putExtra("kid", OooO0O0.OooO00o(new StringBuilder(String.valueOf(strOooO0O0).length() + 5), "|ID|", strOooO0O0, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
            sb.append("Sending ");
            sb.append(strValueOf);
            Log.d("Rpc", sb.toString());
        }
        intent.putExtra("google.messenger", this.f14106OooO0o0);
        if (this.f14105OooO0o != null || this.f14107OooO0oO != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f14105OooO0o;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f14107OooO0oO.zzb(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f14103OooO0OO.zzb() == 2) {
                    this.f14102OooO0O0.sendBroadcast(intent);
                } else {
                    this.f14102OooO0O0.startService(intent);
                }
            }
        } else if (this.f14103OooO0OO.zzb() == 2) {
            this.f14102OooO0O0.sendBroadcast(intent);
        } else {
            this.f14102OooO0O0.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f14104OooO0Oo.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzy
            @Override // java.lang.Runnable
            public final void run() {
                if (taskCompletionSource.trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(f14099OooOO0, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzw
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzd(strOooO0O0, scheduledFutureSchedule, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    public final void OooO0Oo(@Nullable Bundle bundle, String str) {
        synchronized (this.f14101OooO00o) {
            TaskCompletionSource<Bundle> taskCompletionSourceRemove = this.f14101OooO00o.remove(str);
            if (taskCompletionSourceRemove != null) {
                taskCompletionSourceRemove.setResult(bundle);
            } else {
                String strValueOf = String.valueOf(str);
                Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
            }
        }
    }

    @NonNull
    public Task<Bundle> send(@NonNull final Bundle bundle) {
        zzt zztVar = this.f14103OooO0OO;
        int iZza = zztVar.zza();
        zzz zzzVar = f14099OooOO0;
        if (iZza < 12000000) {
            return zztVar.zzb() != 0 ? OooO00o(bundle).continueWithTask(zzzVar, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzu
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return this.zza.zzb(bundle, task);
                }
            }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return zzs.zzb(this.f14102OooO0O0).zzd(1, bundle).continueWith(zzzVar, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzv
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) throws IOException {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String strValueOf = String.valueOf(task.getException());
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
                    sb.append("Error making request: ");
                    sb.append(strValueOf);
                    Log.d("Rpc", sb.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    @NonNull
    public final Task zzb(@NonNull Bundle bundle, @NonNull Task task) throws Exception {
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return !(bundle2 != null && bundle2.containsKey("google.messenger")) ? task : OooO00o(bundle).onSuccessTask(f14099OooOO0, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Bundle bundle3 = (Bundle) obj;
                int i = Rpc.f14098OooO0oo;
                return bundle3 != null && bundle3.containsKey("google.messenger") ? Tasks.forResult(null) : Tasks.forResult(bundle3);
            }
        });
    }

    public final /* synthetic */ void zzd(@NonNull String str, @NonNull ScheduledFuture scheduledFuture, @NonNull Task task) {
        synchronized (this.f14101OooO00o) {
            this.f14101OooO00o.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
