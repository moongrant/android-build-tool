package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.manager.o00Oo0;
import com.yalla.netimage.listener.OkhttpGlideModule;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OkhttpGlideModule f9836OooO00o = new OkhttpGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.yalla.netimage.listener.OkhttpGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
        }
    }

    @Override // p134o00OO0oo.oo000o, p134o00OO0oo.o00oO0o
    public final void OooO00o() {
        this.f9836OooO00o.getClass();
    }

    @Override // p134o00OO0oo.o0OOO0o, p134o00OO0oo.o0OO00O
    public final void OooO0O0(@NonNull Context context, @NonNull OooO0OO oooO0OO, @NonNull Registry registry) {
        new com.bumptech.glide.integration.okhttp3.OooO00o().OooO0O0(context, oooO0OO, registry);
        this.f9836OooO00o.OooO0O0(context, oooO0OO, registry);
    }

    @Override // p134o00OO0oo.oo000o
    public final void OooO0OO() {
        this.f9836OooO00o.getClass();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public final Set<Class<?>> OooO0Oo() {
        return Collections.emptySet();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public final o00Oo0.OooO0O0 OooO0o0() {
        return new OooO00o();
    }
}
