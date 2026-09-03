package com.yalla.yalla.ui.activity.message;

import android.R;
import android.view.inputmethod.InputMethodManager;
import com.yalla.yalla.ui.vm.message.ShareToFriendVM;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25334OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oO0 f25335OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f25336OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ShareToFriendsActivity shareToFriendsActivity, long j, oO0 oo0) {
        super(0);
        this.f25334OooO0Oo = shareToFriendsActivity;
        this.f25336OooO0o0 = j;
        this.f25335OooO0o = oo0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        ShareToFriendsActivity activity = this.f25334OooO0Oo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = activity.f25284OooOoOO;
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2 = null;
        if (o000ooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000ooo1 = null;
        }
        if (o000ooo1.f27084OooOOo) {
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo3 = activity.f25284OooOoOO;
            if (o000ooo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            } else {
                o000ooo2 = o000ooo3;
            }
            listMutableListOf = CollectionsKt.toMutableList((Collection) o000ooo2.f27086OooOOoo);
        } else {
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(this.f25336OooO0o0));
        }
        List<Long> list = listMutableListOf;
        ShareToFriendVM shareToFriendVMOooOoOO = activity.OooOoOO();
        long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0();
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        Long value = oooO00o.OooO00o().f24538OooO0OO.getValue();
        if (value == null) {
            value = 0L;
        }
        long jLongValue = value.longValue();
        String value2 = oooO00o.OooO00o().f24537OooO0O0.getValue();
        if (value2 == null) {
            value2 = "";
        }
        String value3 = oooO00o.OooO00o().f24536OooO00o.getValue();
        shareToFriendVMOooOoOO.shareRoom(list, jOooO0o0, jLongValue, value2, value3 != null ? value3 : "", this.f25335OooO0o.f44720OooO0O0.getText().toString()).observe(activity, new ShareToFriendsActivity.OooO0OO(new o0O0o(activity)));
        return Unit.INSTANCE;
    }
}
