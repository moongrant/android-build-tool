package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p403o0Oo0OOo.oO00Oo0;
import p406o0Oo0Ooo.c0;
import p406o0Oo0Ooo.d0;
import p406o0Oo0Ooo.f0;
import p420o0OoO0OO.o0OOO0o;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J$\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\n2\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0006R-\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicSearchVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "Landroidx/lifecycle/LiveData;", "", "Lcom/yalla/yalla/data/db/model/SearchHistoryTable;", "getSearchHistory", "", "loadSearchRecommendTopic", "", "search", "Lo0OoO0OO/o0OOO0o;", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "Lkotlin/collections/ArrayList;", "searchTopic", "", "topicId", "", "joinTopic", "searchTag", "saveSearchHistory", "clearSearchHistory", "recommendList", "Lo0OoO0OO/o0OOO0o;", "getRecommendList", "()Lo0OoO0OO/o0OOO0o;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class TopicSearchVM extends BaseMomentDetailVM {
    public static final int $stable = 0;

    @NotNull
    private final o0OOO0o<ArrayList<TopicInfoModel>> recommendList = new o0OOO0o<>();

    public static final class OooO extends Lambda implements Function1<Response<ArrayList<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<ArrayList<TopicInfoModel>> f32464OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0OOO0o<ArrayList<TopicInfoModel>> o0ooo0o2) {
            super(1);
            this.f32464OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicInfoModel>> response) {
            Response<ArrayList<TopicInfoModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f32464OooO0Oo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicSearchVM$clearSearchHistory$1", f = "TopicSearchVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TopicSearchVM.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            TopicSearchVM.this.getSearchHistoryRepository().getClass();
            oO00Oo0 oo00oo0OooOooO = o000OOo.OooO00o().OooOooO();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            oo00oo0OooOooO.OooO0OO(2, ((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Response<Integer>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<Integer> f32466OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OOO0o<Integer> o0ooo0o2) {
            super(1);
            this.f32466OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Integer> response) {
            Response<Integer> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f32466OooO0Oo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Response<ArrayList<TopicInfoModel>>, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicInfoModel>> response) {
            Response<ArrayList<TopicInfoModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            TopicSearchVM.this.getRecommendList().postValue(it);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicSearchVM$saveSearchHistory$1", f = "TopicSearchVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f32469OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f32469OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TopicSearchVM.this.new OooO0o(this.f32469OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            TopicSearchVM topicSearchVM = TopicSearchVM.this;
            topicSearchVM.getSearchHistoryRepository().getClass();
            String searchTag = this.f32469OooO0o0;
            Intrinsics.checkNotNullParameter(searchTag, "searchTag");
            SearchHistoryTable searchHistoryTable = new SearchHistoryTable();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            searchHistoryTable.setUid(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
            searchHistoryTable.setTag(searchTag);
            searchHistoryTable.setTime(System.currentTimeMillis());
            searchHistoryTable.setType(2);
            o000OOo.OooO00o().OooOooO().OooO00o(searchHistoryTable);
            topicSearchVM.getSearchHistoryRepository().getClass();
            oO00Oo0 oo00oo0OooOooO = o000OOo.OooO00o().OooOooO();
            Intrinsics.checkNotNullExpressionValue(oo00oo0OooOooO, "DB.searchHistoryDao()");
            oo00oo0OooOooO.OooO0O0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), 2, 5, 2);
            return Unit.INSTANCE;
        }
    }

    public final void clearSearchHistory() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }

    @NotNull
    public final o0OOO0o<ArrayList<TopicInfoModel>> getRecommendList() {
        return this.recommendList;
    }

    @NotNull
    public final LiveData<List<SearchHistoryTable>> getSearchHistory() {
        getSearchHistoryRepository().getClass();
        oO00Oo0 oo00oo0OooOooO = o000OOo.OooO00o().OooOooO();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        return oo00oo0OooOooO.OooO0Oo(2, ((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
    }

    @NotNull
    public final o0OOO0o<Integer> joinTopic(long topicId) {
        o0OOO0o<Integer> o0ooo0o2 = new o0OOO0o<>();
        OooO0O0 listener = new OooO0O0(o0ooo0o2);
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new d0(topicId, true, listener, null), 3, null);
        return o0ooo0o2;
    }

    public final void loadSearchRecommendTopic() {
        OooO0OO listener = new OooO0OO();
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new f0(listener, null), 3, null);
    }

    public final void saveSearchHistory(@NotNull String searchTag) {
        Intrinsics.checkNotNullParameter(searchTag, "searchTag");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0o(searchTag, null), 3, null);
    }

    @NotNull
    public final o0OOO0o<ArrayList<TopicInfoModel>> searchTopic(@NotNull String search) {
        Intrinsics.checkNotNullParameter(search, "search");
        o0OOO0o<ArrayList<TopicInfoModel>> o0ooo0o2 = new o0OOO0o<>();
        OooO listener = new OooO(o0ooo0o2);
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new c0(search, listener, null), 3, null);
        return o0ooo0o2;
    }
}
