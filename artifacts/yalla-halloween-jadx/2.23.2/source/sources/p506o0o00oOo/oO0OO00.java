package p506o0o00oOo;

import android.view.View;
import androidx.compose.foundation.layout.oo000o;
import com.yalla.yalla.model.user.UserHeaderFrameModel;
import com.yalla.yalla.ui.activity.user.OooOOO;
import com.yalla.yalla.ui.activity.user.UserHeaderFrameActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p384o0OOoo0O.o0ooOOo;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f50493OooO0oO;

    public oO0OO00(UserHeaderFrameActivity userHeaderFrameActivity) {
        this.f50493OooO0oO = userHeaderFrameActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        UserHeaderFrameActivity userHeaderFrameActivity = this.f50493OooO0oO;
        UserHeaderFrameModel userHeaderFrameModel = userHeaderFrameActivity.f26769OooOo0O;
        if (userHeaderFrameModel == null || userHeaderFrameModel.getLocalTypeModel() != 1) {
            return;
        }
        String pic = userHeaderFrameModel.getPic();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(pic, o0O00oO0.OooO().getValue()) || (i = userHeaderFrameActivity.f26766OooOo) < 0) {
            return;
        }
        userHeaderFrameActivity.f26767OooOo0 = true;
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        o0ooOOo.OooO0O0(userHeaderFrameActivity, oo000o.OooO00o(userHeaderFrameModel.getHeadframeid()), new OooOOO(i, userHeaderFrameModel, userHeaderFrameActivity));
    }
}
