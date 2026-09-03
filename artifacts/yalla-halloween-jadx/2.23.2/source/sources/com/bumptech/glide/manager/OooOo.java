package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f13118OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Oooo0.OooO0O0 f13119OooO0O0;

    public class OooO00o implements OooOo00 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f13120OooO0Oo;

        public OooO00o(Lifecycle lifecycle) {
            this.f13120OooO0Oo = lifecycle;
        }

        @Override // com.bumptech.glide.manager.OooOo00
        public final void onDestroy() {
            OooOo.this.f13118OooO00o.remove(this.f13120OooO0Oo);
        }

        @Override // com.bumptech.glide.manager.OooOo00
        public final void onStart() {
        }

        @Override // com.bumptech.glide.manager.OooOo00
        public final void onStop() {
        }
    }

    public final class OooO0O0 implements o000oOoO {
        public OooO0O0(OooOo oooOo, FragmentManager fragmentManager) {
        }
    }

    public OooOo(@NonNull Oooo0.OooO0O0 oooO0O0) {
        this.f13119OooO0O0 = oooO0O0;
    }

    public final com.bumptech.glide.OooOo00 OooO00o(Context context, com.bumptech.glide.OooO0OO oooO0OO, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        o00OO0O0.OooO00o();
        o00OO0O0.OooO00o();
        HashMap map = this.f13118OooO00o;
        com.bumptech.glide.OooOo00 oooOo00 = (com.bumptech.glide.OooOo00) map.get(lifecycle);
        if (oooOo00 != null) {
            return oooOo00;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        com.bumptech.glide.OooOo00 oooOo00OooO00o = this.f13119OooO0O0.OooO00o(oooO0OO, lifecycleLifecycle, new OooO0O0(this, fragmentManager), context);
        map.put(lifecycle, oooOo00OooO00o);
        lifecycleLifecycle.OooO0O0(new OooO00o(lifecycle));
        if (z) {
            oooOo00OooO00o.onStart();
        }
        return oooOo00OooO00o;
    }
}
