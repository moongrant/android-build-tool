package p406o0Oo0Ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p377o0OOoOo.o0000O;
import p385o0OOooOO.oOO00O;
import p403o0Oo0OOo.o0O0O0o0;
import p464o0Oooo.o000000O;
import p471o0Ooooo.o0O00OO;
import p542o0o0o00O.o000oOoO;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nImMessageRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImMessageRepo.kt\ncom/yalla/yalla/data/repository/ImMessageRepo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,824:1\n1855#2,2:825\n*S KotlinDebug\n*F\n+ 1 ImMessageRepo.kt\ncom/yalla/yalla/data/repository/ImMessageRepo\n*L\n268#1:825,2\n*E\n"})
public final class oOOO00Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOOO00Oo f44992OooO00o = new oOOO00Oo();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0}, l = {772}, m = "sendUnBlockMessage", n = {"targetId"}, s = {"J$0"})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f44993OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f44995OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f44996OooO0oO;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44995OooO0o0 = obj;
            this.f44996OooO0oO |= Integer.MIN_VALUE;
            return oOOO00Oo.this.OooO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0, 0}, l = {746}, m = "checkIsFriend", n = {"friendCheckModel", "targetId"}, s = {"L$0", "J$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f44997OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f44998OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public FriendCheckModel f44999OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f45001OooO0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44998OooO0o = obj;
            this.f45001OooO0oo |= Integer.MIN_VALUE;
            return oOOO00Oo.this.OooO0o(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {}, l = {51}, m = "checkUserRisk", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f45002OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f45003OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45002OooO0Oo = obj;
            this.f45003OooO0o |= Integer.MIN_VALUE;
            return oOOO00Oo.this.OooO0oO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0}, l = {761}, m = "sendBlockMessage", n = {"targetId"}, s = {"J$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f45005OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f45007OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f45008OooO0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45007OooO0o0 = obj;
            this.f45008OooO0oO |= Integer.MIN_VALUE;
            return oOOO00Oo.this.OooO0oo(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendBlockMessage$2", f = "ImMessageRepo.kt", i = {}, l = {764}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<UserInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f45009OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f45010OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f45010OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f45010OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45009OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
                this.f45009OooO0Oo = 1;
                obj = userInfoRepo.OooO0oo(this.f45010OooO0o0, this);
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
        public int f45011OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f45012OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f45012OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f45012OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f45011OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
                this.f45011OooO0Oo = 1;
                obj = userInfoRepo.OooO0oo(this.f45012OooO0o0, this);
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
    public static final Object OooO00o(oOOO00Oo oooo00oo, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        oOOOoo00 oooooo00;
        oooo00oo.getClass();
        if (continuation instanceof oOOOoo00) {
            oooooo00 = (oOOOoo00) continuation;
            int i = oooooo00.f45030OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooooo00.f45030OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooooo00 = new oOOOoo00(oooo00oo, continuation);
            }
        } else {
            oooooo00 = new oOOOoo00(oooo00oo, continuation);
        }
        Object objOooO0O0 = oooooo00.f45029OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooooo00.f45030OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                int giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                String strValueOf = String.valueOf(o000000O.OooOOoo().getValue());
                String strValueOf2 = String.valueOf(o000000O.OooO().getValue());
                Integer numBoxInt = (Integer) ((MutableLiveData) o000000O.f46695OooOo0O.getValue()).getValue();
                if (numBoxInt == null) {
                    numBoxInt = Boxing.boxInt(0);
                }
                int iIntValue = numBoxInt.intValue();
                oooooo00.f45027OooO0Oo = chatMessage;
                oooooo00.f45030OooO0oO = 1;
                MessageIM.SendGiftRequest.Builder mRequestBuilder = MessageIM.SendGiftRequest.newBuilder();
                mRequestBuilder.setToId(targetId);
                mRequestBuilder.setGiftId(giftId);
                mRequestBuilder.setNumber(giftNumber);
                mRequestBuilder.setNickname(strValueOf);
                mRequestBuilder.setHeadphoto(strValueOf2);
                mRequestBuilder.setRole(iIntValue);
                o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
                String str = o0000O.f44079OooO0o0;
                Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
                objOooO0O0 = o000oOoO.OooO0O0(str, mRequestBuilder, oooooo00);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chatMessage = oooooo00.f45027OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            o0OO000.OooO00o("104030");
            MessageIM.SendGiftReply from = MessageIM.SendGiftReply.parseFrom(error.getBody());
            if (from != null) {
                o0O.OooO0O0.OooO0Oo().OooO00o(from.getTime());
                if (from.getType() == GiftPropTypePay.Coin.getValue()) {
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    o000000O.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
                } else {
                    o000000O o000000o4 = o000000O.f46674OooO00o;
                    o000000O.OooO0Oo().postValue(Boxing.boxLong(from.getBalance()));
                }
                if (from.getLuckyFlag() == 1) {
                    LiveEventBus.get("EVENTMSG_PRIVATE_LUCKY_GIFT").post(from);
                }
                o0OO000.OooO0O0("204011", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                OooOO0(chatMessage.getMid(), true);
                return Boxing.boxBoolean(true);
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
        }
        OooOO0(chatMessage.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO0O0(oOOO00Oo oooo00oo, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        oOOOOo0O oooooo0o;
        oooo00oo.getClass();
        if (continuation instanceof oOOOOo0O) {
            oooooo0o = (oOOOOo0O) continuation;
            int i = oooooo0o.f45026OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooooo0o.f45026OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooooo0o = new oOOOOo0O(oooo00oo, continuation);
            }
        } else {
            oooooo0o = new oOOOOo0O(oooo00oo, continuation);
        }
        Object objOooO0O0 = oooooo0o.f45025OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooooo0o.f45026OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                int giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                oooooo0o.f45023OooO0Oo = chatMessage;
                oooooo0o.f45026OooO0oO = 1;
                MessageIM.BackpackGiftRequest.Builder mRequestBuilder = MessageIM.BackpackGiftRequest.newBuilder();
                mRequestBuilder.setNum(giftNumber);
                mRequestBuilder.setGiftId(giftId);
                mRequestBuilder.setTargetId(targetId);
                o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
                String str = o0000O.f44081OooO0oo;
                Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
                objOooO0O0 = o000oOoO.OooO0O0(str, mRequestBuilder, oooooo0o);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chatMessage = oooooo0o.f45023OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        int code = error.getCode();
        if (code == 200) {
            MessageIM.BackpackGiftReply from = MessageIM.BackpackGiftReply.parseFrom(error.getBody());
            if (from != null) {
                MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
                oOO00O.OooO0o((int) from.getGiftId(), from.getRemainingNum(), from.getMinExpirationTime());
            }
            o0OO000.OooO0O0("204011", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
            OooOO0(chatMessage.getMid(), true);
            return Boxing.boxBoolean(true);
        }
        switch (code) {
            case 657:
                MessageIM.BackpackGiftReply from2 = MessageIM.BackpackGiftReply.parseFrom(error.getBody());
                if (from2 != null) {
                    MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = oOO00O.f44351OooO00o;
                    oOO00O.OooO0o((int) from2.getGiftId(), from2.getRemainingNum(), from2.getMinExpirationTime());
                    o000O00O.OooO0O0(o0000.OooO0OO(from2.getRemainingNum() > 0 ? oO00OOo0.Some_gifts_have_expired : oO00OOo0.The_gift_has_expired));
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
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
                OooOO0(chatMessage.getMid(), false);
                break;
        }
        OooOO0(chatMessage.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object OooO0OO(oOOO00Oo oooo00oo, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        oOOo0000 oooo0000;
        ChatMessage chatMessage2;
        oooo00oo.getClass();
        if (continuation instanceof oOOo0000) {
            oooo0000 = (oOOo0000) continuation;
            int i = oooo0000.f45034OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0000.f45034OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooo0000 = new oOOo0000(oooo00oo, continuation);
            }
        } else {
            oooo0000 = new oOOo0000(oooo00oo, continuation);
        }
        Object objOooO0O0 = oooo0000.f45033OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo0000.f45034OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                int giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                oooo0000.f45031OooO0Oo = chatMessage;
                oooo0000.f45034OooO0oO = 1;
                MessageIM.BlindBoxGiftRequest.Builder mRequestBuilder = MessageIM.BlindBoxGiftRequest.newBuilder();
                mRequestBuilder.setNum(giftNumber);
                mRequestBuilder.setGiftId(giftId);
                mRequestBuilder.setTargetId(targetId);
                o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
                String str = o0000O.f44080OooO0oO;
                Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
                objOooO0O0 = o000oOoO.OooO0O0(str, mRequestBuilder, oooo0000);
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
        chatMessage2 = oooo0000.f45031OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            MessageIM.BlindBoxGiftReply from = MessageIM.BlindBoxGiftReply.parseFrom(error.getBody());
            if (from != null) {
                o0O.OooO0O0.OooO0Oo().OooO00o(from.getTime());
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o000000O.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
                List<MessageIM.GiftIdUrl> giftsList = from.getGiftsList();
                if (giftsList != null) {
                    Intrinsics.checkNotNullExpressionValue(giftsList, "giftsList");
                    for (MessageIM.GiftIdUrl giftIdUrl : giftsList) {
                        ChatMessage.GiftInfo giftInfo2 = chatMessage2.getGiftInfo();
                        if (giftInfo2 != null) {
                            long targetId2 = chatMessage2.getTargetId();
                            int iOooO0oO = o0OoOo0.OooO0oO(Boxing.boxLong(giftIdUrl.getGiftId()));
                            String giftUrl = giftIdUrl.getGiftUrl();
                            Intrinsics.checkNotNullExpressionValue(giftUrl, "giftIdUrl.giftUrl");
                            ChatMessage chatMessageOooOO0O = oOO0O000.OooOO0O(targetId2, iOooO0oO, 1, giftUrl, null, 0L, false, o0OoOo0.OooO00o(giftInfo2.getIsGiftBlind()), false, false, false, 1648);
                            oOO0O000.OooO0oO(chatMessageOooOO0O);
                            OooOO0(chatMessageOooOO0O.getMid(), true);
                        }
                    }
                }
                o0OO000.OooO0O0("204011", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                OooOO0(chatMessage2.getMid(), true);
                return Boxing.boxBoolean(true);
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
        }
        OooOO0(chatMessage2.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO0Oo(oOOO00Oo oooo00oo, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException {
        oOOo0O00 oooo0o00;
        oooo00oo.getClass();
        if (continuation instanceof oOOo0O00) {
            oooo0o00 = (oOOo0O00) continuation;
            int i = oooo0o00.f45038OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo0o00.f45038OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooo0o00 = new oOOo0O00(oooo00oo, continuation);
            }
        } else {
            oooo0o00 = new oOOo0O00(oooo00oo, continuation);
        }
        Object objOooO0O0 = oooo0o00.f45037OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo0o00.f45038OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                long giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                oooo0o00.f45035OooO0Oo = chatMessage;
                oooo0o00.f45038OooO0oO = 1;
                MessageIM.CustomGiftRequest.Builder mRequestBuilder = MessageIM.CustomGiftRequest.newBuilder();
                mRequestBuilder.setTargetId(targetId);
                mRequestBuilder.setGiftId(giftId);
                mRequestBuilder.setNumber(giftNumber);
                o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
                String str = o0000O.f44078OooO0o;
                Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
                objOooO0O0 = o000oOoO.OooO0O0(str, mRequestBuilder, oooo0o00);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        chatMessage = oooo0o00.f45035OooO0Oo;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            MessageIM.CustomGiftReply from = MessageIM.CustomGiftReply.parseFrom(error.getBody());
            if (from != null) {
                o0O.OooO0O0.OooO0Oo().OooO00o(from.getTime());
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o000000O.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
                o0OO000.OooO0O0("204011", MapsKt.mapOf(new Pair("region", String.valueOf(p591o0oo000O.OooO.OooO0OO()))));
                OooOO0(chatMessage.getMid(), true);
                return Boxing.boxBoolean(true);
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
        }
        OooOO0(chatMessage.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    public static void OooOO0(String mid, boolean z) {
        if (z) {
            StatusEnum$MsgSendStatus state = StatusEnum$MsgSendStatus.SUCCESS;
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(state, "state");
            o000OOo.OooO00o().OooOOOo().OooO0o0(state.OooO00o(), mid);
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(state, "state");
            o000OOo.OooO00o().OooOOo0().OooO0o0(state.OooO00o(), mid);
            return;
        }
        StatusEnum$MsgSendStatus state2 = StatusEnum$MsgSendStatus.FAIL;
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(state2, "state");
        o000OOo.OooO00o().OooOOOo().OooO0o0(state2.OooO00o(), mid);
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(state2, "state");
        o000OOo.OooO00o().OooOOo0().OooO0o0(state2.OooO00o(), mid);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO(long j, @NotNull Continuation<? super Boolean> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f44996OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f44996OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objOooO0O0 = oooO.f44995OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f44996OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO.f44993OooO0Oo = j;
            oooO.f44996OooO0oO = 1;
            MessageIM.FriendUnblockRequest.Builder mRequestBuilder = MessageIM.FriendUnblockRequest.newBuilder();
            mRequestBuilder.setTarget(j);
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44088OooOOOo;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            objOooO0O0 = o000oOoO.OooO0O0(str, mRequestBuilder, oooO);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = oooO.f44993OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new OooOO0(j, null), 3, null).start();
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
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
            int i = oooO00o.f45001OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f45001OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f44998OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f45001OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            FriendCheckModel friendCheckModel2 = new FriendCheckModel();
            oooO00o.f44999OooO0o0 = friendCheckModel2;
            oooO00o.f44997OooO0Oo = j;
            oooO00o.f45001OooO0oo = 1;
            MessageIM.FriendCheckRequest.Builder mRequestBuilder = MessageIM.FriendCheckRequest.newBuilder();
            mRequestBuilder.setTarget(j);
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44085OooOOO;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            Object objOooO0O0 = o000oOoO.OooO0O0(str, mRequestBuilder, oooO00o);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            friendCheckModel = friendCheckModel2;
            obj = objOooO0O0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = oooO00o.f44997OooO0Oo;
            friendCheckModel = oooO00o.f44999OooO0o0;
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
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
        }
        return friendCheckModel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object OooO0o0(long j, boolean z, @NotNull Continuation continuation) {
        oOO ooo;
        long j2 = j;
        boolean z2 = z;
        if (continuation instanceof oOO) {
            ooo = (oOO) continuation;
            int i = ooo.f44916OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                ooo.f44916OooO0oo = i - Integer.MIN_VALUE;
            } else {
                ooo = new oOO(this, continuation);
            }
        } else {
            ooo = new oOO(this, continuation);
        }
        Object objOooO0O0 = ooo.f44913OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = ooo.f44916OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            UserInfoRepo.f23204OooO00o.getClass();
            UserInfo userInfoOooO0Oo = UserInfoRepo.OooO0Oo(j);
            String userName = userInfoOooO0Oo != null ? userInfoOooO0Oo.getUserName() : null;
            String userHeader = userInfoOooO0Oo != null ? userInfoOooO0Oo.getUserHeader() : null;
            ooo.f44912OooO0Oo = z2;
            ooo.f44914OooO0o0 = j2;
            ooo.f44916OooO0oo = 1;
            MessageIM.FriendApplyRequest.Builder mRequestBuilder = MessageIM.FriendApplyRequest.newBuilder();
            mRequestBuilder.setFromId(j2);
            mRequestBuilder.setResult(z2 ? 1 : 0);
            if (userName == null) {
                userName = "";
            }
            mRequestBuilder.setNickname(userName);
            if (userHeader == null) {
                userHeader = "";
            }
            mRequestBuilder.setHeadphoto(userHeader);
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44086OooOOO0;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            objOooO0O0 = o000oOoO.OooO0O0(str, mRequestBuilder, ooo);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = ooo.f44914OooO0o0;
            z2 = ooo.f44912OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult error = (ImResult) objOooO0O0;
        if (!error.isSuccess()) {
            if (error.getCode() == 630) {
                o0O0O0o0 o0o0o0o0OooOOoo = o000OOo.OooO00o().OooOOoo();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o0o0o0o0OooOOoo.OooOO0O(3, ((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), j2);
            }
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
            return Boxing.boxBoolean(false);
        }
        int i3 = z2 ? 1 : 2;
        o0O0O0o0 o0o0o0o0OooOOoo2 = o000OOo.OooO00o().OooOOoo();
        o000000O o000000o3 = o000000O.f46674OooO00o;
        o0o0o0o0OooOOoo2.OooOO0O(i3, ((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), j2);
        if (z2) {
            GlobalScope globalScope = GlobalScope.INSTANCE;
            BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new oOOO000o(j2, null), 3, null).start();
            BuildersKt__Builders_commonKt.async$default(globalScope, null, null, new oOOO00(j2, null), 3, null).start();
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oO(long j, @NotNull Continuation<? super Boolean> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f45003OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f45003OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0O0 = oooO0O0.f45002OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f45003OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO0O0.f45003OooO0o = 1;
            MessageIM.UserRiskIn.Builder mRequestBuilder = MessageIM.UserRiskIn.newBuilder();
            mRequestBuilder.setTarget(j);
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44094OooOo00;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            objOooO0O0 = o000oOoO.OooO0O0(str, mRequestBuilder, oooO0O0);
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
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oo(long j, @NotNull Continuation<? super Boolean> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f45008OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f45008OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objOooO0O0 = oooO0OO.f45007OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f45008OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO0OO.f45005OooO0Oo = j;
            oooO0OO.f45008OooO0oO = 1;
            MessageIM.FriendBlockRequest.Builder mRequestBuilder = MessageIM.FriendBlockRequest.newBuilder();
            mRequestBuilder.setTarget(j);
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44087OooOOOO;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            objOooO0O0 = o000oOoO.OooO0O0(str, mRequestBuilder, oooO0OO);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = oooO0OO.f45005OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult error = (ImResult) objOooO0O0;
        if (error.isSuccess()) {
            o0O0O0o0 o0o0o0o0OooOOoo = o000OOo.OooO00o().OooOOoo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o0o0o0o0OooOOoo.OooO0o(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), j);
            BuildersKt__Builders_commonKt.async$default(GlobalScope.INSTANCE, null, null, new OooO0o(j, null), 3, null).start();
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
        }
        return Boxing.boxBoolean(error.getBody() != null);
    }
}
