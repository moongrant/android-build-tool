package p536o0o0OOoo;

import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends Lambda implements Function1<ChatMessage, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43807Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f43807Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ChatMessage chatMessage) {
        ChatMessage chatMessage2 = chatMessage;
        Intrinsics.checkNotNullParameter(chatMessage2, "chatMessage");
        PrivateChatActivity privateChatActivity = this.f43807Oooo0o;
        PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
        privateChatActivity.Oooo0O0().updateEmotionMessage(chatMessage2.getTargetId());
        return Unit.INSTANCE;
    }
}
