package p476o0o0000o;

import com.code.android.util.OooOOO;
import com.yalla.yalla.api.old.ApiRoomNew$loadRoomIP$$inlined$call$1;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentBarGetServerIpModel;
import com.yalla.yalla.model.room.RoomLoginModel;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o000O000;
import p385o0OOooOO.o00oOoo;
import p427o0OoOO00.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.RoomLiveService$loadNewConnectAddress$1", f = "RoomLiveService.kt", i = {}, l = {240, 240}, m = "invokeSuspend", n = {}, s = {})
public final class o000O00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f47581OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RoomLiveService f47582OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f47583OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.service.room.RoomLiveService$loadNewConnectAddress$1$1", f = "RoomLiveService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiError apiError, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0OOO0o.OooO0OO(2, 2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.RoomLiveService$loadNewConnectAddress$1$2", f = "RoomLiveService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomLiveService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveService.kt\ncom/yalla/yalla/service/room/RoomLiveService$loadNewConnectAddress$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,691:1\n1#2:692\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<MomentBarGetServerIpModel, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f47584OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomLiveService f47585OooO0o0;

        public static final class OooO00o extends Lambda implements Function1<String, Boolean> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO00o f47586OooO0Oo = new OooO00o();

            public OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String str) {
                String it = str;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(StringsKt.isBlank(it));
            }
        }

        /* JADX INFO: renamed from: o0o0000o.o000O00O$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C0480OooO0O0 extends Lambda implements Function1<String, Boolean> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C0480OooO0O0 f47587OooO0Oo = new C0480OooO0O0();

            public C0480OooO0O0() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(String str) {
                String it = str;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(StringsKt.isBlank(it));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RoomLiveService roomLiveService, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f47585OooO0o0 = roomLiveService;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f47585OooO0o0, continuation);
            oooO0O0.f47584OooO0Oo = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MomentBarGetServerIpModel momentBarGetServerIpModel, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(momentBarGetServerIpModel, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MomentBarGetServerIpModel momentBarGetServerIpModel = (MomentBarGetServerIpModel) this.f47584OooO0Oo;
            if (momentBarGetServerIpModel == null) {
                o0OOO0o.OooO0OO(2, 2);
            } else {
                RoomLiveService roomLiveService = this.f47585OooO0o0;
                RoomLoginModel roomLoginModel = roomLiveService.f25066OooOO0O;
                if (roomLoginModel != null) {
                    String str = momentBarGetServerIpModel.websocketaddr;
                    Intrinsics.checkNotNullExpressionValue(str, "model.websocketaddr");
                    List<String> mutableList = CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default(str, new String[]{";"}, false, 0, 6, (Object) null));
                    CollectionsKt.removeAll((List) mutableList, (Function1) C0480OooO0O0.f47587OooO0Oo);
                    String roomserverip = momentBarGetServerIpModel.getRoomserverip();
                    Intrinsics.checkNotNullExpressionValue(roomserverip, "model.roomserverip");
                    List<String> mutableList2 = CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default(roomserverip, new String[]{";"}, false, 0, 6, (Object) null));
                    CollectionsKt.removeAll((List) mutableList2, (Function1) OooO00o.f47586OooO0Oo);
                    if (!roomLoginModel.getWebsocketUrlList().isEmpty()) {
                        if (mutableList.isEmpty()) {
                            o0OOO0o.OooO0OO(2, 2);
                        } else {
                            Set setSubtract = CollectionsKt___CollectionsKt.subtract(mutableList, CollectionsKt.toSet(roomLoginModel.getWebsocketUrlList()));
                            if (!setSubtract.isEmpty()) {
                                RoomLoginModel roomLoginModel2 = roomLiveService.f25066OooOO0O;
                                if (roomLoginModel2 != null) {
                                    roomLoginModel2.setWebsocketUrlList(CollectionsKt.toList(setSubtract));
                                }
                                roomLiveService.OooO00o();
                            } else {
                                o0OOO0o.OooO0OO(2, 2);
                            }
                        }
                    } else if (!roomLoginModel.getSocketUrlList().isEmpty()) {
                        if (mutableList2.isEmpty()) {
                            o0OOO0o.OooO0OO(2, 2);
                        } else {
                            Set setSubtract2 = CollectionsKt___CollectionsKt.subtract(mutableList2, CollectionsKt.toSet(roomLoginModel.getSocketUrlList()));
                            if (!setSubtract2.isEmpty()) {
                                RoomLoginModel roomLoginModel3 = roomLiveService.f25066OooOO0O;
                                if (roomLoginModel3 != null) {
                                    roomLoginModel3.setSocketUrlList(CollectionsKt.toList(setSubtract2));
                                }
                                roomLiveService.OooO00o();
                            } else {
                                o0OOO0o.OooO0OO(2, 2);
                            }
                        }
                    } else if (mutableList2.isEmpty() && mutableList.isEmpty()) {
                        o0OOO0o.OooO0OO(2, 2);
                    } else {
                        roomLoginModel.setSocketUrlList(mutableList2);
                        roomLoginModel.setWebsocketUrlList(mutableList);
                        roomLiveService.OooO00o();
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    o0OOO0o.OooO0OO(2, 2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(long j, RoomLiveService roomLiveService, Continuation<? super o000O00O> continuation) {
        super(2, continuation);
        this.f47583OooO0o0 = j;
        this.f47582OooO0o = roomLiveService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O00O(this.f47583OooO0o0, this.f47582OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f47581OooO0Oo;
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
        this.f47581OooO0Oo = 1;
        String strOooO0Oo = o000OOo0.OooO0Oo("/Webservers/Moment/BarGetServerIP");
        o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
        o0o0oooOooO00o.OooO0O0(Boxing.boxLong(this.f47583OooO0o0), "roomid");
        o0o0oooOooO00o.OooO00o();
        obj = OooOOO.OooO0Oo(new ApiRoomNew$loadRoomIP$$inlined$call$1(o0o0oooOooO00o, null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        ApiResult apiResult = (ApiResult) obj;
        OooO00o oooO00o = new OooO00o(null);
        OooO0O0 oooO0O0 = new OooO0O0(this.f47582OooO0o, null);
        this.f47581OooO0Oo = 2;
        if (o000O000.OooO0OO(apiResult, false, null, oooO00o, oooO0O0, this, 3) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
