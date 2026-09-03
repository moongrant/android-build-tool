package com.yalla.yalla.ui.vm.store;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.model.CustomizeThemeModel;
import com.yalla.yalla.model.MyThemeListModel;
import com.yalla.yalla.model.RenewCustomizeTheme;
import com.yalla.yalla.model.ThemeBoughtModel;
import com.yalla.yalla.model.ThemeListModel;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414o0Oo0o0O.o00OOOOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00070\u0006J \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\u0006\u0010\u000e\u001a\u00020\rJ\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00062\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tJ\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00070\u00062\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rJ\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00020\u00070\u0006J\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00070\u00062\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\tJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00070\u0006¨\u0006 "}, d2 = {"Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "Lo0Oo0/OooOO0;", "", "Lcom/yalla/yalla/model/ThemeListModel;", "data", "formatThemeStyleListData", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "getThemeStyleListData", "", "themeTypeId", "Lcom/yalla/yalla/model/ThemeModel;", "getThemeTypeListData", "", "shopId", "Lcom/yalla/yalla/model/ThemeBoughtModel;", "goBuyTheme", "region", "themeType", "Lcom/yalla/yalla/model/MyThemeListModel;", "getThemeMineListData", "themeId", "barId", "", "setRoomTheme", "Lcom/yalla/yalla/model/CustomizeThemeModel;", "getCustomizeThemeListData", "Lcom/yalla/yalla/model/RenewCustomizeTheme;", "renewCustomTheme", "getRoomThemeGiveCount", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class ThemeStoreVM extends p396o0Oo0.OooOO0 {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.ThemeStoreVM$getThemeTypeListData$1", f = "ThemeStoreVM.kt", i = {}, l = {30, 30}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<ThemeModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32088OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f32089OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32090OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f32089OooO0o = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f32089OooO0o, continuation);
            oooO.f32090OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<ThemeModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32088OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32090OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32090OooO0o0;
            o00OOOOo o00ooooo2 = o00OOOOo.f46210OooO00o;
            this.f32090OooO0o0 = liveDataScope;
            this.f32088OooO0Oo = 1;
            obj = o00ooooo2.OooO0oo(this.f32089OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32090OooO0o0 = null;
            this.f32088OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.ThemeStoreVM$getCustomizeThemeListData$1", f = "ThemeStoreVM.kt", i = {}, l = {40, 40}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<CustomizeThemeModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32091OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32092OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f32092OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<CustomizeThemeModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32091OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32092OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32092OooO0o0;
            o00OOOOo o00ooooo2 = o00OOOOo.f46210OooO00o;
            this.f32092OooO0o0 = liveDataScope;
            this.f32091OooO0Oo = 1;
            obj = o00ooooo2.OooO0o0(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32092OooO0o0 = null;
            this.f32091OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.ThemeStoreVM$getRoomThemeGiveCount$1", f = "ThemeStoreVM.kt", i = {}, l = {44, 44}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Integer>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32093OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32094OooO0o0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation);
            oooO0O0.f32094OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Integer>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32093OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32094OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32094OooO0o0;
            o00OOOOo o00ooooo2 = o00OOOOo.f46210OooO00o;
            this.f32094OooO0o0 = liveDataScope;
            this.f32093OooO0Oo = 1;
            obj = o00ooooo2.OooO0Oo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32094OooO0o0 = null;
            this.f32093OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.ThemeStoreVM$getThemeMineListData$1", f = "ThemeStoreVM.kt", i = {}, l = {35, 35}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<MyThemeListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32095OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f32096OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32097OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f32098OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, int i2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f32096OooO0o = i;
            this.f32098OooO0oO = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f32096OooO0o, this.f32098OooO0oO, continuation);
            oooO0OO.f32097OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<MyThemeListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32095OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32097OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32097OooO0o0;
            o00OOOOo o00ooooo2 = o00OOOOo.f46210OooO00o;
            this.f32097OooO0o0 = liveDataScope;
            this.f32095OooO0Oo = 1;
            obj = o00ooooo2.OooO0o(this.f32096OooO0o, this.f32098OooO0oO, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32097OooO0o0 = null;
            this.f32095OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.ThemeStoreVM$getThemeStyleListData$1", f = "ThemeStoreVM.kt", i = {}, l = {12, 12}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<ThemeListModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32099OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32101OooO0o0;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = ThemeStoreVM.this.new OooO0o(continuation);
            oooO0o.f32101OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<ThemeListModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32099OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32101OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32101OooO0o0;
            o00OOOOo o00ooooo2 = o00OOOOo.f46210OooO00o;
            this.f32101OooO0o0 = liveDataScope;
            this.f32099OooO0Oo = 1;
            obj = o00ooooo2.OooO0oO(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                if (apiResult.getData() != null) {
                    Object data = apiResult.getData();
                    Intrinsics.checkNotNull(data);
                    if (((List) data).size() > 0) {
                        Object data2 = apiResult.getData();
                        Intrinsics.checkNotNull(data2);
                        apiResult.setData(ThemeStoreVM.this.formatThemeStyleListData((List) data2));
                    }
                }
            }
            this.f32101OooO0o0 = null;
            this.f32099OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.ThemeStoreVM$goBuyTheme$1", f = "ThemeStoreVM.kt", i = {}, l = {32, 32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<ThemeBoughtModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32102OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32103OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32104OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f32103OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f32103OooO0o, continuation);
            oooOO1.f32104OooO0o0 = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<ThemeBoughtModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32102OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32104OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32104OooO0o0;
            o00OOOOo o00ooooo2 = o00OOOOo.f46210OooO00o;
            this.f32104OooO0o0 = liveDataScope;
            this.f32102OooO0Oo = 1;
            obj = o00ooooo2.OooO(this.f32103OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32104OooO0o0 = null;
            this.f32102OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.ThemeStoreVM$renewCustomTheme$1", f = "ThemeStoreVM.kt", i = {}, l = {42, 42}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RenewCustomizeTheme>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32105OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32106OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32107OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f32108OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(long j, int i, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f32106OooO0o = j;
            this.f32108OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f32106OooO0o, this.f32108OooO0oO, continuation);
            oooOO0O.f32107OooO0o0 = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RenewCustomizeTheme>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32105OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32107OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32107OooO0o0;
            o00OOOOo o00ooooo2 = o00OOOOo.f46210OooO00o;
            long j = this.f32106OooO0o;
            int i2 = this.f32108OooO0oO;
            this.f32107OooO0o0 = liveDataScope;
            this.f32105OooO0Oo = 1;
            obj = o00ooooo2.OooOO0O(j, i2, 0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32107OooO0o0 = null;
            this.f32105OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.store.ThemeStoreVM$setRoomTheme$1", f = "ThemeStoreVM.kt", i = {}, l = {38, 38}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32109OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32110OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32111OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f32112OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(long j, long j2, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f32110OooO0o = j;
            this.f32112OooO0oO = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO0 oooOOO0 = new OooOOO0(this.f32110OooO0o, this.f32112OooO0oO, continuation);
            oooOOO0.f32111OooO0o0 = obj;
            return oooOOO0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<String>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32109OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32111OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32111OooO0o0;
            o00OOOOo o00ooooo2 = o00OOOOo.f46210OooO00o;
            long j = this.f32110OooO0o;
            long j2 = this.f32112OooO0oO;
            this.f32111OooO0o0 = liveDataScope;
            this.f32109OooO0Oo = 1;
            obj = o00ooooo2.OooOO0o(j, j2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32111OooO0o0 = null;
            this.f32109OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ThemeListModel> formatThemeStyleListData(List<ThemeListModel> data) {
        ArrayList arrayList = new ArrayList();
        for (ThemeListModel themeListModel : data) {
            if (themeListModel.getThemItem() != null) {
                ArrayList<ThemeModel> themItem = themeListModel.getThemItem();
                Intrinsics.checkNotNull(themItem);
                if (themItem.size() > 0) {
                    arrayList.add(themeListModel);
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final LiveData<ApiResult<List<CustomizeThemeModel>>> getCustomizeThemeListData() {
        return o00oO0o.OooO00o(new OooO00o(null));
    }

    @NotNull
    public final LiveData<ApiResult<Integer>> getRoomThemeGiveCount() {
        return o00oO0o.OooO00o(new OooO0O0(null));
    }

    @NotNull
    public final LiveData<ApiResult<MyThemeListModel>> getThemeMineListData(int region, int themeType) {
        return o00oO0o.OooO00o(new OooO0OO(region, themeType, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<ThemeListModel>>> getThemeStyleListData() {
        return o00oO0o.OooO00o(new OooO0o(null));
    }

    @NotNull
    public final LiveData<ApiResult<List<ThemeModel>>> getThemeTypeListData(int themeTypeId) {
        return o00oO0o.OooO00o(new OooO(themeTypeId, null));
    }

    @NotNull
    public final LiveData<ApiResult<ThemeBoughtModel>> goBuyTheme(long shopId) {
        return o00oO0o.OooO00o(new OooOO0(shopId, null));
    }

    @NotNull
    public final LiveData<ApiResult<RenewCustomizeTheme>> renewCustomTheme(long themeId, int themeType) {
        return o00oO0o.OooO00o(new OooOO0O(themeId, themeType, null));
    }

    @NotNull
    public final LiveData<ApiResult<String>> setRoomTheme(long themeId, long barId) {
        return o00oO0o.OooO00o(new OooOOO0(themeId, barId, null));
    }
}
