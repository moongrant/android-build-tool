package com.yalla.yalla.util.netimage.listener;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Objects;
import p234o00oOoOO.oOO0O0O;
import p238o00oOooO.oOOOOo0O;
import p654o0ooo.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GifPlayControl implements oOO0O0O<Drawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oOOOOo0O f26296OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f26297OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public p103o000oo00.OooOO0O f26298OooO0OO;

    public GifPlayControl(int i, LifecycleOwner lifecycleOwner) {
        this.f26297OooO0O0 = i;
        lifecycleOwner.getLifecycle().addObserver(new o00O0O() { // from class: com.yalla.yalla.util.netimage.listener.GifPlayControl.1
            @Override // p654o0ooo.o00O0O
            public final void onDestory() {
                p103o000oo00.OooOO0O oooOO0O;
                GifPlayControl gifPlayControl = GifPlayControl.this;
                oOOOOo0O oooooo0o = gifPlayControl.f26296OooO00o;
                if (oooooo0o != null && (oooOO0O = gifPlayControl.f26298OooO0OO) != null) {
                    oooooo0o.OooO0o(oooOO0O);
                }
                GifPlayControl gifPlayControl2 = GifPlayControl.this;
                gifPlayControl2.f26298OooO0OO = null;
                gifPlayControl2.f26296OooO00o = null;
            }
        });
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p234o00oOoOO.oOO0O0O
    public final void OooO00o(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (!(drawable instanceof oOOOOo0O)) {
            OooO0Oo();
            return;
        }
        oOOOOo0O oooooo0o = (oOOOOo0O) drawable;
        this.f26296OooO00o = oooooo0o;
        if (oooooo0o.f34071Oooo0o.f34081OooO00o.f34087OooO00o.OooO0OO() <= 1) {
            OooO0Oo();
            this.f26296OooO00o = null;
            return;
        }
        oOOOOo0O oooooo0o2 = this.f26296OooO00o;
        int i = this.f26297OooO0O0;
        Objects.requireNonNull(oooooo0o2);
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i == 0) {
            int iOooO0oo = oooooo0o2.f34071Oooo0o.f34081OooO00o.f34087OooO00o.OooO0oo();
            oooooo0o2.f34077OoooO0O = iOooO0oo != 0 ? iOooO0oo : -1;
        } else {
            oooooo0o2.f34077OoooO0O = i;
        }
        p103o000oo00.OooOO0O oooOO0O = this.f26298OooO0OO;
        if (oooOO0O != null) {
            this.f26296OooO00o.OooO0o(oooOO0O);
            this.f26298OooO0OO = null;
        }
        OooO0O0 oooO0O0 = new OooO0O0(this);
        this.f26298OooO0OO = oooO0O0;
        oOOOOo0O oooooo0o3 = this.f26296OooO00o;
        Objects.requireNonNull(oooooo0o3);
        if (oooooo0o3.f34079OoooOOO == null) {
            oooooo0o3.f34079OoooOOO = new ArrayList();
        }
        oooooo0o3.f34079OoooOOO.add(oooO0O0);
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Lo00oOoOo/oOOO0O0o<Landroid/graphics/drawable/Drawable;>;Z)Z */
    @Override // p234o00oOoOO.oOO0O0O
    public final void OooO0O0() {
        OooO0Oo();
    }

    public abstract void OooO0OO();

    public abstract void OooO0Oo();
}
