package com.yalla.netimage.listener;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import kotlin.jvm.internal.Intrinsics;
import p134o00OO0oo.oo000o;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@GlideModule
public class OkhttpGlideModule extends oo000o {
    @Override // p134o00OO0oo.o0OOO0o, p134o00OO0oo.o0OO00O
    public final void OooO0O0(@NonNull Context context, @NonNull com.bumptech.glide.OooO0OO oooO0OO, @NonNull Registry registry) {
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
        OooOO0 interceptor = new OooOO0();
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        oooO00o.f57288OooO0Oo.add(interceptor);
        registry.OooOO0o(new com.bumptech.glide.integration.okhttp3.OooO0O0.OooO00o(new o00OOOO0(oooO00o)));
    }
}
