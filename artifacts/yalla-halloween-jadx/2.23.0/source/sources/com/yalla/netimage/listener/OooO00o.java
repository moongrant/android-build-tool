package com.yalla.netimage.listener;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p046Oooooo0.o0O00o0;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooO00o<T> extends o00OOO00.OooO00o<Object> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f22609OooO0o0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f22608OooO0o = Integer.MIN_VALUE;

    @Override // o00OOO00.OooOOO0
    public final /* bridge */ /* synthetic */ void OooO0O0(o00OOO00.OooOO0O oooOO0O) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00OOO00.OooOOO0
    public final void OooO0OO(@NonNull Object obj) {
        OooO0oo(obj);
    }

    public void OooO0oO() {
    }

    public abstract void OooO0oo(T t);

    @Override // o00OOO00.OooOOO0
    public final void OooOO0(o00OOO00.OooOO0O oooOO0O) {
        int i = this.f22609OooO0o0;
        int i2 = this.f22608OooO0o;
        if (!o0000oo.OooO(i, i2)) {
            throw new IllegalArgumentException(o0O00o0.OooO00o("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i, " and height: ", i2, ", either provide dimensions in the constructor or call override()"));
        }
        oooOO0O.OooO0O0(i, i2);
    }

    @Override // o00OOO00.OooOOO0
    public final void OooOO0O(@Nullable Drawable drawable) {
        OooO0oO();
    }
}
