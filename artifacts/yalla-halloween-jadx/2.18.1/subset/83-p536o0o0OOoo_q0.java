package p536o0o0OOoo;

import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43843Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f43844Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(PrivateChatActivity privateChatActivity, ChatMessage chatMessage) {
        super(0);
        this.f43843Oooo0o = privateChatActivity;
        this.f43844Oooo0oO = chatMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PrivateChatActivity privateChatActivity = this.f43843Oooo0o;
        privateChatActivity.f22186ooOO = true;
        privateChatActivity.Oooo0O0().getRoomThemeAccept(this.f43844Oooo0oO);
        return Unit.INSTANCE;
    }
}
