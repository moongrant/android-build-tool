package com.yalla.yalla.ui.vm.message;

import android.os.Looper;
import androidx.camera.core.impl.o00oOoo;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.data.constant.StatusEnum$MsgSendStatus;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.Conversation;
import com.yalla.yalla.data.db.table.Friend;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.room.RoomThemeAccept;
import com.yalla.yalla.model.room.RoomThemeGiveState;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.repository.CloudFileRepo;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import io.agora.rtc.Constants;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000O0o;
import p409o0Oo0Oo.o000;
import p409o0Oo0Oo.o000000;
import p414o0Oo0o0O.o000O00;
import p414o0Oo0o0O.o00O0;
import p414o0Oo0o0O.o00O000;
import p414o0Oo0o0O.o00O0000;
import p414o0Oo0o0O.o00O000o;
import p414o0Oo0o0O.o00O00o0;
import p414o0Oo0o0O.o00O0O0;
import p414o0Oo0o0O.o00O0O0O;
import p414o0Oo0o0O.o00O0OO;
import p414o0Oo0o0O.o00O0OO0;
import p414o0Oo0o0O.o00O0OOO;
import p414o0Oo0o0O.o0O00OO;
import p414o0Oo0o0O.oo0o0O0;
import p416o0Oo0oO.oO0OOo0o;
import p468o0OooOoo.o0oOo0O0;
import p474o0OoooOO.oo0oO0;
import p676oOooo0o.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b}\u0010~J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\bJ\u0010\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fJ-\u0010\u001e\u001a\u00020\u00062%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fJ\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040#2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\nJ\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040#2\u0006\u0010%\u001a\u00020\u001fJ \u0010*\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\fJ\u000e\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+J\u0016\u00100\u001a\u00020\u00062\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\fJ\u000e\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u001fJ\u0016\u00106\u001a\u00020\u00062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020+J\u000e\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u001fJ\u000e\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u001fJ\u000e\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u001fJ\u000e\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u001fJ\u000e\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u001fJ\u000e\u0010B\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u001fJ\u001e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0#2\u0006\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\fJ\u000e\u0010G\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u001fJ\u000e\u0010H\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u001fJ\u0010\u0010$\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u001fH\u0002R\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010N\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bN\u0010P\"\u0004\bQ\u0010RR\u0017\u0010T\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\"\u0010X\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R(\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00040#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010M\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR(\u0010b\u001a\b\u0012\u0004\u0012\u00020\f0#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010M\u001a\u0004\bc\u0010_\"\u0004\bd\u0010aR0\u0010F\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f\u0018\u00010e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR*\u0010\u000b\u001a\u00020\n2\u0006\u0010k\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010q\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010O\u001a\u0004\br\u0010P\"\u0004\bs\u0010RR(\u0010u\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f\u0018\u00010t0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010MR(\u0010v\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f\u0018\u00010t0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010MR\u0016\u0010w\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010OR\u0019\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8F¢\u0006\u0006\u001a\u0004\bx\u0010yR%\u0010{\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f\u0018\u00010t0\b8F¢\u0006\u0006\u001a\u0004\bG\u0010yR%\u0010|\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001f\u0018\u00010t0\b8F¢\u0006\u0006\u001a\u0004\bH\u0010y¨\u0006\u007f"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/PrivateChatVM;", "Lo0Oo0/OooOO0;", "Lcom/yalla/yalla/data/db/table/UserInfo;", "userInfo", "", "sendFilter", "", "loadData", "Landroidx/lifecycle/LiveData;", "checkUserRisk", "", "targetId", "", "mid", "updateVoice", "fileName", "updateVoiceFileName", "updateConversationCount", "updateEmotionMessage", "updateRiskFriend", "Lcom/yalla/yalla/data/db/table/Conversation;", "loadConversation", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "saveDraftMessage", "sendTextMessage", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isFirstShow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addChatMessageToYallaChatMessage", "Lcom/yalla/yalla/data/db/table/ChatMessage;", "textMessage", "reSendTextMessage", "voiceDuration", "Landroidx/lifecycle/MutableLiveData;", "sendVoiceMessage", "voiceMessage", "reSendVoiceMessage", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "momentDetail", "momentText", "updateMsgMoment", "", "emotionType", "sendEmotionMessage", "gifId", "gifUrl", "sendGifMessage", "gifMessage", "reSendGifMessage", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "gift", "giftNumber", "sendGiftMessage", "giftMessage", "reSendGiftMessage", "shareRoomMessage", "reSendShareRoomMsg", "shareMomentMessage", "reSendShareMomentMsg", "shareTopicMessage", "reSendShareTopicMsg", "shareUserMessage", "reSendShareUserMsg", "shareActivityMsg", "reSendShareActivityMsg", "chatDBModel", "url", "downloadVoice", "chatMessage", "getRoomThemeGiveState", "getRoomThemeAccept", "Lcom/yalla/yalla/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/repository/CloudFileRepo;", "_chatUserInfo", "Landroidx/lifecycle/MutableLiveData;", "isFriend", "Z", "()Z", "setFriend", "(Z)V", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "giftSendUser", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "getGiftSendUser", "()Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "friendRemark", "Ljava/lang/String;", "getFriendRemark", "()Ljava/lang/String;", "setFriendRemark", "(Ljava/lang/String;)V", "isFriendLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setFriendLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "friendRemarkLiveData", "getFriendRemarkLiveData", "setFriendRemarkLiveData", "Lo00o00oO/o000O0o;", "Lo00o00oO/o000O0o;", "getChatMessage", "()Lo00o00oO/o000O0o;", "setChatMessage", "(Lo00o00oO/o000O0o;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "J", "getTargetId", "()J", "setTargetId", "(J)V", "layoutYallaChatShowing", "getLayoutYallaChatShowing", "setLayoutYallaChatShowing", "Lkotlin/Pair;", "_roomThemeGiveState", "_roomThemeAccept", "isFirstShowYallaChatButton", "getChatUserInfo", "()Landroidx/lifecycle/LiveData;", "chatUserInfo", "roomThemeGiveState", "roomThemeAccept", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class PrivateChatVM extends p396o0Oo0.OooOO0 {
    public static final int $stable = 8;

    @Nullable
    private o000O0o<Integer, ChatMessage> chatMessage;
    private boolean isFriend;
    private boolean layoutYallaChatShowing;
    private long targetId;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @NotNull
    private MutableLiveData<UserInfo> _chatUserInfo = new MutableLiveData<>();

    @NotNull
    private final RoomUserInfoModel giftSendUser = new RoomUserInfoModel();

    @NotNull
    private String friendRemark = "";

    @NotNull
    private MutableLiveData<Boolean> isFriendLiveData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<String> friendRemarkLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<Integer, ChatMessage>> _roomThemeGiveState = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<Integer, ChatMessage>> _roomThemeAccept = new MutableLiveData<>();
    private boolean isFirstShowYallaChatButton = true;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$loadData$2", f = "PrivateChatVM.kt", i = {}, l = {120, 126}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31413OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$loadData$2$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<UserInfo, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31415OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ PrivateChatVM f31416OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PrivateChatVM privateChatVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31416OooO0o0 = privateChatVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f31416OooO0o0, continuation);
                oooO00o.f31415OooO0Oo = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UserInfo userInfo, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(userInfo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                UserInfo userInfo = (UserInfo) this.f31415OooO0Oo;
                PrivateChatVM privateChatVM = this.f31416OooO0o0;
                privateChatVM._chatUserInfo.postValue(userInfo);
                String value = privateChatVM.getFriendRemarkLiveData().getValue();
                if ((value == null || value.length() == 0) && userInfo != null) {
                    privateChatVM.getFriendRemarkLiveData().postValue(userInfo.getUserName());
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$loadData$2$2", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31417OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ PrivateChatVM f31418OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PrivateChatVM privateChatVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f31418OooO0o0 = privateChatVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f31418OooO0o0, continuation);
                oooO0O0.f31417OooO0Oo = obj;
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                String str = (String) this.f31417OooO0Oo;
                if (!(str == null || str.length() == 0)) {
                    this.f31418OooO0o0.getFriendRemarkLiveData().postValue(str);
                }
                return Unit.INSTANCE;
            }
        }

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new OooO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31413OooO0Oo;
            PrivateChatVM privateChatVM = PrivateChatVM.this;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            privateChatVM.getFriendRemarkLiveData().postValue("");
            UserInfoRepo userInfoRepo = UserInfoRepo.f22740OooO00o;
            long targetId = privateChatVM.getTargetId();
            userInfoRepo.getClass();
            Flow flow = FlowKt.flow(new o0O00OO(targetId, null));
            OooO00o oooO00o = new OooO00o(privateChatVM, null);
            this.f31413OooO0Oo = 1;
            if (FlowKt.collectLatest(flow, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            long targetId2 = privateChatVM.getTargetId();
            o000 o000VarOooOOoo = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOoo();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            Flow<String> flowOooO0o0 = o000VarOooOOoo.OooO0o0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), targetId2);
            OooO0O0 oooO0O0 = new OooO0O0(privateChatVM, null);
            this.f31413OooO0Oo = 2;
            if (FlowKt.collectLatest(flowOooO0o0, oooO0O0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$checkUserRisk$1", f = "PrivateChatVM.kt", i = {0, 2, 2, 3}, l = {142, 147, TextFieldImplKt.AnimationDuration, Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED, Constants.ERR_PUBLISH_STREAM_NOT_FOUND, Constants.ERR_MODULE_NOT_FOUND}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", "friendByDB", "$this$liveDataAsync"}, s = {"L$0", "L$0", "L$1", "L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Friend f31419OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f31420OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31421OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = PrivateChatVM.this.new OooO00o(continuation);
            oooO00o.f31420OooO0o = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005a  */
        /* JADX WARN: Code duplicated, block: B:18:0x005d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0096 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:33:0x00cc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d1 A[DONT_INVERT, PHI: r1 r12
          0x00d1: PHI (r1v8 androidx.lifecycle.LiveDataScope) = (r1v4 androidx.lifecycle.LiveDataScope), (r1v10 androidx.lifecycle.LiveDataScope) binds: [B:30:0x00b7, B:35:0x00cf] A[DONT_GENERATE, DONT_INLINE]
          0x00d1: PHI (r12v17 com.yalla.yalla.data.db.table.Friend) = (r12v15 com.yalla.yalla.data.db.table.Friend), (r12v27 com.yalla.yalla.data.db.table.Friend) binds: [B:30:0x00b7, B:35:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:38:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:43:0x00fa A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x0103  */
        /* JADX WARN: Code duplicated, block: B:49:0x0115 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:50:0x0116  */
        /* JADX WARN: Code duplicated, block: B:52:0x0127 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            Integer num;
            Boolean boolBoxBoolean;
            Friend friendOooO0OO;
            UserInfoRepo userInfoRepo;
            long targetId;
            LiveDataScope liveDataScope2;
            Friend friend;
            Boolean boolBoxBoolean2;
            Boolean boolBoxBoolean3;
            boolean zBooleanValue;
            Boolean boolBoxBoolean4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31421OooO0o0;
            PrivateChatVM privateChatVM = PrivateChatVM.this;
            switch (i) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    LiveDataScope liveDataScope3 = (LiveDataScope) this.f31420OooO0o;
                    o000O00 o000o01 = o000O00.f45973OooO00o;
                    long targetId2 = privateChatVM.getTargetId();
                    this.f31420OooO0o = liveDataScope3;
                    this.f31421OooO0o0 = 1;
                    Object objOooO00o = o000o01.OooO00o(targetId2, this);
                    if (objOooO00o == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    liveDataScope = liveDataScope3;
                    obj = objOooO00o;
                    apiResult = (ApiResult) obj;
                    if (!apiResult.isSuccess()) {
                        return Unit.INSTANCE;
                    }
                    num = (Integer) apiResult.getData();
                    if (num != null && num.intValue() == 1) {
                        long targetId3 = privateChatVM.getTargetId();
                        o000 o000VarOooOOoo = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOoo();
                        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                        friendOooO0OO = o000VarOooOOoo.OooO0OO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), targetId3);
                        if (friendOooO0OO == null) {
                            userInfoRepo = UserInfoRepo.f22740OooO00o;
                            targetId = privateChatVM.getTargetId();
                            this.f31420OooO0o = liveDataScope;
                            this.f31419OooO0Oo = friendOooO0OO;
                            this.f31421OooO0o0 = 3;
                            if (userInfoRepo.OooO0oo(targetId, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            liveDataScope2 = liveDataScope;
                            friend = friendOooO0OO;
                            friendOooO0OO = friend;
                            liveDataScope = liveDataScope2;
                            if (friendOooO0OO != null) {
                                boolBoxBoolean2 = Boxing.boxBoolean(friendOooO0OO.getIsCheckUserRisk());
                            } else {
                                boolBoxBoolean2 = null;
                            }
                            if (Intrinsics.areEqual(boolBoxBoolean2, Boxing.boxBoolean(false))) {
                                o00O0000 o00o0001 = o00O0000.f46081OooO00o;
                                long targetId4 = privateChatVM.getTargetId();
                                this.f31420OooO0o = liveDataScope;
                                this.f31419OooO0Oo = null;
                                this.f31421OooO0o0 = 4;
                                obj = o00o0001.OooO0oO(targetId4, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                if (!zBooleanValue) {
                                    privateChatVM.updateRiskFriend();
                                }
                                boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                                this.f31420OooO0o = null;
                                this.f31421OooO0o0 = 5;
                                if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                boolBoxBoolean3 = Boxing.boxBoolean(false);
                                this.f31420OooO0o = null;
                                this.f31419OooO0Oo = null;
                                this.f31421OooO0o0 = 6;
                                if (liveDataScope.emit(boolBoxBoolean3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (friendOooO0OO != null) {
                                boolBoxBoolean2 = Boxing.boxBoolean(friendOooO0OO.getIsCheckUserRisk());
                            } else {
                                boolBoxBoolean2 = null;
                            }
                            if (Intrinsics.areEqual(boolBoxBoolean2, Boxing.boxBoolean(false))) {
                                o00O0000 o00o0002 = o00O0000.f46081OooO00o;
                                long targetId5 = privateChatVM.getTargetId();
                                this.f31420OooO0o = liveDataScope;
                                this.f31419OooO0Oo = null;
                                this.f31421OooO0o0 = 4;
                                obj = o00o0002.OooO0oO(targetId5, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                if (!zBooleanValue) {
                                    privateChatVM.updateRiskFriend();
                                }
                                boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                                this.f31420OooO0o = null;
                                this.f31421OooO0o0 = 5;
                                if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                boolBoxBoolean3 = Boxing.boxBoolean(false);
                                this.f31420OooO0o = null;
                                this.f31419OooO0Oo = null;
                                this.f31421OooO0o0 = 6;
                                if (liveDataScope.emit(boolBoxBoolean3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    } else {
                        long targetId6 = privateChatVM.getTargetId();
                        o000 o000VarOooOOoo2 = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOoo();
                        oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                        o000VarOooOOoo2.OooOOOO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), targetId6);
                        boolBoxBoolean = Boxing.boxBoolean(false);
                        this.f31420OooO0o = null;
                        this.f31421OooO0o0 = 2;
                        if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    liveDataScope = (LiveDataScope) this.f31420OooO0o;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (!apiResult.isSuccess()) {
                        return Unit.INSTANCE;
                    }
                    num = (Integer) apiResult.getData();
                    if (num != null) {
                        long targetId7 = privateChatVM.getTargetId();
                        o000 o000VarOooOOoo3 = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOoo();
                        oo0oO0 oo0oo2 = oo0oO0.f47967OooO00o;
                        friendOooO0OO = o000VarOooOOoo3.OooO0OO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), targetId7);
                        if (friendOooO0OO == null) {
                            userInfoRepo = UserInfoRepo.f22740OooO00o;
                            targetId = privateChatVM.getTargetId();
                            this.f31420OooO0o = liveDataScope;
                            this.f31419OooO0Oo = friendOooO0OO;
                            this.f31421OooO0o0 = 3;
                            if (userInfoRepo.OooO0oo(targetId, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            liveDataScope2 = liveDataScope;
                            friend = friendOooO0OO;
                            friendOooO0OO = friend;
                            liveDataScope = liveDataScope2;
                            if (friendOooO0OO != null) {
                                boolBoxBoolean2 = Boxing.boxBoolean(friendOooO0OO.getIsCheckUserRisk());
                            } else {
                                boolBoxBoolean2 = null;
                            }
                            if (Intrinsics.areEqual(boolBoxBoolean2, Boxing.boxBoolean(false))) {
                                o00O0000 o00o0003 = o00O0000.f46081OooO00o;
                                long targetId8 = privateChatVM.getTargetId();
                                this.f31420OooO0o = liveDataScope;
                                this.f31419OooO0Oo = null;
                                this.f31421OooO0o0 = 4;
                                obj = o00o0003.OooO0oO(targetId8, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                if (!zBooleanValue) {
                                    privateChatVM.updateRiskFriend();
                                }
                                boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                                this.f31420OooO0o = null;
                                this.f31421OooO0o0 = 5;
                                if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                boolBoxBoolean3 = Boxing.boxBoolean(false);
                                this.f31420OooO0o = null;
                                this.f31419OooO0Oo = null;
                                this.f31421OooO0o0 = 6;
                                if (liveDataScope.emit(boolBoxBoolean3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (friendOooO0OO != null) {
                                boolBoxBoolean2 = Boxing.boxBoolean(friendOooO0OO.getIsCheckUserRisk());
                            } else {
                                boolBoxBoolean2 = null;
                            }
                            if (Intrinsics.areEqual(boolBoxBoolean2, Boxing.boxBoolean(false))) {
                                o00O0000 o00o0004 = o00O0000.f46081OooO00o;
                                long targetId9 = privateChatVM.getTargetId();
                                this.f31420OooO0o = liveDataScope;
                                this.f31419OooO0Oo = null;
                                this.f31421OooO0o0 = 4;
                                obj = o00o0004.OooO0oO(targetId9, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                if (!zBooleanValue) {
                                    privateChatVM.updateRiskFriend();
                                }
                                boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                                this.f31420OooO0o = null;
                                this.f31421OooO0o0 = 5;
                                if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                boolBoxBoolean3 = Boxing.boxBoolean(false);
                                this.f31420OooO0o = null;
                                this.f31419OooO0Oo = null;
                                this.f31421OooO0o0 = 6;
                                if (liveDataScope.emit(boolBoxBoolean3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    long targetId10 = privateChatVM.getTargetId();
                    o000 o000VarOooOOoo4 = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOoo();
                    oo0oO0 oo0oo3 = oo0oO0.f47967OooO00o;
                    o000VarOooOOoo4.OooOOOO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), targetId10);
                    boolBoxBoolean = Boxing.boxBoolean(false);
                    this.f31420OooO0o = null;
                    this.f31421OooO0o0 = 2;
                    if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                case 5:
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 3:
                    friend = this.f31419OooO0Oo;
                    liveDataScope2 = (LiveDataScope) this.f31420OooO0o;
                    ResultKt.throwOnFailure(obj);
                    friendOooO0OO = friend;
                    liveDataScope = liveDataScope2;
                    if (friendOooO0OO != null) {
                        boolBoxBoolean2 = Boxing.boxBoolean(friendOooO0OO.getIsCheckUserRisk());
                    } else {
                        boolBoxBoolean2 = null;
                    }
                    if (Intrinsics.areEqual(boolBoxBoolean2, Boxing.boxBoolean(false))) {
                        o00O0000 o00o0005 = o00O0000.f46081OooO00o;
                        long targetId11 = privateChatVM.getTargetId();
                        this.f31420OooO0o = liveDataScope;
                        this.f31419OooO0Oo = null;
                        this.f31421OooO0o0 = 4;
                        obj = o00o0005.OooO0oO(targetId11, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!zBooleanValue) {
                            privateChatVM.updateRiskFriend();
                        }
                        boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                        this.f31420OooO0o = null;
                        this.f31421OooO0o0 = 5;
                        if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        boolBoxBoolean3 = Boxing.boxBoolean(false);
                        this.f31420OooO0o = null;
                        this.f31419OooO0Oo = null;
                        this.f31421OooO0o0 = 6;
                        if (liveDataScope.emit(boolBoxBoolean3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                case 4:
                    liveDataScope = (LiveDataScope) this.f31420OooO0o;
                    ResultKt.throwOnFailure(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (!zBooleanValue) {
                        privateChatVM.updateRiskFriend();
                    }
                    boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                    this.f31420OooO0o = null;
                    this.f31421OooO0o0 = 5;
                    if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$getRoomThemeAccept$1", f = "PrivateChatVM.kt", i = {}, l = {514}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPrivateChatVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatVM.kt\ncom/yalla/yalla/ui/vm/message/PrivateChatVM$getRoomThemeAccept$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,526:1\n1#2:527\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31423OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PrivateChatVM f31424OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31425OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ChatMessage chatMessage, PrivateChatVM privateChatVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31425OooO0o0 = chatMessage;
            this.f31424OooO0o = privateChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f31425OooO0o0, this.f31424OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31423OooO0Oo;
            ChatMessage chatMessage = this.f31425OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p414o0Oo0o0O.o000 o000Var = p414o0Oo0o0O.o000.f45933OooO00o;
                ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = chatMessage.getGiveRoomThemeInfo();
                long themeGiveId = giveRoomThemeInfo != null ? giveRoomThemeInfo.getThemeGiveId() : 0L;
                String mid = chatMessage.getMid();
                this.f31423OooO0Oo = 1;
                obj = o000Var.OooO0Oo(themeGiveId, mid, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            boolean zIsSuccess = apiResult.isSuccess();
            PrivateChatVM privateChatVM = this.f31424OooO0o;
            if (zIsSuccess) {
                RoomThemeAccept roomThemeAccept = (RoomThemeAccept) apiResult.getData();
                if (roomThemeAccept != null) {
                    privateChatVM._roomThemeAccept.postValue(new Pair(Boxing.boxInt(roomThemeAccept.getStatus()), chatMessage));
                }
            } else {
                privateChatVM._roomThemeAccept.postValue(null);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$getRoomThemeGiveState$1", f = "PrivateChatVM.kt", i = {}, l = {477}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31426OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PrivateChatVM f31427OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31428OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ChatMessage chatMessage, PrivateChatVM privateChatVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31428OooO0o0 = chatMessage;
            this.f31427OooO0o = privateChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f31428OooO0o0, this.f31427OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31426OooO0Oo;
            ChatMessage chatMessage = this.f31428OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p414o0Oo0o0O.o000 o000Var = p414o0Oo0o0O.o000.f45933OooO00o;
                ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = chatMessage.getGiveRoomThemeInfo();
                long themeGiveId = giveRoomThemeInfo != null ? giveRoomThemeInfo.getThemeGiveId() : 0L;
                String mid = chatMessage.getMid();
                ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo2 = chatMessage.getGiveRoomThemeInfo();
                int themeState = giveRoomThemeInfo2 != null ? giveRoomThemeInfo2.getThemeState() : ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeNotReceive.getValue();
                this.f31426OooO0Oo = 1;
                obj = o000Var.OooO0o0(themeGiveId, mid, themeState, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            boolean zIsSuccess = apiResult.isSuccess();
            PrivateChatVM privateChatVM = this.f31427OooO0o;
            if (zIsSuccess) {
                RoomThemeGiveState roomThemeGiveState = (RoomThemeGiveState) apiResult.getData();
                if (roomThemeGiveState != null) {
                    ChatMessage chatMessage2 = new ChatMessage();
                    chatMessage2.setUid(chatMessage.getUid());
                    chatMessage2.setMid(chatMessage.getMid());
                    chatMessage2.setTargetId(chatMessage.getTargetId());
                    chatMessage2.setContentType(chatMessage.getContentType());
                    chatMessage2.setMessage(chatMessage.getMessage());
                    chatMessage2.setTime(chatMessage.getTime());
                    chatMessage2.setSendState(chatMessage.getSendState());
                    chatMessage2.setWarn(chatMessage.getIsWarn());
                    chatMessage2.setAcceptMsg(chatMessage.getIsAcceptMsg());
                    ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo3 = new ChatMessage.GiveRoomThemeInfo();
                    ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo4 = chatMessage.getGiveRoomThemeInfo();
                    giveRoomThemeInfo3.setThemeBgName(String.valueOf(giveRoomThemeInfo4 != null ? giveRoomThemeInfo4.getThemeBgName() : null));
                    ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo5 = chatMessage.getGiveRoomThemeInfo();
                    giveRoomThemeInfo3.setThemeBgImgUrl(String.valueOf(giveRoomThemeInfo5 != null ? giveRoomThemeInfo5.getThemeBgImgUrl() : null));
                    ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo6 = chatMessage.getGiveRoomThemeInfo();
                    giveRoomThemeInfo3.setThemeVideoUrl(String.valueOf(giveRoomThemeInfo6 != null ? giveRoomThemeInfo6.getThemeVideoUrl() : null));
                    ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo7 = chatMessage.getGiveRoomThemeInfo();
                    giveRoomThemeInfo3.setThemeDayLimit(giveRoomThemeInfo7 != null ? giveRoomThemeInfo7.getThemeDayLimit() : 0);
                    ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo8 = chatMessage.getGiveRoomThemeInfo();
                    giveRoomThemeInfo3.setThemeExpireTime(giveRoomThemeInfo8 != null ? giveRoomThemeInfo8.getThemeExpireTime() : 0L);
                    ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo9 = chatMessage.getGiveRoomThemeInfo();
                    giveRoomThemeInfo3.setThemeGiveId(giveRoomThemeInfo9 != null ? giveRoomThemeInfo9.getThemeGiveId() : 0L);
                    giveRoomThemeInfo3.setThemeState(roomThemeGiveState.getStatus());
                    chatMessage2.setGiveRoomThemeInfo(giveRoomThemeInfo3);
                    privateChatVM._roomThemeGiveState.postValue(new Pair(Boxing.boxInt(roomThemeGiveState.getStatus()), chatMessage2));
                }
            } else {
                privateChatVM._roomThemeGiveState.postValue(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<androidx.paging.o0O0O00<Integer, ChatMessage>> {
        public OooO0o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.paging.o0O0O00<Integer, ChatMessage> invoke() {
            long targetId = PrivateChatVM.this.getTargetId();
            p409o0Oo0Oo.Oooo000 oooo000OooOOo0 = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo0();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            Long l = (Long) oo0oO0.OooOOo0().getValue();
            return oooo000OooOOo0.OooOO0o(l == null ? 0L : l.longValue(), targetId);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$loadData$3", f = "PrivateChatVM.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31430OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$loadData$3$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<Friend, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31432OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ PrivateChatVM f31433OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PrivateChatVM privateChatVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31433OooO0o0 = privateChatVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f31433OooO0o0, continuation);
                oooO00o.f31432OooO0Oo = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Friend friend, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(friend, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f31433OooO0o0.isFriendLiveData().postValue(Boxing.boxBoolean(((Friend) this.f31432OooO0Oo) != null));
                return Unit.INSTANCE;
            }
        }

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new OooOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31430OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PrivateChatVM privateChatVM = PrivateChatVM.this;
                privateChatVM.isFriendLiveData().postValue(Boxing.boxBoolean(false));
                long targetId = privateChatVM.getTargetId();
                o000 o000VarOooOOoo = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOoo();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                Flow<Friend> flowOooOOOo = o000VarOooOOoo.OooOOOo(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), targetId);
                OooO00o oooO00o = new OooO00o(privateChatVM, null);
                this.f31430OooO0Oo = 1;
                if (FlowKt.collectLatest(flowOooOOOo, oooO00o, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendGifMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31434OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(ChatMessage chatMessage, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f31434OooO0Oo = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f31434OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String gifUrl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ChatMessage chatMessage = this.f31434OooO0Oo;
            ChatMessage.GifInfo gifInfo = chatMessage.getGifInfo();
            int gifId = gifInfo != null ? gifInfo.getGifId() : 0;
            ChatMessage.GifInfo gifInfo2 = chatMessage.getGifInfo();
            if (gifInfo2 == null || (gifUrl = gifInfo2.getGifUrl()) == null) {
                gifUrl = "";
            }
            ChatMessage msg = p414o0Oo0o0O.o000.OooOO0(chatMessage.getTargetId(), gifId, gifUrl, chatMessage.getMid(), 48);
            p414o0Oo0o0O.o000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O000o(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendShareActivityMsg$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31435OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(ChatMessage chatMessage, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f31435OooO0Oo = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f31435OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String activityUrl;
            String activityText2;
            String activityText1;
            String activityImage;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ArrayList midList = new ArrayList();
            ArrayList targetIds = new ArrayList();
            ChatMessage chatMessage = this.f31435OooO0Oo;
            ChatMessage.ShareActivityInfo shareActivityInfo = chatMessage.getShareActivityInfo();
            String str = (shareActivityInfo == null || (activityImage = shareActivityInfo.getActivityImage()) == null) ? "" : activityImage;
            ChatMessage.ShareActivityInfo shareActivityInfo2 = chatMessage.getShareActivityInfo();
            String str2 = (shareActivityInfo2 == null || (activityText1 = shareActivityInfo2.getActivityText1()) == null) ? "" : activityText1;
            ChatMessage.ShareActivityInfo shareActivityInfo3 = chatMessage.getShareActivityInfo();
            String str3 = (shareActivityInfo3 == null || (activityText2 = shareActivityInfo3.getActivityText2()) == null) ? "" : activityText2;
            ChatMessage.ShareActivityInfo shareActivityInfo4 = chatMessage.getShareActivityInfo();
            ChatMessage msg = p414o0Oo0o0O.o000.OooOO0o(chatMessage.getTargetId(), str, str2, str3, (shareActivityInfo4 == null || (activityUrl = shareActivityInfo4.getActivityUrl()) == null) ? "" : activityUrl, (416 & 32) != 0 ? "" : null, (416 & 64) != 0 ? "" : chatMessage.getMid(), 0L, false);
            midList.add(new Pair(chatMessage.getMid(), ""));
            targetIds.add(Boxing.boxLong(chatMessage.getTargetId()));
            p414o0Oo0o0O.o000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(midList, "midList");
            Intrinsics.checkNotNullParameter(targetIds, "targetIds");
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0(msg, new MutableLiveData(), targetIds, midList, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendGiftMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31436OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(ChatMessage chatMessage, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f31436OooO0Oo = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f31436OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String giftUrl;
            Boolean isGiftBackpack;
            Boolean isGiftCustomMade;
            Boolean isGiftBlind;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ChatMessage chatMessage = this.f31436OooO0Oo;
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            boolean zBooleanValue = false;
            int giftId = giftInfo != null ? giftInfo.getGiftId() : 0;
            ChatMessage.GiftInfo giftInfo2 = chatMessage.getGiftInfo();
            int giftNumber = giftInfo2 != null ? giftInfo2.getGiftNumber() : 0;
            ChatMessage.GiftInfo giftInfo3 = chatMessage.getGiftInfo();
            if (giftInfo3 == null || (giftUrl = giftInfo3.getGiftUrl()) == null) {
                giftUrl = "";
            }
            String str = giftUrl;
            ChatMessage.GiftInfo giftInfo4 = chatMessage.getGiftInfo();
            boolean zBooleanValue2 = (giftInfo4 == null || (isGiftBlind = giftInfo4.getIsGiftBlind()) == null) ? false : isGiftBlind.booleanValue();
            ChatMessage.GiftInfo giftInfo5 = chatMessage.getGiftInfo();
            boolean zBooleanValue3 = (giftInfo5 == null || (isGiftCustomMade = giftInfo5.getIsGiftCustomMade()) == null) ? false : isGiftCustomMade.booleanValue();
            ChatMessage.GiftInfo giftInfo6 = chatMessage.getGiftInfo();
            if (giftInfo6 != null && (isGiftBackpack = giftInfo6.getIsGiftBackpack()) != null) {
                zBooleanValue = isGiftBackpack.booleanValue();
            }
            ChatMessage msg = p414o0Oo0o0O.o000.OooOO0O(chatMessage.getTargetId(), giftId, giftNumber, str, chatMessage.getMid(), 0L, false, zBooleanValue2, zBooleanValue2, zBooleanValue, zBooleanValue3, 96);
            p414o0Oo0o0O.o000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O00o0(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendShareMomentMsg$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31437OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(ChatMessage chatMessage, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f31437OooO0Oo = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f31437OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String momentText;
            String momentImage;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ArrayList midList = new ArrayList();
            ArrayList targetIds = new ArrayList();
            ChatMessage chatMessage = this.f31437OooO0Oo;
            ChatMessage.ShareMomentInfo shareMomentInfo = chatMessage.getShareMomentInfo();
            long momentId = shareMomentInfo != null ? shareMomentInfo.getMomentId() : 0L;
            ChatMessage.ShareMomentInfo shareMomentInfo2 = chatMessage.getShareMomentInfo();
            String str = (shareMomentInfo2 == null || (momentImage = shareMomentInfo2.getMomentImage()) == null) ? "" : momentImage;
            ChatMessage.ShareMomentInfo shareMomentInfo3 = chatMessage.getShareMomentInfo();
            String str2 = (shareMomentInfo3 == null || (momentText = shareMomentInfo3.getMomentText()) == null) ? "" : momentText;
            ChatMessage.ShareMomentInfo shareMomentInfo4 = chatMessage.getShareMomentInfo();
            ChatMessage msg = p414o0Oo0o0O.o000.OooOOOO(chatMessage.getTargetId(), momentId, str, str2, shareMomentInfo4 != null ? shareMomentInfo4.getMomentType() : 0, (416 & 32) != 0 ? "" : null, (416 & 64) != 0 ? "" : chatMessage.getMid(), 0L, false);
            midList.add(new Pair(chatMessage.getMid(), ""));
            targetIds.add(Boxing.boxLong(chatMessage.getTargetId()));
            p414o0Oo0o0O.o000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(midList, "midList");
            Intrinsics.checkNotNullParameter(targetIds, "targetIds");
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0O0(msg, new MutableLiveData(), targetIds, midList, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendShareTopicMsg$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31438OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(ChatMessage chatMessage, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f31438OooO0Oo = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo(this.f31438OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String topicName;
            String topicImage;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ArrayList midList = new ArrayList();
            ArrayList targetIds = new ArrayList();
            ChatMessage chatMessage = this.f31438OooO0Oo;
            ChatMessage.ShareTopicInfo shareTopicInfo = chatMessage.getShareTopicInfo();
            long topicId = shareTopicInfo != null ? shareTopicInfo.getTopicId() : 0L;
            ChatMessage.ShareTopicInfo shareTopicInfo2 = chatMessage.getShareTopicInfo();
            String str = (shareTopicInfo2 == null || (topicImage = shareTopicInfo2.getTopicImage()) == null) ? "" : topicImage;
            ChatMessage.ShareTopicInfo shareTopicInfo3 = chatMessage.getShareTopicInfo();
            String str2 = (shareTopicInfo3 == null || (topicName = shareTopicInfo3.getTopicName()) == null) ? "" : topicName;
            ChatMessage.ShareTopicInfo shareTopicInfo4 = chatMessage.getShareTopicInfo();
            int topicUserCount = shareTopicInfo4 != null ? shareTopicInfo4.getTopicUserCount() : 0;
            ChatMessage.ShareTopicInfo shareTopicInfo5 = chatMessage.getShareTopicInfo();
            ChatMessage msg = p414o0Oo0o0O.o000.OooOOoo(chatMessage.getTargetId(), str, str2, topicUserCount, (832 & 64) != 0 ? "" : null, false, shareTopicInfo5 != null ? shareTopicInfo5.getTopicMomentCount() : 0, (832 & 128) != 0 ? "" : chatMessage.getMid(), topicId, 0L);
            midList.add(new Pair(chatMessage.getMid(), ""));
            targetIds.add(Boxing.boxLong(chatMessage.getTargetId()));
            p414o0Oo0o0O.o000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(midList, "midList");
            Intrinsics.checkNotNullParameter(targetIds, "targetIds");
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0OO0(msg, new MutableLiveData(), targetIds, midList, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendShareRoomMsg$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31439OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(ChatMessage chatMessage, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f31439OooO0Oo = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f31439OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String roomHeader;
            String roomName;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ArrayList midList = new ArrayList();
            ArrayList targetIds = new ArrayList();
            ChatMessage chatMessage = this.f31439OooO0Oo;
            ChatMessage.ShareRoomInfo shareRoomInfo = chatMessage.getShareRoomInfo();
            long roomId = shareRoomInfo != null ? shareRoomInfo.getRoomId() : 0L;
            ChatMessage.ShareRoomInfo shareRoomInfo2 = chatMessage.getShareRoomInfo();
            long roomIdx = shareRoomInfo2 != null ? shareRoomInfo2.getRoomIdx() : 0L;
            ChatMessage.ShareRoomInfo shareRoomInfo3 = chatMessage.getShareRoomInfo();
            String str = (shareRoomInfo3 == null || (roomName = shareRoomInfo3.getRoomName()) == null) ? "" : roomName;
            ChatMessage.ShareRoomInfo shareRoomInfo4 = chatMessage.getShareRoomInfo();
            ChatMessage msg = p414o0Oo0o0O.o000.OooOOo0(chatMessage.getTargetId(), roomId, roomIdx, str, (shareRoomInfo4 == null || (roomHeader = shareRoomInfo4.getRoomHeader()) == null) ? "" : roomHeader, (864 & 32) != 0 ? "" : null, (864 & 64) != 0 ? "" : null, (864 & 128) != 0 ? "" : chatMessage.getMid(), 0L, false);
            midList.add(new Pair(chatMessage.getMid(), ""));
            targetIds.add(Boxing.boxLong(chatMessage.getTargetId()));
            p414o0Oo0o0O.o000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(midList, "midList");
            Intrinsics.checkNotNullParameter(targetIds, "targetIds");
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0O0O(msg, new MutableLiveData(), targetIds, midList, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendTextMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31440OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(ChatMessage chatMessage, Continuation<? super Oooo0> continuation) {
            super(2, continuation);
            this.f31440OooO0Oo = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo0(this.f31440OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ChatMessage chatMessage = this.f31440OooO0Oo;
            ChatMessage msg = p414o0Oo0o0O.o000.OooOo(chatMessage.getTargetId(), chatMessage.getMessage(), chatMessage.getMid(), 0L, false, 56);
            p414o0Oo0o0O.o000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0OO(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendShareUserMsg$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31441OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(ChatMessage chatMessage, Continuation<? super Oooo000> continuation) {
            super(2, continuation);
            this.f31441OooO0Oo = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo000(this.f31441OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String userHead;
            String userName;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ArrayList midList = new ArrayList();
            ArrayList targetIds = new ArrayList();
            ChatMessage chatMessage = this.f31441OooO0Oo;
            ChatMessage.ShareUserInfo shareUserInfo = chatMessage.getShareUserInfo();
            long userId = shareUserInfo != null ? shareUserInfo.getUserId() : 0L;
            ChatMessage.ShareUserInfo shareUserInfo2 = chatMessage.getShareUserInfo();
            long userIdx = shareUserInfo2 != null ? shareUserInfo2.getUserIdx() : 0L;
            ChatMessage.ShareUserInfo shareUserInfo3 = chatMessage.getShareUserInfo();
            String str = (shareUserInfo3 == null || (userName = shareUserInfo3.getUserName()) == null) ? "" : userName;
            ChatMessage.ShareUserInfo shareUserInfo4 = chatMessage.getShareUserInfo();
            ChatMessage msg = p414o0Oo0o0O.o000.OooOo0(chatMessage.getTargetId(), userId, userIdx, str, (shareUserInfo4 == null || (userHead = shareUserInfo4.getUserHead()) == null) ? "" : userHead, (416 & 32) != 0 ? "" : null, (416 & 64) != 0 ? "" : chatMessage.getMid(), 0L, false);
            midList.add(new Pair(chatMessage.getMid(), ""));
            targetIds.add(Boxing.boxLong(chatMessage.getTargetId()));
            p414o0Oo0o0O.o000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(midList, "midList");
            Intrinsics.checkNotNullParameter(targetIds, "targetIds");
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new oo0o0O0(msg, new MutableLiveData(), targetIds, midList, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$updateVoiceFileName$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000OOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f31442OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f31443OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(String str, String str2, Continuation<? super o000OOo> continuation) {
            super(2, continuation);
            this.f31442OooO0Oo = str;
            this.f31443OooO0o0 = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000OOo(this.f31442OooO0Oo, this.f31443OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000OOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String mid = this.f31442OooO0Oo;
            Intrinsics.checkNotNullParameter(mid, "mid");
            String fileName = this.f31443OooO0o0;
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo0().OooOOo(mid, fileName);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendVoiceMessage$1$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000oOoO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31444OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PrivateChatVM f31445OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(ChatMessage chatMessage, PrivateChatVM privateChatVM, Continuation<? super o000oOoO> continuation) {
            super(2, continuation);
            this.f31444OooO0Oo = chatMessage;
            this.f31445OooO0o0 = privateChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000oOoO(this.f31444OooO0Oo, this.f31445OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000oOoO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String filename;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ChatMessage chatMessage = this.f31444OooO0Oo;
            ChatMessage.VoiceInfo voiceInfo = chatMessage.getVoiceInfo();
            if (voiceInfo == null || (filename = voiceInfo.getFilename()) == null) {
                filename = "";
            }
            String str = filename;
            ChatMessage.VoiceInfo voiceInfo2 = chatMessage.getVoiceInfo();
            this.f31445OooO0o0.sendVoiceMessage(p414o0Oo0o0O.o000.OooOoO0(chatMessage.getTargetId(), voiceInfo2 != null ? voiceInfo2.getVoiceDuration() : 0L, str, (104 & 8) != 0 ? "" : null, (104 & 16) != 0 ? "" : chatMessage.getMid(), 0L, false));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendEmotionMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f31447OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(int i, Continuation<? super o00O0O> continuation) {
            super(2, continuation);
            this.f31447OooO0o0 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new o00O0O(this.f31447OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00O0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ChatMessage msg = p414o0Oo0o0O.o000.OooO0oo(PrivateChatVM.this.getTargetId(), this.f31447OooO0o0, 0, "", 0L, false);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O000(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendGifMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31449OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f31450OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(int i, String str, Continuation<? super o00Oo0> continuation) {
            super(2, continuation);
            this.f31450OooO0o0 = i;
            this.f31449OooO0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new o00Oo0(this.f31450OooO0o0, this.f31449OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00Oo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ChatMessage msg = p414o0Oo0o0O.o000.OooOO0(PrivateChatVM.this.getTargetId(), this.f31450OooO0o0, this.f31449OooO0o, null, 56);
            p414o0Oo0o0O.o000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O000o(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendGiftMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f31452OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ GiftPropModel f31453OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(GiftPropModel giftPropModel, int i, Continuation<? super o00Ooo> continuation) {
            super(2, continuation);
            this.f31453OooO0o0 = giftPropModel;
            this.f31452OooO0o = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new o00Ooo(this.f31453OooO0o0, this.f31452OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00Ooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            long targetId = PrivateChatVM.this.getTargetId();
            GiftPropModel giftPropModel = this.f31453OooO0o0;
            ChatMessage msg = p414o0Oo0o0O.o000.OooOO0O(targetId, giftPropModel.getGiftId(), this.f31452OooO0o, giftPropModel.getImageUrl(), null, 0L, false, giftPropModel.isBlind(), giftPropModel.isBlind(), giftPropModel.isBackpack(), giftPropModel.isCustomMade(), 112);
            p414o0Oo0o0O.o000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O00o0(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendVoiceMessage$1$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00oO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31455OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f31456OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(String str, long j, Continuation<? super o00oO0o> continuation) {
            super(2, continuation);
            this.f31456OooO0o0 = str;
            this.f31455OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new o00oO0o(this.f31456OooO0o0, this.f31455OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00oO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            PrivateChatVM privateChatVM = PrivateChatVM.this;
            ChatMessage chatMessageOooOoO0 = p414o0Oo0o0O.o000.OooOoO0(privateChatVM.getTargetId(), this.f31455OooO0o / ((long) 1000), this.f31456OooO0o0, (104 & 8) != 0 ? "" : null, (104 & 16) != 0 ? "" : null, 0L, false);
            p414o0Oo0o0O.o000.OooO0oO(chatMessageOooOoO0);
            privateChatVM.sendVoiceMessage(chatMessageOooOoO0);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$updateVoice$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0O0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f31457OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f31458OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(long j, String str, Continuation continuation) {
            super(2, continuation);
            this.f31457OooO0Oo = str;
            this.f31458OooO0o0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0O0O00(this.f31458OooO0o0, this.f31457OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0O0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String mid = this.f31457OooO0Oo;
            Intrinsics.checkNotNullParameter(mid, "mid");
            p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo0().OooOOO0(mid);
            long j = this.f31458OooO0o0;
            String mid2 = this.f31457OooO0Oo;
            Intrinsics.checkNotNullParameter(mid2, "mid");
            o000000 o000000VarOooOOo = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo();
            Intrinsics.checkNotNullExpressionValue(o000000VarOooOOo, "conversationDao(...)");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            Long l = (Long) oo0oO0.OooOOo0().getValue();
            o000000VarOooOOo.OooOO0O(l == null ? 0L : l.longValue(), j, mid2, false);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$updateMsgMoment$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f31459OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31460OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f31461OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(String str, MomentDetailModel momentDetailModel, String str2, Continuation<? super o0OO00O> continuation) {
            super(2, continuation);
            this.f31459OooO0Oo = str;
            this.f31461OooO0o0 = momentDetailModel;
            this.f31460OooO0o = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OO00O(this.f31459OooO0Oo, this.f31461OooO0o0, this.f31460OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String mid = this.f31459OooO0Oo;
            Intrinsics.checkNotNullParameter(mid, "mid");
            p409o0Oo0Oo.Oooo000 oooo000OooOOo0 = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo0();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            Long l = (Long) oo0oO0.OooOOo0().getValue();
            ChatMessage.ShareMomentInfo shareMomentInfo = oooo000OooOOo0.OooOOOO(l == null ? 0L : l.longValue(), mid).getShareMomentInfo();
            String strOooOOO = com.code.android.util.o0OoOo0.OooOOO(shareMomentInfo != null ? shareMomentInfo.getMomentImage() : null, "");
            MomentDetailModel momentDetailModel = this.f31461OooO0o0;
            boolean z = true;
            if (!momentDetailModel.getImageInfoList().isEmpty()) {
                String url = momentDetailModel.getImageInfoList().get(0).getUrl();
                if (url != null && url.length() != 0) {
                    z = false;
                }
                if (!z) {
                    strOooOOO = momentDetailModel.getImageInfoList().get(0).getUrl();
                }
            }
            if (momentDetailModel.getType() == MomentType.Video.getValue()) {
                strOooOOO = momentDetailModel.getCoverPic();
            }
            String momentImage = strOooOOO;
            String mid2 = this.f31459OooO0Oo;
            long id = momentDetailModel.getId();
            String momentText = this.f31460OooO0o;
            int type = momentDetailModel.getType();
            Intrinsics.checkNotNullParameter(mid2, "mid");
            Intrinsics.checkNotNullParameter(momentImage, "momentImage");
            Intrinsics.checkNotNullParameter(momentText, "momentText");
            Intrinsics.checkNotNullParameter("", "momentMsg");
            p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo0().OooOOO(id, mid2, momentImage, momentText, type);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$updateConversationCount$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OOO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f31462OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(long j, Continuation<? super o0OOO0o> continuation) {
            super(2, continuation);
            this.f31462OooO0Oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OOO0o(this.f31462OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OOO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            long j = this.f31462OooO0Oo;
            o000000 o000000VarOooOOo = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo();
            Intrinsics.checkNotNullExpressionValue(o000000VarOooOOo, "conversationDao(...)");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            Long l = (Long) oo0oO0.OooOOo0().getValue();
            o000000VarOooOOo.OooOO0(0, l == null ? 0L : l.longValue(), j);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$updateEmotionMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f31463OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(long j, Continuation<? super o0Oo0oo> continuation) {
            super(2, continuation);
            this.f31463OooO0Oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0Oo0oo(this.f31463OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0Oo0oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            long j = this.f31463OooO0Oo;
            o000000 o000000VarOooOOo = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo();
            Intrinsics.checkNotNullExpressionValue(o000000VarOooOOo, "conversationDao(...)");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            Long l = (Long) oo0oO0.OooOOo0().getValue();
            o000000VarOooOOo.OooOOO(l == null ? 0L : l.longValue(), j, true, false);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$saveDraftMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OoOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f31465OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(String str, Continuation<? super o0OoOo0> continuation) {
            super(2, continuation);
            this.f31465OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new o0OoOo0(this.f31465OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OoOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            long targetId = PrivateChatVM.this.getTargetId();
            String str = this.f31465OooO0o0;
            if (str == null) {
                str = "";
            }
            String message = str;
            Intrinsics.checkNotNullParameter(message, "message");
            o000000 o000000VarOooOOo = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            Long l = (Long) oo0oO0.OooOOo0().getValue();
            o000000VarOooOOo.OooOOo0(l == null ? 0L : l.longValue(), targetId, message);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendVoiceMessage$2", f = "PrivateChatVM.kt", i = {}, l = {261, 268}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ChatMessage.VoiceInfo f31466OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f31467OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31468OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PrivateChatVM f31469OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(ChatMessage chatMessage, PrivateChatVM privateChatVM, Continuation<? super o0ooOOo> continuation) {
            super(2, continuation);
            this.f31467OooO0o = chatMessage;
            this.f31469OooO0oO = privateChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0ooOOo(this.f31467OooO0o, this.f31469OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0ooOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String filename;
            ChatMessage.VoiceInfo voiceInfo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31468OooO0o0;
            ChatMessage msg = this.f31467OooO0o;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    voiceInfo = this.f31466OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) obj;
                voiceInfo.setVoiceUrl(str != null ? str : "");
                Intrinsics.checkNotNullParameter(msg, "msg");
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0OOO(msg, new MutableLiveData(), null), 2, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ChatMessage.VoiceInfo voiceInfo2 = msg.getVoiceInfo();
            if (voiceInfo2 == null || (filename = voiceInfo2.getFilename()) == null) {
                filename = "";
            }
            CloudFileRepo cloudFileRepo = new CloudFileRepo();
            CloudFileType cloudFileType = CloudFileType.USER_CHAT_VOICE;
            File file = new File(filename);
            this.f31468OooO0o0 = 1;
            obj = CloudFileRepo.OooO0o0(cloudFileRepo, cloudFileType, file, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            p182o00o000O.OooO0o oooO0o = (p182o00o000O.OooO0o) obj;
            if ((oooO0o != null ? oooO0o.OooO00o() : null) == null) {
                String mid = msg.getMid();
                StatusEnum$MsgSendStatus state = StatusEnum$MsgSendStatus.QINIUFAIL;
                Intrinsics.checkNotNullParameter(mid, "mid");
                Intrinsics.checkNotNullParameter(state, "state");
                p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo0().OooO0o0(state.OooO00o(), mid);
                String mid2 = msg.getMid();
                Intrinsics.checkNotNullParameter(mid2, "mid");
                Intrinsics.checkNotNullParameter(state, "state");
                p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo().OooO0o0(state.OooO00o(), mid2);
            } else {
                String mid3 = msg.getMid();
                String voiceUrl = oooO0o.OooO00o();
                Intrinsics.checkNotNullParameter(mid3, "mid");
                Intrinsics.checkNotNullParameter(voiceUrl, "voiceUrl");
                p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo0().OooO0oO(mid3, voiceUrl);
                ChatMessage.VoiceInfo voiceInfo3 = msg.getVoiceInfo();
                if (voiceInfo3 != null) {
                    CloudFileRepo cloudFileRepo2 = this.f31469OooO0oO.cloudFileRepo;
                    this.f31466OooO0Oo = voiceInfo3;
                    this.f31468OooO0o0 = 2;
                    obj = cloudFileRepo2.OooO0OO(oooO0o.f38399OooO0O0, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    voiceInfo = voiceInfo3;
                    String str2 = (String) obj;
                    voiceInfo.setVoiceUrl(str2 != null ? str2 : "");
                }
                Intrinsics.checkNotNullParameter(msg, "msg");
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0OOO(msg, new MutableLiveData(), null), 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendTextMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f31471OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(String str, Continuation<? super oo000o> continuation) {
            super(2, continuation);
            this.f31471OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new oo000o(this.f31471OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((oo000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ChatMessage msg = p414o0Oo0o0O.o000.OooOo(PrivateChatVM.this.getTargetId(), this.f31471OooO0o0, null, 0L, false, 60);
            p414o0Oo0o0O.o000.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0OO(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$updateRiskFriend$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo0o0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public oo0o0Oo(Continuation<? super oo0o0Oo> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new oo0o0Oo(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((oo0o0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            long targetId = PrivateChatVM.this.getTargetId();
            o000 o000VarOooOOoo = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOoo();
            Intrinsics.checkNotNullExpressionValue(o000VarOooOOoo, "friendDao(...)");
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            o000VarOooOOoo.OooO0oo(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), targetId, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addChatMessageToYallaChatMessage$default(PrivateChatVM privateChatVM, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        privateChatVM.addChatMessageToYallaChatMessage(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void downloadVoice$lambda$4$lambda$3(MutableLiveData this_apply, ChatMessage chatDBModel, boolean z, String fileName) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(chatDBModel, "$chatDBModel");
        if (z && fileName != null) {
            String mid = chatDBModel.getMid();
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo0().OooOOo(mid, fileName);
        }
        this_apply.postValue(fileName);
    }

    public final void addChatMessageToYallaChatMessage(@Nullable Function1<? super Boolean, Unit> listener) {
        oO0OOo0o oo0ooo0oOooO0o0 = p417o0Oo0oO0.o00Oo0.OooO0o0();
        oo0ooo0oOooO0o0.getClass();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        if (!oo0ooo0oOooO0o0.OooO0O0("hideToYallaChat4ChatMessage" + oo0oO0.OooOOo0().getValue(), false) && com.code.android.util.o0OoOo0.OooO00o(this.isFriendLiveData.getValue())) {
            long j = this.targetId;
            Intrinsics.checkNotNullParameter("", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            Intrinsics.checkNotNullParameter("", "mid");
            ChatMessage chatMessageOooO0O0 = p414o0Oo0o0O.o000.OooO0O0(j, 0L, "", false);
            chatMessageOooO0O0.setMessage("");
            chatMessageOooO0O0.setWarn(false);
            chatMessageOooO0O0.setContentType(101);
            p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo0().OooO0oo(chatMessageOooO0O0);
            oO0OOo0o oo0ooo0oOooO0o1 = p417o0Oo0oO0.o00Oo0.OooO0o0();
            oo0ooo0oOooO0o1.getClass();
            o0000O0O.OooO0OO.OooO0OO("hideToYallaChat4ChatMessage", oo0oO0.OooOOo0().getValue(), oo0ooo0oOooO0o1, true);
        }
        if (listener != null) {
            listener.invoke(Boolean.valueOf(this.isFirstShowYallaChatButton));
        }
        this.isFirstShowYallaChatButton = false;
    }

    @NotNull
    public final LiveData<Boolean> checkUserRisk() {
        return com.code.android.util.o00oO0o.OooO00o(new OooO00o(null));
    }

    @NotNull
    public final MutableLiveData<String> downloadVoice(@NotNull final ChatMessage chatDBModel, @NotNull String url) {
        Intrinsics.checkNotNullParameter(chatDBModel, "chatDBModel");
        Intrinsics.checkNotNullParameter(url, "url");
        final MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        File file = o0oOo0O0.f47829OooO00o;
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(new File(androidx.camera.core.impl.OooOOOO.OooO00o(((File) o0oOo0O0.f47834OooO0o0.getValue()).getPath(), File.separator)));
        oooO00o.f37460OooO0Oo = new o0000O00() { // from class: o0oOoOo.o0oo0000
            @Override // p676oOooo0o.o0000O00
            public final void result(boolean z, Object obj) {
                PrivateChatVM.downloadVoice$lambda$4$lambda$3(mutableLiveData, chatDBModel, z, (String) obj);
            }
        };
        oooO00o.f37458OooO0O0 = url;
        oooO00o.execute(new String[0]);
        return mutableLiveData;
    }

    @Nullable
    public final o000O0o<Integer, ChatMessage> getChatMessage() {
        return this.chatMessage;
    }

    @NotNull
    public final LiveData<UserInfo> getChatUserInfo() {
        return this._chatUserInfo;
    }

    @NotNull
    public final String getFriendRemark() {
        return this.friendRemark;
    }

    @NotNull
    public final MutableLiveData<String> getFriendRemarkLiveData() {
        return this.friendRemarkLiveData;
    }

    @NotNull
    public final RoomUserInfoModel getGiftSendUser() {
        return this.giftSendUser;
    }

    public final boolean getLayoutYallaChatShowing() {
        return this.layoutYallaChatShowing;
    }

    @NotNull
    public final LiveData<Pair<Integer, ChatMessage>> getRoomThemeAccept() {
        return this._roomThemeAccept;
    }

    @NotNull
    public final LiveData<Pair<Integer, ChatMessage>> getRoomThemeGiveState() {
        return this._roomThemeGiveState;
    }

    public final long getTargetId() {
        return this.targetId;
    }

    /* JADX INFO: renamed from: isFriend, reason: from getter */
    public final boolean getIsFriend() {
        return this.isFriend;
    }

    @NotNull
    public final MutableLiveData<Boolean> isFriendLiveData() {
        return this.isFriendLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final LiveData<Conversation> loadConversation() {
        long j = this.targetId;
        o000000 o000000VarOooOOo = p410o0Oo0Oo0.o00O0O.OooO00o().OooOOo();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        Long l = (Long) oo0oO0.OooOOo0().getValue();
        return FlowLiveDataConversions.asLiveData$default(o000000VarOooOOo.OooO0oo(l == null ? 0L : l.longValue(), j), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    public final void loadData() {
        this.chatMessage = new o000O0o<>(ViewModelKt.getViewModelScope(this), new OooO0o());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOO0(null), 2, null);
    }

    public final void reSendGifMessage(@NotNull ChatMessage gifMessage) {
        Intrinsics.checkNotNullParameter(gifMessage, "gifMessage");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOO0O(gifMessage, null), 2, null);
    }

    public final void reSendGiftMessage(@NotNull ChatMessage giftMessage) {
        Intrinsics.checkNotNullParameter(giftMessage, "giftMessage");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOOO0(giftMessage, null), 2, null);
    }

    public final void reSendShareActivityMsg(@NotNull ChatMessage shareActivityMsg) {
        Intrinsics.checkNotNullParameter(shareActivityMsg, "shareActivityMsg");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOOO(shareActivityMsg, null), 2, null);
    }

    public final void reSendShareMomentMsg(@NotNull ChatMessage shareMomentMessage) {
        Intrinsics.checkNotNullParameter(shareMomentMessage, "shareMomentMessage");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOOOO(shareMomentMessage, null), 2, null);
    }

    public final void reSendShareRoomMsg(@NotNull ChatMessage shareRoomMessage) {
        Intrinsics.checkNotNullParameter(shareRoomMessage, "shareRoomMessage");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOo00(shareRoomMessage, null), 2, null);
    }

    public final void reSendShareTopicMsg(@NotNull ChatMessage shareTopicMessage) {
        Intrinsics.checkNotNullParameter(shareTopicMessage, "shareTopicMessage");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOo(shareTopicMessage, null), 2, null);
    }

    public final void reSendShareUserMsg(@NotNull ChatMessage shareUserMessage) {
        Intrinsics.checkNotNullParameter(shareUserMessage, "shareUserMessage");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new Oooo000(shareUserMessage, null), 2, null);
    }

    public final void reSendTextMessage(@NotNull ChatMessage textMessage) {
        Intrinsics.checkNotNullParameter(textMessage, "textMessage");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new Oooo0(textMessage, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> reSendVoiceMessage(@NotNull ChatMessage voiceMessage) {
        Intrinsics.checkNotNullParameter(voiceMessage, "voiceMessage");
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o000oOoO(voiceMessage, this, null), 2, null);
        return mutableLiveData;
    }

    public final void saveDraftMessage(@Nullable String message) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o0OoOo0(message, null), 2, null);
    }

    public final void sendEmotionMessage(int emotionType) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o00O0O(emotionType, null), 2, null);
    }

    public final boolean sendFilter() {
        if (userInfo() == null) {
            return false;
        }
        UserInfo userInfo = userInfo();
        Intrinsics.checkNotNull(userInfo);
        String strOooO00o = o00oOoo.OooO00o(userInfo.getUserId());
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        boolean z = true;
        if (!p495o0o00OOO.Oooo000.OooO00o(strOooO00o)) {
            return true;
        }
        String strOooO0OO = o0000.OooO0OO(p565o0oOo000.o000OOo.cannot_chat_self);
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (!z) {
            o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
            }
        }
        return false;
    }

    public final void sendGifMessage(int gifId, @NotNull String gifUrl) {
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o00Oo0(gifId, gifUrl, null), 2, null);
    }

    public final void sendGiftMessage(@NotNull GiftPropModel gift, int giftNumber) {
        Intrinsics.checkNotNullParameter(gift, "gift");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o00Ooo(gift, giftNumber, null), 2, null);
    }

    public final void sendTextMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new oo000o(message, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> sendVoiceMessage(@NotNull String fileName, long voiceDuration) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00oO0o(fileName, voiceDuration, null), 2, null);
        return mutableLiveData;
    }

    public final void setChatMessage(@Nullable o000O0o<Integer, ChatMessage> o000o0o2) {
        this.chatMessage = o000o0o2;
    }

    public final void setFriend(boolean z) {
        this.isFriend = z;
    }

    public final void setFriendLiveData(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isFriendLiveData = mutableLiveData;
    }

    public final void setFriendRemark(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.friendRemark = str;
    }

    public final void setFriendRemarkLiveData(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.friendRemarkLiveData = mutableLiveData;
    }

    public final void setLayoutYallaChatShowing(boolean z) {
        this.layoutYallaChatShowing = z;
    }

    public final void setTargetId(long j) {
        this.targetId = j;
        loadData();
    }

    public final void updateConversationCount(long targetId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o0OOO0o(targetId, null), 2, null);
    }

    public final void updateEmotionMessage(long targetId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new o0Oo0oo(targetId, null), 3, null);
    }

    public final void updateMsgMoment(@Nullable String mid, @NotNull MomentDetailModel momentDetail, @NotNull String momentText) {
        Intrinsics.checkNotNullParameter(momentDetail, "momentDetail");
        Intrinsics.checkNotNullParameter(momentText, "momentText");
        if (mid == null || mid.length() == 0) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o0OO00O(mid, momentDetail, momentText, null), 2, null);
    }

    public final void updateRiskFriend() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new oo0o0Oo(null), 2, null);
    }

    public final void updateVoice(long targetId, @NotNull String mid) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o0O0O00(targetId, mid, null), 2, null);
    }

    public final void updateVoiceFileName(@NotNull String mid, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o000OOo(mid, fileName, null), 2, null);
    }

    @Nullable
    public final UserInfo userInfo() {
        return getChatUserInfo().getValue();
    }

    public final void getRoomThemeAccept(@NotNull ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0O0(chatMessage, this, null), 2, null);
    }

    public final void getRoomThemeGiveState(@NotNull ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0OO(chatMessage, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendVoiceMessage(ChatMessage chatMessage) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0ooOOo(chatMessage, this, null), 2, null);
    }
}
