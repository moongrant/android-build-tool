package p487o0o00O;

import android.view.View;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import com.yalla.yalla.ui.activity.main.OooO0O0;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p384o0OOoo0O.o00O0O;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;
import p650o0ooo.a;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ChangeRegionActivity f48752OooO0oO;

    public o00000O0(ChangeRegionActivity changeRegionActivity) {
        this.f48752OooO0oO = changeRegionActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ChangeRegionActivity changeRegionActivity = this.f48752OooO0oO;
        int i = changeRegionActivity.f24928OooOo0;
        if (i == -1 || i == changeRegionActivity.f24929OooOo00) {
            return;
        }
        Object value = changeRegionActivity.f24931OooOo0o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((a) value).OooO0OO(changeRegionActivity, changeRegionActivity.getResources().getString(o000000.Setting_Language));
        o00O0O.OooO0Oo(UserInfoEditVM.userEdit$default((UserInfoEditVM) changeRegionActivity.f24924OooOOo.getValue(), null, null, null, null, String.valueOf(i), null, null, null, 239, null), changeRegionActivity, false, new o00000O(changeRegionActivity), null, new OooO0O0(i, changeRegionActivity), 10);
    }
}
