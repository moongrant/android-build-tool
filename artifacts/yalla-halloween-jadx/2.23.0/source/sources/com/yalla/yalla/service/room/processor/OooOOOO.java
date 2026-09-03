package com.yalla.yalla.service.room.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.InOutRoomModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.nio.charset.Charset;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p475o0o000.o000000O;
import p477o0o000O.o0OOO0o;
import p477o0o000O.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomSofaListMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSofaListMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomSofaListMsgProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1549#2:123\n1620#2,3:124\n1549#2:127\n1620#2,3:128\n*S KotlinDebug\n*F\n+ 1 RoomSofaListMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomSofaListMsgProcessor\n*L\n86#1:123\n86#1:124,3\n103#1:127\n103#1:128,3\n*E\n"})
public final class OooOOOO implements com.yalla.yalla.service.room.processor.OooO00o {

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomSofaListMsgProcessor$parseInOrOutRoomMessage$1$1", f = "RoomSofaListMsgProcessor.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25117OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ byte[] f25118OooO0o;

        /* JADX INFO: renamed from: com.yalla.yalla.service.room.processor.OooOOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomSofaListMsgProcessor$parseInOrOutRoomMessage$1$1$1", f = "RoomSofaListMsgProcessor.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0321OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f25120OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ byte[] f25121OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ OooOOOO f25122OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0321OooO00o(OooOOOO oooOOOO, byte[] bArr, Continuation<? super C0321OooO00o> continuation) {
                super(2, continuation);
                this.f25122OooO0o0 = oooOOOO;
                this.f25121OooO0o = bArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0321OooO00o(this.f25122OooO0o0, this.f25121OooO0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0321OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f25120OooO0Oo;
                if (i != 0 && i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                while (com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47414OooO0OO.isEmpty()) {
                    this.f25120OooO0Oo = 1;
                    if (DelayKt.delay(50L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.f25122OooO0o0.OooO0O0(this.f25121OooO0o, true);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(byte[] bArr, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25118OooO0o = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OooOOOO.this.new OooO00o(this.f25118OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25117OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0321OooO00o c0321OooO00o = new C0321OooO00o(OooOOOO.this, this.f25118OooO0o, null);
                this.f25117OooO0Oo = 1;
                if (TimeoutKt.withTimeout(3000L, c0321OooO00o, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ InOutRoomModel f25123OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(InOutRoomModel inOutRoomModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25123OooO0Oo = inOutRoomModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25123OooO0Oo, continuation);
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
            com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47413OooO0O0.setValue(Boxing.boxInt(this.f25123OooO0Oo.getOnline()));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomSofaListMsgProcessor$parseInOrOutRoomMessage$1$3", f = "RoomSofaListMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomSofaListMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSofaListMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomSofaListMsgProcessor$parseInOrOutRoomMessage$1$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n350#2,7:123\n*S KotlinDebug\n*F\n+ 1 RoomSofaListMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomSofaListMsgProcessor$parseInOrOutRoomMessage$1$3\n*L\n55#1:123,7\n*E\n"})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f25124OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ InOutRoomModel f25125OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(RoomUserInfoModel roomUserInfoModel, InOutRoomModel inOutRoomModel, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25124OooO0Oo = roomUserInfoModel;
            this.f25125OooO0o0 = inOutRoomModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f25124OooO0Oo, this.f25125OooO0o0, continuation);
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
            o000000O o000000o2 = com.yalla.yalla.service.room.OooO00o.f24981OooOO0;
            SnapshotStateList<Long> snapshotStateList = o000000o2.f47414OooO0OO;
            RoomUserInfoModel roomUserInfoModel = this.f25124OooO0Oo;
            if (snapshotStateList.contains(roomUserInfoModel.getUserId().getValue())) {
                return Unit.INSTANCE;
            }
            Iterator<Long> it = o000000o2.f47414OooO0OO.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                long jLongValue = it.next().longValue();
                ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Boxing.boxLong(jLongValue));
                if (roomUserInfoModelOooO0o0 != null && roomUserInfoModelOooO0o0.getPriority().getValue().longValue() < roomUserInfoModel.getPriority().getValue().longValue()) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                o000000O o000000o3 = com.yalla.yalla.service.room.OooO00o.f24981OooOO0;
                if (o000000o3.f47414OooO0OO.size() < 50) {
                    o000000o3.f47414OooO0OO.add(roomUserInfoModel.getUserId().getValue());
                }
            } else {
                if (i >= 0 && i < com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47414OooO0OO.size()) {
                    z = true;
                }
                if (z) {
                    o000000O o000000o4 = com.yalla.yalla.service.room.OooO00o.f24981OooOO0;
                    o000000o4.f47414OooO0OO.add(i, roomUserInfoModel.getUserId().getValue());
                    SnapshotStateList<Long> snapshotStateList2 = o000000o4.f47414OooO0OO;
                    if (snapshotStateList2.size() > 50) {
                        CollectionsKt.removeLast(snapshotStateList2);
                    }
                }
            }
            com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47413OooO0O0.setValue(Boxing.boxInt(this.f25125OooO0o0.getOnline()));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomSofaListMsgProcessor$parseInOrOutRoomMessage$1$4", f = "RoomSofaListMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f25126OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ InOutRoomModel f25127OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(RoomUserInfoModel roomUserInfoModel, InOutRoomModel inOutRoomModel, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25126OooO0Oo = roomUserInfoModel;
            this.f25127OooO0o0 = inOutRoomModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f25126OooO0Oo, this.f25127OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o000000O o000000o2 = com.yalla.yalla.service.room.OooO00o.f24981OooOO0;
            o000000o2.f47414OooO0OO.remove(this.f25126OooO0Oo.getUserId().getValue());
            o000000o2.f47413OooO0O0.setValue(Boxing.boxInt(this.f25127OooO0o0.getOnline()));
            return Unit.INSTANCE;
        }
    }

    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(byte[] bArr, boolean z) {
        RoomUserInfoModel newUser;
        if (bArr == null) {
            return;
        }
        Charset charset = Charsets.UTF_8;
        InOutRoomModel inOutRoomModel = (InOutRoomModel) p140o00OOooo.OooOO0.OooO0O0(InOutRoomModel.class, new String(bArr, charset));
        p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "parseInOrOutRoomMessage data = ".concat(new String(bArr, charset)));
        if (inOutRoomModel == null || (newUser = inOutRoomModel.getNewUser()) == null) {
            return;
        }
        if (inOutRoomModel.getKind() != 0) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(newUser, inOutRoomModel, null), 3, null);
            return;
        }
        if (com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47414OooO0OO.isEmpty()) {
            if (z) {
                return;
            }
            com.code.android.util.OooOOO.OooO0O0(CoroutineScopeKt.MainScope(), new OooO00o(bArr, null));
        } else {
            if (newUser.isUnLoginUser().getValue().booleanValue()) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(inOutRoomModel, null), 3, null);
                return;
            }
            long jLongValue = newUser.getUserId().getValue().longValue();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
            if (l != null && jLongValue == l.longValue()) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(newUser, inOutRoomModel, null), 3, null);
        }
    }

    public final void OooO0OO(int i, @Nullable Object obj) {
        Room.UserStaticListReply from;
        com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO0O0(this, i, obj);
        if (i == 10007) {
            OooO0O0((byte[]) obj, false);
            return;
        }
        if (i == 10054) {
            Room.UserListReply from2 = Room.UserListReply.parseFrom((byte[]) obj);
            if (from2 != null) {
                p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), "parseGetSofaListMessage data = " + from2.getUsersList().size());
                ArrayList arrayList = new ArrayList();
                List<Room.UserModel> usersList = from2.getUsersList();
                Intrinsics.checkNotNullExpressionValue(usersList, "reply.usersList");
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(usersList, 10));
                for (Room.UserModel user : usersList) {
                    ArrayList arrayList3 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                    RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(user, "user");
                    com.yalla.yalla.service.room.OooO00o.OooO0o(companion.of(user));
                    arrayList2.add(Long.valueOf(user.getUserId()));
                }
                arrayList.addAll(arrayList2);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0Oo0oo(arrayList, from2, null), 3, null);
                return;
            }
            return;
        }
        if (i == 10055 && (from = Room.UserStaticListReply.parseFrom((byte[]) obj)) != null) {
            p592o0oo00O.OooOOO0.OooO0OO("parseGetOnlineListMessage", "data = " + from);
            ArrayList arrayList4 = new ArrayList();
            List<Room.UserModel> usersList2 = from.getUsersList();
            Intrinsics.checkNotNullExpressionValue(usersList2, "reply.usersList");
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(usersList2, 10));
            for (Room.UserModel it : usersList2) {
                RoomUserInfoModel.Companion companion2 = RoomUserInfoModel.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                RoomUserInfoModel roomUserInfoModelOf = companion2.of(it);
                ArrayList arrayList6 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                com.yalla.yalla.service.room.OooO00o.OooO0o(roomUserInfoModelOf);
                arrayList4.add(roomUserInfoModelOf);
                arrayList5.add(Long.valueOf(it.getUserId()));
            }
            if (from.getKind() == 0) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0OOO0o(arrayList5, from, null), 3, null);
            }
            com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47415OooO0Oo.postValue(Integer.valueOf(from.getTournum()));
            LiveEventBus.get("UPDATE_ONLINE_LIST_DATA").post(arrayList4);
        }
    }
}
