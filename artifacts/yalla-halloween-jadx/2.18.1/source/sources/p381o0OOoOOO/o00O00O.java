package p381o0OOoOOO;

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
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.OooO0OO;
import java.util.Objects;
import java.util.concurrent.Callable;
import net.sqlcipher.database.SQLiteDatabase;
import oo0OOoo.OooO00o;
import p088o000o00.OooOO0;
import p192o00o0O0.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class o00O00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f38753OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("lock")
    public static OooO0OO f38754OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38755OooO00o;

    public o00O00O(Context context) {
        this.f38755OooO00o = context;
    }

    public static Task<Integer> OooO00o(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if (o00OO.OooO00o().OooO0OO(context)) {
            OooO0OO oooO0OOOooO0O0 = OooO0O0(context);
            synchronized (o0oOO.f38823OooO0O0) {
                if (o0oOO.f38824OooO0OO == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    o0oOO.f38824OooO0OO = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    o0oOO.f38824OooO0OO.acquire(o0oOO.f38822OooO00o);
                }
                oooO0OOOooO0O0.OooO0OO(intent).addOnCompleteListener(OooOO0.f28598Oooo0o, new o0OOO0o(intent));
            }
        } else {
            OooO0O0(context).OooO0OO(intent);
        }
        return Tasks.forResult(-1);
    }

    public static OooO0OO OooO0O0(Context context) {
        OooO0OO oooO0OO;
        synchronized (f38753OooO0O0) {
            if (f38754OooO0OO == null) {
                f38754OooO0OO = new OooO0OO(context);
            }
            oooO0OO = f38754OooO0OO;
        }
        return oooO0OO;
    }

    @KeepForSdk
    public final Task<Integer> OooO0OO(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.f38755OooO00o;
        boolean z = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & SQLiteDatabase.CREATE_IF_NECESSARY) != 0;
        if (z && !z2) {
            return OooO00o(context, intent);
        }
        OooOO0 oooOO1 = OooOO0.f28598Oooo0o;
        return Tasks.call(oooOO1, new Callable() { // from class: o0OOoOOO.o00O00
            /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayDeque, java.util.Queue<android.content.Intent>] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i;
                ComponentName componentNameStartService;
                Context context2 = context;
                Intent intent2 = intent;
                o00OO o00ooOooO00o = o00OO.OooO00o();
                Objects.requireNonNull(o00ooOooO00o);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                o00ooOooO00o.f38772OooO0Oo.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (o00ooOooO00o) {
                    str = o00ooOooO00o.f38769OooO00o;
                    if (str == null) {
                        ResolveInfo resolveInfoResolveService = context2.getPackageManager().resolveService(intent3, 0);
                        if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                        } else if (!context2.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                        } else {
                            if (str2.startsWith(".")) {
                                o00ooOooO00o.f38769OooO00o = context2.getPackageName() + serviceInfo.name;
                            } else {
                                o00ooOooO00o.f38769OooO00o = serviceInfo.name;
                            }
                            str = o00ooOooO00o.f38769OooO00o;
                        }
                        str = null;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + str);
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (o00ooOooO00o.OooO0OO(context2)) {
                        componentNameStartService = o0oOO.OooO0O0(context2, intent3);
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
                    i = 402;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            }
        }).continueWithTask(oooOO1, new Continuation() { // from class: o0OOoOOO.o00O000o
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? o00O00O.OooO00o(context, intent).continueWith(OooOO0.f28598Oooo0o, OooO00o.f53341OooO0Oo) : task;
            }
        });
    }
}
