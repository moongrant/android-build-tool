package p524o0o0OO0o;

import com.code.android.util.o000OO00;
import com.yalla.yalla.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00oO0 extends Lambda implements Function1<CheckConveneMemberStatusModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53500OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00oO0(o0O00 o0o01) {
        super(1);
        this.f53500OooO0Oo = o0o01;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CheckConveneMemberStatusModel checkConveneMemberStatusModel) {
        CheckConveneMemberStatusModel checkConveneMemberStatusModel2 = checkConveneMemberStatusModel;
        o0O00 o0o01 = this.f53500OooO0Oo;
        o0o01.f53474OooOo0 = checkConveneMemberStatusModel2;
        boolean z = !(checkConveneMemberStatusModel2 != null && checkConveneMemberStatusModel2.getState() == 0);
        o0o01.f53476OooOo0O = z;
        if (z) {
            SearchLayout searchLayout = o0o01.OooOO0o().f58263OooO0oO;
            Intrinsics.checkNotNullExpressionValue(searchLayout, "binding.searchView");
            o000OO00.OooO0O0(searchLayout);
        }
        o0o01.OooOO0O().notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
