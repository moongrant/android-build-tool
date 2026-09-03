package p530o0o0OOOO;

import com.code.android.util.o000O;
import com.yalla.yalla.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends Lambda implements Function1<CheckConveneMemberStatusModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53431OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(o0O00oO0 o0o00oo1) {
        super(1);
        this.f53431OooO0Oo = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CheckConveneMemberStatusModel checkConveneMemberStatusModel) {
        CheckConveneMemberStatusModel checkConveneMemberStatusModel2 = checkConveneMemberStatusModel;
        o0O00oO0 o0o00oo1 = this.f53431OooO0Oo;
        o0o00oo1.f53408OooOo0 = checkConveneMemberStatusModel2;
        boolean z = !(checkConveneMemberStatusModel2 != null && checkConveneMemberStatusModel2.getState() == 0);
        o0o00oo1.f53410OooOo0O = z;
        if (z) {
            SearchLayout searchView = o0o00oo1.OooOO0o().f44844OooO0oO;
            Intrinsics.checkNotNullExpressionValue(searchView, "searchView");
            o000O.OooO0O0(searchView);
        }
        o0o00oo1.OooOO0O().notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
