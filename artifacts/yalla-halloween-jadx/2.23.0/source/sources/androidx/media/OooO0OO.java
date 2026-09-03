package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOOO f6108OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ IBinder f6109OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f6110OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Bundle f6111OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f6112OooO0oo;

    public OooO0OO(MediaBrowserServiceCompat.OooOOO oooOOO, MediaBrowserServiceCompat.OooOo00 oooOo00, String str, IBinder iBinder, Bundle bundle) {
        this.f6112OooO0oo = oooOOO;
        this.f6108OooO0Oo = oooOo00;
        this.f6110OooO0o0 = str;
        this.f6109OooO0o = iBinder;
        this.f6111OooO0oO = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder iBinderOooO00o = ((MediaBrowserServiceCompat.OooOo00) this.f6108OooO0Oo).OooO00o();
        MediaBrowserServiceCompat.OooOOO oooOOO = this.f6112OooO0oo;
        MediaBrowserServiceCompat.OooO0O0 orDefault = MediaBrowserServiceCompat.this.f6072OooO0oO.getOrDefault(iBinderOooO00o, null);
        String str = this.f6110OooO0o0;
        if (orDefault == null) {
            Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str);
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        mediaBrowserServiceCompat.getClass();
        HashMap<String, List<o000OO.OooO0o<IBinder, Bundle>>> map = orDefault.f6083OooO0o0;
        List<o000OO.OooO0o<IBinder, Bundle>> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        Iterator<o000OO.OooO0o<IBinder, Bundle>> it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Bundle bundle = this.f6111OooO0oO;
            IBinder iBinder = this.f6109OooO0o;
            if (!zHasNext) {
                arrayList.add(new o000OO.OooO0o<>(iBinder, bundle));
                map.put(str, arrayList);
                if (bundle == null) {
                    mediaBrowserServiceCompat.OooO0O0();
                } else {
                    mediaBrowserServiceCompat.OooO0O0();
                }
                throw new IllegalStateException(androidx.compose.compiler.plugins.kotlin.OooO0OO.OooO0OO(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), orDefault.f6078OooO00o, " id=", str));
            }
            o000OO.OooO0o<IBinder, Bundle> next = it.next();
            if (iBinder == next.f34865OooO00o && p068o0000oo0.OooOOO.OooO00o(bundle, next.f34866OooO0O0)) {
                return;
            }
        }
    }
}
