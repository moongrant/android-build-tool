package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.model.ReadPostTable;
import com.yalla.yalla.data.repository.MomentRepository;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.o00O0O;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentFollowingTopUserVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentVM;", "()V", "userMomentList", "", "isRefresh", "", "toUserId", "", "sourceType", "", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MomentFollowingTopUserVM extends BaseMomentVM {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM$userMomentList$1", f = "MomentFollowingTopUserVM.kt", i = {}, l = {36, 36}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31660OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentFollowingTopUserVM f31661OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f31662OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31663OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f31664OooO0oo;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM$userMomentList$1$1", f = "MomentFollowingTopUserVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0358OooO00o extends SuspendLambda implements Function2<ApiResult<List<MomentDetailModel>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31665OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentFollowingTopUserVM f31666OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0358OooO00o(MomentFollowingTopUserVM momentFollowingTopUserVM, Continuation<? super C0358OooO00o> continuation) {
                super(2, continuation);
                this.f31666OooO0o0 = momentFollowingTopUserVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0358OooO00o c0358OooO00o = new C0358OooO00o(this.f31666OooO0o0, continuation);
                c0358OooO00o.f31665OooO0Oo = obj;
                return c0358OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<List<MomentDetailModel>> apiResult, Continuation<? super Unit> continuation) {
                return ((C0358OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) this.f31665OooO0Oo;
                MomentFollowingTopUserVM momentFollowingTopUserVM = this.f31666OooO0o0;
                momentFollowingTopUserVM.isRefreshIng().setValue(Boxing.boxBoolean(false));
                if (apiResult.isSuccess()) {
                    Long dateSort = apiResult.getPage().getDateSort();
                    momentFollowingTopUserVM.setDateSort(dateSort != null ? dateSort.longValue() : 0L);
                    momentFollowingTopUserVM.setPageIndex(apiResult.getPage().getPageIndex() + 1);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM$userMomentList$1$2", f = "MomentFollowingTopUserVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentFollowingTopUserVM f31667OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(MomentFollowingTopUserVM momentFollowingTopUserVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f31667OooO0Oo = momentFollowingTopUserVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f31667OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiError apiError, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(apiError, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MomentFollowingTopUserVM momentFollowingTopUserVM = this.f31667OooO0Oo;
                if (momentFollowingTopUserVM.getListData().isEmpty()) {
                    momentFollowingTopUserVM.getContentState().setValue(ContentState.Error);
                } else {
                    momentFollowingTopUserVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM$userMomentList$1$3", f = "MomentFollowingTopUserVM.kt", i = {0}, l = {60}, m = "invokeSuspend", n = {"data"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nMomentFollowingTopUserVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentFollowingTopUserVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentFollowingTopUserVM$userMomentList$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
        public static final class OooO0OO extends SuspendLambda implements Function2<List<MomentDetailModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f31668OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MomentFollowingTopUserVM f31669OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f31670OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ boolean f31671OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ long f31672OooO0oo;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM$userMomentList$1$3$1", f = "MomentFollowingTopUserVM.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0359OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f31673OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ long f31674OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ ReadPostTable f31675OooO0o0;

                /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM$OooO00o$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
                @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM$userMomentList$1$3$1$1", f = "MomentFollowingTopUserVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0360OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ long f31676OooO0Oo;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0360OooO00o(long j, Continuation<? super C0360OooO00o> continuation) {
                        super(2, continuation);
                        this.f31676OooO0Oo = j;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0360OooO00o(this.f31676OooO0Oo, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C0360OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        ResultKt.throwOnFailure(obj);
                        LiveEventBus.get("POST_READ_NEW").post(Boxing.boxLong(this.f31676OooO0Oo));
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0359OooO00o(ReadPostTable readPostTable, long j, Continuation<? super C0359OooO00o> continuation) {
                    super(2, continuation);
                    this.f31675OooO0o0 = readPostTable;
                    this.f31674OooO0o = j;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0359OooO00o(this.f31675OooO0o0, this.f31674OooO0o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0359OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f31673OooO0Oo;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        o00Oo0.OooO00o().OooOoOO().OooO00o(this.f31675OooO0o0);
                        C0360OooO00o c0360OooO00o = new C0360OooO00o(this.f31674OooO0o, null);
                        this.f31673OooO0Oo = 1;
                        if (OooOOO.OooO0o0(c0360OooO00o, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(MomentFollowingTopUserVM momentFollowingTopUserVM, boolean z, long j, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f31669OooO0o = momentFollowingTopUserVM;
                this.f31671OooO0oO = z;
                this.f31672OooO0oo = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f31669OooO0o, this.f31671OooO0oO, this.f31672OooO0oo, continuation);
                oooO0OO.f31670OooO0o0 = obj;
                return oooO0OO;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<MomentDetailModel> list, Continuation<? super Unit> continuation) {
                return ((OooO0OO) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x009e  */
            /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
            /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
            /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
            /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                List list;
                List list2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f31668OooO0Oo;
                MomentFollowingTopUserVM momentFollowingTopUserVM = this.f31669OooO0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    list = (List) this.f31670OooO0o0;
                    if (momentFollowingTopUserVM.getPageIndex() == 1) {
                        if ((list == null || list.isEmpty()) ? false : true) {
                            ReadPostTable readPostTable = new ReadPostTable();
                            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                            readPostTable.setCid(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                            long j = this.f31672OooO0oo;
                            readPostTable.setUserId(j);
                            readPostTable.setReadPostId(((MomentDetailModel) list.get(0)).getId());
                            if (((MomentDetailModel) list.get(0)).isTop() && list.size() > 1) {
                                readPostTable.setReadPostId(((MomentDetailModel) list.get(1)).getId());
                            }
                            C0359OooO00o c0359OooO00o = new C0359OooO00o(readPostTable, j, null);
                            this.f31670OooO0o0 = list;
                            this.f31668OooO0Oo = 1;
                            if (OooOOO.OooO0Oo(c0359OooO00o, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            list2 = list;
                        }
                    }
                    momentFollowingTopUserVM.getContentState().setValue(ContentState.Content);
                    if (this.f31671OooO0oO) {
                        momentFollowingTopUserVM.getListData().clear();
                    }
                    if (list != null) {
                        Boxing.boxBoolean(momentFollowingTopUserVM.getListData().addAll(list));
                    }
                    if (list != null || list.isEmpty()) {
                        momentFollowingTopUserVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                    } else {
                        momentFollowingTopUserVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.f31670OooO0o0;
                ResultKt.throwOnFailure(obj);
                list = list2;
                momentFollowingTopUserVM.getContentState().setValue(ContentState.Content);
                if (this.f31671OooO0oO) {
                    momentFollowingTopUserVM.getListData().clear();
                }
                if (list != null) {
                    Boxing.boxBoolean(momentFollowingTopUserVM.getListData().addAll(list));
                }
                if (list != null || list.isEmpty()) {
                    momentFollowingTopUserVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                } else {
                    momentFollowingTopUserVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, MomentFollowingTopUserVM momentFollowingTopUserVM, int i, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31662OooO0o0 = j;
            this.f31661OooO0o = momentFollowingTopUserVM;
            this.f31663OooO0oO = i;
            this.f31664OooO0oo = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f31662OooO0o0, this.f31661OooO0o, this.f31663OooO0oO, this.f31664OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOooO0OO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31660OooO0Oo;
            MomentFollowingTopUserVM momentFollowingTopUserVM = this.f31661OooO0o;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    objOooO0OO = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            long j = this.f31662OooO0o0;
            long dateSort = momentFollowingTopUserVM.getDateSort();
            int pageIndex = momentFollowingTopUserVM.getPageIndex();
            int i2 = this.f31663OooO0oO;
            this.f31660OooO0Oo = 1;
            objOooO0OO = MomentRepository.OooO0OO(j, dateSort, pageIndex, i2, -1, this);
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
            C0358OooO00o c0358OooO00o = new C0358OooO00o(momentFollowingTopUserVM, null);
            OooO0O0 oooO0O0 = new OooO0O0(momentFollowingTopUserVM, null);
            OooO0OO oooO0OO = new OooO0OO(this.f31661OooO0o, this.f31664OooO0oo, this.f31662OooO0o0, null);
            this.f31660OooO0Oo = 2;
            if (o00O0O.OooO0OO((ApiResult) objOooO0OO, false, c0358OooO00o, oooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void userMomentList$default(MomentFollowingTopUserVM momentFollowingTopUserVM, boolean z, long j, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        momentFollowingTopUserVM.userMomentList(z, j, i);
    }

    public final void userMomentList(boolean isRefresh, long toUserId, int sourceType) {
        if (isRefreshIng().getValue().booleanValue()) {
            return;
        }
        if (isRefresh) {
            getLoadMoreState().setValue(LoadMoreState.None);
            setPageIndex(1);
            setDateSort(0L);
        }
        isRefreshIng().setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(toUserId, this, sourceType, isRefresh, null), 3, null);
    }
}
