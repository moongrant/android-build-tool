package p522o0o0O0O0;

import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.constants.StatusEnum$MsgSendStatus;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.ToastUtil;
import com.facebook.internal.ServerProtocol;
import com.google.protobuf.InvalidProtocolBufferException;
import com.umeng.analytics.pro.i;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.api.service.MainApiService;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentToShareFriend;
import com.yalla.yalla.model.RoomThemeAccept;
import com.yalla.yalla.model.RoomThemeGiveState;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o0o0000.OooOOOO;
import org.conscrypt.NativeConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p108o000ooO0.o00Oo0;
import p190o00o00oO.oo0o0Oo;
import p255o00ooO0O.o000O0O0;
import p492o0o00O0.OooOOO;
import p500o0o00Oo0.o00O00o0;
import p517o0o0O00.o00O00;
import p518o0o0O000.o0OOO0o;
import p528o0o0OO.OooOO0O;
import p529o0o0OO0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 extends o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo00 f42259OooO00o = new OooOo00();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ChatMessageRepo", f = "ChatMessageRepo.kt", i = {0}, l = {796}, m = "analysisUnknownMessage", n = {"chatMsgProcessor"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public OooOO0O f42260Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f42262OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f42263OoooO0O;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42262OoooO00 = obj;
            this.f42263OoooO0O |= Integer.MIN_VALUE;
            return OooOo00.this.OooO00o(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ChatMessageRepo", f = "ChatMessageRepo.kt", i = {0}, l = {735}, m = "getRoomThemeAccept", n = {"mid"}, s = {"L$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public String f42264Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f42266OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f42267OoooO0O;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42266OoooO00 = obj;
            this.f42267OoooO0O |= Integer.MIN_VALUE;
            return OooOo00.this.OooO0Oo(0L, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ChatMessageRepo$getRoomThemeAccept$2$1$2", f = "ChatMessageRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ ApiResult<RoomThemeAccept> f42268Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f42269OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ApiResult<RoomThemeAccept> apiResult, String str, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f42268Oooo = apiResult;
            this.f42269OoooO00 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f42268Oooo, this.f42269OoooO00, continuation);
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
            int code2 = this.f42268Oooo.getError().getCode();
            if (code2 == 1062) {
                ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.message_accept_failed_not_friend));
            } else if (code2 != 1202) {
                switch (code2) {
                    case i.b /* 2050 */:
                        ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.message_room_theme_you_has_it));
                        break;
                    case 2051:
                        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0o(this.f42269OoooO00, ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReceived.getValue());
                        break;
                    case NativeConstants.SSL_SIGN_RSA_PSS_RSAE_SHA256 /* 2052 */:
                        ToastUtil.f12582OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.message_theme_has_invalid));
                        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0o(this.f42269OoooO00, ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasExpired.getValue());
                        break;
                    default:
                        ApiError error = this.f42268Oooo.getError();
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                        break;
                }
            } else {
                oo0o0Oo.OooO0O0(CommonError.Create_Room_Tips, null, 2, null, CommonErrorHandler.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ChatMessageRepo", f = "ChatMessageRepo.kt", i = {0, 0}, l = {720}, m = "getRoomThemeGiveState", n = {"mid", ServerProtocol.DIALOG_PARAM_STATE}, s = {"L$0", "I$0"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public String f42270Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f42271OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public /* synthetic */ Object f42272OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f42273OoooO00;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42272OoooO0 = obj;
            this.f42271OoooO |= Integer.MIN_VALUE;
            return OooOo00.this.OooO0o0(0L, null, 0, this);
        }
    }

    public static /* synthetic */ ChatMessage OooOO0(long j, int i, String str, String str2, int i2) {
        OooOo00 oooOo00 = f42259OooO00o;
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        return oooOo00.OooO(j, i, str, str2, 0L, false);
    }

    public static ChatMessage OooOO0O(long j, int i, int i2, String giftUrl, String mid, long j2, boolean z, boolean z2, boolean z3, int i3) {
        OooOo00 oooOo00 = f42259OooO00o;
        if ((i3 & 16) != 0) {
            mid = "";
        }
        if ((i3 & 32) != 0) {
            j2 = 0;
        }
        if ((i3 & 64) != 0) {
            z = false;
        }
        if ((i3 & 128) != 0) {
            z2 = false;
        }
        if ((i3 & 256) != 0) {
            z3 = false;
        }
        Intrinsics.checkNotNullParameter(giftUrl, "giftUrl");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.GiftInfo giftInfo = new ChatMessage.GiftInfo();
        giftInfo.setGiftId(i);
        giftInfo.setGiftNumber(i2);
        giftInfo.setGiftUrl(giftUrl);
        giftInfo.setGiftBlind(Boolean.valueOf(z2));
        giftInfo.setGiftCustomMade(Boolean.valueOf(z3));
        ChatMessage chatMessageOooO0O0 = oooOo00.OooO0O0(mid, j, j2, z);
        chatMessageOooO0O0.setGiftInfo(giftInfo);
        chatMessageOooO0O0.setContentType(5);
        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public final ChatMessage OooO(long j, int i, @NotNull String gifUrl, @NotNull String mid, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.GifInfo gifInfo = new ChatMessage.GifInfo();
        gifInfo.setGifId(i);
        gifInfo.setGifUrl(gifUrl);
        ChatMessage chatMessageOooO0O0 = OooO0O0(mid, j, j2, z);
        chatMessageOooO0O0.setGifInfo(gifInfo);
        chatMessageOooO0O0.setContentType(4);
        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super Unit> continuation) throws InvalidProtocolBufferException {
        OooO00o oooO00o;
        OooOO0O oooOO0O;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f42263OoooO0O;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f42263OoooO0O = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f42262OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f42263OoooO0O;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            OooOO0O oooOO0O2 = new OooOO0O();
            OooOOO OooOOo2 = p493o0o00O00.OooO0OO.OooO00o().OooOOo();
            long jLongValue = ((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o)).longValue();
            oooO00o.f42260Oooo = oooOO0O2;
            oooO00o.f42263OoooO0O = 1;
            Object objOooOOO0 = OooOOo2.OooOOO0(jLongValue, oooO00o);
            if (objOooOOO0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooOO0O = oooOO0O2;
            obj = objOooOOO0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOO0O = oooO00o.f42260Oooo;
            ResultKt.throwOnFailure(obj);
        }
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            MessageIM.Message message = MessageIM.Message.parseFrom(Base64.decode(((ChatMessage) it.next()).getUnknownMessage(), 0));
            Intrinsics.checkNotNullExpressionValue(message, "message");
            oooOO0O.OooO0Oo(message, false);
        }
        return Unit.INSTANCE;
    }

    public final ChatMessage OooO0O0(String str, long j, long j2, boolean z) {
        long jCurrentTimeMillis;
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setAcceptMsg(z);
        chatMessage.setTargetId(j);
        chatMessage.setUid(f42259OooO00o.OooO0OO());
        if (j2 <= 0) {
            synchronized (o0OoOo0.f43152OooO00o) {
                jCurrentTimeMillis = System.currentTimeMillis() + oo0O.OooO00o.OooO00o().f53356OooO00o;
            }
            j2 = jCurrentTimeMillis;
        }
        chatMessage.setTime(j2);
        chatMessage.setSendState((z ? StatusEnum$MsgSendStatus.SUCCESS : StatusEnum$MsgSendStatus.ING).OooO00o());
        if (!(str.length() > 0)) {
            str = o0OoOo0.f43152OooO00o.OooO00o(Long.valueOf(j));
        }
        chatMessage.setMid(str);
        return chatMessage;
    }

    public final long OooO0OO() {
        Long value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue();
        if (value == null) {
            return 0L;
        }
        return value.longValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object OooO0Oo(long j, @NotNull String str, @NotNull Continuation<? super ApiResult<RoomThemeAccept>> continuation) {
        OooO0O0 oooO0O0;
        String str2 = str;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f42267OoooO0O;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f42267OoooO0O = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object roomThemeAccept = oooO0O0.f42266OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f42267OoooO0O;
        String str3 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(roomThemeAccept);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooO0O0.f42264Oooo = str2;
                oooO0O0.f42267OoooO0O = 1;
                roomThemeAccept = mainApiServiceOooO0OO.getRoomThemeAccept(j, str2, oooO0O0);
                if (roomThemeAccept == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = oooO0O0.f42264Oooo;
                ResultKt.throwOnFailure(roomThemeAccept);
            }
            ApiResult apiResult = (ApiResult) roomThemeAccept;
            if (!apiResult.isSuccess()) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooO0OO(apiResult, str2, null), 2, null);
                return roomThemeAccept;
            }
            RoomThemeAccept roomThemeAccept2 = (RoomThemeAccept) apiResult.getData();
            if (roomThemeAccept2 == null) {
                return roomThemeAccept;
            }
            OooOo00 oooOo00 = f42259OooO00o;
            oooOo00.OooOoOO(str2, roomThemeAccept2.getStatus());
            oooOo00.OooO0oO(oooOo00.OooO0o(false, str2));
            return roomThemeAccept;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    @NotNull
    public final ChatMessage OooO0o(boolean z, @NotNull String mid) {
        UserInfo userInfoOooO00o;
        Intrinsics.checkNotNullParameter(mid, "mid");
        OooOoOO(mid, ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReceived.getValue());
        ChatMessage chatMessageOooO0O0 = OooO0O0("", 0L, 0L, z);
        ChatMessage chatMessageOooO0oo = p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooO0oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o)).longValue(), mid);
        if (chatMessageOooO0oo != null && (userInfoOooO00o = o00Oo0.OooO00o(chatMessageOooO0oo.getTargetId())) != null) {
            String strOooO0O0 = o00Ooo.f42780OooO00o.OooO0O0(chatMessageOooO0oo.getTargetId(), userInfoOooO00o.getUserName());
            chatMessageOooO0O0.setMessage(z ? OooOo.OooO00o(o000O0O0.OooO0OO(R.string.message_give_theme_successful), strOooO0O0) : OooOo.OooO00o(o000O0O0.OooO0OO(R.string.message_get_theme_successful), strOooO0O0));
            chatMessageOooO0O0.setContentType(0);
            chatMessageOooO0O0.setTargetId(chatMessageOooO0oo.getTargetId());
            chatMessageOooO0O0.setSendState(StatusEnum$MsgSendStatus.SUCCESS.OooO00o());
            p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
        }
        return chatMessageOooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooO0o0(long j, @NotNull String str, int i, @NotNull Continuation<? super ApiResult<RoomThemeGiveState>> continuation) {
        OooO0o oooO0o;
        int i2;
        String str2;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i3 = oooO0o.f42271OoooO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO0o.f42271OoooO = i3 - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object roomThemeGivenInfo = oooO0o.f42272OoooO0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO0o.f42271OoooO;
        String str3 = "";
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(roomThemeGivenInfo);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooO0o.f42270Oooo = str;
                i2 = i;
                oooO0o.f42273OoooO00 = i2;
                oooO0o.f42271OoooO = 1;
                roomThemeGivenInfo = mainApiServiceOooO0OO.getRoomThemeGivenInfo(j, oooO0o);
                if (roomThemeGivenInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = oooO0o.f42273OoooO00;
                str2 = oooO0o.f42270Oooo;
                ResultKt.throwOnFailure(roomThemeGivenInfo);
                i2 = i5;
            }
            ApiResult apiResult = (ApiResult) roomThemeGivenInfo;
            if (!apiResult.isSuccess()) {
                ApiError error = apiResult.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                return roomThemeGivenInfo;
            }
            RoomThemeGiveState roomThemeGiveState = (RoomThemeGiveState) apiResult.getData();
            if (roomThemeGiveState == null || roomThemeGiveState.getStatus() == i2) {
                return roomThemeGivenInfo;
            }
            f42259OooO00o.OooOoOO(str2, roomThemeGiveState.getStatus());
            return roomThemeGivenInfo;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str3 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str3, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    public final void OooO0oO(@NotNull ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
        Long lOooO0OO = p493o0o00O00.OooO0OO.OooO00o().OooOOoo().OooO0OO(chatMessage.getUid(), chatMessage.getTargetId());
        long jLongValue = lOooO0OO != null ? lOooO0OO.longValue() : 0L;
        Conversation conversation = new Conversation();
        conversation.setTargetId(chatMessage.getTargetId());
        conversation.setMid(chatMessage.getMid());
        conversation.setTime(chatMessage.getTime());
        conversation.setUid(chatMessage.getUid());
        conversation.setType(chatMessage.getContentType());
        conversation.setAcceptMsg(chatMessage.getIsAcceptMsg());
        conversation.setSendState((chatMessage.getIsAcceptMsg() || chatMessage.getContentType() == 0) ? StatusEnum$MsgSendStatus.SUCCESS.OooO00o() : StatusEnum$MsgSendStatus.ING.OooO00o());
        conversation.setTopTime(jLongValue > 0 ? jLongValue : 0L);
        int contentType = chatMessage.getContentType();
        if (contentType == 1) {
            conversation.setMessage(StringsKt__StringsJVMKt.replace$default(chatMessage.getMessage(), "''", "'", false, 4, (Object) null));
        } else if (contentType == 2) {
            ChatMessage.VoiceInfo voiceInfo = chatMessage.getVoiceInfo();
            conversation.setVoiceAndUnread(!(voiceInfo != null && voiceInfo.getIsVoiceRead()));
        } else if (contentType == 7) {
            ChatMessage.ShareMomentInfo shareMomentInfo = chatMessage.getShareMomentInfo();
            conversation.setMomentType(shareMomentInfo != null ? shareMomentInfo.getMomentType() : MomentToShareFriend.Text.getValue());
        }
        Integer numOooOO0o = p493o0o00O00.OooO0OO.OooO00o().OooOOoo().OooOO0o(conversation.getUid(), conversation.getTargetId());
        int iIntValue = numOooOO0o != null ? numOooOO0o.intValue() : 0;
        conversation.setUnReadCount(iIntValue);
        if (chatMessage.getIsAcceptMsg() && chatMessage.getContentType() != 0) {
            conversation.setUnReadCount(iIntValue + 1);
        }
        p493o0o00O00.OooO0OO.OooO00o().OooOOoo().OooO0oO(conversation);
    }

    @NotNull
    public final ChatMessage OooO0oo(long j, int i, int i2, @NotNull String mid, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.EmoticonInfo emoticonInfo = new ChatMessage.EmoticonInfo();
        emoticonInfo.setEmoticonType(i);
        if (i2 > 0) {
            emoticonInfo.setEmoticonValue(i2);
        }
        emoticonInfo.setEmoticonIsRead(false);
        ChatMessage chatMessageOooO0O0 = OooO0O0(mid, j, j2, z);
        chatMessageOooO0O0.setEmoticonInfo(emoticonInfo);
        chatMessageOooO0O0.setSendState(StatusEnum$MsgSendStatus.ING.OooO00o());
        chatMessageOooO0O0.setContentType(3);
        return chatMessageOooO0O0;
    }

    @NotNull
    public final ChatMessage OooOO0o(long j, @NotNull String activityImage, @NotNull String activityText1, @NotNull String activityText2, @NotNull String activityUrl, @NotNull String message, @NotNull String mid, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(activityImage, "activityImage");
        Intrinsics.checkNotNullParameter(activityText1, "activityText1");
        Intrinsics.checkNotNullParameter(activityText2, "activityText2");
        Intrinsics.checkNotNullParameter(activityUrl, "activityUrl");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.ShareActivityInfo shareActivityInfo = new ChatMessage.ShareActivityInfo();
        shareActivityInfo.setActivityImage(activityImage);
        shareActivityInfo.setActivityText1(activityText1);
        shareActivityInfo.setActivityText2(activityText2);
        shareActivityInfo.setActivityUrl(activityUrl);
        ChatMessage chatMessageOooO0O0 = OooO0O0(mid, j, j2, z);
        chatMessageOooO0O0.setShareActivityInfo(shareActivityInfo);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setContentType(10);
        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public final ChatMessage OooOOO(long j, long j2, @NotNull String eventName, @NotNull String eventImageUrl, int i, long j3, long j4, long j5, @NotNull String roomName, @NotNull String roomIp, @NotNull String mid, long j6, boolean z) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventImageUrl, "eventImageUrl");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(roomIp, "roomIp");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.ShareEventRoomInfo shareEventRoomInfo = new ChatMessage.ShareEventRoomInfo();
        shareEventRoomInfo.setEventId(j2);
        shareEventRoomInfo.setEventName(eventName);
        shareEventRoomInfo.setEventImageUrl(eventImageUrl);
        shareEventRoomInfo.setEventTagId(i);
        shareEventRoomInfo.setEventStartTime(j3);
        shareEventRoomInfo.setEventEndTime(j4);
        shareEventRoomInfo.setRoomId(j5);
        shareEventRoomInfo.setRoomName(roomName);
        shareEventRoomInfo.setRoomIp(roomIp);
        ChatMessage chatMessageOooO0O0 = OooO0O0(mid, j, j6, z);
        chatMessageOooO0O0.setShareEventRoomInfo(shareEventRoomInfo);
        chatMessageOooO0O0.setContentType(12);
        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public final ChatMessage OooOOOO(long j, long j2, @NotNull String momentImage, @NotNull String momentText, int i, @NotNull String message, @NotNull String mid, long j3, boolean z) {
        Intrinsics.checkNotNullParameter(momentImage, "momentImage");
        Intrinsics.checkNotNullParameter(momentText, "momentText");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.ShareMomentInfo shareMomentInfo = new ChatMessage.ShareMomentInfo();
        shareMomentInfo.setMomentId(j2);
        shareMomentInfo.setMomentImage(momentImage);
        shareMomentInfo.setMomentText(momentText);
        shareMomentInfo.setMomentType(i);
        ChatMessage chatMessageOooO0O0 = OooO0O0(mid, j, j3, z);
        chatMessageOooO0O0.setShareMomentInfo(shareMomentInfo);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setContentType(7);
        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public final ChatMessage OooOOo0(long j, long j2, long j3, @NotNull String roomName, @NotNull String roomHeader, @NotNull String roomIp, @NotNull String message, @NotNull String mid, long j4, boolean z) {
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(roomHeader, "roomHeader");
        Intrinsics.checkNotNullParameter(roomIp, "roomIp");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.ShareRoomInfo shareRoomInfo = new ChatMessage.ShareRoomInfo();
        shareRoomInfo.setRoomId(j2);
        shareRoomInfo.setRoomIdx(j3);
        shareRoomInfo.setRoomName(roomName);
        shareRoomInfo.setRoomIp(roomIp);
        shareRoomInfo.setRoomHeader(roomHeader);
        ChatMessage chatMessageOooO0O0 = OooO0O0(mid, j, j4, z);
        chatMessageOooO0O0.setShareRoomInfo(shareRoomInfo);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setContentType(6);
        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public final ChatMessage OooOOoo(long j, long j2, @NotNull String topicImage, @NotNull String topicName, int i, int i2, @NotNull String message, @NotNull String mid, long j3, boolean z) {
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.ShareTopicInfo shareTopicInfo = new ChatMessage.ShareTopicInfo();
        shareTopicInfo.setTopicId(j2);
        shareTopicInfo.setTopicName(topicName);
        shareTopicInfo.setTopicImage(topicImage);
        shareTopicInfo.setTopicUserCount(i);
        shareTopicInfo.setTopicMomentCount(i2);
        ChatMessage chatMessageOooO0O0 = OooO0O0(mid, j, j3, z);
        chatMessageOooO0O0.setShareTopicInfo(shareTopicInfo);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setContentType(8);
        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public final ChatMessage OooOo0(long j, long j2, long j3, @NotNull String userName, @NotNull String userHead, @NotNull String message, @NotNull String mid, long j4, boolean z) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userHead, "userHead");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.ShareUserInfo shareUserInfo = new ChatMessage.ShareUserInfo();
        shareUserInfo.setUserName(userName);
        shareUserInfo.setUserId(j2);
        shareUserInfo.setUserHead(userHead);
        shareUserInfo.setUserIdx(j3);
        ChatMessage chatMessageOooO0O0 = OooO0O0(mid, j, j4, z);
        chatMessageOooO0O0.setShareUserInfo(shareUserInfo);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setContentType(9);
        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public final ChatMessage OooOo0o(long j, @NotNull String message, @NotNull String mid, long j2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage chatMessageOooO0O0 = OooO0O0(mid, j, j2, z);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setWarn(z2);
        chatMessageOooO0O0.setContentType(1);
        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public final ChatMessage OooOoO0(long j, @NotNull String fileName, long j2, @NotNull String voiceUrl, @NotNull String mid, long j3, boolean z) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(voiceUrl, "voiceUrl");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.VoiceInfo voiceInfo = new ChatMessage.VoiceInfo();
        voiceInfo.setFilename(fileName);
        voiceInfo.setVoiceRead(!z);
        voiceInfo.setVoiceUrl(voiceUrl);
        voiceInfo.setVoiceDuration(j2);
        ChatMessage chatMessageOooO0O0 = OooO0O0(mid, j, j3, z);
        chatMessageOooO0O0.setVoiceInfo(voiceInfo);
        chatMessageOooO0O0.setContentType(2);
        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    public final void OooOoOO(String str, int i) {
        p493o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0o(str, i);
    }
}
