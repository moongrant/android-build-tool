package androidx.media;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f8606Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 f8607Oooo0oO;

    public OooOOO0(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO) {
        this.f8607Oooo0oO = oooOOO0;
        this.f8606Oooo0o = oooOOO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder iBinderOooO00o = ((MediaBrowserServiceCompat.OooOOOO) this.f8606Oooo0o).OooO00o();
        MediaBrowserServiceCompat.OooO0O0 oooO0O0Remove = MediaBrowserServiceCompat.this.f8559Oooo0oO.remove(iBinderOooO00o);
        if (oooO0O0Remove != null) {
            iBinderOooO00o.unlinkToDeath(oooO0O0Remove, 0);
        }
    }
}
