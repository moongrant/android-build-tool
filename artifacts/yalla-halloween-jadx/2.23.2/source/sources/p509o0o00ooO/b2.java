package p509o0o00ooO;

import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class b2 extends Lambda implements Function1<ChatModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w1 f50631OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(w1 w1Var) {
        super(1);
        this.f50631OooO0Oo = w1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ChatModel chatModel) {
        ChatModel chatModel2 = chatModel;
        Intrinsics.checkNotNullParameter(chatModel2, "chatModel");
        int fromboxid = chatModel2.getFromboxid() > 0 ? chatModel2.getFromboxid() : chatModel2.getGiftid();
        Function6<? super RoomUserInfoModel, ? super Integer, ? super Integer, ? super Integer, ? super Boolean, ? super ChatModel, Unit> function6 = this.f50631OooO0Oo.f50860OooOOO;
        if (function6 != null) {
            function6.invoke(chatModel2.getNewFrom(), Integer.valueOf(chatModel2.getNumber()), Integer.valueOf(fromboxid), Integer.valueOf(chatModel2.getGiftUserType()), Boolean.valueOf(chatModel2.getGiftFromBackpack()), chatModel2);
        }
        return Unit.INSTANCE;
    }
}
