package p045Oooooo;

import android.content.Context;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.geetest.captcha.GTCaptcha4Client;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailGiftFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o0OO0o.OooOOO0;
import p389o0OOoooO.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00O implements GTCaptcha4Client.OnFailureListener, BaseQuickAdapter.OooO0o, oo0o0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1969OooO0Oo;

    public /* synthetic */ o000O00O(Object obj) {
        this.f1969OooO0Oo = obj;
    }

    @Override // p389o0OOoooO.oo0o0O0
    public final void OooO00o(OooOOO0 oooOOO0) {
        MomentDetailGiftFragment.init$lambda$1((MomentDetailGiftFragment) this.f1969OooO0Oo, oooOOO0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        com.yalla.yalla.ui.activity.moment.OooOOO0 this_apply = (com.yalla.yalla.ui.activity.moment.OooOOO0) this.f1969OooO0Oo;
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Context context = this_apply.f56196OooOo;
        if (context != null) {
            int i2 = TopicDetailActivity.f26305OooOoOO;
            Object obj = this_apply.f10111OooOOoo.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "this.data[position]");
            TopicDetailActivity.OooO00o.OooO00o(context, (TopicInfoModel) obj);
        }
    }

    @Override // com.geetest.captcha.GTCaptcha4Client.OnFailureListener
    public final void onFailure(String str) {
        Function0 callNetFailure = (Function0) this.f1969OooO0Oo;
        Intrinsics.checkNotNullParameter(callNetFailure, "$callNetFailure");
        callNetFailure.invoke();
    }
}
