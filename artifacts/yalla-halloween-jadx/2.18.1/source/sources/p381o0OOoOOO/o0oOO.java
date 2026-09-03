package p381o0OOoOOO;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f38822OooO00o = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f38823OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("WakeLockHolder.syncObject")
    public static WakeLock f38824OooO0OO;

    public static void OooO00o(@NonNull Intent intent) {
        synchronized (f38823OooO0O0) {
            if (f38824OooO0OO != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                f38824OooO0OO.release();
            }
        }
    }

    public static ComponentName OooO0O0(@NonNull Context context, @NonNull Intent intent) {
        synchronized (f38823OooO0O0) {
            if (f38824OooO0OO == null) {
                WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f38824OooO0OO = wakeLock;
                wakeLock.setReferenceCounted(true);
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!booleanExtra) {
                f38824OooO0OO.acquire(f38822OooO00o);
            }
            return componentNameStartService;
        }
    }
}
