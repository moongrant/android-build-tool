package com.yalla.yalla.ui.adapter;

import android.view.View;
import com.yalla.yalla.data.db.table.UserInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SearchFriendHotAdapter f27036OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f27037OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SearchFriendHotAdapter.SearchFriendHotViewHolder f27038OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfo f27039OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(SearchFriendHotAdapter searchFriendHotAdapter, SearchFriendHotAdapter.SearchFriendHotViewHolder searchFriendHotViewHolder, int i, UserInfo userInfo) {
        super(1);
        this.f27036OooO0Oo = searchFriendHotAdapter;
        this.f27038OooO0o0 = searchFriendHotViewHolder;
        this.f27037OooO0o = i;
        this.f27039OooO0oO = userInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Function3<? super View, ? super Integer, ? super UserInfo, Unit> function3 = this.f27036OooO0Oo.f26989OooO0Oo;
        if (function3 != null) {
            function3.invoke(this.f27038OooO0o0.itemView, Integer.valueOf(this.f27037OooO0o), this.f27039OooO0oO);
        }
        return Unit.INSTANCE;
    }
}
