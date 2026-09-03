package o0O0OOOo;

import android.content.Context;
import java.util.Objects;
import p641o0ooO0oo.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O<Context> f35644OooO00o;

    public OooOOO0(o000O<Context> o000o) {
        this.f35644OooO00o = o000o;
    }

    @Override // p641o0ooO0oo.o000O
    public final Object get() {
        String packageName = this.f35644OooO00o.get().getPackageName();
        Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }
}
