package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 f8602Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f8603Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f8604Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f8605Oooo0oo;

    public OooOOO(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f8602Oooo = oooOOO0;
        this.f8603Oooo0o = oooOOO;
        this.f8604Oooo0oO = str;
        this.f8605Oooo0oo = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (MediaBrowserServiceCompat.this.f8559Oooo0oO.getOrDefault(((MediaBrowserServiceCompat.OooOOOO) this.f8603Oooo0o).OooO00o(), null) == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("search for callback that isn't registered query=");
            sbOooO0o0.append(this.f8604Oooo0oO);
            Log.w("MBServiceCompat", sbOooO0o0.toString());
        } else {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            ResultReceiver resultReceiver = this.f8605Oooo0oo;
            Objects.requireNonNull(mediaBrowserServiceCompat);
            resultReceiver.OooO0O0(-1, null);
        }
    }
}
