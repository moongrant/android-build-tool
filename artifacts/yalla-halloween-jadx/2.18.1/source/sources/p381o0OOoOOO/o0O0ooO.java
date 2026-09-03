package p381o0OOoOOO;

import OooO00o.OooO00o;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.o00Ooo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p070o0000ooO.o00000;
import p070o0000ooO.o000000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ExecutorService f38817OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f38818OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00O f38819OooO0OO;

    public o0O0ooO(Context context, o00O o00o2, ExecutorService executorService) {
        this.f38817OooO00o = executorService;
        this.f38818OooO0O0 = context;
        this.f38819OooO0OO = o00o2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[EDGE_INSN: B:21:0x0059->B:22:0x005a BREAK  A[LOOP:0: B:14:0x0041->B:52:?]] */
    public final boolean OooO00o() {
        boolean z;
        if (this.f38819OooO0OO.OooO00o("gcm.n.noui")) {
            return true;
        }
        if (!((KeyguardManager) this.f38818OooO0O0.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10L);
            }
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f38818OooO0O0.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                z = false;
                break;
            }
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (it.hasNext()) {
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        if (next.importance == 100) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                break;
            }
        }
        z = false;
        break;
        if (z) {
            return false;
        }
        String strOooO0o0 = this.f38819OooO0OO.OooO0o0("gcm.n.image");
        o00O0OO o00o0oo2 = null;
        if (!TextUtils.isEmpty(strOooO0o0)) {
            try {
                o00o0oo2 = new o00O0OO(new URL(strOooO0o0));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strOooO0o0);
            }
        }
        if (o00o0oo2 != null) {
            ExecutorService executorService = this.f38817OooO00o;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            o00o0oo2.f38765Oooo0oO = executorService.submit(new o00Ooo(o00o0oo2, taskCompletionSource, 1));
            o00o0oo2.f38766Oooo0oo = taskCompletionSource.getTask();
        }
        o00.OooO00o OooO00o2 = o00.OooO00o(this.f38818OooO0O0, this.f38819OooO0OO);
        o00000 o00000Var = OooO00o2.f38717OooO00o;
        if (o00o0oo2 != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await((Task) Preconditions.checkNotNull(o00o0oo2.f38766Oooo0oo), 5L, TimeUnit.SECONDS);
                o00000Var.OooO0Oo(bitmap);
                o000000 o000000Var = new o000000();
                o000000Var.f27972OooO0O0 = bitmap;
                o000000Var.OooO0Oo();
                o00000Var.OooO0o0(o000000Var);
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                o00o0oo2.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed to download image: ");
                sbOooO0o0.append(e.getCause());
                Log.w("FirebaseMessaging", sbOooO0o0.toString());
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                o00o0oo2.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f38818OooO0O0.getSystemService("notification")).notify(OooO00o2.f38718OooO0O0, 0, OooO00o2.f38717OooO00o.OooO00o());
        return true;
    }
}
