package com.app.base.Function;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import p153o00Oo0oO.o00000O0;
import p160o00OoOO0.o00OO0O0;
import p654o0ooo.o00O0O;
import p707oOooo0o.o000OO00;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleRequest {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public WeakReference<Context> f11333OooO00o;

    public class OooO00o implements o000OO00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String f11336OooO00o;

        public OooO00o(String str) {
            this.f11336OooO00o = str;
        }

        @Override // p707oOooo0o.o000OO00
        public final void onCancel() {
            o00000O0.OooO0O0().OooO00o(this.f11336OooO00o);
        }
    }

    public LifecycleRequest(Context context) {
        this.f11333OooO00o = new WeakReference<>(context);
    }

    public final String OooO00o(o00OO0O0.OooO00o oooO00o) {
        final String string;
        WeakReference<Context> weakReference = this.f11333OooO00o;
        if (weakReference == null || weakReference.get() == null || !(this.f11333OooO00o.get() instanceof LifecycleOwner)) {
            string = null;
        } else {
            string = this.f11333OooO00o.get().toString();
            ((LifecycleOwner) this.f11333OooO00o.get()).getLifecycle().addObserver(new o00O0O() { // from class: com.app.base.Function.LifecycleRequest.1
                @Override // p654o0ooo.o00O0O
                public final void onDestory() {
                    o00000O0.OooO0O0().OooO00o(string);
                    LifecycleRequest.this.f11333OooO00o.clear();
                }
            });
        }
        if (!oooO00o.isBeforeRequest() || oooO00o.getOldLoadingDialog() == null) {
            return string;
        }
        String string2 = oooO00o.toString();
        oooO00o.getOldLoadingDialog().f53028OooO0O0 = new OooO00o(string2);
        return string2;
    }

    public final void OooO0O0(List<String> list, String str, Map<String, String> map, o00OO0O0.OooO00o oooO00o) {
        o00OO0O0.OooO0OO(OooO00o(oooO00o), list, str, map, oooO00o);
    }
}
