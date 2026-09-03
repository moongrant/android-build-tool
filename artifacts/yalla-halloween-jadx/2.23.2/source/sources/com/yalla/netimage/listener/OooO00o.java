package com.yalla.netimage.listener;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p046Oooooo0.o0O00o0;
import p172o00OooO0.o00000O;
import p172o00OooO0.o0O0O00;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o<T> extends o0O0O00<Object> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f22139OooO0o0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f22138OooO0o = Integer.MIN_VALUE;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p172o00OooO0.o00000OO
    public final void OooO0O0(@NonNull Object obj) {
        OooO0oO(obj);
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooO0o(o00000O o00000o) {
        int i = this.f22139OooO0o0;
        int i2 = this.f22138OooO0o;
        if (!o00OO0O0.OooO0oo(i, i2)) {
            throw new IllegalArgumentException(o0O00o0.OooO00o("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i, " and height: ", i2, ", either provide dimensions in the constructor or call override()"));
        }
        o00000o.OooO0O0(i, i2);
    }

    public void OooO0o0() {
    }

    public abstract void OooO0oO(T t);

    @Override // p172o00OooO0.o00000OO
    public final /* bridge */ /* synthetic */ void OooOO0(o00000O o00000o) {
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooOO0O(@Nullable Drawable drawable) {
        OooO0o0();
    }
}
