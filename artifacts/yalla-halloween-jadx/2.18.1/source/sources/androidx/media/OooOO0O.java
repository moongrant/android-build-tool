package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f8596Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f8597Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f8598Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f8599Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 f8600OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Bundle f8601OoooO00;

    public OooOO0O(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, int i, int i2, Bundle bundle) {
        this.f8600OoooO0 = oooOOO0;
        this.f8597Oooo0o = oooOOO;
        this.f8598Oooo0oO = str;
        this.f8599Oooo0oo = i;
        this.f8596Oooo = i2;
        this.f8601OoooO00 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder iBinderOooO00o = ((MediaBrowserServiceCompat.OooOOOO) this.f8597Oooo0o).OooO00o();
        MediaBrowserServiceCompat.this.f8559Oooo0oO.remove(iBinderOooO00o);
        MediaBrowserServiceCompat.OooO0O0 oooO0O0 = MediaBrowserServiceCompat.this.new OooO0O0(this.f8598Oooo0oO, this.f8599Oooo0oo, this.f8596Oooo, this.f8597Oooo0o);
        MediaBrowserServiceCompat.this.f8559Oooo0oO.put(iBinderOooO00o, oooO0O0);
        try {
            iBinderOooO00o.linkToDeath(oooO0O0, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
