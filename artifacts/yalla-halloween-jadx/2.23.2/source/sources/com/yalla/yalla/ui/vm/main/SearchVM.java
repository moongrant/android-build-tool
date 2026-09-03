package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o00oO0o;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.data.repository.SearchRepo$loadSearchRecommendRoom$$inlined$call$1;
import com.yalla.yalla.data.repository.SearchRepo$loadSearchRecommendUser$$inlined$call$1;
import com.yalla.yalla.data.repository.SearchRepo$searchRoom$$inlined$call$1;
import com.yalla.yalla.data.repository.SearchRepo$searchUser$$inlined$call$1;
import com.yalla.yalla.data.repository.SearchRepo$searchUserStatistic$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.user.UserInfoModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p407o0Oo0Oo.o0O0OOO0;
import p408o0Oo0Oo0.o00Oo0;
import p410o0Oo0Ooo.a4;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOO0OOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0007J\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b0\u0007J(\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ(\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R+\u0010 \u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR#\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\t0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/yalla/yalla/ui/vm/main/SearchVM;", "Lo0Oo0/OooOO0;", "", "clearSearchHistory", "", ViewHierarchyConstants.TEXT_KEY, "saveNewSearchText", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "Lcom/yalla/yalla/model/room/RoomIndexModel;", "loadRecommendRoom", "Lcom/yalla/yalla/model/user/UserInfoModel;", "loadRecommendUser", "", "pageIndex", "searchRoom", "Lo0OoO0Oo/o00OO0O0;", "searchUser", "", "userId", "searchUserStatistic", "Lo0Oo0Ooo/a4;", "repository", "Lo0Oo0Ooo/a4;", "<set-?>", "searchText$delegate", "Landroidx/compose/runtime/MutableState;", "getSearchText", "()Ljava/lang/String;", "setSearchText", "(Ljava/lang/String;)V", "searchText", "Lcom/yalla/yalla/data/db/model/SearchHistoryTable;", "searchHistoryList", "Landroidx/lifecycle/LiveData;", "getSearchHistoryList", "()Landroidx/lifecycle/LiveData;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSearchVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchVM.kt\ncom/yalla/yalla/ui/vm/main/SearchVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,54:1\n81#2:55\n107#2,2:56\n*S KotlinDebug\n*F\n+ 1 SearchVM.kt\ncom/yalla/yalla/ui/vm/main/SearchVM\n*L\n17#1:55\n17#1:56,2\n*E\n"})
public final class SearchVM extends p394o0Oo0.OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private final LiveData<List<SearchHistoryTable>> searchHistoryList;

    @NotNull
    private final a4 repository = new a4();

    /* JADX INFO: renamed from: searchText$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState searchText = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$searchRoom$1", f = "SearchVM.kt", i = {}, l = {42, 42}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<? extends RoomIndexModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31306OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31307OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31308OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31309OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, String str, Continuation continuation) {
            super(2, continuation);
            this.f31307OooO0o = str;
            this.f31309OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f31309OooO0oO, this.f31307OooO0o, continuation);
            oooO.f31308OooO0o0 = obj;
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
            int i = this.f31306OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31308OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31308OooO0o0;
            this.f31308OooO0o0 = liveDataScope;
            this.f31306OooO0Oo = 1;
            String strOooO0oO = oo000o.OooO0oO("/Webservers/bar/barsearch");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0oO, "url", strOooO0oO, 0);
            o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(this.f31307OooO0o), "search");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31309OooO0oO), "pageindex");
            obj = OooOOO.OooO0Oo(new SearchRepo$searchRoom$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31308OooO0o0 = null;
            this.f31306OooO0Oo = 2;
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
            SearchVM.this.repository.getClass();
            o0O0OOO0 o0o0ooo0OooOooo = o00Oo0.OooO00o().OooOooo();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0o0ooo0OooOooo.OooO0OO(1, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$loadRecommendRoom$1", f = "SearchVM.kt", i = {}, l = {34, 34}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<? extends RoomIndexModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31311OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31312OooO0o0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation);
            oooO0O0.f31312OooO0o0 = obj;
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
            int i = this.f31311OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31312OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31312OooO0o0;
            this.f31312OooO0o0 = liveDataScope;
            this.f31311OooO0Oo = 1;
            String strOooO0OO = oo000o.OooO0OO("/Webservers/Bar/SearchBarRecommend");
            obj = OooOOO.OooO0Oo(new SearchRepo$loadSearchRecommendRoom$$inlined$call$1(p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31312OooO0o0 = null;
            this.f31311OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$loadRecommendUser$1", f = "SearchVM.kt", i = {}, l = {38, 38}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<? extends UserInfoModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31313OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31314OooO0o0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(continuation);
            oooO0OO.f31314OooO0o0 = obj;
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
            int i = this.f31313OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31314OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31314OooO0o0;
            this.f31314OooO0o0 = liveDataScope;
            this.f31313OooO0Oo = 1;
            String strOooO0OO = oo000o.OooO0OO("/Webservers/Messages/SearchRecommend");
            obj = OooOOO.OooO0Oo(new SearchRepo$loadSearchRecommendUser$$inlined$call$1(p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31314OooO0o0 = null;
            this.f31313OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$saveNewSearchText$1", f = "SearchVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f31316OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31316OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SearchVM.this.new OooO0o(this.f31316OooO0o0, continuation);
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
            SearchVM searchVM = SearchVM.this;
            searchVM.repository.getClass();
            String searchTag = this.f31316OooO0o0;
            Intrinsics.checkNotNullParameter(searchTag, "searchTag");
            SearchHistoryTable searchHistoryTable = new SearchHistoryTable();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            searchHistoryTable.setUid(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
            searchHistoryTable.setTag(searchTag);
            searchHistoryTable.setTime(System.currentTimeMillis());
            searchHistoryTable.setType(1);
            o00Oo0.OooO00o().OooOooo().OooO00o(searchHistoryTable);
            searchVM.repository.getClass();
            o0O0OOO0 o0o0ooo0OooOooo = o00Oo0.OooO00o().OooOooo();
            Intrinsics.checkNotNullExpressionValue(o0o0ooo0OooOooo, "searchHistoryDao(...)");
            o0o0ooo0OooOooo.OooO0O0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), 1, 5, 2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$searchUser$1", f = "SearchVM.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<List<? extends UserInfoModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31317OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31318OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31319OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31320OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i, String str, Continuation continuation) {
            super(2, continuation);
            this.f31318OooO0o = str;
            this.f31320OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f31320OooO0oO, this.f31318OooO0o, continuation);
            oooOO1.f31319OooO0o0 = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<List<? extends UserInfoModel>>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31317OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f31319OooO0o0;
                this.f31319OooO0o0 = o00oo0o2;
                this.f31317OooO0Oo = 1;
                String strOooO0oO = oo000o.OooO0oO("/Webservers/Messages/UserSearch");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0oO, "url", strOooO0oO, 0);
                o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(this.f31318OooO0o), "search");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31320OooO0oO), "pageindex");
                Object objOooO0Oo = OooOOO.OooO0Oo(new SearchRepo$searchUser$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f31319OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SearchVM$searchUserStatistic$1", f = "SearchVM.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31321OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f31322OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(long j, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f31322OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f31322OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31321OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f31321OooO0Oo = 1;
                Intrinsics.checkNotNullParameter("/Webservers/Apk/UserSearchLog", "<this>");
                String url = oo000o.OooO0o0(7, "/Webservers/Apk/UserSearchLog");
                Intrinsics.checkNotNullParameter(url, "url");
                o0ooOOo o0ooooo = new o0ooOOo(url, 1);
                o0ooooo.OooO0O0(Boxing.boxLong(this.f31322OooO0o0), "touserid");
                if (OooOOO.OooO0Oo(new SearchRepo$searchUserStatistic$$inlined$call$1(o0ooooo, null), this) == coroutine_suspended) {
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
        o0O0OOO0 o0o0ooo0OooOooo = o00Oo0.OooO00o().OooOooo();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        this.searchHistoryList = o0o0ooo0OooOooo.OooO0Oo(1, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
    }

    public final void clearSearchHistory() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
    }

    @NotNull
    public final LiveData<List<SearchHistoryTable>> getSearchHistoryList() {
        return this.searchHistoryList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getSearchText() {
        return (String) this.searchText.getValue();
    }

    @NotNull
    public final LiveData<ApiResult<List<RoomIndexModel>>> loadRecommendRoom() {
        return o00oO0o.OooO00o(new OooO0O0(null));
    }

    @NotNull
    public final LiveData<ApiResult<List<UserInfoModel>>> loadRecommendUser() {
        return o00oO0o.OooO00o(new OooO0OO(null));
    }

    public final void saveNewSearchText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0o(text, null), 2, null);
    }

    @NotNull
    public final LiveData<ApiResult<List<RoomIndexModel>>> searchRoom(@NotNull String text, int pageIndex) {
        Intrinsics.checkNotNullParameter(text, "text");
        return o00oO0o.OooO00o(new OooO(pageIndex, text, null));
    }

    @NotNull
    public final o00OO0O0<ApiResult<List<UserInfoModel>>> searchUser(@NotNull String text, int pageIndex) {
        Intrinsics.checkNotNullParameter(text, "text");
        return o00O.OooO00o(this, new OooOO0(pageIndex, text, null));
    }

    public final void searchUserStatistic(long userId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOO0O(userId, null), 3, null);
    }

    public final void setSearchText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.searchText.setValue(str);
    }
}
