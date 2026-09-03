package p502o0o00oOO;

import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00000o extends Lambda implements Function1<ChatModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oo0000 f49522OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000o(o0oo0000 o0oo0000Var) {
        super(1);
        this.f49522OooO0Oo = o0oo0000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ChatModel chatModel) {
        ChatModel chatModel2 = chatModel;
        Intrinsics.checkNotNullParameter(chatModel2, "chatModel");
        int fromboxid = chatModel2.getFromboxid() > 0 ? chatModel2.getFromboxid() : chatModel2.getGiftid();
        Function5<? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super ChatModel, Unit> function5 = this.f49522OooO0Oo.f49497OooOOO0;
        if (function5 != null) {
            function5.invoke(Integer.valueOf(chatModel2.getNumber()), Integer.valueOf(fromboxid), Integer.valueOf(chatModel2.getGiftUserType()), Boolean.valueOf(chatModel2.getGiftFromBackpack()), chatModel2);
        }
        return Unit.INSTANCE;
    }
}
