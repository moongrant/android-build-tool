package com.yalla.netimage.listener;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import p165o00OoOoo.o00;
import p170o00Ooo0o.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GifPlayControl implements o0OoOo0<Drawable> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00 f22134OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00O00OO.OooO0OO f22135OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f22136OooO0o0;

    public GifPlayControl(int i, LifecycleOwner lifecycleOwner) {
        this.f22136OooO0o0 = -1;
        this.f22136OooO0o0 = i;
        lifecycleOwner.getLifecycle().addObserver(new LifecycleObserver() { // from class: com.yalla.netimage.listener.GifPlayControl.1
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestory() {
                o00O00OO.OooO0OO oooO0OO;
                ArrayList arrayList;
                GifPlayControl gifPlayControl = GifPlayControl.this;
                o00 o00Var = gifPlayControl.f22134OooO0Oo;
                if (o00Var != null && (oooO0OO = gifPlayControl.f22135OooO0o) != null && (arrayList = o00Var.f38165OooOOO) != null) {
                    arrayList.remove(oooO0OO);
                }
                gifPlayControl.f22135OooO0o = null;
                gifPlayControl.f22134OooO0Oo = null;
            }
        });
    }

    public abstract void OooO00o();

    public abstract void OooO0O0();

    @Override // p170o00Ooo0o.o0OoOo0
    public final void OooO0o0(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (!(drawable instanceof o00)) {
            OooO0O0();
            return;
        }
        o00 o00Var = (o00) drawable;
        this.f22134OooO0Oo = o00Var;
        if (o00Var.f38157OooO0Oo.f38167OooO00o.f38181OooO00o.OooO0OO() <= 1) {
            OooO0O0();
            this.f22134OooO0Oo = null;
            return;
        }
        o00 o00Var2 = this.f22134OooO0Oo;
        o00Var2.getClass();
        int i = this.f22136OooO0o0;
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i == 0) {
            int iOooO0Oo = o00Var2.f38157OooO0Oo.f38167OooO00o.f38181OooO00o.OooO0Oo();
            o00Var2.f38162OooOO0 = iOooO0Oo != 0 ? iOooO0Oo : -1;
        } else {
            o00Var2.f38162OooOO0 = i;
        }
        o00O00OO.OooO0OO oooO0OO = this.f22135OooO0o;
        if (oooO0OO != null) {
            ArrayList arrayList = this.f22134OooO0Oo.f38165OooOOO;
            if (arrayList != null) {
                arrayList.remove(oooO0OO);
            }
            this.f22135OooO0o = null;
        }
        OooO0O0 oooO0O0 = new OooO0O0(this);
        this.f22135OooO0o = oooO0O0;
        o00 o00Var3 = this.f22134OooO0Oo;
        if (o00Var3.f38165OooOOO == null) {
            o00Var3.f38165OooOOO = new ArrayList();
        }
        o00Var3.f38165OooOOO.add(oooO0O0);
    }

    @Override // p170o00Ooo0o.o0OoOo0
    public final void OooO0oO(@Nullable GlideException glideException) {
        OooO0O0();
    }
}
