package com.yalla.yalla.ui.activity.message;

import android.R;
import android.view.inputmethod.InputMethodManager;
import com.yalla.yalla.model.share.ShareActivityModel;
import com.yalla.yalla.ui.vm.message.ShareToFriendVM;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.oOo000Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25467OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ShareActivityModel f25468OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f25469OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oOo000Oo f25470OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(ShareToFriendsActivity shareToFriendsActivity, long j, ShareActivityModel shareActivityModel, oOo000Oo ooo000oo) {
        super(0);
        this.f25467OooO0Oo = shareToFriendsActivity;
        this.f25469OooO0o0 = j;
        this.f25468OooO0o = shareActivityModel;
        this.f25470OooO0oO = ooo000oo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        ShareToFriendsActivity activity = this.f25467OooO0Oo;
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
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(this.f25469OooO0o0));
        }
        List<Long> list = listMutableListOf;
        ShareToFriendVM shareToFriendVMOooOoOO = activity.OooOoOO();
        ShareActivityModel shareActivityModel = this.f25468OooO0o;
        shareToFriendVMOooOoOO.shareActivity(list, shareActivityModel.getImage2(), shareActivityModel.getText3(), shareActivityModel.getText4(), shareActivityModel.getUrl(), this.f25470OooO0oO.f45201OooO0O0.getText().toString(), shareActivityModel.getActivity()).observe(activity, new ShareToFriendsActivity.OooO0OO(new o00OOOOo(activity)));
        return Unit.INSTANCE;
    }
}
