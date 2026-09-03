package p529o0o0OOO0;

import android.view.View;
import com.yalla.yalla.data.db.table.ConversationWithUser;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends Lambda implements Function3<h3<ConversationWithUser>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MessageBoxFragment f53378OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(MessageBoxFragment messageBoxFragment) {
        super(3);
        this.f53378OooO0Oo = messageBoxFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(h3<ConversationWithUser> h3Var, View view, Integer num) {
        h3<ConversationWithUser> adapter = h3Var;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        ConversationWithUser data = adapter.getData(iIntValue);
        int i = PrivateChatActivity.f25239Oooo000;
        PrivateChatActivity.OooO00o.OooO00o(this.f53378OooO0Oo.requireContext(), Long.valueOf(data.getConversation().getTargetId()));
        return Unit.INSTANCE;
    }
}
