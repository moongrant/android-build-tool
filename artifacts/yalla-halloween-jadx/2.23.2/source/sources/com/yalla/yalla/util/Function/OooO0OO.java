package com.yalla.yalla.util.Function;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import p424o0OoO0Oo.o00OOO00;
import p473o0OoooOo.o0OOOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<Context> f32275OooO00o;

    public OooO0OO(Context context) {
        this.f32275OooO00o = new WeakReference<>(context);
    }

    public final void OooO00o(List list, String str, LinkedHashMap linkedHashMap, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o oooO00o) {
        final String string;
        WeakReference<Context> weakReference = this.f32275OooO00o;
        if (weakReference == null || weakReference.get() == null || !(weakReference.get() instanceof LifecycleOwner)) {
            string = null;
        } else {
            string = weakReference.get().toString();
            ((LifecycleOwner) weakReference.get()).getLifecycle().addObserver(new o0OOOO00() { // from class: com.yalla.yalla.util.Function.LifecycleRequest$1
                @Override // p473o0OoooOo.o0OOOO00
                public final void onDestory() {
                    o00OOO00.OooO0O0().OooO00o(string);
                    this.f32258OooO0o0.f32275OooO00o.clear();
                }
            });
        }
        if (oooO00o.OooO0oO() && oooO00o.OooO0o() != null) {
            string = oooO00o.toString();
            oooO00o.OooO0o().f58138OooO0O0 = new OooO0O0(string);
        }
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(string, list, str, linkedHashMap, oooO00o);
    }
}
