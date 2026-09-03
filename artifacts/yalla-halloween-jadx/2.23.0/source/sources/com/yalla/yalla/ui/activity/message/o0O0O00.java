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
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25939OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f25940OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(PrivateChatActivity privateChatActivity, String str) {
        super(1);
        this.f25939OooO0Oo = privateChatActivity;
        this.f25940OooO0o0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        MomentDetailModel momentDetailModel2 = momentDetailModel;
        if (momentDetailModel2 == null) {
            String string = this.f25939OooO0Oo.getResources().getString(oO00OOo0.moment_delete_by_user);
            if (!(string == null || StringsKt.isBlank(string))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else {
            int i = MomentDetailActivity.f26057Oooo0;
            MomentDetailActivity.OooO00o.OooO00o(this.f25939OooO0Oo, momentDetailModel2, false, -1, null, false, MomentAdapterTag.PrivateChat, false, this.f25940OooO0o0);
        }
        return Unit.INSTANCE;
    }
}
