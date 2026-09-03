package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 f8575Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f8576Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f8577Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ IBinder f8578Oooo0oo;

    public OooO(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, IBinder iBinder) {
        this.f8575Oooo = oooOOO0;
        this.f8576Oooo0o = oooOOO;
        this.f8577Oooo0oO = str;
        this.f8578Oooo0oo = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.OooO0O0 orDefault = MediaBrowserServiceCompat.this.f8559Oooo0oO.getOrDefault(((MediaBrowserServiceCompat.OooOOOO) this.f8576Oooo0o).OooO00o(), null);
        if (orDefault == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("removeSubscription for callback that isn't registered id=");
            sbOooO0o0.append(this.f8577Oooo0oO);
            Log.w("MBServiceCompat", sbOooO0o0.toString());
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.f8577Oooo0oO;
        IBinder iBinder = this.f8578Oooo0oo;
        Objects.requireNonNull(mediaBrowserServiceCompat);
        boolean z = false;
        try {
            if (iBinder != null) {
                List<o000OO0O.OooO0o<IBinder, Bundle>> list = orDefault.f8564OooO0OO.get(str);
                if (list != null) {
                    Iterator<o000OO0O.OooO0o<IBinder, Bundle>> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().f28234OooO00o) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (list.size() == 0) {
                        orDefault.f8564OooO0OO.remove(str);
                    }
                }
            } else if (orDefault.f8564OooO0OO.remove(str) != null) {
                z = true;
            }
            if (z) {
                return;
            }
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("removeSubscription called for ");
            sbOooO0o1.append(this.f8577Oooo0oO);
            sbOooO0o1.append(" which is not subscribed");
            Log.w("MBServiceCompat", sbOooO0o1.toString());
        } catch (Throwable th) {
            throw th;
        }
    }
}
