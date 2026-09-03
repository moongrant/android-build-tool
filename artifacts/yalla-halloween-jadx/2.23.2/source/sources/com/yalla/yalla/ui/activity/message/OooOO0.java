package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p405o0Oo0OOO.oOO0Oo00;
import p405o0Oo0OOO.oOO0OoO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f25214OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(AtFriendsActivity atFriendsActivity) {
        super(0);
        this.f25214OooO0Oo = atFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AtFriendsActivity atFriendsActivity = this.f25214OooO0Oo;
        oOO0OoO0 ooo0ooo0 = atFriendsActivity.f25172OooOoO;
        oOO0Oo00 ooo0oo00 = null;
        if (ooo0ooo0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooo0ooo0 = null;
        }
        if (!(!StringsKt.isBlank(ooo0ooo0.f45121OooO0O0.getSearchText()))) {
            com.yalla.yalla.ui.adapter.OooO00o oooO00o = atFriendsActivity.f25171OooOo0o;
            if (oooO00o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                oooO00o = null;
            }
            if (oooO00o.getItemCount() > 0) {
                oOO0Oo00 ooo0oo01 = atFriendsActivity.f25174OooOoOO;
                if (ooo0oo01 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
                } else {
                    ooo0oo00 = ooo0oo01;
                }
                TextView tvTitle = ooo0oo00.f45119OooO0O0;
                Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
                com.code.android.util.o000O.OooOOOO(tvTitle);
            } else {
                oOO0Oo00 ooo0oo02 = atFriendsActivity.f25174OooOoOO;
                if (ooo0oo02 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
                } else {
                    ooo0oo00 = ooo0oo02;
                }
                TextView tvTitle2 = ooo0oo00.f45119OooO0O0;
                Intrinsics.checkNotNullExpressionValue(tvTitle2, "tvTitle");
                com.code.android.util.o000O.OooO0O0(tvTitle2);
            }
        }
        return Unit.INSTANCE;
    }
}
