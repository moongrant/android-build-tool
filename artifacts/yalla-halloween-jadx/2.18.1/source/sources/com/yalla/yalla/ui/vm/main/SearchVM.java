package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.app.base.model.RoomIndexModel;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0O;
import p484o0o000OO.OooOOO0;
import p484o0o000OO.OooOOOO;
import p498o0o00Oo0.OooOOO;
import p517o0o0O00O.o0000O0;
import p520o0o0O0O0.o000OOo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007J\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b0\u0007J(\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ(\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013R%\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00040\u00040\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/SearchVM;", "Lo00OO/OooO00o;", "", "clearSearchHistory", "", ViewHierarchyConstants.TEXT_KEY, "saveNewSearchText", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "Lcom/app/base/model/RoomIndexModel;", "loadRecommendRoom", "Lcom/yalla/yalla/common/model/UserInfoModel;", "loadRecommendUser", "", "pageIndex", "searchRoom", "Lo0o000OO/OooOOOO;", "searchUser", "", "userId", "searchUserStatistic", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "searchText", "Landroidx/lifecycle/MutableLiveData;", "getSearchText", "()Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/yalla/data/db/model/SearchHistoryTable;", "searchHistoryList", "Landroidx/lifecycle/LiveData;", "getSearchHistoryList", "()Landroidx/lifecycle/LiveData;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SearchVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final o00OOOOo.OooO0O0 repository;

    @NotNull
    private final LiveData<List<SearchHistoryTable>> searchHistoryList;

    @NotNull
    private final MutableLiveData<String> searchText;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$searchRoom$1", f = "SearchVM.kt", i = {}, l = {40, 40}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<? extends RoomIndexModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f25529Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25530Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25531Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25532Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, int i, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f25532Oooo0oo = str;
            this.f25529Oooo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f25532Oooo0oo, this.f25529Oooo, continuation);
            oooO.f25531Oooo0oO = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<? extends RoomIndexModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25530Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25531Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25531Oooo0oO;
            o000OOo0 o000ooo1 = o000OOo0.f42645OooO00o;
            String str = this.f25532Oooo0oo;
            int i2 = this.f25529Oooo;
            this.f25531Oooo0oO = liveDataScope;
            this.f25530Oooo0o = 1;
            obj = o000ooo1.OooO0OO(str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25531Oooo0oO = null;
            this.f25530Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$clearSearchHistory$1", f = "SearchVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SearchVM.this.new OooO00o(continuation);
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
            Objects.requireNonNull(SearchVM.this.repository);
            p491o0o00O00.OooO0OO.OooO00o().Oooo000().OooO0OO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), 1);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$loadRecommendRoom$1", f = "SearchVM.kt", i = {}, l = {32, 32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<? extends RoomIndexModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25534Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25535Oooo0oO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation);
            oooO0O0.f25535Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<? extends RoomIndexModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25534Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25535Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25535Oooo0oO;
            o000OOo0 o000ooo1 = o000OOo0.f42645OooO00o;
            this.f25535Oooo0oO = liveDataScope;
            this.f25534Oooo0o = 1;
            obj = o000ooo1.OooO00o(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25535Oooo0oO = null;
            this.f25534Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$loadRecommendUser$1", f = "SearchVM.kt", i = {}, l = {36, 36}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<? extends UserInfoModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25536Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25537Oooo0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(continuation);
            oooO0OO.f25537Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<? extends UserInfoModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25536Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25537Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25537Oooo0oO;
            o000OOo0 o000ooo1 = o000OOo0.f42645OooO00o;
            this.f25537Oooo0oO = liveDataScope;
            this.f25536Oooo0o = 1;
            obj = o000ooo1.OooO0O0(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25537Oooo0oO = null;
            this.f25536Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$saveNewSearchText$1", f = "SearchVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f25539Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25539Oooo0oO = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SearchVM.this.new OooO0o(this.f25539Oooo0oO, continuation);
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
            o00OOOOo.OooO0O0 oooO0O0 = SearchVM.this.repository;
            String searchTag = this.f25539Oooo0oO;
            Objects.requireNonNull(oooO0O0);
            Intrinsics.checkNotNullParameter(searchTag, "searchTag");
            SearchHistoryTable searchHistoryTable = new SearchHistoryTable();
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            searchHistoryTable.setUid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue());
            searchHistoryTable.setTag(searchTag);
            searchHistoryTable.setTime(System.currentTimeMillis());
            searchHistoryTable.setType(1);
            p491o0o00O00.OooO0OO.OooO00o().Oooo000().OooO0O0(searchHistoryTable);
            Objects.requireNonNull(SearchVM.this.repository);
            o0000O0 o0000o0Oooo000 = p491o0o00O00.OooO0OO.OooO00o().Oooo000();
            Intrinsics.checkNotNullExpressionValue(o0000o0Oooo000, "DB.searchHistoryDao()");
            o0000o0Oooo000.OooO0Oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue(), 1, 5, 2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$searchUser$1", f = "SearchVM.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<OooOOOO<ApiResult<List<? extends UserInfoModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f25540Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25541Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25542Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25543Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, int i, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f25543Oooo0oo = str;
            this.f25540Oooo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f25543Oooo0oo, this.f25540Oooo, continuation);
            oooOO1.f25542Oooo0oO = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<List<? extends UserInfoModel>>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25541Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f25542Oooo0oO;
                o000OOo0 o000ooo1 = o000OOo0.f42645OooO00o;
                String str = this.f25543Oooo0oo;
                int i2 = this.f25540Oooo;
                this.f25542Oooo0oO = oooOOOO2;
                this.f25541Oooo0o = 1;
                Object objOooO0Oo = o000ooo1.OooO0Oo(str, i2, this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f25542Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            oooOOOO.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$searchUserStatistic$1", f = "SearchVM.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25544Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f25545Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(long j, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f25545Oooo0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f25545Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25544Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000OOo0 o000ooo1 = o000OOo0.f42645OooO00o;
                long j = this.f25545Oooo0oO;
                this.f25544Oooo0o = 1;
                if (o000ooo1.OooO0o0(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public SearchVM() {
        o00OOOOo.OooO0O0 oooO0O0 = new o00OOOOo.OooO0O0();
        this.repository = oooO0O0;
        this.searchText = new MutableLiveData<>("");
        Objects.requireNonNull(oooO0O0);
        this.searchHistoryList = p491o0o00O00.OooO0OO.OooO00o().Oooo000().OooO00o(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), 1);
    }

    public final void clearSearchHistory() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
    }

    @NotNull
    public final LiveData<List<SearchHistoryTable>> getSearchHistoryList() {
        return this.searchHistoryList;
    }

    @NotNull
    public final MutableLiveData<String> getSearchText() {
        return this.searchText;
    }

    @NotNull
    public final LiveData<ApiResult<List<RoomIndexModel>>> loadRecommendRoom() {
        return o0000O0O.OooO00o(new OooO0O0(null));
    }

    @NotNull
    public final LiveData<ApiResult<List<UserInfoModel>>> loadRecommendUser() {
        return o0000O0O.OooO00o(new OooO0OO(null));
    }

    public final void saveNewSearchText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0o(text, null), 2, null);
    }

    @NotNull
    public final LiveData<ApiResult<List<RoomIndexModel>>> searchRoom(@NotNull String text, int pageIndex) {
        Intrinsics.checkNotNullParameter(text, "text");
        return o0000O0O.OooO00o(new OooO(text, pageIndex, null));
    }

    @NotNull
    public final OooOOOO<ApiResult<List<UserInfoModel>>> searchUser(@NotNull String text, int pageIndex) {
        Intrinsics.checkNotNullParameter(text, "text");
        return OooOOO0.OooO00o(this, new OooOO0(text, pageIndex, null));
    }

    public final void searchUserStatistic(long userId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOO0O(userId, null), 3, null);
    }
}
