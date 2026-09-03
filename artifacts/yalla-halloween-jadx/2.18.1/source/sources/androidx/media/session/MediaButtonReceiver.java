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
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.OooO;
import android.support.v4.media.session.OooO0o;
import android.util.Log;
import android.view.KeyEvent;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    public static class OooO00o extends MediaBrowserCompat.OooO0O0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Context f8618OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Intent f8619OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public MediaBrowserCompat f8620OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f8621OooO0o0;

        public OooO00o(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f8618OooO0OO = context;
            this.f8619OooO0Oo = intent;
            this.f8621OooO0o0 = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.OooO0O0
        public final void OooO00o() {
            MediaControllerCompat$MediaControllerImplApi21 oooO0o;
            try {
                Context context = this.f8618OooO0OO;
                MediaBrowserCompat.OooO0OO oooO0OO = this.f8620OooO0o.f4216OooO00o;
                if (oooO0OO.f4231OooO0oo == null) {
                    oooO0OO.f4231OooO0oo = MediaSessionCompat.Token.OooO00o(oooO0OO.f4225OooO0O0.getSessionToken(), null);
                }
                MediaSessionCompat.Token token = oooO0OO.f4231OooO0oo;
                new HashSet();
                if (token == null) {
                    throw new IllegalArgumentException("sessionToken must not be null");
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    oooO0o = new OooO(context, token);
                } else {
                    oooO0o = i >= 23 ? new OooO0o(context, token) : new MediaControllerCompat$MediaControllerImplApi21(context, token);
                }
                KeyEvent keyEvent = (KeyEvent) this.f8619OooO0Oo.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent == null) {
                    throw new IllegalArgumentException("KeyEvent may not be null");
                }
                oooO0o.f4253OooO00o.dispatchMediaButtonEvent(keyEvent);
                OooO0O0();
            } catch (RemoteException e) {
                Log.e("MediaButtonReceiver", "Failed to create a media controller", e);
            }
        }

        public final void OooO0O0() {
            Messenger messenger;
            MediaBrowserCompat.OooO0OO oooO0OO = this.f8620OooO0o.f4216OooO00o;
            MediaBrowserCompat.OooOO0O oooOO0O = oooO0OO.f4228OooO0o;
            if (oooOO0O != null && (messenger = oooO0OO.f4230OooO0oO) != null) {
                try {
                    oooOO0O.OooO00o(7, null, messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            oooO0OO.f4225OooO0O0.disconnect();
            this.f8621OooO0o0.finish();
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
        StringBuilder sbOooO0OO = OooO0o.OooO0o.OooO0OO("Expected 1 service that handles ", str, ", found ");
        sbOooO0OO.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbOooO0OO.toString());
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
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
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
        oooO00o.f8620OooO0o = mediaBrowserCompat;
        mediaBrowserCompat.f4216OooO00o.f4225OooO0O0.connect();
    }
}
