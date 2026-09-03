package p502o0o00oOO;

import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOOoOOO0 f49554OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatModel f49555OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00Oo00(oOOoOOO0 ooooooo0, ChatModel chatModel) {
        super(0);
        this.f49554OooO0Oo = ooooooo0;
        this.f49555OooO0o0 = chatModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO0O0("202003", MapsKt.mapOf(new Pair("source", 3)));
        Function1<? super ChatModel, Unit> function1 = this.f49554OooO0Oo.f49678OooOooo;
        if (function1 != null) {
            function1.invoke(this.f49555OooO0o0);
        }
        return Unit.INSTANCE;
    }
}
