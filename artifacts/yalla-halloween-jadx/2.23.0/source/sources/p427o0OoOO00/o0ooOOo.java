package p427o0OoOO00;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.yalla.yalla.api.old.ApiRoomNew$checkCanEnterRoom$$inlined$call$1;
import com.yalla.yalla.model.CheckEnterRoomModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import io.agora.rtc.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o000O000;
import p385o0OOooOO.o00oOoo;
import p519o0o0O0oO.oO00O0oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1", f = "RoomStateManager.kt", i = {}, l = {Constants.ERR_ALREADY_IN_RECORDING}, m = "invokeSuspend", n = {}, s = {})
public final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45710OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomModel f45711OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f45712OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1$1", f = "RoomStateManager.kt", i = {}, l = {161, 161}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f45713OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ oO00O0oO f45714OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomModel f45715OooO0o0;

        /* JADX INFO: renamed from: o0OoOO00.o0ooOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1$1$1", f = "RoomStateManager.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0473OooO00o extends SuspendLambda implements Function2<ApiResult<CheckEnterRoomModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f45716OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ oO00O0oO f45717OooO0o0;

            /* JADX INFO: renamed from: o0OoOO00.o0ooOOo$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1$1$1$1", f = "RoomStateManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0474OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ oO00O0oO f45718OooO0Oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0474OooO00o(oO00O0oO oo00o0oo, Continuation<? super C0474OooO00o> continuation) {
                    super(2, continuation);
                    this.f45718OooO0Oo = oo00o0oo;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0474OooO00o(this.f45718OooO0Oo, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0474OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    this.f45718OooO0Oo.dismiss();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0473OooO00o(oO00O0oO oo00o0oo, Continuation<? super C0473OooO00o> continuation) {
                super(2, continuation);
                this.f45717OooO0o0 = oo00o0oo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0473OooO00o(this.f45717OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<CheckEnterRoomModel> apiResult, Continuation<? super Unit> continuation) {
                return ((C0473OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f45716OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C0474OooO00o c0474OooO00o = new C0474OooO00o(this.f45717OooO0o0, null);
                    this.f45716OooO0Oo = 1;
                    if (OooOOO.OooO0o0(c0474OooO00o, this) == coroutine_suspended) {
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

        @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1$1$2", f = "RoomStateManager.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CheckEnterRoomModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f45719OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ RoomModel f45720OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f45721OooO0o0;

            /* JADX INFO: renamed from: o0OoOO00.o0ooOOo$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1$1$2$1", f = "RoomStateManager.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0475OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f45722OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ RoomModel f45723OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ CheckEnterRoomModel f45724OooO0o0;

                /* JADX INFO: renamed from: o0OoOO00.o0ooOOo$OooO00o$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
                @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1$1$2$1$1", f = "RoomStateManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0476OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ CheckEnterRoomModel f45725OooO0Oo;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0476OooO00o(CheckEnterRoomModel checkEnterRoomModel, Continuation<? super C0476OooO00o> continuation) {
                        super(2, continuation);
                        this.f45725OooO0Oo = checkEnterRoomModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0476OooO00o(this.f45725OooO0Oo, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C0476OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        ResultKt.throwOnFailure(obj);
                        MutableState mutableState = o0OOO0o.f45698OooO00o;
                        CheckEnterRoomModel checkEnterRoomModel = this.f45725OooO0Oo;
                        Integer code = checkEnterRoomModel != null ? checkEnterRoomModel.getCode() : null;
                        String toast = checkEnterRoomModel != null ? checkEnterRoomModel.getToast() : null;
                        boolean z = false;
                        if (toast == null || StringsKt.isBlank(toast)) {
                            if (code != null && code.intValue() == 1004) {
                                toast = o0000.OooO0OO(oO00OOo0.microom_code_1004);
                            } else if (code != null && code.intValue() == 1006) {
                                toast = o0000.OooO0OO(oO00OOo0.microom_code_1006);
                            } else if (code != null && code.intValue() == 1011) {
                                toast = o0000.OooO0OO(oO00OOo0.room_ban_toast);
                            } else if (code != null && code.intValue() == 1015) {
                                toast = o0000.OooO0OO(oO00OOo0.microom_code_1015);
                            } else if (code != null && code.intValue() == 1026) {
                                toast = o0000.OooO0OO(oO00OOo0.account_closure);
                            } else if (code != null && code.intValue() == 1051) {
                                toast = o0000.OooO0OO(oO00OOo0.BlackList_UnJoin_And_UnFollow_Title);
                            } else if (code != null && code.intValue() == 1053) {
                                toast = o0000.OooO0OO(oO00OOo0.failed_into_room_reason);
                            } else if (code != null && code.intValue() == 1055) {
                                toast = o0000.OooO0OO(oO00OOo0.room_ban_title);
                            } else {
                                if ((code != null && code.intValue() == 1) || (code != null && code.intValue() == 1003)) {
                                    z = true;
                                }
                                toast = z ? o0000.OooO0OO(oO00OOo0.Try_Again_Later) : o0000.OooO0OO(oO00OOo0.Try_Again_Later);
                            }
                        }
                        Context context = o000O0.f10354OooO00o;
                        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                        if (activityOooO0O0 != null) {
                            o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O0);
                            o0oo00o2.OooOo00(toast);
                            o0oo00o2.OooOo0(o0Oo0oo.f45702OooO0Oo);
                            o0oo00o2.OooOO0o();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0475OooO00o(CheckEnterRoomModel checkEnterRoomModel, RoomModel roomModel, Continuation<? super C0475OooO00o> continuation) {
                    super(2, continuation);
                    this.f45724OooO0o0 = checkEnterRoomModel;
                    this.f45723OooO0o = roomModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0475OooO00o(this.f45724OooO0o0, this.f45723OooO0o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0475OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Integer code;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f45722OooO0Oo;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CheckEnterRoomModel checkEnterRoomModel = this.f45724OooO0o0;
                        if ((checkEnterRoomModel == null || (code = checkEnterRoomModel.getCode()) == null || code.intValue() != 0) ? false : true) {
                            MutableState mutableState = o0OOO0o.f45698OooO00o;
                            o0OOO0o.OooO0Oo(this.f45723OooO0o);
                        } else {
                            C0476OooO00o c0476OooO00o = new C0476OooO00o(checkEnterRoomModel, null);
                            this.f45722OooO0Oo = 1;
                            if (OooOOO.OooO0o0(c0476OooO00o, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public OooO0O0(RoomModel roomModel, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f45720OooO0o = roomModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f45720OooO0o, continuation);
                oooO0O0.f45721OooO0o0 = obj;
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CheckEnterRoomModel checkEnterRoomModel, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(checkEnterRoomModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f45719OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C0475OooO00o c0475OooO00o = new C0475OooO00o((CheckEnterRoomModel) this.f45721OooO0o0, this.f45720OooO0o, null);
                    this.f45719OooO0Oo = 1;
                    if (OooOOO.OooO0o0(c0475OooO00o, this) == coroutine_suspended) {
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
        public OooO00o(RoomModel roomModel, oO00O0oO oo00o0oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45715OooO0o0 = roomModel;
            this.f45714OooO0o = oo00o0oo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45715OooO0o0, this.f45714OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45713OooO0Oo;
            RoomModel roomModel = this.f45715OooO0o0;
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
            long id = roomModel.getId();
            this.f45713OooO0Oo = 1;
            String strOooO0OO = o000OOo0.OooO0OO("/Webservers/Bar/CheckInRoom");
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(id), ContributionFragment.ARG_1);
            obj = OooOOO.OooO0Oo(new ApiRoomNew$checkCanEnterRoom$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            C0473OooO00o c0473OooO00o = new C0473OooO00o(this.f45714OooO0o, null);
            OooO0O0 oooO0O0 = new OooO0O0(roomModel, null);
            this.f45713OooO0Oo = 2;
            if (o000O000.OooO0OO(apiResult, false, c0473OooO00o, null, oooO0O0, this, 5) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(Activity activity, RoomModel roomModel, Continuation<? super o0ooOOo> continuation) {
        super(2, continuation);
        this.f45712OooO0o0 = activity;
        this.f45711OooO0o = roomModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0ooOOo(this.f45712OooO0o0, this.f45711OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0ooOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45710OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            oO00O0oO oo00o0oo = new oO00O0oO(this.f45712OooO0o0);
            oo00o0oo.show();
            OooO00o oooO00o = new OooO00o(this.f45711OooO0o, oo00o0oo, null);
            this.f45710OooO0Oo = 1;
            if (OooOOO.OooO0Oo(oooO00o, this) == coroutine_suspended) {
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
