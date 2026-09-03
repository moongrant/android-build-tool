package o00OO0O0;

import com.app.base.model.ChatModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000OO0 f31476Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ChatModel f31477Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(o0000OO0 o0000oo1, ChatModel chatModel) {
        super(0);
        this.f31476Oooo0o = o0000oo1;
        this.f31477Oooo0oO = chatModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("InRoom_gift_rebate");
        p606o0oo0O.OooOo.OooO0OO("202003", MapsKt.mapOf(new Pair("source", 3)));
        Function1<? super ChatModel, Unit> function1 = this.f31476Oooo0o.f31451OooOo;
        if (function1 == null) {
            return null;
        }
        function1.invoke(this.f31477Oooo0oO);
        return null;
    }
}
