package com.yalla.netimage.listener;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import p079o000Oo0o.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GifPlayControl implements o00OO.OooO<Drawable> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public p131o00OO0o.OooO f22604OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000OO00 f22605OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f22606OooO0o0;

    public GifPlayControl(int i, LifecycleOwner lifecycleOwner) {
        this.f22606OooO0o0 = -1;
        this.f22606OooO0o0 = i;
        lifecycleOwner.getLifecycle().addObserver(new LifecycleObserver() { // from class: com.yalla.netimage.listener.GifPlayControl.1
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestory() {
                o000OO00 o000oo01;
                ArrayList arrayList;
                GifPlayControl gifPlayControl = GifPlayControl.this;
                p131o00OO0o.OooO oooO = gifPlayControl.f22604OooO0Oo;
                if (oooO != null && (o000oo01 = gifPlayControl.f22605OooO0o) != null && (arrayList = oooO.f37272OooOOO) != null) {
                    arrayList.remove(o000oo01);
                }
                gifPlayControl.f22605OooO0o = null;
                gifPlayControl.f22604OooO0Oo = null;
            }
        });
    }

    public abstract void OooO00o();

    public abstract void OooO0O0();

    @Override // o00OO.OooO
    public final void OooO0oO(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (!(drawable instanceof p131o00OO0o.OooO)) {
            OooO0O0();
            return;
        }
        p131o00OO0o.OooO oooO = (p131o00OO0o.OooO) drawable;
        this.f22604OooO0Oo = oooO;
        if (oooO.f37264OooO0Oo.f37274OooO00o.f37286OooO00o.OooO0OO() <= 1) {
            OooO0O0();
            this.f22604OooO0Oo = null;
            return;
        }
        p131o00OO0o.OooO oooO2 = this.f22604OooO0Oo;
        oooO2.getClass();
        int i = this.f22606OooO0o0;
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i == 0) {
            int iOooO0Oo = oooO2.f37264OooO0Oo.f37274OooO00o.f37286OooO00o.OooO0Oo();
            oooO2.f37269OooOO0 = iOooO0Oo != 0 ? iOooO0Oo : -1;
        } else {
            oooO2.f37269OooOO0 = i;
        }
        o000OO00 o000oo01 = this.f22605OooO0o;
        if (o000oo01 != null) {
            ArrayList arrayList = this.f22604OooO0Oo.f37272OooOOO;
            if (arrayList != null) {
                arrayList.remove(o000oo01);
            }
            this.f22605OooO0o = null;
        }
        OooO0O0 oooO0O0 = new OooO0O0(this);
        this.f22605OooO0o = oooO0O0;
        p131o00OO0o.OooO oooO3 = this.f22604OooO0Oo;
        if (oooO3.f37272OooOOO == null) {
            oooO3.f37272OooOOO = new ArrayList();
        }
        oooO3.f37272OooOOO.add(oooO0O0);
    }

    @Override // o00OO.OooO
    public final void OooO0oo(@Nullable GlideException glideException) {
        OooO0O0();
    }
}
