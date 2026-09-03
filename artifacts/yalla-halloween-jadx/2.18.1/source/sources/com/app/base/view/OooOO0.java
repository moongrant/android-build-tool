package com.app.base.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.data.db.model.ReadPostTable;
import com.yalla.yalla.model.RecommendNewPostModel;
import kotlin.jvm.internal.Intrinsics;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o00O0O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends p188o00o00o0.OooO0OO<RecommendNewPostModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f12073OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(Context context) {
        super(context, R.layout.item_main_moment_following_header);
        this.f12073OooO00o = context;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        RecommendNewPostModel recommendNewPostModel = (RecommendNewPostModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        if (recommendNewPostModel == null) {
            return;
        }
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f12073OooO00o);
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(recommendNewPostModel.getUserHeader());
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.nivHeader));
        ((UserPremiumView) helper.OooO0Oo(R.id.vipView)).OooO0Oo(recommendNewPostModel.isPremium(), recommendNewPostModel.getPremiumLevel());
        helper.OooOO0(R.id.tvName, o00O0O.f42677OooO00o.OooO0O0(recommendNewPostModel.getUserId(), recommendNewPostModel.getUserName()));
        ReadPostTable readPostTableOooO0O0 = p491o0o00O00.OooO0OO.OooO00o().OooOoo0().OooO0O0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), recommendNewPostModel.getUserId());
        View viewOooO0Oo = helper.OooO0Oo(R.id.vHaveNew);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView<View>(R.id.vHaveNew)");
        com.yalla.support.common.util.o00O0O.OooO0oO(viewOooO0Oo, (readPostTableOooO0O0 != null ? readPostTableOooO0O0.getReadPostId() : 0L) != recommendNewPostModel.getMaxDyId());
    }
}
