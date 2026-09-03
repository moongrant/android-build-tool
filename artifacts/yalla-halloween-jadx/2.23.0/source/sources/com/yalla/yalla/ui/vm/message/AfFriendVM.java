package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Oooo0;
import androidx.paging.o0OOO0o;
import com.yalla.yalla.data.db.table.FriendInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import o000O00O.OooOOO;
import o000O00O.o000O000;
import o000O00O.o000O0o;
import o000O00O.o000Oo0;
import o000O00O.o00O000o;
import org.jetbrains.annotations.NotNull;
import p394o0Oo00oO.o0O0O00;
import p403o0Oo0OOo.o00OOOOo;
import p403o0Oo0OOo.o0O00;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/AfFriendVM;", "Lo0Oo00oO/o0O0O00;", "", "content", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/o0OOO0o;", "Lcom/yalla/yalla/data/db/table/FriendInfo;", "getSearchFriends", "recentFriends", "Lkotlinx/coroutines/flow/Flow;", "getRecentFriends", "()Lkotlinx/coroutines/flow/Flow;", "allFriends", "getAllFriends", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class AfFriendVM extends o0O0O00 {
    public static final int $stable = 8;

    @NotNull
    private final Flow<o0OOO0o<FriendInfo>> allFriends;

    @NotNull
    private final Flow<o0OOO0o<FriendInfo>> recentFriends;

    public static final class OooO00o extends Lambda implements Function0<androidx.paging.o0O0O00<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f31895OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.paging.o0O0O00<Integer, FriendInfo> invoke() {
            o0O00 o0o00OooOOo = o000OOo.OooO00o().OooOOo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return o0o00OooOOo.OooOOO0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<androidx.paging.o0O0O00<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f31896OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str) {
            super(0);
            this.f31896OooO0Oo = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.paging.o0O0O00<Integer, FriendInfo> invoke() {
            String searchText = this.f31896OooO0Oo;
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            o0O00 o0o00OooOOo = o000OOo.OooO00o().OooOOo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return o0o00OooOOo.OooOO0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), searchText);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<androidx.paging.o0O0O00<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f31897OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.paging.o0O0O00<Integer, FriendInfo> invoke() {
            o00OOOOo o00oooooOooOOo0 = o000OOo.OooO00o().OooOOo0();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return o00oooooOooOOo0.OooOOO0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
        }
    }

    public AfFriendVM() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        OooO0OO pagingSourceFactory = OooO0OO.f31897OooO0Oo;
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o000Oo0 config = new o000Oo0(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.recentFriends = OooOOO.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O000o ? new o000O000(pagingSourceFactory) : new o000O0o(pagingSourceFactory, null), null, config).f7179OooO0o, viewModelScope);
        CoroutineScope viewModelScope2 = ViewModelKt.getViewModelScope(this);
        Intrinsics.checkNotNullParameter(viewModelScope2, "viewModelScope");
        OooO00o pagingSourceFactory2 = OooO00o.f31895OooO0Oo;
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        o000Oo0 config2 = new o000Oo0(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        this.allFriends = OooOOO.OooO00o(new Oooo0(pagingSourceFactory2 instanceof o00O000o ? new o000O000(pagingSourceFactory2) : new o000O0o(pagingSourceFactory2, null), null, config2).f7179OooO0o, viewModelScope2);
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
        o000Oo0 config = new o000Oo0(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return OooOOO.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O000o ? new o000O000(pagingSourceFactory) : new o000O0o(pagingSourceFactory, null), null, config).f7179OooO0o, viewModelScope);
    }
}
