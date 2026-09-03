package p501o0o00o;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p520o0o0O0O0.o00O0O;
import p522o0o0O0o.o00O00O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo extends OooO0OO<RoomUserInfoModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00000 f41459OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(o00000 o00000Var, Context context) {
        super(context, R.layout.item_spinner_user_select);
        this.f41459OooO00o = o00000Var;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        RoomUserInfoModel item = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View viewOooO0Oo = helper.OooO0Oo(R.id.vLine);
        Objects.requireNonNull(this.f41459OooO00o.f41441OooO0O0);
        viewOooO0Oo.setBackgroundColor(o000O0O0.OooO00o(R.color.color_white_8));
        viewOooO0Oo.setBackgroundColor(o000O0O0.OooO00o(R.color.rec_color_00D8C9));
        if (helper.getLayoutPosition() < 0 || helper.getLayoutPosition() >= getData().size()) {
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "");
            oOO00O.OooO(viewOooO0Oo);
        } else {
            Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "");
            oOO00O.OooO00o(viewOooO0Oo);
        }
        TextView textView = (TextView) helper.OooO0Oo(R.id.tv_user_select);
        NetImageView netImageView = (NetImageView) helper.OooO0Oo(R.id.nivHeader);
        Objects.requireNonNull(this.f41459OooO00o.f41441OooO0O0);
        textView.setTextColor(o000O0O0.OooO00o(R.color.color_white));
        o00000.OooO00o oooO00o2 = o00000.f41437OooO0o0;
        if (Intrinsics.areEqual(item, o00000.f41439OooO0oo)) {
            textView.setText(item.getUserName());
            netImageView.setImageResource(item.getHeadPhotoResId());
            return;
        }
        textView.setText(o00O0O.f42677OooO00o.OooO0O0(item.getUserId(), item.getUserName()));
        oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(getContext());
        oooO00o3.f48429OooO0OO = o00O00O.OooO00o(item.getUserHeader());
        oooO00o3.f48427OooO00o = 0;
        oooO00o3.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o3.OooO0o(netImageView);
    }
}
