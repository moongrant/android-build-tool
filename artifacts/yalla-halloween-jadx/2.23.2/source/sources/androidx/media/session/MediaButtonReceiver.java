package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.content.ContextCompat;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    public static class OooO00o extends MediaBrowserCompat.OooO0OO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Context f6171OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Intent f6172OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public MediaBrowserCompat f6173OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f6174OooO0o0;

        public OooO00o(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f6171OooO0OO = context;
            this.f6172OooO0Oo = intent;
            this.f6174OooO0o0 = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.OooO0OO
        public final void OooO00o() {
            MediaBrowserCompat.OooO oooO = this.f6173OooO0o.f2057OooO00o;
            if (oooO.f2072OooO0oo == null) {
                MediaSession.Token sessionToken = oooO.f2066OooO0O0.getSessionToken();
                oooO.f2072OooO0oo = sessionToken != null ? new MediaSessionCompat.Token(sessionToken, null, null) : null;
            }
            MediaSessionCompat.Token token = oooO.f2072OooO0oo;
            new ConcurrentHashMap();
            if (token == null) {
                throw new IllegalArgumentException("sessionToken must not be null");
            }
            MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = new MediaControllerCompat.MediaControllerImplApi21(this.f6171OooO0OO, token);
            KeyEvent keyEvent = (KeyEvent) this.f6172OooO0Oo.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null) {
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
            mediaControllerImplApi21.f2093OooO00o.dispatchMediaButtonEvent(keyEvent);
            this.f6173OooO0o.OooO00o();
            this.f6174OooO0o0.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.OooO0OO
        public final void OooO0O0() {
            this.f6173OooO0o.OooO00o();
            this.f6174OooO0o0.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.OooO0OO
        public final void OooO0OO() {
            this.f6173OooO0o.OooO00o();
            this.f6174OooO0o0.finish();
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
        StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("Expected 1 service that handles ", str, ", found ");
        sbOooO0O0.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbOooO0O0.toString());
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
            ContextCompat.OooO0Oo(context, intent);
            return;
        }
        ComponentName componentNameOooO00o2 = OooO00o(context, "android.media.browse.MediaBrowserService");
        if (componentNameOooO00o2 == null) {
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        Context applicationContext = context.getApplicationContext();
        OooO00o oooO00o = new OooO00o(applicationContext, intent, pendingResultGoAsync);
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameOooO00o2, oooO00o);
        oooO00o.f6173OooO0o = mediaBrowserCompat;
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        mediaBrowserCompat.f2057OooO00o.f2066OooO0O0.connect();
    }
}
