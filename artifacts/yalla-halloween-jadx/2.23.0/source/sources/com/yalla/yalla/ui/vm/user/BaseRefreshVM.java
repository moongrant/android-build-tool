package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.facebook.internal.NativeProtocol;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import java.util.Arrays;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o000O000;
import p394o0Oo00oO.o0O0O00;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b4\u00105J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ3\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000b2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R+\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/BaseRefreshVM;", "T", "Lo0Oo00oO/o0O0O00;", "", "isRefresh", "", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "loadData", "(Z[Ljava/lang/String;)V", "Lcom/yalla/yalla/model/http/ApiResult;", "", "apiRequest", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "dateSort", "J", "getDateSort", "()J", "setDateSort", "(J)V", "", "pageIndex", "I", "getPageIndex", "()I", "setPageIndex", "(I)V", "Landroidx/compose/runtime/MutableState;", "Lcom/code/android/uikit/contentstate/ContentState;", "contentState", "Landroidx/compose/runtime/MutableState;", "getContentState", "()Landroidx/compose/runtime/MutableState;", "setContentState", "(Landroidx/compose/runtime/MutableState;)V", "Lcom/yalla/yalla/ui/composable/common/LoadMoreState;", "loadMoreState", "getLoadMoreState", "setLoadMoreState", "<set-?>", "isRefreshIng$delegate", "isRefreshIng", "()Z", "setRefreshIng", "(Z)V", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "listData", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getListData", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseRefreshVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRefreshVM.kt\ncom/yalla/yalla/ui/vm/user/BaseRefreshVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,77:1\n81#2:78\n107#2,2:79\n*S KotlinDebug\n*F\n+ 1 BaseRefreshVM.kt\ncom/yalla/yalla/ui/vm/user/BaseRefreshVM\n*L\n33#1:78\n33#1:79,2\n*E\n"})
public abstract class BaseRefreshVM<T> extends o0O0O00 {
    public static final int $stable = 8;
    private long dateSort;
    private int pageIndex = 1;

    @NotNull
    private MutableState<ContentState> contentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Loading, null, 2, null);

    @NotNull
    private MutableState<LoadMoreState> loadMoreState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LoadMoreState.Loading, null, 2, null);

    /* JADX INFO: renamed from: isRefreshIng$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isRefreshIng = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @NotNull
    private final SnapshotStateList<T> listData = SnapshotStateKt.mutableStateListOf();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.BaseRefreshVM$loadData$1", f = "BaseRefreshVM.kt", i = {}, l = {48, 48}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32664OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String[] f32665OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BaseRefreshVM<T> f32666OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f32667OooO0oO;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.user.BaseRefreshVM$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.BaseRefreshVM$loadData$1$1", f = "BaseRefreshVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0374OooO00o extends SuspendLambda implements Function2<ApiResult<List<T>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ BaseRefreshVM<T> f32668OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0374OooO00o(BaseRefreshVM<T> baseRefreshVM, Continuation<? super C0374OooO00o> continuation) {
                super(2, continuation);
                this.f32668OooO0Oo = baseRefreshVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0374OooO00o(this.f32668OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return ((C0374OooO00o) create((ApiResult) obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f32668OooO0Oo.setRefreshIng(false);
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.BaseRefreshVM$loadData$1$2", f = "BaseRefreshVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ BaseRefreshVM<T> f32669OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(BaseRefreshVM<T> baseRefreshVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f32669OooO0Oo = baseRefreshVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f32669OooO0Oo, continuation);
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
                BaseRefreshVM<T> baseRefreshVM = this.f32669OooO0Oo;
                if (baseRefreshVM.getListData().isEmpty()) {
                    baseRefreshVM.getContentState().setValue(ContentState.Error);
                } else {
                    baseRefreshVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.BaseRefreshVM$loadData$1$3", f = "BaseRefreshVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<List<T>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32670OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f32671OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ BaseRefreshVM<T> f32672OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(BaseRefreshVM<T> baseRefreshVM, boolean z, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f32672OooO0o0 = baseRefreshVM;
                this.f32671OooO0o = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f32672OooO0o0, this.f32671OooO0o, continuation);
                oooO0OO.f32670OooO0Oo = obj;
                return oooO0OO;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return ((OooO0OO) create((List) obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                List list = (List) this.f32670OooO0Oo;
                BaseRefreshVM<T> baseRefreshVM = this.f32672OooO0o0;
                baseRefreshVM.getContentState().setValue(ContentState.Content);
                if (this.f32671OooO0o) {
                    baseRefreshVM.getListData().clear();
                }
                if (list != null) {
                    Boxing.boxBoolean(baseRefreshVM.getListData().addAll(list));
                }
                if (list == null || list.isEmpty()) {
                    baseRefreshVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                } else {
                    baseRefreshVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BaseRefreshVM<T> baseRefreshVM, String[] strArr, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32666OooO0o0 = baseRefreshVM;
            this.f32665OooO0o = strArr;
            this.f32667OooO0oO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f32666OooO0o0, this.f32665OooO0o, this.f32667OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32664OooO0Oo;
            BaseRefreshVM<T> baseRefreshVM = this.f32666OooO0o0;
            if (i != 0) {
                if (i == 1) {
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
            String[] strArr = this.f32665OooO0o;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f32664OooO0Oo = 1;
            obj = baseRefreshVM.apiRequest(strArr2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            C0374OooO00o c0374OooO00o = new C0374OooO00o(baseRefreshVM, null);
            OooO0O0 oooO0O0 = new OooO0O0(baseRefreshVM, null);
            OooO0OO oooO0OO = new OooO0OO(baseRefreshVM, this.f32667OooO0oO, null);
            this.f32664OooO0Oo = 2;
            if (o000O000.OooO0OO((ApiResult) obj, false, c0374OooO00o, oooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Nullable
    public abstract Object apiRequest(@NotNull String[] strArr, @NotNull Continuation<? super ApiResult<List<T>>> continuation);

    @NotNull
    public final MutableState<ContentState> getContentState() {
        return this.contentState;
    }

    public final long getDateSort() {
        return this.dateSort;
    }

    @NotNull
    public final SnapshotStateList<T> getListData() {
        return this.listData;
    }

    @NotNull
    public final MutableState<LoadMoreState> getLoadMoreState() {
        return this.loadMoreState;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final boolean isRefreshIng() {
        return ((Boolean) this.isRefreshIng.getValue()).booleanValue();
    }

    public final void loadData(boolean isRefresh, @NotNull String... params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (isRefreshIng()) {
            return;
        }
        setRefreshIng(true);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(this, params, isRefresh, null), 3, null);
    }

    public final void setContentState(@NotNull MutableState<ContentState> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.contentState = mutableState;
    }

    public final void setDateSort(long j) {
        this.dateSort = j;
    }

    public final void setLoadMoreState(@NotNull MutableState<LoadMoreState> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.loadMoreState = mutableState;
    }

    public final void setPageIndex(int i) {
        this.pageIndex = i;
    }

    public final void setRefreshIng(boolean z) {
        this.isRefreshIng.setValue(Boolean.valueOf(z));
    }
}
