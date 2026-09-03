package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat.OooO0O0;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOOO f6128OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f6129OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f6130OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f6131OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f6132OooO0oo;

    public OooO00o(int i, int i2, Bundle bundle, MediaBrowserServiceCompat.OooOOO oooOOO, MediaBrowserServiceCompat.OooOo00 oooOo00, String str) {
        this.f6132OooO0oo = oooOOO;
        this.f6128OooO0Oo = oooOo00;
        this.f6130OooO0o0 = str;
        this.f6129OooO0o = i;
        this.f6131OooO0oO = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.OooOOOO oooOOOO = this.f6128OooO0Oo;
        IBinder iBinderOooO00o = ((MediaBrowserServiceCompat.OooOo00) oooOOOO).OooO00o();
        MediaBrowserServiceCompat.OooOOO oooOOO = this.f6132OooO0oo;
        MediaBrowserServiceCompat.this.f6099OooO0oO.remove(iBinderOooO00o);
        MediaBrowserServiceCompat.OooO0O0 oooO0O0 = MediaBrowserServiceCompat.this.new OooO0O0(this.f6130OooO0o0, this.f6129OooO0o, this.f6131OooO0oO, this.f6128OooO0Oo);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        mediaBrowserServiceCompat.getClass();
        oooO0O0.f6109OooO0o = mediaBrowserServiceCompat.OooO00o();
        mediaBrowserServiceCompat.getClass();
        MediaBrowserServiceCompat.OooO00o oooO00o = oooO0O0.f6109OooO0o;
        String str = this.f6130OooO0o0;
        if (oooO00o != null) {
            try {
                mediaBrowserServiceCompat.f6099OooO0oO.put(iBinderOooO00o, oooO0O0);
                iBinderOooO00o.linkToDeath(oooO0O0, 0);
                mediaBrowserServiceCompat.getClass();
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + str);
                mediaBrowserServiceCompat.f6099OooO0oO.remove(iBinderOooO00o);
                return;
            }
        }
        StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("No root for client ", str, " from service ");
        sbOooO0O0.append(OooO00o.class.getName());
        Log.i("MBServiceCompat", sbOooO0O0.toString());
        try {
            MediaBrowserServiceCompat.OooOo00 oooOo00 = (MediaBrowserServiceCompat.OooOo00) oooOOOO;
            oooOo00.getClass();
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.arg1 = 2;
            messageObtain.setData(null);
            oooOo00.f6123OooO00o.send(messageObtain);
        } catch (RemoteException unused2) {
            Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + str);
        }
    }
}
