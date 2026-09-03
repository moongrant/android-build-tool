package com.yalla.yalla.ui.activity.message;

import android.R;
import android.view.inputmethod.InputMethodManager;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.ui.vm.message.ShareToFriendVM;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25991OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EventModel f25992OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f25993OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ p157o00OoOO0.o0OO00O f25994OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(ShareToFriendsActivity shareToFriendsActivity, long j, EventModel eventModel, p157o00OoOO0.o0OO00O o0oo00o2) {
        super(0);
        this.f25991OooO0Oo = shareToFriendsActivity;
        this.f25993OooO0o0 = j;
        this.f25992OooO0o = eventModel;
        this.f25994OooO0oO = o0oo00o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        ShareToFriendsActivity activity = this.f25991OooO0Oo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        com.yalla.yalla.ui.adapter.o000OO00 o000oo01 = activity.f25739OooOoOO;
        com.yalla.yalla.ui.adapter.o000OO00 o000oo02 = null;
        if (o000oo01 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000oo01 = null;
        }
        if (o000oo01.f27542OooOOo) {
            com.yalla.yalla.ui.adapter.o000OO00 o000oo03 = activity.f25739OooOoOO;
            if (o000oo03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o000oo02 = o000oo03;
            }
            listMutableListOf = CollectionsKt.toMutableList((Collection) o000oo02.f27544OooOOoo);
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(this.f25993OooO0o0));
        }
        List<Long> list = listMutableListOf;
        ShareToFriendVM shareToFriendVMOooOoOO = activity.OooOoOO();
        EventModel eventModel = this.f25992OooO0o;
        shareToFriendVMOooOoOO.sendEventRoomMsg(list, eventModel.getId(), eventModel.getEventName(), eventModel.getEventImage(), eventModel.getEventTagId(), eventModel.getEventStartTime(), eventModel.getEventEndTime(), eventModel.getRoomIdx(), eventModel.getRoomName(), eventModel.getRoomServerIP()).observe(activity, new ShareToFriendsActivity.OooO0OO(new o00OO0OO(activity)));
        this.f25994OooO0oO.OooO0OO();
        return Unit.INSTANCE;
    }
}
