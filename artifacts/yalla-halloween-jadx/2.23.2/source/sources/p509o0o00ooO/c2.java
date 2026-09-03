package p509o0o00ooO;

import com.code.android.util.o0000;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.chat.ChatModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.Oooo0;
import p426o0OoO0o0.OooOOOO;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 extends Lambda implements Function1<ChatModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w1 f50635OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(w1 w1Var) {
        super(1);
        this.f50635OooO0Oo = w1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ChatModel chatModel) {
        ChatModel chatModel2 = chatModel;
        Intrinsics.checkNotNullParameter(chatModel2, "chatModel");
        u1 u1Var = (u1) this.f50635OooO0Oo.f50853OooO0o.getValue();
        u1Var.getClass();
        Intrinsics.checkNotNullParameter(chatModel2, "chatModel");
        if (!u1Var.f50839OooO0O0) {
            u1Var.f50839OooO0O0 = true;
            String id = chatModel2.getId();
            t1 t1Var = new t1(u1Var, chatModel2, u1Var.f50838OooO00o);
            LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("redid", id);
            t1Var.f22926OooO0O0 = true;
            t1Var.f22927OooO0OO = o0000.OooO0OO(o000000.loading);
            OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43365Oooo000, linkedHashMapOooO00o, t1Var);
        }
        return Unit.INSTANCE;
    }
}
