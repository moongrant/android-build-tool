package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOOO f6133OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f6134OooO0o0;

    public OooO0O0(MediaBrowserServiceCompat.OooOOO oooOOO, MediaBrowserServiceCompat.OooOo00 oooOo00) {
        this.f6134OooO0o0 = oooOOO;
        this.f6133OooO0Oo = oooOo00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.OooO0O0 oooO0O0Remove = MediaBrowserServiceCompat.this.f6099OooO0oO.remove(((MediaBrowserServiceCompat.OooOo00) this.f6133OooO0Oo).OooO00o());
        if (oooO0O0Remove != null) {
            ((MediaBrowserServiceCompat.OooOo00) oooO0O0Remove.f6108OooO0Oo).OooO00o().unlinkToDeath(oooO0O0Remove, 0);
        }
    }
}
