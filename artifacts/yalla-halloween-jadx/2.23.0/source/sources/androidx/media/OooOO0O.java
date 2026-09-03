package androidx.media;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOOO f6122OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f6123OooO0o0;

    public OooOO0O(MediaBrowserServiceCompat.OooOOO oooOOO, MediaBrowserServiceCompat.OooOo00 oooOo00) {
        this.f6123OooO0o0 = oooOOO;
        this.f6122OooO0Oo = oooOo00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder iBinderOooO00o = ((MediaBrowserServiceCompat.OooOo00) this.f6122OooO0Oo).OooO00o();
        MediaBrowserServiceCompat.OooO0O0 oooO0O0Remove = MediaBrowserServiceCompat.this.f6072OooO0oO.remove(iBinderOooO00o);
        if (oooO0O0Remove != null) {
            iBinderOooO00o.unlinkToDeath(oooO0O0Remove, 0);
        }
    }
}
