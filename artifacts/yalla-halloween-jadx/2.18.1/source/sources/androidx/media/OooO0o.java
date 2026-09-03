package androidx.media;

import Oooo000.o00O0O;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Bundle f8587Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f8588Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f8589Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ IBinder f8590Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO0 f8591OoooO00;

    public OooO0o(MediaBrowserServiceCompat.OooOOO0 oooOOO0, MediaBrowserServiceCompat.OooOOO oooOOO, String str, IBinder iBinder, Bundle bundle) {
        this.f8591OoooO00 = oooOOO0;
        this.f8588Oooo0o = oooOOO;
        this.f8589Oooo0oO = str;
        this.f8590Oooo0oo = iBinder;
        this.f8587Oooo = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaBrowserServiceCompat.OooO0O0 orDefault = MediaBrowserServiceCompat.this.f8559Oooo0oO.getOrDefault(((MediaBrowserServiceCompat.OooOOOO) this.f8588Oooo0o).OooO00o(), null);
        if (orDefault == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("addSubscription for callback that isn't registered id=");
            sbOooO0o0.append(this.f8589Oooo0oO);
            Log.w("MBServiceCompat", sbOooO0o0.toString());
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.f8589Oooo0oO;
        IBinder iBinder = this.f8590Oooo0oo;
        Bundle bundle = this.f8587Oooo;
        Objects.requireNonNull(mediaBrowserServiceCompat);
        List<o000OO0O.OooO0o<IBinder, Bundle>> arrayList = orDefault.f8564OooO0OO.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (o000OO0O.OooO0o<IBinder, Bundle> oooO0o : arrayList) {
            if (iBinder == oooO0o.f28234OooO00o && OooO00o.OooO00o(bundle, oooO0o.f28235OooO0O0)) {
                return;
            }
        }
        arrayList.add(new o000OO0O.OooO0o<>(iBinder, bundle));
        orDefault.f8564OooO0OO.put(str, arrayList);
        if (bundle == null) {
            mediaBrowserServiceCompat.OooO0O0();
        } else {
            mediaBrowserServiceCompat.OooO0O0();
        }
        throw new IllegalStateException(o00O0O.OooO0O0(OooO00o.OooO00o.OooO0o0("onLoadChildren must call detach() or sendResult() before returning for package="), orDefault.f8562OooO00o, " id=", str));
    }
}
