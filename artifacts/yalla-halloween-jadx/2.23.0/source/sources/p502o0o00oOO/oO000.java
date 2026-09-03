package p502o0o00oOO;

import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oo0000 f49518OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49519OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000(o0oo0000 o0oo0000Var, int i) {
        super(0);
        this.f49518OooO0Oo = o0oo0000Var;
        this.f49519OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0oo0000 o0oo0000Var = this.f49518OooO0Oo;
        Function1<? super ChatModel, Unit> function1 = o0oo0000Var.f49491OooO0oO;
        if (function1 != null) {
            function1.invoke(o0oo0000Var.f49490OooO0o0.get(this.f49519OooO0o0));
        }
        return Unit.INSTANCE;
    }
}
