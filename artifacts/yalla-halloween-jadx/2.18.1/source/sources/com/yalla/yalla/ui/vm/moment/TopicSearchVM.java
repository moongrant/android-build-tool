package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.model.TopicInfoModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o00000OO;
import p495o0o00OOO.Oooo0;
import p498o0o00Oo0.OooOOO;
import p517o0o0O00O.o0000O0;
import p520o0o0O0O0.o00O0O0O;
import p520o0o0O0O0.o00O0OO0;
import p520o0o0O0O0.o00O0OOO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J$\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\n2\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0006R-\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicSearchVM;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "Landroidx/lifecycle/LiveData;", "", "Lcom/yalla/yalla/data/db/model/SearchHistoryTable;", "getSearchHistory", "", "loadSearchRecommendTopic", "", "search", "Lo0o00OOO/Oooo0;", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/TopicInfoModel;", "Lkotlin/collections/ArrayList;", "searchTopic", "", "topicId", "", "joinTopic", "searchTag", "saveSearchHistory", "clearSearchHistory", "recommendList", "Lo0o00OOO/Oooo0;", "getRecommendList", "()Lo0o00OOO/Oooo0;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicSearchVM extends MomentVM {
    public static final int $stable = 0;

    @NotNull
    private final Oooo0<ArrayList<TopicInfoModel>> recommendList = new Oooo0<>();

    public static final class OooO extends Lambda implements Function1<Response<ArrayList<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<ArrayList<TopicInfoModel>> f25987Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Oooo0<ArrayList<TopicInfoModel>> oooo0) {
            super(1);
            this.f25987Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicInfoModel>> response) {
            Response<ArrayList<TopicInfoModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25987Oooo0o.postValue(it);
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
            Objects.requireNonNull(TopicSearchVM.this.getSearchHistoryRepository());
            p491o0o00O00.OooO0OO.OooO00o().Oooo000().OooO0OO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), 2);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Response<Integer>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Integer> f25989Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<Integer> oooo0) {
            super(1);
            this.f25989Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Integer> response) {
            Response<Integer> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25989Oooo0o.postValue(it);
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

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f25992Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25992Oooo0oO = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TopicSearchVM.this.new OooO0o(this.f25992Oooo0oO, continuation);
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
            o00OOOOo.OooO0O0 searchHistoryRepository = TopicSearchVM.this.getSearchHistoryRepository();
            String searchTag = this.f25992Oooo0oO;
            Objects.requireNonNull(searchHistoryRepository);
            Intrinsics.checkNotNullParameter(searchTag, "searchTag");
            SearchHistoryTable searchHistoryTable = new SearchHistoryTable();
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            searchHistoryTable.setUid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue());
            searchHistoryTable.setTag(searchTag);
            searchHistoryTable.setTime(System.currentTimeMillis());
            searchHistoryTable.setType(2);
            p491o0o00O00.OooO0OO.OooO00o().Oooo000().OooO0O0(searchHistoryTable);
            Objects.requireNonNull(TopicSearchVM.this.getSearchHistoryRepository());
            o0000O0 o0000o0Oooo000 = p491o0o00O00.OooO0OO.OooO00o().Oooo000();
            Intrinsics.checkNotNullExpressionValue(o0000o0Oooo000, "DB.searchHistoryDao()");
            o0000o0Oooo000.OooO0Oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue(), 2, 5, 2);
            return Unit.INSTANCE;
        }
    }

    public final void clearSearchHistory() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }

    @NotNull
    public final Oooo0<ArrayList<TopicInfoModel>> getRecommendList() {
        return this.recommendList;
    }

    @NotNull
    public final LiveData<List<SearchHistoryTable>> getSearchHistory() {
        Objects.requireNonNull(getSearchHistoryRepository());
        return p491o0o00O00.OooO0OO.OooO00o().Oooo000().OooO00o(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), 2);
    }

    @NotNull
    public final Oooo0<Integer> joinTopic(long topicId) {
        Oooo0<Integer> oooo0 = new Oooo0<>();
        OooO0O0 listener = new OooO0O0(oooo0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.circleJoinIns(String.valueOf(topicId), true, new o00O0OO0(listener));
        return oooo0;
    }

    public final void loadSearchRecommendTopic() {
        OooO0OO listener = new OooO0OO();
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.circleSearchRmdList(new o00O0OOO(listener));
    }

    public final void saveSearchHistory(@NotNull String searchTag) {
        Intrinsics.checkNotNullParameter(searchTag, "searchTag");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0o(searchTag, null), 3, null);
    }

    @NotNull
    public final Oooo0<ArrayList<TopicInfoModel>> searchTopic(@NotNull String search) {
        Intrinsics.checkNotNullParameter(search, "search");
        Oooo0<ArrayList<TopicInfoModel>> oooo0 = new Oooo0<>();
        OooO listener = new OooO(oooo0);
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.circleSearch(search, new o00O0O0O(listener));
        return oooo0;
    }
}
