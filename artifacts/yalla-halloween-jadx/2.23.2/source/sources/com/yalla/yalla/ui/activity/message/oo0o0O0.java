package com.yalla.yalla.ui.activity.message;

import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oO0O0O0o;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25549OooO0oO;

    public oo0o0O0(ShareToFriendsActivity shareToFriendsActivity) {
        this.f25549OooO0oO = shareToFriendsActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@Nullable View view) {
        ShareToFriendsActivity shareToFriendsActivity = this.f25549OooO0oO;
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = shareToFriendsActivity.f25284OooOoOO;
        oO0O0O0o oo0o0o0o = null;
        if (o000ooo1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000ooo1 = null;
        }
        if (!o000ooo1.f27084OooOOo) {
            oO0O0O0o oo0o0o0o2 = shareToFriendsActivity.f25279OooOo00;
            if (oo0o0o0o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            } else {
                oo0o0o0o = oo0o0o0o2;
            }
            EditText editSearch = oo0o0o0o.f44893OooO0O0.getEditSearch();
            kotlin.collections.OooO00o.OooO0O0(editSearch.getContext().getApplicationContext(), new Handler(), p371o0OOo0oO.o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "getContext(...)"), editSearch.getWindowToken(), 0);
            shareToFriendsActivity.finish();
            return;
        }
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo2 = shareToFriendsActivity.f25282OooOoO;
        if (o000ooo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
            o000ooo2 = null;
        }
        o000ooo2.f27084OooOOo = false;
        o000ooo2.f27086OooOOoo.clear();
        o000ooo2.notifyDataSetChanged();
        com.yalla.yalla.ui.adapter.o000OOo0 o000ooo3 = shareToFriendsActivity.f25284OooOoOO;
        if (o000ooo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
            o000ooo3 = null;
        }
        o000ooo3.f27084OooOOo = false;
        o000ooo3.f27086OooOOoo.clear();
        o000ooo3.notifyDataSetChanged();
        oO0O0O0o oo0o0o0o3 = shareToFriendsActivity.f25279OooOo00;
        if (oo0o0o0o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
            oo0o0o0o3 = null;
        }
        if (oo0o0o0o3.f44893OooO0O0.getSearchText().length() > 0) {
            com.yalla.yalla.ui.adapter.o000OOo0 o000ooo4 = shareToFriendsActivity.f25284OooOoOO;
            if (o000ooo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("allFriendAdapter");
                o000ooo4 = null;
            }
            if (o000ooo4.getItemCount() <= 0) {
                oO0O0O0o oo0o0o0o4 = shareToFriendsActivity.f25279OooOo00;
                if (oo0o0o0o4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                    oo0o0o0o4 = null;
                }
                oo0o0o0o4.f44893OooO0O0.getEditSearch().setText((CharSequence) null);
                oO0O0O0o oo0o0o0o5 = shareToFriendsActivity.f25279OooOo00;
                if (oo0o0o0o5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                    oo0o0o0o5 = null;
                }
                oo0o0o0o5.f44893OooO0O0.getEditSearch().clearFocus();
                oO0O0O0o oo0o0o0o6 = shareToFriendsActivity.f25279OooOo00;
                if (oo0o0o0o6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchBinding");
                } else {
                    oo0o0o0o = oo0o0o0o6;
                }
                EditText editSearch2 = oo0o0o0o.f44893OooO0O0.getEditSearch();
                kotlin.collections.OooO00o.OooO0O0(editSearch2.getContext().getApplicationContext(), new Handler(), p371o0OOo0oO.o00O0O.OooO00o(editSearch2, ViewHierarchyConstants.VIEW_KEY, "getContext(...)"), editSearch2.getWindowToken(), 0);
            }
        }
        ShareToFriendsActivity.OooOo(shareToFriendsActivity);
    }
}
