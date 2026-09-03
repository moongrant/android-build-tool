package com.yalla.yalla.ui.activity.message;

import android.os.Looper;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25347OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f25348OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(PrivateChatActivity privateChatActivity, String str) {
        super(1);
        this.f25347OooO0Oo = privateChatActivity;
        this.f25348OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        MomentDetailModel momentDetailModel2 = momentDetailModel;
        if (momentDetailModel2 == null) {
            String string = this.f25347OooO0Oo.getResources().getString(p562o0oOo000.o000000.moment_delete_by_user);
            if (!(string == null || StringsKt.isBlank(string))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            int i = MomentDetailActivity.f25608Oooo0;
            MomentDetailActivity.OooO00o.OooO00o(this.f25347OooO0Oo, momentDetailModel2, false, -1, null, false, MomentAdapterTag.PrivateChat, false, this.f25348OooO0o0);
        }
        return Unit.INSTANCE;
    }
}
