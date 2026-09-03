package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.MemberRemoveLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import p405o0Oo0OOO.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f26379OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MemberRemoveLayout f26380OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MemberListRemoveActivity f26381OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(RoomUserInfoModel roomUserInfoModel, MemberListRemoveActivity memberListRemoveActivity, MemberRemoveLayout memberRemoveLayout) {
        super(0);
        this.f26379OooO0Oo = roomUserInfoModel;
        this.f26381OooO0o0 = memberListRemoveActivity;
        this.f26380OooO0o = memberRemoveLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomUserInfoModel roomUserInfoModel = this.f26379OooO0Oo;
        boolean zBooleanValue = roomUserInfoModel.isSelected().getValue().booleanValue();
        MemberListRemoveActivity memberListRemoveActivity = this.f26381OooO0o0;
        if (!zBooleanValue) {
            int size = memberListRemoveActivity.f26115OooOo0O.size();
            int i = memberListRemoveActivity.f26116OooOo0o;
            if (size >= i) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                boolean z = true;
                String strOooO00o = OooO0O0.OooO0O0.OooO00o(new Object[]{String.valueOf(i)}, 1, com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_member_remove_max_member), "format(format, *args)");
                if (strOooO00o != null && !StringsKt.isBlank(strOooO00o)) {
                    z = false;
                }
                if (!z) {
                    com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO00o, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else {
                roomUserInfoModel.isSelected().setValue(Boolean.TRUE);
                memberListRemoveActivity.f26115OooOo0O.add(roomUserInfoModel);
            }
            return Unit.INSTANCE;
        }
        roomUserInfoModel.isSelected().setValue(Boolean.FALSE);
        memberListRemoveActivity.f26115OooOo0O.remove(roomUserInfoModel);
        boolean zBooleanValue2 = roomUserInfoModel.isSelected().getValue().booleanValue();
        v0 v0Var = this.f26380OooO0o.f29953OooO0Oo;
        if (zBooleanValue2) {
            v0Var.f45614OooO0Oo.setImageResource(p562o0oOo000.o0Oo0oo.room_ic_remove_member_select_green);
        } else {
            v0Var.f45614OooO0Oo.setImageResource(p562o0oOo000.o0Oo0oo.room_ic_remove_member_select_gray);
        }
        memberListRemoveActivity.OooOoOO();
        return Unit.INSTANCE;
    }
}
