package p544o0o0OoOO;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.RoomBanEnterUser;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p255o00ooO0o.oo0oOO0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class u2 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f44316Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ RoomBanEnterUser f44317OoooO00;

    public u2(BanEnterRoomListActivity banEnterRoomListActivity, RoomBanEnterUser roomBanEnterUser) {
        this.f44316Oooo = banEnterRoomListActivity;
        this.f44317OoooO00 = roomBanEnterUser;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        BanEnterRoomListActivity banEnterRoomListActivity = this.f44316Oooo;
        RoomBanEnterUser roomBanEnterUser = this.f44317OoooO00;
        int i = BanEnterRoomListActivity.f22745o00O0O;
        Objects.requireNonNull(banEnterRoomListActivity);
        oo0oOO0 oo0ooo0 = new oo0oOO0(banEnterRoomListActivity);
        String string = banEnterRoomListActivity.getString(R.string.UnBan_enter_room);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.UnBan_enter_room)");
        oo0ooo0.OooOo0O(string);
        oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
        oo0ooo0.OooOo0o(new c3(roomBanEnterUser));
        oo0ooo0.OooOOO0();
    }
}
