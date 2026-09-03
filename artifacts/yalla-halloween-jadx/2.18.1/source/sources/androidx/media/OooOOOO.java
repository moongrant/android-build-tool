package androidx.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f8608Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f8609Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f8610Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Bundle f8611Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 f8612OoooO00;

    public OooOOOO(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f8612OoooO00 = oooOOO0;
        this.f8609Oooo0o = oooOOO;
        this.f8610Oooo0oO = str;
        this.f8611Oooo0oo = bundle;
        this.f8608Oooo = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (MediaBrowserServiceCompat.this.f8559Oooo0oO.getOrDefault(((MediaBrowserServiceCompat.OooOOOO) this.f8609Oooo0o).OooO00o(), null) != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            ResultReceiver resultReceiver = this.f8608Oooo;
            Objects.requireNonNull(mediaBrowserServiceCompat);
            resultReceiver.OooO0O0(-1, null);
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("sendCustomAction for callback that isn't registered action=");
        sbOooO0o0.append(this.f8610Oooo0oO);
        sbOooO0o0.append(", extras=");
        sbOooO0o0.append(this.f8611Oooo0oo);
        Log.w("MBServiceCompat", sbOooO0o0.toString());
    }
}
