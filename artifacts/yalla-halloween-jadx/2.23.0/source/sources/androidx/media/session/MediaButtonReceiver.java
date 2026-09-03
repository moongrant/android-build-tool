package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.util.List;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    public static class OooO00o extends MediaBrowserCompat.OooO0OO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Context f6133OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Intent f6134OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public MediaBrowserCompat f6135OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f6136OooO0o0;

        public OooO00o(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f6133OooO0OO = context;
            this.f6134OooO0Oo = intent;
            this.f6136OooO0o0 = pendingResult;
        }

        public final void OooO00o() {
            Messenger messenger;
            MediaBrowserCompat.OooO oooO = this.f6135OooO0o.f2067OooO00o;
            MediaBrowserCompat.OooOOO0 oooOOO0 = oooO.f2079OooO0o;
            if (oooOOO0 != null && (messenger = oooO.f2081OooO0oO) != null) {
                try {
                    oooOOO0.OooO00o(7, null, messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            oooO.f2076OooO0O0.disconnect();
            this.f6136OooO0o0.finish();
        }
    }

    public static ComponentName OooO00o(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbOooO00o = o0OoOo0.OooO00o("Expected 1 service that handles ", str, ", found ");
        sbOooO00o.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbOooO00o.toString());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameOooO00o = OooO00o(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameOooO00o != null) {
            intent.setComponent(componentNameOooO00o);
            Object obj = ContextCompat.f5271OooO00o;
            if (Build.VERSION.SDK_INT >= 26) {
                ContextCompat.OooOO0.OooO0O0(context, intent);
                return;
            } else {
                context.startService(intent);
                return;
            }
        }
        ComponentName componentNameOooO00o2 = OooO00o(context, "android.media.browse.MediaBrowserService");
        if (componentNameOooO00o2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        OooO00o oooO00o = new OooO00o(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameOooO00o2, oooO00o);
        oooO00o.f6135OooO0o = mediaBrowserCompat;
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        mediaBrowserCompat.f2067OooO00o.f2076OooO0O0.connect();
    }
}
