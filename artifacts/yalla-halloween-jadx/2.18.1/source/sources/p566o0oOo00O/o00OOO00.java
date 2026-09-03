package p566o0oOo00O;

import android.view.View;
import com.app.base.model.UserHeaderFrameModel;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.yalla.ui.activity.user.UserHeaderFrameActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO00 extends OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f45278Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(UserHeaderFrameActivity userHeaderFrameActivity) {
        super(0L, 1, null);
        this.f45278Oooo0o = userHeaderFrameActivity;
    }

    @Override // com.yalla.support.common.util.OooOOO0
    public final void onNoDoubleClick(@NotNull View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        UserHeaderFrameActivity userHeaderFrameActivity = this.f45278Oooo0o;
        UserHeaderFrameModel userHeaderFrameModel = userHeaderFrameActivity.f23445OooooO0;
        if (userHeaderFrameModel == null || userHeaderFrameModel.getLocalTypeModel() != 1 || Intrinsics.areEqual(userHeaderFrameModel.getPic(), OooOOO.f41216OooO00o.OooO0oo().getValue()) || (i = userHeaderFrameActivity.f23447OooooOo) < 0) {
            return;
        }
        userHeaderFrameActivity.f23444Ooooo0o = true;
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o00000OO.f32209OooO0OO.OooO0OO(userHeaderFrameActivity, userHeaderFrameModel.getHeadframeid() + "", new o00OOO0O(userHeaderFrameActivity, i, userHeaderFrameModel));
    }
}
