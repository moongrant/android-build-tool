package p110o000ooo0;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.BuildCompat;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;
import p102o000oo.OooOO0O;
import p102o000oo.OooOOO0;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f30028OooO0O0 = o0OoOo0.OooO0o0("SystemJobInfoConverter");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ComponentName f30029OooO00o;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f30030OooO00o;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f30030OooO00o = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30030OooO00o[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30030OooO00o[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30030OooO00o[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30030OooO00o[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @VisibleForTesting(otherwise = 3)
    public o0OO00O(@NonNull Context context) {
        this.f30029OooO00o = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (r2 < 26) goto L19;
     */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.HashSet, java.util.Set<o000oo.OooOOO0$OooO00o>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JobInfo OooO00o(o00O0000.o0OoOo0 o0oooo1, int i) {
        OooOO0O oooOO0O = o0oooo1.f30160OooOO0;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", o0oooo1.f30152OooO00o);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", o0oooo1.OooO0OO());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f30029OooO00o).setRequiresCharging(oooOO0O.f29790OooO0O0).setRequiresDeviceIdle(oooOO0O.f29791OooO0OO).setExtras(persistableBundle);
        NetworkType networkType = oooOO0O.f29789OooO00o;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            int i3 = OooO00o.f30030OooO00o[networkType.ordinal()];
            int i4 = 4;
            if (i3 == 1) {
                i4 = 0;
            } else if (i3 == 2) {
                i4 = 1;
            } else if (i3 == 3) {
                i4 = 2;
            } else if (i3 != 4) {
                if (i3 == 5) {
                }
                o0OoOo0.OooO0OO().OooO00o(f30028OooO0O0, String.format("API version too low. Cannot convert network type value %s", networkType), new Throwable[0]);
                i4 = 1;
            } else if (i2 >= 24) {
                i4 = 3;
            } else {
                o0OoOo0.OooO0OO().OooO00o(f30028OooO0O0, String.format("API version too low. Cannot convert network type value %s", networkType), new Throwable[0]);
                i4 = 1;
            }
            extras.setRequiredNetworkType(i4);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!oooOO0O.f29791OooO0OO) {
            extras.setBackoffCriteria(o0oooo1.f30164OooOOO0, o0oooo1.f30162OooOO0o == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(o0oooo1.OooO00o() - System.currentTimeMillis(), 0L);
        if (i2 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!o0oooo1.f30168OooOOo0) {
            extras.setImportantWhileForeground(true);
        }
        if (i2 >= 24 && oooOO0O.OooO00o()) {
            for (OooOOO0.OooO00o oooO00o : oooOO0O.f29796OooO0oo.f29804OooO00o) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(oooO00o.f29805OooO00o, oooO00o.f29806OooO0O0 ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(oooOO0O.f29793OooO0o);
            extras.setTriggerContentMaxDelay(oooOO0O.f29795OooO0oO);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(oooOO0O.f29792OooO0Oo);
            extras.setRequiresStorageNotLow(oooOO0O.f29794OooO0o0);
        }
        boolean z = o0oooo1.f30161OooOO0O > 0;
        boolean z2 = jMax > 0;
        if (BuildCompat.OooO0O0() && o0oooo1.f30168OooOOo0 && !z && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
