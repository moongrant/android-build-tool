package com.yalla.yalla.ui.activity.message;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p641o0ooOOOO.m5;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends p466o0Oooo0o.oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25889OooO0oO;

    public o00O0OO(ShareToFriendsActivity shareToFriendsActivity) {
        this.f25889OooO0oO = shareToFriendsActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@Nullable View view) {
        ShareToFriendsActivity shareToFriendsActivity = this.f25889OooO0oO;
        com.yalla.yalla.ui.adapter.o000OO00 o000oo01 = shareToFriendsActivity.f25739OooOoOO;
        m5 m5Var = null;
        if (o000oo01 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000oo01 = null;
        }
        if (!o000oo01.f27542OooOOo) {
            m5 m5Var2 = shareToFriendsActivity.f25734OooOo00;
            if (m5Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            } else {
                m5Var = m5Var2;
            }
            EditText editSearch = m5Var.f58407OooO0O0.getEditSearch();
            p367o0OOo0o0.OooOO0O.OooO00o(editSearch.getContext().getApplicationContext(), new Handler(), android.support.v4.media.session.OooO0o.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context"), editSearch.getWindowToken(), 0);
            shareToFriendsActivity.finish();
            return;
        }
        com.yalla.yalla.ui.adapter.o000OO00 o000oo02 = shareToFriendsActivity.f25737OooOoO;
        if (o000oo02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o000oo02 = null;
        }
        o000oo02.f27542OooOOo = false;
        o000oo02.f27544OooOOoo.clear();
        o000oo02.notifyDataSetChanged();
        com.yalla.yalla.ui.adapter.o000OO00 o000oo03 = shareToFriendsActivity.f25739OooOoOO;
        if (o000oo03 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000oo03 = null;
        }
        o000oo03.f27542OooOOo = false;
        o000oo03.f27544OooOOoo.clear();
        o000oo03.notifyDataSetChanged();
        m5 m5Var3 = shareToFriendsActivity.f25734OooOo00;
        if (m5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            m5Var3 = null;
        }
        if (m5Var3.f58407OooO0O0.getSearchText().length() > 0) {
            com.yalla.yalla.ui.adapter.o000OO00 o000oo04 = shareToFriendsActivity.f25739OooOoOO;
            if (o000oo04 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                o000oo04 = null;
            }
            if (o000oo04.getItemCount() <= 0) {
                m5 m5Var4 = shareToFriendsActivity.f25734OooOo00;
                if (m5Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                    m5Var4 = null;
                }
                m5Var4.f58407OooO0O0.getEditSearch().setText((CharSequence) null);
                m5 m5Var5 = shareToFriendsActivity.f25734OooOo00;
                if (m5Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                    m5Var5 = null;
                }
                m5Var5.f58407OooO0O0.getEditSearch().clearFocus();
                m5 m5Var6 = shareToFriendsActivity.f25734OooOo00;
                if (m5Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                } else {
                    m5Var = m5Var6;
                }
                EditText editSearch2 = m5Var.f58407OooO0O0.getEditSearch();
                p367o0OOo0o0.OooOO0O.OooO00o(editSearch2.getContext().getApplicationContext(), new Handler(), android.support.v4.media.session.OooO0o.OooO00o(editSearch2, ViewHierarchyConstants.VIEW_KEY, "view.context"), editSearch2.getWindowToken(), 0);
            }
        }
        ShareToFriendsActivity.OooOo(shareToFriendsActivity);
    }
}
