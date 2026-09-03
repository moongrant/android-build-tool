package p538o0o0OOoo;

import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43855Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f43856OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(PrivateChatActivity privateChatActivity, ChatMessage chatMessage) {
        super(0);
        this.f43855Oooo = privateChatActivity;
        this.f43856OoooO00 = chatMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PrivateChatActivity privateChatActivity = this.f43855Oooo;
        privateChatActivity.f22197o00Ooo = true;
        privateChatActivity.Oooo0O0().getRoomThemeAccept(this.f43856OoooO00);
        return Unit.INSTANCE;
    }
}
