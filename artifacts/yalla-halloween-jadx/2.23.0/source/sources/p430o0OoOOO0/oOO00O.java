package p430o0OoOOO0;

import com.code.android.util.OooOo00;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oOO0O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f45825OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f45826OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f45827OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(o00O00OO o00o00oo2, ChatMessage chatMessage, PrivateChatAdapter privateChatAdapter) {
        super(1);
        this.f45825OooO0Oo = o00o00oo2;
        this.f45827OooO0o0 = chatMessage;
        this.f45826OooO0o = privateChatAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        boolean zOooO0O0 = OooOo00.OooO0O0(str2);
        PrivateChatAdapter privateChatAdapter = this.f45826OooO0o;
        if (zOooO0O0) {
            oOO0O0O ooo0o0o = this.f45825OooO0Oo.f45815OooO0Oo;
            ChatMessage message = this.f45827OooO0o0;
            ooo0o0o.OooO00o(str2, message.getMid());
            privateChatAdapter.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            String mid = message.getMid();
            ChatMessage chatMessage = privateChatAdapter.f27440OooOo0o;
            if (Intrinsics.areEqual(mid, chatMessage != null ? chatMessage.getMid() : null)) {
                ChatMessage chatMessage2 = privateChatAdapter.f27440OooOo0o;
                ChatMessage.VoiceInfo voiceInfo = chatMessage2 != null ? chatMessage2.getVoiceInfo() : null;
                if (voiceInfo != null) {
                    voiceInfo.setPlayState(ChatMessage.VoiceInfo.PlayState.Playing);
                }
                int itemCount = privateChatAdapter.getItemCount();
                for (int i = 0; i < itemCount; i++) {
                    String mid2 = message.getMid();
                    ChatMessage chatMessageOooO0O0 = privateChatAdapter.OooO0O0(i);
                    if (Intrinsics.areEqual(mid2, chatMessageOooO0O0 != null ? chatMessageOooO0O0.getMid() : null)) {
                        privateChatAdapter.notifyItemChanged(i);
                        break;
                    }
                }
            }
        } else {
            privateChatAdapter.OooOOOO();
        }
        return Unit.INSTANCE;
    }
}
