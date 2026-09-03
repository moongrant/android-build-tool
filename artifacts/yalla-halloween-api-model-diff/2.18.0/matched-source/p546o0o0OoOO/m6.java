package p546o0o0OoOO;

import android.view.View;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p656o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class m6 extends o00Oo0 {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ RoomThemeStoreActivity f44286OoooO0O;

    public m6(RoomThemeStoreActivity roomThemeStoreActivity) {
        this.f44286OoooO0O = roomThemeStoreActivity;
    }

    @Override // p656o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        WalletActivity.OooO00o oooO00o = WalletActivity.f23287ooOO;
        RoomThemeStoreActivity roomThemeStoreActivity = this.f44286OoooO0O;
        Objects.requireNonNull(roomThemeStoreActivity);
        oooO00o.OooO00o(roomThemeStoreActivity, false);
    }
}
