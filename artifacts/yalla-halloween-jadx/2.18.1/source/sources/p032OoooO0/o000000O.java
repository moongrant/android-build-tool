package p032OoooO0;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O extends Lambda implements Function1<List<o0OOO0o>, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f3008Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(o0O0000O o0o0000o2) {
        super(1);
        this.f3008Oooo0o = o0o0000o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<o0OOO0o> list) {
        boolean z;
        List<o0OOO0o> it = list;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.f3008Oooo0o.OooO0OO() != null) {
            o0O000 o0o000OooO0OO = this.f3008Oooo0o.OooO0OO();
            Intrinsics.checkNotNull(o0o000OooO0OO);
            it.add(o0o000OooO0OO.f3314OooO00o);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
