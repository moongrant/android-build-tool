package p032OoooO0;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.o0OOO0o;
import p034OoooO0O.o00000O0;
import p034OoooO0O.oo000o;
import p145o00Oo0.o0O0O00;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00O extends Lambda implements Function1<o0Oo0oo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O000 f3163Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(o00O000 o00o001) {
        super(1);
        this.f3163Oooo0o = o00o001;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0Oo0oo o0oo0oo2) {
        Map<Long, oo000o> mapOooO0oo;
        o0Oo0oo drawBehind = o0oo0oo2;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        o00O000 o00o001 = this.f3163Oooo0o;
        o0O000O o0o000o = o00o001.f3121Oooo0o;
        o0OOO0o textLayoutResult = o0o000o.f3342OooO0o;
        if (textLayoutResult != null) {
            o0o000o.f3345OooO0oo.getValue();
            Unit unit = Unit.INSTANCE;
            o00000O0 o00000o1 = o00o001.f3122Oooo0oO;
            if (((o00000o1 == null || (mapOooO0oo = o00000o1.OooO0oo()) == null) ? null : mapOooO0oo.get(Long.valueOf(o00o001.f3121Oooo0o.f3339OooO0O0))) != null) {
                throw null;
            }
            o0O0O00 canvas = drawBehind.Ooooo0o().OooO0o();
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
            o00000O.o0Oo0oo.OooO00o(canvas, textLayoutResult);
        }
        return Unit.INSTANCE;
    }
}
