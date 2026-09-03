package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 f8592Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f8593Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f8594Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f8595Oooo0oo;

    public OooOO0(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, ResultReceiver resultReceiver) {
        this.f8592Oooo = oooOOO0;
        this.f8593Oooo0o = oooOOO;
        this.f8594Oooo0oO = str;
        this.f8595Oooo0oo = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (MediaBrowserServiceCompat.this.f8559Oooo0oO.getOrDefault(((MediaBrowserServiceCompat.OooOOOO) this.f8593Oooo0o).OooO00o(), null) == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("getMediaItem for callback that isn't registered id=");
            sbOooO0o0.append(this.f8594Oooo0oO);
            Log.w("MBServiceCompat", sbOooO0o0.toString());
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        ResultReceiver resultReceiver = this.f8595Oooo0oo;
        Objects.requireNonNull(mediaBrowserServiceCompat);
        if ((2 & 2) != 0) {
            resultReceiver.OooO0O0(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", null);
        resultReceiver.OooO0O0(0, bundle);
    }
}
