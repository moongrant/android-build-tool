package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.db.table.FriendInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import p089o000o000.o000OO;
import p089o000o000.o000OO00;
import p089o000o000.o000OOo0;
import p089o000o000.o00O0000;
import p089o000o000.o00O00o0;
import p089o000o000.o0O0ooO;
import p089o000o000.oo0oOO0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/AfFriendVM;", "Lo00OO/OooO00o;", "", "content", "Lkotlinx/coroutines/flow/Flow;", "Lo000o000/o0O0ooO;", "Lcom/yalla/yalla/common/db/table/FriendInfo;", "getSearchFriends", "recentFriends", "Lkotlinx/coroutines/flow/Flow;", "getRecentFriends", "()Lkotlinx/coroutines/flow/Flow;", "allFriends", "getAllFriends", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AfFriendVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final Flow<o0O0ooO<FriendInfo>> allFriends;

    @NotNull
    private final Flow<o0O0ooO<FriendInfo>> recentFriends;

    public static final class OooO00o extends Lambda implements Function0<o00O00o0<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f25586Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, FriendInfo> invoke() {
            return p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooO0o0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00O00o0<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f25587Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str) {
            super(0);
            this.f25587Oooo0o = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, FriendInfo> invoke() {
            String searchText = this.f25587Oooo0o;
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            return p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOOo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), searchText);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o00O00o0<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f25588Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, FriendInfo> invoke() {
            return p491o0o00O00.OooO0OO.OooO00o().OooOOoo().OooO0oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
        }
    }

    public AfFriendVM() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO0OO pagingSourceFactory = OooO0OO.f25588Oooo0o;
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O0000 config = new o00O0000(20, 5, false, 0, 56);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.recentFriends = new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28877OooO0o;
        CoroutineScope viewModelScope2 = ViewModelKt.getViewModelScope(this);
        OooO00o pagingSourceFactory2 = OooO00o.f25586Oooo0o;
        Intrinsics.checkNotNullParameter(viewModelScope2, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        o00O0000 config2 = new o00O0000(20, 5, false, 0, 56);
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        this.allFriends = new o000OO(pagingSourceFactory2 instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory2) : new o000OOo0(pagingSourceFactory2, null), null, config2).f28877OooO0o;
    }

    @NotNull
    public final Flow<o0O0ooO<FriendInfo>> getAllFriends() {
        return this.allFriends;
    }

    @NotNull
    public final Flow<o0O0ooO<FriendInfo>> getRecentFriends() {
        return this.recentFriends;
    }

    @NotNull
    public final Flow<o0O0ooO<FriendInfo>> getSearchFriends(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO0O0 pagingSourceFactory = new OooO0O0(content);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O0000 config = new o00O0000(20, 5, false, 0, 56);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28877OooO0o;
    }
}
