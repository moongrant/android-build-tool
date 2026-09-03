package p029Oooo0oO;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000O extends Lambda implements Function1<Object, Integer> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O00 f2420Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(o00O00 o00o01) {
        super(1);
        this.f2420Oooo0o = o00o01;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Object needle) {
        Intrinsics.checkNotNullParameter(needle, "needle");
        o0O000 o0o001 = new o0O000(this.f2420Oooo0o);
        int iOooO0oo = this.f2420Oooo0o.OooO0oo();
        int i = 0;
        while (i < iOooO0oo) {
            if (Intrinsics.areEqual(o0o001.invoke(Integer.valueOf(i)), needle)) {
                return Integer.valueOf(i);
            }
            i++;
        }
        i = -1;
        return Integer.valueOf(i);
    }
}
