package com.yalla.yalla.service.room.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.app.base.protobuf.room.Room;
import com.app.base.protobuf.room.RoomMike;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.InOutRoomModel;
import com.yalla.yalla.model.SilenceModel;
import com.yalla.yalla.model.SkillCardModel;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.GetMicModel;
import com.yalla.yalla.model.room.RoomAdminUpgradeModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p474o0OoooOO.oo0oO0;
import p482o0o000O.o00oO0o;
import p485o0o000Oo.o00000;
import p485o0o000Oo.o000000O;
import p485o0o000Oo.o00Oo0;
import p485o0o000Oo.o00Ooo;
import p485o0o000Oo.o0OO00O;
import p485o0o000Oo.o0Oo0oo;
import p485o0o000Oo.o0ooOOo;
import p485o0o000Oo.oo000o;
import p485o0o000Oo.oo0o0Oo;
import p541o0o0Oo0o.o0OO0;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMicMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMicMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomMicMsgProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,451:1\n1549#2:452\n1620#2,2:453\n1622#2:456\n1549#2:457\n1620#2,3:458\n1#3:455\n*S KotlinDebug\n*F\n+ 1 RoomMicMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomMicMsgProcessor\n*L\n270#1:452\n270#1:453,2\n270#1:456\n363#1:457\n363#1:458,3\n*E\n"})
public final class OooOO0O implements com.yalla.yalla.service.room.processor.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOO0O f24655OooO00o = new OooOO0O();

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseHeaderCardMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SkillCardModel f24656OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SkillCardModel skillCardModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f24656OooO0Oo = skillCardModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f24656OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
            SkillCardModel skillCardModel = this.f24656OooO0Oo;
            RoomUserInfoModel newTarget = skillCardModel.getNewTarget();
            Intrinsics.checkNotNull(newTarget);
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(newTarget.getUserId().getValue());
            if (roomUserInfoModelOooO0o0 != null) {
                MutableStateFlow<Integer> headerCardId = roomUserInfoModelOooO0o0.getHeaderCardId();
                RoomUserInfoModel newTarget2 = skillCardModel.getNewTarget();
                Intrinsics.checkNotNull(newTarget2);
                headerCardId.setValue(newTarget2.getHeaderCardId().getValue());
                MutableStateFlow<String> headerCardUrl = roomUserInfoModelOooO0o0.getHeaderCardUrl();
                RoomUserInfoModel newTarget3 = skillCardModel.getNewTarget();
                Intrinsics.checkNotNull(newTarget3);
                headerCardUrl.setValue(newTarget3.getHeaderCardUrl().getValue());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseMicEmojiMsg$2$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {446}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24657OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ChatModel f24658OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO0 f24659OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OO0 o0oo1, ChatModel chatModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f24659OooO0o0 = o0oo1;
            this.f24658OooO0o = chatModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f24659OooO0o0, this.f24658OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24657OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<String> mutableSharedFlow = this.f24659OooO0o0.f54752OooO0o;
                String emjUrl = this.f24658OooO0o.getEmjUrl();
                Intrinsics.checkNotNull(emjUrl);
                this.f24657OooO0Oo = 1;
                if (mutableSharedFlow.emit(emjUrl, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$removeUserFormApplyMicList$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f24660OooO0Oo;

        public static final class OooO00o extends Lambda implements Function1<Long, Boolean> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ long f24661OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(long j) {
                super(1);
                this.f24661OooO0Oo = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Long l) {
                return Boolean.valueOf(l.longValue() == this.f24661OooO0Oo);
            }
        }

        public static final class OooO0O0 extends Lambda implements Function1<Long, Boolean> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ long f24662OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(long j) {
                super(1);
                this.f24662OooO0Oo = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Long l) {
                return Boolean.valueOf(l.longValue() == this.f24662OooO0Oo);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f24660OooO0Oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f24660OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableStateFlow<String> userHeader;
            String value;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00oO0o o00oo0o2 = com.yalla.yalla.service.room.OooO00o.f24525OooO0oO;
            int iOooO0oO = o00oo0o2.OooO0oO();
            SnapshotStateList<Long> snapshotStateList = o00oo0o2.f48542OooOOo;
            long j = this.f24660OooO0Oo;
            if (iOooO0oO > 0) {
                CollectionsKt.removeAll((List) snapshotStateList, (Function1) new OooO00o(j));
                int size = snapshotStateList.size();
                o00oo0o2.OooOOO(size == 0 ? -1 : size);
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                Long l = (Long) oo0oO0.OooOOo0().getValue();
                if (l != null && j == l.longValue()) {
                    o00oo0o2.f48538OooOOO.setValue(Boolean.FALSE);
                }
                String str = "";
                if (size > 0) {
                    ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
                    RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(snapshotStateList.get(size - 1));
                    if (roomUserInfoModelOooO0o0 != null && (userHeader = roomUserInfoModelOooO0o0.getUserHeader()) != null && (value = userHeader.getValue()) != null) {
                        str = value;
                    }
                    o00oo0o2.OooOOOO(str);
                    LiveEventBus.get("REFRESH_APPLY_MIC_LIST").post(Boxing.boxBoolean(true));
                } else {
                    o00oo0o2.OooOOOO("");
                    if (o00oo0o2.OooOO0()) {
                        RoomMike.MicApplyListRequest.Builder builderNewBuilder = RoomMike.MicApplyListRequest.newBuilder();
                        builderNewBuilder.setRoomId(com.yalla.yalla.service.room.OooO00o.f24524OooO0o0.OooO0o0());
                        T value2 = oo0oO0.OooOOo0().getValue();
                        Intrinsics.checkNotNull(value2);
                        builderNewBuilder.setUserId(((Number) value2).longValue());
                        RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
                        if (roomLiveService != null) {
                            roomLiveService.OooO0oo(1001109, builderNewBuilder.build().toByteArray());
                        }
                    }
                }
            } else {
                CollectionsKt.removeAll((List) snapshotStateList, (Function1) new OooO0O0(j));
                if (snapshotStateList.size() == 0 && o00oo0o2.OooOO0()) {
                    RoomMike.MicApplyListRequest.Builder builderNewBuilder2 = RoomMike.MicApplyListRequest.newBuilder();
                    builderNewBuilder2.setRoomId(com.yalla.yalla.service.room.OooO00o.f24524OooO0o0.OooO0o0());
                    oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                    builderNewBuilder2.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                    RoomLiveService roomLiveService2 = RoomLiveService.f24604OooOo00;
                    if (roomLiveService2 != null) {
                        roomLiveService2.OooO0oo(1001109, builderNewBuilder2.build().toByteArray());
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static void OooO0o() {
        if (com.yalla.yalla.service.room.OooO00o.f24525OooO0oO.OooOO0()) {
            RoomMike.MicApplyListRequest.Builder builderNewBuilder = RoomMike.MicApplyListRequest.newBuilder();
            builderNewBuilder.setRoomId(com.yalla.yalla.service.room.OooO00o.f24524OooO0o0.OooO0o0());
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            builderNewBuilder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
            RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(1001109, builderNewBuilder.build().toByteArray());
            }
        }
    }

    public static void OooO0o0(@NotNull ChatModel model) {
        Object next;
        o0OO0 o0oo1;
        RoomUserInfoModel newFrom;
        MutableStateFlow<Long> userId;
        Intrinsics.checkNotNullParameter(model, "model");
        String emjUrl = model.getEmjUrl();
        if (emjUrl == null || StringsKt.isBlank(emjUrl)) {
            return;
        }
        Iterator<T> it = com.yalla.yalla.service.room.OooO00o.f24525OooO0oO.f48536OooOO0O.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                o0oo1 = (o0OO0) next;
                newFrom = model.getNewFrom();
            }
        } while (!((newFrom == null || (userId = newFrom.getUserId()) == null || o0oo1.f54750OooO0OO.getValue().longValue() != userId.getValue().longValue()) ? false : true));
        o0OO0 o0oo2 = (o0OO0) next;
        if (o0oo2 != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(o0oo2, model, null), 3, null);
        }
    }

    public static void OooO0oO(long j) {
        if (com.yalla.yalla.service.room.OooO00o.f24525OooO0oO.f48542OooOOo.isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(j, null), 3, null);
    }

    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return com.yalla.yalla.service.room.processor.OooO00o.C0318OooO00o.OooO00o(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(@NotNull SkillCardModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        Long l = (Long) oo0oO0.OooOOo0().getValue();
        RoomUserInfoModel newFrom = model.getNewFrom();
        Intrinsics.checkNotNull(newFrom);
        long jLongValue = newFrom.getUserId().getValue().longValue();
        if (l != null && l.longValue() == jLongValue) {
            oo0oO0.OooO0O0().postValue(Long.valueOf(model.getBalance()));
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(model, null), 3, null);
        model.setCardType(1);
        LiveEventBus.get("Skill_Card_Anim").post(model);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0OO(@NotNull Room.MagicVoiceOut model) {
        boolean z;
        Intrinsics.checkNotNullParameter(model, "model");
        long userId = model.getFrom().getUserId();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        Long l = (Long) oo0oO0.OooOOo0().getValue();
        if (l != null && userId == l.longValue()) {
            oo0oO0.OooO0O0().postValue(Long.valueOf(model.getBalance()));
        }
        int cardid = model.getCardid();
        int i = 1;
        if (cardid != 0 && cardid != 179 && cardid != 73 && cardid != 74) {
            switch (cardid) {
                case 76:
                case 77:
                case 78:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(model.getTarget().getUserId()));
        MutableStateFlow<Integer> voiceChangerId = roomUserInfoModelOooO0o0 != null ? roomUserInfoModelOooO0o0.getVoiceChangerId() : null;
        if (voiceChangerId != null) {
            voiceChangerId.setValue(Integer.valueOf(model.getCardid()));
        }
        long userId2 = model.getTarget().getUserId();
        Long l2 = (Long) oo0oO0.OooOOo0().getValue();
        if (l2 != null && userId2 == l2.longValue()) {
            o00oO0o o00oo0o2 = com.yalla.yalla.service.room.OooO00o.f24525OooO0oO;
            if (o00oo0o2.f48527OooO00o.getValue().booleanValue()) {
                int cardid2 = model.getCardid();
                if (cardid2 != 179) {
                    switch (cardid2) {
                        case 73:
                            i = 3;
                            break;
                        case 74:
                            i = 2;
                            break;
                        case 75:
                            break;
                        case 76:
                            i = 5;
                            break;
                        case 77:
                            i = 6;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                } else {
                    i = 0;
                }
                o00oo0o2.f48526OooO.setValue(Integer.valueOf(i));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0Oo(int i, @Nullable Object obj) {
        RoomUserInfoModel newUser;
        RoomAdminUpgradeModel roomAdminUpgradeModel;
        com.yalla.yalla.service.room.processor.OooO00o.C0318OooO00o.OooO0O0(this, i, obj);
        switch (i) {
            case 10006:
                SilenceModel silenceModel = (SilenceModel) p187o00o00o0.OooO.OooO0O0(SilenceModel.class, new String((byte[]) obj, Charsets.UTF_8));
                if (silenceModel != null) {
                    p597o0oo00O.OooOOOO.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0318OooO00o.OooO00o(this), "parseBeBarredSpeakingMessage " + silenceModel);
                    OooO0oO(silenceModel.to.uid);
                    com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24589OoooOO0.postValue(new Pair<>(Long.valueOf(silenceModel.to.uid), Boolean.valueOf(silenceModel.silence)));
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0ooOOo(silenceModel, null), 3, null);
                    break;
                }
                break;
            case 10007:
                InOutRoomModel inOutRoomModel = (InOutRoomModel) p187o00o00o0.OooO.OooO0O0(InOutRoomModel.class, new String((byte[]) obj, Charsets.UTF_8));
                if (inOutRoomModel != null && (newUser = inOutRoomModel.getNewUser()) != null && inOutRoomModel.getKind() != 0) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0Oo0oo(newUser, null), 3, null);
                    break;
                }
                break;
            case 10016:
                GetMicModel getMicModel = (GetMicModel) p187o00o00o0.OooO.OooO0O0(GetMicModel.class, new String((byte[]) obj, Charsets.UTF_8));
                if (getMicModel != null) {
                    RoomUserInfoModel newUser2 = getMicModel.getNewUser();
                    Intrinsics.checkNotNull(newUser2);
                    OooO0oO(newUser2.getUserId().getValue().longValue());
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000(getMicModel, null), 3, null);
                    break;
                }
                break;
            case 10023:
            case 100231:
            case 100232:
                byte[] bArr = (byte[]) obj;
                if (i == 100231) {
                    roomAdminUpgradeModel = new RoomAdminUpgradeModel();
                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                    roomAdminUpgradeModel.userid = ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue();
                    roomAdminUpgradeModel.setUsername((String) oo0oO0.OooOOoo().getValue());
                } else {
                    roomAdminUpgradeModel = (RoomAdminUpgradeModel) p187o00o00o0.OooO.OooO0O0(RoomAdminUpgradeModel.class, new String(bArr, Charsets.UTF_8));
                }
                if (roomAdminUpgradeModel != null) {
                    p597o0oo00O.OooOOOO.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0318OooO00o.OooO00o(this), "parseUpgradeAdminMessage " + roomAdminUpgradeModel);
                    OooO0oO(roomAdminUpgradeModel.userid);
                    break;
                }
                break;
            case 10031:
                int iOptInt = new JSONObject(new String((byte[]) obj, Charsets.UTF_8)).optInt("order");
                if (1 <= iOptInt && iOptInt < 11) {
                    h0.OooO0O0("202033");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oo0o0Oo(iOptInt, null), 3, null);
                }
                break;
            case 10032:
                int iOptInt2 = new JSONObject(new String((byte[]) obj, Charsets.UTF_8)).optInt("order");
                if (1 <= iOptInt2 && iOptInt2 < 11) {
                    h0.OooO0O0("202034");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000000O(iOptInt2, null), 3, null);
                }
                break;
            case 100241:
                if (i == 100241) {
                    OooO0o();
                    LiveEventBus.get("REFRESH_APPLY_MIC_LIST").post(Boolean.TRUE);
                }
                break;
            case 1001100:
                RoomMike.MicApplyReply from = RoomMike.MicApplyReply.parseFrom((byte[]) obj);
                if (from != null) {
                    p597o0oo00O.OooOOOO.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0318OooO00o.OooO00o(this), "parseApplyUpMicMessage " + from);
                    List<Room.UserModel> usersList = from.getUsersList();
                    Intrinsics.checkNotNullExpressionValue(usersList, "getUsersList(...)");
                    ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(usersList));
                    for (Room.UserModel userModel : usersList) {
                        long userId = userModel.getUserId();
                        ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
                        RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
                        Intrinsics.checkNotNull(userModel);
                        com.yalla.yalla.service.room.OooO00o.OooO0o(companion.of(userModel));
                        arrayList.add(Long.valueOf(userId));
                    }
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p485o0o000Oo.o00oO0o(arrayList, from, null), 3, null);
                    break;
                }
                break;
            case 1001103:
                RoomMike.MicInviteFromApplyReply from2 = RoomMike.MicInviteFromApplyReply.parseFrom((byte[]) obj);
                if (from2 != null) {
                    p597o0oo00O.OooOOOO.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0318OooO00o.OooO00o(this), "parseInviteUpMicMessage " + from2);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0OO00O(from2, null), 3, null);
                    break;
                }
                break;
            case 1001105:
                RoomMike.MicUpFromMicApplyInviteReply from3 = RoomMike.MicUpFromMicApplyInviteReply.parseFrom((byte[]) obj);
                if (from3 != null) {
                    p597o0oo00O.OooOOOO.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0318OooO00o.OooO00o(this), "parseAnswerInviteUpMicMessage " + from3);
                    OooO0oO(from3.getUserId());
                    break;
                }
                break;
            case 1001106:
                RoomMike.MicApplySwitchOpenReply from4 = RoomMike.MicApplySwitchOpenReply.parseFrom((byte[]) obj);
                if (from4 != null) {
                    p597o0oo00O.OooOOOO.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0318OooO00o.OooO00o(this), "parseMicApplyOpenMessage " + from4);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oo000o(from4, null), 3, null);
                    break;
                }
                break;
            case 1001108:
                RoomMike.AllowAdminOpenMicApplyReply from5 = RoomMike.AllowAdminOpenMicApplyReply.parseFrom((byte[]) obj);
                if (from5 != null) {
                    p597o0oo00O.OooOOOO.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0318OooO00o.OooO00o(this), "parseAllowManagerOpenApplyMicMessage " + from5);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00Oo0(from5, null), 3, null);
                    break;
                }
                break;
            case 1001109:
                RoomMike.MicApplyListReply from6 = RoomMike.MicApplyListReply.parseFrom((byte[]) obj);
                if (from6 != null) {
                    p597o0oo00O.OooOOOO.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0318OooO00o.OooO00o(this), "parseMicApplyListMessage " + from6);
                    List<Room.UserModel> usersList2 = from6.getUsersList();
                    Intrinsics.checkNotNullExpressionValue(usersList2, "getUsersList(...)");
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.OooO0oo(usersList2));
                    for (Room.UserModel userModel2 : usersList2) {
                        ArrayList arrayList4 = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
                        RoomUserInfoModel.Companion companion2 = RoomUserInfoModel.INSTANCE;
                        Intrinsics.checkNotNull(userModel2);
                        com.yalla.yalla.service.room.OooO00o.OooO0o(companion2.of(userModel2));
                        arrayList3.add(Long.valueOf(userModel2.getUserId()));
                    }
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00Ooo(arrayList3, from6, null), 3, null);
                    break;
                }
                break;
        }
    }
}
