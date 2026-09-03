package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.model.SearchRecommendModel;
import com.yalla.yalla.ui.adapter.SearchFriendHotAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SearchFriendActivity f25876OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(SearchFriendActivity searchFriendActivity) {
        super(searchFriendActivity);
        this.f25876OooO0o0 = searchFriendActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        SearchRecommendModel searchRecommendModel = (SearchRecommendModel) oOo00OO0.OooO00o(response, SearchRecommendModel.class);
        if (!Intrinsics.areEqual("1000", searchRecommendModel.code) || searchRecommendModel.data == null) {
            return;
        }
        SearchFriendActivity searchFriendActivity = this.f25876OooO0o0;
        SearchFriendHotAdapter searchFriendHotAdapter = searchFriendActivity.f25723OooOo0;
        SearchFriendHotAdapter searchFriendHotAdapter2 = null;
        if (searchFriendHotAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterHot");
            searchFriendHotAdapter = null;
        }
        searchFriendHotAdapter.f27453OooO0OO = searchRecommendModel;
        SearchFriendHotAdapter searchFriendHotAdapter3 = searchFriendActivity.f25723OooOo0;
        if (searchFriendHotAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterHot");
        } else {
            searchFriendHotAdapter2 = searchFriendHotAdapter3;
        }
        searchFriendHotAdapter2.notifyDataSetChanged();
    }
}
