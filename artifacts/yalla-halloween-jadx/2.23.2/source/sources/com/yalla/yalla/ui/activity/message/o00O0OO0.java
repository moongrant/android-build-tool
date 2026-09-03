package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import com.yalla.yalla.ui.view.SearchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p405o0Oo0OOO.oO0O0O0o;
import p405o0Oo0OOO.oOo0oooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25442OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(ShareToFriendsActivity shareToFriendsActivity) {
        super(0);
        this.f25442OooO0Oo = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ShareToFriendsActivity shareToFriendsActivity = this.f25442OooO0Oo;
        oO0O0O0o oo0o0o0o = shareToFriendsActivity.f25279OooOo00;
        oO0O0O0o oo0o0o0o2 = null;
        if (oo0o0o0o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            oo0o0o0o = null;
        }
        if (!(!StringsKt.isBlank(oo0o0o0o.f44893OooO0O0.getSearchText()))) {
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = shareToFriendsActivity.f25284OooOoOO;
            if (o000ooo1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                o000ooo1 = null;
            }
            if (o000ooo1.getItemCount() > 0) {
                oOo0oooO ooo0oooo = shareToFriendsActivity.f25280OooOo0O;
                if (ooo0oooo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
                    ooo0oooo = null;
                }
                TextView tvTitle = ooo0oooo.f45243OooO0O0;
                Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
                com.code.android.util.o000O.OooOOOO(tvTitle);
                oO0O0O0o oo0o0o0o3 = shareToFriendsActivity.f25279OooOo00;
                if (oo0o0o0o3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                } else {
                    oo0o0o0o2 = oo0o0o0o3;
                }
                SearchView search = oo0o0o0o2.f44893OooO0O0;
                Intrinsics.checkNotNullExpressionValue(search, "search");
                com.code.android.util.o000O.OooOOOO(search);
                TextView textView = shareToFriendsActivity.f25281OooOo0o;
                if (textView != null) {
                    textView.setEnabled(true);
                }
                TextView textView2 = shareToFriendsActivity.f25281OooOo0o;
                if (textView2 != null) {
                    textView2.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.white));
                }
            } else {
                oOo0oooO ooo0oooo2 = shareToFriendsActivity.f25280OooOo0O;
                if (ooo0oooo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
                    ooo0oooo2 = null;
                }
                TextView tvTitle2 = ooo0oooo2.f45243OooO0O0;
                Intrinsics.checkNotNullExpressionValue(tvTitle2, "tvTitle");
                com.code.android.util.o000O.OooO0O0(tvTitle2);
                oO0O0O0o oo0o0o0o4 = shareToFriendsActivity.f25279OooOo00;
                if (oo0o0o0o4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                } else {
                    oo0o0o0o2 = oo0o0o0o4;
                }
                SearchView search2 = oo0o0o0o2.f44893OooO0O0;
                Intrinsics.checkNotNullExpressionValue(search2, "search");
                com.code.android.util.o000O.OooO0O0(search2);
                shareToFriendsActivity.OooOoO().f44826OooO0OO.OooO0o0();
                TextView textView3 = shareToFriendsActivity.f25281OooOo0o;
                if (textView3 != null) {
                    textView3.setEnabled(false);
                }
                TextView textView4 = shareToFriendsActivity.f25281OooOo0o;
                if (textView4 != null) {
                    textView4.setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_FFFFFFF_70));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
