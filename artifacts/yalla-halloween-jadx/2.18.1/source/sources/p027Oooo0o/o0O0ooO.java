package p027Oooo0o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0ooO extends Lambda implements Function1<Object, Integer> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f1992Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(o0OO00O o0oo00o2) {
        super(1);
        this.f1992Oooo0o = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Object needle) {
        Intrinsics.checkNotNullParameter(needle, "needle");
        o00O0000 o00o0001 = new o00O0000(this.f1992Oooo0o);
        int iOooO0oo = this.f1992Oooo0o.OooO0oo();
        int i = 0;
        while (i < iOooO0oo) {
            if (Intrinsics.areEqual(o00o0001.invoke(Integer.valueOf(i)), needle)) {
                return Integer.valueOf(i);
            }
            i++;
        }
        i = -1;
        return Integer.valueOf(i);
    }
}
