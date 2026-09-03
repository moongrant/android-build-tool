package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f8585Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 f8586Oooo0oO;

    public OooO0OO(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO) {
        this.f8586Oooo0oO = oooOOO0;
        this.f8585Oooo0o = oooOOO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.OooO0O0 oooO0O0Remove = MediaBrowserServiceCompat.this.f8559Oooo0oO.remove(((MediaBrowserServiceCompat.OooOOOO) this.f8585Oooo0o).OooO00o());
        if (oooO0O0Remove != null) {
            ((MediaBrowserServiceCompat.OooOOOO) oooO0O0Remove.f8563OooO0O0).OooO00o().unlinkToDeath(oooO0O0Remove, 0);
        }
    }
}
