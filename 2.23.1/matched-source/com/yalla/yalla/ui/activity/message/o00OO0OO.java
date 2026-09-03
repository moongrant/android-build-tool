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
public final class o00OO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25452OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EventModel f25453OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f25454OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ p205o00o0o0o.o000O f25455OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(ShareToFriendsActivity shareToFriendsActivity, long j, EventModel eventModel, p205o00o0o0o.o000O o000o) {
        super(0);
        this.f25452OooO0Oo = shareToFriendsActivity;
        this.f25454OooO0o0 = j;
        this.f25453OooO0o = eventModel;
        this.f25455OooO0oO = o000o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        ShareToFriendsActivity activity = this.f25452OooO0Oo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = activity.f25285OooOoOO;
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2 = null;
        if (o000ooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000ooo1 = null;
        }
        if (o000ooo1.f27085OooOOo) {
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo3 = activity.f25285OooOoOO;
            if (o000ooo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o000ooo2 = o000ooo3;
            }
            listMutableListOf = CollectionsKt.toMutableList((Collection) o000ooo2.f27087OooOOoo);
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(this.f25454OooO0o0));
        }
        List<Long> list = listMutableListOf;
        ShareToFriendVM shareToFriendVMOooOoOO = activity.OooOoOO();
        EventModel eventModel = this.f25453OooO0o;
        shareToFriendVMOooOoOO.sendEventRoomMsg(list, eventModel.getId(), eventModel.getEventName(), eventModel.getEventImage(), eventModel.getEventTagId(), eventModel.getEventStartTime(), eventModel.getEventEndTime(), eventModel.getRoomIdx(), eventModel.getRoomName(), eventModel.getRoomServerIP()).observe(activity, new ShareToFriendsActivity.OooO0OO(new o00OO0O0(activity)));
        this.f25455OooO0oO.OooO0OO();
        return Unit.INSTANCE;
    }
}
