package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import com.yalla.yalla.ui.view.SearchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00O0o;
import p641o0ooOOOO.m5;
import p641o0ooOOOO.n5;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25997OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(ShareToFriendsActivity shareToFriendsActivity) {
        super(0);
        this.f25997OooO0Oo = shareToFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ShareToFriendsActivity shareToFriendsActivity = this.f25997OooO0Oo;
        m5 m5Var = shareToFriendsActivity.f25734OooOo00;
        m5 m5Var2 = null;
        if (m5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            m5Var = null;
        }
        if (!(!StringsKt.isBlank(m5Var.f58407OooO0O0.getSearchText()))) {
            com.yalla.yalla.ui.adapter.o000OO00 o000oo01 = shareToFriendsActivity.f25739OooOoOO;
            if (o000oo01 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                o000oo01 = null;
            }
            if (o000oo01.getItemCount() > 0) {
                n5 n5Var = shareToFriendsActivity.f25735OooOo0O;
                if (n5Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
                    n5Var = null;
                }
                TextView textView = n5Var.f58452OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView, "allFriendBinding.tvTitle");
                com.code.android.util.o000OO00.OooOOOO(textView);
                m5 m5Var3 = shareToFriendsActivity.f25734OooOo00;
                if (m5Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                } else {
                    m5Var2 = m5Var3;
                }
                SearchView searchView = m5Var2.f58407OooO0O0;
                Intrinsics.checkNotNullExpressionValue(searchView, "searchBinding.search");
                com.code.android.util.o000OO00.OooOOOO(searchView);
                TextView textView2 = shareToFriendsActivity.f25736OooOo0o;
                if (textView2 != null) {
                    textView2.setEnabled(true);
                }
                TextView textView3 = shareToFriendsActivity.f25736OooOo0o;
                if (textView3 != null) {
                    textView3.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.white));
                }
            } else {
                n5 n5Var2 = shareToFriendsActivity.f25735OooOo0O;
                if (n5Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendBinding");
                    n5Var2 = null;
                }
                TextView textView4 = n5Var2.f58452OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView4, "allFriendBinding.tvTitle");
                com.code.android.util.o000OO00.OooO0O0(textView4);
                m5 m5Var4 = shareToFriendsActivity.f25734OooOo00;
                if (m5Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                } else {
                    m5Var2 = m5Var4;
                }
                SearchView searchView2 = m5Var2.f58407OooO0O0;
                Intrinsics.checkNotNullExpressionValue(searchView2, "searchBinding.search");
                com.code.android.util.o000OO00.OooO0O0(searchView2);
                shareToFriendsActivity.OooOoO().f59146OooO0OO.OooO0o0();
                TextView textView5 = shareToFriendsActivity.f25736OooOo0o;
                if (textView5 != null) {
                    textView5.setEnabled(false);
                }
                TextView textView6 = shareToFriendsActivity.f25736OooOo0o;
                if (textView6 != null) {
                    textView6.setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_FFFFFFF_70));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
