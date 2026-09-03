package p535o0o0OOoO;

import com.chad.library.adapter.base.OooO00o;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oOo0000O extends OooO0OO<ChangeRegionActivity.OooO0O0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ChangeRegionActivity f43721OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0000O(ChangeRegionActivity changeRegionActivity, ArrayList<ChangeRegionActivity.OooO0O0> arrayList) {
        super(changeRegionActivity, R.layout.item_change_region, arrayList);
        this.f43721OooO00o = changeRegionActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        OooO0o helper = (OooO0o) oooO00o;
        ChangeRegionActivity.OooO0O0 item = (ChangeRegionActivity.OooO0O0) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.OooOO0(R.id.tv_language, item.f21940OooO00o);
        int i = item.f21941OooO0O0;
        ChangeRegionActivity changeRegionActivity = this.f43721OooO00o;
        int i2 = changeRegionActivity.f21936Ooooo00;
        if (i2 == -1) {
            i2 = changeRegionActivity.f21935OoooOoo;
        }
        if (i == i2) {
            helper.OooOO0O(R.id.tv_language, o000O0O0.OooO00o(R.color.color_00d8c9));
            helper.OooO0oO(R.id.iv_language_selected, true);
        } else {
            helper.OooOO0O(R.id.tv_language, o000O0O0.OooO00o(R.color.color_alpha_87));
            helper.OooO0oO(R.id.iv_language_selected, false);
        }
    }
}
