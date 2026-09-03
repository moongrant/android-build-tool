package com.yalla.yalla.ui.vm.user;

import android.os.Looper;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o00oO0o;
import com.code.android.util.o0OoOo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.CustomizeThemeModel;
import com.yalla.yalla.model.MyThemeListModel;
import com.yalla.yalla.model.RenewCustomizeTheme;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomIndexModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00Oo000.OooO;
import p394o0Oo00oO.o0O0O00;
import p406o0Oo0Ooo.r;
import p420o0OoO0OO.o0OO00O;
import p420o0OoO0OO.o0ooOOo;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\"\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\n0\u00102\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020 0)8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-¨\u00062"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/RoomThemeVM;", "Lo0Oo00oO/o0O0O00;", "", "Lcom/yalla/yalla/model/ThemeModel;", "addDefaultTheme", "", "id", "", "isRefresh", "Lo0OoO0OO/o0OO00O;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "setRoomTheme", "themeId", "", "themeType", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/RenewCustomizeTheme;", "renewCustomTheme", "Landroidx/compose/runtime/MutableState;", "currentThemeShopId", "Landroidx/compose/runtime/MutableState;", "getCurrentThemeShopId", "()Landroidx/compose/runtime/MutableState;", "setCurrentThemeShopId", "(Landroidx/compose/runtime/MutableState;)V", "isShowDialogSetThemeFrozen", "setShowDialogSetThemeFrozen", "isShowDialogForRenewals", "setShowDialogForRenewals", "isShowDialogCreateRoom", "setShowDialogCreateRoom", "Lcom/yalla/yalla/model/CustomizeThemeModel;", "selectCustomizeThemeModel", "getSelectCustomizeThemeModel", "setSelectCustomizeThemeModel", "", "pageList", "Ljava/util/List;", "getPageList", "()Ljava/util/List;", "Lo00Oo000/OooO0O0;", "mineRoomTheme", "Lo00Oo000/OooO0O0;", "getMineRoomTheme", "()Lo00Oo000/OooO0O0;", "customizeRoomTheme", "getCustomizeRoomTheme", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class RoomThemeVM extends o0O0O00 {
    public static final int $stable = 8;

    @NotNull
    private MutableState<Long> currentThemeShopId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    @NotNull
    private final p143o00Oo000.OooO0O0<CustomizeThemeModel> customizeRoomTheme;

    @NotNull
    private MutableState<Boolean> isShowDialogCreateRoom;

    @NotNull
    private MutableState<Boolean> isShowDialogForRenewals;

    @NotNull
    private MutableState<Boolean> isShowDialogSetThemeFrozen;

    @NotNull
    private final p143o00Oo000.OooO0O0<ThemeModel> mineRoomTheme;

    @NotNull
    private final List<String> pageList;

    @NotNull
    private MutableState<CustomizeThemeModel> selectCustomizeThemeModel;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.RoomThemeVM$customizeRoomTheme$1", f = "RoomThemeVM.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomThemeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeVM.kt\ncom/yalla/yalla/ui/vm/user/RoomThemeVM$customizeRoomTheme$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super OooO<CustomizeThemeModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32692OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f32694OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = RoomThemeVM.this.new OooO00o(continuation);
            oooO00o.f32694OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super OooO<CustomizeThemeModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32692OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f32694OooO0o0 != 1) {
                    return new OooO(new ArrayList());
                }
                r rVar = r.f45104OooO00o;
                this.f32692OooO0Oo = 1;
                obj = rVar.OooO0o0(this);
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
            List list = (List) apiResult.getData();
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((CustomizeThemeModel) next).getIsSelected());
                CustomizeThemeModel customizeThemeModel = (CustomizeThemeModel) next;
                if (customizeThemeModel != null) {
                    RoomThemeVM.this.getCurrentThemeShopId().setValue(Boxing.boxLong(customizeThemeModel.getId()));
                }
            }
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.RoomThemeVM$mineRoomTheme$1", f = "RoomThemeVM.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super OooO<ThemeModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32695OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f32697OooO0o0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = RoomThemeVM.this.new OooO0O0(continuation);
            oooO0O0.f32697OooO0o0 = ((Number) obj).intValue();
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super OooO<ThemeModel>> continuation) {
            return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32695OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f32697OooO0o0;
                Integer value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25003OooO0o0.getValue();
                if (value == null) {
                    return new OooO(new ArrayList());
                }
                int iIntValue = value.intValue();
                if (i2 != 1) {
                    return new OooO(new ArrayList());
                }
                r rVar = r.f45104OooO00o;
                this.f32695OooO0Oo = 1;
                obj = rVar.OooO0o(iIntValue, 2, this);
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
            MyThemeListModel myThemeListModel = (MyThemeListModel) apiResult.getData();
            if (myThemeListModel != null) {
                RoomThemeVM roomThemeVM = RoomThemeVM.this;
                roomThemeVM.getCurrentThemeShopId().setValue(Boxing.boxLong(myThemeListModel.getCurrentThemeId()));
                roomThemeVM.addDefaultTheme(myThemeListModel.getData());
            }
            MyThemeListModel myThemeListModel2 = (MyThemeListModel) apiResult.getData();
            return ApiResult.toPagingLoadResource$default(apiResult, myThemeListModel2 != null ? myThemeListModel2.getData() : null, false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.RoomThemeVM$renewCustomTheme$1", f = "RoomThemeVM.kt", i = {}, l = {110, 110}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RenewCustomizeTheme>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32698OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32699OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32700OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f32701OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, int i, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f32699OooO0o = j;
            this.f32701OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f32699OooO0o, this.f32701OooO0oO, continuation);
            oooO0OO.f32700OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RenewCustomizeTheme>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32698OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32700OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32700OooO0o0;
            r rVar = r.f45104OooO00o;
            long j = this.f32699OooO0o;
            int i2 = this.f32701OooO0oO;
            this.f32700OooO0o0 = liveDataScope;
            this.f32698OooO0Oo = 1;
            obj = rVar.OooOO0O(j, i2, 0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32700OooO0o0 = null;
            this.f32698OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.RoomThemeVM$setRoomTheme$1", f = "RoomThemeVM.kt", i = {0}, l = {83}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nRoomThemeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeVM.kt\ncom/yalla/yalla/ui/vm/user/RoomThemeVM$setRoomTheme$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1855#2,2:113\n1855#2,2:115\n*S KotlinDebug\n*F\n+ 1 RoomThemeVM.kt\ncom/yalla/yalla/ui/vm/user/RoomThemeVM$setRoomTheme$1\n*L\n87#1:113,2\n95#1:115,2\n*E\n"})
    public static final class OooO0o extends SuspendLambda implements Function2<o0OO00O<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32702OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32703OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32704OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomThemeVM f32705OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f32706OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, RoomThemeVM roomThemeVM, boolean z, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f32703OooO0o = j;
            this.f32705OooO0oO = roomThemeVM;
            this.f32706OooO0oo = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f32703OooO0o, this.f32705OooO0oO, this.f32706OooO0oo, continuation);
            oooO0o.f32704OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<String>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32702OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f32704OooO0o0;
                RoomIndexModel value = o000000O.f46724OoooOoo.getValue();
                if (value == null || (str = value.barid) == null) {
                    return Unit.INSTANCE;
                }
                long jOooO = o0OoOo0.OooO(0L, str);
                r rVar = r.f45104OooO00o;
                long j = this.f32703OooO0o;
                this.f32704OooO0o0 = o0oo00o3;
                this.f32702OooO0Oo = 1;
                Object objOooOO0o = rVar.OooOO0o(j, jOooO, this);
                if (objOooOO0o == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooOO0o;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f32704OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                RoomThemeVM roomThemeVM = this.f32705OooO0oO;
                MutableState<Long> currentThemeShopId = roomThemeVM.getCurrentThemeShopId();
                long j2 = this.f32703OooO0o;
                currentThemeShopId.setValue(Boxing.boxLong(j2));
                Iterator<T> it = roomThemeVM.getMineRoomTheme().f37663OooO0Oo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ThemeModel themeModel = (ThemeModel) it.next();
                    themeModel.setSelected(false);
                    if (themeModel.getShopId() == j2) {
                        themeModel.setSelected(true);
                    }
                }
                roomThemeVM.getMineRoomTheme().OooO0O0();
                for (CustomizeThemeModel customizeThemeModel : roomThemeVM.getCustomizeRoomTheme().f37663OooO0Oo) {
                    customizeThemeModel.setSelected(false);
                    if (customizeThemeModel.getId() == j2) {
                        customizeThemeModel.setSelected(true);
                    }
                }
                roomThemeVM.getCustomizeRoomTheme().OooO0O0();
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.item_in_use_now);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
                if (this.f32706OooO0oo) {
                    LiveEventBus.get("ROOM_THEME_UPDATE").post(Boxing.boxBoolean(true));
                }
            }
            o0oo00o2.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    public RoomThemeVM() {
        Boolean bool = Boolean.FALSE;
        this.isShowDialogSetThemeFrozen = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isShowDialogForRenewals = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isShowDialogCreateRoom = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.selectCustomizeThemeModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.pageList = CollectionsKt.listOf((Object[]) new String[]{o0000.OooO0OO(oO00OOo0.Mine), o0000.OooO0OO(oO00OOo0.room_theme_customize)});
        this.mineRoomTheme = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO0O0(null));
        this.customizeRoomTheme = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ThemeModel> addDefaultTheme(List<ThemeModel> list) {
        if (list != null) {
            Iterator<ThemeModel> it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().getIsSelected()) {
                    z = true;
                }
            }
            ThemeModel defaultDrawable = new ThemeModel().setDefaultDrawable(true, o0000.OooO0OO(oO00OOo0.Yalla_1));
            if (!z) {
                defaultDrawable.setSelected(true);
            }
            list.add(0, defaultDrawable);
        }
        return list;
    }

    @NotNull
    public final MutableState<Long> getCurrentThemeShopId() {
        return this.currentThemeShopId;
    }

    @NotNull
    public final p143o00Oo000.OooO0O0<CustomizeThemeModel> getCustomizeRoomTheme() {
        return this.customizeRoomTheme;
    }

    @NotNull
    public final p143o00Oo000.OooO0O0<ThemeModel> getMineRoomTheme() {
        return this.mineRoomTheme;
    }

    @NotNull
    public final List<String> getPageList() {
        return this.pageList;
    }

    @NotNull
    public final MutableState<CustomizeThemeModel> getSelectCustomizeThemeModel() {
        return this.selectCustomizeThemeModel;
    }

    @NotNull
    public final MutableState<Boolean> isShowDialogCreateRoom() {
        return this.isShowDialogCreateRoom;
    }

    @NotNull
    public final MutableState<Boolean> isShowDialogForRenewals() {
        return this.isShowDialogForRenewals;
    }

    @NotNull
    public final MutableState<Boolean> isShowDialogSetThemeFrozen() {
        return this.isShowDialogSetThemeFrozen;
    }

    @NotNull
    public final LiveData<ApiResult<RenewCustomizeTheme>> renewCustomTheme(long themeId, int themeType) {
        return o00oO0o.OooO00o(new OooO0OO(themeId, themeType, null));
    }

    public final void setCurrentThemeShopId(@NotNull MutableState<Long> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.currentThemeShopId = mutableState;
    }

    @NotNull
    public final o0OO00O<ApiResult<String>> setRoomTheme(long id, boolean isRefresh) {
        return o0ooOOo.OooO00o(this, new OooO0o(id, this, isRefresh, null));
    }

    public final void setSelectCustomizeThemeModel(@NotNull MutableState<CustomizeThemeModel> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.selectCustomizeThemeModel = mutableState;
    }

    public final void setShowDialogCreateRoom(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.isShowDialogCreateRoom = mutableState;
    }

    public final void setShowDialogForRenewals(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.isShowDialogForRenewals = mutableState;
    }

    public final void setShowDialogSetThemeFrozen(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.isShowDialogSetThemeFrozen = mutableState;
    }
}
