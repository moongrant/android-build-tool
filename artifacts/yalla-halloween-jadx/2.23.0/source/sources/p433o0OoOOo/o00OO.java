package p433o0OoOOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o00O0OO.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOO00 f45990OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(o00OOO00 o00ooo01) {
        super(1);
        this.f45990OooO0Oo = o00ooo01;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            o00OOO00 o00ooo01 = this.f45990OooO0Oo;
            OooO0o.OooO0O0(o00ooo01.f46003OooO00o, new oo0O(o00ooo01));
        }
        return Unit.INSTANCE;
    }
}
