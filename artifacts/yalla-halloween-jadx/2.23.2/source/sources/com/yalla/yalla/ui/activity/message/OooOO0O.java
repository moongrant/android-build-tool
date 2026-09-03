package com.yalla.yalla.ui.activity.message;

import android.widget.TextView;
import com.yalla.yalla.ui.view.SearchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p405o0Oo0OOO.oOO0Oo00;
import p405o0Oo0OOO.oOO0OoO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f25215OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(AtFriendsActivity atFriendsActivity) {
        super(0);
        this.f25215OooO0Oo = atFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AtFriendsActivity atFriendsActivity = this.f25215OooO0Oo;
        oOO0OoO0 ooo0ooo0 = atFriendsActivity.f25172OooOoO;
        oOO0OoO0 ooo0ooo1 = null;
        if (ooo0ooo0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
            ooo0ooo0 = null;
        }
        if (!(!StringsKt.isBlank(ooo0ooo0.f45121OooO0O0.getSearchText()))) {
            com.yalla.yalla.ui.adapter.OooO00o oooO00o = atFriendsActivity.f25173OooOoO0;
            if (oooO00o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                oooO00o = null;
            }
            if (oooO00o.getItemCount() > 0) {
                oOO0Oo00 ooo0oo00 = atFriendsActivity.f25176OooOoo0;
                if (ooo0oo00 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
                    ooo0oo00 = null;
                }
                TextView tvTitle = ooo0oo00.f45119OooO0O0;
                Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
                com.code.android.util.o000O.OooOOOO(tvTitle);
                oOO0OoO0 ooo0ooo2 = atFriendsActivity.f25172OooOoO;
                if (ooo0ooo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                } else {
                    ooo0ooo1 = ooo0ooo2;
                }
                SearchView search = ooo0ooo1.f45121OooO0O0;
                Intrinsics.checkNotNullExpressionValue(search, "search");
                com.code.android.util.o000O.OooOOOO(search);
            } else {
                oOO0Oo00 ooo0oo01 = atFriendsActivity.f25176OooOoo0;
                if (ooo0oo01 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("allFriendHeader");
                    ooo0oo01 = null;
                }
                TextView tvTitle2 = ooo0oo01.f45119OooO0O0;
                Intrinsics.checkNotNullExpressionValue(tvTitle2, "tvTitle");
                com.code.android.util.o000O.OooO0O0(tvTitle2);
                oOO0OoO0 ooo0ooo3 = atFriendsActivity.f25172OooOoO;
                if (ooo0ooo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchHeader");
                } else {
                    ooo0ooo1 = ooo0ooo3;
                }
                SearchView search2 = ooo0ooo1.f45121OooO0O0;
                Intrinsics.checkNotNullExpressionValue(search2, "search");
                com.code.android.util.o000O.OooO0O0(search2);
                atFriendsActivity.OooOoO0().f44901OooO0OO.OooO0o0();
            }
        }
        return Unit.INSTANCE;
    }
}
