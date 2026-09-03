package androidx.media3.session;

import android.content.Context;
import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O implements o000OOo0.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9303OooO0Oo;

    public /* synthetic */ o000O(Object obj) {
        this.f9303OooO0Oo = obj;
    }

    @Override // androidx.media3.session.o000OOo0.OooO00o
    public final void OooO0O0(o0000OO0 o0000oo1) {
        if (o0000oo1.OooO0o()) {
            o0000oo1.getClass();
            throw null;
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        com.yalla.yalla.ui.fragment.moment.o0OO00O this_apply = (com.yalla.yalla.ui.fragment.moment.o0OO00O) this.f9303OooO0Oo;
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Context context = this_apply.f56423OooOo;
        if (context != null) {
            int i2 = TopicDetailActivity.f25854OooOoOO;
            Object obj = this_apply.f13189OooOOoo.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            TopicDetailActivity.OooO00o.OooO00o(context, (TopicInfoModel) obj);
        }
    }
}
