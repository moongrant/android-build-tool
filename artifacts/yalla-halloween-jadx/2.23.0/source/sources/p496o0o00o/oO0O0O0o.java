package p496o0o00o;

import android.view.View;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;
import p500o0o00oO.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0O0o extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserRoomsActivity f49162OooO0oO;

    public oO0O0O0o(UserRoomsActivity userRoomsActivity) {
        this.f49162OooO0oO = userRoomsActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UserRoomsActivity userRoomsActivity = this.f49162OooO0oO;
        o00000O0<RoomIndexModel> o00000o1 = userRoomsActivity.f27366OooOo0O;
        Intrinsics.checkNotNull(o00000o1);
        o00000o1.Oooo00O(true);
        userRoomsActivity.f27367OooOo0o = 1;
        userRoomsActivity.OooOoO0(true);
    }
}
