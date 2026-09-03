package p516o0o0O00o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f51606OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f51607OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(boolean z, Function0<Unit> function0) {
        super(0);
        this.f51606OooO0Oo = z;
        this.f51607OooO0o0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f51606OooO0Oo) {
            this.f51607OooO0o0.invoke();
        }
        return Unit.INSTANCE;
    }
}
