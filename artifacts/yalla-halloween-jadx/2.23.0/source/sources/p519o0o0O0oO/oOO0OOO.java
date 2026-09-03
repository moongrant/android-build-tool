package p519o0o0O0oO;

import android.view.View;
import android.widget.PopupWindow;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p362o0OOo0O.OooOO0;
import p406o0Oo0Ooo.oOO0O0O;
import p524o0o0OO0o.o0O00;
import p543o0oO0O00.OooO;
import p562o0oOo0O.o000oOoO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOO0OOO implements BaseQuickAdapter.OooO0o, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f52981OooO0Oo;

    public /* synthetic */ oOO0OOO(o00O00OO o00o00oo2) {
        this.f52981OooO0Oo = o00o00oo2;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        o0O00 this$0 = (o0O00) this.f52981OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!StringsKt.isBlank(this$0.f53471OooOOo0)) {
            this$0.OooOOOo(this$0.f53471OooOOo0, false);
        } else {
            this$0.OooOOO(false);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ooooO0O0 this$0 = (ooooO0O0) this.f52981OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oOOO0O0o oooo0o0o = this$0.f53061OooOooO;
        if (oooo0o0o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupAdapter");
            oooo0o0o = null;
        }
        RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) oooo0o0o.f10111OooOOoo.get(i);
        this$0.f53060OooOoo0 = roomUserInfoModel.getUserId().getValue().longValue();
        if (i == 0) {
            this$0.OooOO0().f59480OooOOOO.setImageResource(oOo00OO0.icon_default_head_circle);
        } else {
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this$0.f52532OooO0Oo);
            oooO00o.OooO00o(OooO.OooO0OO());
            oooO00o.f43911OooO0OO = roomUserInfoModel.getUserHeader().getValue();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(this$0.OooOO0().f59480OooOOOO);
        }
        this$0.OooOO0().f59492OooOoOO.setText(oOO0O0O.OooO0O0(this$0.f53060OooOoo0, roomUserInfoModel.getUserName().getValue()));
        PopupWindow popupWindow = this$0.f53059OooOoo;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }
}
