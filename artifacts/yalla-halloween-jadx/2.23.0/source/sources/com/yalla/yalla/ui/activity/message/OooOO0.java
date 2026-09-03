package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p641o0ooOOOO.r6;
import p641o0ooOOOO.s6;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f25669OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(AtFriendsActivity atFriendsActivity) {
        super(0);
        this.f25669OooO0Oo = atFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AtFriendsActivity atFriendsActivity = this.f25669OooO0Oo;
        s6 s6Var = atFriendsActivity.f25627OooOoO;
        r6 r6Var = null;
        if (s6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            s6Var = null;
        }
        if (!(!StringsKt.isBlank(s6Var.f58804OooO0O0.getSearchText()))) {
            com.yalla.yalla.ui.adapter.OooO00o oooO00o = atFriendsActivity.f25626OooOo0o;
            if (oooO00o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                oooO00o = null;
            }
            if (oooO00o.getItemCount() > 0) {
                r6 r6Var2 = atFriendsActivity.f25629OooOoOO;
                if (r6Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
                } else {
                    r6Var = r6Var2;
                }
                TextView textView = r6Var.f58737OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView, "recentFriendHeader.tvTitle");
                com.code.android.util.o000OO00.OooOOOO(textView);
            } else {
                r6 r6Var3 = atFriendsActivity.f25629OooOoOO;
                if (r6Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendHeader");
                } else {
                    r6Var = r6Var3;
                }
                TextView textView2 = r6Var.f58737OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView2, "recentFriendHeader.tvTitle");
                com.code.android.util.o000OO00.OooO0O0(textView2);
            }
        }
        return Unit.INSTANCE;
    }
}
