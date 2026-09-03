package p600o0oo00OO;

import androidx.paging.compose.OooO0OO;
import androidx.paging.compose.OooOO0;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.VisitorUserInfoModel;
import com.yalla.yalla.ui.vm.user.UserVisitorVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000;
import p043OooooO0.o00O0000;
import p254o00ooO0O.o000O0O0;
import p259o00ooOo.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O extends Lambda implements Function1<o000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<VisitorUserInfoModel> f48029Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ UserVisitorVM f48030Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(OooO0OO<VisitorUserInfoModel> oooO0OO, UserVisitorVM userVisitorVM) {
        super(1);
        this.f48029Oooo0o = oooO0OO;
        this.f48030Oooo0oO = userVisitorVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000 o000Var) {
        o000 LazyColumn = o000Var;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooO0OO<VisitorUserInfoModel> oooO0OO = this.f48029Oooo0o;
        OooOO0.OooO0OO(LazyColumn, oooO0OO, o00O0000.OooO0O0(-1465616431, true, new o000O0O0(oooO0OO, this.f48030Oooo0oO)));
        OooO0OO<VisitorUserInfoModel> oooO0OO2 = this.f48029Oooo0o;
        o0O00.OooO0Oo(LazyColumn, oooO0OO2, oooO0OO2.OooO0OO() >= 100 ? o000O0O0.OooO0OO(R.string.Visitor_quantitative_restrictions) : o000O0O0.OooO0OO(R.string.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
