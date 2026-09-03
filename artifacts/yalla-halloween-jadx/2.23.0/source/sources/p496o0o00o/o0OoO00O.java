package p496o0o00o;

import android.view.View;
import com.yalla.yalla.model.user.UserHeaderFrameModel;
import com.yalla.yalla.ui.activity.user.OooOOO;
import com.yalla.yalla.ui.activity.user.UserHeaderFrameActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p377o0OOoOo.o000O0;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p426o0OoOO.o0OOO0o;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f49109OooO0oO;

    public o0OoO00O(UserHeaderFrameActivity userHeaderFrameActivity) {
        this.f49109OooO0oO = userHeaderFrameActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        UserHeaderFrameActivity userHeaderFrameActivity = this.f49109OooO0oO;
        UserHeaderFrameModel userHeaderFrameModel = userHeaderFrameActivity.f27234OooOo0O;
        if (userHeaderFrameModel == null || userHeaderFrameModel.getLocalTypeModel() != 1) {
            return;
        }
        String pic = userHeaderFrameModel.getPic();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(pic, o000000O.OooO().getValue()) || (i = userHeaderFrameActivity.f27231OooOo) < 0) {
            return;
        }
        userHeaderFrameActivity.f27232OooOo0 = true;
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        o000O0.OooO0O0(userHeaderFrameActivity, o0OOO0o.OooO00o(userHeaderFrameModel.getHeadframeid()), new OooOOO(i, userHeaderFrameModel, userHeaderFrameActivity));
    }
}
