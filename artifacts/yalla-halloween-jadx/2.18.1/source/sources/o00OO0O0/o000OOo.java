package o00OO0O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f31480Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f31481Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f31482Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(o0OO00O o0oo00o2, int i, OooOO0O oooOO0O) {
        super(0);
        this.f31480Oooo0o = o0oo00o2;
        this.f31481Oooo0oO = i;
        this.f31482Oooo0oo = oooOO0O;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function2<? super Integer, ? super Boolean, Unit> function2 = this.f31480Oooo0o.f31593OoooO0O;
        if (function2 == null) {
            return null;
        }
        function2.invoke(Integer.valueOf(this.f31481Oooo0oO), Boolean.valueOf(this.f31482Oooo0oo.OooO0Oo()));
        return Unit.INSTANCE;
    }
}
