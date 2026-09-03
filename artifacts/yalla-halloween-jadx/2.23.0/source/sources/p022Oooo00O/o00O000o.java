package p022Oooo00O;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.view.GifFaceView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O000o implements o00O000.OooO0OO, BaseQuickAdapter.OooOO0, BaseQuickAdapter.OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f612OooO0Oo;

    public /* synthetic */ o00O000o(Object obj) {
        this.f612OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        TopicInfoActivity this$0 = (TopicInfoActivity) this.f612OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TopicInfoActivity.OooOo(this$0, false);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0OO
    public final void OooO0O0(View view, int i) {
        GifFaceView this$0 = (GifFaceView) this.f612OooO0Oo;
        int i2 = GifFaceView.f30449OooOOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f30457OooOO0O.clear();
        int childCount = this$0.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childView = this$0.getChildAt(i3);
            ArrayList arrayList = this$0.f30457OooOO0O;
            Intrinsics.checkNotNullExpressionValue(childView, "childView");
            arrayList.add(childView);
        }
        this$0.f30450OooO = false;
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        ((o000O0Oo.OooOO0) this.f612OooO0Oo).f545OooO00o.f846OooOO0.OooO00o(oooO00o, true);
        return "TorchOn";
    }
}
