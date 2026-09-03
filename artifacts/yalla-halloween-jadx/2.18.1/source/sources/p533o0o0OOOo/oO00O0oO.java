package p533o0o0OOOo;

import androidx.appcompat.widget.o00000O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.InOutRoomModel;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o00OO0OO;
import p254o00ooO0O.o0000O0;
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0Oo0oo;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO00O0oO implements oO00000 {

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomSofaListMsgProcessor$parseInOrOutRoomMessage$1$1", f = "RoomSofaListMsgProcessor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f43489Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ byte[] f43491Oooo0oo;

        /* JADX INFO: renamed from: o0o0OOOo.oO00O0oO$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomSofaListMsgProcessor$parseInOrOutRoomMessage$1$1$1", f = "RoomSofaListMsgProcessor.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0408OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f43492Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ oO00O0oO f43493Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ byte[] f43494Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0408OooO00o(oO00O0oO oo00o0oo, byte[] bArr, Continuation<? super C0408OooO00o> continuation) {
                super(2, continuation);
                this.f43493Oooo0oO = oo00o0oo;
                this.f43494Oooo0oo = bArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0408OooO00o(this.f43493Oooo0oO, this.f43494Oooo0oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0408OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f43492Oooo0o;
                if (i != 0 && i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                do {
                    o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
                    if (!o00O.OooOO0.f43246OooO0Oo.isEmpty()) {
                        this.f43493Oooo0oO.OooO0O0(this.f43494Oooo0oo, true);
                        return Unit.INSTANCE;
                    }
                    this.f43492Oooo0o = 1;
                } while (DelayKt.delay(50L, this) != coroutine_suspended);
                return coroutine_suspended;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(byte[] bArr, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f43491Oooo0oo = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return oO00O0oO.this.new OooO00o(this.f43491Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f43489Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0408OooO00o c0408OooO00o = new C0408OooO00o(oO00O0oO.this, this.f43491Oooo0oo, null);
                this.f43489Oooo0o = 1;
                if (TimeoutKt.withTimeout(3000L, c0408OooO00o, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomSofaListMsgProcessor$parseInOrOutRoomMessage$1$2", f = "RoomSofaListMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f43495Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ InOutRoomModel f43496Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RoomUserInfoModel roomUserInfoModel, InOutRoomModel inOutRoomModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f43495Oooo0o = roomUserInfoModel;
            this.f43496Oooo0oO = inOutRoomModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f43495Oooo0o, this.f43496Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
            o00OO0OO<Long> o00oo0oo = o00O.OooOO0.f43246OooO0Oo;
            if (o00oo0oo.contains(Boxing.boxLong(this.f43495Oooo0o.getUserId()))) {
                return Unit.INSTANCE;
            }
            RoomUserInfoModel roomUserInfoModel = this.f43495Oooo0o;
            Iterator<Long> it = o00oo0oo.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                RoomUserInfoModel roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(it.next().longValue());
                if (roomUserInfoModelOooOO0 != null && roomUserInfoModelOooOO0.getPriority() < roomUserInfoModel.getPriority()) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                o00O.OooOO0 oooOO2 = o00O.OooOO0.f43243OooO00o;
                o00OO0OO<Long> o00oo0oo2 = o00O.OooOO0.f43246OooO0Oo;
                if (o00oo0oo2.size() >= 50) {
                    return Unit.INSTANCE;
                }
                o00oo0oo2.add(Boxing.boxLong(this.f43495Oooo0o.getUserId()));
            } else {
                if (i >= 0) {
                    o00O.OooOO0 oooOO3 = o00O.OooOO0.f43243OooO00o;
                    if (i < o00O.OooOO0.f43246OooO0Oo.size()) {
                        z = true;
                    }
                }
                if (z) {
                    o00O.OooOO0 oooOO4 = o00O.OooOO0.f43243OooO00o;
                    o00OO0OO<Long> o00oo0oo3 = o00O.OooOO0.f43246OooO0Oo;
                    o00oo0oo3.add(i, Boxing.boxLong(this.f43495Oooo0o.getUserId()));
                    if (o00oo0oo3.size() > 50) {
                        CollectionsKt.removeLast(o00oo0oo3);
                    }
                }
            }
            o00O.OooOO0.f43243OooO00o.OooO0O0(this.f43496Oooo0oO.getOnline());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomSofaListMsgProcessor$parseInOrOutRoomMessage$1$3", f = "RoomSofaListMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f43497Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ InOutRoomModel f43498Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(RoomUserInfoModel roomUserInfoModel, InOutRoomModel inOutRoomModel, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f43497Oooo0o = roomUserInfoModel;
            this.f43498Oooo0oO = inOutRoomModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f43497Oooo0o, this.f43498Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
            o00O.OooOO0.f43246OooO0Oo.remove(Boxing.boxLong(this.f43497Oooo0o.getUserId()));
            oooOO1.OooO0O0(this.f43498Oooo0oO.getOnline());
            return Unit.INSTANCE;
        }
    }

    @Override // p533o0o0OOOo.oO00000
    @NotNull
    public final String OooO00o() {
        return oO00000.OooO00o.OooO00o(this);
    }

    public final void OooO0O0(byte[] bArr, boolean z) {
        if (bArr == null) {
            return;
        }
        InOutRoomModel inOutRoomModel = (InOutRoomModel) o0Oo0oo.OooO0OO(new String(bArr, Charsets.UTF_8), InOutRoomModel.class);
        String strOooO00o = oO00000.OooO00o.OooO00o(this);
        StringBuilder sb = new StringBuilder();
        sb.append("parseInOrOutRoomMessage data = ");
        Intrinsics.checkNotNull(inOutRoomModel);
        sb.append(inOutRoomModel.getKind() == 0);
        o00O00.OooO0OO(strOooO00o, sb.toString());
        RoomUserInfoModel user = inOutRoomModel.getUser();
        if (user != null) {
            if (inOutRoomModel.getKind() != 0) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(user, inOutRoomModel, null), 3, null);
                return;
            }
            o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
            if (o00O.OooOO0.f43246OooO0Oo.isEmpty()) {
                if (z) {
                    return;
                }
                o0000O0.OooO00o(CoroutineScopeKt.MainScope(), new OooO00o(bArr, null));
                return;
            }
            o00O.f43140OooO00o.OooOO0o(user.getUserId(), user);
            if (user.getIsUnLoginUser()) {
                return;
            }
            long userId = user.getUserId();
            Long value = OooOOO.f41216OooO00o.OooOo().getValue();
            if (value != null && userId == value.longValue()) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(user, inOutRoomModel, null), 3, null);
        }
    }

    public final void OooO0OO(int i, @Nullable byte[] bArr) {
        Room.UserStaticListReply from;
        oO00000.OooO00o.OooO0O0(this, i, bArr);
        String strOooO00o = oO00000.OooO00o.OooO00o(this);
        StringBuilder sbOooO00o = o00000O0.OooO00o("parseMessage type = ", i, " data = ");
        Intrinsics.checkNotNull(bArr);
        sbOooO00o.append(new String(bArr, Charsets.UTF_8));
        o00O00.OooO0OO(strOooO00o, sbOooO00o.toString());
        if (i == 10007) {
            OooO0O0(bArr, false);
            return;
        }
        if (i == 10054) {
            Room.UserListReply from2 = Room.UserListReply.parseFrom(bArr);
            if (from2 != null) {
                String strOooO00o2 = oO00000.OooO00o.OooO00o(this);
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("parseGetSofaListMessage data = ");
                sbOooO0o0.append(from2.getUsersList().size());
                o00O00.OooO0OO(strOooO00o2, sbOooO0o0.toString());
                ArrayList arrayList = new ArrayList();
                List<Room.UserModel> usersList = from2.getUsersList();
                Intrinsics.checkNotNullExpressionValue(usersList, "reply.usersList");
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(usersList, 10));
                for (Room.UserModel user : usersList) {
                    o00O o00o2 = o00O.f43140OooO00o;
                    long userId = user.getUserId();
                    RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(user, "user");
                    o00o2.OooOO0o(userId, companion.of(user));
                    arrayList2.add(Long.valueOf(user.getUserId()));
                }
                arrayList.addAll(arrayList2);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oOo00OO0(arrayList, from2, null), 3, null);
                return;
            }
            return;
        }
        if (i == 10055 && (from = Room.UserStaticListReply.parseFrom(bArr)) != null) {
            o00O00.OooO0OO("parseGetOnlineListMessage", "data = " + from);
            List<Room.UserModel> usersList2 = from.getUsersList();
            if (usersList2 == null || usersList2.isEmpty()) {
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            List<Room.UserModel> usersList3 = from.getUsersList();
            Intrinsics.checkNotNullExpressionValue(usersList3, "reply.usersList");
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(usersList3, 10));
            for (Room.UserModel it : usersList3) {
                RoomUserInfoModel.Companion companion2 = RoomUserInfoModel.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                RoomUserInfoModel roomUserInfoModelOf = companion2.of(it);
                o00O.f43140OooO00o.OooOO0o(it.getUserId(), roomUserInfoModelOf);
                arrayList3.add(roomUserInfoModelOf);
                arrayList4.add(Long.valueOf(it.getUserId()));
            }
            if (from.getKind() == 0) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO00O0o(arrayList4, from, null), 3, null);
            }
            o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
            o00O.OooOO0.f43247OooO0o0.postValue(Integer.valueOf(from.getTournum()));
            LiveEventBus.get("UPDATE_ONLINE_LIST_DATA").post(arrayList3);
        }
    }
}
