package p522o0o0OO0;

import android.view.View;
import com.yalla.yalla.data.db.table.ConversationWithUser;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p400o0Oo0OO.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function3<OooOO0O<ConversationWithUser>, View, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MessageBoxFragment f53438OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(MessageBoxFragment messageBoxFragment) {
        super(3);
        this.f53438OooO0Oo = messageBoxFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(OooOO0O<ConversationWithUser> oooOO0O, View view, Integer num) {
        OooOO0O<ConversationWithUser> adapter = oooOO0O;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        ConversationWithUser data = adapter.getData(iIntValue);
        int i = PrivateChatActivity.f25694Oooo000;
        PrivateChatActivity.OooO00o.OooO00o(this.f53438OooO0Oo.requireContext(), Long.valueOf(data.getConversation().getTargetId()));
        return Unit.INSTANCE;
    }
}
