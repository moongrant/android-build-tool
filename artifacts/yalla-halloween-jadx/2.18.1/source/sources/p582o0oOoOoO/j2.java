package p582o0oOoOoO;

import android.view.View;
import com.yalla.yalla.common.db.table.ConversationWithUser;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.fragment.MessageBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Ooo0oO.o0000O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 extends Lambda implements Function3<o0000O0O<ConversationWithUser>, View, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MessageBoxFragment f46866Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(MessageBoxFragment messageBoxFragment) {
        super(3);
        this.f46866Oooo0o = messageBoxFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0000O0O<ConversationWithUser> o0000o0o2, View view, Integer num) {
        o0000O0O<ConversationWithUser> adapter = o0000o0o2;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        PrivateChatActivity.f22166o00oO0o.OooO00o(this.f46866Oooo0o.requireContext(), Long.valueOf(adapter.getData(iIntValue).getConversation().getTargetId()));
        return Unit.INSTANCE;
    }
}
