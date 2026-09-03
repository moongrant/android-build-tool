package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p405o0Oo0OOO.oO0O0O0o;
import p405o0Oo0OOO.oOo0oooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25440OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(ShareToFriendsActivity shareToFriendsActivity) {
        super(0);
        this.f25440OooO0Oo = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ShareToFriendsActivity shareToFriendsActivity = this.f25440OooO0Oo;
        oO0O0O0o oo0o0o0o = shareToFriendsActivity.f25279OooOo00;
        oOo0oooO ooo0oooo = null;
        if (oo0o0o0o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            oo0o0o0o = null;
        }
        if (!(!StringsKt.isBlank(oo0o0o0o.f44893OooO0O0.getSearchText()))) {
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = shareToFriendsActivity.f25282OooOoO;
            if (o000ooo1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                o000ooo1 = null;
            }
            if (o000ooo1.getItemCount() > 0) {
                oOo0oooO ooo0oooo2 = shareToFriendsActivity.f25278OooOo0;
                if (ooo0oooo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
                } else {
                    ooo0oooo = ooo0oooo2;
                }
                TextView tvTitle = ooo0oooo.f45243OooO0O0;
                Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
                com.code.android.util.o000O.OooOOOO(tvTitle);
            } else {
                oOo0oooO ooo0oooo3 = shareToFriendsActivity.f25278OooOo0;
                if (ooo0oooo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendBinding");
                } else {
                    ooo0oooo = ooo0oooo3;
                }
                TextView tvTitle2 = ooo0oooo.f45243OooO0O0;
                Intrinsics.checkNotNullExpressionValue(tvTitle2, "tvTitle");
                com.code.android.util.o000O.OooO0O0(tvTitle2);
            }
        }
        return Unit.INSTANCE;
    }
}
