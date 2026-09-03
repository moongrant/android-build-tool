package com.yalla.yalla.ui.fragment;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.RoomMemberConveneSelectItemView;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneSelectItemView f24481Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f24482Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneListDialog f24483Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(RoomMemberConveneSelectItemView roomMemberConveneSelectItemView, RoomUserInfoModel roomUserInfoModel, RoomMemberConveneListDialog roomMemberConveneListDialog) {
        super(0);
        this.f24481Oooo0o = roomMemberConveneSelectItemView;
        this.f24482Oooo0oO = roomUserInfoModel;
        this.f24483Oooo0oo = roomMemberConveneListDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.f24481Oooo0o.getConvening()) {
            boolean z = true;
            if (this.f24482Oooo0oO.getIsSelected()) {
                this.f24482Oooo0oO.setSelected(false);
                this.f24483Oooo0oo.f24162OoooOOo.remove(Long.valueOf(this.f24482Oooo0oO.getUserId()));
            } else if (this.f24483Oooo0oo.f24162OoooOOo.size() >= RoomMemberConveneListDialog.OooOO0O(this.f24483Oooo0oo)) {
                String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.add_up_to_XXX_members), String.valueOf(RoomMemberConveneListDialog.OooOO0O(this.f24483Oooo0oo)));
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (!StringsKt.isBlank(strOooO00o)) {
                    o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO00o, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o0o0oooOooO0O0.run();
                    } else {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                    }
                }
            } else {
                this.f24482Oooo0oO.setSelected(true);
                this.f24483Oooo0oo.f24162OoooOOo.put(Long.valueOf(this.f24482Oooo0oO.getUserId()), this.f24482Oooo0oO);
            }
            this.f24481Oooo0o.OooO00o(this.f24482Oooo0oO.getIsSelected());
            this.f24483Oooo0oo.OooOOoo();
            if (this.f24482Oooo0oO.getIsSelected() && (!StringsKt.isBlank(this.f24483Oooo0oo.f24164OoooOoO))) {
                String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_member_convene_selected);
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
                SearchLayout searchLayout = this.f24483Oooo0oo.OooOOO().f49175OooO0oO;
                searchLayout.f25148Oooo0o.f49415OooO0Oo.setText("");
                Function0<Unit> function0 = searchLayout.clearListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
