package p492o0o00OO0;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0OO00 implements BaseQuickAdapter.OooOO0, BaseQuickAdapter.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f49440OooO0Oo;

    public /* synthetic */ oO0OO00(Object obj) {
        this.f49440OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        TopicInfoActivity this$0 = (TopicInfoActivity) this.f49440OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TopicInfoActivity.OooOo(this$0, false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
    public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        BadgeFragment.initView$lambda$4((BadgeFragment) this.f49440OooO0Oo, baseQuickAdapter, view, i);
    }
}
