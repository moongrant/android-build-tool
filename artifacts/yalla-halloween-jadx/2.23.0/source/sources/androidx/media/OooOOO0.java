package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOOO f6129OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f6130OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f6131OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f6132OooO0oO;

    public OooOOO0(MediaBrowserServiceCompat.OooOOO oooOOO, MediaBrowserServiceCompat.OooOo00 oooOo00, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f6132OooO0oO = oooOOO;
        this.f6129OooO0Oo = oooOo00;
        this.f6131OooO0o0 = str;
        this.f6130OooO0o = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder iBinderOooO00o = ((MediaBrowserServiceCompat.OooOo00) this.f6129OooO0Oo).OooO00o();
        MediaBrowserServiceCompat.OooOOO oooOOO = this.f6132OooO0oO;
        if (MediaBrowserServiceCompat.this.f6072OooO0oO.getOrDefault(iBinderOooO00o, null) != null) {
            MediaBrowserServiceCompat.this.getClass();
            this.f6130OooO0o.OooO0O0(-1, null);
        } else {
            Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f6131OooO0o0);
        }
    }
}
