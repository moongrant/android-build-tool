package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat.OooO0O0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOOO f6144OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f6145OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f6146OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f6147OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f6148OooO0oo;

    public OooOO0(int i, int i2, Bundle bundle, MediaBrowserServiceCompat.OooOOO oooOOO, MediaBrowserServiceCompat.OooOo00 oooOo00, String str) {
        this.f6148OooO0oo = oooOOO;
        this.f6144OooO0Oo = oooOo00;
        this.f6146OooO0o0 = i;
        this.f6145OooO0o = str;
        this.f6147OooO0oO = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.OooO0O0 oooO0O0;
        IBinder iBinderOooO00o = ((MediaBrowserServiceCompat.OooOo00) this.f6144OooO0Oo).OooO00o();
        MediaBrowserServiceCompat.OooOOO oooOOO = this.f6148OooO0oo;
        MediaBrowserServiceCompat.this.f6099OooO0oO.remove(iBinderOooO00o);
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        Iterator<MediaBrowserServiceCompat.OooO0O0> it = mediaBrowserServiceCompat.f6097OooO0o.iterator();
        while (true) {
            oooO0O0 = null;
            if (!it.hasNext()) {
                break;
            }
            MediaBrowserServiceCompat.OooO0O0 next = it.next();
            if (next.f6107OooO0OO == this.f6146OooO0o0) {
                oooO0O0 = (TextUtils.isEmpty(this.f6145OooO0o) || this.f6147OooO0oO <= 0) ? MediaBrowserServiceCompat.this.new OooO0O0(next.f6105OooO00o, next.f6106OooO0O0, next.f6107OooO0OO, this.f6144OooO0Oo) : null;
                it.remove();
                break;
            }
        }
        if (oooO0O0 == null) {
            oooO0O0 = MediaBrowserServiceCompat.this.new OooO0O0(this.f6145OooO0o, this.f6147OooO0oO, this.f6146OooO0o0, this.f6144OooO0Oo);
        }
        mediaBrowserServiceCompat.f6099OooO0oO.put(iBinderOooO00o, oooO0O0);
        try {
            iBinderOooO00o.linkToDeath(oooO0O0, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
