package com.yalla.yalla.util.netimage.listener;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p235o00oOoOo.oOOO00Oo;
import p237o00oOoo0.o0O000Oo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooO00o<T> extends oOOO00Oo<T> {
    public OooO00o() {
    }

    public void onFailed() {
    }

    @Override // p235o00oOoOo.oOO0Oo00, p235o00oOoOo.oOOO0O0o
    public void onLoadFailed(@Nullable Drawable drawable) {
        onFailed();
        super.onLoadFailed(drawable);
    }

    @Override // p235o00oOoOo.oOOO0O0o
    public void onResourceReady(@NonNull T t, @Nullable o0O000Oo<? super T> o0o000oo2) {
        onSuccess(t);
    }

    public abstract void onSuccess(T t);

    public OooO00o(int i, int i2) {
        super(i, i2);
    }
}
