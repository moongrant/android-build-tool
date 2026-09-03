package p478o0o000O0;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.MainThread;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.common.support.sailfish_commons.logmodels.CustomLogModel;
import com.facebook.share.internal.ShareConstants;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.mixedroom.model.RoomNationalModel;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.room.RoomError3000;
import com.yalla.yalla.model.room.RoomError3003;
import com.yalla.yalla.statistical.event.RoomEventType;
import com.yalla.yalla.statistical.net.NetStateExceptionTypeE;
import com.yalla.yalla.ui.activity.room.RoomReAnnouncementActivity;
import com.youth.banner.config.BannerConfig;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;
import p140o00OOooo.OooOO0;
import p157o00OoOO0.o0OO00O;
import p417o0OoO0.OooO;
import p427o0OoOO00.o0OOO0o;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;
import p471o0Ooooo.o0O00O;
import p471o0Ooooo.o0OoO00O;
import p475o0o000.oo000o;
import p482o0o000oO.o0Oo0oo;
import p519o0o0O0oO.l5;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomErrorHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomErrorHandler.kt\ncom/yalla/yalla/service/room/error/RoomErrorHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,367:1\n1#2:368\n*E\n"})
public final class OooOOOO {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47632OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f47633OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 == null) {
                return null;
            }
            RoomConfiguration roomConfiguration = MixedRoomDataSource.OooO0o0().f23460OooO0o;
            int i = RoomReAnnouncementActivity.f26628OooOo0O;
            if (roomConfiguration != null) {
                Intent intent = new Intent(activityOooO0O0, (Class<?>) RoomReAnnouncementActivity.class);
                intent.putExtra("Module", roomConfiguration);
                activityOooO0O0.startActivityForResult(intent, 106);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.error.RoomErrorHandler$post$1", f = "RoomErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f47634OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Object f47635OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f47636OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, int i2, Object obj, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f47634OooO0Oo = i;
            this.f47636OooO0o0 = i2;
            this.f47635OooO0o = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f47634OooO0Oo, this.f47636OooO0o0, this.f47635OooO0o, continuation);
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
            OooOOOO.OooO00o(this.f47634OooO0Oo, this.f47636OooO0o0, this.f47635OooO0o);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:128:0x0362 A[Catch: Exception -> 0x0697, TryCatch #2 {Exception -> 0x0697, blocks: (B:209:0x054d, B:210:0x0550, B:202:0x0506, B:204:0x050e, B:205:0x0526, B:207:0x052e, B:208:0x0546, B:174:0x0473, B:176:0x0477, B:178:0x047c, B:180:0x0486, B:182:0x048c, B:187:0x0497, B:189:0x04ad, B:190:0x04b2, B:191:0x04b9, B:192:0x04be, B:194:0x04c2, B:196:0x04c7, B:198:0x04d1, B:199:0x04da, B:201:0x04e2, B:163:0x041b, B:165:0x0426, B:167:0x0431, B:168:0x043c, B:172:0x045d, B:171:0x0448, B:129:0x036f, B:130:0x037c, B:132:0x0384, B:137:0x038f, B:139:0x03a5, B:140:0x03aa, B:141:0x03b1, B:143:0x03b9, B:148:0x03c4, B:150:0x03da, B:151:0x03df, B:152:0x03e6, B:154:0x03ee, B:159:0x03f9, B:161:0x040f, B:162:0x0414, B:122:0x02ff, B:123:0x0321, B:124:0x0342, B:126:0x0350, B:127:0x035b, B:101:0x0238, B:102:0x0243, B:103:0x024e, B:104:0x0259, B:105:0x0264, B:106:0x026f, B:107:0x027a, B:108:0x0285, B:109:0x028c, B:110:0x0293, B:111:0x029e, B:112:0x02a5, B:113:0x02b0, B:114:0x02bb, B:116:0x02c5, B:117:0x02d0, B:118:0x02db, B:119:0x02e6, B:120:0x02ed, B:121:0x02f4, B:128:0x0362, B:30:0x0068, B:31:0x006d, B:33:0x007b, B:34:0x007d, B:35:0x009b, B:37:0x00a5, B:40:0x00ab, B:41:0x00b7, B:42:0x00c5, B:44:0x00cd, B:49:0x00d8, B:51:0x00ee, B:52:0x00f3, B:53:0x00fa, B:55:0x0101, B:57:0x010c, B:61:0x0147, B:62:0x0154, B:64:0x015c, B:69:0x0167, B:71:0x017d, B:72:0x0182, B:73:0x0189, B:74:0x0190, B:75:0x0197, B:77:0x019d, B:79:0x01a1, B:80:0x01a8, B:81:0x01b5, B:83:0x01bd, B:88:0x01c8, B:90:0x01de, B:91:0x01e3, B:92:0x01ea, B:94:0x01ee, B:97:0x01f4, B:99:0x01fe, B:100:0x020c, B:173:0x0468, B:60:0x0132, B:211:0x0559, B:213:0x0561, B:222:0x058a, B:218:0x056b, B:220:0x0581, B:221:0x0585, B:223:0x0593, B:225:0x059b, B:234:0x05c4, B:230:0x05a5, B:232:0x05bb, B:233:0x05bf, B:235:0x05cd, B:237:0x05d5, B:242:0x05e0, B:244:0x05f6, B:245:0x05fb, B:246:0x0602, B:248:0x060a, B:253:0x0615, B:255:0x062b, B:256:0x062f, B:257:0x0635, B:258:0x0639, B:259:0x063d, B:261:0x0662, B:262:0x0666, B:264:0x066e, B:269:0x0678, B:271:0x068e, B:272:0x0692), top: B:279:0x0027, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0468 A[Catch: Exception -> 0x0697, TryCatch #2 {Exception -> 0x0697, blocks: (B:209:0x054d, B:210:0x0550, B:202:0x0506, B:204:0x050e, B:205:0x0526, B:207:0x052e, B:208:0x0546, B:174:0x0473, B:176:0x0477, B:178:0x047c, B:180:0x0486, B:182:0x048c, B:187:0x0497, B:189:0x04ad, B:190:0x04b2, B:191:0x04b9, B:192:0x04be, B:194:0x04c2, B:196:0x04c7, B:198:0x04d1, B:199:0x04da, B:201:0x04e2, B:163:0x041b, B:165:0x0426, B:167:0x0431, B:168:0x043c, B:172:0x045d, B:171:0x0448, B:129:0x036f, B:130:0x037c, B:132:0x0384, B:137:0x038f, B:139:0x03a5, B:140:0x03aa, B:141:0x03b1, B:143:0x03b9, B:148:0x03c4, B:150:0x03da, B:151:0x03df, B:152:0x03e6, B:154:0x03ee, B:159:0x03f9, B:161:0x040f, B:162:0x0414, B:122:0x02ff, B:123:0x0321, B:124:0x0342, B:126:0x0350, B:127:0x035b, B:101:0x0238, B:102:0x0243, B:103:0x024e, B:104:0x0259, B:105:0x0264, B:106:0x026f, B:107:0x027a, B:108:0x0285, B:109:0x028c, B:110:0x0293, B:111:0x029e, B:112:0x02a5, B:113:0x02b0, B:114:0x02bb, B:116:0x02c5, B:117:0x02d0, B:118:0x02db, B:119:0x02e6, B:120:0x02ed, B:121:0x02f4, B:128:0x0362, B:30:0x0068, B:31:0x006d, B:33:0x007b, B:34:0x007d, B:35:0x009b, B:37:0x00a5, B:40:0x00ab, B:41:0x00b7, B:42:0x00c5, B:44:0x00cd, B:49:0x00d8, B:51:0x00ee, B:52:0x00f3, B:53:0x00fa, B:55:0x0101, B:57:0x010c, B:61:0x0147, B:62:0x0154, B:64:0x015c, B:69:0x0167, B:71:0x017d, B:72:0x0182, B:73:0x0189, B:74:0x0190, B:75:0x0197, B:77:0x019d, B:79:0x01a1, B:80:0x01a8, B:81:0x01b5, B:83:0x01bd, B:88:0x01c8, B:90:0x01de, B:91:0x01e3, B:92:0x01ea, B:94:0x01ee, B:97:0x01f4, B:99:0x01fe, B:100:0x020c, B:173:0x0468, B:60:0x0132, B:211:0x0559, B:213:0x0561, B:222:0x058a, B:218:0x056b, B:220:0x0581, B:221:0x0585, B:223:0x0593, B:225:0x059b, B:234:0x05c4, B:230:0x05a5, B:232:0x05bb, B:233:0x05bf, B:235:0x05cd, B:237:0x05d5, B:242:0x05e0, B:244:0x05f6, B:245:0x05fb, B:246:0x0602, B:248:0x060a, B:253:0x0615, B:255:0x062b, B:256:0x062f, B:257:0x0635, B:258:0x0639, B:259:0x063d, B:261:0x0662, B:262:0x0666, B:264:0x066e, B:269:0x0678, B:271:0x068e, B:272:0x0692), top: B:279:0x0027, inners: #0, #1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    @MainThread
    public static void OooO00o(int i, int i2, Object obj) {
        RoomNationalModel roomNationalModel;
        String str;
        RoomError3000 roomError3000;
        RoomError3003 roomError3003;
        StringBuilder sbOooO00o = o00000.OooO00o("code = ", i, ", commendCode = ", i2, ", data = ");
        sbOooO00o.append(obj);
        OooOOO0.OooO0OO("RoomErrorHandler", sbOooO00o.toString());
        if (i != 0) {
            try {
                if (i == 1) {
                    Lazy lazy = o0Oo0oo.f47701OooO00o;
                    NetStateExceptionTypeE tag = NetStateExceptionTypeE.CONNECT_ROOM;
                    Intrinsics.checkNotNullParameter(tag, "tag");
                    Intrinsics.checkNotNullParameter("UNKNOWN_ERROR_1", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                    CustomLogModel customLogModel = new CustomLogModel();
                    customLogModel.setLevel("ERROR");
                    customLogModel.setTag(tag.toString());
                    customLogModel.setMessage("UNKNOWN_ERROR_1");
                    o0Oo0oo.OooO00o(customLogModel);
                    if (i2 == 10001) {
                        o0OOO0o.OooO0OO(1, 2);
                        return;
                    }
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.Unknown_Failure);
                    if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                        return;
                    }
                    o000Oo0 runnable = new o000Oo0(strOooO0OO);
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        runnable.run();
                        return;
                    }
                    o000O0.f10355OooO0O0.post(runnable);
                }
                if (i == 2) {
                    o0OOO0o.OooO0OO(2, 2);
                    return;
                }
                if (i == 3) {
                    o0OOO0o.OooO0OO(3, 2);
                    return;
                }
                if (i == 1037) {
                    String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.You_are_unable_to_ban_kick_out_Duke);
                    if (strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) {
                        return;
                    }
                    o000Oo0 runnable2 = new o000Oo0(strOooO0OO2);
                    Intrinsics.checkNotNullParameter(runnable2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        runnable2.run();
                        return;
                    } else {
                        o000O0.f10355OooO0O0.post(runnable2);
                        return;
                    }
                }
                if (i == 1038) {
                    String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.You_are_unable_to_ban_kick_out_Emperor);
                    if (strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3)) {
                        return;
                    }
                    o000Oo0 runnable3 = new o000Oo0(strOooO0OO3);
                    Intrinsics.checkNotNullParameter(runnable3, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        runnable3.run();
                        return;
                    } else {
                        o000O0.f10355OooO0O0.post(runnable3);
                        return;
                    }
                }
                if (i == 5000) {
                    String strOooO0OO4 = o0000.OooO0OO(oO00OOo0.face_has_expired);
                    if (!(strOooO0OO4 == null || StringsKt.isBlank(strOooO0OO4))) {
                        o000Oo0 runnable4 = new o000Oo0(strOooO0OO4);
                        Intrinsics.checkNotNullParameter(runnable4, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            runnable4.run();
                        } else {
                            o000O0.f10355OooO0O0.post(runnable4);
                        }
                    }
                    LiveEventBus.get("CHAT_FACE_HAS_SOLD_OUT").post("");
                    return;
                }
                if (i == 5001) {
                    String strOooO0OO5 = o0000.OooO0OO(oO00OOo0.face_has_sold_out);
                    if (!(strOooO0OO5 == null || StringsKt.isBlank(strOooO0OO5))) {
                        o000Oo0 runnable5 = new o000Oo0(strOooO0OO5);
                        Intrinsics.checkNotNullParameter(runnable5, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            runnable5.run();
                        } else {
                            o000O0.f10355OooO0O0.post(runnable5);
                        }
                    }
                    LiveEventBus.get("CHAT_FACE_HAS_SOLD_OUT").post("");
                    return;
                }
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
                o00O0 o00o1 = o00O0.f45732OooO00o;
                switch (i) {
                    case 1001:
                        Lazy lazy2 = o0Oo0oo.f47701OooO00o;
                        NetStateExceptionTypeE tag2 = NetStateExceptionTypeE.CONNECT_ROOM;
                        Intrinsics.checkNotNullParameter(tag2, "tag");
                        Intrinsics.checkNotNullParameter("UNPACK_ERROR_1001", ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
                        CustomLogModel customLogModel2 = new CustomLogModel();
                        customLogModel2.setLevel("ERROR");
                        customLogModel2.setTag(tag2.toString());
                        customLogModel2.setMessage("UNPACK_ERROR_1001");
                        o0Oo0oo.OooO00o(customLogModel2);
                        OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1001));
                        break;
                    case 1035:
                        String str2 = obj instanceof String ? (String) obj : null;
                        if (str2 != null && (roomNationalModel = (RoomNationalModel) OooOO0.OooO0O0(RoomNationalModel.class, str2)) != null) {
                            String reason = roomNationalModel.getReason();
                            Intrinsics.checkNotNullExpressionValue(reason, "it.reason");
                            OooO0Oo(reason);
                            break;
                        }
                        break;
                    case 1040:
                        String strOooO0OO6 = o0000.OooO0OO(oO00OOo0.Sorry_the_number_of_members_in_this_room_has_reached_the_maximum_please_contact_the_owner);
                        if (!(strOooO0OO6 == null || StringsKt.isBlank(strOooO0OO6))) {
                            o000Oo0 runnable6 = new o000Oo0(strOooO0OO6);
                            Intrinsics.checkNotNullParameter(runnable6, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000O0.f10355OooO0O0.post(runnable6);
                            } else {
                                runnable6.run();
                            }
                        }
                        break;
                    case 1044:
                        o00o1.OooO0OO(new oOO00O(oOO00O.Crystal_NotEnough, ""));
                        break;
                    case 1051:
                        MutableState mutableState = o0OOO0o.f45698OooO00o;
                        o0OOO0o.OooO0O0(1051, obj instanceof String ? (String) obj : null);
                        break;
                    case Constants.WARN_APM_RESIDUAL_ECHO /* 1053 */:
                        o0OOO0o.OooO0OO(Constants.WARN_APM_RESIDUAL_ECHO, 2);
                        break;
                    case 1055:
                        o0OOO0o.OooO0OO(1055, 2);
                        break;
                    case 1058:
                        String strOooO0OO7 = o0000.OooO0OO(oO00OOo0.error_friend_add_unacceptable_word);
                        if (!(strOooO0OO7 == null || StringsKt.isBlank(strOooO0OO7))) {
                            o000Oo0 runnable7 = new o000Oo0(strOooO0OO7);
                            Intrinsics.checkNotNullParameter(runnable7, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000O0.f10355OooO0O0.post(runnable7);
                            } else {
                                runnable7.run();
                            }
                        }
                        break;
                    case 1060:
                        LiveEventBus.get("ROOM_GUESS_START_A_GUESSING_GAME_STATE").post(Boolean.FALSE);
                        break;
                    case 1070:
                        try {
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.ByteArray");
                            Room.MagicVoiceOut from = Room.MagicVoiceOut.parseFrom((byte[]) obj);
                            if (from != null) {
                                int protectedTimeLeft = from.getProtectedTimeLeft();
                                OooO0Oo(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_voice_card_protected), String.valueOf(protectedTimeLeft / 60), String.valueOf(protectedTimeLeft % 60)));
                            }
                        } catch (InvalidProtocolBufferException e) {
                            OooOOO0.OooO0O0("RoomErrorCode.Voice_Card_Protection_Cover " + e.getMessage());
                            return;
                        }
                        break;
                    case ZegoConstants.StreamUpdateType.Deleted /* 2002 */:
                        o0OOO0o.OooO0OO(ZegoConstants.StreamUpdateType.Deleted, 2);
                        break;
                    case 4000:
                        String strOooO0OO8 = o0000.OooO0OO(oO00OOo0.room_vote_game_exist);
                        if (!(strOooO0OO8 == null || StringsKt.isBlank(strOooO0OO8))) {
                            o000Oo0 runnable8 = new o000Oo0(strOooO0OO8);
                            Intrinsics.checkNotNullParameter(runnable8, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000O0.f10355OooO0O0.post(runnable8);
                            } else {
                                runnable8.run();
                            }
                        }
                        break;
                    case 4155:
                        p385o0OOooOO.oOO00O.OooO0Oo(true);
                        o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_sold_out));
                        break;
                    case 6000:
                        Context context = o000O0.f10354OooO00o;
                        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                        FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
                        if (fragmentActivity != null) {
                            OooO.OooO00o(fragmentActivity, new l5(OooOO0O.f47629OooO0Oo));
                        }
                        break;
                    case 10041:
                        OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1005));
                        break;
                    case 10070:
                        Boolean value = oooO00o.OooO00o().f25021OooOoO.getValue();
                        if (value == null) {
                            value = Boolean.FALSE;
                        }
                        oooO00o.OooO00o().f25021OooOoO.postValue(Boolean.valueOf(value.booleanValue()));
                        LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM").post(Boolean.FALSE);
                        break;
                    case 4000000:
                        o0OOO0o.OooO0OO(4000000, 2);
                        break;
                    default:
                        switch (i) {
                            case 1003:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1003));
                                break;
                            case 1004:
                                o0OOO0o.OooO0OO(1004, 2);
                                break;
                            case 1005:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1005));
                                break;
                            case 1006:
                                o0OOO0o.OooO0OO(1006, 2);
                                break;
                            case 1007:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1007));
                                break;
                            case 1008:
                                if (!oooO00o.OooO00o().OooOOO()) {
                                    o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.microom_code_1008_));
                                } else {
                                    o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.microom_code_1008));
                                }
                                break;
                            case 1009:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1009));
                                break;
                            case 1010:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1010));
                                break;
                            case 1011:
                                o0OOO0o.OooO0OO(1011, 2);
                                break;
                            case 1012:
                                o00o1.OooO0OO(new oOO00O(oOO00O.Coin_NotEnough, ""));
                                break;
                            case 1013:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1013));
                                break;
                            case 1014:
                                o0OOO0o.OooO0OO(1014, 2);
                                break;
                            case 1015:
                                o0OOO0o.OooO0OO(1015, 2);
                                break;
                            case 1016:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1016));
                                break;
                            case 1017:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1017));
                                break;
                            case 1018:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1018));
                                break;
                            case 1019:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1019));
                                break;
                            case Constants.WARN_ADM_PLAYOUT_ABNORMAL_FREQUENCY /* 1020 */:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1020));
                                break;
                            case Constants.WARN_ADM_RECORD_ABNORMAL_FREQUENCY /* 1021 */:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1021));
                                break;
                            case 1022:
                                OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1022));
                                break;
                            default:
                                switch (i) {
                                    case LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY /* 1024 */:
                                        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                                        if (!Intrinsics.areEqual(com.yalla.yalla.service.room.OooO00o.OooO0OO(), com.yalla.yalla.service.room.OooO0OO.OooO0o.f25055OooO00o)) {
                                            o0OOO0o.OooO0OO(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 2);
                                        } else {
                                            com.yalla.yalla.service.room.OooO00o.f24977OooO0o.f47438OooO0O0.setValue(Boolean.TRUE);
                                        }
                                        break;
                                    case 1025:
                                        oo000o oo000oVar = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0;
                                        oo000oVar.f47492OooO0oO.setValue(Integer.valueOf(((Number) oo000oVar.f47492OooO0oO.getValue()).intValue() + 1));
                                        ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
                                        com.yalla.yalla.service.room.OooO00o.OooO0oO(com.yalla.yalla.service.room.OooO0OO.AbstractC0318OooO0OO.OooO00o.f25053OooO00o);
                                        break;
                                    case 1026:
                                        o0OOO0o.OooO0OO(1026, 2);
                                        o0OoO00O error = new o0OoO00O();
                                        Intrinsics.checkNotNullParameter(error, "error");
                                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00O(error, null), 3, null);
                                        break;
                                    default:
                                        switch (i) {
                                            case 1028:
                                                break;
                                            case 1029:
                                                String strOooO0OO9 = o0000.OooO0OO(oO00OOo0.mic_using);
                                                if (!(strOooO0OO9 == null || StringsKt.isBlank(strOooO0OO9))) {
                                                    o000Oo0 runnable9 = new o000Oo0(strOooO0OO9);
                                                    Intrinsics.checkNotNullParameter(runnable9, "runnable");
                                                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                        o000O0.f10355OooO0O0.post(runnable9);
                                                    } else {
                                                        runnable9.run();
                                                    }
                                                }
                                                break;
                                            case 1030:
                                                String strOooO0OO10 = o0000.OooO0OO(oO00OOo0.tip_locked);
                                                if (!(strOooO0OO10 == null || StringsKt.isBlank(strOooO0OO10))) {
                                                    o000Oo0 runnable10 = new o000Oo0(strOooO0OO10);
                                                    Intrinsics.checkNotNullParameter(runnable10, "runnable");
                                                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                        o000O0.f10355OooO0O0.post(runnable10);
                                                    } else {
                                                        runnable10.run();
                                                    }
                                                }
                                                break;
                                            case Constants.WARN_ADM_RECORD_AUDIO_LOWLEVEL /* 1031 */:
                                                String strOooO0OO11 = o0000.OooO0OO(oO00OOo0.mic_locked_by_ower);
                                                if (!(strOooO0OO11 == null || StringsKt.isBlank(strOooO0OO11))) {
                                                    o000Oo0 runnable11 = new o000Oo0(strOooO0OO11);
                                                    Intrinsics.checkNotNullParameter(runnable11, "runnable");
                                                    if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                        o000O0.f10355OooO0O0.post(runnable11);
                                                    } else {
                                                        runnable11.run();
                                                    }
                                                }
                                                break;
                                            case Constants.WARN_ADM_PLAYOUT_AUDIO_LOWLEVEL /* 1032 */:
                                                o00o1.OooO0OO(new oOO00O(oOO00O.Coin_Frozen, ""));
                                                break;
                                            case 1033:
                                                o00o1.OooO0OO(new oOO00O(oOO00O.Coin_NotEnough, ""));
                                                break;
                                            default:
                                                switch (i) {
                                                    case 1046:
                                                        OooO0Oo(o0000.OooO0OO(oO00OOo0.microom_code_1005));
                                                        break;
                                                    case 1047:
                                                        OooO0Oo(o0000.OooO0OO(oO00OOo0.room_mora_code_10047));
                                                        break;
                                                    case 1048:
                                                        try {
                                                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.ByteArray");
                                                            Room.MoraStartPkRequestReply from2 = Room.MoraStartPkRequestReply.parseFrom((byte[]) obj);
                                                            if (from2 != null) {
                                                                MixedRoomDataSource.OooO0o0().OooOo0o(from2.getMuuid());
                                                            }
                                                            OooO0Oo(o0000.OooO0OO(oO00OOo0.room_mora_code_10048));
                                                        } catch (InvalidProtocolBufferException e2) {
                                                            OooOOO0.OooO0Oo("RoomErrorCode.ROOM_MORA_GAME_FAIL_1048" + e2.getMessage());
                                                            return;
                                                        }
                                                        break;
                                                    case 1049:
                                                        OooO0Oo(o0000.OooO0OO(oO00OOo0.room_mora_code_10048));
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case BannerConfig.LOOP_TIME /* 3000 */:
                                                                Context context2 = o000O0.f10354OooO00o;
                                                                Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                                                                if (activityOooO0O1 != null) {
                                                                    o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O1);
                                                                    o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.feature_not_available));
                                                                    o0oo00o2.OooOo(true);
                                                                    o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.Update_Now));
                                                                    o0oo00o2.OooOo0(OooOO0.f47628OooO0Oo);
                                                                    o0oo00o2.OooOO0o();
                                                                }
                                                                break;
                                                            case ZegoConstants.RoomError.DatiCommitError /* 3001 */:
                                                                str = obj instanceof String ? (String) obj : null;
                                                                if (str != null && (roomError3000 = (RoomError3000) OooOO0.OooO0O0(RoomError3000.class, str)) != null) {
                                                                    OooO0Oo(roomError3000.getMsg());
                                                                    break;
                                                                }
                                                                break;
                                                            case ZegoConstants.RoomError.DatiTimeoutError /* 3002 */:
                                                                OooO0O0();
                                                                break;
                                                            case ZegoConstants.RoomError.DatiRepeatError /* 3003 */:
                                                                str = obj instanceof String ? (String) obj : null;
                                                                if (str != null && (roomError3003 = (RoomError3003) OooOO0.OooO0O0(RoomError3003.class, str)) != null) {
                                                                    String msg = roomError3003.getMsg();
                                                                    if (!(msg == null || StringsKt.isBlank(msg))) {
                                                                        o000Oo0 runnable12 = new o000Oo0(msg);
                                                                        Intrinsics.checkNotNullParameter(runnable12, "runnable");
                                                                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                                            o000O0.f10355OooO0O0.post(runnable12);
                                                                        } else {
                                                                            runnable12.run();
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 4251:
                                                                        o000O00O.OooO00o(oO00OOo0.apply_mic_is_turned_off);
                                                                        break;
                                                                    case 4252:
                                                                        Context context3 = o000O0.f10354OooO00o;
                                                                        Activity activityOooO0O2 = com.code.android.util.OooO0O0.OooO0O0();
                                                                        if (activityOooO0O2 != null) {
                                                                            o0OO00O o0oo00o3 = new o0OO00O(activityOooO0O2);
                                                                            o0oo00o3.OooOo00(o0000.OooO0OO(oO00OOo0.apply_mic_outof_max));
                                                                            o0oo00o3.OooOo0(OooOOO0.f47631OooO0Oo);
                                                                            o0oo00o3.OooOO0o();
                                                                        }
                                                                        break;
                                                                    case 4253:
                                                                        Context context4 = o000O0.f10354OooO00o;
                                                                        Activity activityOooO0O3 = com.code.android.util.OooO0O0.OooO0O0();
                                                                        if (activityOooO0O3 != null) {
                                                                            o0OO00O o0oo00o4 = new o0OO00O(activityOooO0O3);
                                                                            o0oo00o4.OooOo00(o0000.OooO0OO(oO00OOo0.no_mic_return_apply_list));
                                                                            o0oo00o4.OooOo0(OooOOO.f47630OooO0Oo);
                                                                            o0oo00o4.OooOO0o();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        if (i2 == 10001) {
                                                                            o0OOO0o.OooO0OO(0, 3);
                                                                        }
                                                                        Lazy lazy3 = o0Oo0oo.f47701OooO00o;
                                                                        o0Oo0oo.OooO0OO(RoomEventType.Room_Socket_UnknowErrcode);
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void OooO0O0() {
        boolean z;
        ArrayList<ProfileLimitModel> profileLimit = MixedRoomDataSource.OooO0o0().f23460OooO0o.getProfileLimit();
        if (profileLimit != null) {
            for (ProfileLimitModel profileLimitModel : profileLimit) {
                if (profileLimitModel.getOperationType() == 3) {
                    String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.RoomInfoEdit_ChangeLimit_HintContent_Sign), String.valueOf(profileLimitModel.getBlockReason()));
                    if (profileLimitModel.getExpireTime() <= 0 || (System.currentTimeMillis() / ((long) 1000)) - profileLimitModel.getExpireTime() > 0) {
                        z = false;
                    } else {
                        strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.RoomInfoEdit_ChangeLimit_HintContent_Sign_Time), String.valueOf(profileLimitModel.getBlockReason())), o0000oo.OooO0Oo(profileLimitModel.getExpireTime(), System.currentTimeMillis()));
                        z = true;
                    }
                    Context context = o000O0.f10354OooO00o;
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O0);
                        o0oo00o2.OooOo00(strOooO00o);
                        if (z) {
                            o0oo00o2.OooOo0(OooO00o.f47632OooO0Oo);
                        } else {
                            o0oo00o2.OooOo(true);
                            o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.CONTINUE_));
                            o0oo00o2.OooOo0(OooO0O0.f47633OooO0Oo);
                        }
                        o0oo00o2.OooOO0o();
                        return;
                    }
                    return;
                }
            }
        }
    }

    @JvmStatic
    public static final void OooO0OO(int i, int i2, @Nullable Object obj) {
        StringBuilder sbOooO00o = o00000.OooO00o("code = ", i, ", commendCode = ", i2, ", data = ");
        sbOooO00o.append(obj);
        OooOOO0.OooO0OO("RoomErrorHandler", sbOooO00o.toString());
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            OooO00o(i, i2, obj);
        } else {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(i, i2, obj, null), 3, null);
        }
    }

    public static void OooO0Oo(String str) {
        Context context = o000O0.f10354OooO00o;
        Activity activity = com.code.android.util.OooO0O0.OooO0O0();
        if (activity != null) {
            o0OO00O o0oo00o2 = new o0OO00O(activity);
            o0oo00o2.OooOo00(str);
            o0oo00o2.OooOO0o();
            Intrinsics.checkNotNullParameter(activity, "activity");
            Object systemService = activity.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
        }
    }
}
