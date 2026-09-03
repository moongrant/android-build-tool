package p198o00o0OoO;

import android.content.Context;
import p192o00o0OO.o0000OO0;
import p625o0ooO000.o000;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000 implements o0000OO0<String> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000<Context> f39076OooO00o;

    public o00O000(o000<Context> o000Var) {
        this.f39076OooO00o = o000Var;
    }

    @Override // p625o0ooO000.o000
    public final Object get() {
        String packageName = this.f39076OooO00o.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
