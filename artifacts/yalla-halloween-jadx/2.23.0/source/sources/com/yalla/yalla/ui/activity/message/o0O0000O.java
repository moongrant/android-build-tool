package com.yalla.yalla.ui.activity.message;

import android.R;
import android.view.inputmethod.InputMethodManager;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.vm.message.ShareToFriendVM;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.e5;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25921OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ TopicInfoModel f25922OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f25923OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ e5 f25924OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0000O(ShareToFriendsActivity shareToFriendsActivity, long j, TopicInfoModel topicInfoModel, e5 e5Var) {
        super(0);
        this.f25921OooO0Oo = shareToFriendsActivity;
        this.f25923OooO0o0 = j;
        this.f25922OooO0o = topicInfoModel;
        this.f25924OooO0oO = e5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Long> listMutableListOf;
        ShareToFriendsActivity activity = this.f25921OooO0Oo;
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
            listMutableListOf = CollectionsKt.mutableListOf(Long.valueOf(this.f25923OooO0o0));
        }
        List<Long> list = listMutableListOf;
        ShareToFriendVM shareToFriendVMOooOoOO = activity.OooOoOO();
        TopicInfoModel topicInfoModel = this.f25922OooO0o;
        shareToFriendVMOooOoOO.shareTopic(list, topicInfoModel.getId(), topicInfoModel.getImage(), topicInfoModel.getName(), topicInfoModel.getJoinNum(), topicInfoModel.getDyNum(), this.f25924OooO0oO.f57815OooO0O0.getText().toString()).observe(activity, new ShareToFriendsActivity.OooO0OO(new o0O00000(activity)));
        return Unit.INSTANCE;
    }
}
