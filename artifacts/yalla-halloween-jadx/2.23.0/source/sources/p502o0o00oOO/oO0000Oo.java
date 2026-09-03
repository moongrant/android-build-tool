package p502o0o00oOO;

import com.code.android.util.o0000;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.chat.ChatModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000O;
import p584o0oOooO0.oO00OOo0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000Oo extends Lambda implements Function1<ChatModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oo0000 f49524OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(o0oo0000 o0oo0000Var) {
        super(1);
        this.f49524OooO0Oo = o0oo0000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ChatModel chatModel) {
        ChatModel chatModel2 = chatModel;
        Intrinsics.checkNotNullParameter(chatModel2, "chatModel");
        o0o0000 o0o0000Var = (o0o0000) this.f49524OooO0Oo.f49489OooO0o.getValue();
        o0o0000Var.getClass();
        Intrinsics.checkNotNullParameter(chatModel2, "chatModel");
        if (!o0o0000Var.f49485OooO0O0) {
            o0o0000Var.f49485OooO0O0 = true;
            String id = chatModel2.getId();
            o0OOo000 o0ooo001 = new o0OOo000(o0o0000Var, chatModel2, o0o0000Var.f49484OooO00o);
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("redid", id);
            o0ooo001.f23395OooO0O0 = true;
            o0ooo001.f23396OooO0OO = o0000.OooO0OO(oO00OOo0.loading);
            OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44106Oooo000, linkedHashMapOooO00o, o0ooo001);
        }
        return Unit.INSTANCE;
    }
}
