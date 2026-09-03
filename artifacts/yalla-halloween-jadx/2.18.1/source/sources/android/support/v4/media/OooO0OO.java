package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.OooO0O0;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.media.session.MediaButtonReceiver;
import java.util.Objects;
import p070o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO<T extends OooO0O0> extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f4250OooO00o;

    public OooO0OO(T t) {
        this.f4250OooO00o = t;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        MediaBrowserCompat.OooO0O0.C0027OooO0O0 c0027OooO0O0 = (MediaBrowserCompat.OooO0O0.C0027OooO0O0) this.f4250OooO00o;
        MediaBrowserCompat.OooO0O0.OooO00o oooO00o = MediaBrowserCompat.OooO0O0.this.f4222OooO0O0;
        if (oooO00o != null) {
            MediaBrowserCompat.OooO0OO oooO0OO = (MediaBrowserCompat.OooO0OO) oooO00o;
            Bundle extras = oooO0OO.f4225OooO0O0.getExtras();
            if (extras != null) {
                extras.getInt("extra_service_version", 0);
                IBinder iBinderOooO00o = o0OO00O.OooO00o(extras, "extra_messenger");
                if (iBinderOooO00o != null) {
                    oooO0OO.f4228OooO0o = new MediaBrowserCompat.OooOO0O(iBinderOooO00o, oooO0OO.f4226OooO0OO);
                    Messenger messenger = new Messenger(oooO0OO.f4227OooO0Oo);
                    oooO0OO.f4230OooO0oO = messenger;
                    oooO0OO.f4227OooO0Oo.OooO00o(messenger);
                    try {
                        MediaBrowserCompat.OooOO0O oooOO0O = oooO0OO.f4228OooO0o;
                        Context context = oooO0OO.f4224OooO00o;
                        Messenger messenger2 = oooO0OO.f4230OooO0oO;
                        Objects.requireNonNull(oooOO0O);
                        Bundle bundle = new Bundle();
                        bundle.putString("data_package_name", context.getPackageName());
                        bundle.putBundle("data_root_hints", oooOO0O.f4233OooO0O0);
                        oooOO0O.OooO00o(6, bundle, messenger2);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                android.support.v4.media.session.OooO0O0 oooO0O0OooOOOo = android.support.v4.media.session.OooO0O0.OooO00o.OooOOOo(o0OO00O.OooO00o(extras, "extra_session_binder"));
                if (oooO0O0OooOOOo != null) {
                    oooO0OO.f4231OooO0oo = MediaSessionCompat.Token.OooO00o(oooO0OO.f4225OooO0O0.getSessionToken(), oooO0O0OooOOOo);
                }
            }
        }
        MediaBrowserCompat.OooO0O0.this.OooO00o();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        MediaBrowserCompat.OooO0O0 oooO0O0 = MediaBrowserCompat.OooO0O0.this;
        MediaBrowserCompat.OooO0O0.OooO00o oooO00o = oooO0O0.f4222OooO0O0;
        ((MediaButtonReceiver.OooO00o) oooO0O0).OooO0O0();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        MediaBrowserCompat.OooO0O0.C0027OooO0O0 c0027OooO0O0 = (MediaBrowserCompat.OooO0O0.C0027OooO0O0) this.f4250OooO00o;
        MediaBrowserCompat.OooO0O0.OooO00o oooO00o = MediaBrowserCompat.OooO0O0.this.f4222OooO0O0;
        if (oooO00o != null) {
            MediaBrowserCompat.OooO0OO oooO0OO = (MediaBrowserCompat.OooO0OO) oooO00o;
            oooO0OO.f4228OooO0o = null;
            oooO0OO.f4230OooO0oO = null;
            oooO0OO.f4231OooO0oo = null;
            oooO0OO.f4227OooO0Oo.OooO00o(null);
        }
        ((MediaButtonReceiver.OooO00o) MediaBrowserCompat.OooO0O0.this).OooO0O0();
    }
}
