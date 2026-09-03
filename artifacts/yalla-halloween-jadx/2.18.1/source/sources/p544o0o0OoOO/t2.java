package p544o0o0OoOO;

import android.view.View;
import com.yalla.yalla.common.model.RoomBanEnterUser;
import com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class t2 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ BanEnterRoomListActivity f44311Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ RoomBanEnterUser f44312OoooO00;

    public t2(BanEnterRoomListActivity banEnterRoomListActivity, RoomBanEnterUser roomBanEnterUser) {
        this.f44311Oooo = banEnterRoomListActivity;
        this.f44312OoooO00 = roomBanEnterUser;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
        BanEnterRoomListActivity banEnterRoomListActivity = this.f44311Oooo;
        Objects.requireNonNull(banEnterRoomListActivity);
        UserInfoActivity.OooO00o.OooO0Oo(oooO00o, banEnterRoomListActivity, String.valueOf(this.f44312OoooO00.getUserId()), false, 12);
    }
}
