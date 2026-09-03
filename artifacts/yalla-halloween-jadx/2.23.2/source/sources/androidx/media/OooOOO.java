package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOOO f6151OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Bundle f6152OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f6153OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f6154OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f6155OooO0oo;

    public OooOOO(MediaBrowserServiceCompat.OooOOO oooOOO, MediaBrowserServiceCompat.OooOo00 oooOo00, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f6155OooO0oo = oooOOO;
        this.f6151OooO0Oo = oooOo00;
        this.f6153OooO0o0 = str;
        this.f6152OooO0o = bundle;
        this.f6154OooO0oO = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder iBinderOooO00o = ((MediaBrowserServiceCompat.OooOo00) this.f6151OooO0Oo).OooO00o();
        MediaBrowserServiceCompat.OooOOO oooOOO = this.f6155OooO0oo;
        if (MediaBrowserServiceCompat.this.f6099OooO0oO.getOrDefault(iBinderOooO00o, null) != null) {
            MediaBrowserServiceCompat.this.getClass();
            this.f6154OooO0oO.OooO0O0(-1, null);
            return;
        }
        Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f6153OooO0o0 + ", extras=" + this.f6152OooO0o);
    }
}
