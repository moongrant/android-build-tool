package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.yalla.yalla.util.netimage.listener.OkhttpGlideModule;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import p231o00oOo0o.o000OOo;

/* JADX INFO: loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OkhttpGlideModule f12357OooO00o = new OkhttpGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.yalla.yalla.util.netimage.listener.OkhttpGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
        }
    }

    @Override // p233o00oOoO0.o0O0o, p233o00oOoO0.o0
    public final void OooO00o() {
        Objects.requireNonNull(this.f12357OooO00o);
    }

    @Override // p233o00oOoO0.o0O0000O, p233o00oOoO0.o0O000O
    public final void OooO0O0(@NonNull Context context, @NonNull OooO0OO oooO0OO, @NonNull Registry registry) {
        new com.bumptech.glide.integration.okhttp3.OooO00o().OooO0O0(context, oooO0OO, registry);
        this.f12357OooO00o.OooO0O0(context, oooO0OO, registry);
    }

    @Override // p233o00oOoO0.o0O0o
    public final void OooO0OO() {
        Objects.requireNonNull(this.f12357OooO00o);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public final Set<Class<?>> OooO0Oo() {
        return Collections.emptySet();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public final o000OOo.OooO0O0 OooO0o0() {
        return new OooO00o();
    }
}
