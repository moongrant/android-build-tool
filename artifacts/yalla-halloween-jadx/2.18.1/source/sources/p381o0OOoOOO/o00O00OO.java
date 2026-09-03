package p381o0OOoOOO;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p351o0OOOOo.OooOOO;
import p356o0OOOo00.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00OO implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Set<Intent> f38756Oooo0o = Collections.newSetFromMap(new WeakHashMap());

    public final void OooO00o(Intent intent) {
        Bundle bundle;
        try {
            Bundle extras = intent.getExtras();
            bundle = extras != null ? extras.getBundle("gcm.n.analytics_data") : null;
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    OooO0O0 oooO0O0 = (OooO0O0) OooOOO.OooO0OO().OooO0O0(OooO0O0.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (oooO0O0 != null) {
                        String string = bundle.getString("google.c.a.c_id");
                        oooO0O0.OooO00o(string);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string);
                        oooO0O0.OooO0OO(AppMeasurement.FCM_ORIGIN, "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            o00O0OOO.OooO00o("_no", bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent == null || !this.f38756Oooo0o.add(intent)) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o0OOoOOO.oOO00O
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38825Oooo0o.OooO00o(intent);
                }
            });
        } else {
            OooO00o(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f38756Oooo0o.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
