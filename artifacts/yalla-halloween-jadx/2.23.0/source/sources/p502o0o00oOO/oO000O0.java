package p502o0o00oOO;

import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oo0000 f49526OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49527OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0(o0oo0000 o0oo0000Var, int i) {
        super(0);
        this.f49526OooO0Oo = o0oo0000Var;
        this.f49527OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0oo0000 o0oo0000Var = this.f49526OooO0Oo;
        Function1<? super ChatModel, Unit> function1 = o0oo0000Var.f49492OooO0oo;
        if (function1 != null) {
            function1.invoke(o0oo0000Var.f49490OooO0o0.get(this.f49527OooO0o0));
        }
        return Unit.INSTANCE;
    }
}
