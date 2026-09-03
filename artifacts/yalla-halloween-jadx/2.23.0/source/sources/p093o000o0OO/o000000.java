package p093o000o0OO;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.WeakHashMap;
import p022Oooo00O.o00O00OO;
import p084o000Ooo0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f35309OooO00o = o000oOoO.OooO0o0("WakeLocks");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f35310OooO0O0 = new WeakHashMap<>();

    public static PowerManager.WakeLock OooO00o(@NonNull Context context, @NonNull String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strOooO00o = o00O00OO.OooO00o("WorkManager: ", str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strOooO00o);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f35310OooO0O0;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strOooO00o);
        }
        return wakeLockNewWakeLock;
    }
}
