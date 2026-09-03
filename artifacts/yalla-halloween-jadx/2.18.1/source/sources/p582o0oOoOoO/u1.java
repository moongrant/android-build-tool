package p582o0oOoOoO;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import com.yalla.yalla.ui.view.MomentDetailForwardView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p174o00OooOO.o0O00OOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u1 implements BaseQuickAdapter.OooOOO0, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f46900OooO0Oo;

    public /* synthetic */ u1(Object obj) {
        this.f46900OooO0Oo = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        MomentDetailForwardView this$0 = (MomentDetailForwardView) this.f46900OooO0Oo;
        int i = MomentDetailForwardView.f24880Oooo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Objects.requireNonNull(this$0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
    public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        BadgeRankDataFragment.m321initView$lambda2((BadgeRankDataFragment) this.f46900OooO0Oo, baseQuickAdapter, view, i);
    }
}
