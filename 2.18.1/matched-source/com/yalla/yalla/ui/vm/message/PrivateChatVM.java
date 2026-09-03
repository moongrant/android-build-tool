package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.app.base.constants.StatusEnum$MsgSendStatus;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.db.table.Friend;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.manager.cloud_file.CloudFile;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.repository.CloudFileRepo;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.RoomThemeAccept;
import com.yalla.yalla.model.RoomThemeGiveState;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O00o0;
import p142o00OOooO.o000OO00;
import p142o00OOooO.o000OOo0;
import p254o00ooO0O.o0000O0O;
import p464o0Ooo0oO.o0000O;
import p520o0o0O0O0.o0000;
import p520o0o0O0O0.o000000O;
import p520o0o0O0O0.o00000O0;
import p520o0o0O0O0.o00000OO;
import p520o0o0O0O0.o0000O0;
import p520o0o0O0O0.o0000O00;
import p520o0o0O0O0.o0000Ooo;
import p520o0o0O0O0.o0000oo;
import p520o0o0O0O0.o00OO;
import p520o0o0O0O0.oo0O;
import p522o0o0O0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bk\u0010lJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\b\u001a\u00020\u0004J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\tJ\u0010\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000eJ-\u0010 \u001a\u00020\u00042%\b\u0002\u0010\u001f\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001bJ\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0$2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\fJ\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0$2\u0006\u0010%\u001a\u00020\u0002J \u0010*\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u000eJ\u000e\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+J\u0016\u00100\u001a\u00020\u00042\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\u000eJ\u000e\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0002J.\u00107\u001a\u00020\u00042\u0006\u00103\u001a\u00020+2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020+J\u000e\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0002J\u000e\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0002J\u000e\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0002J\u000e\u0010?\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0002J\u000e\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0002J\u000e\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0002J\u001e\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0$2\u0006\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u000eJ\u000e\u0010G\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010H\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR(\u0010N\u001a\b\u0012\u0004\u0012\u00020\n0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000e0$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010M\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR*\u0010\r\u001a\u00020\f2\u0006\u0010U\u001a\u00020\f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR(\u0010\\\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0002\u0018\u00010[0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010MR(\u0010]\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0002\u0018\u00010[0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010MR\u0016\u0010^\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0019\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t8F¢\u0006\u0006\u001a\u0004\b`\u0010aR0\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0002\u0018\u00010c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR%\u0010i\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0002\u0018\u00010[0\t8F¢\u0006\u0006\u001a\u0004\bG\u0010aR%\u0010j\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0002\u0018\u00010[0\t8F¢\u0006\u0006\u001a\u0004\bH\u0010a¨\u0006m"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/PrivateChatVM;", "Lo00OO/OooO00o;", "Lcom/yalla/yalla/common/db/table/ChatMessage;", "chatMessage", "", "sendVoiceMessage", "Lcom/yalla/yalla/common/db/table/UserInfo;", "userInfo", "loadData", "Landroidx/lifecycle/LiveData;", "", "checkUserRisk", "", "targetId", "", "mid", "updateVoice", "fileName", "updateVoiceFileName", "updateConversationCount", "updateEmotionMessage", "updateRiskFriend", "Lcom/yalla/yalla/common/db/table/Conversation;", "loadConversation", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "saveDraftMessage", "sendTextMessage", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isFirstShow", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addChatMessageToYallaChatMessage", "textMessage", "reSendTextMessage", "voiceDuration", "Landroidx/lifecycle/MutableLiveData;", "voiceMessage", "reSendVoiceMessage", "Lcom/yalla/yalla/model/MomentDetailModel;", "momentDetail", "momentText", "updateMsgMoment", "", "emotionType", "sendEmotionMessage", "gifId", "gifUrl", "sendGifMessage", "gifMessage", "reSendGifMessage", "giftId", "isGiftBlind", "isGiftCustomMade", "giftNumber", "sendGiftMessage", "giftMessage", "reSendGiftMessage", "shareRoomMessage", "reSendShareRoomMsg", "shareMomentMessage", "reSendShareMomentMsg", "shareTopicMessage", "reSendShareTopicMsg", "shareUserMessage", "reSendShareUserMsg", "shareActivityMsg", "reSendShareActivityMsg", "chatDBModel", "url", "downloadVoice", "getRoomThemeGiveState", "getRoomThemeAccept", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "_chatUserInfo", "Landroidx/lifecycle/MutableLiveData;", "isFriendLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setFriendLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "friendRemarkLiveData", "getFriendRemarkLiveData", "setFriendRemarkLiveData", AppMeasurementSdk.ConditionalUserProperty.VALUE, "J", "getTargetId", "()J", "setTargetId", "(J)V", "Lkotlin/Pair;", "_roomThemeGiveState", "_roomThemeAccept", "isFirstShowYallaChatButton", "Z", "getChatUserInfo", "()Landroidx/lifecycle/LiveData;", "chatUserInfo", "Lo0Ooo0oO/o0000O;", "Lo0Ooo0oO/o0000O;", "getChatMessage", "()Lo0Ooo0oO/o0000O;", "setChatMessage", "(Lo0Ooo0oO/o0000O;)V", "roomThemeGiveState", "roomThemeAccept", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PrivateChatVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @Nullable
    private o0000O<Integer, ChatMessage> chatMessage;
    private long targetId;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @NotNull
    private MutableLiveData<UserInfo> _chatUserInfo = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> isFriendLiveData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<String> friendRemarkLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<Integer, ChatMessage>> _roomThemeGiveState = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Pair<Integer, ChatMessage>> _roomThemeAccept = new MutableLiveData<>();
    private boolean isFirstShowYallaChatButton = true;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$loadData$2", f = "PrivateChatVM.kt", i = {}, l = {88, 94}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25612Oooo0o;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$loadData$2$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<UserInfo, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public /* synthetic */ Object f25614Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ PrivateChatVM f25615Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PrivateChatVM privateChatVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25615Oooo0oO = privateChatVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f25615Oooo0oO, continuation);
                oooO00o.f25614Oooo0o = obj;
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
                UserInfo userInfo = (UserInfo) this.f25614Oooo0o;
                this.f25615Oooo0oO._chatUserInfo.postValue(userInfo);
                String value = this.f25615Oooo0oO.getFriendRemarkLiveData().getValue();
                if ((value == null || value.length() == 0) && userInfo != null) {
                    this.f25615Oooo0oO.getFriendRemarkLiveData().postValue(userInfo.getUserName());
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$loadData$2$2", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public /* synthetic */ Object f25616Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ PrivateChatVM f25617Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PrivateChatVM privateChatVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f25617Oooo0oO = privateChatVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f25617Oooo0oO, continuation);
                oooO0O0.f25616Oooo0o = obj;
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
                String str = (String) this.f25616Oooo0o;
                if (!(str == null || str.length() == 0)) {
                    this.f25617Oooo0oO.getFriendRemarkLiveData().postValue(str);
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
            int i = this.f25612Oooo0o;
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
            PrivateChatVM.this.getFriendRemarkLiveData().postValue("");
            Flow flow = FlowKt.flow(new o00OO(PrivateChatVM.this.getTargetId(), null));
            OooO00o oooO00o = new OooO00o(PrivateChatVM.this, null);
            this.f25612Oooo0o = 1;
            if (FlowKt.collectLatest(flow, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Flow<String> flowOooO00o = p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooO00o(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue(), PrivateChatVM.this.getTargetId());
            OooO0O0 oooO0O0 = new OooO0O0(PrivateChatVM.this, null);
            this.f25612Oooo0o = 2;
            if (FlowKt.collectLatest(flowOooO00o, oooO0O0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$checkUserRisk$1", f = "PrivateChatVM.kt", i = {0, 2, 2, 3}, l = {110, 115, 118, 121, 123, 125}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", "friendByDB", "$this$liveDataAsync"}, s = {"L$0", "L$0", "L$1", "L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Friend f25619Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25620Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f25621Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = PrivateChatVM.this.new OooO00o(continuation);
            oooO00o.f25621Oooo0oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005a  */
        /* JADX WARN: Code duplicated, block: B:18:0x005d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0098 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d2 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d7 A[DONT_INVERT, PHI: r1 r11
          0x00d7: PHI (r1v8 androidx.lifecycle.LiveDataScope) = (r1v4 androidx.lifecycle.LiveDataScope), (r1v10 androidx.lifecycle.LiveDataScope) binds: [B:30:0x00bb, B:35:0x00d5] A[DONT_GENERATE, DONT_INLINE]
          0x00d7: PHI (r11v19 com.yalla.yalla.common.db.table.Friend) = (r11v17 com.yalla.yalla.common.db.table.Friend), (r11v29 com.yalla.yalla.common.db.table.Friend) binds: [B:30:0x00bb, B:35:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:43:0x0102 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x010b  */
        /* JADX WARN: Code duplicated, block: B:49:0x011f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:50:0x0120  */
        /* JADX WARN: Code duplicated, block: B:52:0x0131 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException, BadPaddingException, IllegalBlockSizeException {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            Integer num;
            Boolean boolBoxBoolean;
            Friend friendOooO0Oo;
            oo0O oo0o;
            long targetId;
            LiveDataScope liveDataScope2;
            Friend friend;
            Boolean boolBoxBoolean2;
            Boolean boolBoxBoolean3;
            boolean zBooleanValue;
            Boolean boolBoxBoolean4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f25620Oooo0oO) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    LiveDataScope liveDataScope3 = (LiveDataScope) this.f25621Oooo0oo;
                    p520o0o0O0O0.o00O0O o00o0o2 = p520o0o0O0O0.o00O0O.f42677OooO00o;
                    long targetId2 = PrivateChatVM.this.getTargetId();
                    this.f25621Oooo0oo = liveDataScope3;
                    this.f25620Oooo0oO = 1;
                    Object objOooO00o = o00o0o2.OooO00o(targetId2, this);
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
                        friendOooO0Oo = p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooO0Oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue(), PrivateChatVM.this.getTargetId());
                        if (friendOooO0Oo == null) {
                            oo0o = oo0O.f42896OooO00o;
                            targetId = PrivateChatVM.this.getTargetId();
                            this.f25621Oooo0oo = liveDataScope;
                            this.f25619Oooo0o = friendOooO0Oo;
                            this.f25620Oooo0oO = 3;
                            if (oo0o.OooOO0O(targetId, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            liveDataScope2 = liveDataScope;
                            friend = friendOooO0Oo;
                            friendOooO0Oo = friend;
                            liveDataScope = liveDataScope2;
                            if (friendOooO0Oo != null) {
                                boolBoxBoolean2 = Boxing.boxBoolean(friendOooO0Oo.getIsCheckUserRisk());
                            } else {
                                boolBoxBoolean2 = null;
                            }
                            if (Intrinsics.areEqual(boolBoxBoolean2, Boxing.boxBoolean(false))) {
                                p520o0o0O0O0.o0OOO0o o0ooo0o2 = p520o0o0O0O0.o0OOO0o.f42810OooO00o;
                                long targetId3 = PrivateChatVM.this.getTargetId();
                                this.f25621Oooo0oo = liveDataScope;
                                this.f25619Oooo0o = null;
                                this.f25620Oooo0oO = 4;
                                obj = o0ooo0o2.OooO0Oo(targetId3, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                if (!zBooleanValue) {
                                    PrivateChatVM.this.updateRiskFriend();
                                }
                                boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                                this.f25621Oooo0oo = null;
                                this.f25620Oooo0oO = 5;
                                if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                boolBoxBoolean3 = Boxing.boxBoolean(false);
                                this.f25621Oooo0oo = null;
                                this.f25619Oooo0o = null;
                                this.f25620Oooo0oO = 6;
                                if (liveDataScope.emit(boolBoxBoolean3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (friendOooO0Oo != null) {
                                boolBoxBoolean2 = Boxing.boxBoolean(friendOooO0Oo.getIsCheckUserRisk());
                            } else {
                                boolBoxBoolean2 = null;
                            }
                            if (Intrinsics.areEqual(boolBoxBoolean2, Boxing.boxBoolean(false))) {
                                p520o0o0O0O0.o0OOO0o o0ooo0o3 = p520o0o0O0O0.o0OOO0o.f42810OooO00o;
                                long targetId4 = PrivateChatVM.this.getTargetId();
                                this.f25621Oooo0oo = liveDataScope;
                                this.f25619Oooo0o = null;
                                this.f25620Oooo0oO = 4;
                                obj = o0ooo0o3.OooO0Oo(targetId4, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                if (!zBooleanValue) {
                                    PrivateChatVM.this.updateRiskFriend();
                                }
                                boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                                this.f25621Oooo0oo = null;
                                this.f25620Oooo0oO = 5;
                                if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                boolBoxBoolean3 = Boxing.boxBoolean(false);
                                this.f25621Oooo0oo = null;
                                this.f25619Oooo0o = null;
                                this.f25620Oooo0oO = 6;
                                if (liveDataScope.emit(boolBoxBoolean3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    } else {
                        p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue(), PrivateChatVM.this.getTargetId());
                        boolBoxBoolean = Boxing.boxBoolean(false);
                        this.f25621Oooo0oo = null;
                        this.f25620Oooo0oO = 2;
                        if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    liveDataScope = (LiveDataScope) this.f25621Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (!apiResult.isSuccess()) {
                        return Unit.INSTANCE;
                    }
                    num = (Integer) apiResult.getData();
                    if (num != null) {
                        friendOooO0Oo = p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooO0Oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue(), PrivateChatVM.this.getTargetId());
                        if (friendOooO0Oo == null) {
                            oo0o = oo0O.f42896OooO00o;
                            targetId = PrivateChatVM.this.getTargetId();
                            this.f25621Oooo0oo = liveDataScope;
                            this.f25619Oooo0o = friendOooO0Oo;
                            this.f25620Oooo0oO = 3;
                            if (oo0o.OooOO0O(targetId, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            liveDataScope2 = liveDataScope;
                            friend = friendOooO0Oo;
                            friendOooO0Oo = friend;
                            liveDataScope = liveDataScope2;
                            if (friendOooO0Oo != null) {
                                boolBoxBoolean2 = Boxing.boxBoolean(friendOooO0Oo.getIsCheckUserRisk());
                            } else {
                                boolBoxBoolean2 = null;
                            }
                            if (Intrinsics.areEqual(boolBoxBoolean2, Boxing.boxBoolean(false))) {
                                p520o0o0O0O0.o0OOO0o o0ooo0o4 = p520o0o0O0O0.o0OOO0o.f42810OooO00o;
                                long targetId5 = PrivateChatVM.this.getTargetId();
                                this.f25621Oooo0oo = liveDataScope;
                                this.f25619Oooo0o = null;
                                this.f25620Oooo0oO = 4;
                                obj = o0ooo0o4.OooO0Oo(targetId5, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                if (!zBooleanValue) {
                                    PrivateChatVM.this.updateRiskFriend();
                                }
                                boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                                this.f25621Oooo0oo = null;
                                this.f25620Oooo0oO = 5;
                                if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                boolBoxBoolean3 = Boxing.boxBoolean(false);
                                this.f25621Oooo0oo = null;
                                this.f25619Oooo0o = null;
                                this.f25620Oooo0oO = 6;
                                if (liveDataScope.emit(boolBoxBoolean3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            if (friendOooO0Oo != null) {
                                boolBoxBoolean2 = Boxing.boxBoolean(friendOooO0Oo.getIsCheckUserRisk());
                            } else {
                                boolBoxBoolean2 = null;
                            }
                            if (Intrinsics.areEqual(boolBoxBoolean2, Boxing.boxBoolean(false))) {
                                p520o0o0O0O0.o0OOO0o o0ooo0o5 = p520o0o0O0O0.o0OOO0o.f42810OooO00o;
                                long targetId6 = PrivateChatVM.this.getTargetId();
                                this.f25621Oooo0oo = liveDataScope;
                                this.f25619Oooo0o = null;
                                this.f25620Oooo0oO = 4;
                                obj = o0ooo0o5.OooO0Oo(targetId6, this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                if (!zBooleanValue) {
                                    PrivateChatVM.this.updateRiskFriend();
                                }
                                boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                                this.f25621Oooo0oo = null;
                                this.f25620Oooo0oO = 5;
                                if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                boolBoxBoolean3 = Boxing.boxBoolean(false);
                                this.f25621Oooo0oo = null;
                                this.f25619Oooo0o = null;
                                this.f25620Oooo0oO = 6;
                                if (liveDataScope.emit(boolBoxBoolean3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue(), PrivateChatVM.this.getTargetId());
                    boolBoxBoolean = Boxing.boxBoolean(false);
                    this.f25621Oooo0oo = null;
                    this.f25620Oooo0oO = 2;
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
                    friend = this.f25619Oooo0o;
                    liveDataScope2 = (LiveDataScope) this.f25621Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    friendOooO0Oo = friend;
                    liveDataScope = liveDataScope2;
                    if (friendOooO0Oo != null) {
                        boolBoxBoolean2 = Boxing.boxBoolean(friendOooO0Oo.getIsCheckUserRisk());
                    } else {
                        boolBoxBoolean2 = null;
                    }
                    if (Intrinsics.areEqual(boolBoxBoolean2, Boxing.boxBoolean(false))) {
                        p520o0o0O0O0.o0OOO0o o0ooo0o6 = p520o0o0O0O0.o0OOO0o.f42810OooO00o;
                        long targetId7 = PrivateChatVM.this.getTargetId();
                        this.f25621Oooo0oo = liveDataScope;
                        this.f25619Oooo0o = null;
                        this.f25620Oooo0oO = 4;
                        obj = o0ooo0o6.OooO0Oo(targetId7, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!zBooleanValue) {
                            PrivateChatVM.this.updateRiskFriend();
                        }
                        boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                        this.f25621Oooo0oo = null;
                        this.f25620Oooo0oO = 5;
                        if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        boolBoxBoolean3 = Boxing.boxBoolean(false);
                        this.f25621Oooo0oo = null;
                        this.f25619Oooo0o = null;
                        this.f25620Oooo0oO = 6;
                        if (liveDataScope.emit(boolBoxBoolean3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                case 4:
                    liveDataScope = (LiveDataScope) this.f25621Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (!zBooleanValue) {
                        PrivateChatVM.this.updateRiskFriend();
                    }
                    boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
                    this.f25621Oooo0oo = null;
                    this.f25620Oooo0oO = 5;
                    if (liveDataScope.emit(boolBoxBoolean4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$getRoomThemeAccept$1", f = "PrivateChatVM.kt", i = {}, l = {467}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25622Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25623Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ PrivateChatVM f25624Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ChatMessage chatMessage, PrivateChatVM privateChatVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25623Oooo0oO = chatMessage;
            this.f25624Oooo0oo = privateChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25623Oooo0oO, this.f25624Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25622Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
                ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = this.f25623Oooo0oO.getGiveRoomThemeInfo();
                long themeGiveId = giveRoomThemeInfo != null ? giveRoomThemeInfo.getThemeGiveId() : 0L;
                String mid = this.f25623Oooo0oO.getMid();
                this.f25622Oooo0o = 1;
                obj = oooOOO.OooO0Oo(themeGiveId, mid, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PrivateChatVM privateChatVM = this.f25624Oooo0oo;
            ChatMessage chatMessage = this.f25623Oooo0oO;
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$getRoomThemeGiveState$1", f = "PrivateChatVM.kt", i = {}, l = {430}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25625Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25626Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ PrivateChatVM f25627Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ChatMessage chatMessage, PrivateChatVM privateChatVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25626Oooo0oO = chatMessage;
            this.f25627Oooo0oo = privateChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f25626Oooo0oO, this.f25627Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25625Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
                ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = this.f25626Oooo0oO.getGiveRoomThemeInfo();
                long themeGiveId = giveRoomThemeInfo != null ? giveRoomThemeInfo.getThemeGiveId() : 0L;
                String mid = this.f25626Oooo0oO.getMid();
                ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo2 = this.f25626Oooo0oO.getGiveRoomThemeInfo();
                int themeState = giveRoomThemeInfo2 != null ? giveRoomThemeInfo2.getThemeState() : ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeNotReceive.getValue();
                this.f25625Oooo0o = 1;
                obj = oooOOO.OooO0o0(themeGiveId, mid, themeState, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PrivateChatVM privateChatVM = this.f25627Oooo0oo;
            ChatMessage chatMessage = this.f25626Oooo0oO;
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
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

    public static final class OooO0o extends Lambda implements Function0<o00O00o0<Integer, ChatMessage>> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, ChatMessage> invoke() {
            long targetId = PrivateChatVM.this.getTargetId();
            p490o0o00O0.OooOOO OooOOo2 = p491o0o00O00.OooO0OO.OooO00o().OooOOo();
            Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
            return OooOOo2.OooOOo(value == null ? 0L : value.longValue(), targetId);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$loadData$3", f = "PrivateChatVM.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25629Oooo0o;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$loadData$3$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<Friend, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public /* synthetic */ Object f25631Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ PrivateChatVM f25632Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(PrivateChatVM privateChatVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25632Oooo0oO = privateChatVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f25632Oooo0oO, continuation);
                oooO00o.f25631Oooo0o = obj;
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
                this.f25632Oooo0oO.isFriendLiveData().postValue(Boxing.boxBoolean(((Friend) this.f25631Oooo0o) != null));
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
            int i = this.f25629Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PrivateChatVM.this.isFriendLiveData().postValue(Boxing.boxBoolean(false));
                Flow<Friend> flowOooOOo = p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue(), PrivateChatVM.this.getTargetId());
                OooO00o oooO00o = new OooO00o(PrivateChatVM.this, null);
                this.f25629Oooo0o = 1;
                if (FlowKt.collectLatest(flowOooOOo, oooO00o, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25633Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(ChatMessage chatMessage, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f25633Oooo0o = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f25633Oooo0o, continuation);
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
            ChatMessage.GifInfo gifInfo = this.f25633Oooo0o.getGifInfo();
            int gifId = gifInfo != null ? gifInfo.getGifId() : 0;
            ChatMessage.GifInfo gifInfo2 = this.f25633Oooo0o.getGifInfo();
            if (gifInfo2 == null || (gifUrl = gifInfo2.getGifUrl()) == null) {
                gifUrl = "";
            }
            String str = gifUrl;
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage msg = p520o0o0O0O0.OooOOO.OooOO0(this.f25633Oooo0o.getTargetId(), gifId, str, this.f25633Oooo0o.getMid(), 48);
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new p520o0o0O0O0.o0O0O00(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendShareActivityMsg$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25634Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(ChatMessage chatMessage, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f25634Oooo0o = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f25634Oooo0o, continuation);
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
            ChatMessage.ShareActivityInfo shareActivityInfo = this.f25634Oooo0o.getShareActivityInfo();
            String str = (shareActivityInfo == null || (activityImage = shareActivityInfo.getActivityImage()) == null) ? "" : activityImage;
            ChatMessage.ShareActivityInfo shareActivityInfo2 = this.f25634Oooo0o.getShareActivityInfo();
            String str2 = (shareActivityInfo2 == null || (activityText1 = shareActivityInfo2.getActivityText1()) == null) ? "" : activityText1;
            ChatMessage.ShareActivityInfo shareActivityInfo3 = this.f25634Oooo0o.getShareActivityInfo();
            String str3 = (shareActivityInfo3 == null || (activityText2 = shareActivityInfo3.getActivityText2()) == null) ? "" : activityText2;
            ChatMessage.ShareActivityInfo shareActivityInfo4 = this.f25634Oooo0o.getShareActivityInfo();
            String str4 = (shareActivityInfo4 == null || (activityUrl = shareActivityInfo4.getActivityUrl()) == null) ? "" : activityUrl;
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage msg = p520o0o0O0O0.OooOOO.f42227OooO00o.OooOO0o(this.f25634Oooo0o.getTargetId(), str, str2, str3, str4, (448 & 32) != 0 ? "" : null, (448 & 64) != 0 ? "" : this.f25634Oooo0o.getMid(), 0L, false);
            midList.add(new Pair(this.f25634Oooo0o.getMid(), ""));
            targetIds.add(Boxing.boxLong(this.f25634Oooo0o.getTargetId()));
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(midList, "midList");
            Intrinsics.checkNotNullParameter(targetIds, "targetIds");
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00000O0(msg, new MutableLiveData(), targetIds, midList, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendGiftMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25635Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(ChatMessage chatMessage, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f25635Oooo0o = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f25635Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String giftUrl;
            Boolean isGiftCustomMade;
            Boolean isGiftBlind;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ChatMessage.GiftInfo giftInfo = this.f25635Oooo0o.getGiftInfo();
            int giftId = giftInfo != null ? giftInfo.getGiftId() : 0;
            ChatMessage.GiftInfo giftInfo2 = this.f25635Oooo0o.getGiftInfo();
            int giftNumber = giftInfo2 != null ? giftInfo2.getGiftNumber() : 0;
            ChatMessage.GiftInfo giftInfo3 = this.f25635Oooo0o.getGiftInfo();
            if (giftInfo3 == null || (giftUrl = giftInfo3.getGiftUrl()) == null) {
                giftUrl = "";
            }
            String str = giftUrl;
            ChatMessage.GiftInfo giftInfo4 = this.f25635Oooo0o.getGiftInfo();
            boolean zBooleanValue = (giftInfo4 == null || (isGiftBlind = giftInfo4.getIsGiftBlind()) == null) ? false : isGiftBlind.booleanValue();
            ChatMessage.GiftInfo giftInfo5 = this.f25635Oooo0o.getGiftInfo();
            boolean zBooleanValue2 = (giftInfo5 == null || (isGiftCustomMade = giftInfo5.getIsGiftCustomMade()) == null) ? false : isGiftCustomMade.booleanValue();
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage msg = p520o0o0O0O0.OooOOO.OooOO0O(this.f25635Oooo0o.getTargetId(), giftId, giftNumber, str, this.f25635Oooo0o.getMid(), 0L, false, zBooleanValue, zBooleanValue2, 96);
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o000000O(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendShareMomentMsg$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25636Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(ChatMessage chatMessage, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f25636Oooo0o = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f25636Oooo0o, continuation);
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
            ChatMessage.ShareMomentInfo shareMomentInfo = this.f25636Oooo0o.getShareMomentInfo();
            long momentId = shareMomentInfo != null ? shareMomentInfo.getMomentId() : 0L;
            ChatMessage.ShareMomentInfo shareMomentInfo2 = this.f25636Oooo0o.getShareMomentInfo();
            String str = (shareMomentInfo2 == null || (momentImage = shareMomentInfo2.getMomentImage()) == null) ? "" : momentImage;
            ChatMessage.ShareMomentInfo shareMomentInfo3 = this.f25636Oooo0o.getShareMomentInfo();
            String str2 = (shareMomentInfo3 == null || (momentText = shareMomentInfo3.getMomentText()) == null) ? "" : momentText;
            ChatMessage.ShareMomentInfo shareMomentInfo4 = this.f25636Oooo0o.getShareMomentInfo();
            int momentType = shareMomentInfo4 != null ? shareMomentInfo4.getMomentType() : 0;
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage msg = p520o0o0O0O0.OooOOO.f42227OooO00o.OooOOOO(this.f25636Oooo0o.getTargetId(), momentId, str, str2, momentType, (448 & 32) != 0 ? "" : null, (448 & 64) != 0 ? "" : this.f25636Oooo0o.getMid(), 0L, false);
            midList.add(new Pair(this.f25636Oooo0o.getMid(), ""));
            targetIds.add(Boxing.boxLong(this.f25636Oooo0o.getTargetId()));
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(midList, "midList");
            Intrinsics.checkNotNullParameter(targetIds, "targetIds");
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00000OO(msg, new MutableLiveData(), targetIds, midList, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendShareTopicMsg$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25637Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(ChatMessage chatMessage, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f25637Oooo0o = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo(this.f25637Oooo0o, continuation);
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
            ChatMessage.ShareTopicInfo shareTopicInfo = this.f25637Oooo0o.getShareTopicInfo();
            long topicId = shareTopicInfo != null ? shareTopicInfo.getTopicId() : 0L;
            ChatMessage.ShareTopicInfo shareTopicInfo2 = this.f25637Oooo0o.getShareTopicInfo();
            String str = (shareTopicInfo2 == null || (topicImage = shareTopicInfo2.getTopicImage()) == null) ? "" : topicImage;
            ChatMessage.ShareTopicInfo shareTopicInfo3 = this.f25637Oooo0o.getShareTopicInfo();
            String str2 = (shareTopicInfo3 == null || (topicName = shareTopicInfo3.getTopicName()) == null) ? "" : topicName;
            ChatMessage.ShareTopicInfo shareTopicInfo4 = this.f25637Oooo0o.getShareTopicInfo();
            int topicUserCount = shareTopicInfo4 != null ? shareTopicInfo4.getTopicUserCount() : 0;
            ChatMessage.ShareTopicInfo shareTopicInfo5 = this.f25637Oooo0o.getShareTopicInfo();
            int topicMomentCount = shareTopicInfo5 != null ? shareTopicInfo5.getTopicMomentCount() : 0;
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage msg = p520o0o0O0O0.OooOOO.f42227OooO00o.OooOOoo(this.f25637Oooo0o.getTargetId(), topicId, str, str2, topicUserCount, topicMomentCount, (896 & 64) != 0 ? "" : null, (896 & 128) != 0 ? "" : this.f25637Oooo0o.getMid(), 0L, false);
            midList.add(new Pair(this.f25637Oooo0o.getMid(), ""));
            targetIds.add(Boxing.boxLong(this.f25637Oooo0o.getTargetId()));
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(midList, "midList");
            Intrinsics.checkNotNullParameter(targetIds, "targetIds");
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000(msg, new MutableLiveData(), targetIds, midList, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendShareRoomMsg$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25638Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(ChatMessage chatMessage, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f25638Oooo0o = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f25638Oooo0o, continuation);
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
            ChatMessage.ShareRoomInfo shareRoomInfo = this.f25638Oooo0o.getShareRoomInfo();
            long roomId = shareRoomInfo != null ? shareRoomInfo.getRoomId() : 0L;
            ChatMessage.ShareRoomInfo shareRoomInfo2 = this.f25638Oooo0o.getShareRoomInfo();
            long roomIdx = shareRoomInfo2 != null ? shareRoomInfo2.getRoomIdx() : 0L;
            ChatMessage.ShareRoomInfo shareRoomInfo3 = this.f25638Oooo0o.getShareRoomInfo();
            String str = (shareRoomInfo3 == null || (roomName = shareRoomInfo3.getRoomName()) == null) ? "" : roomName;
            ChatMessage.ShareRoomInfo shareRoomInfo4 = this.f25638Oooo0o.getShareRoomInfo();
            String str2 = (shareRoomInfo4 == null || (roomHeader = shareRoomInfo4.getRoomHeader()) == null) ? "" : roomHeader;
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage msg = p520o0o0O0O0.OooOOO.f42227OooO00o.OooOOo0(this.f25638Oooo0o.getTargetId(), roomId, roomIdx, str, str2, (928 & 32) != 0 ? "" : null, (928 & 64) != 0 ? "" : null, (928 & 128) != 0 ? "" : this.f25638Oooo0o.getMid(), 0L, false);
            midList.add(new Pair(this.f25638Oooo0o.getMid(), ""));
            targetIds.add(Boxing.boxLong(this.f25638Oooo0o.getTargetId()));
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(midList, "midList");
            Intrinsics.checkNotNullParameter(targetIds, "targetIds");
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000Ooo(msg, new MutableLiveData(), targetIds, midList, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendTextMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25639Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(ChatMessage chatMessage, Continuation<? super Oooo0> continuation) {
            super(2, continuation);
            this.f25639Oooo0o = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo0(this.f25639Oooo0o, continuation);
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
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage msg = p520o0o0O0O0.OooOOO.f42227OooO00o.OooOo0o(this.f25639Oooo0o.getTargetId(), this.f25639Oooo0o.getMessage(), (60 & 4) != 0 ? "" : this.f25639Oooo0o.getMid(), (60 & 8) != 0 ? 0L : 0L, (60 & 16) != 0 ? false : false, false);
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000oo(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendShareUserMsg$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25640Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(ChatMessage chatMessage, Continuation<? super Oooo000> continuation) {
            super(2, continuation);
            this.f25640Oooo0o = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo000(this.f25640Oooo0o, continuation);
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
            ChatMessage.ShareUserInfo shareUserInfo = this.f25640Oooo0o.getShareUserInfo();
            long userId = shareUserInfo != null ? shareUserInfo.getUserId() : 0L;
            ChatMessage.ShareUserInfo shareUserInfo2 = this.f25640Oooo0o.getShareUserInfo();
            long userIdx = shareUserInfo2 != null ? shareUserInfo2.getUserIdx() : 0L;
            ChatMessage.ShareUserInfo shareUserInfo3 = this.f25640Oooo0o.getShareUserInfo();
            String str = (shareUserInfo3 == null || (userName = shareUserInfo3.getUserName()) == null) ? "" : userName;
            ChatMessage.ShareUserInfo shareUserInfo4 = this.f25640Oooo0o.getShareUserInfo();
            String str2 = (shareUserInfo4 == null || (userHead = shareUserInfo4.getUserHead()) == null) ? "" : userHead;
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage msg = p520o0o0O0O0.OooOOO.f42227OooO00o.OooOo0(this.f25640Oooo0o.getTargetId(), userId, userIdx, str, str2, (448 & 32) != 0 ? "" : null, (448 & 64) != 0 ? "" : this.f25640Oooo0o.getMid(), 0L, false);
            midList.add(new Pair(this.f25640Oooo0o.getMid(), ""));
            targetIds.add(Boxing.boxLong(this.f25640Oooo0o.getTargetId()));
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(midList, "midList");
            Intrinsics.checkNotNullParameter(targetIds, "targetIds");
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000O00(msg, new MutableLiveData(), targetIds, midList, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$updateVoiceFileName$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000OOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f25641Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f25642Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(String str, String str2, Continuation<? super o000OOo> continuation) {
            super(2, continuation);
            this.f25641Oooo0o = str;
            this.f25642Oooo0oO = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000OOo(this.f25641Oooo0o, this.f25642Oooo0oO, continuation);
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
            String mid = this.f25641Oooo0o;
            String fileName = this.f25642Oooo0oO;
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooOOOo(mid, fileName);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$reSendVoiceMessage$1$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000oOoO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25643Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PrivateChatVM f25644Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(ChatMessage chatMessage, PrivateChatVM privateChatVM, Continuation<? super o000oOoO> continuation) {
            super(2, continuation);
            this.f25643Oooo0o = chatMessage;
            this.f25644Oooo0oO = privateChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000oOoO(this.f25643Oooo0o, this.f25644Oooo0oO, continuation);
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
            ChatMessage.VoiceInfo voiceInfo = this.f25643Oooo0o.getVoiceInfo();
            if (voiceInfo == null || (filename = voiceInfo.getFilename()) == null) {
                filename = "";
            }
            String str = filename;
            ChatMessage.VoiceInfo voiceInfo2 = this.f25643Oooo0o.getVoiceInfo();
            this.f25644Oooo0oO.sendVoiceMessage(p520o0o0O0O0.OooOOO.f42227OooO00o.OooOoO0(this.f25643Oooo0o.getTargetId(), str, voiceInfo2 != null ? voiceInfo2.getVoiceDuration() : 0L, (104 & 8) != 0 ? "" : null, (104 & 16) != 0 ? "" : this.f25643Oooo0o.getMid(), 0L, false));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendEmotionMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f25646Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(int i, Continuation<? super o00O0O> continuation) {
            super(2, continuation);
            this.f25646Oooo0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new o00O0O(this.f25646Oooo0oO, continuation);
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
            ChatMessage msg = p520o0o0O0O0.OooOOO.f42227OooO00o.OooO0oo(PrivateChatVM.this.getTargetId(), this.f25646Oooo0oO, 0, "", 0L, false);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new p520o0o0O0O0.oo0o0Oo(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendGifMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f25648Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25649Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(int i, String str, Continuation<? super o00Oo0> continuation) {
            super(2, continuation);
            this.f25648Oooo0oO = i;
            this.f25649Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new o00Oo0(this.f25648Oooo0oO, this.f25649Oooo0oo, continuation);
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
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage msg = p520o0o0O0O0.OooOOO.OooOO0(PrivateChatVM.this.getTargetId(), this.f25648Oooo0oO, this.f25649Oooo0oo, null, 56);
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new p520o0o0O0O0.o0O0O00(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendGiftMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25650Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f25652Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f25653Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ boolean f25654OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f25655OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(int i, int i2, String str, boolean z, boolean z2, Continuation<? super o00Ooo> continuation) {
            super(2, continuation);
            this.f25652Oooo0oO = i;
            this.f25653Oooo0oo = i2;
            this.f25650Oooo = str;
            this.f25655OoooO00 = z;
            this.f25654OoooO0 = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new o00Ooo(this.f25652Oooo0oO, this.f25653Oooo0oo, this.f25650Oooo, this.f25655OoooO00, this.f25654OoooO0, continuation);
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
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage msg = p520o0o0O0O0.OooOOO.OooOO0O(PrivateChatVM.this.getTargetId(), this.f25652Oooo0oO, this.f25653Oooo0oo, this.f25650Oooo, null, 0L, false, this.f25655OoooO00, this.f25654OoooO0, 112);
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o000000O(msg, new MutableLiveData(), null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendVoiceMessage$1$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00oO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f25657Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f25658Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(String str, long j, Continuation<? super o00oO0o> continuation) {
            super(2, continuation);
            this.f25657Oooo0oO = str;
            this.f25658Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new o00oO0o(this.f25657Oooo0oO, this.f25658Oooo0oo, continuation);
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
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage chatMessageOooOoO0 = p520o0o0O0O0.OooOOO.f42227OooO00o.OooOoO0(PrivateChatVM.this.getTargetId(), this.f25657Oooo0oO, this.f25658Oooo0oo / ((long) 1000), (104 & 8) != 0 ? "" : null, (104 & 16) != 0 ? "" : null, 0L, false);
            oooOOO.OooO0oO(chatMessageOooOoO0);
            PrivateChatVM.this.sendVoiceMessage(chatMessageOooOoO0);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$updateVoice$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0O0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f25659Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f25660Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0O0O00(String str, long j, Continuation<? super o0O0O00> continuation) {
            super(2, continuation);
            this.f25659Oooo0o = str;
            this.f25660Oooo0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0O0O00(this.f25659Oooo0o, this.f25660Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0O0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String mid = this.f25659Oooo0o;
            Intrinsics.checkNotNullParameter(mid, "mid");
            p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooO0oO(mid);
            long j = this.f25660Oooo0oO;
            String mid2 = this.f25659Oooo0o;
            Intrinsics.checkNotNullParameter(mid2, "mid");
            p490o0o00O0.OooOo00 oooOo00OooOOoo = p491o0o00O00.OooO0OO.OooO00o().OooOOoo();
            Intrinsics.checkNotNullExpressionValue(oooOo00OooOOoo, "DB.conversationDao()");
            Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
            oooOo00OooOOoo.OooOOo0(value == null ? 0L : value.longValue(), j, mid2, false);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$updateMsgMoment$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f25661Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f25662Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25663Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(MomentDetailModel momentDetailModel, String str, String str2, Continuation<? super o0OO00O> continuation) {
            super(2, continuation);
            this.f25661Oooo0o = momentDetailModel;
            this.f25662Oooo0oO = str;
            this.f25663Oooo0oo = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OO00O(this.f25661Oooo0o, this.f25662Oooo0oO, this.f25663Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String momentImage;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (!this.f25661Oooo0o.getImageInfoList().isEmpty()) {
                String url = this.f25661Oooo0o.getImageInfoList().get(0).getUrl();
                Intrinsics.checkNotNullExpressionValue(url, "momentDetail.getImageInfoList()[0].url");
                momentImage = url;
            } else {
                momentImage = "";
            }
            String mid = this.f25662Oooo0oO;
            long id = this.f25661Oooo0o.getId();
            String momentText = this.f25663Oooo0oo;
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(momentImage, "momentImage");
            Intrinsics.checkNotNullParameter(momentText, "momentText");
            Intrinsics.checkNotNullParameter("", "momentMsg");
            p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooOOO(mid, id, momentImage, momentText);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$updateConversationCount$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OOO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ long f25664Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(long j, Continuation<? super o0OOO0o> continuation) {
            super(2, continuation);
            this.f25664Oooo0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OOO0o(this.f25664Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OOO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            long j = this.f25664Oooo0o;
            p490o0o00O0.OooOo00 oooOo00OooOOoo = p491o0o00O00.OooO0OO.OooO00o().OooOOoo();
            Intrinsics.checkNotNullExpressionValue(oooOo00OooOOoo, "DB.conversationDao()");
            Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
            oooOo00OooOOoo.OooOOO(value == null ? 0L : value.longValue(), j, 0);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$updateEmotionMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ long f25665Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(long j, Continuation<? super o0Oo0oo> continuation) {
            super(2, continuation);
            this.f25665Oooo0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0Oo0oo(this.f25665Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0Oo0oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            long j = this.f25665Oooo0o;
            p490o0o00O0.OooOo00 oooOo00OooOOoo = p491o0o00O00.OooO0OO.OooO00o().OooOOoo();
            Intrinsics.checkNotNullExpressionValue(oooOo00OooOOoo, "DB.conversationDao()");
            Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
            oooOo00OooOOoo.OooO(value == null ? 0L : value.longValue(), j, true, false);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$saveDraftMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OoOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f25667Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(String str, Continuation<? super o0OoOo0> continuation) {
            super(2, continuation);
            this.f25667Oooo0oO = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new o0OoOo0(this.f25667Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OoOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            long targetId = PrivateChatVM.this.getTargetId();
            String str = this.f25667Oooo0oO;
            if (str == null) {
                str = "";
            }
            String message = str;
            Intrinsics.checkNotNullParameter(message, "message");
            p490o0o00O0.OooOo00 oooOo00OooOOoo = p491o0o00O00.OooO0OO.OooO00o().OooOOoo();
            Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
            oooOo00OooOOoo.OooOOOO(value == null ? 0L : value.longValue(), targetId, message);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendVoiceMessage$2", f = "PrivateChatVM.kt", i = {}, l = {229, 236}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ PrivateChatVM f25668Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ChatMessage.VoiceInfo f25669Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25670Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ ChatMessage f25671Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(ChatMessage chatMessage, PrivateChatVM privateChatVM, Continuation<? super o0ooOOo> continuation) {
            super(2, continuation);
            this.f25671Oooo0oo = chatMessage;
            this.f25668Oooo = privateChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0ooOOo(this.f25671Oooo0oo, this.f25668Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0ooOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            String filename;
            ChatMessage.VoiceInfo voiceInfo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25670Oooo0oO;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    voiceInfo = this.f25669Oooo0o;
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) obj;
                voiceInfo.setVoiceUrl(str != null ? str : "");
                ChatMessage msg = this.f25671Oooo0oo;
                Intrinsics.checkNotNullParameter(msg, "msg");
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000O0(msg, new MutableLiveData(), null), 2, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ChatMessage.VoiceInfo voiceInfo2 = this.f25671Oooo0oo.getVoiceInfo();
            if (voiceInfo2 == null || (filename = voiceInfo2.getFilename()) == null) {
                filename = "";
            }
            CloudFileType cloudFileType = CloudFileType.USER_CHAT_VOICE;
            File file = new File(filename);
            this.f25670Oooo0oO = 1;
            obj = CloudFile.INSTANCE.getManager().uploadFile(cloudFileType, file, (Long) null, false, (Continuation<? super CloudFileInfo>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            CloudFileInfo cloudFileInfo = (CloudFileInfo) obj;
            if ((cloudFileInfo != null ? cloudFileInfo.getUrl() : null) == null) {
                String mid = this.f25671Oooo0oo.getMid();
                StatusEnum$MsgSendStatus state = StatusEnum$MsgSendStatus.QINIUFAIL;
                Intrinsics.checkNotNullParameter(mid, "mid");
                Intrinsics.checkNotNullParameter(state, "state");
                p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooO0O0(mid, state.OooO00o());
                String mid2 = this.f25671Oooo0oo.getMid();
                Intrinsics.checkNotNullParameter(mid2, "mid");
                Intrinsics.checkNotNullParameter(state, "state");
                p491o0o00O00.OooO0OO.OooO00o().OooOOoo().OooO0O0(mid2, state.OooO00o());
            } else {
                String mid3 = this.f25671Oooo0oo.getMid();
                String voiceUrl = cloudFileInfo.getUrl();
                Intrinsics.checkNotNullParameter(mid3, "mid");
                Intrinsics.checkNotNullParameter(voiceUrl, "voiceUrl");
                p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooO(mid3, voiceUrl);
                ChatMessage.VoiceInfo voiceInfo3 = this.f25671Oooo0oo.getVoiceInfo();
                if (voiceInfo3 != null) {
                    CloudFileRepo cloudFileRepo = this.f25668Oooo.cloudFileRepo;
                    String strImgRemoveHost = CloudImageUtilKt.imgRemoveHost(cloudFileInfo.getUrl());
                    this.f25669Oooo0o = voiceInfo3;
                    this.f25670Oooo0oO = 2;
                    obj = cloudFileRepo.OooO0o0(strImgRemoveHost, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    voiceInfo = voiceInfo3;
                    String str2 = (String) obj;
                    voiceInfo.setVoiceUrl(str2 != null ? str2 : "");
                }
                ChatMessage msg2 = this.f25671Oooo0oo;
                Intrinsics.checkNotNullParameter(msg2, "msg");
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000O0(msg2, new MutableLiveData(), null), 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.PrivateChatVM$sendTextMessage$1", f = "PrivateChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f25673Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(String str, Continuation<? super oo000o> continuation) {
            super(2, continuation);
            this.f25673Oooo0oO = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PrivateChatVM.this.new oo000o(this.f25673Oooo0oO, continuation);
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
            p520o0o0O0O0.OooOOO oooOOO = p520o0o0O0O0.OooOOO.f42227OooO00o;
            ChatMessage msg = p520o0o0O0O0.OooOOO.f42227OooO00o.OooOo0o(PrivateChatVM.this.getTargetId(), this.f25673Oooo0oO, (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? 0L : 0L, (60 & 16) != 0 ? false : false, false);
            oooOOO.OooO0oO(msg);
            Intrinsics.checkNotNullParameter(msg, "msg");
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000oo(msg, new MutableLiveData(), null), 2, null);
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
            p490o0o00O0.Oooo0 oooo0OooOo00 = p491o0o00O00.OooO0OO.OooO00o().OooOo00();
            Intrinsics.checkNotNullExpressionValue(oooo0OooOo00, "DB.friendDao()");
            oooo0OooOo00.OooOOO0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue(), targetId, true);
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
    /* JADX INFO: renamed from: downloadVoice$lambda-4$lambda-3, reason: not valid java name */
    public static final void m493downloadVoice$lambda4$lambda3(MutableLiveData this_apply, ChatMessage chatDBModel, boolean z, String fileName) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(chatDBModel, "$chatDBModel");
        if (z && fileName != null) {
            String mid = chatDBModel.getMid();
            Intrinsics.checkNotNullParameter(mid, "mid");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooOOOo(mid, fileName);
        }
        this_apply.postValue(fileName);
    }

    public final void addChatMessageToYallaChatMessage(@Nullable Function1<? super Boolean, Unit> listener) {
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        p499o0o00OoO.o0OO00O o0oo00oOooO0o0 = p497o0o00Oo.OooOOO0.OooO0o0();
        StringBuilder sbOooO00o = o000OO00.OooO00o(o0oo00oOooO0o0, "hideToYallaChat4ChatMessage");
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        sbOooO00o.append(oooOOO.OooOo().getValue());
        if (!o0oo00oOooO0o0.OooO00o(sbOooO00o.toString(), false) && oOO00O.OooO0OO(this.isFriendLiveData.getValue())) {
            p520o0o0O0O0.OooOOO oooOOO2 = p520o0o0O0O0.OooOOO.f42227OooO00o;
            long j = this.targetId;
            Intrinsics.checkNotNullParameter("", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
            Intrinsics.checkNotNullParameter("", "mid");
            ChatMessage chatMessageOooO0O0 = oooOOO2.OooO0O0("", j, 0L, false);
            chatMessageOooO0O0.setMessage("");
            chatMessageOooO0O0.setWarn(false);
            chatMessageOooO0O0.setContentType(101);
            p491o0o00O00.OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
            p499o0o00OoO.o0OO00O o0oo00oOooO0o1 = p497o0o00Oo.OooOOO0.OooO0o0();
            Objects.requireNonNull(o0oo00oOooO0o1);
            o000OOo0.OooO00o(oooOOO, OooO00o.OooO00o.OooO0o0("hideToYallaChat4ChatMessage"), o0oo00oOooO0o1, true);
        }
        if (listener != null) {
            listener.invoke(Boolean.valueOf(this.isFirstShowYallaChatButton));
        }
        this.isFirstShowYallaChatButton = false;
    }

    @NotNull
    public final LiveData<Boolean> checkUserRisk() {
        return o0000O0O.OooO00o(new OooO00o(null));
    }

    @NotNull
    public final MutableLiveData<String> downloadVoice(@NotNull final ChatMessage chatDBModel, @NotNull String url) {
        Intrinsics.checkNotNullParameter(chatDBModel, "chatDBModel");
        Intrinsics.checkNotNullParameter(url, "url");
        final MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        p190o00o00oo.o000000O o000000o2 = new p190o00o00oo.o000000O(new File(p494o0o00OO0.OooO0o.f41155OooO00o.OooO0OO().getPath() + File.separator));
        o000000o2.f33055OooO0Oo = new p179o00o0.o00O0O() { // from class: o0oo0.OooOOO
            @Override // p179o00o0.o00O0O
            public final void result(boolean z, Object obj) {
                PrivateChatVM.m493downloadVoice$lambda4$lambda3(mutableLiveData, chatDBModel, z, (String) obj);
            }
        };
        o000000o2.OooO0O0(url);
        return mutableLiveData;
    }

    @Nullable
    public final o0000O<Integer, ChatMessage> getChatMessage() {
        return this.chatMessage;
    }

    @NotNull
    public final LiveData<UserInfo> getChatUserInfo() {
        return this._chatUserInfo;
    }

    @NotNull
    public final MutableLiveData<String> getFriendRemarkLiveData() {
        return this.friendRemarkLiveData;
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

    @NotNull
    public final MutableLiveData<Boolean> isFriendLiveData() {
        return this.isFriendLiveData;
    }

    @NotNull
    public final LiveData<Conversation> loadConversation() {
        long j = this.targetId;
        p490o0o00O0.OooOo00 oooOo00OooOOoo = p491o0o00O00.OooO0OO.OooO00o().OooOOoo();
        Long value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue();
        return FlowLiveDataConversions.asLiveData$default(oooOo00OooOOoo.OooOO0O(value == null ? 0L : value.longValue(), j), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    public final void loadData() {
        this.chatMessage = new o0000O<>(ViewModelKt.getViewModelScope(this), new OooO0o());
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

    public final void sendGifMessage(int gifId, @NotNull String gifUrl) {
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o00Oo0(gifId, gifUrl, null), 2, null);
    }

    public final void sendGiftMessage(int giftId, @NotNull String gifUrl, boolean isGiftBlind, boolean isGiftCustomMade, int giftNumber) {
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o00Ooo(giftId, giftNumber, gifUrl, isGiftBlind, isGiftCustomMade, null), 2, null);
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

    public final void setChatMessage(@Nullable o0000O<Integer, ChatMessage> o0000o2) {
        this.chatMessage = o0000o2;
    }

    public final void setFriendLiveData(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.isFriendLiveData = mutableLiveData;
    }

    public final void setFriendRemarkLiveData(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.friendRemarkLiveData = mutableLiveData;
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
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o0OO00O(momentDetail, mid, momentText, null), 2, null);
    }

    public final void updateRiskFriend() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new oo0o0Oo(null), 2, null);
    }

    public final void updateVoice(long targetId, @NotNull String mid) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o0O0O00(mid, targetId, null), 2, null);
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
