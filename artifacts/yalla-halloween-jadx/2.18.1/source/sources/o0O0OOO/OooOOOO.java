package o0O0OOO;

import android.view.View;
import com.app.base.model.UserHeaderFrameModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.user.UserHeaderFrameActivity;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p286o0O0O0oO.o0OO00O;
import p288o0O0OOo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOOO implements o00Oo0.OooO00o, BaseQuickAdapter.OooOOOO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f35579OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f35580OooO0o0;

    public /* synthetic */ OooOOOO(Object obj, Object obj2) {
        this.f35579OooO0Oo = obj;
        this.f35580OooO0o0 = obj2;
    }

    @Override // o0O0OOo.o00Oo0.OooO00o
    public final Object OooO0O0() {
        OooOo oooOo = (OooOo) this.f35579OooO0Oo;
        return Boolean.valueOf(oooOo.f35584OooO0OO.OooOOo0((o0OO00O) this.f35580OooO0o0));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.UserHeaderFrameModel>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<com.app.base.model.UserHeaderFrameModel>] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2;
        UserHeaderFrameActivity this$0 = (UserHeaderFrameActivity) this.f35579OooO0Oo;
        com.yalla.yalla.ui.activity.user.OooO0o this_apply = (com.yalla.yalla.ui.activity.user.OooO0o) this.f35580OooO0o0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        UserHeaderFrameModel userHeaderFrameModel = (UserHeaderFrameModel) this$0.f23443Ooooo00.get(i);
        if (this$0.f23444Ooooo0o || userHeaderFrameModel.getLocalTypeModel() == 2 || userHeaderFrameModel.getLocalTypeModel() == 3) {
            return;
        }
        this$0.OooOooO().f49144OooO0Oo.setVisibility(8);
        this$0.f23445OooooO0 = userHeaderFrameModel;
        int i3 = 0;
        for (Object obj : this$0.f23443Ooooo00) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UserHeaderFrameModel userHeaderFrameModel2 = (UserHeaderFrameModel) obj;
            if (userHeaderFrameModel2.getLocalIsSelect()) {
                userHeaderFrameModel2.setLocalIsSelect(false);
                this_apply.notifyItemChanged(i3);
            }
            i3 = i4;
        }
        if (userHeaderFrameModel.getLocalTypeModel() == 1) {
            String value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0oO().getValue();
            UserHeaderFrameModel userHeaderFrameModel3 = this$0.f23445OooooO0;
            if (!Intrinsics.areEqual(value, userHeaderFrameModel3 != null ? userHeaderFrameModel3.getPic() : null)) {
                this$0.OooOooO().f49144OooO0Oo.setVisibility(0);
            }
            i2 = i;
        } else {
            i2 = -1;
        }
        this$0.f23447OooooOo = i2;
        userHeaderFrameModel.setLocalIsSelect(true);
        UserHeaderFrameActivity.OooOoo(this$0, this$0.f23445OooooO0);
        this_apply.notifyItemChanged(i);
    }
}
