package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f10024OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o00Oo0.OooO0O0 f10025OooO0O0;

    public class OooO00o implements Oooo000 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f10026OooO0Oo;

        public OooO00o(Lifecycle lifecycle) {
            this.f10026OooO0Oo = lifecycle;
        }

        @Override // com.bumptech.glide.manager.Oooo000
        public final void onDestroy() {
            Oooo0.this.f10024OooO00o.remove(this.f10026OooO0Oo);
        }

        @Override // com.bumptech.glide.manager.Oooo000
        public final void onStart() {
        }

        @Override // com.bumptech.glide.manager.Oooo000
        public final void onStop() {
        }
    }

    public final class OooO0O0 implements o00Ooo {
        public OooO0O0(Oooo0 oooo0, FragmentManager fragmentManager) {
        }
    }

    public Oooo0(@NonNull o00Oo0.OooO0O0 oooO0O0) {
        this.f10025OooO0O0 = oooO0O0;
    }

    public final com.bumptech.glide.OooOo00 OooO00o(Context context, com.bumptech.glide.OooO0OO oooO0OO, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        o0000oo.OooO00o();
        o0000oo.OooO00o();
        HashMap map = this.f10024OooO00o;
        com.bumptech.glide.OooOo00 oooOo00 = (com.bumptech.glide.OooOo00) map.get(lifecycle);
        if (oooOo00 != null) {
            return oooOo00;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
        com.bumptech.glide.OooOo00 oooOo00OooO00o = this.f10025OooO0O0.OooO00o(oooO0OO, lifecycleLifecycle, new OooO0O0(this, fragmentManager), context);
        map.put(lifecycle, oooOo00OooO00o);
        lifecycleLifecycle.OooO0O0(new OooO00o(lifecycle));
        if (z) {
            oooOo00OooO00o.onStart();
        }
        return oooOo00OooO00o;
    }
}
