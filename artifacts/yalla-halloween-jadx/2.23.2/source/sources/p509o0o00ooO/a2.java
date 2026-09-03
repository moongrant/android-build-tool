package p509o0o00ooO;

import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a2 extends Lambda implements Function1<ChatModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w1 f50627OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(w1 w1Var) {
        super(1);
        this.f50627OooO0Oo = w1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ChatModel chatModel) {
        ChatModel chatModel2 = chatModel;
        Intrinsics.checkNotNullParameter(chatModel2, "chatModel");
        int fromboxid = chatModel2.getFromboxid() > 0 ? chatModel2.getFromboxid() : chatModel2.getGiftid();
        Function5<? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super ChatModel, Unit> function5 = this.f50627OooO0Oo.f50861OooOOO0;
        if (function5 != null) {
            function5.invoke(Integer.valueOf(chatModel2.getNumber()), Integer.valueOf(fromboxid), Integer.valueOf(chatModel2.getGiftUserType()), Boolean.valueOf(chatModel2.getGiftFromBackpack()), chatModel2);
        }
        return Unit.INSTANCE;
    }
}
