package p509o0o00ooO;

import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50661OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ w1 f50662OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(int i, w1 w1Var) {
        super(0);
        this.f50661OooO0Oo = i;
        this.f50662OooO0o0 = w1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<? super ChatModel, Unit> function1;
        w1 w1Var = this.f50662OooO0o0;
        int size = w1Var.f50854OooO0o0.size();
        int i = this.f50661OooO0Oo;
        if (i <= size && (function1 = w1Var.f50855OooO0oO) != null) {
            function1.invoke(w1Var.f50854OooO0o0.get(i));
        }
        return Unit.INSTANCE;
    }
}
