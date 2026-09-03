package p501o0o00o;

import android.view.View;
import com.android.billingclient.api.o00000O;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o00oOoo;
import p391o0OOooOo.o0O00000;
import p530o0o0OOO.o00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41501Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(o000 o000Var) {
        super(1);
        this.f41501Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o000 o000Var = this.f41501Oooo0o;
        if (o000Var.f41394OooO == GiftPropTypeShow.InRoom) {
            RoomUserInfoModel roomUserInfoModel = o000Var.f41406OooOOoo;
            o00000.OooO00o oooO00o = o00000.f41437OooO0o0;
            RoomUserInfoModel roomUserInfoModel2 = o00000.f41438OooO0oO;
            if (Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel2)) {
                OooOo.OooO0O0("102017");
                o000 o000Var2 = this.f41501Oooo0o;
                RoomUserInfoModel roomUserInfoModel3 = o000Var2.f41411OooOo0o;
                if (roomUserInfoModel3 == null) {
                    roomUserInfoModel3 = o00000.f41439OooO0oo;
                }
                o000Var2.OooOooO(roomUserInfoModel3);
                this.f41501Oooo0o.f41411OooOo0o = null;
            } else {
                o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
                if (o00O.OooOO0.f43246OooO0Oo.size() < 2) {
                    o00oOoo.OooO00o(R.string.no_user_in_list);
                } else {
                    OooOo.OooO0O0("102016");
                    o000 o000Var3 = this.f41501Oooo0o;
                    o000Var3.f41411OooOo0o = o000Var3.f41406OooOOoo;
                    o000Var3.OooOooO(roomUserInfoModel2);
                    o0O00000.OooO0OO("InRoom_gift_selectAll");
                    this.f41501Oooo0o.OooOo00().f50844OooOOO.setVisibility(8);
                    if (o00000O.OooO0O0().OooO0Oo("FIRST_SELECT_GIFT_ALL", true)) {
                        this.f41501Oooo0o.OooOo00().f50845OooOOO0.setVisibility(0);
                        o00000O.OooO0O0().OooO0oo("FIRST_SELECT_GIFT_ALL", false);
                        if (oo000o.OooO0o0()) {
                            this.f41501Oooo0o.OooOo00().f50845OooOOO0.setTranslationX(OooOo00.OooO00o(15.0f));
                        } else {
                            this.f41501Oooo0o.OooOo00().f50845OooOOO0.setTranslationX(OooOo00.OooO00o(30.0f));
                        }
                    }
                    o000 o000Var4 = this.f41501Oooo0o;
                    if (o000Var4.f41409OooOo00 > 1) {
                        o000Var4.OooOoo0(1);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
