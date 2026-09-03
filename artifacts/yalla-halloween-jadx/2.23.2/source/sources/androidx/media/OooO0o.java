package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOOO f6140OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ IBinder f6141OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f6142OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.OooOOO f6143OooO0oO;

    public OooO0o(MediaBrowserServiceCompat.OooOOO oooOOO, MediaBrowserServiceCompat.OooOo00 oooOo00, String str, IBinder iBinder) {
        this.f6143OooO0oO = oooOOO;
        this.f6140OooO0Oo = oooOo00;
        this.f6142OooO0o0 = str;
        this.f6141OooO0o = iBinder;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0070, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        IBinder iBinderOooO00o = ((MediaBrowserServiceCompat.OooOo00) this.f6140OooO0Oo).OooO00o();
        MediaBrowserServiceCompat.OooOOO oooOOO = this.f6143OooO0oO;
        MediaBrowserServiceCompat.OooO0O0 orDefault = MediaBrowserServiceCompat.this.f6099OooO0oO.getOrDefault(iBinderOooO00o, null);
        String str = this.f6142OooO0o0;
        if (orDefault == null) {
            Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
            return;
        }
        MediaBrowserServiceCompat.this.getClass();
        HashMap<String, List<o000OO.OooO0o<IBinder, Bundle>>> map = orDefault.f6110OooO0o0;
        IBinder iBinder = this.f6141OooO0o;
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            if (map.remove(str) == null) {
            }
            if (z) {
            }
            Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
        }
        List<o000OO.OooO0o<IBinder, Bundle>> list = map.get(str);
        if (list != null) {
            Iterator<o000OO.OooO0o<IBinder, Bundle>> it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == it.next().f34374OooO00o) {
                    it.remove();
                    z2 = true;
                }
            }
            if (list.size() == 0) {
                map.remove(str);
            }
        }
        z = z2;
        if (z) {
            Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
        }
    }
}
