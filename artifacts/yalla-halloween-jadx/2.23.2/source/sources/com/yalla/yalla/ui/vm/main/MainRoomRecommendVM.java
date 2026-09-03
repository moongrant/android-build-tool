package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.model.TopExploreModel;
import com.yalla.yalla.model.TopRankHeaderModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.repository.MainRoomRepository$loadNewRoomData$$inlined$call$1;
import com.yalla.yalla.repository.MainRoomRepository$loadRankingTopData$$inlined$call$1;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p384o0OOoo0O.Oooo0;
import p394o0Oo0.OooOO0;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002J\u0006\u0010\b\u001a\u00020\u0007R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/MainRoomRecommendVM;", "Lo0Oo0/OooOO0;", "Lo0OoO0Oo/o00OO0O0;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "Lcom/yalla/yalla/model/room/RoomIndexModel;", "loadNewRoomData", "", "loadRankingTopData", "", "pageIndex", "I", "getPageIndex", "()I", "setPageIndex", "(I)V", "Landroidx/compose/runtime/MutableState;", "Lcom/yalla/yalla/model/TopRankHeaderModel;", "rankList", "Landroidx/compose/runtime/MutableState;", "getRankList", "()Landroidx/compose/runtime/MutableState;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MainRoomRecommendVM extends OooOO0 {
    public static final int $stable = 8;
    private int pageIndex = 1;

    @NotNull
    private final MutableState<TopRankHeaderModel> rankList = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomRecommendVM$loadNewRoomData$1", f = "MainRoomRecommendVM.kt", i = {0}, l = {18}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<o00OO0O0<ApiResult<List<RoomIndexModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31224OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31226OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = MainRoomRecommendVM.this.new OooO00o(continuation);
            oooO00o.f31226OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<List<RoomIndexModel>>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31224OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f31226OooO0o0;
                int pageIndex = MainRoomRecommendVM.this.getPageIndex();
                this.f31226OooO0o0 = o00oo0o2;
                this.f31224OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO(Oooo0.f43444o0ooOoO);
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 1);
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(pageIndex), "pageindex");
                Object objOooO0Oo = OooOOO.OooO0Oo(new MainRoomRepository$loadNewRoomData$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f31226OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue((ApiResult) obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomRecommendVM$loadRankingTopData$1", f = "MainRoomRecommendVM.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31227OooO0Oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainRoomRecommendVM.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            TopRankHeaderModel topRankHeaderModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31227OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f31227OooO0Oo = 1;
                String url = oo000o.OooO0OO(Oooo0.f43382OoooOoO);
                Intrinsics.checkNotNullParameter(url, "url");
                o0ooOOo o0ooooo = new o0ooOOo(url, 1);
                o0ooooo.OooO00o();
                obj = OooOOO.OooO0Oo(new MainRoomRepository$loadRankingTopData$$inlined$call$1(o0ooooo, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TopExploreModel topExploreModel = (TopExploreModel) ((ApiResult) obj).getData();
            if (topExploreModel != null && (topRankHeaderModel = topExploreModel.hourData) != null) {
                MainRoomRecommendVM.this.getRankList().setValue(topRankHeaderModel);
            }
            return Unit.INSTANCE;
        }
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    @NotNull
    public final MutableState<TopRankHeaderModel> getRankList() {
        return this.rankList;
    }

    @NotNull
    public final o00OO0O0<ApiResult<List<RoomIndexModel>>> loadNewRoomData() {
        return o00O.OooO00o(this, new OooO00o(null));
    }

    public final void loadRankingTopData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(null), 3, null);
    }

    public final void setPageIndex(int i) {
        this.pageIndex = i;
    }
}
