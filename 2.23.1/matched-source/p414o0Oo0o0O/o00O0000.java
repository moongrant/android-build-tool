package p414o0Oo0o0O;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.code.android.util.o0OoOo0;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.StatusEnum$MsgSendStatus;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.model.FriendCheckModel;
import com.yalla.yalla.model.ImResult;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypePay;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserInfoModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p393o0OOooo0.o00oO0o;
import p393o0OOooo0.o0OO00O;
import p409o0Oo0Oo.o00;
import p410o0Oo0Oo0.o00O0O;
import p474o0OoooOO.oo0oO0;
import p480o0o000.o000oOoO;
import p565o0oOo000.o000OOo;
import p593o0oOoooO.h0;
import p640o0ooO0oo.o0oo0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nImMessageRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImMessageRepo.kt\ncom/yalla/yalla/data/repository/ImMessageRepo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,824:1\n1855#2,2:825\n*S KotlinDebug\n*F\n+ 1 ImMessageRepo.kt\ncom/yalla/yalla/data/repository/ImMessageRepo\n*L\n268#1:825,2\n*E\n"})
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O0000 f46081OooO00o = new o00O0000();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0}, l = {772}, m = "sendUnBlockMessage", n = {"targetId"}, s = {"J$0"})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f46082OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f46084OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f46085OooO0oO;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46084OooO0o0 = obj;
            this.f46085OooO0oO |= Integer.MIN_VALUE;
            return o00O0000.this.OooO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0, 0}, l = {746}, m = "checkIsFriend", n = {"friendCheckModel", "targetId"}, s = {"L$0", "J$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f46086OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f46087OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public FriendCheckModel f46088OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f46090OooO0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46087OooO0o = obj;
            this.f46090OooO0oo |= Integer.MIN_VALUE;
            return o00O0000.this.OooO0o(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {}, l = {51}, m = "checkUserRisk", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46091OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46092OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46091OooO0Oo = obj;
            this.f46092OooO0o |= Integer.MIN_VALUE;
            return o00O0000.this.OooO0oO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0}, l = {761}, m = "sendBlockMessage", n = {"targetId"}, s = {"J$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f46094OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f46096OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f46097OooO0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46096OooO0o0 = obj;
            this.f46097OooO0oO |= Integer.MIN_VALUE;
            return o00O0000.this.OooO0oo(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendBlockMessage$2", f = "ImMessageRepo.kt", i = {}, l = {764}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<UserInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f46098OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f46099OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f46099OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f46099OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f46098OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoRepo userInfoRepo = UserInfoRepo.f22740OooO00o;
                this.f46098OooO0Oo = 1;
                obj = userInfoRepo.OooO0oo(this.f46099OooO0o0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendUnBlockMessage$2", f = "ImMessageRepo.kt", i = {}, l = {774}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<UserInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f46100OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f46101OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f46101OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f46101OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f46100OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoRepo userInfoRepo = UserInfoRepo.f22740OooO00o;
                this.f46100OooO0Oo = 1;
                obj = userInfoRepo.OooO0oo(this.f46101OooO0o0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object OooO00o(o00O0000 o00o0001, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        o00O00 o00o01;
        o00o0001.getClass();
        if (continuation instanceof o00O00) {
            o00o01 = (o00O00) continuation;
            int i = o00o01.f46077OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o01.f46077OooO0oO = i - Integer.MIN_VALUE;
            } else {
                o00o01 = new o00O00(o00o0001, continuation);
            }
        } else {
            o00o01 = new o00O00(o00o0001, continuation);
        }
        Object objOooO0O0 = o00o01.f46076OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00o01.f46077OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                int giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                String strValueOf = String.valueOf(oo0oO0.OooOOoo().getValue());
                String strValueOf2 = String.valueOf(oo0oO0.OooO().getValue());
                Integer numBoxInt = (Integer) ((MutableLiveData) oo0oO0.f47988OooOo0O.getValue()).getValue();
                if (numBoxInt == null) {
                    numBoxInt = Boxing.boxInt(0);
                }
                int iIntValue = numBoxInt.intValue();
                o00o01.f46074OooO0Oo = chatMessage;
                o00o01.f46077OooO0oO = 1;
                MessageIM.SendGiftRequest.Builder builderNewBuilder = MessageIM.SendGiftRequest.newBuilder();
                builderNewBuilder.setToId(targetId);
                builderNewBuilder.setGiftId(giftId);
                builderNewBuilder.setNumber(giftNumber);
                builderNewBuilder.setNickname(strValueOf);
                builderNewBuilder.setHeadphoto(strValueOf2);
                builderNewBuilder.setRole(iIntValue);
                o0oo0000 o0oo0000Var = o000oOoO.f48363OooO00o;
                String str = p386o0OOoo0O.o000oOoO.f43338OooO0o0;
                Intrinsics.checkNotNull(builderNewBuilder);
                objOooO0O0 = o000oOoO.OooO0O0(str, builderNewBuilder, o00o01);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chatMessage = o00o01.f46074OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            h0.OooO0O0("104030");
            MessageIM.SendGiftReply from = MessageIM.SendGiftReply.parseFrom(error.getBody());
            if (from != null) {
                o00oO0o.OooO00o().OooO00o(from.getTime());
                if (from.getType() == GiftPropTypePay.Coin.getValue()) {
                    oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                    oo0oO0.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
                } else {
                    oo0oO0 oo0oo2 = oo0oO0.f47967OooO00o;
                    oo0oO0.OooO0Oo().postValue(Boxing.boxLong(from.getBalance()));
                }
                if (from.getLuckyFlag() == 1) {
                    LiveEventBus.get("EVENTMSG_PRIVATE_LUCKY_GIFT").post(from);
                }
                h0.OooO0OO("204011", MapsKt.mapOf(new Pair("region", String.valueOf(p596o0oo000O.OooO0o.OooO0OO()))));
                OooOO0(chatMessage.getMid(), true);
                return Boxing.boxBoolean(true);
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooO0o(error, null), 3, null);
        }
        OooOO0(chatMessage.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO0O0(o00O0000 o00o0001, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        o00O00O o00o00o2;
        o00o0001.getClass();
        if (continuation instanceof o00O00O) {
            o00o00o2 = (o00O00O) continuation;
            int i = o00o00o2.f46108OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o00o2.f46108OooO0oO = i - Integer.MIN_VALUE;
            } else {
                o00o00o2 = new o00O00O(o00o0001, continuation);
            }
        } else {
            o00o00o2 = new o00O00O(o00o0001, continuation);
        }
        Object objOooO0O0 = o00o00o2.f46107OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00o00o2.f46108OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                int giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                o00o00o2.f46105OooO0Oo = chatMessage;
                o00o00o2.f46108OooO0oO = 1;
                MessageIM.BackpackGiftRequest.Builder builderNewBuilder = MessageIM.BackpackGiftRequest.newBuilder();
                builderNewBuilder.setNum(giftNumber);
                builderNewBuilder.setGiftId(giftId);
                builderNewBuilder.setTargetId(targetId);
                o0oo0000 o0oo0000Var = o000oOoO.f48363OooO00o;
                String str = p386o0OOoo0O.o000oOoO.f43340OooO0oo;
                Intrinsics.checkNotNull(builderNewBuilder);
                objOooO0O0 = o000oOoO.OooO0O0(str, builderNewBuilder, o00o00o2);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chatMessage = o00o00o2.f46105OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        int code = error.getCode();
        if (code == 200) {
            MessageIM.BackpackGiftReply from = MessageIM.BackpackGiftReply.parseFrom(error.getBody());
            if (from != null) {
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = o0OO00O.f43560OooO00o;
                o0OO00O.OooO0o((int) from.getGiftId(), from.getRemainingNum(), from.getMinExpirationTime());
            }
            h0.OooO0OO("204011", MapsKt.mapOf(new Pair("region", String.valueOf(p596o0oo000O.OooO0o.OooO0OO()))));
            OooOO0(chatMessage.getMid(), true);
            return Boxing.boxBoolean(true);
        }
        switch (code) {
            case 657:
                MessageIM.BackpackGiftReply from2 = MessageIM.BackpackGiftReply.parseFrom(error.getBody());
                if (from2 != null) {
                    MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = o0OO00O.f43560OooO00o;
                    o0OO00O.OooO0o((int) from2.getGiftId(), from2.getRemainingNum(), from2.getMinExpirationTime());
                    o000O00.OooO0O0(o0000.OooO0OO(from2.getRemainingNum() > 0 ? o000OOo.Some_gifts_have_expired : o000OOo.The_gift_has_expired));
                }
                OooOO0(chatMessage.getMid(), false);
                break;
            case 658:
                LiveEventBus.get("GiftBackpackFrozen_IM").post(Boxing.boxBoolean(true));
                OooOO0(chatMessage.getMid(), false);
                break;
            case 659:
                LiveEventBus.get("WealthLevelInsufficient_IM").post(Boxing.boxBoolean(true));
                OooOO0(chatMessage.getMid(), false);
                break;
            default:
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooO0o(error, null), 3, null);
                OooOO0(chatMessage.getMid(), false);
                break;
        }
        OooOO0(chatMessage.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object OooO0OO(o00O0000 o00o0001, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        oOO00O ooo00o;
        ChatMessage chatMessage2;
        o00o0001.getClass();
        if (continuation instanceof oOO00O) {
            ooo00o = (oOO00O) continuation;
            int i = ooo00o.f46353OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                ooo00o.f46353OooO0oO = i - Integer.MIN_VALUE;
            } else {
                ooo00o = new oOO00O(o00o0001, continuation);
            }
        } else {
            ooo00o = new oOO00O(o00o0001, continuation);
        }
        Object objOooO0O0 = ooo00o.f46352OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ooo00o.f46353OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                int giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                ooo00o.f46350OooO0Oo = chatMessage;
                ooo00o.f46353OooO0oO = 1;
                MessageIM.BlindBoxGiftRequest.Builder builderNewBuilder = MessageIM.BlindBoxGiftRequest.newBuilder();
                builderNewBuilder.setNum(giftNumber);
                builderNewBuilder.setGiftId(giftId);
                builderNewBuilder.setTargetId(targetId);
                o0oo0000 o0oo0000Var = o000oOoO.f48363OooO00o;
                String str = p386o0OOoo0O.o000oOoO.f43339OooO0oO;
                Intrinsics.checkNotNull(builderNewBuilder);
                objOooO0O0 = o000oOoO.OooO0O0(str, builderNewBuilder, ooo00o);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                chatMessage2 = chatMessage;
            }
            return Boxing.boxBoolean(false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chatMessage2 = ooo00o.f46350OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            MessageIM.BlindBoxGiftReply from = MessageIM.BlindBoxGiftReply.parseFrom(error.getBody());
            if (from != null) {
                o00oO0o.OooO00o().OooO00o(from.getTime());
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                oo0oO0.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
                List<MessageIM.GiftIdUrl> giftsList = from.getGiftsList();
                if (giftsList != null) {
                    Intrinsics.checkNotNull(giftsList);
                    for (MessageIM.GiftIdUrl giftIdUrl : giftsList) {
                        ChatMessage.GiftInfo giftInfo2 = chatMessage2.getGiftInfo();
                        if (giftInfo2 != null) {
                            long targetId2 = chatMessage2.getTargetId();
                            int iOooO0oO = o0OoOo0.OooO0oO(Boxing.boxLong(giftIdUrl.getGiftId()));
                            String giftUrl = giftIdUrl.getGiftUrl();
                            Intrinsics.checkNotNullExpressionValue(giftUrl, "getGiftUrl(...)");
                            ChatMessage chatMessageOooOO0O = o000.OooOO0O(targetId2, iOooO0oO, 1, giftUrl, null, 0L, false, o0OoOo0.OooO00o(giftInfo2.getIsGiftBlind()), false, false, false, 1648);
                            o000.OooO0oO(chatMessageOooOO0O);
                            OooOO0(chatMessageOooOO0O.getMid(), true);
                        }
                    }
                }
                h0.OooO0OO("204011", MapsKt.mapOf(new Pair("region", String.valueOf(p596o0oo000O.OooO0o.OooO0OO()))));
                OooOO0(chatMessage2.getMid(), true);
                return Boxing.boxBoolean(true);
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooO0o(error, null), 3, null);
        }
        OooOO0(chatMessage2.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO0Oo(o00O0000 o00o0001, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        o00O00OO o00o00oo2;
        o00o0001.getClass();
        if (continuation instanceof o00O00OO) {
            o00o00oo2 = (o00O00OO) continuation;
            int i = o00o00oo2.f46112OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o00oo2.f46112OooO0oO = i - Integer.MIN_VALUE;
            } else {
                o00o00oo2 = new o00O00OO(o00o0001, continuation);
            }
        } else {
            o00o00oo2 = new o00O00OO(o00o0001, continuation);
        }
        Object objOooO0O0 = o00o00oo2.f46111OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00o00oo2.f46112OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                long giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                o00o00oo2.f46109OooO0Oo = chatMessage;
                o00o00oo2.f46112OooO0oO = 1;
                MessageIM.CustomGiftRequest.Builder builderNewBuilder = MessageIM.CustomGiftRequest.newBuilder();
                builderNewBuilder.setTargetId(targetId);
                builderNewBuilder.setGiftId(giftId);
                builderNewBuilder.setNumber(giftNumber);
                o0oo0000 o0oo0000Var = o000oOoO.f48363OooO00o;
                String str = p386o0OOoo0O.o000oOoO.f43337OooO0o;
                Intrinsics.checkNotNull(builderNewBuilder);
                objOooO0O0 = o000oOoO.OooO0O0(str, builderNewBuilder, o00o00oo2);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chatMessage = o00o00oo2.f46109OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            MessageIM.CustomGiftReply from = MessageIM.CustomGiftReply.parseFrom(error.getBody());
            if (from != null) {
                o00oO0o.OooO00o().OooO00o(from.getTime());
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                oo0oO0.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
                h0.OooO0OO("204011", MapsKt.mapOf(new Pair("region", String.valueOf(p596o0oo000O.OooO0o.OooO0OO()))));
                OooOO0(chatMessage.getMid(), true);
                return Boxing.boxBoolean(true);
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooO0o(error, null), 3, null);
        }
        OooOO0(chatMessage.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    public static void OooOO0(String mid, boolean z) {
        if (z) {
            StatusEnum$MsgSendStatus state = StatusEnum$MsgSendStatus.SUCCESS;
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(state, "state");
            o00O0O.OooO00o().OooOOo0().OooO0o0(state.OooO00o(), mid);
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(state, "state");
            o00O0O.OooO00o().OooOOo().OooO0o0(state.OooO00o(), mid);
            return;
        }
        StatusEnum$MsgSendStatus state2 = StatusEnum$MsgSendStatus.FAIL;
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(state2, "state");
        o00O0O.OooO00o().OooOOo0().OooO0o0(state2.OooO00o(), mid);
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(state2, "state");
        o00O0O.OooO00o().OooOOo().OooO0o0(state2.OooO00o(), mid);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO(long j, @NotNull Continuation<? super Boolean> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f46085OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f46085OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objOooO0O0 = oooO.f46084OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f46085OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO.f46082OooO0Oo = j;
            oooO.f46085OooO0oO = 1;
            MessageIM.FriendUnblockRequest.Builder builderNewBuilder = MessageIM.FriendUnblockRequest.newBuilder();
            builderNewBuilder.setTarget(j);
            o0oo0000 o0oo0000Var = o000oOoO.f48363OooO00o;
            String str = p386o0OOoo0O.o000oOoO.f43347OooOOOo;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = o000oOoO.OooO0O0(str, builderNewBuilder, oooO);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = oooO.f46082OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new OooOO0(j, null), 3, null).start();
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooO0o(error, null), 3, null);
        }
        return Boxing.boxBoolean(error.getBody() != null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o(long j, @NotNull Continuation<? super FriendCheckModel> continuation) {
        OooO00o oooO00o;
        FriendCheckModel friendCheckModel;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f46090OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f46090OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f46087OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f46090OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            FriendCheckModel friendCheckModel2 = new FriendCheckModel();
            oooO00o.f46088OooO0o0 = friendCheckModel2;
            oooO00o.f46086OooO0Oo = j;
            oooO00o.f46090OooO0oo = 1;
            MessageIM.FriendCheckRequest.Builder builderNewBuilder = MessageIM.FriendCheckRequest.newBuilder();
            builderNewBuilder.setTarget(j);
            o0oo0000 o0oo0000Var = o000oOoO.f48363OooO00o;
            String str = p386o0OOoo0O.o000oOoO.f43344OooOOO;
            Intrinsics.checkNotNull(builderNewBuilder);
            Object objOooO0O0 = o000oOoO.OooO0O0(str, builderNewBuilder, oooO00o);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            friendCheckModel = friendCheckModel2;
            obj = objOooO0O0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = oooO00o.f46086OooO0Oo;
            friendCheckModel = oooO00o.f46088OooO0o0;
            ResultKt.throwOnFailure(obj);
        }
        ImResult error = (ImResult) obj;
        if (error.isSuccess()) {
            MessageIM.FriendCheckReply from = MessageIM.FriendCheckReply.parseFrom(error.getBody());
            if (from != null) {
                friendCheckModel.isFriend = from.getIsFriend();
                friendCheckModel.isBlack = from.getIsBlock();
                friendCheckModel.isVerify = from.getIsVerify();
                friendCheckModel.userId = String.valueOf(j);
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooO0o(error, null), 3, null);
        }
        return friendCheckModel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object OooO0o0(long j, boolean z, @NotNull Continuation continuation) {
        o000OO00 o000oo01;
        long j2 = j;
        boolean z2 = z;
        if (continuation instanceof o000OO00) {
            o000oo01 = (o000OO00) continuation;
            int i = o000oo01.f46010OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oo01.f46010OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o000oo01 = new o000OO00(this, continuation);
            }
        } else {
            o000oo01 = new o000OO00(this, continuation);
        }
        Object objOooO0O0 = o000oo01.f46007OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000oo01.f46010OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            UserInfoRepo.f22740OooO00o.getClass();
            UserInfo userInfoOooO0Oo = UserInfoRepo.OooO0Oo(j);
            String userName = userInfoOooO0Oo != null ? userInfoOooO0Oo.getUserName() : null;
            String userHeader = userInfoOooO0Oo != null ? userInfoOooO0Oo.getUserHeader() : null;
            o000oo01.f46006OooO0Oo = z2;
            o000oo01.f46008OooO0o0 = j2;
            o000oo01.f46010OooO0oo = 1;
            MessageIM.FriendApplyRequest.Builder builderNewBuilder = MessageIM.FriendApplyRequest.newBuilder();
            builderNewBuilder.setFromId(j2);
            builderNewBuilder.setResult(z2 ? 1 : 0);
            if (userName == null) {
                userName = "";
            }
            builderNewBuilder.setNickname(userName);
            if (userHeader == null) {
                userHeader = "";
            }
            builderNewBuilder.setHeadphoto(userHeader);
            o0oo0000 o0oo0000Var = o000oOoO.f48363OooO00o;
            String str = p386o0OOoo0O.o000oOoO.f43345OooOOO0;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = o000oOoO.OooO0O0(str, builderNewBuilder, o000oo01);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = o000oo01.f46008OooO0o0;
            z2 = o000oo01.f46006OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult error = (ImResult) objOooO0O0;
        if (!error.isSuccess()) {
            if (error.getCode() == 630) {
                o00 o00VarOooOo00 = o00O0O.OooO00o().OooOo00();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                o00VarOooOo00.OooOO0O(3, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j2);
            }
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooO0o(error, null), 3, null);
            return Boxing.boxBoolean(false);
        }
        int i3 = z2 ? 1 : 2;
        o00 o00VarOooOo01 = o00O0O.OooO00o().OooOo00();
        oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
        o00VarOooOo01.OooOO0O(i3, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j2);
        if (z2) {
            GlobalScope globalScope = GlobalScope.INSTANCE;
            BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new o000OOo0(j2, null), 3, null).start();
            BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new o00(j2, null), 3, null).start();
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oO(long j, @NotNull Continuation<? super Boolean> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f46092OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f46092OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0O0 = oooO0O0.f46091OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f46092OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO0O0.f46092OooO0o = 1;
            MessageIM.UserRiskIn.Builder builderNewBuilder = MessageIM.UserRiskIn.newBuilder();
            builderNewBuilder.setTarget(j);
            o0oo0000 o0oo0000Var = o000oOoO.f48363OooO00o;
            String str = p386o0OOoo0O.o000oOoO.f43353OooOo00;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = o000oOoO.OooO0O0(str, builderNewBuilder, oooO0O0);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            MessageIM.UserRiskOut from = MessageIM.UserRiskOut.parseFrom(error.getBody());
            if (from != null) {
                return Boxing.boxBoolean(from.getLevel() == 1);
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooO0o(error, null), 3, null);
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oo(long j, @NotNull Continuation<? super Boolean> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f46097OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f46097OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objOooO0O0 = oooO0OO.f46096OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f46097OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO0OO.f46094OooO0Oo = j;
            oooO0OO.f46097OooO0oO = 1;
            MessageIM.FriendBlockRequest.Builder builderNewBuilder = MessageIM.FriendBlockRequest.newBuilder();
            builderNewBuilder.setTarget(j);
            o0oo0000 o0oo0000Var = o000oOoO.f48363OooO00o;
            String str = p386o0OOoo0O.o000oOoO.f43346OooOOOO;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = o000oOoO.OooO0O0(str, builderNewBuilder, oooO0OO);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = oooO0OO.f46094OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            o00 o00VarOooOo00 = o00O0O.OooO00o().OooOo00();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            o00VarOooOo00.OooO0o(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j);
            BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new OooO0o(j, null), 3, null).start();
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooO0o(error, null), 3, null);
        }
        return Boxing.boxBoolean(error.getBody() != null);
    }
}
