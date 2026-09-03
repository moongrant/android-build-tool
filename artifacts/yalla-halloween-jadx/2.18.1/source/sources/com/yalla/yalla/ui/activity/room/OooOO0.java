package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.MemberRemoveLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f22919Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MemberListRemoveActivity f22920Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MemberRemoveLayout f22921Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(RoomUserInfoModel roomUserInfoModel, MemberListRemoveActivity memberListRemoveActivity, MemberRemoveLayout memberRemoveLayout) {
        super(0);
        this.f22919Oooo0o = roomUserInfoModel;
        this.f22920Oooo0oO = memberListRemoveActivity;
        this.f22921Oooo0oo = memberRemoveLayout;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.f22919Oooo0o.getIsSelected()) {
            if (this.f22920Oooo0oO.f22890OooooO0.size() >= this.f22920Oooo0oO.f22891OooooOO) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strOooO00o = OooO00o.OooO0OO.OooO00o(new Object[]{String.valueOf(this.f22920Oooo0oO.f22891OooooOO)}, 1, o000O0O0.OooO0OO(R.string.room_member_remove_max_member), "format(format, *args)");
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (!(strOooO00o == null || StringsKt.isBlank(strOooO00o))) {
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO00o, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                    } else {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    }
                }
            } else {
                this.f22919Oooo0o.setSelected(true);
                this.f22920Oooo0oO.f22890OooooO0.add(this.f22919Oooo0o);
            }
            return Unit.INSTANCE;
        }
        this.f22919Oooo0o.setSelected(false);
        this.f22920Oooo0oO.f22890OooooO0.remove(this.f22919Oooo0o);
        this.f22921Oooo0oo.OooO00o(this.f22919Oooo0o.getIsSelected());
        this.f22920Oooo0oO.Oooo000();
        return Unit.INSTANCE;
    }
}
