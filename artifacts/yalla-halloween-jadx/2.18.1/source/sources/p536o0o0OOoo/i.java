package p536o0o0OOoo;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.FriendRequestMessage;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Ooo0oO.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends Lambda implements Function3<o0000O0O<FriendRequestMessage>, View, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f43798Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(3);
        this.f43798Oooo0o = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0000O0O<FriendRequestMessage> o0000o0o2, View view, Integer num) {
        o0000O0O<FriendRequestMessage> adapter = o0000o0o2;
        View childView = view;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(childView, "childView");
        FriendRequestMessage data = adapter.getData(iIntValue);
        int id = childView.getId();
        if (id == R.id.btAgree) {
            FriendRequestMessageActivity.OooOoo(this.f43798Oooo0o, true, data.getTargetUserId());
        } else if (id == R.id.btRefuse) {
            FriendRequestMessageActivity.OooOoo(this.f43798Oooo0o, false, data.getTargetUserId());
        }
        return Unit.INSTANCE;
    }
}
