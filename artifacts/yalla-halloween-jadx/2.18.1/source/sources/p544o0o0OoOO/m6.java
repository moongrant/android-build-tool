package p544o0o0OoOO;

import android.view.View;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class m6 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreActivity f44273Oooo;

    public m6(RoomThemeStoreActivity roomThemeStoreActivity) {
        this.f44273Oooo = roomThemeStoreActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22774Ooooooo;
        RoomThemeStoreActivity roomThemeStoreActivity = this.f44273Oooo;
        Objects.requireNonNull(roomThemeStoreActivity);
        oooO00o.OooO00o(roomThemeStoreActivity);
    }
}
