package p509o0o00ooO;

import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class a3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ c3 f50628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatModel f50629OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(c3 c3Var, ChatModel chatModel) {
        super(0);
        this.f50628OooO0Oo = c3Var;
        this.f50629OooO0o0 = chatModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0OO("202003", MapsKt.mapOf(new Pair("source", 3)));
        Function1<? super ChatModel, Unit> function1 = this.f50628OooO0Oo.f50643OooOooo;
        if (function1 != null) {
            function1.invoke(this.f50629OooO0o0);
        }
        return Unit.INSTANCE;
    }
}
