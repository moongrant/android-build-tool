package p248o00oo0o0;

import android.content.Context;
import p240o00oo0.o000000;
import p629o0ooO00O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O implements o000000<String> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0<Context> f40170OooO00o;

    public o0000O(o00000O0<Context> o00000o1) {
        this.f40170OooO00o = o00000o1;
    }

    @Override // p629o0ooO00O.o00000O0
    public final Object get() {
        String packageName = this.f40170OooO00o.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
