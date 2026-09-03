package p577o0oOoOoO;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.RoomRepo$getRoomRecordList$$inlined$call$1;
import com.yalla.yalla.data.repository.RoomRepo$searchRoomRecordList$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomUserRecordModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;
import p579o0oOoo.oO000Oo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomUserActionRecordVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomUserActionRecordVM.kt\ncom/yalla/yalla/ui/vm/room/RoomUserActionRecordVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,46:1\n81#2:47\n107#2,2:48\n*S KotlinDebug\n*F\n+ 1 RoomUserActionRecordVM.kt\ncom/yalla/yalla/ui/vm/room/RoomUserActionRecordVM\n*L\n14#1:47\n14#1:48,2\n*E\n"})
public final class oOO00 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState f56339OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final p143o00Oo000.OooO0O0<RoomUserRecordModel> f56340OooO0O0 = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO(null));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final p143o00Oo000.OooO0O0<RoomUserRecordModel> f56341OooO0OO = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final p143o00Oo000.OooO0O0<RoomUserRecordModel> f56342OooO0Oo = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO0OO(null));

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final p143o00Oo000.OooO0O0<RoomUserRecordModel> f56344OooO0o0 = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooOO0(null));

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final p143o00Oo000.OooO0O0<RoomUserRecordModel> f56343OooO0o = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO0O0(null));

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final p143o00Oo000.OooO0O0<RoomUserRecordModel> f56345OooO0oO = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO0o(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomUserActionRecordVM$removeRoomPaging$1", f = "RoomUserActionRecordVM.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<Integer, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56346OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f56347OooO0o0;

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(continuation);
            oooO.f56347OooO0o0 = ((Number) obj).intValue();
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>> continuation) {
            return ((OooO) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56346OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f56347OooO0o0;
                long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
                this.f56346OooO0Oo = 1;
                String strOooO0o = o000OOo0.OooO0o("/Webservers/Room/GetExecRecord");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0o, "url", strOooO0o, 0);
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(jOooO0o0), "roomid");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(1), "tabtype");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageIndex");
                obj = OooOOO.OooO0Oo(new RoomRepo$getRoomRecordList$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomUserActionRecordVM$banPaging$1", f = "RoomUserActionRecordVM.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56348OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f56349OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f56349OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56348OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f56349OooO0o0;
                long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
                this.f56348OooO0Oo = 1;
                String strOooO0o = o000OOo0.OooO0o("/Webservers/Room/GetExecRecord");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0o, "url", strOooO0o, 0);
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(jOooO0o0), "roomid");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(2), "tabtype");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageIndex");
                obj = OooOOO.OooO0Oo(new RoomRepo$getRoomRecordList$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomUserActionRecordVM$banSearchPaging$1", f = "RoomUserActionRecordVM.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56350OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f56352OooO0o0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = oOO00.this.new OooO0O0(continuation);
            oooO0O0.f56352OooO0o0 = ((Number) obj).intValue();
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>> continuation) {
            return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56350OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f56352OooO0o0;
                String searchText = oOO00.this.getSearchText();
                long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
                this.f56350OooO0Oo = 1;
                String strOooO0oO = o000OOo0.OooO0oO("/Webservers/Bar/BarExecSearch");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0oO, "url", strOooO0oO, 0);
                o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(searchText), "search");
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(jOooO0o0), "roomid");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(2), "tabtype");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageIndex");
                obj = OooOOO.OooO0Oo(new RoomRepo$searchRoomRecordList$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomUserActionRecordVM$removeMicPaging$1", f = "RoomUserActionRecordVM.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<Integer, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56353OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f56354OooO0o0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(continuation);
            oooO0OO.f56354OooO0o0 = ((Number) obj).intValue();
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>> continuation) {
            return ((OooO0OO) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56353OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f56354OooO0o0;
                long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
                this.f56353OooO0Oo = 1;
                String strOooO0o = o000OOo0.OooO0o("/Webservers/Room/GetExecRecord");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0o, "url", strOooO0o, 0);
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(jOooO0o0), "roomid");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(3), "tabtype");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageIndex");
                obj = OooOOO.OooO0Oo(new RoomRepo$getRoomRecordList$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomUserActionRecordVM$removeMicSearchPaging$1", f = "RoomUserActionRecordVM.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<Integer, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56355OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f56357OooO0o0;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = oOO00.this.new OooO0o(continuation);
            oooO0o.f56357OooO0o0 = ((Number) obj).intValue();
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>> continuation) {
            return ((OooO0o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56355OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f56357OooO0o0;
                String searchText = oOO00.this.getSearchText();
                long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
                this.f56355OooO0Oo = 1;
                String strOooO0oO = o000OOo0.OooO0oO("/Webservers/Bar/BarExecSearch");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0oO, "url", strOooO0oO, 0);
                o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(searchText), "search");
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(jOooO0o0), "roomid");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(3), "tabtype");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageIndex");
                obj = OooOOO.OooO0Oo(new RoomRepo$searchRoomRecordList$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomUserActionRecordVM$removeRoomSearchPaging$1", f = "RoomUserActionRecordVM.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<Integer, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56358OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f56360OooO0o0;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = oOO00.this.new OooOO0(continuation);
            oooOO1.f56360OooO0o0 = ((Number) obj).intValue();
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super p143o00Oo000.OooO<RoomUserRecordModel>> continuation) {
            return ((OooOO0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56358OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f56360OooO0o0;
                String searchText = oOO00.this.getSearchText();
                long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
                this.f56358OooO0Oo = 1;
                String strOooO0oO = o000OOo0.OooO0oO("/Webservers/Bar/BarExecSearch");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0oO, "url", strOooO0oO, 0);
                o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(searchText), "search");
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(jOooO0o0), "roomid");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(1), "tabtype");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageIndex");
                obj = OooOOO.OooO0Oo(new RoomRepo$searchRoomRecordList$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getSearchText() {
        return (String) this.f56339OooO00o.getValue();
    }
}
