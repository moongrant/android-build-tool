package p200o00o0o;

import android.content.Context;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.moment.o000000;
import kotlin.jvm.internal.Intrinsics;
import p245o00oo0o.o00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00 implements o00O.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39119OooO0Oo;

    public /* synthetic */ o00(Object obj) {
        this.f39119OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        o000000 this_apply = (o000000) this.f39119OooO0Oo;
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Context context = this_apply.f56196OooOo;
        if (context != null) {
            int i2 = TopicDetailActivity.f26305OooOoOO;
            Object obj = this_apply.f10111OooOOoo.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "this.data[position]");
            TopicDetailActivity.OooO00o.OooO00o(context, (TopicInfoModel) obj);
        }
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).o00O0O();
    }
}
