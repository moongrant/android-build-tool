package p546o0o0Ooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00o00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO00Oo00 f44513Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o00(oO00Oo00 oo00oo00) {
        super(1);
        this.f44513Oooo0o = oo00oo00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.f44513Oooo0o.f44438OooOO0.setValue(Boolean.valueOf(bool.booleanValue()));
        return Unit.INSTANCE;
    }
}
