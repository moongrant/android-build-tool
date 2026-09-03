package p536o0o0OOoo;

import android.view.View;
import com.yalla.yalla.common.db.table.FriendRequestMessage;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.o00O0;
import p464o0Ooo0oO.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends Lambda implements Function3<o0000O0O<FriendRequestMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f43802Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(3);
        this.f43802Oooo0o = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(o0000O0O<FriendRequestMessage> o0000o0o2, View view, Integer num) {
        o0000O0O<FriendRequestMessage> adapter = o0000o0o2;
        View itemView = view;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        FriendRequestMessageActivity friendRequestMessageActivity = this.f43802Oooo0o;
        long targetUserId = adapter.getData(iIntValue).getTargetUserId();
        FriendRequestMessageActivity.OooO00o oooO00o = FriendRequestMessageActivity.f22157OooooOO;
        Objects.requireNonNull(friendRequestMessageActivity);
        o00O0 o00o1 = new o00O0(friendRequestMessageActivity);
        MoreTag moreTag = MoreTag.delete;
        o00o1.OooOOOo(new MoreModel(o000O0O0.OooO0OO(moreTag.getText()), moreTag));
        o00o1.OooOOoo(new l(friendRequestMessageActivity, targetUserId));
        o00o1.OooOOO0();
        return Boolean.TRUE;
    }
}
