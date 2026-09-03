package p524o0o0OO0o;

import android.os.Looper;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.SearchLayout;
import com.yalla.yalla.ui.view.room.RoomMemberConveneSelectItemView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p417o0OoO0.o000O0;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.o9;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneSelectItemView f53513OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53514OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f53515OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(RoomMemberConveneSelectItemView roomMemberConveneSelectItemView, RoomUserInfoModel roomUserInfoModel, o0O00 o0o01) {
        super(0);
        this.f53513OooO0Oo = roomMemberConveneSelectItemView;
        this.f53515OooO0o0 = roomUserInfoModel;
        this.f53514OooO0o = o0o01;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomMemberConveneSelectItemView invoke = this.f53513OooO0Oo;
        if (!invoke.getConvening()) {
            RoomUserInfoModel roomUserInfoModel = this.f53515OooO0o0;
            boolean zBooleanValue = roomUserInfoModel.isSelected().getValue().booleanValue();
            o0O00 o0o01 = this.f53514OooO0o;
            if (zBooleanValue) {
                roomUserInfoModel.isSelected().setValue(Boolean.FALSE);
                o0o01.f53468OooOOOO.remove(roomUserInfoModel.getUserId().getValue());
            } else if (o0o01.f53468OooOOOO.size() >= o0o01.OooOOO0()) {
                Intrinsics.checkNotNullExpressionValue(invoke, "invoke");
                String strOooO00o = o0000O.OooO00o(o000O0.OooO0O0(oO00OOo0.add_up_to_XXX_members, invoke), String.valueOf(o0o01.OooOOO0()));
                if (!StringsKt.isBlank(strOooO00o)) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                roomUserInfoModel.isSelected().setValue(Boolean.TRUE);
                o0o01.f53468OooOOOO.put(roomUserInfoModel.getUserId().getValue(), roomUserInfoModel);
            }
            boolean zBooleanValue2 = roomUserInfoModel.isSelected().getValue().booleanValue();
            o9 o9Var = invoke.f31329OooO0Oo;
            if (zBooleanValue2) {
                o9Var.f58537OooO.setImageResource(oOo00OO0.room_ic_remove_member_select_green);
            } else {
                o9Var.f58537OooO.setImageResource(oOo00OO0.room_ic_remove_member_select_gray);
            }
            o0o01.OooOOo0();
            if (roomUserInfoModel.isSelected().getValue().booleanValue()) {
                boolean z = true;
                if (!StringsKt.isBlank(o0o01.f53471OooOOo0)) {
                    Intrinsics.checkNotNullExpressionValue(invoke, "invoke");
                    String strOooO0O0 = o000O0.OooO0O0(oO00OOo0.room_member_convene_selected, invoke);
                    if (strOooO0O0 != null && !StringsKt.isBlank(strOooO0O0)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0O0, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                    SearchLayout searchLayout = o0o01.OooOO0o().f58263OooO0oO;
                    searchLayout.binding.f57529OooO0Oo.setText("");
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
