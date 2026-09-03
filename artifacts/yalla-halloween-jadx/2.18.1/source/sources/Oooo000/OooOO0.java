package Oooo000;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends Lambda implements Function1<o0O0O00.o000O000.OooO00o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0O00.o000O000 f801Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000OOo f802Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(o0O0O00.o000O000 o000o001, o000OOo o000ooo2) {
        super(1);
        this.f801Oooo0o = o000o001;
        this.f802Oooo0oO = o000ooo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
        o0O0O00.o000O000.OooO00o layout = oooO00o;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        layout.OooO0OO(this.f801Oooo0o, 0, 0, ((Number) this.f802Oooo0oO.f884OooO0OO.getValue()).floatValue());
        return Unit.INSTANCE;
    }
}
