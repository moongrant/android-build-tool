package com.yalla.yalla.service.room.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.model.BarInfoModel;
import com.yalla.yalla.model.InOutRoomModel;
import com.yalla.yalla.model.RoomGiftModel;
import com.yalla.yalla.model.SkillCardModel;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.ChangeUser;
import com.yalla.yalla.model.room.RoomContributionUpModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;
import p579o0oOoo.oO00000o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomChatMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomChatMsgProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,249:1\n1855#2,2:250\n*S KotlinDebug\n*F\n+ 1 RoomChatMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomChatMsgProcessor\n*L\n46#1:250,2\n*E\n"})
public final class OooO0O0 implements com.yalla.yalla.service.room.processor.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f25084OooO00o = new OooO0O0();

    @DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomChatMsgProcessor$addConveneMemberInRoomMessage$1$1", f = "RoomChatMsgProcessor.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25085OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ChatModel f25086OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ChatModel chatModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25086OooO0o0 = chatModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f25086OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25085OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f25085OooO0Oo = 1;
                if (DelayKt.delay(20L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MixedRoomDataSource.OooO0o0().OooO00o(this.f25086OooO0o0);
            return Unit.INSTANCE;
        }
    }

    public static void OooO0OO(@NotNull RoomGiftModel giftModel) {
        Intrinsics.checkNotNullParameter(giftModel, "giftModel");
        RoomConfiguration roomConfiguration = MixedRoomDataSource.OooO0o0().f23460OooO0o;
        if (roomConfiguration == null) {
            return;
        }
        BarInfoModel.RoomInfoOld roominfo = giftModel.getRoominfo();
        if (roominfo != null && o0OoOo0.OooO(0L, roomConfiguration.getBarid()) == roominfo.getId()) {
            ChatModel chatModel = new ChatModel();
            chatModel.setNumber(giftModel.getNumber());
            chatModel.setGiftid(giftModel.getGiftid());
            chatModel.setGiftsubtype(giftModel.getGiftsubtype());
            chatModel.setGiftUrl(giftModel.getGiftUrl());
            chatModel.setGiftVideoUrl(giftModel.getEffectUrl());
            chatModel.setGiftUserType(giftModel.getGiftUserType());
            chatModel.setGiftType(giftModel.getGiftType());
            chatModel.setNewFrom(giftModel.getNewFrom());
            chatModel.setGiftFromBackpack(giftModel.giftFromBackpack());
            chatModel.setNewTo(giftModel.getNewTo());
            chatModel.setType(1);
            chatModel.setUuid(giftModel.getUuid());
            chatModel.setFromboxid(giftModel.getFromboxid());
            chatModel.setBlindBoxLevel(giftModel.getBlindBoxLevel());
            MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
        }
    }

    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this);
    }

    public final void OooO0O0(@NotNull InOutRoomModel inOutRoomModel) {
        Intrinsics.checkNotNullParameter(inOutRoomModel, "inOutRoomModel");
        p592o0oo00O.OooOOO0.OooO0OO(com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO00o(this), " OtherUserLoginRoom = " + inOutRoomModel);
        RoomUserInfoModel newUser = inOutRoomModel.getNewUser();
        if (newUser != null && inOutRoomModel.getKind() == 0 && inOutRoomModel.getSource() == 1) {
            ChatModel chatModel = new ChatModel();
            chatModel.setType(35);
            chatModel.setNewFrom(newUser);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(chatModel, null), 3, null);
        }
    }

    public final void OooO0Oo(@NotNull SkillCardModel model) {
        MutableStateFlow<Long> userId;
        Intrinsics.checkNotNullParameter(model, "model");
        RoomUserInfoModel newTarget = model.getNewTarget();
        Long value = (newTarget == null || (userId = newTarget.getUserId()) == null) ? null : userId.getValue();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(value, o000000O.OooOOo0().getValue())) {
            ChatModel chatModel = new ChatModel();
            chatModel.setType(5);
            chatModel.setNewFrom(model.getNewFrom());
            chatModel.setNewTo(model.getNewTarget());
            chatModel.setMessage(o0000.OooO0OO(oO00OOo0.send_you) + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(oO00OOo0.Hats));
            MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
        }
    }

    public final void OooO0o(int i, @Nullable Object obj) {
        RoomContributionUpModel roomContributionUpModel;
        List<ChangeUser> changeUsers;
        com.yalla.yalla.service.room.processor.OooO00o.C0319OooO00o.OooO0O0(this, i, obj);
        if (i != 1001201 || (roomContributionUpModel = (RoomContributionUpModel) p140o00OOooo.OooOO0.OooO0O0(RoomContributionUpModel.class, new String((byte[]) obj, Charsets.UTF_8))) == null || (changeUsers = roomContributionUpModel.getChangeUsers()) == null) {
            return;
        }
        for (ChangeUser changeUser : changeUsers) {
            ChatModel chatModel = new ChatModel();
            chatModel.setType(36);
            chatModel.setContributionUpModel(new ChatModel.ContributionUpModel(changeUser.getType(), changeUser.getRank(), changeUser.getUserid(), changeUser.getName()));
            MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o0(@NotNull Room.MagicVoiceOut model) {
        boolean z;
        Intrinsics.checkNotNullParameter(model, "model");
        int cardid = model.getCardid();
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
        long userId = model.getTarget().getUserId();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null && userId == l.longValue()) {
            ChatModel chatModel = new ChatModel();
            chatModel.setType(15);
            String cardUrl = oO00000o.OooO00o(model.getCardid());
            int cardid2 = model.getCardid();
            Intrinsics.checkNotNullExpressionValue(cardUrl, "cardUrl");
            chatModel.setMagicVoiceInfo(new ChatModel.MagicVoiceInfo(cardid2, cardUrl));
            RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
            Room.UserModel from = model.getFrom();
            Intrinsics.checkNotNullExpressionValue(from, "model.from");
            chatModel.setNewFrom(companion.of(from));
            chatModel.setMessage(o0000.OooO0OO(oO00OOo0.message_room_send_voice_changer));
            MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
        }
    }
}
