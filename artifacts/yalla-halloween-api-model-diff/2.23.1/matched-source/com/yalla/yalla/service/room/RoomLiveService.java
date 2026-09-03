package com.yalla.yalla.service.room;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LifecycleService;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.code.android.util.o000O00O;
import com.common.support.sailfish_commons.logmodels.CustomLogModel;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.libaudiochat.event.BluetoothHeadsetBroadcastReceiver;
import com.weieyu.yalla.libaudiochat.event.HeadsetBroadcastReceiver;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.model.InOutRoomModel;
import com.yalla.yalla.model.SkillCardModel;
import com.yalla.yalla.model.ThrowMicModel;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomLoginModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.model.room.RoomVoiceModule;
import com.yalla.yalla.service.room.processor.RoomCommonMsgProcessor;
import com.yalla.yalla.statistical.event.RoomEventType;
import com.yalla.yalla.statistical.net.NetStateExceptionTypeE;
import com.yalla.yalla.ui.activity.empty.EmptySimpleActivity;
import io.agora.rtc.internal.RtcEngineEvent;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p041Ooooo0o.o00000;
import p357o0OOOoO.Oooo000;
import p425o0OoO0OO.o000OO0O;
import p431o0OoOO.o0Oo0oo;
import p435o0OoOOO0.o0000Ooo;
import p474o0OoooOO.oo0oO0;
import p483o0o000O0.OooOo;
import p483o0o000O0.OooOo00;
import p483o0o000O0.Oooo0;
import p483o0o000O0.o000oOoO;
import p483o0o000O0.o00O0O;
import p485o0o000Oo.o000OOo;
import p485o0o000Oo.o0OOO0o;
import p486o0o000o0.o00Ooo;
import p486o0o000o0.o00oO0o;
import p486o0o000o0.o0O0O00;
import p486o0o000o0.oo000o;
import p488o0o000oo.o0000O0;
import p488o0o000oo.o0000O00;
import p535o0o0OOoO.g;
import p541o0o0Oo0o.o0OO0;
import p587o0oOooO.ooooO000;
import p597o0oo00O.OooOOOO;
import p643o0ooOO0O.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/service/room/RoomLiveService;", "Landroidx/lifecycle/LifecycleService;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomLiveService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveService.kt\ncom/yalla/yalla/service/room/RoomLiveService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,691:1\n1#2:692\n1855#3,2:693\n1855#3,2:695\n766#3:697\n857#3,2:698\n1549#3:700\n1620#3,3:701\n13309#4,2:704\n*S KotlinDebug\n*F\n+ 1 RoomLiveService.kt\ncom/yalla/yalla/service/room/RoomLiveService\n*L\n409#1:693,2\n452#1:695,2\n510#1:697\n510#1:698,2\n511#1:700\n511#1:701,3\n647#1:704,2\n*E\n"})
public final class RoomLiveService extends LifecycleService implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public static RoomLiveService f24604OooOo00;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00Ooo f24606OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public p356o0OOOo0o.OooOO0 f24609OooO0oO;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public RoomLoginModel f24612OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Integer f24613OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Job f24614OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public String f24615OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public Job f24616OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public Job f24617OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Job f24618OooOOo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f24608OooO0o0 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f24607OooO0o = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f24610OooO0oo = LazyKt.lazy(new OooOOO0());

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final OooO0o f24605OooO = new OooO0o();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final OooO0OO f24611OooOO0 = new OooO0OO();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f24619OooOOo0 = new ArrayList();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f24620OooOOoo = new OooO0O0();

    public static final class OooO extends Lambda implements Function0<o00oO0o> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00oO0o invoke() {
            return new o00oO0o(RoomLiveService.this);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends Binder {
    }

    @SourceDebugExtension({"SMAP\nRoomLiveService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveService.kt\ncom/yalla/yalla/service/room/RoomLiveService$audioChatCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,691:1\n1#2:692\n13309#3,2:693\n*S KotlinDebug\n*F\n+ 1 RoomLiveService.kt\ncom/yalla/yalla/service/room/RoomLiveService$audioChatCallback$1\n*L\n566#1:693,2\n*E\n"})
    public static final class OooO0O0 implements p358o0OOOoO0.OooO0o {
        public OooO0O0() {
        }

        @Override // p358o0OOOoO0.OooO0o
        public final void OooO(int i, int i2) {
            if (i == 713 && i2 == 723) {
                MutableLiveData<MusicState.LoopMode> mutableLiveData = MusicState.f22372OooO0Oo;
                if (mutableLiveData.getValue() == MusicState.LoopMode.LoopSingle) {
                    boolean z = g.f53585OooO00o;
                    g.OooO0o(MusicState.f22369OooO00o.getValue(), 2);
                }
                if (mutableLiveData.getValue() == MusicState.LoopMode.LoopAll) {
                    boolean z2 = g.f53585OooO00o;
                    g.OooO0oO();
                }
            }
            if (i == 0) {
                Lazy lazy = p479o0o00.OooO0O0.f48354OooO00o;
                p479o0o00.OooO0O0.OooO0OO(RoomEventType.Agore_audioMixingFailed);
            }
        }

        @Override // p358o0OOOoO0.OooO0o
        public final void OooO00o() {
        }

        @Override // p358o0OOOoO0.OooO0o
        public final void OooO0O0(@Nullable Oooo000[] oooo000Arr) {
            if (oooo000Arr.length == 0) {
                return;
            }
            for (Oooo000 oooo000 : oooo000Arr) {
                if (oooo000.f42913OooO0O0 != 0) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(RoomLiveService.this), null, null, new com.yalla.yalla.service.room.OooO0o(oooo000, null), 3, null);
                }
            }
        }

        @Override // p358o0OOOoO0.OooO0o
        public final void OooO0OO() {
        }

        @Override // p358o0OOOoO0.OooO0o
        public final void OooO0Oo(int i) {
            RoomLiveService roomLiveService;
            if ((i == 8 || i == 9) && (roomLiveService = RoomLiveService.f24604OooOo00) != null) {
                roomLiveService.OooO0oO(10030, "");
            }
        }

        @Override // p358o0OOOoO0.OooO0o
        public final void OooO0o() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p358o0OOOoO0.OooO0o
        public final void OooO0o0(@Nullable String str, long j, int i) {
            OooOOOO.OooO0OO("RoomLiveService", "onJoinChannelSuccess channel = " + str + ", uid = " + j + ", elapsed = " + i);
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            Long l = (Long) oo0oO0.OooOOo0().getValue();
            if (l != null && j == l.longValue()) {
                long jOooO0o = o000000.OooO0o(str);
                RoomLiveService roomLiveService = RoomLiveService.this;
                p356o0OOOo0o.OooOO0 oooOO1 = roomLiveService.f24609OooO0oO;
                if (oooOO1 != null) {
                    oooOO1.OooOOoo(jOooO0o);
                }
                for (o0OO0 o0oo1 : com.yalla.yalla.service.room.OooO00o.f24525OooO0oO.f48536OooOO0O) {
                    roomLiveService.f24619OooOOo0.add(o000OO0O.OooO00o(o0oo1.f54751OooO0Oo, roomLiveService.getLifecycle(), new Oooo0(o0oo1, roomLiveService)));
                }
                p482o0o000O.o00oO0o o00oo0o2 = com.yalla.yalla.service.room.OooO00o.f24525OooO0oO;
                roomLiveService.f24618OooOOo = o000OO0O.OooO00o(FlowKt.flowCombine(o00oo0o2.f48529OooO0OO, o00oo0o2.f48530OooO0Oo, new OooOo00(null)), roomLiveService.getLifecycle(), new OooOo(roomLiveService));
                roomLiveService.f24614OooOOO = o000OO0O.OooO00o(o00oo0o2.f48527OooO00o, roomLiveService.getLifecycle(), new o000oOoO(roomLiveService));
            }
        }

        @Override // p358o0OOOoO0.OooO0o
        public final void OooO0oO(int i) {
            Object next;
            p356o0OOOo0o.OooOO0 oooOO1;
            MixedRoomDataSource mixedRoomDataSourceOooO0o0 = MixedRoomDataSource.OooO0o0();
            if (mixedRoomDataSourceOooO0o0.f22994OooO == null) {
                mixedRoomDataSourceOooO0o0.f22994OooO = new HashMap<>();
            }
            HashMap<Long, Boolean> map = mixedRoomDataSourceOooO0o0.f22994OooO;
            Intrinsics.checkNotNullExpressionValue(map, "getMuteSoundMap(...)");
            long j = i;
            Boolean bool = map.get(Long.valueOf(j));
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            if (bool2.booleanValue()) {
                Iterator<T> it = com.yalla.yalla.service.room.OooO00o.f24525OooO0oO.f48536OooOO0O.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((o0OO0) next).f54750OooO0OO.getValue().longValue() == j));
                o0OO0 o0oo1 = (o0OO0) next;
                if (o0oo1 == null || (oooOO1 = RoomLiveService.this.f24609OooO0oO) == null) {
                    return;
                }
                oooOO1.OooO0o(i, o0oo1.f54751OooO0Oo.getValue().booleanValue());
            }
        }

        @Override // p358o0OOOoO0.OooO0o
        public final void OooO0oo() {
        }

        @Override // p358o0OOOoO0.OooO0o
        public final void OooOO0() {
        }

        @Override // p358o0OOOoO0.OooO0o
        public final void OooOO0O() {
        }

        @Override // p358o0OOOoO0.OooO0o
        public final void onError() {
        }
    }

    public static final class OooO0OO implements oo000o {

        @DebugMetadata(c = "com.yalla.yalla.service.room.RoomLiveService$connectStateListener$1$connecting$1", f = "RoomLiveService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ RoomLiveService f24624OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(RoomLiveService roomLiveService, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f24624OooO0Oo = roomLiveService;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f24624OooO0Oo, continuation);
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
                this.f24624OooO0Oo.OooO0o0();
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.service.room.RoomLiveService$connectStateListener$1$disconnected$1", f = "RoomLiveService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ RoomLiveService f24625OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(RoomLiveService roomLiveService, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f24625OooO0Oo = roomLiveService;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f24625OooO0Oo, continuation);
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
                this.f24625OooO0Oo.OooO0o0();
                return Unit.INSTANCE;
            }
        }

        public OooO0OO() {
        }

        @Override // p486o0o000o0.oo000o
        public final void OooO00o() {
            OooOOOO.OooO0OO("RoomLiveService", "connecting");
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
            com.yalla.yalla.service.room.OooO00o.OooO0oO(com.yalla.yalla.service.room.OooO0OO.OooO0O0.f24598OooO00o);
            RoomLiveService roomLiveService = RoomLiveService.this;
            com.code.android.util.OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(roomLiveService), new OooO00o(roomLiveService, null));
        }

        @Override // p486o0o000o0.oo000o
        public final void OooO0O0() {
            OooOOOO.OooO0OO("RoomLiveService", "connected");
            RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
            RoomLiveService.this.OooO0o();
        }

        @Override // p486o0o000o0.oo000o
        public final void OooO0OO() {
            OooOOOO.OooO0OO("RoomLiveService", "disconnected");
            RoomLiveService roomLiveService = RoomLiveService.this;
            com.code.android.util.OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(roomLiveService), new OooO0O0(roomLiveService, null));
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
            if (com.yalla.yalla.service.room.OooO00o.OooO0OO() instanceof com.yalla.yalla.service.room.OooO0OO.OooO00o) {
                return;
            }
            com.yalla.yalla.service.room.OooO00o.OooO0oO(new com.yalla.yalla.service.room.OooO0OO.OooO00o(2, null));
        }
    }

    public static final class OooO0o implements o0O0O00 {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:44:0x012d  */
        @Override // p486o0o000o0.o0O0O00
        public final void OooO00o(int i, int i2, @Nullable byte[] bArr) {
            boolean z;
            boolean z2;
            boolean z3;
            int i3;
            byte[] bArr2 = bArr;
            byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
            Charset charset = Charsets.UTF_8;
            String str = new String(bArr3, charset);
            StringBuilder sbOooO00o = o00000.OooO00o("handlerMessage code = ", i, ", serializationType = ", i2, ", message = ");
            sbOooO00o.append(str);
            OooOOOO.OooO0OO("RoomLiveService", sbOooO00o.toString());
            com.yalla.yalla.service.room.processor.OooO0o oooO0o = o00O0O.f48619OooO00o;
            Integer numValueOf = Integer.valueOf(i);
            OooOOOO.OooO0OO("RoomMessageDispatcher", "\ntype= " + numValueOf + ", \nserializationType= " + numValueOf + ", \ndata= " + bArr2);
            if (numValueOf != null) {
                numValueOf.intValue();
                int iIntValue = numValueOf.intValue();
                if (bArr2 == null) {
                    z = false;
                } else {
                    if (bArr2.length == 0) {
                        z = false;
                    } else {
                        try {
                            if (iIntValue == 1000005) {
                                OooOOOO.OooO0O0("handleError 1000005 type:" + iIntValue + ",data:" + bArr2);
                                Room.ErrorEvent from = Room.ErrorEvent.parseFrom(bArr);
                                p484o0o000OO.Oooo000.OooO0OO(from.getErrcode(), from.getPckcode(), from.getContent());
                            } else if (o00O0O.OooO00o(bArr)) {
                                String str2 = new String(bArr2, charset);
                                JSONObject jSONObject = new JSONObject(str2);
                                if (jSONObject.has("code") && (i3 = jSONObject.getInt("code")) != 0) {
                                    OooOOOO.OooO0O0("handleError JsonMessage type:" + iIntValue + ", data:" + str2);
                                    p484o0o000OO.Oooo000.OooO0OO(i3, iIntValue, str2);
                                } else {
                                    z = false;
                                }
                            } else {
                                switch (iIntValue) {
                                    case 10072:
                                    case 10073:
                                    case 10074:
                                    case 10075:
                                    case 10076:
                                    case 10077:
                                    case 10078:
                                    case 100661:
                                    case 100711:
                                    case 100731:
                                    case 100732:
                                    case DurationKt.NANOS_IN_MILLIS /* 1000000 */:
                                    case 1000002:
                                    case 1000003:
                                    case 1000005:
                                    case 1000200:
                                    case 1000201:
                                    case 1000500:
                                    case 1000800:
                                    case 1000801:
                                    case 1001003:
                                    case 1001050:
                                    case 1100001:
                                    case 1100002:
                                    case 10008010:
                                        z3 = true;
                                        break;
                                    default:
                                        z3 = false;
                                        break;
                                }
                                if (!z3) {
                                    try {
                                        Room.Base from2 = Room.Base.parseFrom(bArr);
                                        if (from2 != null && from2.getCode() != 0) {
                                            OooOOOO.OooO0O0("handleError ProtobufMessage type:" + iIntValue + ", code:" + from2.getCode());
                                            p484o0o000OO.Oooo000.OooO0OO(from2.getCode(), iIntValue, bArr2);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                                z = false;
                            }
                            z = true;
                        } catch (Exception e) {
                            e.printStackTrace();
                            OooOOOO.OooO0Oo("error: handleErrorIfHave type = " + iIntValue);
                        }
                    }
                }
                if (z) {
                    return;
                }
                int iIntValue2 = numValueOf.intValue();
                byte[] bArr4 = bArr2 == null ? o00OO0O0.f57561OooO00o : bArr2;
                com.yalla.yalla.service.room.processor.OooO0o oooO0o2 = o00O0O.f48619OooO00o;
                com.yalla.yalla.service.room.processor.OooO0O0 oooO0O0 = com.yalla.yalla.service.room.processor.OooO0O0.f24630OooO00o;
                RoomCommonMsgProcessor roomCommonMsgProcessor = RoomCommonMsgProcessor.f24674OooO00o;
                com.yalla.yalla.service.room.processor.OooOO0O oooOO0O = com.yalla.yalla.service.room.processor.OooOO0O.f24655OooO00o;
                com.yalla.yalla.service.room.processor.OooOOOO oooOOOO = o00O0O.f48625OooO0oO;
                com.yalla.yalla.service.room.processor.OooOO0 oooOO1 = o00O0O.f48623OooO0o;
                try {
                    switch (iIntValue2) {
                        case RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS /* 10001 */:
                            Charset charset2 = Charsets.UTF_8;
                            RoomLoginInformation model = (RoomLoginInformation) p187o00o00o0.OooO.OooO0O0(RoomLoginInformation.class, new String(bArr4, charset2));
                            if (model == null) {
                                o0Oo0oo.OooO0OO(0, 3);
                            } else {
                                roomCommonMsgProcessor.OooO0OO(model);
                                Intrinsics.checkNotNullParameter(model, "model");
                                RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
                                if (roomLiveService != null) {
                                    String channelkey = model.getChannelkey();
                                    if (channelkey == null) {
                                        channelkey = "";
                                    }
                                    RoomLoginInformation.RoomBean room = model.getRoom();
                                    roomLiveService.OooO0Oo(room != null ? room.getVediotype() : 0, channelkey);
                                }
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p485o0o000Oo.o0O0O00(model, null), 3, null);
                                RoomLiveService roomLiveService2 = RoomLiveService.f24604OooOo00;
                                if (roomLiveService2 != null) {
                                    roomLiveService2.OooOO0O();
                                }
                                MixedRoomDataSource.OooO0o0().OooOOOO(RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS, new String(bArr4, charset2));
                            }
                            z2 = true;
                            break;
                        case 10006:
                        case 1001100:
                        case 1001103:
                        case 1001105:
                        case 1001106:
                        case 1001108:
                        case 1001109:
                            oooOO0O.OooO0Oo(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 10007:
                            InOutRoomModel inOutRoomModel = (InOutRoomModel) p187o00o00o0.OooO.OooO0O0(InOutRoomModel.class, new String(bArr4, Charsets.UTF_8));
                            if (inOutRoomModel != null) {
                                if (inOutRoomModel.getKind() == 0 && inOutRoomModel.getNewUser() != null) {
                                    ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24519OooO00o;
                                    com.yalla.yalla.service.room.OooO00o.OooO0o(inOutRoomModel.getNewUser());
                                }
                                oooOOOO.OooO0OO(iIntValue2, bArr4);
                                o00O0O.f48626OooO0oo.OooO0O0(iIntValue2, bArr4);
                                oooOO0O.OooO0Oo(iIntValue2, bArr4);
                                roomCommonMsgProcessor.OooO0Oo(iIntValue2, bArr4);
                                oooO0O0.OooO0O0(inOutRoomModel);
                            }
                            z2 = true;
                            break;
                        case 10008:
                            com.code.android.util.OooOOO.OooO0OO(GlobalScope.INSTANCE, new p485o0o000Oo.Oooo0(null));
                            z2 = true;
                            break;
                        case 10009:
                        case 10048:
                        case 10056:
                        case 10057:
                        case 1000100:
                        case 1001001:
                        case 1001002:
                        case 1001003:
                        case 1001050:
                            oooO0o2.OooO0o0(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 10016:
                        case 10031:
                        case 10032:
                            oooOO0O.OooO0Oo(iIntValue2, bArr4);
                            z2 = false;
                            break;
                        case 10017:
                            ThrowMicModel model2 = (ThrowMicModel) p187o00o00o0.OooO.OooO0O0(ThrowMicModel.class, new String(bArr4, Charsets.UTF_8));
                            if (model2 != null) {
                                Intrinsics.checkNotNullParameter(model2, "model");
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0OOO0o(model2, null), 3, null);
                            }
                            z2 = true;
                            break;
                        case 10019:
                        case 1000700:
                            roomCommonMsgProcessor.OooO0Oo(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 10021:
                        case 10022:
                        case 10024:
                        case 10042:
                        case 100212:
                        case 100221:
                        case 100222:
                        case 100242:
                        case 1000402:
                        case 1000900:
                        case 1000901:
                        case 1000902:
                        case 1000903:
                        case 1000904:
                        case 1000905:
                            oooOO1.OooO0O0(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 10023:
                        case 100231:
                        case 100232:
                            oooOO1.OooO0O0(iIntValue2, bArr4);
                            oooOO0O.OooO0Oo(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 10041:
                        case 10053:
                            roomCommonMsgProcessor.OooO0Oo(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 10045:
                            roomCommonMsgProcessor.OooO0oO(new String(bArr4, Charsets.UTF_8));
                            z2 = true;
                            break;
                        case 10049:
                            SkillCardModel skillCardModel = (SkillCardModel) p187o00o00o0.OooO.OooO0O0(SkillCardModel.class, new String(bArr4, Charsets.UTF_8));
                            if (skillCardModel != null) {
                                oooOO0O.OooO0O0(skillCardModel);
                                oooO0O0.OooO0Oo(skillCardModel);
                            }
                            z2 = true;
                            break;
                        case 10054:
                        case 10055:
                            oooOOOO.OooO0OO(iIntValue2, bArr4);
                            z2 = false;
                            break;
                        case 10058:
                            Room.MicNumChangeReply model3 = Room.MicNumChangeReply.parseFrom(bArr4);
                            if (model3 != null) {
                                Intrinsics.checkNotNullParameter(model3, "model");
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p485o0o000Oo.o000000(model3, null), 3, null);
                            }
                            z2 = true;
                            break;
                        case 10066:
                            Room.MagicVoiceOut from3 = Room.MagicVoiceOut.parseFrom(bArr4);
                            if (from3 != null) {
                                oooOO0O.OooO0OO(from3);
                                oooO0O0.OooO0o0(from3);
                            }
                            z2 = true;
                            break;
                        case 100241:
                            oooOO1.OooO0O0(iIntValue2, bArr4);
                            oooOO0O.OooO0Oo(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 100661:
                            Room.MagicVoiceExpireNotify model4 = Room.MagicVoiceExpireNotify.parseFrom(bArr4);
                            if (model4 != null) {
                                Intrinsics.checkNotNullParameter(model4, "model");
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OOo(model4, null), 3, null);
                            }
                            z2 = true;
                            break;
                        case 100701:
                            com.code.android.util.OooOOO.OooO0OO(GlobalScope.INSTANCE, new p485o0o000Oo.Oooo0(null));
                            z2 = true;
                            break;
                        case 1000200:
                        case 1000201:
                            o00O0O.f48621OooO0OO.OooO0O0(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 1000300:
                        case 1000301:
                            o00O0O.f48620OooO0O0.OooO0O0(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 1000400:
                            ChatModel chatModel = (ChatModel) p187o00o00o0.OooO.OooO0O0(ChatModel.class, new String(bArr4, Charsets.UTF_8));
                            if (chatModel != null) {
                                com.yalla.yalla.service.room.processor.OooOO0O.OooO0o0(chatModel);
                            }
                            z2 = true;
                            break;
                        case 1000500:
                            o00O0O.f48622OooO0Oo.OooO0O0(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 1000600:
                            oooO0o2.OooO0o0(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 1000800:
                        case 1000801:
                            o00O0O.f48624OooO0o0.OooO0O0(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        case 1001201:
                            oooO0O0.OooO0o(iIntValue2, bArr4);
                            z2 = true;
                            break;
                        default:
                            z2 = false;
                            break;
                    }
                } catch (Exception e2) {
                    OooOOOO.OooO0o0("RoomLiveService", e2.getMessage(), e2);
                }
                if (z2) {
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = numValueOf.intValue();
                if (o00O0O.OooO00o(bArr)) {
                    messageObtain.arg1 = 0;
                    if (bArr2 == null) {
                        bArr2 = new byte[0];
                    }
                    messageObtain.obj = StringsKt.trim((CharSequence) new String(bArr2, Charsets.UTF_8)).toString();
                } else {
                    messageObtain.arg1 = 1;
                    messageObtain.obj = bArr2;
                }
                p396o0Oo0.OooOOO0<MixedRoomDataSource> oooOOO0 = MixedRoomDataSource.OooO0o0().f22995OooO0Oo;
                if (oooOOO0 != null) {
                    oooOOO0.sendMessage(messageObtain);
                }
            }
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<String, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f24626OooO0Oo = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(StringsKt.isBlank(it));
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<String, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f24627OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf((StringsKt__StringsJVMKt.startsWith(it, "wss", true) || StringsKt__StringsJVMKt.startsWith(it, "http", true)) ? false : true);
        }
    }

    public static final class OooOOO extends Lambda implements Function0<p486o0o000o0.o0Oo0oo> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p486o0o000o0.o0Oo0oo invoke() {
            return new p486o0o000o0.o0Oo0oo(RoomLiveService.this);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<AudioManager> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AudioManager invoke() {
            Object systemService = RoomLiveService.this.getApplicationContext().getSystemService("audio");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return (AudioManager) systemService;
        }
    }

    public final void OooO(@NotNull RoomModel roomModel) {
        List<String> listEmptyList;
        List<String> listEmptyList2;
        List listSplit$default;
        List listSplit$default2;
        Intrinsics.checkNotNullParameter(roomModel, "roomModel");
        OooOOOO.OooO0OO("RoomLiveService", "startConnectRoom roomModel = ".concat(p187o00o00o0.OooO.OooO00o(roomModel)));
        p482o0o000O.OooOo oooOo = com.yalla.yalla.service.room.OooO00o.f24524OooO0o0;
        long jOooO0o0 = oooOo.OooO0o0();
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO;
        if (jOooO0o0 != 0 && oooOo.OooO0o0() != roomModel.getId()) {
            Job job = o0000O00.f48720OooO0O0;
            boolean z = true;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            o0000O00.f48720OooO0O0 = null;
            RoomVoiceModule roomVoiceModule = o0000O00.f48721OooO0OO;
            if (roomVoiceModule != null) {
                List<RoomVoiceModule.TimeVoice> timeVoice = roomVoiceModule != null ? roomVoiceModule.getTimeVoice() : null;
                if (timeVoice != null && !timeVoice.isEmpty()) {
                    z = false;
                }
                if (!z) {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o0000O0(null), 3, null);
                }
            }
            OooO0o0();
            OooO0O0();
            OooOOOO.OooO0OO("RoomLiveService", "clearRoomData");
            oooO00o.OooO00o().OooO00o();
            MixedRoomDataSource mixedRoomDataSourceOooO0o0 = MixedRoomDataSource.OooO0o0();
            if (MixedRoomDataSource.f22993OooOo00 != null) {
                mixedRoomDataSourceOooO0o0.f22998OooO0oO = null;
                com.yalla.yalla.service.room.OooO00o.f24532OooOOOO.OooO0oO(false);
                MixedRoomDataSource.f22993OooOo00 = null;
            } else {
                mixedRoomDataSourceOooO0o0.getClass();
            }
            MixedRoomDataSource.f22993OooOo00 = new MixedRoomDataSource();
        }
        oooOo.f48422OooO00o.setValue(Long.valueOf(roomModel.getId()));
        oooO00o.OooO00o().f24547OooO0Oo.setValue(Long.valueOf(roomModel.getId()));
        oooO00o.OooO00o().f24546OooO0OO.setValue(Long.valueOf(o000000.OooO0o(roomModel.getBaridx())));
        oooO00o.OooO00o().f24545OooO0O0.setValue(roomModel.getName());
        oooO00o.OooO00o().f24544OooO00o.setValue(roomModel.getImage());
        RoomLoginModel roomLoginModel = new RoomLoginModel();
        roomLoginModel.setRoomId(roomModel.getId());
        roomLoginModel.setSessionId(roomModel.getSessionId());
        String roomIp = roomModel.getRoomIp();
        if (roomIp == null || (listSplit$default2 = StringsKt__StringsKt.split$default(roomIp, new String[]{";"}, false, 0, 6, (Object) null)) == null || (listEmptyList = CollectionsKt.toMutableList((Collection) listSplit$default2)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        } else {
            CollectionsKt.removeAll((List) listEmptyList, (Function1) OooOO0.f24626OooO0Oo);
        }
        roomLoginModel.setSocketUrlList(listEmptyList);
        String str = roomModel.websocketaddr;
        if (str == null || (listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{";"}, false, 0, 6, (Object) null)) == null || (listEmptyList2 = CollectionsKt.toMutableList((Collection) listSplit$default)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        } else {
            CollectionsKt.removeAll((List) listEmptyList2, (Function1) OooOO0O.f24627OooO0Oo);
        }
        roomLoginModel.setWebsocketUrlList(listEmptyList2);
        this.f24612OooOO0O = roomLoginModel;
        OooO00o();
    }

    public final void OooO00o() {
        Unit unit;
        RoomLoginModel roomLoginModel = this.f24612OooOO0O;
        Unit unit2 = null;
        if (roomLoginModel != null) {
            boolean z = !roomLoginModel.getWebsocketUrlList().isEmpty();
            OooO0OO oooO0OO = this.f24611OooOO0;
            OooO0o oooO0o = this.f24605OooO;
            if (z) {
                OooOOOO.OooO0OO("RoomLiveService", "connectRoom websocketClient");
                Lazy lazy = this.f24607OooO0o;
                ((o00Ooo) lazy.getValue()).OooO0OO(oooO0o);
                ((o00Ooo) lazy.getValue()).OooO00o(oooO0OO);
                o00Ooo o00ooo2 = (o00Ooo) lazy.getValue();
                this.f24606OooO0Oo = o00ooo2;
                if (o00ooo2 != null) {
                    o00ooo2.OooO0Oo(roomLoginModel.getWebsocketUrlList());
                    unit = Unit.INSTANCE;
                    unit2 = unit;
                }
            } else {
                if (!roomLoginModel.getSocketUrlList().isEmpty()) {
                    OooOOOO.OooO0OO("RoomLiveService", "connectRoom socketClient");
                    Lazy lazy2 = this.f24608OooO0o0;
                    ((o00Ooo) lazy2.getValue()).OooO0OO(oooO0o);
                    ((o00Ooo) lazy2.getValue()).OooO00o(oooO0OO);
                    o00Ooo o00ooo3 = (o00Ooo) lazy2.getValue();
                    this.f24606OooO0Oo = o00ooo3;
                    if (o00ooo3 != null) {
                        o00ooo3.OooO0Oo(roomLoginModel.getSocketUrlList());
                        unit = Unit.INSTANCE;
                    }
                } else {
                    OooOOOO.OooO0OO("RoomLiveService", "connectRoom loadNewConnectAddress");
                    com.code.android.util.OooOOO.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this), new p483o0o000O0.OooOOOO(roomLoginModel.getRoomId(), this, null));
                    unit = Unit.INSTANCE;
                }
                unit2 = unit;
            }
        }
        if (unit2 == null) {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO00o();
        }
    }

    public final void OooO0O0() {
        OooOOOO.OooO0OO("RoomLiveService", "disconnectRoom leaveRoom socket = " + this.f24606OooO0Oo);
        o00Ooo o00ooo2 = this.f24606OooO0Oo;
        if (o00ooo2 != null) {
            o00ooo2.disconnect();
        }
        this.f24606OooO0Oo = null;
    }

    @Nullable
    public final Boolean OooO0OO(long j) {
        p356o0OOOo0o.OooOO0 oooOO1 = this.f24609OooO0oO;
        if (oooOO1 != null) {
            return Boolean.valueOf(oooOO1.OooOo0O(j));
        }
        return null;
    }

    public final void OooO0Oo(int i, @NotNull String channelKey) {
        Intrinsics.checkNotNullParameter(channelKey, "channelKey");
        OooOOOO.OooO0OO("RoomLiveService", "joinAudioChatChannel channelKey = " + channelKey + ", audioType = " + i);
        com.code.android.util.OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(this), new p483o0o000O0.OooOOO(this, channelKey, i, null));
    }

    public final void OooO0o() {
        RoomLoginModel roomLoginModel = this.f24612OooOO0O;
        if (roomLoginModel == null) {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO00o();
            return;
        }
        OooOOOO.OooO0OO("RoomLiveService", "loginRoom roomModel = ".concat(p187o00o00o0.OooO.OooO00o(roomLoginModel)));
        RoomLiveService roomLiveService = f24604OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(RtcEngineEvent.EvtType.EVT_LOOKUP_CHANNEL_SUCCESS, p187o00o00o0.OooO.OooO00o(roomLoginModel));
        }
        Lazy lazy = p479o0o00.OooO0O0.f48354OooO00o;
        NetStateExceptionTypeE tag = NetStateExceptionTypeE.CONNECT_ROOM;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter("start login room", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        CustomLogModel customLogModel = new CustomLogModel();
        customLogModel.setLevel("INFO");
        customLogModel.setTag(tag.toString());
        customLogModel.setMessage("start login room");
        p479o0o00.OooO0O0.OooO00o(customLogModel);
    }

    public final void OooO0o0() {
        OooOOOO.OooO0OO("RoomLiveService", "leaveAudioChatChannel " + Looper.myLooper());
        p356o0OOOo0o.OooOO0 oooOO1 = this.f24609OooO0oO;
        if (oooOO1 != null) {
            Job job = this.f24614OooOOO;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f24614OooOOO = null;
            Job job2 = this.f24616OooOOOO;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            Job job3 = this.f24617OooOOOo;
            if (job3 != null) {
                Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
            }
            this.f24617OooOOOo = null;
            ArrayList arrayList = this.f24619OooOOo0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
            }
            arrayList.clear();
            Job job4 = this.f24618OooOOo;
            if (job4 != null) {
                Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
            }
            this.f24618OooOOo = null;
            oooOO1.unregister();
            boolean z = g.f53585OooO00o;
            g.OooO();
            ((AudioManager) this.f24610OooO0oo.getValue()).abandonAudioFocus(this);
            p356o0OOOo0o.OooO oooOOooO0O0 = p356o0OOOo0o.OooO.OooO0O0();
            Context applicationContext = getApplicationContext();
            oooOOooO0O0.getClass();
            try {
                BluetoothHeadsetBroadcastReceiver bluetoothHeadsetBroadcastReceiver = oooOOooO0O0.f42902OooO0oO;
                if (bluetoothHeadsetBroadcastReceiver != null) {
                    applicationContext.unregisterReceiver(bluetoothHeadsetBroadcastReceiver);
                    oooOOooO0O0.f42902OooO0oO = null;
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
            p356o0OOOo0o.OooO oooOOooO0O1 = p356o0OOOo0o.OooO.OooO0O0();
            Context applicationContext2 = getApplicationContext();
            oooOOooO0O1.getClass();
            try {
                HeadsetBroadcastReceiver headsetBroadcastReceiver = oooOOooO0O1.f42900OooO0o;
                if (headsetBroadcastReceiver != null && applicationContext2 != null) {
                    applicationContext2.unregisterReceiver(headsetBroadcastReceiver);
                    oooOOooO0O1.f42900OooO0o = null;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            oooOO1.OooO0Oo();
            this.f24609OooO0oO = null;
        }
    }

    public final void OooO0oO(int i, @Nullable String str) {
        OooOOOO.OooO0OO("RoomLiveService", "sendMessage code = " + i + ", message = " + str);
        o00Ooo o00ooo2 = this.f24606OooO0Oo;
        if (o00ooo2 != null) {
            o00ooo2.OooO0o0(i, str);
        }
    }

    public final void OooO0oo(int i, @Nullable byte[] bArr) {
        OooOOOO.OooO0OO("RoomLiveService", "sendProtobufMessage code = " + i);
        o00Ooo o00ooo2 = this.f24606OooO0Oo;
        if (o00ooo2 != null) {
            o00ooo2.OooO0O0(i, bArr);
        }
    }

    public final void OooOO0() {
        Notification.Builder builder;
        int i = Build.VERSION.SDK_INT;
        PendingIntent activity = PendingIntent.getActivity(o000O00O.OooO00o(), 1807201968, new Intent(o000O00O.OooO00o(), (Class<?>) EmptySimpleActivity.class), i >= 31 ? 33554432 : 134217728);
        if (i >= 26) {
            ooooO000.OooO00o();
            builder = com.squareup.wire.OooO0O0.OooO00o(App.f22236OooO0o);
        } else {
            builder = new Notification.Builder(App.f22236OooO0o);
        }
        if (i >= 24) {
            builder.setGroupSummary(false).setGroup("Yalla");
        }
        Notification.Builder contentIntent = builder.setSmallIcon(p565o0oOo000.o0OOO0o.icon_notification_small).setContentText(o0000.OooO0OO(p565o0oOo000.o000OOo.chatroom_run)).setContentIntent(activity);
        Intrinsics.checkNotNullExpressionValue(contentIntent, "setContentIntent(...)");
        if (i >= 26) {
            contentIntent.setChannelId("yalla_room");
        }
        startForeground(1906, contentIntent.build());
    }

    public final void OooOO0O() {
        List<o0OO0> list = com.yalla.yalla.service.room.OooO00o.f24525OooO0oO.f48536OooOO0O;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((o0OO0) obj).f54750OooO0OO.getValue().longValue() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.OooO0oo(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((o0OO0) it.next()).f54750OooO0OO.getValue().longValue()));
        }
        Set<Long> set = CollectionsKt.toSet(arrayList2);
        OooOOOO.OooO0OO("RoomLiveService", "syncMicListToZego micList = ".concat(p187o00o00o0.OooO.OooO00o(set)));
        p356o0OOOo0o.OooOO0 oooOO1 = this.f24609OooO0oO;
        if (oooOO1 != null) {
            oooOO1.OooOo00(set);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        if (i == -2) {
            boolean z = g.f53585OooO00o;
            g.OooO();
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    @Nullable
    public final IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onBind(intent);
        return new OooO00o();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        f24604OooOo00 = this;
        OooOOOO.OooO0OO("RoomLiveService", "initService");
        OooOO0();
        int i = 1;
        LiveEventBus.get("Disconnect_Room").observe(this, new p431o0OoOO.o00oO0o(this, i));
        LiveEventBus.get("Room_State_Close").observe(this, new o0000Ooo(this, i));
        LiveEventBus.get("EVENT_UPDATE_SUBSCRIBE_NUMBER").observe(this, new p483o0o000O0.OooOOO0());
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        OooOOOO.OooO0OO("RoomLiveService", "onDestroy");
        f24604OooOo00 = null;
        OooO0o0();
        OooO0O0();
        OooOOOO.OooO0OO("RoomLiveService", "clearRoomData");
        com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().OooO00o();
        MixedRoomDataSource mixedRoomDataSourceOooO0o0 = MixedRoomDataSource.OooO0o0();
        if (MixedRoomDataSource.f22993OooOo00 != null) {
            mixedRoomDataSourceOooO0o0.f22998OooO0oO = null;
            com.yalla.yalla.service.room.OooO00o.f24532OooOOOO.OooO0oO(false);
            MixedRoomDataSource.f22993OooOo00 = null;
        } else {
            mixedRoomDataSourceOooO0o0.getClass();
        }
        MixedRoomDataSource.f22993OooOo00 = new MixedRoomDataSource();
        MutableState mutableState = o0Oo0oo.f46817OooO00o;
        o0Oo0oo.f46817OooO00o.setValue(RoomState.Close);
        o0Oo0oo.f46818OooO0O0 = false;
        Job job = o0Oo0oo.f46819OooO0OO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        o0Oo0oo.f46819OooO0OO = null;
        Job job2 = o0000O00.f48720OooO0O0;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        o0000O00.f48720OooO0O0 = null;
        RoomVoiceModule roomVoiceModule = o0000O00.f48721OooO0OO;
        if (roomVoiceModule != null) {
            List<RoomVoiceModule.TimeVoice> timeVoice = roomVoiceModule != null ? roomVoiceModule.getTimeVoice() : null;
            if (timeVoice == null || timeVoice.isEmpty()) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o0000O0(null), 3, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        OooOO0();
        return super.onStartCommand(intent, i, i2);
    }
}
