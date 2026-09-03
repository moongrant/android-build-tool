package p326o0O0ooO;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.WeakHashMap;
import p016OooOoO0.OooOo00;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f36976OooO00o = o0OoOo0.OooO0o0("WakeLocks");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f36977OooO0O0 = new WeakHashMap<>();

    public static PowerManager.WakeLock OooO00o(@NonNull Context context, @NonNull String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strOooO0Oo = OooOo00.OooO0Oo("WorkManager: ", str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strOooO0Oo);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f36977OooO0O0;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strOooO0Oo);
        }
        return wakeLockNewWakeLock;
    }
}
