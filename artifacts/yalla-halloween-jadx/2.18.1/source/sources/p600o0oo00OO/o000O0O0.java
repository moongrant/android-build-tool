package p600o0oo00OO;

import androidx.compose.foundation.BackgroundKt;
import androidx.paging.compose.OooO0OO;
import com.yalla.yalla.model.VisitorUserInfoModel;
import com.yalla.yalla.ui.vm.user.UserVisitorVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000oOoO;
import p031OoooO.o00Oo0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p145o00Oo0.o000O0Oo;
import p261o00ooOoO.u;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0O0 extends Lambda implements Function5<o000oOoO, Integer, VisitorUserInfoModel, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<VisitorUserInfoModel> f48040Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ UserVisitorVM f48041Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(OooO0OO<VisitorUserInfoModel> oooO0OO, UserVisitorVM userVisitorVM) {
        super(5);
        this.f48040Oooo0o = oooO0OO;
        this.f48041Oooo0oO = userVisitorVM;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Unit invoke(o000oOoO o000oooo2, Integer num, VisitorUserInfoModel visitorUserInfoModel, oOO00O ooo00o, Integer num2) {
        o000oOoO itemsIndexed = o000oooo2;
        int iIntValue = num.intValue();
        VisitorUserInfoModel visitorUserInfoModel2 = visitorUserInfoModel;
        oOO00O ooo00o2 = ooo00o;
        num2.intValue();
        Intrinsics.checkNotNullParameter(itemsIndexed, "$this$itemsIndexed");
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (visitorUserInfoModel2 != null) {
            if (visitorUserInfoModel2.getVisitorType()) {
                ooo00o2.OooO0o0(207208329);
                o000OO00.OooO0o0(o000OO00.f48049OooO00o, visitorUserInfoModel2, o000O0Oo.f48042Oooo0o, ooo00o2, 440);
                ooo00o2.Oooo0o0();
            } else {
                ooo00o2.OooO0o0(207208513);
                o000OO00.OooO0o(o000OO00.f48049OooO00o, visitorUserInfoModel2, new o000OO0O(visitorUserInfoModel2, this.f48041Oooo0oO), ooo00o2, 392);
                ooo00o2.Oooo0o0();
            }
            if (iIntValue != this.f48040Oooo0o.OooO0OO() - 1) {
                o00Oo0.OooO00o(BackgroundKt.OooO0O0(o00OOOO0.OooO00o.f4198Oooo0o, u.OooO0O0(ooo00o2).OooO0Oo(), o000O0Oo.f32099OooO00o), u.OooO0O0(ooo00o2).OooOO0o(), (float) 0.5d, 66, ooo00o2, 3456, 0);
            }
        }
        return Unit.INSTANCE;
    }
}
