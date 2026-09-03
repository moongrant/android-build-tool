package p520o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.constants.StatusEnum$MsgSendStatus;
import com.app.base.model.FriendCheckModel;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.model.ImResult;
import com.yalla.yalla.model.GiftPropTypePay;
import java.util.List;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.o0OoOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p168o00Ooo0.oo000o;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p522o0o0O0o.oOO00O;
import p528o0o0OO0O.o000O;
import p528o0o0OO0O.o000OO00;
import p531o0o0OOO0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OOO0o f42810OooO00o = new o0OOO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o0OoOo0 f42811OooO0O0 = new o0OoOo0();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0, 0}, l = {648}, m = "checkIsFriend", n = {"friendCheckModel", "targetId"}, s = {"L$0", "J$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public long f42813Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public FriendCheckModel f42814Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f42815Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f42816OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42815Oooo0oo = obj;
            this.f42816OoooO00 |= Integer.MIN_VALUE;
            return o0OOO0o.this.OooO0OO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {}, l = {46}, m = "checkUserRisk", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42817Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42819Oooo0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42817Oooo0o = obj;
            this.f42819Oooo0oo |= Integer.MIN_VALUE;
            return o0OOO0o.this.OooO0Oo(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {}, l = {663}, m = "sendBlockMessage", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42820Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42822Oooo0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42820Oooo0o = obj;
            this.f42822Oooo0oo |= Integer.MIN_VALUE;
            return o0OOO0o.this.OooO0o0(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {}, l = {669}, m = "sendUnBlockMessage", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42823Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42825Oooo0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42823Oooo0o = obj;
            this.f42825Oooo0oo |= Integer.MIN_VALUE;
            return o0OOO0o.this.OooO0o(0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:40:0x011b  */
    /* JADX WARN: Code duplicated, block: B:41:0x012d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0144  */
    /* JADX WARN: Code duplicated, block: B:46:0x0168  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO00o(o0OOO0o o0ooo0o2, ChatMessage chatMessage, Boolean bool, Continuation continuation) throws InvalidProtocolBufferException, BadPaddingException, IllegalBlockSizeException {
        o000OOo o000ooo2;
        ImResult imResult;
        boolean z;
        MessageIM.SendGiftReply from;
        Objects.requireNonNull(o0ooo0o2);
        if (continuation instanceof o000OOo) {
            o000ooo2 = (o000OOo) continuation;
            int i = o000ooo2.f42641Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000ooo2.f42641Oooo = i - Integer.MIN_VALUE;
            } else {
                o000ooo2 = new o000OOo(o0ooo0o2, continuation);
            }
        } else {
            o000ooo2 = new o000OOo(o0ooo0o2, continuation);
        }
        Object objOooO0O0 = o000ooo2.f42643Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000ooo2.f42641Oooo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                    long targetId = chatMessage.getTargetId();
                    long giftId = giftInfo.getGiftId();
                    int giftNumber = giftInfo.getGiftNumber();
                    o000ooo2.f42642Oooo0o = chatMessage;
                    o000ooo2.f42641Oooo = 1;
                    MessageIM.CustomGiftRequest.Builder mRequestBuilder = MessageIM.CustomGiftRequest.newBuilder();
                    mRequestBuilder.setTargetId(targetId);
                    mRequestBuilder.setGiftId(giftId);
                    mRequestBuilder.setNumber(giftNumber);
                    o00O000 o00o001 = o00O000.f43398OooO00o;
                    o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
                    String str = o0ooOOo.f32224OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
                    objOooO0O0 = o00o001.OooO0O0(str, mRequestBuilder, o000ooo2);
                    if (objOooO0O0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    imResult = (ImResult) objOooO0O0;
                    if (imResult.getBody() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        from = MessageIM.SendGiftReply.parseFrom(imResult.getBody());
                        if (from != null) {
                            oo0O.OooO00o.OooO00o().OooO00o(from.getTime());
                            if (from.getType() == GiftPropTypePay.Coin.getValue()) {
                                OooOOO.f41216OooO00o.OooO0OO().postValue(Boxing.boxLong(from.getBalance()));
                            } else {
                                OooOOO.f41216OooO00o.OooO0o().postValue(Boxing.boxLong(from.getBalance()));
                            }
                            if (from.getLuckyFlag() == 1) {
                                LiveEventBus.get("EVENTMSG_PRIVATE_LUCKY_GIFT").post(from);
                            }
                            o0O00000.OooO0o0("Message_send_success", String.valueOf(oo000o.OooO0O0()));
                            f42810OooO00o.OooO0oO(chatMessage.getMid(), true);
                            return Boxing.boxBoolean(true);
                        }
                    } else {
                        o000O error = new o000O(imResult.getCode());
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
                    }
                    f42810OooO00o.OooO0oO(chatMessage.getMid(), false);
                } else {
                    long targetId2 = chatMessage.getTargetId();
                    int giftId2 = giftInfo.getGiftId();
                    int giftNumber2 = giftInfo.getGiftNumber();
                    OooOOO oooOOO = OooOOO.f41216OooO00o;
                    String strValueOf = String.valueOf(oooOOO.OooOoO().getValue());
                    String strValueOf2 = String.valueOf(oooOOO.OooO0oo().getValue());
                    Integer value = oooOOO.OooOOOO().getValue();
                    if (value == null) {
                        value = Boxing.boxInt(0);
                    }
                    int iIntValue = value.intValue();
                    o000ooo2.f42642Oooo0o = chatMessage;
                    o000ooo2.f42641Oooo = 2;
                    MessageIM.SendGiftRequest.Builder mRequestBuilder2 = MessageIM.SendGiftRequest.newBuilder();
                    mRequestBuilder2.setToId(targetId2);
                    mRequestBuilder2.setGiftId(giftId2);
                    mRequestBuilder2.setNumber(giftNumber2);
                    mRequestBuilder2.setNickname(strValueOf);
                    mRequestBuilder2.setHeadphoto(strValueOf2);
                    mRequestBuilder2.setRole(iIntValue);
                    o00O000 o00o002 = o00O000.f43398OooO00o;
                    o0ooOOo o0ooooo3 = o0ooOOo.f32218OooO00o;
                    String str2 = o0ooOOo.f32222OooO0o;
                    Intrinsics.checkNotNullExpressionValue(mRequestBuilder2, "mRequestBuilder");
                    objOooO0O0 = o00o002.OooO0O0(str2, mRequestBuilder2, o000ooo2);
                    if (objOooO0O0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    imResult = (ImResult) objOooO0O0;
                    if (imResult.getBody() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        from = MessageIM.SendGiftReply.parseFrom(imResult.getBody());
                        if (from != null) {
                            oo0O.OooO00o.OooO00o().OooO00o(from.getTime());
                            if (from.getType() == GiftPropTypePay.Coin.getValue()) {
                                OooOOO.f41216OooO00o.OooO0OO().postValue(Boxing.boxLong(from.getBalance()));
                            } else {
                                OooOOO.f41216OooO00o.OooO0o().postValue(Boxing.boxLong(from.getBalance()));
                            }
                            if (from.getLuckyFlag() == 1) {
                                LiveEventBus.get("EVENTMSG_PRIVATE_LUCKY_GIFT").post(from);
                            }
                            o0O00000.OooO0o0("Message_send_success", String.valueOf(oo000o.OooO0O0()));
                            f42810OooO00o.OooO0oO(chatMessage.getMid(), true);
                            return Boxing.boxBoolean(true);
                        }
                    } else {
                        o000O error2 = new o000O(imResult.getCode());
                        Intrinsics.checkNotNullParameter(error2, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error2, null), 3, null);
                    }
                    f42810OooO00o.OooO0oO(chatMessage.getMid(), false);
                }
            }
        } else if (i2 == 1) {
            chatMessage = o000ooo2.f42642Oooo0o;
            ResultKt.throwOnFailure(objOooO0O0);
            imResult = (ImResult) objOooO0O0;
            if (imResult.getBody() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                from = MessageIM.SendGiftReply.parseFrom(imResult.getBody());
                if (from != null) {
                    oo0O.OooO00o.OooO00o().OooO00o(from.getTime());
                    if (from.getType() == GiftPropTypePay.Coin.getValue()) {
                        OooOOO.f41216OooO00o.OooO0OO().postValue(Boxing.boxLong(from.getBalance()));
                    } else {
                        OooOOO.f41216OooO00o.OooO0o().postValue(Boxing.boxLong(from.getBalance()));
                    }
                    if (from.getLuckyFlag() == 1) {
                        LiveEventBus.get("EVENTMSG_PRIVATE_LUCKY_GIFT").post(from);
                    }
                    o0O00000.OooO0o0("Message_send_success", String.valueOf(oo000o.OooO0O0()));
                    f42810OooO00o.OooO0oO(chatMessage.getMid(), true);
                    return Boxing.boxBoolean(true);
                }
            } else {
                o000O error3 = new o000O(imResult.getCode());
                Intrinsics.checkNotNullParameter(error3, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error3, null), 3, null);
            }
            f42810OooO00o.OooO0oO(chatMessage.getMid(), false);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chatMessage = o000ooo2.f42642Oooo0o;
            ResultKt.throwOnFailure(objOooO0O0);
            imResult = (ImResult) objOooO0O0;
            if (imResult.getBody() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                from = MessageIM.SendGiftReply.parseFrom(imResult.getBody());
                if (from != null) {
                    oo0O.OooO00o.OooO00o().OooO00o(from.getTime());
                    if (from.getType() == GiftPropTypePay.Coin.getValue()) {
                        OooOOO.f41216OooO00o.OooO0OO().postValue(Boxing.boxLong(from.getBalance()));
                    } else {
                        OooOOO.f41216OooO00o.OooO0o().postValue(Boxing.boxLong(from.getBalance()));
                    }
                    if (from.getLuckyFlag() == 1) {
                        LiveEventBus.get("EVENTMSG_PRIVATE_LUCKY_GIFT").post(from);
                    }
                    o0O00000.OooO0o0("Message_send_success", String.valueOf(oo000o.OooO0O0()));
                    f42810OooO00o.OooO0oO(chatMessage.getMid(), true);
                    return Boxing.boxBoolean(true);
                }
            } else {
                o000O error4 = new o000O(imResult.getCode());
                Intrinsics.checkNotNullParameter(error4, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error4, null), 3, null);
            }
            f42810OooO00o.OooO0oO(chatMessage.getMid(), false);
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object OooO0O0(o0OOO0o o0ooo0o2, ChatMessage chatMessage, Continuation continuation) throws InvalidProtocolBufferException, BadPaddingException, IllegalBlockSizeException {
        o000000 o000000Var;
        ChatMessage chatMessage2;
        Objects.requireNonNull(o0ooo0o2);
        if (continuation instanceof o000000) {
            o000000Var = (o000000) continuation;
            int i = o000000Var.f42342Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000000Var.f42342Oooo = i - Integer.MIN_VALUE;
            } else {
                o000000Var = new o000000(o0ooo0o2, continuation);
            }
        } else {
            o000000Var = new o000000(o0ooo0o2, continuation);
        }
        Object objOooO0O0 = o000000Var.f42344Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000000Var.f42342Oooo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            if (giftInfo != null) {
                long targetId = chatMessage.getTargetId();
                int giftId = giftInfo.getGiftId();
                int giftNumber = giftInfo.getGiftNumber();
                o000000Var.f42343Oooo0o = chatMessage;
                o000000Var.f42342Oooo = 1;
                MessageIM.BlindBoxGiftRequest.Builder mRequestBuilder = MessageIM.BlindBoxGiftRequest.newBuilder();
                mRequestBuilder.setNum(giftNumber);
                mRequestBuilder.setGiftId(giftId);
                mRequestBuilder.setTargetId(targetId);
                o00O000 o00o001 = o00O000.f43398OooO00o;
                o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
                String str = o0ooOOo.f32225OooO0oo;
                Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
                objOooO0O0 = o00o001.OooO0O0(str, mRequestBuilder, o000000Var);
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
        chatMessage2 = o000000Var.f42343Oooo0o;
        ResultKt.throwOnFailure(objOooO0O0);
        ImResult imResult = (ImResult) objOooO0O0;
        if (imResult.getBody() != null) {
            MessageIM.BlindBoxGiftReply from = MessageIM.BlindBoxGiftReply.parseFrom(imResult.getBody());
            if (from != null) {
                oo0O.OooO00o.OooO00o().OooO00o(from.getTime());
                OooOOO.f41216OooO00o.OooO0OO().postValue(Boxing.boxLong(from.getBalance()));
                List<MessageIM.GiftIdUrl> giftsList = from.getGiftsList();
                if (giftsList != null) {
                    Intrinsics.checkNotNullExpressionValue(giftsList, "giftsList");
                    for (MessageIM.GiftIdUrl giftIdUrl : giftsList) {
                        ChatMessage.GiftInfo giftInfo2 = chatMessage2.getGiftInfo();
                        if (giftInfo2 != null) {
                            OooOOO oooOOO = OooOOO.f42227OooO00o;
                            long targetId2 = chatMessage2.getTargetId();
                            int iOooO0o0 = oOO00O.OooO0o0(Boxing.boxLong(giftIdUrl.getGiftId()));
                            String giftUrl = giftIdUrl.getGiftUrl();
                            Intrinsics.checkNotNullExpressionValue(giftUrl, "giftIdUrl.giftUrl");
                            ChatMessage chatMessageOooOO0O = OooOOO.OooOO0O(targetId2, iOooO0o0, 1, giftUrl, null, 0L, false, oOO00O.OooO0OO(giftInfo2.getIsGiftBlind()), false, 368);
                            oooOOO.OooO0oO(chatMessageOooOO0O);
                            f42810OooO00o.OooO0oO(chatMessageOooOO0O.getMid(), true);
                        }
                    }
                }
                o0O00000.OooO0o0("Message_send_success", String.valueOf(oo000o.OooO0O0()));
                f42810OooO00o.OooO0oO(chatMessage2.getMid(), true);
                return Boxing.boxBoolean(true);
            }
        } else {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
        }
        f42810OooO00o.OooO0oO(chatMessage2.getMid(), false);
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(long j, @NotNull Continuation<? super FriendCheckModel> continuation) {
        OooO00o oooO00o;
        FriendCheckModel friendCheckModel;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f42816OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f42816OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f42815Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f42816OoooO00;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            FriendCheckModel friendCheckModel2 = new FriendCheckModel();
            oooO00o.f42814Oooo0oO = friendCheckModel2;
            oooO00o.f42813Oooo0o = j;
            oooO00o.f42816OoooO00 = 1;
            MessageIM.FriendCheckRequest.Builder mRequestBuilder = MessageIM.FriendCheckRequest.newBuilder();
            mRequestBuilder.setTarget(j);
            o00O000 o00o001 = o00O000.f43398OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32229OooOOO;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            Object objOooO0O0 = o00o001.OooO0O0(str, mRequestBuilder, oooO00o);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            friendCheckModel = friendCheckModel2;
            obj = objOooO0O0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = oooO00o.f42813Oooo0o;
            friendCheckModel = oooO00o.f42814Oooo0oO;
            ResultKt.throwOnFailure(obj);
        }
        ImResult imResult = (ImResult) obj;
        if (imResult.getBody() != null) {
            MessageIM.FriendCheckReply from = MessageIM.FriendCheckReply.parseFrom(imResult.getBody());
            if (from != null) {
                friendCheckModel.isFriend = from.getIsFriend();
                friendCheckModel.isBlack = from.getIsBlock();
                friendCheckModel.isVerify = from.getIsVerify();
                friendCheckModel.userId = String.valueOf(j);
            }
        } else {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
        }
        return friendCheckModel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0Oo(long j, @NotNull Continuation<? super Boolean> continuation) throws InvalidProtocolBufferException, BadPaddingException, IllegalBlockSizeException {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f42819Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f42819Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0O0 = oooO0O0.f42817Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f42819Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO0O0.f42819Oooo0oo = 1;
            MessageIM.UserRiskIn.Builder mRequestBuilder = MessageIM.UserRiskIn.newBuilder();
            mRequestBuilder.setTarget(j);
            o00O000 o00o001 = o00O000.f43398OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32238OooOo00;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            objOooO0O0 = o00o001.OooO0O0(str, mRequestBuilder, oooO0O0);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult imResult = (ImResult) objOooO0O0;
        if (imResult.getBody() != null) {
            MessageIM.UserRiskOut from = MessageIM.UserRiskOut.parseFrom(imResult.getBody());
            if (from != null) {
                return Boxing.boxBoolean(from.getLevel() == 1);
            }
        } else {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o(long j, @NotNull Continuation<? super Boolean> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f42825Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f42825Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objOooO0O0 = oooO0o.f42823Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f42825Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO0o.f42825Oooo0oo = 1;
            MessageIM.FriendUnblockRequest.Builder mRequestBuilder = MessageIM.FriendUnblockRequest.newBuilder();
            mRequestBuilder.setTarget(j);
            o00O000 o00o001 = o00O000.f43398OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32232OooOOOo;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            objOooO0O0 = o00o001.OooO0O0(str, mRequestBuilder, oooO0o);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult imResult = (ImResult) objOooO0O0;
        if (imResult.getBody() == null) {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
        }
        return Boxing.boxBoolean(imResult.getBody() != null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o0(long j, @NotNull Continuation<? super Boolean> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f42822Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f42822Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objOooO0O0 = oooO0OO.f42820Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f42822Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            oooO0OO.f42822Oooo0oo = 1;
            MessageIM.FriendBlockRequest.Builder mRequestBuilder = MessageIM.FriendBlockRequest.newBuilder();
            mRequestBuilder.setTarget(j);
            o00O000 o00o001 = o00O000.f43398OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32231OooOOOO;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            objOooO0O0 = o00o001.OooO0O0(str, mRequestBuilder, oooO0OO);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ImResult imResult = (ImResult) objOooO0O0;
        if (imResult.getBody() == null) {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
        }
        return Boxing.boxBoolean(imResult.getBody() != null);
    }

    public final void OooO0oO(String mid, boolean z) {
        if (z) {
            StatusEnum$MsgSendStatus state = StatusEnum$MsgSendStatus.SUCCESS;
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(state, "state");
            p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooO0O0(mid, state.OooO00o());
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(state, "state");
            p491o0o00O00.OooO0OO.OooO00o().OooOOoo().OooO0O0(mid, state.OooO00o());
            return;
        }
        StatusEnum$MsgSendStatus state2 = StatusEnum$MsgSendStatus.FAIL;
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(state2, "state");
        p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooO0O0(mid, state2.OooO00o());
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(state2, "state");
        p491o0o00O00.OooO0OO.OooO00o().OooOOoo().OooO0O0(mid, state2.OooO00o());
    }
}
