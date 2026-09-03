package p486o0o00O00;

import android.view.View;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import com.yalla.yalla.ui.activity.main.OooO0O0;
import com.yalla.yalla.ui.vm.user.UserInfoEditVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p377o0OOoOo.o000O000;
import p466o0Oooo0o.oo00o;
import p519o0o0O0oO.O0000000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ChangeRegionActivity f48248OooO0oO;

    public o000000O(ChangeRegionActivity changeRegionActivity) {
        this.f48248OooO0oO = changeRegionActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ChangeRegionActivity changeRegionActivity = this.f48248OooO0oO;
        int i = changeRegionActivity.f25382OooOo0;
        if (i == -1 || i == changeRegionActivity.f25383OooOo00) {
            return;
        }
        Object value = changeRegionActivity.f25385OooOo0o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-changeRegionLoadingDialog>(...)");
        ((O0000000) value).OooO0OO(changeRegionActivity, changeRegionActivity.getResources().getString(oO00OOo0.Setting_Language));
        o000O000.OooO0Oo(UserInfoEditVM.userEdit$default((UserInfoEditVM) changeRegionActivity.f25378OooOOo.getValue(), null, null, null, null, String.valueOf(i), null, null, null, 239, null), changeRegionActivity, false, new o00000(changeRegionActivity), null, new OooO0O0(i, changeRegionActivity), 10);
    }
}
