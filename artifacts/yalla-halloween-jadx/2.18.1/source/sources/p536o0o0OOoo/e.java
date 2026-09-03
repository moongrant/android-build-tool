package p536o0o0OOoo;

import android.view.View;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Ooo0oO.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends Lambda implements Function3<o0000O0O<FriendInfo>, View, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f43774Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AtFriendsActivity atFriendsActivity) {
        super(3);
        this.f43774Oooo0o = atFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0000O0O<FriendInfo> o0000o0o2, View view, Integer num) {
        o0000O0O<FriendInfo> adapter = o0000o0o2;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        AtFriendsActivity.OooOooO(this.f43774Oooo0o, adapter.getData(iIntValue), iIntValue);
        return Unit.INSTANCE;
    }
}
