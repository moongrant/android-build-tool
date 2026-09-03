package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.MemberConveneLayout;
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
public final class OooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f22914Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MemberListConveneActivity f22915Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MemberConveneLayout f22916Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(RoomUserInfoModel roomUserInfoModel, MemberListConveneActivity memberListConveneActivity, MemberConveneLayout memberConveneLayout) {
        super(0);
        this.f22914Oooo0o = roomUserInfoModel;
        this.f22915Oooo0oO = memberListConveneActivity;
        this.f22916Oooo0oo = memberConveneLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z = true;
        if (!this.f22914Oooo0o.getIsSelected()) {
            if (this.f22915Oooo0oO.f22864OooooO0.size() >= this.f22915Oooo0oO.f22865OooooOO) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strOooO00o = OooO00o.OooO0OO.OooO00o(new Object[]{String.valueOf(this.f22915Oooo0oO.f22865OooooOO)}, 1, o000O0O0.OooO0OO(R.string.room_member_convene_max_member), "format(format, *args)");
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (strOooO00o != null && !StringsKt.isBlank(strOooO00o)) {
                    z = false;
                }
                if (!z) {
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO00o, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                    } else {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    }
                }
            } else {
                this.f22914Oooo0o.setSelected(true);
                this.f22915Oooo0oO.f22864OooooO0.put(Long.valueOf(this.f22914Oooo0o.getUserId()), this.f22914Oooo0o);
            }
            return Unit.INSTANCE;
        }
        this.f22914Oooo0o.setSelected(false);
        this.f22915Oooo0oO.f22864OooooO0.remove(Long.valueOf(this.f22914Oooo0o.getUserId()));
        this.f22916Oooo0oo.OooO00o(this.f22914Oooo0o.getIsSelected());
        this.f22915Oooo0oO.Oooo0();
        if (this.f22914Oooo0o.getIsSelected() && (!StringsKt.isBlank(this.f22915Oooo0oO.f22870Ooooooo))) {
            String strOooO0OO = o000O0O0.OooO0OO(R.string.room_member_convene_selected);
            ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (!z) {
                o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O1.run();
                } else {
                    o00O000 o00o002 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                }
            }
            this.f22915Oooo0oO.OooOooo().f50310OooO0o0.getImageClear().performClick();
        }
        return Unit.INSTANCE;
    }
}
