package p536o0o0OOoo;

import com.app.base.constants.StatusEnum$MsgSendStatus;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43780Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f43781Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(PrivateChatActivity privateChatActivity, ChatMessage chatMessage) {
        super(0);
        this.f43780Oooo0o = privateChatActivity;
        this.f43781Oooo0oO = chatMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        PrivateChatActivity privateChatActivity = this.f43780Oooo0o;
        ChatMessage chatMessage = this.f43781Oooo0oO;
        PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
        Objects.requireNonNull(privateChatActivity);
        if (chatMessage.getSendState() == StatusEnum$MsgSendStatus.SUCCESS.OooO00o()) {
            return null;
        }
        switch (chatMessage.getContentType()) {
            case 1:
                privateChatActivity.Oooo0O0().reSendTextMessage(chatMessage);
                break;
            case 2:
                privateChatActivity.Oooo0O0().reSendVoiceMessage(chatMessage);
                break;
            case 4:
                privateChatActivity.Oooo0O0().reSendGifMessage(chatMessage);
                break;
            case 5:
                privateChatActivity.Oooo0O0().reSendGiftMessage(chatMessage);
                break;
            case 6:
                privateChatActivity.Oooo0O0().reSendShareRoomMsg(chatMessage);
                break;
            case 7:
                privateChatActivity.Oooo0O0().reSendShareMomentMsg(chatMessage);
                break;
            case 8:
                privateChatActivity.Oooo0O0().reSendShareTopicMsg(chatMessage);
                break;
            case 9:
                privateChatActivity.Oooo0O0().reSendShareUserMsg(chatMessage);
                break;
            case 10:
                privateChatActivity.Oooo0O0().reSendShareActivityMsg(chatMessage);
                break;
        }
        return null;
    }
}
