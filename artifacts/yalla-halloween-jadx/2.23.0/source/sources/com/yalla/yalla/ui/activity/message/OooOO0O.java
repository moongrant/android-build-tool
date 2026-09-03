package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import com.yalla.yalla.ui.view.SearchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p641o0ooOOOO.r6;
import p641o0ooOOOO.s6;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f25670OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(AtFriendsActivity atFriendsActivity) {
        super(0);
        this.f25670OooO0Oo = atFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AtFriendsActivity atFriendsActivity = this.f25670OooO0Oo;
        s6 s6Var = atFriendsActivity.f25627OooOoO;
        s6 s6Var2 = null;
        if (s6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            s6Var = null;
        }
        if (!(!StringsKt.isBlank(s6Var.f58804OooO0O0.getSearchText()))) {
            com.yalla.yalla.ui.adapter.OooO00o oooO00o = atFriendsActivity.f25628OooOoO0;
            if (oooO00o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                oooO00o = null;
            }
            if (oooO00o.getItemCount() > 0) {
                r6 r6Var = atFriendsActivity.f25631OooOoo0;
                if (r6Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
                    r6Var = null;
                }
                TextView textView = r6Var.f58737OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView, "allFriendHeader.tvTitle");
                com.code.android.util.o000OO00.OooOOOO(textView);
                s6 s6Var3 = atFriendsActivity.f25627OooOoO;
                if (s6Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                } else {
                    s6Var2 = s6Var3;
                }
                SearchView searchView = s6Var2.f58804OooO0O0;
                Intrinsics.checkNotNullExpressionValue(searchView, "searchHeader.search");
                com.code.android.util.o000OO00.OooOOOO(searchView);
            } else {
                r6 r6Var2 = atFriendsActivity.f25631OooOoo0;
                if (r6Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
                    r6Var2 = null;
                }
                TextView textView2 = r6Var2.f58737OooO0O0;
                Intrinsics.checkNotNullExpressionValue(textView2, "allFriendHeader.tvTitle");
                com.code.android.util.o000OO00.OooO0O0(textView2);
                s6 s6Var4 = atFriendsActivity.f25627OooOoO;
                if (s6Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                } else {
                    s6Var2 = s6Var4;
                }
                SearchView searchView2 = s6Var2.f58804OooO0O0;
                Intrinsics.checkNotNullExpressionValue(searchView2, "searchHeader.search");
                com.code.android.util.o000OO00.OooO0O0(searchView2);
                atFriendsActivity.OooOoO0().f58867OooO0OO.OooO0o0();
            }
        }
        return Unit.INSTANCE;
    }
}
