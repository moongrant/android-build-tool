package com.yalla.yalla.util.Function;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import p420o0OoO0OO.o000000;
import p466o0Oooo0o.o00O00o0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<Context> f32811OooO00o;

    public OooO0OO(Context context) {
        this.f32811OooO00o = new WeakReference<>(context);
    }

    public final void OooO00o(List list, String str, LinkedHashMap linkedHashMap, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o oooO00o) {
        final String string;
        WeakReference<Context> weakReference = this.f32811OooO00o;
        if (weakReference == null || weakReference.get() == null || !(weakReference.get() instanceof LifecycleOwner)) {
            string = null;
        } else {
            string = weakReference.get().toString();
            ((LifecycleOwner) weakReference.get()).getLifecycle().addObserver(new o00O00o0() { // from class: com.yalla.yalla.util.Function.LifecycleRequest$1
                @Override // p466o0Oooo0o.o00O00o0
                public final void onDestory() {
                    o000000.OooO0O0().OooO00o(string);
                    this.f32794OooO0o0.f32811OooO00o.clear();
                }
            });
        }
        if (oooO00o.OooO0oO() && oooO00o.OooO0o() != null) {
            string = oooO00o.toString();
            oooO00o.OooO0o().f52154OooO0O0 = new OooO0O0(string);
        }
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(string, list, str, linkedHashMap, oooO00o);
    }
}
