package com.yalla.yalla.util.netimage.listener;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import p233o00oOoO0.o0O0o;
import p660o0ooo0o0.o00OO;

/* JADX INFO: loaded from: classes3.dex */
@GlideModule
public class OkhttpGlideModule extends o0O0o {
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p233o00oOoO0.o0O0000O, p233o00oOoO0.o0O000O
    public final void OooO0O0(@NonNull Context context, @NonNull com.bumptech.glide.OooO0OO oooO0OO, @NonNull Registry registry) {
        o00OO.OooO00o oooO00o = new o00OO.OooO00o();
        OooOO0 interceptor = new OooOO0();
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        oooO00o.f51353OooO0Oo.add(interceptor);
        registry.OooO(InputStream.class, new com.bumptech.glide.integration.okhttp3.OooO0O0.OooO00o(new o00OO(oooO00o)));
    }
}
