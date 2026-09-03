package com.google.android.exoplayer2;

import android.content.Context;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p466o0OooO0.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultRenderersFactory implements o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f13110OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public p303o0O0o00o.Oooo000 f13111OooO0O0 = p303o0O0o00o.Oooo000.f36241OooO00o;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.f13110OooO00o = context;
    }
}
