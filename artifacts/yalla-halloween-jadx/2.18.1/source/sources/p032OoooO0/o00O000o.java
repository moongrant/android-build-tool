package p032OoooO0;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000o extends Lambda implements Function1<List<o0OOO0o>, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O000 f3162Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(o00O000 o00o001) {
        super(1);
        this.f3162Oooo0o = o00o001;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<o0OOO0o> list) {
        boolean z;
        List<o0OOO0o> it = list;
        Intrinsics.checkNotNullParameter(it, "it");
        o0OOO0o o0ooo0o2 = this.f3162Oooo0o.f3121Oooo0o.f3342OooO0o;
        if (o0ooo0o2 != null) {
            Intrinsics.checkNotNull(o0ooo0o2);
            it.add(o0ooo0o2);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
