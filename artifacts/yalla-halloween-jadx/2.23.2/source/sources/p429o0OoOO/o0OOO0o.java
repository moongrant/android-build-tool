package p429o0OoOO;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p205o00o0o0o.o000O;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p384o0OOoo0O.o00O0O;
import p562o0oOo000.o000000;
import p650o0ooo.o0OOO00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1", f = "RoomStateManager.kt", i = {}, l = {Constants.ERR_ALREADY_IN_RECORDING}, m = "invokeSuspend", n = {}, s = {})
public final class o0OOO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46801OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomModel f46802OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f46803OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1$1", f = "RoomStateManager.kt", i = {}, l = {161, 161}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f46804OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OOO00 f46805OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomModel f46806OooO0o0;

        /* JADX INFO: renamed from: o0OoOO.o0OOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1$1$1", f = "RoomStateManager.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0453OooO00o extends SuspendLambda implements Function2<ApiResult<CheckEnterRoomModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f46807OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ o0OOO00 f46808OooO0o0;

            /* JADX INFO: renamed from: o0OoOO.o0OOO0o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1$1$1$1", f = "RoomStateManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0454OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ o0OOO00 f46809OooO0Oo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0454OooO00o(o0OOO00 o0ooo00, Continuation<? super C0454OooO00o> continuation) {
                    super(2, continuation);
                    this.f46809OooO0Oo = o0ooo00;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0454OooO00o(this.f46809OooO0Oo, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0454OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    this.f46809OooO0Oo.dismiss();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0453OooO00o(o0OOO00 o0ooo00, Continuation<? super C0453OooO00o> continuation) {
                super(2, continuation);
                this.f46808OooO0o0 = o0ooo00;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0453OooO00o(this.f46808OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<CheckEnterRoomModel> apiResult, Continuation<? super Unit> continuation) {
                return ((C0453OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f46807OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C0454OooO00o c0454OooO00o = new C0454OooO00o(this.f46808OooO0o0, null);
                    this.f46807OooO0Oo = 1;
                    if (OooOOO.OooO0o0(c0454OooO00o, this) == coroutine_suspended) {
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
            public int f46810OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ RoomModel f46811OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f46812OooO0o0;

            /* JADX INFO: renamed from: o0OoOO.o0OOO0o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1$1$2$1", f = "RoomStateManager.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0455OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f46813OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ RoomModel f46814OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ CheckEnterRoomModel f46815OooO0o0;

                /* JADX INFO: renamed from: o0OoOO.o0OOO0o$OooO00o$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
                @DebugMetadata(c = "com.yalla.yalla.manager.RoomStateManager$checkAndChangeRoom$1$1$1$2$1$1", f = "RoomStateManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0456OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ CheckEnterRoomModel f46816OooO0Oo;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0456OooO00o(CheckEnterRoomModel checkEnterRoomModel, Continuation<? super C0456OooO00o> continuation) {
                        super(2, continuation);
                        this.f46816OooO0Oo = checkEnterRoomModel;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0456OooO00o(this.f46816OooO0Oo, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C0456OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        ResultKt.throwOnFailure(obj);
                        MutableState mutableState = o0Oo0oo.f46817OooO00o;
                        CheckEnterRoomModel checkEnterRoomModel = this.f46816OooO0Oo;
                        Integer code = checkEnterRoomModel != null ? checkEnterRoomModel.getCode() : null;
                        String toast = checkEnterRoomModel != null ? checkEnterRoomModel.getToast() : null;
                        boolean z = false;
                        if (toast == null || StringsKt.isBlank(toast)) {
                            if (code != null && code.intValue() == 1004) {
                                toast = o0000.OooO0OO(o000000.microom_code_1004);
                            } else if (code != null && code.intValue() == 1006) {
                                toast = o0000.OooO0OO(o000000.microom_code_1006);
                            } else if (code != null && code.intValue() == 1011) {
                                toast = o0000.OooO0OO(o000000.room_ban_toast);
                            } else if (code != null && code.intValue() == 1015) {
                                toast = o0000.OooO0OO(o000000.microom_code_1015);
                            } else if (code != null && code.intValue() == 1026) {
                                toast = o0000.OooO0OO(o000000.account_closure);
                            } else if (code != null && code.intValue() == 1051) {
                                toast = o0000.OooO0OO(o000000.BlackList_UnJoin_And_UnFollow_Title);
                            } else if (code != null && code.intValue() == 1053) {
                                toast = o0000.OooO0OO(o000000.failed_into_room_reason);
                            } else if (code != null && code.intValue() == 1055) {
                                toast = o0000.OooO0OO(o000000.room_ban_title);
                            } else {
                                if ((code != null && code.intValue() == 1) || (code != null && code.intValue() == 1003)) {
                                    z = true;
                                }
                                toast = z ? o0000.OooO0OO(o000000.Try_Again_Later) : o0000.OooO0OO(o000000.Try_Again_Later);
                            }
                        }
                        Context context = o000O00O.f13421OooO00o;
                        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                        if (activityOooO0O0 != null) {
                            o000O o000o = new o000O(activityOooO0O0);
                            o000o.OooOo00(toast);
                            o000o.OooOo0(o0OO00O.f46800OooO0Oo);
                            o000o.OooOO0o();
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0455OooO00o(CheckEnterRoomModel checkEnterRoomModel, RoomModel roomModel, Continuation<? super C0455OooO00o> continuation) {
                    super(2, continuation);
                    this.f46815OooO0o0 = checkEnterRoomModel;
                    this.f46814OooO0o = roomModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0455OooO00o(this.f46815OooO0o0, this.f46814OooO0o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0455OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Integer code;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f46813OooO0Oo;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        CheckEnterRoomModel checkEnterRoomModel = this.f46815OooO0o0;
                        if ((checkEnterRoomModel == null || (code = checkEnterRoomModel.getCode()) == null || code.intValue() != 0) ? false : true) {
                            MutableState mutableState = o0Oo0oo.f46817OooO00o;
                            o0Oo0oo.OooO0Oo(this.f46814OooO0o);
                        } else {
                            C0456OooO00o c0456OooO00o = new C0456OooO00o(checkEnterRoomModel, null);
                            this.f46813OooO0Oo = 1;
                            if (OooOOO.OooO0o0(c0456OooO00o, this) == coroutine_suspended) {
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
                this.f46811OooO0o = roomModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f46811OooO0o, continuation);
                oooO0O0.f46812OooO0o0 = obj;
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
                int i = this.f46810OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C0455OooO00o c0455OooO00o = new C0455OooO00o((CheckEnterRoomModel) this.f46812OooO0o0, this.f46811OooO0o, null);
                    this.f46810OooO0Oo = 1;
                    if (OooOOO.OooO0o0(c0455OooO00o, this) == coroutine_suspended) {
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
        public OooO00o(RoomModel roomModel, o0OOO00 o0ooo00, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f46806OooO0o0 = roomModel;
            this.f46805OooO0o = o0ooo00;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f46806OooO0o0, this.f46805OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f46804OooO0Oo;
            RoomModel roomModel = this.f46806OooO0o0;
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
            this.f46804OooO0Oo = 1;
            String strOooO0OO = oo000o.OooO0OO("/Webservers/Bar/CheckInRoom");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(id), ContributionFragment.ARG_1);
            obj = OooOOO.OooO0Oo(new ApiRoomNew$checkCanEnterRoom$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            C0453OooO00o c0453OooO00o = new C0453OooO00o(this.f46805OooO0o, null);
            OooO0O0 oooO0O0 = new OooO0O0(roomModel, null);
            this.f46804OooO0Oo = 2;
            if (o00O0O.OooO0OO(apiResult, false, c0453OooO00o, null, oooO0O0, this, 5) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(Activity activity, RoomModel roomModel, Continuation<? super o0OOO0o> continuation) {
        super(2, continuation);
        this.f46803OooO0o0 = activity;
        this.f46802OooO0o = roomModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OOO0o(this.f46803OooO0o0, this.f46802OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OOO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46801OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0OOO00 o0ooo00 = new o0OOO00(this.f46803OooO0o0);
            o0ooo00.show();
            OooO00o oooO00o = new OooO00o(this.f46802OooO0o, o0ooo00, null);
            this.f46801OooO0Oo = 1;
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
