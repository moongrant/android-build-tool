package p412o0Oo0o0O;

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
import p384o0OOoo0O.Oooo0;
import p391o0OOooo0.o0ooOOo;
import p391o0OOooo0.oo0o0Oo;
import p407o0Oo0Oo.o00;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p479o0o0000o.o000O000;
import p562o0oOo000.o000000;
import p595o0oo00O.OooOo00;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nImMessageRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImMessageRepo.kt\ncom/yalla/yalla/data/repository/ImMessageRepo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,824:1\n1855#2,2:825\n*S KotlinDebug\n*F\n+ 1 ImMessageRepo.kt\ncom/yalla/yalla/data/repository/ImMessageRepo\n*L\n268#1:825,2\n*E\n"})
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000OO00 f46018OooO00o = new o000OO00();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0}, l = {772}, m = "sendUnBlockMessage", n = {"targetId"}, s = {"J$0"})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f46019OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f46021OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f46022OooO0oO;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46021OooO0o0 = obj;
            this.f46022OooO0oO |= Integer.MIN_VALUE;
            return o000OO00.this.OooO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0, 0}, l = {746}, m = "checkIsFriend", n = {"friendCheckModel", "targetId"}, s = {"L$0", "J$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f46023OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f46024OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public FriendCheckModel f46025OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f46027OooO0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46024OooO0o = obj;
            this.f46027OooO0oo |= Integer.MIN_VALUE;
            return o000OO00.this.OooO0o(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {}, l = {51}, m = "checkUserRisk", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46028OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46029OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46028OooO0Oo = obj;
            this.f46029OooO0o |= Integer.MIN_VALUE;
            return o000OO00.this.OooO0oO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0}, l = {761}, m = "sendBlockMessage", n = {"targetId"}, s = {"J$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f46031OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f46033OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f46034OooO0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46033OooO0o0 = obj;
            this.f46034OooO0oO |= Integer.MIN_VALUE;
            return o000OO00.this.OooO0oo(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendBlockMessage$2", f = "ImMessageRepo.kt", i = {}, l = {764}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<UserInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f46035OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f46036OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f46036OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f46036OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f46035OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
                this.f46035OooO0Oo = 1;
                obj = userInfoRepo.OooO0oo(this.f46036OooO0o0, this);
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
        public int f46037OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f46038OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f46038OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f46038OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f46037OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
                this.f46037OooO0Oo = 1;
                obj = userInfoRepo.OooO0oo(this.f46038OooO0o0, this);
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
    public static final Object OooO00o(o000OO00 o000oo01, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        o00oOoo o00oooo2;
        o000oo01.getClass();
        if (continuation instanceof o00oOoo) {
            o00oooo2 = (o00oOoo) continuation;
            int i = o00oooo2.f46251OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00oooo2.f46251OooO0oO = i - Integer.MIN_VALUE;
            } else {
                o00oooo2 = new o00oOoo(o000oo01, continuation);
            }
        } else {
            o00oooo2 = new o00oOoo(o000oo01, continuation);
        }
        Object objOooO0O0 = o00oooo2.f46250OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00oooo2.f46251OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                int giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                String strValueOf = String.valueOf(o0O00oO0.OooOOoo().getValue());
                String strValueOf2 = String.valueOf(o0O00oO0.OooO().getValue());
                Integer numBoxInt = (Integer) ((MutableLiveData) o0O00oO0.f47957OooOo0O.getValue()).getValue();
                if (numBoxInt == null) {
                    numBoxInt = Boxing.boxInt(0);
                }
                int iIntValue = numBoxInt.intValue();
                o00oooo2.f46248OooO0Oo = chatMessage;
                o00oooo2.f46251OooO0oO = 1;
                MessageIM.SendGiftRequest.Builder builderNewBuilder = MessageIM.SendGiftRequest.newBuilder();
                builderNewBuilder.setToId(targetId);
                builderNewBuilder.setGiftId(giftId);
                builderNewBuilder.setNumber(giftNumber);
                builderNewBuilder.setNickname(strValueOf);
                builderNewBuilder.setHeadphoto(strValueOf2);
                builderNewBuilder.setRole(iIntValue);
                o0OoO00O o0ooo00o2 = p480o0o000O.OooOO0.f48392OooO00o;
                String str = Oooo0.f43338OooO0o0;
                Intrinsics.checkNotNull(builderNewBuilder);
                objOooO0O0 = p480o0o000O.OooOO0.OooO0O0(str, builderNewBuilder, o00oooo2);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chatMessage = o00oooo2.f46248OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            o0oo0000.OooO00o.OooO0O0("104030");
            MessageIM.SendGiftReply from = MessageIM.SendGiftReply.parseFrom(error.getBody());
            if (from != null) {
                o0ooOOo.OooO00o().OooO00o(from.getTime());
                if (from.getType() == GiftPropTypePay.Coin.getValue()) {
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    o0O00oO0.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
                } else {
                    o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                    o0O00oO0.OooO0Oo().postValue(Boxing.boxLong(from.getBalance()));
                }
                if (from.getLuckyFlag() == 1) {
                    LiveEventBus.get("EVENTMSG_PRIVATE_LUCKY_GIFT").post(from);
                }
                o0oo0000.OooO00o.OooO0OO("204011", MapsKt.mapOf(new Pair("region", String.valueOf(OooOo00.OooO0OO()))));
                OooOO0(chatMessage.getMid(), true);
                return Boxing.boxBoolean(true);
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
        }
        OooOO0(chatMessage.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO0O0(o000OO00 o000oo01, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        o00O000 o00o001;
        o000oo01.getClass();
        if (continuation instanceof o00O000) {
            o00o001 = (o00O000) continuation;
            int i = o00o001.f46064OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o001.f46064OooO0oO = i - Integer.MIN_VALUE;
            } else {
                o00o001 = new o00O000(o000oo01, continuation);
            }
        } else {
            o00o001 = new o00O000(o000oo01, continuation);
        }
        Object objOooO0O0 = o00o001.f46063OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00o001.f46064OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                int giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                o00o001.f46061OooO0Oo = chatMessage;
                o00o001.f46064OooO0oO = 1;
                MessageIM.BackpackGiftRequest.Builder builderNewBuilder = MessageIM.BackpackGiftRequest.newBuilder();
                builderNewBuilder.setNum(giftNumber);
                builderNewBuilder.setGiftId(giftId);
                builderNewBuilder.setTargetId(targetId);
                o0OoO00O o0ooo00o2 = p480o0o000O.OooOO0.f48392OooO00o;
                String str = Oooo0.f43340OooO0oo;
                Intrinsics.checkNotNull(builderNewBuilder);
                objOooO0O0 = p480o0o000O.OooOO0.OooO0O0(str, builderNewBuilder, o00o001);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chatMessage = o00o001.f46061OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        int code = error.getCode();
        if (code == 200) {
            MessageIM.BackpackGiftReply from = MessageIM.BackpackGiftReply.parseFrom(error.getBody());
            if (from != null) {
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oo0o0Oo.f43573OooO00o;
                oo0o0Oo.OooO0o((int) from.getGiftId(), from.getRemainingNum(), from.getMinExpirationTime());
            }
            o0oo0000.OooO00o.OooO0OO("204011", MapsKt.mapOf(new Pair("region", String.valueOf(OooOo00.OooO0OO()))));
            OooOO0(chatMessage.getMid(), true);
            return Boxing.boxBoolean(true);
        }
        switch (code) {
            case 657:
                MessageIM.BackpackGiftReply from2 = MessageIM.BackpackGiftReply.parseFrom(error.getBody());
                if (from2 != null) {
                    MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = oo0o0Oo.f43573OooO00o;
                    oo0o0Oo.OooO0o((int) from2.getGiftId(), from2.getRemainingNum(), from2.getMinExpirationTime());
                    o000O00.OooO0O0(o0000.OooO0OO(from2.getRemainingNum() > 0 ? o000000.Some_gifts_have_expired : o000000.The_gift_has_expired));
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
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
                OooOO0(chatMessage.getMid(), false);
                break;
        }
        OooOO0(chatMessage.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object OooO0OO(o000OO00 o000oo01, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        o00O000o o00o000o2;
        ChatMessage chatMessage2;
        o000oo01.getClass();
        if (continuation instanceof o00O000o) {
            o00o000o2 = (o00O000o) continuation;
            int i = o00o000o2.f46071OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o000o2.f46071OooO0oO = i - Integer.MIN_VALUE;
            } else {
                o00o000o2 = new o00O000o(o000oo01, continuation);
            }
        } else {
            o00o000o2 = new o00O000o(o000oo01, continuation);
        }
        Object objOooO0O0 = o00o000o2.f46070OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00o000o2.f46071OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                int giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                o00o000o2.f46068OooO0Oo = chatMessage;
                o00o000o2.f46071OooO0oO = 1;
                MessageIM.BlindBoxGiftRequest.Builder builderNewBuilder = MessageIM.BlindBoxGiftRequest.newBuilder();
                builderNewBuilder.setNum(giftNumber);
                builderNewBuilder.setGiftId(giftId);
                builderNewBuilder.setTargetId(targetId);
                o0OoO00O o0ooo00o2 = p480o0o000O.OooOO0.f48392OooO00o;
                String str = Oooo0.f43339OooO0oO;
                Intrinsics.checkNotNull(builderNewBuilder);
                objOooO0O0 = p480o0o000O.OooOO0.OooO0O0(str, builderNewBuilder, o00o000o2);
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
        chatMessage2 = o00o000o2.f46068OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            MessageIM.BlindBoxGiftReply from = MessageIM.BlindBoxGiftReply.parseFrom(error.getBody());
            if (from != null) {
                o0ooOOo.OooO00o().OooO00o(from.getTime());
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
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
                            ChatMessage chatMessageOooOO0O = o000OO.OooOO0O(targetId2, iOooO0oO, 1, giftUrl, null, 0L, false, o0OoOo0.OooO00o(giftInfo2.getIsGiftBlind()), false, false, false, 1648);
                            o000OO.OooO0oO(chatMessageOooOO0O);
                            OooOO0(chatMessageOooOO0O.getMid(), true);
                        }
                    }
                }
                o0oo0000.OooO00o.OooO0OO("204011", MapsKt.mapOf(new Pair("region", String.valueOf(OooOo00.OooO0OO()))));
                OooOO0(chatMessage2.getMid(), true);
                return Boxing.boxBoolean(true);
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
        }
        OooOO0(chatMessage2.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO0Oo(o000OO00 o000oo01, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        o00O00 o00o01;
        o000oo01.getClass();
        if (continuation instanceof o00O00) {
            o00o01 = (o00O00) continuation;
            int i = o00o01.f46060OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00o01.f46060OooO0oO = i - Integer.MIN_VALUE;
            } else {
                o00o01 = new o00O00(o000oo01, continuation);
            }
        } else {
            o00o01 = new o00O00(o000oo01, continuation);
        }
        Object objOooO0O0 = o00o01.f46059OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00o01.f46060OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                long giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                o00o01.f46057OooO0Oo = chatMessage;
                o00o01.f46060OooO0oO = 1;
                MessageIM.CustomGiftRequest.Builder builderNewBuilder = MessageIM.CustomGiftRequest.newBuilder();
                builderNewBuilder.setTargetId(targetId);
                builderNewBuilder.setGiftId(giftId);
                builderNewBuilder.setNumber(giftNumber);
                o0OoO00O o0ooo00o2 = p480o0o000O.OooOO0.f48392OooO00o;
                String str = Oooo0.f43337OooO0o;
                Intrinsics.checkNotNull(builderNewBuilder);
                objOooO0O0 = p480o0o000O.OooOO0.OooO0O0(str, builderNewBuilder, o00o01);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chatMessage = o00o01.f46057OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            MessageIM.CustomGiftReply from = MessageIM.CustomGiftReply.parseFrom(error.getBody());
            if (from != null) {
                o0ooOOo.OooO00o().OooO00o(from.getTime());
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
                o0oo0000.OooO00o.OooO0OO("204011", MapsKt.mapOf(new Pair("region", String.valueOf(OooOo00.OooO0OO()))));
                OooOO0(chatMessage.getMid(), true);
                return Boxing.boxBoolean(true);
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
        }
        OooOO0(chatMessage.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    public static void OooOO0(String mid, boolean z) {
        if (z) {
            StatusEnum$MsgSendStatus state = StatusEnum$MsgSendStatus.SUCCESS;
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(state, "state");
            o00Oo0.OooO00o().OooOOo0().OooO0o0(state.OooO00o(), mid);
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(state, "state");
            o00Oo0.OooO00o().OooOOo().OooO0o0(state.OooO00o(), mid);
            return;
        }
        StatusEnum$MsgSendStatus state2 = StatusEnum$MsgSendStatus.FAIL;
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(state2, "state");
        o00Oo0.OooO00o().OooOOo0().OooO0o0(state2.OooO00o(), mid);
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(state2, "state");
        o00Oo0.OooO00o().OooOOo().OooO0o0(state2.OooO00o(), mid);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO(long j, @NotNull Continuation<? super Boolean> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f46022OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f46022OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objOooO0O0 = oooO.f46021OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f46022OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO.f46019OooO0Oo = j;
            oooO.f46022OooO0oO = 1;
            MessageIM.FriendUnblockRequest.Builder builderNewBuilder = MessageIM.FriendUnblockRequest.newBuilder();
            builderNewBuilder.setTarget(j);
            o0OoO00O o0ooo00o2 = p480o0o000O.OooOO0.f48392OooO00o;
            String str = Oooo0.f43347OooOOOo;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = p480o0o000O.OooOO0.OooO0O0(str, builderNewBuilder, oooO);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = oooO.f46019OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new OooOO0(j, null), 3, null).start();
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
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
            int i = oooO00o.f46027OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f46027OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f46024OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f46027OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            FriendCheckModel friendCheckModel2 = new FriendCheckModel();
            oooO00o.f46025OooO0o0 = friendCheckModel2;
            oooO00o.f46023OooO0Oo = j;
            oooO00o.f46027OooO0oo = 1;
            MessageIM.FriendCheckRequest.Builder builderNewBuilder = MessageIM.FriendCheckRequest.newBuilder();
            builderNewBuilder.setTarget(j);
            o0OoO00O o0ooo00o2 = p480o0o000O.OooOO0.f48392OooO00o;
            String str = Oooo0.f43344OooOOO;
            Intrinsics.checkNotNull(builderNewBuilder);
            Object objOooO0O0 = p480o0o000O.OooOO0.OooO0O0(str, builderNewBuilder, oooO00o);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            friendCheckModel = friendCheckModel2;
            obj = objOooO0O0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = oooO00o.f46023OooO0Oo;
            friendCheckModel = oooO00o.f46025OooO0o0;
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
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
        }
        return friendCheckModel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object OooO0o0(long j, boolean z, @NotNull Continuation continuation) {
        o000OO0O o000oo0o2;
        long j2 = j;
        boolean z2 = z;
        if (continuation instanceof o000OO0O) {
            o000oo0o2 = (o000OO0O) continuation;
            int i = o000oo0o2.f46043OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oo0o2.f46043OooO0oo = i - Integer.MIN_VALUE;
            } else {
                o000oo0o2 = new o000OO0O(this, continuation);
            }
        } else {
            o000oo0o2 = new o000OO0O(this, continuation);
        }
        Object objOooO0O0 = o000oo0o2.f46040OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000oo0o2.f46043OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            UserInfoRepo.f22735OooO00o.getClass();
            UserInfo userInfoOooO0Oo = UserInfoRepo.OooO0Oo(j);
            String userName = userInfoOooO0Oo != null ? userInfoOooO0Oo.getUserName() : null;
            String userHeader = userInfoOooO0Oo != null ? userInfoOooO0Oo.getUserHeader() : null;
            o000oo0o2.f46039OooO0Oo = z2;
            o000oo0o2.f46041OooO0o0 = j2;
            o000oo0o2.f46043OooO0oo = 1;
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
            o0OoO00O o0ooo00o2 = p480o0o000O.OooOO0.f48392OooO00o;
            String str = Oooo0.f43345OooOOO0;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = p480o0o000O.OooOO0.OooO0O0(str, builderNewBuilder, o000oo0o2);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = o000oo0o2.f46041OooO0o0;
            z2 = o000oo0o2.f46039OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult error = (ImResult) objOooO0O0;
        if (!error.isSuccess()) {
            if (error.getCode() == 630) {
                o00 o00VarOooOo00 = o00Oo0.OooO00o().OooOo00();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o00VarOooOo00.OooOO0O(3, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j2);
            }
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
            return Boxing.boxBoolean(false);
        }
        int i3 = z2 ? 1 : 2;
        o00 o00VarOooOo01 = o00Oo0.OooO00o().OooOo00();
        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
        o00VarOooOo01.OooOO0O(i3, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j2);
        if (z2) {
            GlobalScope globalScope = GlobalScope.INSTANCE;
            BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new o000O0O0(j2, null), 3, null).start();
            BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new o000O(j2, null), 3, null).start();
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oO(long j, @NotNull Continuation<? super Boolean> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f46029OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f46029OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0O0 = oooO0O0.f46028OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f46029OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO0O0.f46029OooO0o = 1;
            MessageIM.UserRiskIn.Builder builderNewBuilder = MessageIM.UserRiskIn.newBuilder();
            builderNewBuilder.setTarget(j);
            o0OoO00O o0ooo00o2 = p480o0o000O.OooOO0.f48392OooO00o;
            String str = Oooo0.f43353OooOo00;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = p480o0o000O.OooOO0.OooO0O0(str, builderNewBuilder, oooO0O0);
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
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oo(long j, @NotNull Continuation<? super Boolean> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f46034OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f46034OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objOooO0O0 = oooO0OO.f46033OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f46034OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO0OO.f46031OooO0Oo = j;
            oooO0OO.f46034OooO0oO = 1;
            MessageIM.FriendBlockRequest.Builder builderNewBuilder = MessageIM.FriendBlockRequest.newBuilder();
            builderNewBuilder.setTarget(j);
            o0OoO00O o0ooo00o2 = p480o0o000O.OooOO0.f48392OooO00o;
            String str = Oooo0.f43346OooOOOO;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = p480o0o000O.OooOO0.OooO0O0(str, builderNewBuilder, oooO0OO);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = oooO0OO.f46031OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            o00 o00VarOooOo00 = o00Oo0.OooO00o().OooOo00();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o00VarOooOo00.OooO0o(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j);
            BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new OooO0o(j, null), 3, null).start();
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
        }
        return Boxing.boxBoolean(error.getBody() != null);
    }
}
