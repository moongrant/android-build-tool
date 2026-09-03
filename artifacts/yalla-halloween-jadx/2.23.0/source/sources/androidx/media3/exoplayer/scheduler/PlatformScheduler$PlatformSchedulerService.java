package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PersistableBundle;
import android.os.PowerManager;
import android.support.v4.media.OooO00o;
import androidx.media3.common.util.Log;
import com.facebook.internal.AnalyticsEvents;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        int i;
        boolean zIsDeviceIdleMode;
        int intExtra;
        boolean z;
        PersistableBundle extras = jobParameters.getExtras();
        int i2 = new Requirements(extras.getInt("requirements")).f6286OooO0Oo;
        if ((i2 & 1) != 0) {
            Object systemService = getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                i = i2 & 3;
            } else {
                if (OooO0o.f34423OooO00o >= 24) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null) {
                        try {
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                                z = true;
                            }
                        } catch (SecurityException unused) {
                        }
                    }
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (((i2 & 2) != 0) && connectivityManager.isActiveNetworkMetered()) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                } else {
                    i = i2 & 3;
                }
            }
        } else {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            Intent intentRegisterReceiver = registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (!(intentRegisterReceiver != null && ((intExtra = intentRegisterReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1)) == 2 || intExtra == 5))) {
                i |= 8;
            }
        }
        if ((i2 & 4) != 0) {
            Object systemService2 = getSystemService("power");
            systemService2.getClass();
            PowerManager powerManager = (PowerManager) systemService2;
            int i3 = OooO0o.f34423OooO00o;
            if (i3 >= 23) {
                zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
            } else {
                zIsDeviceIdleMode = i3 < 20 ? !powerManager.isScreenOn() : !powerManager.isInteractive();
            }
            if (!zIsDeviceIdleMode) {
                i |= 4;
            }
        }
        if ((i2 & 16) != 0) {
            if (!(registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null)) {
                i |= 16;
            }
        }
        if (i == 0) {
            String string = extras.getString("service_action");
            string.getClass();
            String string2 = extras.getString("service_package");
            string2.getClass();
            Intent intent = new Intent(string).setPackage(string2);
            if (OooO0o.f34423OooO00o >= 26) {
                startForegroundService(intent);
            } else {
                startService(intent);
            }
        } else {
            String strOooO00o = OooO00o.OooO00o("Requirements not met: ", i);
            synchronized (Log.f6261OooO00o) {
                android.util.Log.w("PlatformScheduler", strOooO00o);
            }
            jobFinished(jobParameters, true);
        }
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
