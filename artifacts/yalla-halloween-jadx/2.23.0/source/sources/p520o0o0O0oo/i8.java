package p520o0o0O0oo;

import android.view.View;
import com.android.billingclient.api.o0000OO0;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class i8 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53303OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(x6 x6Var) {
        super(1);
        this.f53303OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        x6 x6Var = this.f53303OooO0Oo;
        if (x6Var.f53374OooO == GiftPropTypeShow.InRoom) {
            RoomUserInfoModel roomUserInfoModel = x6Var.f53382OooOOOO;
            RoomUserInfoModel roomUserInfoModel2 = d6.f53264OooO0o;
            if (Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel2)) {
                o0OO000.OooO00o("102017");
                RoomUserInfoModel roomUserInfoModel3 = x6Var.f53392OooOoO;
                if (roomUserInfoModel3 == null) {
                    roomUserInfoModel3 = d6.f53266OooO0oO;
                }
                x6Var.OooOoOO(roomUserInfoModel3);
                x6Var.f53392OooOoO = null;
            } else if (OooO00o.f24981OooOO0.f47414OooO0OO.size() < 2) {
                o000O00O.OooO00o(oO00OOo0.no_user_in_list);
            } else {
                o0OO000.OooO00o("102016");
                x6Var.f53392OooOoO = x6Var.f53382OooOOOO;
                x6Var.OooOoOO(roomUserInfoModel2);
                x6Var.OooOOo().f58226OooOO0O.setVisibility(8);
                if (o0000OO0.OooO0O0().OooO0O0("FIRST_SELECT_GIFT_ALL", true)) {
                    x6Var.OooOOo().f58225OooOO0.setVisibility(0);
                    o0000OO0.OooO0O0().OooO0o("FIRST_SELECT_GIFT_ALL", false);
                    if (OooO.OooO0o0()) {
                        x6Var.OooOOo().f58225OooOO0.setTranslationX(o0000O0.OooO00o(15.0f));
                    } else {
                        x6Var.OooOOo().f58225OooOO0.setTranslationX(o0000O0.OooO00o(30.0f));
                    }
                }
                x6Var.OooOoO(1);
            }
        }
        return Unit.INSTANCE;
    }
}
