package p089o000o000;

import androidx.paging.LoadType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo extends Lambda implements Function2<o0ooOOo.OooO00o, o0ooOOo.OooO00o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0 f29069Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(o00OO0O0 o00oo0o1) {
        super(2);
        this.f29069Oooo0o = o00oo0o1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(o0ooOOo.OooO00o oooO00o, o0ooOOo.OooO00o oooO00o2) {
        o0ooOOo.OooO00o prependHint = oooO00o;
        o0ooOOo.OooO00o appendHint = oooO00o2;
        Intrinsics.checkNotNullParameter(prependHint, "prependHint");
        Intrinsics.checkNotNullParameter(appendHint, "appendHint");
        if (o0OO00O.OooO00o(this.f29069Oooo0o, prependHint.f29071OooO00o, LoadType.PREPEND)) {
            prependHint.OooO00o(this.f29069Oooo0o);
        }
        if (o0OO00O.OooO00o(this.f29069Oooo0o, appendHint.f29071OooO00o, LoadType.APPEND)) {
            appendHint.OooO00o(this.f29069Oooo0o);
        }
        return Unit.INSTANCE;
    }
}
