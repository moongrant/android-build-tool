package o00OO0O0;

import com.app.base.model.ChatModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o extends Lambda implements Function1<ChatModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f31615Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(o0OO00O o0oo00o2) {
        super(1);
        this.f31615Oooo0o = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ChatModel chatModel) {
        ChatModel chatModel2 = chatModel;
        Intrinsics.checkNotNullParameter(chatModel2, "chatModel");
        int i = chatModel2.fromboxid;
        if (i <= 0) {
            i = chatModel2.giftid;
        }
        Function4<? super RoomUserInfoModel, ? super Integer, ? super Integer, ? super Integer, Unit> function4 = this.f31615Oooo0o.f31598o000oOoO;
        if (function4 != null) {
            function4.invoke(chatModel2.from, Integer.valueOf(chatModel2.number), Integer.valueOf(i), Integer.valueOf(chatModel2.giftUserType));
        }
        return Unit.INSTANCE;
    }
}
