package p563o0oOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O00 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f45085Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(Ref.IntRef intRef) {
        super(1);
        this.f45085Oooo0o = intRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f45085Oooo0o.element = num.intValue();
        return Unit.INSTANCE;
    }
}
