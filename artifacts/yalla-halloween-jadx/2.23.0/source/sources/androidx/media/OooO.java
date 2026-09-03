package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOOO f6097OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f6098OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f6099OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f6100OooO0oO;

    public OooO(MediaBrowserServiceCompat.OooOOO oooOOO, MediaBrowserServiceCompat.OooOo00 oooOo00, String str, ResultReceiver resultReceiver) {
        this.f6100OooO0oO = oooOOO;
        this.f6097OooO0Oo = oooOo00;
        this.f6099OooO0o0 = str;
        this.f6098OooO0o = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder iBinderOooO00o = ((MediaBrowserServiceCompat.OooOo00) this.f6097OooO0Oo).OooO00o();
        MediaBrowserServiceCompat.OooOOO oooOOO = this.f6100OooO0oO;
        if (MediaBrowserServiceCompat.this.f6072OooO0oO.getOrDefault(iBinderOooO00o, null) == null) {
            Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f6099OooO0o0);
            return;
        }
        MediaBrowserServiceCompat.this.getClass();
        int i = 2 & 2;
        ResultReceiver resultReceiver = this.f6098OooO0o;
        if (i != 0) {
            resultReceiver.OooO0O0(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", null);
        resultReceiver.OooO0O0(0, bundle);
    }
}
