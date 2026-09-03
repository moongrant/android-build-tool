package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p641o0ooOOOO.m5;
import p641o0ooOOOO.n5;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25890OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(ShareToFriendsActivity shareToFriendsActivity) {
        super(0);
        this.f25890OooO0Oo = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ShareToFriendsActivity shareToFriendsActivity = this.f25890OooO0Oo;
        m5 m5Var = shareToFriendsActivity.f25734OooOo00;
        n5 n5Var = null;
        if (m5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            m5Var = null;
        }
        if (!(!StringsKt.isBlank(m5Var.f58407OooO0O0.getSearchText()))) {
            com.yalla.yalla.ui.adapter.o000OO00 o000oo01 = shareToFriendsActivity.f25737OooOoO;
            if (o000oo01 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                o000oo01 = null;
            }
            if (o000oo01.getItemCount() > 0) {
                n5 n5Var2 = shareToFriendsActivity.f25733OooOo0;
                if (n5Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
                } else {
                    n5Var = n5Var2;
                }
                TextView textView = n5Var.f58452OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView, "recentFriendBinding.tvTitle");
                com.code.android.util.o000OO00.OooOOOO(textView);
            } else {
                n5 n5Var3 = shareToFriendsActivity.f25733OooOo0;
                if (n5Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
                } else {
                    n5Var = n5Var3;
                }
                TextView textView2 = n5Var.f58452OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView2, "recentFriendBinding.tvTitle");
                com.code.android.util.o000OO00.OooO0O0(textView2);
            }
        }
        return Unit.INSTANCE;
    }
}
