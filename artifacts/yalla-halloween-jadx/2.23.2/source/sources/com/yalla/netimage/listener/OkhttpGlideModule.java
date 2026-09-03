package com.yalla.netimage.listener;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import kotlin.jvm.internal.Intrinsics;
import p167o00Ooo0.o00oO0o;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes2.dex */
@GlideModule
public class OkhttpGlideModule extends o00oO0o {
    @Override // p167o00Ooo0.o0Oo0oo, p167o00Ooo0.oo0o0Oo
    public final void OooO0O0(@NonNull Context context, @NonNull com.bumptech.glide.OooO0OO oooO0OO, @NonNull Registry registry) {
        o0OoO00O.OooO00o oooO00o = new o0OoO00O.OooO00o();
        OooOO0 interceptor = new OooOO0();
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        oooO00o.f57917OooO0Oo.add(interceptor);
        registry.OooOO0o(new com.bumptech.glide.integration.okhttp3.OooO0O0.OooO00o(new o0OoO00O(oooO00o)));
    }
}
