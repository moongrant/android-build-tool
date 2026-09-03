package p406o0Oo0Ooo;

import android.os.Looper;
import androidx.compose.animation.OooO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.data.constant.StatusEnum$MsgSendStatus;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.Conversation;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentToShareFriend;
import com.yalla.yalla.model.room.RoomThemeAccept;
import com.yalla.yalla.model.room.RoomThemeGiveState;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p375o0OOoOO.o00000O0;
import p376o0OOoOOO.o00;
import p376o0OOoOOO.o00O0000;
import p377o0OOoOo.o0000O00;
import p403o0Oo0OOo.oo0o0O0;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;
import p464o0Oooo.o000000O;
import p464o0Oooo.o0O0oo0o;
import p472o0Ooooo0.oO0000o0;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nChatMessageRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatMessageRepo.kt\ncom/yalla/yalla/data/repository/ChatMessageRepo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 5 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,813:1\n1#2:814\n1855#3,2:815\n1855#3,2:817\n1855#3,2:819\n1855#3,2:821\n1855#3,2:823\n1855#3,2:825\n1855#3,2:863\n18#4,7:827\n25#4,10:835\n18#4,7:845\n25#4,10:853\n109#5:834\n109#5:852\n*S KotlinDebug\n*F\n+ 1 ChatMessageRepo.kt\ncom/yalla/yalla/data/repository/ChatMessageRepo\n*L\n189#1:815,2\n214#1:817,2\n240#1:819,2\n266#1:821,2\n293#1:823,2\n340#1:825,2\n802#1:863,2\n724#1:827,7\n724#1:835,10\n739#1:845,7\n739#1:853,10\n724#1:834\n739#1:852\n*E\n"})
public final class oOO0O000 extends o0O0oo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOO0O000 f44931OooO00o = new oOO0O000();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ChatMessageRepo", f = "ChatMessageRepo.kt", i = {0}, l = {740}, m = "getRoomThemeAccept", n = {"mid"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f44932OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f44934OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f44935OooO0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44934OooO0o0 = obj;
            this.f44935OooO0oO |= Integer.MIN_VALUE;
            return oOO0O000.this.OooO0Oo(0L, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ChatMessageRepo$getRoomThemeAccept$2$1$2", f = "ChatMessageRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ApiResult<RoomThemeAccept> f44936OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f44937OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ApiResult<RoomThemeAccept> apiResult, String str, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f44936OooO0Oo = apiResult;
            this.f44937OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f44936OooO0Oo, this.f44937OooO0o0, continuation);
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
            ApiResult<RoomThemeAccept> apiResult = this.f44936OooO0Oo;
            int code = apiResult.getError().getCode();
            boolean z = true;
            if (code == 1062) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.message_accept_failed_not_friend);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else if (code != 1202) {
                String str = this.f44937OooO0o0;
                switch (code) {
                    case 2050:
                        String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.message_room_theme_you_has_it);
                        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                            z = false;
                        }
                        if (!z) {
                            o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                            } else {
                                o000oo0OooO00o2.run();
                            }
                        }
                        break;
                    case 2051:
                        o000OOo.OooO00o().OooOOOo().OooOO0(ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReceived.getValue(), str);
                        break;
                    case 2052:
                        String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.message_theme_has_invalid);
                        if (strOooO0OO3 != null && !StringsKt.isBlank(strOooO0OO3)) {
                            z = false;
                        }
                        if (!z) {
                            o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO3, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o3.run();
                            } else {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
                            }
                        }
                        o000OOo.OooO00o().OooOOOo().OooOO0(ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasExpired.getValue(), str);
                        break;
                    default:
                        ApiError error = apiResult.getError();
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
                        break;
                }
            } else {
                OooO.OooO0O0(oOO00O.Create_Room_Tips, null, 2, null, o00O0.f45732OooO00o);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ChatMessageRepo", f = "ChatMessageRepo.kt", i = {0, 0}, l = {725}, m = "getRoomThemeGiveState", n = {"mid", "state"}, s = {"L$0", "I$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f44938OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f44939OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f44940OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f44942OooO0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44939OooO0o = obj;
            this.f44942OooO0oo |= Integer.MIN_VALUE;
            return oOO0O000.this.OooO0o0(0L, null, 0, this);
        }
    }

    @NotNull
    public static ChatMessage OooO(int i, long j, long j2, @NotNull String gifUrl, @NotNull String mid, boolean z) {
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.GifInfo gifInfo = new ChatMessage.GifInfo();
        gifInfo.setGifId(i);
        gifInfo.setGifUrl(gifUrl);
        ChatMessage chatMessageOooO0O0 = OooO0O0(j, j2, mid, z);
        chatMessageOooO0O0.setGifInfo(gifInfo);
        chatMessageOooO0O0.setContentType(4);
        o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @Nullable
    public static Unit OooO00o() {
        o000OOo.OooO00o().OooOOo0().OooO0OO(OooO0OO());
        o000OOo.OooO00o().OooOOOo().OooO(OooO0OO());
        return Unit.INSTANCE;
    }

    public static ChatMessage OooO0O0(long j, long j2, String str, boolean z) {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setAcceptMsg(z);
        chatMessage.setTargetId(j);
        chatMessage.setUid(OooO0OO());
        oO0000o0 oo0000o0 = oO0000o0.f47205OooO00o;
        if (j2 <= 0) {
            synchronized (oo0000o0) {
                j2 = System.currentTimeMillis() + o0O.OooO0O0.OooO0Oo().f56690OooO00o;
            }
        }
        chatMessage.setTime(j2);
        chatMessage.setSendState((z ? StatusEnum$MsgSendStatus.SUCCESS : StatusEnum$MsgSendStatus.ING).OooO00o());
        if (!(str.length() > 0)) {
            str = oo0000o0.OooO00o(Long.valueOf(j));
        }
        chatMessage.setMid(str);
        return chatMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long OooO0OO() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @NotNull
    public static ChatMessage OooO0o(@NotNull String mid, boolean z) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        o000OOo.OooO00o().OooOOOo().OooOO0(ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeHasReceived.getValue(), mid);
        ChatMessage chatMessageOooO0O0 = OooO0O0(0L, 0L, "", z);
        oo0o0O0 oo0o0o0OooOOOo = o000OOo.OooO00o().OooOOOo();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        ChatMessage chatMessageOooO0o = oo0o0o0OooOOOo.OooO0o(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), mid);
        if (chatMessageOooO0o != null) {
            UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
            long targetId = chatMessageOooO0o.getTargetId();
            userInfoRepo.getClass();
            UserInfo userInfoOooO0Oo = UserInfoRepo.OooO0Oo(targetId);
            if (userInfoOooO0Oo != null) {
                String strOooO0O0 = oOO0O0O.OooO0O0(chatMessageOooO0o.getTargetId(), userInfoOooO0Oo.getUserName());
                chatMessageOooO0O0.setMessage(z ? o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.message_give_theme_successful), strOooO0O0) : o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.message_get_theme_successful), strOooO0O0));
                chatMessageOooO0O0.setContentType(0);
                chatMessageOooO0O0.setTargetId(chatMessageOooO0o.getTargetId());
                chatMessageOooO0O0.setSendState(StatusEnum$MsgSendStatus.SUCCESS.OooO00o());
                o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
            }
        }
        return chatMessageOooO0O0;
    }

    public static void OooO0oO(@NotNull ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
        Long lOooO0O0 = o000OOo.OooO00o().OooOOo0().OooO0O0(chatMessage.getUid(), chatMessage.getTargetId());
        long jLongValue = lOooO0O0 != null ? lOooO0O0.longValue() : 0L;
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
            conversation.setMessage(StringsKt.OooOoO(chatMessage.getMessage(), "''", "'"));
        } else if (contentType == 2) {
            ChatMessage.VoiceInfo voiceInfo = chatMessage.getVoiceInfo();
            conversation.setVoiceAndUnread(!(voiceInfo != null && voiceInfo.getIsVoiceRead()));
        } else if (contentType == 7) {
            ChatMessage.ShareMomentInfo shareMomentInfo = chatMessage.getShareMomentInfo();
            conversation.setMomentType(shareMomentInfo != null ? shareMomentInfo.getMomentType() : MomentToShareFriend.Text.getValue());
        }
        Integer numOooOOOO = o000OOo.OooO00o().OooOOo0().OooOOOO(conversation.getUid(), conversation.getTargetId());
        int iIntValue = numOooOOOO != null ? numOooOOOO.intValue() : 0;
        conversation.setUnReadCount(iIntValue);
        if (chatMessage.getIsAcceptMsg() && chatMessage.getContentType() != 0) {
            conversation.setUnReadCount(iIntValue + 1);
        }
        o000OOo.OooO00o().OooOOo0().OooOO0o(conversation);
    }

    @NotNull
    public static ChatMessage OooO0oo(long j, int i, int i2, @NotNull String mid, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.EmoticonInfo emoticonInfo = new ChatMessage.EmoticonInfo();
        emoticonInfo.setEmoticonType(i);
        if (i2 > 0) {
            emoticonInfo.setEmoticonValue(i2);
        }
        emoticonInfo.setEmoticonIsRead(false);
        ChatMessage chatMessageOooO0O0 = OooO0O0(j, j2, mid, z);
        chatMessageOooO0O0.setEmoticonInfo(emoticonInfo);
        chatMessageOooO0O0.setSendState(StatusEnum$MsgSendStatus.ING.OooO00o());
        chatMessageOooO0O0.setContentType(3);
        return chatMessageOooO0O0;
    }

    public static /* synthetic */ ChatMessage OooOO0(long j, int i, String str, String str2, int i2) {
        if ((i2 & 8) != 0) {
            str2 = "";
        }
        return OooO(i, j, 0L, str, str2, false);
    }

    public static ChatMessage OooOO0O(long j, int i, int i2, String giftUrl, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i3) {
        String mid = (i3 & 16) != 0 ? "" : str;
        long j3 = (i3 & 32) != 0 ? 0L : j2;
        boolean z6 = (i3 & 64) != 0 ? false : z;
        boolean z7 = (i3 & 128) != 0 ? false : z2;
        boolean z8 = (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : z3;
        boolean z9 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? false : z4;
        boolean z10 = (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) == 0 ? z5 : false;
        Intrinsics.checkNotNullParameter(giftUrl, "giftUrl");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.GiftInfo giftInfo = new ChatMessage.GiftInfo();
        giftInfo.setGiftId(i);
        giftInfo.setGiftNumber(i2);
        giftInfo.setGiftUrl(giftUrl);
        giftInfo.setGiftBlind(Boolean.valueOf(z7));
        giftInfo.setGiftBlindBox(Boolean.valueOf(z8));
        giftInfo.setGiftBackpack(Boolean.valueOf(z9));
        giftInfo.setGiftCustomMade(Boolean.valueOf(z10));
        ChatMessage chatMessageOooO0O0 = OooO0O0(j, j3, mid, z6);
        chatMessageOooO0O0.setGiftInfo(giftInfo);
        chatMessageOooO0O0.setContentType(5);
        o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public static ChatMessage OooOO0o(long j, @NotNull String activityImage, @NotNull String activityText1, @NotNull String activityText2, @NotNull String activityUrl, @NotNull String message, @NotNull String mid, long j2, boolean z) {
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
        ChatMessage chatMessageOooO0O0 = OooO0O0(j, j2, mid, z);
        chatMessageOooO0O0.setShareActivityInfo(shareActivityInfo);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setContentType(10);
        o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public static ChatMessage OooOOO(long j, long j2, @NotNull String eventName, @NotNull String eventImageUrl, int i, long j3, long j4, long j5, @NotNull String roomName, @NotNull String roomIp, @NotNull String mid, long j6, boolean z) {
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
        ChatMessage chatMessageOooO0O0 = OooO0O0(j, j6, mid, z);
        chatMessageOooO0O0.setShareEventRoomInfo(shareEventRoomInfo);
        chatMessageOooO0O0.setContentType(12);
        o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public static ChatMessage OooOOOO(long j, long j2, @NotNull String momentImage, @NotNull String momentText, int i, @NotNull String message, @NotNull String mid, long j3, boolean z) {
        Intrinsics.checkNotNullParameter(momentImage, "momentImage");
        Intrinsics.checkNotNullParameter(momentText, "momentText");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.ShareMomentInfo shareMomentInfo = new ChatMessage.ShareMomentInfo();
        shareMomentInfo.setMomentId(j2);
        shareMomentInfo.setMomentImage(momentImage);
        shareMomentInfo.setMomentText(momentText);
        shareMomentInfo.setMomentType(i);
        ChatMessage chatMessageOooO0O0 = OooO0O0(j, j3, mid, z);
        chatMessageOooO0O0.setShareMomentInfo(shareMomentInfo);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setContentType(7);
        o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public static ChatMessage OooOOo0(long j, long j2, long j3, @NotNull String roomName, @NotNull String roomHeader, @NotNull String roomIp, @NotNull String message, @NotNull String mid, long j4, boolean z) {
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
        ChatMessage chatMessageOooO0O0 = OooO0O0(j, j4, mid, z);
        chatMessageOooO0O0.setShareRoomInfo(shareRoomInfo);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setContentType(6);
        o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public static ChatMessage OooOOoo(long j, @NotNull String topicImage, @NotNull String topicName, int i, @NotNull String message, boolean z, int i2, @NotNull String mid, long j2, long j3) {
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
        ChatMessage chatMessageOooO0O0 = OooO0O0(j, j3, mid, z);
        chatMessageOooO0O0.setShareTopicInfo(shareTopicInfo);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setContentType(8);
        o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    public static /* synthetic */ ChatMessage OooOo(long j, String str, String str2, long j2, boolean z, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            z = false;
        }
        return OooOo0o(j, str, str3, j3, z, false);
    }

    @NotNull
    public static ChatMessage OooOo0(long j, long j2, long j3, @NotNull String userName, @NotNull String userHead, @NotNull String message, @NotNull String mid, long j4, boolean z) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userHead, "userHead");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.ShareUserInfo shareUserInfo = new ChatMessage.ShareUserInfo();
        shareUserInfo.setUserName(userName);
        shareUserInfo.setUserId(j2);
        shareUserInfo.setUserHead(userHead);
        shareUserInfo.setUserIdx(j3);
        ChatMessage chatMessageOooO0O0 = OooO0O0(j, j4, mid, z);
        chatMessageOooO0O0.setShareUserInfo(shareUserInfo);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setContentType(9);
        o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public static ChatMessage OooOo0o(long j, @NotNull String message, @NotNull String mid, long j2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage chatMessageOooO0O0 = OooO0O0(j, j2, mid, z);
        chatMessageOooO0O0.setMessage(message);
        chatMessageOooO0O0.setWarn(z2);
        chatMessageOooO0O0.setContentType(1);
        o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    @NotNull
    public static ChatMessage OooOoO0(long j, long j2, @NotNull String fileName, @NotNull String voiceUrl, @NotNull String mid, long j3, boolean z) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(voiceUrl, "voiceUrl");
        Intrinsics.checkNotNullParameter(mid, "mid");
        ChatMessage.VoiceInfo voiceInfo = new ChatMessage.VoiceInfo();
        voiceInfo.setFilename(fileName);
        voiceInfo.setVoiceRead(!z);
        voiceInfo.setVoiceUrl(voiceUrl);
        voiceInfo.setVoiceDuration(j2);
        ChatMessage chatMessageOooO0O0 = OooO0O0(j, j3, mid, z);
        chatMessageOooO0O0.setVoiceInfo(voiceInfo);
        chatMessageOooO0O0.setContentType(2);
        o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
        return chatMessageOooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooO0Oo(long j, @NotNull String str, @NotNull Continuation<? super ApiResult<RoomThemeAccept>> continuation) {
        OooO00o oooO00o;
        String str2 = str;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f44935OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f44935OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object roomThemeAccept = oooO00o.f44934OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f44935OooO0oO;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(roomThemeAccept);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                oooO00o.f44932OooO0Oo = str2;
                oooO00o.f44935OooO0oO = 1;
                roomThemeAccept = mainApiServiceOooO00o.getRoomThemeAccept(j, str2, oooO00o);
                if (roomThemeAccept == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = oooO00o.f44932OooO0Oo;
                ResultKt.throwOnFailure(roomThemeAccept);
            }
            ApiResult apiResult = (ApiResult) roomThemeAccept;
            if (!apiResult.isSuccess()) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooO0O0(apiResult, str2, null), 2, null);
                return roomThemeAccept;
            }
            RoomThemeAccept roomThemeAccept2 = (RoomThemeAccept) apiResult.getData();
            if (roomThemeAccept2 == null) {
                return roomThemeAccept;
            }
            o000OOo.OooO00o().OooOOOo().OooOO0(roomThemeAccept2.getStatus(), str2);
            OooO0oO(OooO0o(str2, false));
            return roomThemeAccept;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0o0(long j, @NotNull String str, int i, @NotNull Continuation<? super ApiResult<RoomThemeGiveState>> continuation) {
        OooO0OO oooO0OO;
        String str2;
        int i2;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i3 = oooO0OO.f44942OooO0oo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO0OO.f44942OooO0oo = i3 - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object roomThemeGivenInfo = oooO0OO.f44939OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO0OO.f44942OooO0oo;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(roomThemeGivenInfo);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                oooO0OO.f44938OooO0Oo = str;
                oooO0OO.f44940OooO0o0 = i;
                oooO0OO.f44942OooO0oo = 1;
                roomThemeGivenInfo = mainApiServiceOooO00o.getRoomThemeGivenInfo(j, oooO0OO);
                if (roomThemeGivenInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                i2 = i;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = oooO0OO.f44940OooO0o0;
                str2 = oooO0OO.f44938OooO0Oo;
                ResultKt.throwOnFailure(roomThemeGivenInfo);
            }
            ApiResult apiResult = (ApiResult) roomThemeGivenInfo;
            if (!apiResult.isSuccess()) {
                ApiError error = apiResult.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
                return roomThemeGivenInfo;
            }
            RoomThemeGiveState roomThemeGiveState = (RoomThemeGiveState) apiResult.getData();
            if (roomThemeGiveState == null || roomThemeGiveState.getStatus() == i2) {
                return roomThemeGivenInfo;
            }
            o000OOo.OooO00o().OooOOOo().OooOO0(roomThemeGiveState.getStatus(), str2);
            return roomThemeGivenInfo;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }
}
