package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Oooo0;
import androidx.paging.o0O0O00;
import androidx.paging.o0OOO0o;
import com.yalla.yalla.data.db.table.FriendInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import p101o000oo.o00O000;
import p101o000oo.o00O0OOO;
import p101o000oo.o00oOoo;
import p101o000oo.o0O0ooO;
import p394o0Oo0.OooOO0;
import p407o0Oo0Oo.o000;
import p407o0Oo0Oo.o000000;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/AfFriendVM;", "Lo0Oo0/OooOO0;", "", "content", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/o0OOO0o;", "Lcom/yalla/yalla/data/db/table/FriendInfo;", "getSearchFriends", "recentFriends", "Lkotlinx/coroutines/flow/Flow;", "getRecentFriends", "()Lkotlinx/coroutines/flow/Flow;", "allFriends", "getAllFriends", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class AfFriendVM extends OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private final Flow<o0OOO0o<FriendInfo>> allFriends;

    @NotNull
    private final Flow<o0OOO0o<FriendInfo>> recentFriends;

    public static final class OooO00o extends Lambda implements Function0<o0O0O00<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f31360OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00<Integer, FriendInfo> invoke() {
            o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return o000VarOooOOoo.OooOOO0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0O0O00<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f31361OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str) {
            super(0);
            this.f31361OooO0Oo = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00<Integer, FriendInfo> invoke() {
            String searchText = this.f31361OooO0Oo;
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return o000VarOooOOoo.OooOO0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), searchText);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0O0O00<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f31362OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00<Integer, FriendInfo> invoke() {
            o000000 o000000VarOooOOo = o00Oo0.OooO00o().OooOOo();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return o000000VarOooOOo.OooOOO0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        }
    }

    public AfFriendVM() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        OooO0OO pagingSourceFactory = OooO0OO.f31362OooO0Oo;
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O000 config = new o00O000(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.recentFriends = p101o000oo.o0OOO0o.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O0OOO ? new o0O0ooO(pagingSourceFactory) : new o00oOoo(pagingSourceFactory, null), null, config).f10273OooO0o, viewModelScope);
        CoroutineScope viewModelScope2 = ViewModelKt.getViewModelScope(this);
        Intrinsics.checkNotNullParameter(viewModelScope2, "viewModelScope");
        OooO00o pagingSourceFactory2 = OooO00o.f31360OooO0Oo;
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        o00O000 config2 = new o00O000(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        this.allFriends = p101o000oo.o0OOO0o.OooO00o(new Oooo0(pagingSourceFactory2 instanceof o00O0OOO ? new o0O0ooO(pagingSourceFactory2) : new o00oOoo(pagingSourceFactory2, null), null, config2).f10273OooO0o, viewModelScope2);
    }

    @NotNull
    public final Flow<o0OOO0o<FriendInfo>> getAllFriends() {
        return this.allFriends;
    }

    @NotNull
    public final Flow<o0OOO0o<FriendInfo>> getRecentFriends() {
        return this.recentFriends;
    }

    @NotNull
    public final Flow<o0OOO0o<FriendInfo>> getSearchFriends(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO0O0 pagingSourceFactory = new OooO0O0(content);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O000 config = new o00O000(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return p101o000oo.o0OOO0o.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O0OOO ? new o0O0ooO(pagingSourceFactory) : new o00oOoo(pagingSourceFactory, null), null, config).f10273OooO0o, viewModelScope);
    }
}
