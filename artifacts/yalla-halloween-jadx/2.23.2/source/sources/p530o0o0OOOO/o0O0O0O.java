package p530o0o0OOOO;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.SearchLayout;
import com.yalla.yalla.ui.view.room.RoomMemberConveneSelectItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p405o0Oo0OOO.d1;
import p423o0OoO0OO.o00O0OOO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneSelectItemView f53424OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53425OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f53426OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(RoomMemberConveneSelectItemView roomMemberConveneSelectItemView, RoomUserInfoModel roomUserInfoModel, o0O00oO0 o0o00oo1) {
        super(0);
        this.f53424OooO0Oo = roomMemberConveneSelectItemView;
        this.f53426OooO0o0 = roomUserInfoModel;
        this.f53425OooO0o = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomMemberConveneSelectItemView this_apply = this.f53424OooO0Oo;
        if (!this_apply.getConvening()) {
            RoomUserInfoModel roomUserInfoModel = this.f53426OooO0o0;
            boolean zBooleanValue = roomUserInfoModel.isSelected().getValue().booleanValue();
            o0O00oO0 o0o00oo1 = this.f53425OooO0o;
            if (zBooleanValue) {
                roomUserInfoModel.isSelected().setValue(Boolean.FALSE);
                o0o00oo1.f53402OooOOOO.remove(roomUserInfoModel.getUserId().getValue());
            } else if (o0o00oo1.f53402OooOOOO.size() >= o0o00oo1.OooOOO0()) {
                Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                String strOooO00o = o0000O.OooO00o(o00O0OOO.OooO0O0(o000000.add_up_to_XXX_members, this_apply), String.valueOf(o0o00oo1.OooOOO0()));
                if (!StringsKt.isBlank(strOooO00o)) {
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO00o, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                roomUserInfoModel.isSelected().setValue(Boolean.TRUE);
                o0o00oo1.f53402OooOOOO.put(roomUserInfoModel.getUserId().getValue(), roomUserInfoModel);
            }
            boolean zBooleanValue2 = roomUserInfoModel.isSelected().getValue().booleanValue();
            d1 d1Var = this_apply.f30788OooO0Oo;
            if (zBooleanValue2) {
                d1Var.f43774OooO.setImageResource(o0Oo0oo.room_ic_remove_member_select_green);
            } else {
                d1Var.f43774OooO.setImageResource(o0Oo0oo.room_ic_remove_member_select_gray);
            }
            o0o00oo1.OooOOo0();
            if (roomUserInfoModel.isSelected().getValue().booleanValue()) {
                boolean z = true;
                if (!StringsKt.isBlank(o0o00oo1.f53405OooOOo0)) {
                    Intrinsics.checkNotNullExpressionValue(this_apply, "$this_apply");
                    String strOooO0O0 = o00O0OOO.OooO0O0(o000000.room_member_convene_selected, this_apply);
                    if (strOooO0O0 != null && !StringsKt.isBlank(strOooO0O0)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0O0, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                    SearchLayout searchLayout = o0o00oo1.OooOO0o().f44844OooO0oO;
                    searchLayout.binding.f45394OooO0Oo.setText("");
                    Function0<Unit> function0 = searchLayout.clearListener;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
