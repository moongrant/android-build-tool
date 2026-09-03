package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import java.util.concurrent.Callable;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object f20363OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("lock")
    public static o000O0 f20364OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f20365OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O0Oo.OooO f20366OooO0O0 = new o000O0Oo.OooO();

    public o000oOoO(Context context) {
        this.f20365OooO00o = context;
    }

    public static Task<Integer> OooO00o(Context context, final Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (o00000OO.OooO00o().OooO0OO(context)) {
            o000O0 o000o0OooO0O0 = OooO0O0(context);
            synchronized (o000O000.f20352OooO0O0) {
                if (o000O000.f20353OooO0OO == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    o000O000.f20353OooO0OO = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    o000O000.f20353OooO0OO.acquire(o000O000.f20351OooO00o);
                }
                o000o0OooO0O0.OooO0O0(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.o000
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        o000O000.OooO00o(intent);
                    }
                });
            }
        } else {
            OooO0O0(context).OooO0O0(intent);
        }
        return Tasks.forResult(-1);
    }

    public static o000O0 OooO0O0(Context context) {
        o000O0 o000o0;
        synchronized (f20363OooO0OO) {
            if (f20364OooO0Oo == null) {
                f20364OooO0Oo = new o000O0(context);
            }
            o000o0 = f20364OooO0Oo;
        }
        return o000o0;
    }

    @KeepForSdk
    public final Task<Integer> OooO0OO(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean zIsAtLeastO = PlatformVersion.isAtLeastO();
        final Context context = this.f20365OooO00o;
        boolean z = zIsAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & SQLiteDatabase.CREATE_IF_NECESSARY) != 0;
        if (z && !z2) {
            return OooO00o(context, intent);
        }
        Callable callable = new Callable() { // from class: com.google.firebase.messaging.Oooo000
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName componentNameStartService;
                Context context2 = context;
                Intent intent2 = intent;
                o00000OO o00000ooOooO00o = o00000OO.OooO00o();
                o00000ooOooO00o.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                o00000ooOooO00o.f20303OooO0Oo.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (o00000ooOooO00o) {
                    str = o00000ooOooO00o.f20300OooO00o;
                    if (str == null) {
                        ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                        if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        } else if (!context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                        } else {
                            if (str2.startsWith(".")) {
                                o00000ooOooO00o.f20300OooO00o = context2.getPackageName() + serviceInfo.name;
                            } else {
                                o00000ooOooO00o.f20300OooO00o = serviceInfo.name;
                            }
                            str = o00000ooOooO00o.f20300OooO00o;
                        }
                        str = null;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (o00000ooOooO00o.OooO0OO(context2)) {
                        componentNameStartService = o000O000.OooO0O0(context2, intent3);
                    } else {
                        componentNameStartService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = YallaTeamMessage.JumpId.YallaPremium_Knight;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = YallaTeamMessage.JumpId.YallaPremium_Patrician;
                }
                return Integer.valueOf(i);
            }
        };
        o000O0Oo.OooO oooO = this.f20366OooO0O0;
        return Tasks.call(oooO, callable).continueWithTask(oooO, new Continuation() { // from class: com.google.firebase.messaging.Oooo0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? o000oOoO.OooO00o(context, intent).continueWith(new o000O0Oo.OooO(), new androidx.compose.material.OooOOO()) : task;
            }
        });
    }
}
