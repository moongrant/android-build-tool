package p511o0o0O;

import android.view.View;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p269o00oooo0.o0O0oo0o;
import p562o0oOo000.o000000;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51026OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(o00000OO o00000oo2) {
        super(1);
        this.f51026OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o00000OO o00000oo2 = this.f51026OooO0Oo;
        if (o00000oo2.f50958OooO == GiftPropTypeShow.InRoom) {
            RoomUserInfoModel roomUserInfoModel = o00000oo2.f50966OooOOOO;
            RoomUserInfoModel roomUserInfoModel2 = Oooo000.f50936OooO0o;
            if (Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel2)) {
                OooO00o.OooO0O0("102017");
                RoomUserInfoModel roomUserInfoModel3 = o00000oo2.f50976OooOoO;
                if (roomUserInfoModel3 == null) {
                    roomUserInfoModel3 = Oooo000.f50938OooO0oO;
                }
                o00000oo2.OooOoOO(roomUserInfoModel3);
                o00000oo2.f50976OooOoO = null;
            } else if (com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48495OooO0OO.size() < 2) {
                o000O00.OooO00o(o000000.no_user_in_list);
            } else {
                OooO00o.OooO0O0("102016");
                o00000oo2.f50976OooOoO = o00000oo2.f50966OooOOOO;
                o00000oo2.OooOoOO(roomUserInfoModel2);
                o00000oo2.OooOOo0().f44510OooOO0O.setVisibility(8);
                if (o0O0oo0o.OooO00o().OooO0O0("FIRST_SELECT_GIFT_ALL", true)) {
                    o00000oo2.OooOOo0().f44509OooOO0.setVisibility(0);
                    o0O0oo0o.OooO00o().OooO0o("FIRST_SELECT_GIFT_ALL", false);
                    if (OooOo00.OooO0o0()) {
                        o00000oo2.OooOOo0().f44509OooOO0.setTranslationX(o0000O0.OooO00o(15.0f));
                    } else {
                        o00000oo2.OooOOo0().f44509OooOO0.setTranslationX(o0000O0.OooO00o(30.0f));
                    }
                }
                o00000oo2.OooOoO(1);
            }
        }
        return Unit.INSTANCE;
    }
}
