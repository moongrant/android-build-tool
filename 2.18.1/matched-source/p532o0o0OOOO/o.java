package p532o0o0OOOO;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.mixedroom.model.RoomNationalModel;
import com.app.base.model.ProfileLimitModel;
import com.app.base.protobuf.room.Room;
import com.code.android.util.ToastUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.statistical.event.RoomEventType;
import com.yalla.yalla.common.statistical.net.FLog;
import com.yalla.yalla.common.statistical.net.NetStateExceptionTypeE;
import com.yalla.yalla.common.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import com.yalla.yalla.data.constant.RoomLoginState;
import com.yalla.yalla.model.RoomError1051;
import com.yalla.yalla.model.RoomError3000;
import com.yalla.yalla.model.RoomError3003;
import com.yalla.yalla.ui.activity.room.RoomReAnnouncementActivity;
import com.youth.banner.config.BannerConfig;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p042Ooooo0o.o000O0Oo;
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o00oOoo;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.oo0oOO0;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0Oo0oo;
import p528o0o0OO0O.o000O;
import p528o0o0OO0O.o000OO00;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o f43431OooO00o = new o();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f43432Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomStateManager.INSTANCE.closeRoom();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f43433Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f43434Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f43435Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomStateManager.INSTANCE.closeRoom();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<DialogInterface, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f43436Oooo0o = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DialogInterface dialogInterface) {
            DialogInterface it = dialogInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomStateManager.INSTANCE.closeRoom();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f43437Oooo0o = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomStateManager.INSTANCE.closeRoom();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0O f43438Oooo0o = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO f43439Oooo0o = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Object objOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
            if (objOooO0O0 == null && (objOooO0O0 = o0000O.f2657OooO00o) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                objOooO0O0 = null;
            }
            Intrinsics.checkNotNull(objOooO0O0, "null cannot be cast to non-null type android.app.Activity");
            RoomReAnnouncementActivity.OooOoO((Activity) objOooO0O0, o000O00O.OooO().f32427Oooo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f43440Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.service.room.error.RoomErrorHandler$post$1", f = "RoomErrorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f43441Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f43442Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Object f43443Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(int i, int i2, Object obj, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f43441Oooo0o = i;
            this.f43442Oooo0oO = i2;
            this.f43443Oooo0oo = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f43441Oooo0o, this.f43442Oooo0oO, this.f43443Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o.f43431OooO00o.OooO00o(this.f43441Oooo0o, this.f43442Oooo0oO, this.f43443Oooo0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOo00 f43444Oooo0o = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomStateManager.INSTANCE.closeRoom();
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    public static final void OooO0OO(int i, int i2, @Nullable Object obj) {
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("code = ", i, ", commendCode = ", i2, ", data = ");
        sbOooO0O0.append(obj);
        o00O00.OooO0OO("RoomErrorHandler", sbOooO0O0.toString());
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            f43431OooO00o.OooO00o(i, i2, obj);
        } else {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(i, i2, obj, null), 3, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:125:0x03a3 A[Catch: Exception -> 0x0720, TryCatch #0 {Exception -> 0x0720, blocks: (B:22:0x004d, B:211:0x05ea, B:204:0x05a0, B:206:0x05a8, B:207:0x05c1, B:209:0x05c9, B:210:0x05e2, B:176:0x0505, B:178:0x0509, B:180:0x050e, B:182:0x0518, B:184:0x0520, B:189:0x052b, B:191:0x0541, B:192:0x0546, B:193:0x054f, B:194:0x0554, B:196:0x0558, B:198:0x055d, B:200:0x0567, B:201:0x0572, B:203:0x057a, B:160:0x046f, B:162:0x0478, B:164:0x0483, B:165:0x048e, B:169:0x04b2, B:171:0x04ca, B:173:0x04da, B:174:0x04de, B:175:0x04f6, B:168:0x0498, B:126:0x03b2, B:127:0x03c1, B:129:0x03cc, B:134:0x03d7, B:136:0x03ed, B:137:0x03f2, B:138:0x03fb, B:140:0x0406, B:145:0x0411, B:147:0x0427, B:148:0x042c, B:149:0x0435, B:151:0x0440, B:156:0x044b, B:158:0x0461, B:159:0x0466, B:96:0x027f, B:97:0x028b, B:98:0x0297, B:99:0x02a3, B:100:0x02af, B:101:0x02bb, B:102:0x02c7, B:103:0x02d3, B:104:0x02df, B:105:0x02eb, B:106:0x02f7, B:114:0x0313, B:109:0x0307, B:112:0x030d, B:115:0x0334, B:116:0x0340, B:117:0x034c, B:119:0x0358, B:120:0x0364, B:121:0x0370, B:122:0x037c, B:123:0x038b, B:124:0x0397, B:125:0x03a3, B:23:0x0051, B:25:0x0061, B:26:0x0063, B:27:0x0081, B:29:0x008c, B:34:0x0097, B:36:0x00ad, B:37:0x00b2, B:38:0x00bb, B:40:0x00c3, B:42:0x00d8, B:44:0x00e3, B:48:0x0126, B:49:0x0133, B:51:0x013e, B:56:0x0149, B:58:0x015f, B:59:0x0164, B:60:0x016d, B:62:0x0175, B:63:0x018a, B:64:0x0195, B:66:0x0199, B:68:0x019e, B:70:0x01a8, B:72:0x01b0, B:73:0x01cf, B:75:0x01da, B:80:0x01e5, B:82:0x01fb, B:83:0x0200, B:84:0x0209, B:86:0x020d, B:88:0x0212, B:90:0x021c, B:91:0x022c, B:92:0x024f, B:94:0x025f, B:95:0x026a, B:170:0x04be, B:47:0x010c, B:212:0x05f1, B:214:0x05fc, B:223:0x0627, B:219:0x0606, B:221:0x061c, B:222:0x0620, B:224:0x0630, B:226:0x063b, B:235:0x0666, B:231:0x0645, B:233:0x065b, B:234:0x065f, B:236:0x066f, B:238:0x067a, B:243:0x0685, B:245:0x069b, B:246:0x06a0, B:247:0x06a9, B:249:0x06b4, B:254:0x06be, B:256:0x06d4, B:257:0x06d8, B:258:0x06e0, B:260:0x06f4, B:265:0x06fe, B:267:0x0714, B:268:0x0718), top: B:273:0x001c, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x04be A[Catch: Exception -> 0x0720, TryCatch #0 {Exception -> 0x0720, blocks: (B:22:0x004d, B:211:0x05ea, B:204:0x05a0, B:206:0x05a8, B:207:0x05c1, B:209:0x05c9, B:210:0x05e2, B:176:0x0505, B:178:0x0509, B:180:0x050e, B:182:0x0518, B:184:0x0520, B:189:0x052b, B:191:0x0541, B:192:0x0546, B:193:0x054f, B:194:0x0554, B:196:0x0558, B:198:0x055d, B:200:0x0567, B:201:0x0572, B:203:0x057a, B:160:0x046f, B:162:0x0478, B:164:0x0483, B:165:0x048e, B:169:0x04b2, B:171:0x04ca, B:173:0x04da, B:174:0x04de, B:175:0x04f6, B:168:0x0498, B:126:0x03b2, B:127:0x03c1, B:129:0x03cc, B:134:0x03d7, B:136:0x03ed, B:137:0x03f2, B:138:0x03fb, B:140:0x0406, B:145:0x0411, B:147:0x0427, B:148:0x042c, B:149:0x0435, B:151:0x0440, B:156:0x044b, B:158:0x0461, B:159:0x0466, B:96:0x027f, B:97:0x028b, B:98:0x0297, B:99:0x02a3, B:100:0x02af, B:101:0x02bb, B:102:0x02c7, B:103:0x02d3, B:104:0x02df, B:105:0x02eb, B:106:0x02f7, B:114:0x0313, B:109:0x0307, B:112:0x030d, B:115:0x0334, B:116:0x0340, B:117:0x034c, B:119:0x0358, B:120:0x0364, B:121:0x0370, B:122:0x037c, B:123:0x038b, B:124:0x0397, B:125:0x03a3, B:23:0x0051, B:25:0x0061, B:26:0x0063, B:27:0x0081, B:29:0x008c, B:34:0x0097, B:36:0x00ad, B:37:0x00b2, B:38:0x00bb, B:40:0x00c3, B:42:0x00d8, B:44:0x00e3, B:48:0x0126, B:49:0x0133, B:51:0x013e, B:56:0x0149, B:58:0x015f, B:59:0x0164, B:60:0x016d, B:62:0x0175, B:63:0x018a, B:64:0x0195, B:66:0x0199, B:68:0x019e, B:70:0x01a8, B:72:0x01b0, B:73:0x01cf, B:75:0x01da, B:80:0x01e5, B:82:0x01fb, B:83:0x0200, B:84:0x0209, B:86:0x020d, B:88:0x0212, B:90:0x021c, B:91:0x022c, B:92:0x024f, B:94:0x025f, B:95:0x026a, B:170:0x04be, B:47:0x010c, B:212:0x05f1, B:214:0x05fc, B:223:0x0627, B:219:0x0606, B:221:0x061c, B:222:0x0620, B:224:0x0630, B:226:0x063b, B:235:0x0666, B:231:0x0645, B:233:0x065b, B:234:0x065f, B:236:0x066f, B:238:0x067a, B:243:0x0685, B:245:0x069b, B:246:0x06a0, B:247:0x06a9, B:249:0x06b4, B:254:0x06be, B:256:0x06d4, B:257:0x06d8, B:258:0x06e0, B:260:0x06f4, B:265:0x06fe, B:267:0x0714, B:268:0x0718), top: B:273:0x001c, inners: #1, #2 }] */
    public final void OooO00o(int i, int i2, Object obj) {
        RoomNationalModel roomNationalModel;
        RoomError1051 roomError1051;
        RoomError3000 roomError3000;
        RoomError3003 roomError3003;
        StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("code = ", i, ", commendCode = ", i2, ", data = ");
        sbOooO0O0.append(obj);
        o00O00.OooO0OO("RoomErrorHandler", sbOooO0O0.toString());
        if (i != 0) {
            try {
                if (i == 1) {
                    FLog.INSTANCE.writeE(NetStateExceptionTypeE.CONNECT_ROOM, "UNKNOWN_ERROR_1");
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.Unknown_Failure);
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                        return;
                    }
                    o0O0ooO runnable = new o0O0ooO(toastUtil, strOooO0OO);
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        runnable.run();
                        return;
                    } else {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(runnable);
                        return;
                    }
                }
                if (i == 1037) {
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.You_are_unable_to_ban_kick_out_Duke);
                    ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2)) {
                        return;
                    }
                    o0O0ooO runnable2 = new o0O0ooO(toastUtil2, strOooO0OO2);
                    Intrinsics.checkNotNullParameter(runnable2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        runnable2.run();
                        return;
                    } else {
                        o00O000 o00o002 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(runnable2);
                        return;
                    }
                }
                if (i == 1038) {
                    String strOooO0OO3 = o000O0O0.OooO0OO(R.string.You_are_unable_to_ban_kick_out_Emperor);
                    ToastUtil toastUtil3 = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3)) {
                        return;
                    }
                    o0O0ooO runnable3 = new o0O0ooO(toastUtil3, strOooO0OO3);
                    Intrinsics.checkNotNullParameter(runnable3, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        runnable3.run();
                        return;
                    } else {
                        o00O000 o00o003 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(runnable3);
                        return;
                    }
                }
                if (i == 5000) {
                    String strOooO0OO4 = o000O0O0.OooO0OO(R.string.face_has_expired);
                    ToastUtil toastUtil4 = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO4 == null || StringsKt.isBlank(strOooO0OO4))) {
                        o0O0ooO runnable4 = new o0O0ooO(toastUtil4, strOooO0OO4);
                        Intrinsics.checkNotNullParameter(runnable4, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            runnable4.run();
                        } else {
                            o00O000 o00o004 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(runnable4);
                        }
                    }
                    LiveEventBus.get("CHAT_FACE_HAS_SOLD_OUT").post("");
                    return;
                }
                if (i == 5001) {
                    String strOooO0OO5 = o000O0O0.OooO0OO(R.string.face_has_sold_out);
                    ToastUtil toastUtil5 = ToastUtil.f12568OooO0O0;
                    if (!(strOooO0OO5 == null || StringsKt.isBlank(strOooO0OO5))) {
                        o0O0ooO runnable5 = new o0O0ooO(toastUtil5, strOooO0OO5);
                        Intrinsics.checkNotNullParameter(runnable5, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            runnable5.run();
                        } else {
                            o00O000 o00o005 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(runnable5);
                        }
                    }
                    LiveEventBus.get("CHAT_FACE_HAS_SOLD_OUT").post("");
                    return;
                }
                Context context = null;
                switch (i) {
                    case 1001:
                        FLog.INSTANCE.writeE(NetStateExceptionTypeE.CONNECT_ROOM, "UNPACK_ERROR_1001");
                        OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1001));
                        break;
                    case 1024:
                        if (o00OO00O.f43313OooooOo.OooO00o().f43325OooOO0O.getValue() == RoomLoginState.Succes) {
                            o00O o00o2 = o00O.f43140OooO00o;
                            o00O.f43176Oooo0OO.setValue(Boolean.TRUE);
                        }
                        break;
                    case 1026:
                        RoomStateManager.INSTANCE.disconnectRoom();
                        o000O error = new o000O(618);
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
                        break;
                    case 1035:
                        String str = obj instanceof String ? (String) obj : null;
                        if (str != null && (roomNationalModel = (RoomNationalModel) o0Oo0oo.OooO0OO(str, RoomNationalModel.class)) != null) {
                            o oVar = f43431OooO00o;
                            String reason = roomNationalModel.getReason();
                            Intrinsics.checkNotNullExpressionValue(reason, "it.reason");
                            oVar.OooO0Oo(reason);
                            break;
                        }
                        break;
                    case 1040:
                        String strOooO0OO6 = o000O0O0.OooO0OO(R.string.Sorry_the_number_of_members_in_this_room_has_reached_the_maximum_please_contact_the_owner);
                        ToastUtil toastUtil6 = ToastUtil.f12568OooO0O0;
                        if (!(strOooO0OO6 == null || StringsKt.isBlank(strOooO0OO6))) {
                            o0O0ooO runnable6 = new o0O0ooO(toastUtil6, strOooO0OO6);
                            Intrinsics.checkNotNullParameter(runnable6, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o00O000 o00o006 = o00O000.f34346OooO00o;
                                o00O000.f34348OooO0OO.post(runnable6);
                            } else {
                                runnable6.run();
                            }
                        }
                        break;
                    case 1051:
                        String str2 = obj instanceof String ? (String) obj : null;
                        if (str2 != null && (roomError1051 = (RoomError1051) o0Oo0oo.OooO0OO(str2, RoomError1051.class)) != null) {
                            o00O000 o00o007 = o00O000.f34346OooO00o;
                            Activity activityOooO0O0 = o00O000.OooO0O0();
                            if (activityOooO0O0 != null) {
                                Intrinsics.checkNotNull(activityOooO0O0, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                RoomBlackListUnJoinAndUnFollowDialog roomBlackListUnJoinAndUnFollowDialog = new RoomBlackListUnJoinAndUnFollowDialog((FragmentActivity) activityOooO0O0);
                                roomBlackListUnJoinAndUnFollowDialog.OooOOO0(roomError1051.getIsJoined(), roomError1051.getIsFollowed());
                                roomBlackListUnJoinAndUnFollowDialog.OooO00o(OooO0o.f43436Oooo0o);
                                roomBlackListUnJoinAndUnFollowDialog.OooOO0();
                            }
                            break;
                        }
                        break;
                    case Constants.WARN_APM_RESIDUAL_ECHO /* 1053 */:
                        o000O00O.OooO().OooOooO(Constants.WARN_APM_RESIDUAL_ECHO, 0, null);
                        break;
                    case 1055:
                        o00O000 o00o008 = o00O000.f34346OooO00o;
                        Activity activityOooO0O1 = o00O000.OooO0O0();
                        if (activityOooO0O1 != null) {
                            oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O1);
                            oo0ooo0.OooOo0(R.string.room_deleted);
                            oo0ooo0.OooOO0O(OooO.f43432Oooo0o);
                            oo0ooo0.OooOOO0();
                        }
                        break;
                    case 1058:
                        String strOooO0OO7 = o000O0O0.OooO0OO(R.string.error_friend_add_unacceptable_word);
                        ToastUtil toastUtil7 = ToastUtil.f12568OooO0O0;
                        if (!(strOooO0OO7 == null || StringsKt.isBlank(strOooO0OO7))) {
                            o0O0ooO runnable7 = new o0O0ooO(toastUtil7, strOooO0OO7);
                            Intrinsics.checkNotNullParameter(runnable7, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o00O000 o00o009 = o00O000.f34346OooO00o;
                                o00O000.f34348OooO0OO.post(runnable7);
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
                                f43431OooO00o.OooO0Oo(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_voice_card_protected), String.valueOf(protectedTimeLeft / 60), String.valueOf(protectedTimeLeft % 60)));
                            }
                        } catch (InvalidProtocolBufferException e) {
                            o00O00.OooO0O0("RoomErrorCode.Voice_Card_Protection_Cover " + e.getMessage());
                            return;
                        }
                        break;
                    case ZegoConstants.StreamUpdateType.Deleted /* 2002 */:
                        o00O000 o00o0010 = o00O000.f34346OooO00o;
                        Activity activityOooO0O2 = o00O000.OooO0O0();
                        if (activityOooO0O2 != null) {
                            oo0oOO0 oo0ooo1 = new oo0oOO0(activityOooO0O2);
                            oo0ooo1.OooOo0(R.string.Network_connection_lost);
                            oo0ooo1.OooOO0O(OooOO0.f43437Oooo0o);
                            oo0ooo1.OooOOO0();
                        }
                        break;
                    case 4000:
                        String strOooO0OO8 = o000O0O0.OooO0OO(R.string.room_vote_game_exist);
                        ToastUtil toastUtil8 = ToastUtil.f12568OooO0O0;
                        if (!(strOooO0OO8 == null || StringsKt.isBlank(strOooO0OO8))) {
                            o0O0ooO runnable8 = new o0O0ooO(toastUtil8, strOooO0OO8);
                            Intrinsics.checkNotNullParameter(runnable8, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o00O000 o00o0011 = o00O000.f34346OooO00o;
                                o00O000.f34348OooO0OO.post(runnable8);
                            } else {
                                runnable8.run();
                            }
                        }
                        break;
                    case 10041:
                        OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1005));
                        break;
                    case 10070:
                        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
                        Boolean value = oooO00o.OooO00o().f43348Oooo000.getValue();
                        if (value == null) {
                            value = Boolean.FALSE;
                        }
                        oooO00o.OooO00o().f43348Oooo000.postValue(Boolean.valueOf(value.booleanValue()));
                        LiveEventBus.get("FORBID_GUESTS_ENTER_ROOM").post(Boolean.FALSE);
                        break;
                    default:
                        switch (i) {
                            case 1003:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1003));
                                break;
                            case 1004:
                                OooO0o0(o000O0O0.OooO0OO(R.string.microom_code_1004));
                                break;
                            case 1005:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1005));
                                break;
                            case 1006:
                                o00OO00O.f43313OooooOo.OooO00o().f43325OooOO0O.postValue(RoomLoginState.NumberLimit);
                                break;
                            case 1007:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1007));
                                break;
                            case 1008:
                                if (!o00OO00O.f43313OooooOo.OooO00o().OooOOo0()) {
                                    o00oOoo.OooO0O0(o000O0O0.OooO0OO(R.string.microom_code_1008_));
                                } else {
                                    o00oOoo.OooO0O0(o000O0O0.OooO0OO(R.string.microom_code_1008));
                                }
                                break;
                            case 1009:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1009));
                                break;
                            case 1010:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1010));
                                break;
                            case 1011:
                                RoomStateManager.INSTANCE.disconnectRoom();
                                Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
                                if (contextOooO0O0 == null) {
                                    Context context2 = o0000O.f2657OooO00o;
                                    if (context2 != null) {
                                        context = context2;
                                    } else {
                                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                                    }
                                    contextOooO0O0 = context;
                                }
                                Intrinsics.checkNotNull(contextOooO0O0, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                oo0oOO0 oo0ooo2 = new oo0oOO0((FragmentActivity) contextOooO0O0);
                                oo0ooo2.OooOoo(R.string.room_ban_title);
                                oo0ooo2.OooOo0(R.string.room_ban_toast);
                                oo0ooo2.OooO0oO(false);
                                oo0ooo2.OooOo0o(OooO0OO.f43435Oooo0o);
                                oo0ooo2.OooOOO0();
                                break;
                            case 1012:
                                CommonErrorHandler.INSTANCE.post(new CommonError(CommonError.Coin_NotEnough, ""));
                                break;
                            case 1013:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1013));
                                break;
                            case 1014:
                                OooO0o0(o000O0O0.OooO0OO(R.string.microom_code_1014));
                                break;
                            case 1015:
                                OooO0o0(o000O0O0.OooO0OO(R.string.microom_code_1015));
                                break;
                            case 1016:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1016));
                                break;
                            case 1017:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1017));
                                break;
                            case 1018:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1018));
                                break;
                            case 1019:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1019));
                                break;
                            case Constants.WARN_ADM_PLAYOUT_ABNORMAL_FREQUENCY /* 1020 */:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1020));
                                break;
                            case Constants.WARN_ADM_RECORD_ABNORMAL_FREQUENCY /* 1021 */:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1021));
                                break;
                            case 1022:
                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1022));
                                break;
                            default:
                                switch (i) {
                                    case 1028:
                                        break;
                                    case 1029:
                                        String strOooO0OO9 = o000O0O0.OooO0OO(R.string.mic_using);
                                        ToastUtil toastUtil9 = ToastUtil.f12568OooO0O0;
                                        if (!(strOooO0OO9 == null || StringsKt.isBlank(strOooO0OO9))) {
                                            o0O0ooO runnable9 = new o0O0ooO(toastUtil9, strOooO0OO9);
                                            Intrinsics.checkNotNullParameter(runnable9, "runnable");
                                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                o00O000 o00o0012 = o00O000.f34346OooO00o;
                                                o00O000.f34348OooO0OO.post(runnable9);
                                            } else {
                                                runnable9.run();
                                            }
                                        }
                                        break;
                                    case 1030:
                                        String strOooO0OO10 = o000O0O0.OooO0OO(R.string.tip_locked);
                                        ToastUtil toastUtil10 = ToastUtil.f12568OooO0O0;
                                        if (!(strOooO0OO10 == null || StringsKt.isBlank(strOooO0OO10))) {
                                            o0O0ooO runnable10 = new o0O0ooO(toastUtil10, strOooO0OO10);
                                            Intrinsics.checkNotNullParameter(runnable10, "runnable");
                                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                o00O000 o00o0013 = o00O000.f34346OooO00o;
                                                o00O000.f34348OooO0OO.post(runnable10);
                                            } else {
                                                runnable10.run();
                                            }
                                        }
                                        break;
                                    case Constants.WARN_ADM_RECORD_AUDIO_LOWLEVEL /* 1031 */:
                                        String strOooO0OO11 = o000O0O0.OooO0OO(R.string.mic_locked_by_ower);
                                        ToastUtil toastUtil11 = ToastUtil.f12568OooO0O0;
                                        if (!(strOooO0OO11 == null || StringsKt.isBlank(strOooO0OO11))) {
                                            o0O0ooO runnable11 = new o0O0ooO(toastUtil11, strOooO0OO11);
                                            Intrinsics.checkNotNullParameter(runnable11, "runnable");
                                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                o00O000 o00o0014 = o00O000.f34346OooO00o;
                                                o00O000.f34348OooO0OO.post(runnable11);
                                            } else {
                                                runnable11.run();
                                            }
                                        }
                                        break;
                                    case Constants.WARN_ADM_PLAYOUT_AUDIO_LOWLEVEL /* 1032 */:
                                        CommonErrorHandler.INSTANCE.post(new CommonError(CommonError.Coin_Frozen, ""));
                                        break;
                                    case 1033:
                                        CommonErrorHandler.INSTANCE.post(new CommonError(CommonError.Coin_NotEnough, ""));
                                        break;
                                    default:
                                        switch (i) {
                                            case 1044:
                                                CommonErrorHandler.INSTANCE.post(new CommonError(CommonError.Crystal_NotEnough, ""));
                                                break;
                                            case 1045:
                                                Integer value2 = o00OO00O.f43313OooooOo.OooO00o().f43354Oooo0o0.getValue();
                                                if (value2 == null) {
                                                    value2 = 0;
                                                }
                                                OooOo.OooO00o(o000O0O0.OooO0OO(R.string.you_can_set_number_of_mic), String.valueOf(value2.intValue()));
                                                break;
                                            case 1046:
                                                OooO0Oo(o000O0O0.OooO0OO(R.string.microom_code_1005));
                                                break;
                                            case 1047:
                                                OooO0Oo(o000O0O0.OooO0OO(R.string.room_mora_code_10047));
                                                break;
                                            case 1048:
                                                try {
                                                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.ByteArray");
                                                    Room.MoraStartPkRequestReply from2 = Room.MoraStartPkRequestReply.parseFrom((byte[]) obj);
                                                    if (from2 != null) {
                                                        o000O00O.OooO().OoooO00(from2.getMuuid());
                                                    }
                                                    OooO0Oo(o000O0O0.OooO0OO(R.string.room_mora_code_10048));
                                                } catch (InvalidProtocolBufferException e2) {
                                                    o00O00.OooO0Oo("RoomErrorCode.ROOM_MORA_GAME_FAIL_1048" + e2.getMessage());
                                                    return;
                                                }
                                                break;
                                            case 1049:
                                                OooO0Oo(o000O0O0.OooO0OO(R.string.room_mora_code_10048));
                                                break;
                                            default:
                                                switch (i) {
                                                    case BannerConfig.LOOP_TIME /* 3000 */:
                                                        o00O000 o00o0015 = o00O000.f34346OooO00o;
                                                        Activity activityOooO0O3 = o00O000.OooO0O0();
                                                        if (activityOooO0O3 != null) {
                                                            oo0oOO0 oo0ooo3 = new oo0oOO0(activityOooO0O3);
                                                            oo0ooo3.OooOo0O(o000O0O0.OooO0OO(R.string.feature_not_available));
                                                            oo0ooo3.OooOoOO(true);
                                                            oo0ooo3.OooOOo0(o000O0O0.OooO0OO(R.string.Update_Now));
                                                            oo0ooo3.OooOo0o(OooOO0O.f43438Oooo0o);
                                                            oo0ooo3.OooOOO0();
                                                        }
                                                        break;
                                                    case ZegoConstants.RoomError.DatiCommitError /* 3001 */:
                                                        String str3 = obj instanceof String ? (String) obj : null;
                                                        if (str3 != null && (roomError3000 = (RoomError3000) o0Oo0oo.OooO0OO(str3, RoomError3000.class)) != null) {
                                                            f43431OooO00o.OooO0Oo(roomError3000.getMsg());
                                                            break;
                                                        }
                                                        break;
                                                    case ZegoConstants.RoomError.DatiTimeoutError /* 3002 */:
                                                        OooO0O0();
                                                        break;
                                                    case ZegoConstants.RoomError.DatiRepeatError /* 3003 */:
                                                        String str4 = obj instanceof String ? (String) obj : null;
                                                        if (str4 != null && (roomError3003 = (RoomError3003) o0Oo0oo.OooO0OO(str4, RoomError3003.class)) != null) {
                                                            String msg = roomError3003.getMsg();
                                                            ToastUtil toastUtil12 = ToastUtil.f12568OooO0O0;
                                                            if (!(msg == null || StringsKt.isBlank(msg))) {
                                                                o0O0ooO runnable12 = new o0O0ooO(toastUtil12, msg);
                                                                Intrinsics.checkNotNullParameter(runnable12, "runnable");
                                                                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                                                    o00O000 o00o0016 = o00O000.f34346OooO00o;
                                                                    o00O000.f34348OooO0OO.post(runnable12);
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
                                                                o00oOoo.OooO00o(R.string.apply_mic_is_turned_off);
                                                                break;
                                                            case 4252:
                                                                o00O000 o00o0017 = o00O000.f34346OooO00o;
                                                                Activity activityOooO0O4 = o00O000.OooO0O0();
                                                                if (activityOooO0O4 != null) {
                                                                    oo0oOO0 oo0ooo4 = new oo0oOO0(activityOooO0O4);
                                                                    oo0ooo4.OooOo0O(o000O0O0.OooO0OO(R.string.apply_mic_outof_max));
                                                                    oo0ooo4.OooOo0o(OooO00o.f43433Oooo0o);
                                                                    oo0ooo4.OooOOO0();
                                                                }
                                                                break;
                                                            case 4253:
                                                                o00O000 o00o0018 = o00O000.f34346OooO00o;
                                                                Activity activityOooO0O5 = o00O000.OooO0O0();
                                                                if (activityOooO0O5 != null) {
                                                                    oo0oOO0 oo0ooo5 = new oo0oOO0(activityOooO0O5);
                                                                    oo0ooo5.OooOo0O(o000O0O0.OooO0OO(R.string.no_mic_return_apply_list));
                                                                    oo0ooo5.OooOo0o(OooO0O0.f43434Oooo0o);
                                                                    oo0ooo5.OooOOO0();
                                                                }
                                                                break;
                                                            default:
                                                                FLog.INSTANCE.roomLog(RoomEventType.Room_Socket_UnknowErrcode, null);
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        o00O00.OooO0o0("RoomErrorHandler", e.getMessage());
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } catch (Exception e3) {
                o00O00.OooO0o0("RoomErrorHandler", e3.getMessage());
            }
        }
    }

    public final void OooO0O0() {
        ArrayList<ProfileLimitModel> profileLimit = o000O00O.OooO().f32427Oooo.getProfileLimit();
        if (profileLimit != null) {
            for (ProfileLimitModel profileLimitModel : profileLimit) {
                if (profileLimitModel.getOperationType() == 3) {
                    boolean z = false;
                    String strOooO00o = OooOo.OooO00o(o000O0O0.OooO0OO(R.string.RoomInfoEdit_ChangeLimit_HintContent_Sign), String.valueOf(profileLimitModel.getBlockReason()));
                    if (profileLimitModel.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - profileLimitModel.getExpireTime() <= 0) {
                        strOooO00o = OooOo.OooO00o(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.RoomInfoEdit_ChangeLimit_HintContent_Sign_Time), String.valueOf(profileLimitModel.getBlockReason())), o00O0.f48624OooO00o.OooO0Oo(profileLimitModel.getExpireTime(), System.currentTimeMillis()));
                        z = true;
                    }
                    Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
                    if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(d.R);
                        contextOooO0O0 = null;
                    }
                    oo0oOO0 oo0ooo0 = new oo0oOO0(contextOooO0O0);
                    oo0ooo0.OooOo0O(strOooO00o);
                    if (z) {
                        oo0ooo0.OooOo0o(OooOOO0.f43440Oooo0o);
                    } else {
                        oo0ooo0.OooOoOO(true);
                        oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.CONTINUE_));
                        oo0ooo0.OooOo0o(OooOOO.f43439Oooo0o);
                    }
                    oo0ooo0.OooOOO0();
                    return;
                }
            }
        }
    }

    public final void OooO0Oo(String str) {
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Activity activity = o00O000.OooO0O0();
        if (activity != null) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(activity);
            oo0ooo0.OooOo0O(str);
            oo0ooo0.OooOOO0();
            Intrinsics.checkNotNullParameter(activity, "activity");
            Object systemService = activity.getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            View viewFindViewById = activity.findViewById(android.R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        }
    }

    public final void OooO0o0(String str) {
        RoomStateManager.INSTANCE.disconnectRoom();
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Activity activity = o00O000.OooO0O0();
        if (activity != null) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(activity);
            oo0ooo0.OooOo0O(str);
            oo0ooo0.OooOO0O(OooOo00.f43444Oooo0o);
            oo0ooo0.OooOOO0();
            Intrinsics.checkNotNullParameter(activity, "activity");
            Object systemService = activity.getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            View viewFindViewById = activity.findViewById(android.R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<View>(android.R.id.content)");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(viewFindViewById.getWindowToken(), 0);
        }
    }
}
