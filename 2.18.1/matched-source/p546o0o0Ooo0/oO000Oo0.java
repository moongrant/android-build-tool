package p546o0o0Ooo0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.view.tips.TipsBubbleView;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.compose.ComposePlaceHolder;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o0O0o;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p121o00O0Ooo.o0000O;
import p121o00O0Ooo.o0000O0O;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o000OO;
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000O0o;
import p254o00ooO0O.o000OO00;
import p254o00ooO0O.o000Oo0;
import p263o00ooo.o000OO0O;
import p391o0OOooOo.o0O00000;
import p445o0OoOo0o.o0O0OOOo;
import p445o0OoOo0o.o0O0o000;
import p507o0o00oOO.o0000O0;
import p515o0o0O00.o00O00;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p545o0o0OoOo.b8;
import p579o0oOoOOo.oOOOOo0O;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000Oo0 {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44378Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0O00OO<Boolean> o0o00oo2) {
            super(0);
            this.f44378Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO000Oo onLogin = new oO000Oo(this.f44378Oooo0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o00OO0O0.o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f44379Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f44379Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooO00o(ooo00o, this.f44379Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomInputManagerKt$ApplyMicCompose$2$1", f = "RoomBottomInputManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<Integer> f44380Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<Boolean> f44381Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(oO0Oo<Integer> oo0oo, o0O00OO<Boolean> o0o00oo2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f44380Oooo0o = oo0oo;
            this.f44381Oooo0oO = o0o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f44380Oooo0o, this.f44381Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Integer value;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0O00OO<Boolean> o0o00oo2 = this.f44381Oooo0oO;
            Integer value2 = this.f44380Oooo0o.getValue();
            boolean z = true;
            if ((value2 == null || value2.intValue() != 1) && ((value = this.f44380Oooo0o.getValue()) == null || value.intValue() != 2)) {
                z = false;
            }
            o0o00oo2.setValue(Boolean.valueOf(z));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f44382Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f44382Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooO00o(ooo00o, this.f44382Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f44383Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f44383Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooO00o(ooo00o, this.f44383Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<o0O0O00.Oooo000, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f44384Oooo0o = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.Oooo000 oooo000) {
            o0O0O00.Oooo000 it = oooo000;
            Intrinsics.checkNotNullParameter(it, "it");
            long jOooO0o = o0O0O00.Oooo0.OooO0o(it);
            p599o0oo00O0.OooOO0O oooOO0O = p599o0oo00O0.OooOO0O.f47906OooO00o;
            p599o0oo00O0.OooOO0O.f47907OooO0O0.setValue(new o0000O0O.OooOo(o0000O0O.Oooo000.OooO00o(o000Oo0.OooO0Oo(Float.valueOf(o00O0O.OooO.OooO0OO(jOooO0o))), o000OO00.OooO00o(-50))));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f44385Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Function0<Unit> function0) {
            super(0);
            this.f44385Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f44385Oooo0o.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f44386Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44387Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Function0<Unit> function0, int i) {
            super(2);
            this.f44386Oooo0o = function0;
            this.f44387Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooO0OO(this.f44386Oooo0o, ooo00o, this.f44387Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<p191o00o0O.o00oO0o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f44388Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(p191o00o0O.o00oO0o o00oo0o2) {
            p191o00o0O.o00oO0o drawWithContent = o00oo0o2;
            Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
            drawWithContent.o0ooOOo();
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            long j = o0000O0.f41723Oooo000;
            float f = 21;
            p191o00o0O.o0OOO0o.OooOO0(drawWithContent, j, o00O0O.OooOO0.OooO00o(o000OO00.OooO00o(f), o000OO00.OooO00o((float) 2.5d)), o00O0O.OooOo.OooO00o(o000OO00.OooO00o((float) 9.5d), o000OO00.OooO00o((float) 6.5d)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, 0, 120, null);
            float f2 = 100;
            p191o00o0O.o0OOO0o.OooOO0o(drawWithContent, j, o00O0O.OooOO0.OooO00o(o000OO00.OooO00o(f), -o000OO00.OooO00o(4)), o00O0O.OooOo.OooO00o(o000OO00.OooO00o(19), o000OO00.OooO00o(13)), o00O0O.OooO0O0.OooO00o(drawWithContent.OoooOoo(f2), drawWithContent.OoooOoo(f2)), null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 0, 240, null);
            Canvas canvasOooO00o = p145o00Oo0.OooOOOO.OooO00o(drawWithContent.Ooooo0o().OooO0o());
            String strValueOf = String.valueOf(RangesKt.coerceIn(o00O.OooO0o.f43216OooO00o.OooO00o(), 0, 99));
            float fOooO00o = o000OO00.OooO00o((float) 30.5d);
            float fOooO00o2 = o000OO00.OooO00o((float) 5.5d);
            Paint paint = new Paint();
            paint.setTextSize(o000OO00.OooO00o(9));
            paint.setColor(o000O0O0.OooO00o(R.color.color_333333));
            paint.setTextAlign(Paint.Align.CENTER);
            Unit unit = Unit.INSTANCE;
            canvasOooO00o.drawText(strValueOf, fOooO00o, fOooO00o2, paint);
            return unit;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<o0O0O00.Oooo000, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOOO f44389Oooo0o = new OooOOOO();

        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.Oooo000 oooo000) {
            o0O0O00.Oooo000 it = oooo000;
            Intrinsics.checkNotNullParameter(it, "it");
            long jOooO0o = o0O0O00.Oooo0.OooO0o(it);
            p599o0oo00O0.OooOO0O oooOO0O = p599o0oo00O0.OooOO0O.f47906OooO00o;
            p599o0oo00O0.OooOO0O.f47907OooO0O0.setValue(new o0000O0O.OooOo(o0000O0O.Oooo000.OooO00o(o000Oo0.OooO0Oo(Float.valueOf(o00O0O.OooO.OooO0OO(jOooO0o))), o000OO00.OooO00o(-50))));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f44390Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44391Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(Function0<Unit> function0, int i) {
            super(2);
            this.f44390Oooo0o = function0;
            this.f44391Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooO0Oo(this.f44390Oooo0o, ooo00o, this.f44391Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f44392Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(Function0<Unit> function0) {
            super(0);
            this.f44392Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f44392Oooo0o.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f44393Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(int i) {
            super(2);
            this.f44393Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooO0o0(ooo00o, this.f44393Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f44394Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(FragmentActivity fragmentActivity) {
            super(0);
            this.f44394Oooo0o = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00000.OooO0OO("InRoom_sayhi_face_mic");
            FragmentActivity fragmentActivity = this.f44394Oooo0o;
            if (fragmentActivity != null) {
                new oOOOOo0O(fragmentActivity).OooOO0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o000000 f44395Oooo0o = new o000000();

        public o000000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int iLongValue;
            RoomLoginInformation roomLoginInformation = o000O00O.OooO().f32430Oooo0oo;
            if (roomLoginInformation == null || o0O0OOOo.OooO0O0().OooO00o().OooOOo(roomLoginInformation.getRoom().getId())) {
                Boolean value = o00OO00O.f43313OooooOo.OooO00o().f43333OooOOoo.getValue();
                Intrinsics.checkNotNull(value);
                boolean z = !value.booleanValue();
                o0O00000.OooO0OO(z ? "InRoom_soundoff" : "InRoom_soundon");
                o0O0OOOo.OooO0O0().OooO00o().OooOO0(z);
                if (!z) {
                    HashMap<Long, Boolean> mapOooOO0O = o000O00O.OooO().OooOO0O();
                    Intrinsics.checkNotNullExpressionValue(mapOooOO0O, "getInstance().muteSoundMap");
                    for (Map.Entry<Long, Boolean> entry : mapOooOO0O.entrySet()) {
                        o0O0o000 o0o0o000OooO00o = o0O0OOOo.OooO0O0().OooO00o();
                        Long key = entry.getKey();
                        if (key == null) {
                            iLongValue = 0;
                        } else if (key.longValue() > 2147483647L) {
                            iLongValue = Integer.MAX_VALUE;
                        } else {
                            iLongValue = key.longValue() < -2147483648L ? Integer.MIN_VALUE : (int) key.longValue();
                        }
                        Boolean value2 = entry.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "it.value");
                        o0o0o000OooO00o.OooOo00(iLongValue, value2.booleanValue());
                    }
                }
                o00OO00O.f43313OooooOo.OooO00o().f43333OooOOoo.postValue(Boolean.valueOf(z));
            } else {
                o00O00.OooO0oo(Reflection.getOrCreateKotlinClass(oO0OOo0o.class).getSimpleName(), "switchMuteSound: 语音未登录房间静音被取消");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000000O extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f44396Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000000O(int i) {
            super(2);
            this.f44396Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooOO0O(ooo00o, this.f44396Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o000OOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f44397Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000OOo(int i) {
            super(2);
            this.f44397Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooOO0(ooo00o, this.f44397Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f44398Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MixedRoomActivity mixedRoomActivity) {
            super(0);
            this.f44398Oooo0o = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MixedRoomActivity mixedRoomActivity = this.f44398Oooo0o;
            if (mixedRoomActivity != null) {
                oO000o00 onLogin = new oO000o00(mixedRoomActivity);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                    if (activityOooO0O0 != null) {
                        LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                        o00OO0O0.o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f44399Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(MixedRoomActivity mixedRoomActivity) {
            super(0);
            this.f44399Oooo0o = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oO0O0OoO onLogin = new oO0O0OoO(this.f44399Oooo0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o00OO0O0.o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f44400Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(int i) {
            super(2);
            this.f44400Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooO0oO(ooo00o, this.f44400Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00Ooo f44401Oooo0o = new o00Ooo();

        public o00Ooo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p606o0oo0O.OooOo.OooO0OO("102223", MapsKt.mapOf(new Pair("usertype", o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO.getValue())));
            oO00O0o0 onLogin = oO00O0o0.f44418Oooo0o;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o00OO0O0.o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function1<o0O0O00.Oooo000, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Pair<Integer, Integer>> f44402Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(MutableLiveData<Pair<Integer, Integer>> mutableLiveData) {
            super(1);
            this.f44402Oooo0o = mutableLiveData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.Oooo000 oooo000) {
            o0O0O00.Oooo000 it = oooo000;
            Intrinsics.checkNotNullParameter(it, "it");
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            this.f44402Oooo0o.setValue(new Pair<>(Integer.valueOf((int) o00O0O.OooO.OooO0OO(it.OooOOoo(o00O0O.OooO.f30392OooO0OO))), Integer.valueOf((int) (it.OooO00o() >> 32))));
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0O0O00 f44403Oooo0o = new o0O0O00();

        public o0O0O00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (o000O00O.OooO().f32430Oooo0oo != null) {
                if (o0O0OOOo.OooO0O0().OooO00o().OooOOo(o000O00O.OooO().f32430Oooo0oo.getRoom().getId())) {
                    o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
                    Boolean value = oooO00o.OooO00o().f43336OooOo00.getValue();
                    Intrinsics.checkNotNull(value);
                    boolean z = !value.booleanValue();
                    if (z) {
                        o0O00000.OooO0OO("InRoom_mutemic_self");
                    } else {
                        o0O00000.OooO0OO("InRoom_unmutemic_self");
                    }
                    o00O00.OooO0OO("麦变更", "switchMuteMike muteMike " + z);
                    oooO00o.OooO00o().f43336OooOo00.setValue(Boolean.valueOf(z));
                    p034OoooO0O.o0Oo0oo.OooO0o0(173, null);
                } else {
                    o00O00.OooO0oo(Reflection.getOrCreateKotlinClass(oO0OOo0o.class).getSimpleName(), "switchMuteMike: 语音未登录房间切换静麦被取消");
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomInputManagerKt$MessageCompose$2$4$1", f = "RoomBottomInputManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<View> f44404Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<TipsBubbleView> f44405Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(o0O00OO<View> o0o00oo2, o0O00OO<TipsBubbleView> o0o00oo3, Continuation<? super o0OO00O> continuation) {
            super(2, continuation);
            this.f44404Oooo0o = o0o00oo2;
            this.f44405Oooo0oO = o0o00oo3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OO00O(this.f44404Oooo0o, this.f44405Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            View triangleView;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            boolean zOooO0o = o00O.OooO0o.f43216OooO00o.OooO0o();
            View viewOooOO0o = oO000Oo0.OooOO0o(this.f44404Oooo0o);
            TipsBubbleView value = this.f44405Oooo0oO.getValue();
            if (viewOooOO0o != null && value != null && (triangleView = value.getTriangleView()) != null) {
                float width = viewOooOO0o.getWidth() / 2.0f;
                if (p168o00Ooo0.oo000o.OooO0o0()) {
                    if (zOooO0o) {
                        width += o000OO00.OooO00o(77);
                    }
                    width = -width;
                } else if (zOooO0o) {
                    width += o000OO00.OooO00o(77);
                }
                triangleView.setTranslationX(width);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function1<Context, View> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<View> f44406Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(o0O00OO<View> o0o00oo2) {
            super(1);
            this.f44406Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f44406Oooo0o.setValue(new View(it));
            View viewOooOO0o = oO000Oo0.OooOO0o(this.f44406Oooo0o);
            Intrinsics.checkNotNull(viewOooOO0o);
            return viewOooOO0o;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomInputManagerKt$MessageCompose$2$3", f = "RoomBottomInputManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f44407Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<View> f44408Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<TipsBubbleView> f44409Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(MixedRoomActivity mixedRoomActivity, o0O00OO<View> o0o00oo2, o0O00OO<TipsBubbleView> o0o00oo3, Continuation<? super o0Oo0oo> continuation) {
            super(2, continuation);
            this.f44407Oooo0o = mixedRoomActivity;
            this.f44408Oooo0oO = o0o00oo2;
            this.f44409Oooo0oo = o0o00oo3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0Oo0oo(this.f44407Oooo0o, this.f44408Oooo0oO, this.f44409Oooo0oo, continuation);
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
            if (this.f44407Oooo0o != null && oO000Oo0.OooOO0o(this.f44408Oooo0oO) != null) {
                o0O00OO<TipsBubbleView> o0o00oo2 = this.f44409Oooo0oo;
                MixedRoomActivity mixedRoomActivity = this.f44407Oooo0o;
                View viewOooOO0o = oO000Oo0.OooOO0o(this.f44408Oooo0oO);
                Intrinsics.checkNotNull(viewOooOO0o);
                ViewGroup viewGroup = (ViewGroup) mixedRoomActivity.findViewById(R.id.v_room_root);
                TipsBubbleView tipsBubbleViewOooO00o = viewGroup.findViewWithTag("room_chat_tips") != null ? null : p189o00o00oO.o000OOo.OooO00o(viewOooOO0o, viewGroup, 8388659, true, "room_chat_tips", o000O0O0.OooO0OO(R.string.tips_room_message_hello));
                if (tipsBubbleViewOooO00o != null) {
                    tipsBubbleViewOooO00o.setDismissListener(new oO00OO0O(mixedRoomActivity, tipsBubbleViewOooO00o));
                }
                o0o00oo2.setValue(tipsBubbleViewOooO00o);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f44410Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(int i) {
            super(2);
            this.f44410Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooO0o(ooo00o, this.f44410Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f44411Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O00OO<TipsBubbleView> f44412Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(MixedRoomActivity mixedRoomActivity, o0O00OO<TipsBubbleView> o0o00oo2) {
            super(0);
            this.f44411Oooo0o = mixedRoomActivity;
            this.f44412Oooo0oO = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MixedRoomActivity mixedRoomActivity = this.f44411Oooo0o;
            if (mixedRoomActivity != null) {
                o0O00OO<TipsBubbleView> o0o00oo2 = this.f44412Oooo0oO;
                oO000Oo0.OooOOO(mixedRoomActivity, o0o00oo2.getValue());
                o0o00oo2.setValue(null);
            }
            oO00O0o onLogin = new oO00O0o(this.f44411Oooo0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o00OO0O0.o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Pair<Integer, Integer>> f44413Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f44414Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(MutableLiveData<Pair<Integer, Integer>> mutableLiveData, int i) {
            super(2);
            this.f44413Oooo0o = mutableLiveData;
            this.f44414Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooO0oo(this.f44413Oooo0o, ooo00o, this.f44414Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f44415Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(int i) {
            super(2);
            this.f44415Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            oO000Oo0.OooO(ooo00o, this.f44415Oooo0o | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r18v1, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO(oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-85954940);
        if (i == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Object objOooOO0o = composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6593OooO0Oo);
            MixedRoomActivity mixedRoomActivity = objOooOO0o instanceof MixedRoomActivity ? (MixedRoomActivity) objOooOO0o : null;
            composer.OooO0o0(-492369756);
            Object objOooO0o = composer.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(null);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
            composer.OooO0o0(-492369756);
            Object objOooO0o2 = composer.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = o0OOO00.OooO0Oo(null);
                composer.Oooo00o(objOooO0o2);
            }
            composer.Oooo0o0();
            o0O00OO o0o00oo3 = (o0O00OO) objOooO0o2;
            o0000oo.OooO0O0(8, null, composer, 6, 2);
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            float f = 35;
            o00OOOO0 o00oooo0OooO00o = p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooO0oO(oooO00o, f), p033OoooO00.o00O0O.f3431OooO00o);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(Oooo000.o0OOO0o.OooO00o(BackgroundKt.OooO0O0(o00oooo0OooO00o, o0000O0.f41701OooOO0o, o000O0Oo.f32099OooO00o), null, 3), false, false, null, new o0ooOOo(mixedRoomActivity, o0o00oo3), 253);
            composer.OooO0o0(733328855);
            o0O0O00.o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            ?? r12 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r12);
            ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r3);
            ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r4);
            ?? r18 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r18, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            o00OOOO0 o00oooo0OooO0Oo = SizeKt.OooO0Oo(oooO00o);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
            composer.OooO0o0(693286680);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o0O0O00.o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0Oo);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            MixedRoomActivity mixedRoomActivity2 = mixedRoomActivity;
            ((o00) function3OooO0O1).invoke(p031OoooO.o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r12, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r18, composer, "composer", composer), composer, 0);
            Oooo0.o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.mipmap.icon_room_bottom_message, composer), null, o00OOO0O.OooO0O0(oooO00o, new oO00O0oO(false)), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
            composer.OooO0o0(-1621970999);
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            if (!oooO0o.OooO0o()) {
                p031OoooO.o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.Type, composer), SizeKt.OooOO0o(oooO00o, 88), o0000O0.f41693OooO0OO, o0000O0O.o00Oo0.OooO0OO(14), null, null, null, 0L, null, null, 0L, 0, false, 1, null, new o00000O.oo0o0Oo(0L, new o00000O.o0OoOo0(), 786431), composer, 3504, 3072, 24560);
            }
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            o00O o00o2 = o00O.f43140OooO00o;
            if (Intrinsics.areEqual(p044OooooOO.o00O00O.OooO0O0((MutableLiveData) o00O.f43189OoooOoO.getValue(), composer).getValue(), Boolean.TRUE)) {
                o00OOOO0 o00oooo0OooOO0o = SizeKt.OooOO0o(oooO00o, oooO0o.OooO0o() ? f : 119);
                composer.OooO0o0(1157296644);
                boolean zOooo0oo = composer.Oooo0oo(o0o00oo2);
                Object objOooO0o3 = composer.OooO0o();
                if (zOooo0oo || objOooO0o3 == c0323OooO00o) {
                    objOooO0o3 = new o0OOO0o(o0o00oo2);
                    composer.Oooo00o(objOooO0o3);
                }
                composer.Oooo0o0();
                AndroidView_androidKt.OooO00o((Function1) objOooO0o3, o00oooo0OooOO0o, null, composer, 0, 4);
                o00Oo00.OooO0o0(Unit.INSTANCE, new o0Oo0oo(mixedRoomActivity2, o0o00oo2, o0o00oo3, null), composer);
                Boolean boolValueOf = Boolean.valueOf(oooO0o.OooO0o());
                composer.OooO0o0(511388516);
                boolean zOooo0oo2 = composer.Oooo0oo(o0o00oo2) | composer.Oooo0oo(o0o00oo3);
                Object objOooO0o4 = composer.OooO0o();
                if (zOooo0oo2 || objOooO0o4 == c0323OooO00o) {
                    objOooO0o4 = new o0OO00O(o0o00oo2, o0o00oo3, null);
                    composer.Oooo00o(objOooO0o4);
                }
                composer.Oooo0o0();
                o00Oo00.OooO0o0(boolValueOf, (Function2) objOooO0o4, composer);
            }
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oo0o0Oo(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1833981494);
        if (i == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            if (!oooO0o.OooO0Oo()) {
                oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooO00o(i));
                return;
            }
            oO0Oo oo0ooOooO0O0 = p044OooooOO.o00O00O.OooO0O0(o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO, ooo00oOooOOo);
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(Boolean.FALSE);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
            Integer num = (Integer) oo0ooOooO0O0.getValue();
            ooo00oOooOOo.OooO0o0(511388516);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00oo2) | ooo00oOooOOo.Oooo0oo(oo0ooOooO0O0);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new OooO0O0(oo0ooOooO0O0, o0o00oo2, null);
                ooo00oOooOOo.Oooo00o(objOooO0o2);
            }
            ooo00oOooOOo.Oooo0o0();
            o00Oo00.OooO0o0(num, (Function2) objOooO0o2, ooo00oOooOOo);
            if (!OooO0O0(o0o00oo2) && oooO0o.OooO0o()) {
                oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
                if (oo0oooOooOo2 == null) {
                    return;
                }
                oo0oooOooOo2.OooO00o(new OooO0OO(i));
                return;
            }
            o0000oo.OooO0O0(8, null, ooo00oOooOOo, 6, 2);
            ooo00oOooOOo.OooO0o0(-492369756);
            Object objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (objOooO0o3 == c0323OooO00o) {
                objOooO0o3 = new OooO(o0o00oo2);
                ooo00oOooOOo.Oooo00o(objOooO0o3);
            }
            ooo00oOooOOo.Oooo0o0();
            Function0 function0 = (Function0) objOooO0o3;
            if (OooO0O0(o0o00oo2)) {
                ooo00oOooOOo.OooO0o0(305538155);
                if (!(!StringsKt.isBlank((String) o00O.OooO0o.f43227OooOOO.getValue())) || oooO0o.OooO00o() <= 0) {
                    ooo00oOooOOo.OooO0o0(305538311);
                    OooO0Oo(function0, ooo00oOooOOo, 6);
                    ooo00oOooOOo.Oooo0o0();
                } else {
                    ooo00oOooOOo.OooO0o0(305538253);
                    OooO0OO(function0, ooo00oOooOOo, 6);
                    ooo00oOooOOo.Oooo0o0();
                }
                ooo00oOooOOo.Oooo0o0();
            } else {
                ooo00oOooOOo.OooO0o0(305538374);
                if (!oooO0o.OooO0o()) {
                    OooO0Oo(function0, ooo00oOooOOo, 6);
                }
                ooo00oOooOOo.Oooo0o0();
            }
        }
        oo0ooO oo0oooOooOo3 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo3 == null) {
            return;
        }
        oo0oooOooOo3.OooO00o(new OooO0o(i));
    }

    public static final boolean OooO0O0(o0O00OO<Boolean> o0o00oo2) {
        return o0o00oo2.getValue().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(Function0<Unit> function0, oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1411718479);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            String str = (String) o00O.OooO0o.f43227OooOOO.getValue();
            ooo00oOooOOo.OooO0o0(604400049);
            oOO00O.OooOO0 oooOO0OooO00o = p114o00O00o.OooOOOO.OooO00o(p114o00O00o.o000oOoO.f30327OooO00o, ooo00oOooOOo);
            ooo00oOooOOo.OooO0o0(604401387);
            coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6591OooO0O0));
            c0072OooO00o.f9912OooO0OO = str;
            ComposePlaceHolder.f20570OooO00o.OooO00o(c0072OooO00o, ComposePlaceHolder.PlaceholderType.UserHeader, ooo00oOooOOo, 440);
            p114o00O00o.OooOo00 oooOo00OooO0O0 = com.umeng.analytics.pro.OooO00o.OooO0O0(c0072OooO00o, oooOO0OooO00o, ooo00oOooOOo);
            o00OOOO0 o00oooo0OooO00o = OnGloballyPositionedModifierKt.OooO00o(SizeKt.OooOO0(o00OOOO0.OooO00o.f4198Oooo0o, 36), OooOO0.f44384Oooo0o);
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(function0);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new OooOO0O(function0);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            List colors = CollectionsKt.listOf((Object[]) new o00000O0[]{new o00000O0(o0000O0.f41710OooOo0), new o00000O0(o0000O0.f41723Oooo000)});
            Intrinsics.checkNotNullParameter(colors, "colors");
            long jOooO00o = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            long jOooO00o2 = o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Float.POSITIVE_INFINITY);
            Intrinsics.checkNotNullParameter(colors, "colors");
            o000OO o000oo2 = new o000OO(colors, jOooO00o, jOooO00o2, 0);
            p033OoooO00.o0OoOo0 o0oooo1 = p033OoooO00.o00O0O.f3431OooO00o;
            Oooo0.o00.OooO00o(oooOo00OooO0O0, null, p442o0OoOo0.Oooo000.OooO00o(PaddingKt.OooO0o0(BorderKt.OooO0OO(DrawModifierKt.OooO0OO(o000O0o.OooO0O0(o00oooo0OooO00o, false, false, null, (Function0) objOooO0o, 253), OooOOO0.f44388Oooo0o), 1, o000oo2, o0oooo1), 3), o0oooo1), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 48, 120);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO(function0, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(Function0<Unit> function0, oOO00O ooo00o, int i) {
        int i2;
        long j;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-2127206044);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.Oooo0oo(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.mipmap.icon_room_bottom_hand, ooo00oOooOOo);
            o00OOOO0 o00oooo0OooO00o = OnGloballyPositionedModifierKt.OooO00o(OooOOOO(o00OOOO0.OooO00o.f4198Oooo0o), OooOOOO.f44389Oooo0o);
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(function0);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new OooOo00(function0);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(o00oooo0OooO00o, false, false, null, (Function0) objOooO0o, 253);
            if (o00O.OooO0o.f43216OooO00o.OooO0o0()) {
                o0000O0 o0000o1 = o0000O0.f41691OooO00o;
                j = o0000O0.f41710OooOo0;
            } else {
                o0000O0 o0000o2 = o0000O0.f41691OooO00o;
                j = o0000O0.f41693OooO0OO;
            }
            p031OoooO.o0OOO0o.OooO00o(o000oo0oOooO00o, null, o00oooo0OooO0O0, j, ooo00oOooOOo, 56, 0);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOo(function0, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1665732434);
        if (i == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Object objOooOO0o = ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6593OooO0Oo);
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.drawable.icon_room_bottom_game_box, ooo00oOooOOo), null, o000O0o.OooO0O0(SizeKt.OooOO0(PaddingKt.OooO(o00OOOO0.OooO00o.f4198Oooo0o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 8, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), 35), false, false, null, new o000oOoO(objOooOO0o instanceof MixedRoomActivity ? (MixedRoomActivity) objOooOO0o : null), 253), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 24632, 104);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o0OoOo0(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1650739675);
        if (i == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if (o00O.OooO0o.f43216OooO00o.OooO0o()) {
                Object objOooOO0o = ooo00oOooOOo.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6593OooO0Oo);
                FragmentActivity fragmentActivity = objOooOO0o instanceof FragmentActivity ? (FragmentActivity) objOooOO0o : null;
                o0000oo.OooO0O0(8, null, ooo00oOooOOo, 6, 2);
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.room_activity_mic_emoji, ooo00oOooOOo), null, o000O0o.OooO0O0(OooOOOO(o00OOOO0.OooO00o.f4198Oooo0o), false, false, null, new Oooo000(fragmentActivity), 253), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 24632, 104);
            }
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new Oooo0(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oO(oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-1324431009);
        if (i == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            Object objOooOO0o = composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6593OooO0Oo);
            MixedRoomActivity mixedRoomActivity = objOooOO0o instanceof MixedRoomActivity ? (MixedRoomActivity) objOooOO0o : null;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(SizeKt.OooOO0(oooO00o, 58), false, false, null, new o00O0O(mixedRoomActivity), 253);
            o00OO0OO alignment = o00OO0O0.OooO00o.f4175OooO0o;
            o0O0O00.o000000 o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, alignment, false, composer, -1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            p031OoooO.o000000O.OooO0O0(composer, 2058660585, -2137368960, -1618016828);
            o00O o00o2 = o00O.f43140OooO00o;
            if (Intrinsics.areEqual(p044OooooOO.o00O00O.OooO0O0((MutableLiveData) o00O.f43188OoooOo0.getValue(), composer).getValue(), Boolean.TRUE)) {
                Intrinsics.checkNotNullParameter("lottie/guide_send_gift.json", "assetName");
                o00O0Ooo.o00000O.OooO00o spec = new o00O0Ooo.o00000O.OooO00o();
                Intrinsics.checkNotNullParameter(spec, "spec");
                composer.OooO0o0(1388713460);
                o0000O0O o0000o0o2 = new o0000O0O(null);
                Context context = (Context) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6591OooO0O0);
                composer.OooO0o0(-3686930);
                boolean zOooo0oo = composer.Oooo0oo(spec);
                Object objOooO0o = composer.OooO0o();
                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o = o0OOO00.OooO0Oo(new p121o00O0Ooo.o00000O0());
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
                composer.OooO0o0(-3686552);
                boolean zOooo0oo2 = composer.Oooo0oo(spec) | composer.Oooo0oo("__LottieInternalDefaultCacheKey__");
                Object objOooO0o2 = composer.OooO0o();
                if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
                    composer.Oooo00o(o0000O.OooO0Oo(context, spec, "__LottieInternalDefaultCacheKey__", true));
                }
                composer.Oooo0o0();
                o00Oo00.OooO0Oo(spec, "__LottieInternalDefaultCacheKey__", new p121o00O0Ooo.o000OO(o0000o0o2, context, spec, null, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", o0o00oo2, null), composer);
                p121o00O0Ooo.o00000O0 o00000o1 = (p121o00O0Ooo.o00000O0) o0o00oo2.getValue();
                composer.Oooo0o0();
                p121o00O0Ooo.o000000.OooO0O0(o00000o1.getValue(), SizeKt.OooO0o0(oooO00o), false, false, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Integer.MAX_VALUE, false, false, false, null, null, null, composer, 1572920, 0, 8124);
            }
            composer.Oooo0o0();
            composer.OooO0o0(889456190);
            composer.OooO0o0(-492369756);
            Object objOooO0o3 = composer.OooO0o();
            if (objOooO0o3 == oOO00O.OooO00o.f29689OooO0O0) {
                Context context2 = p031OoooO.o0000O.f2657OooO00o;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(d.R);
                    context2 = null;
                }
                objOooO0o3 = p516o0o0O000.Oooo0.OooO00o(context2, R.array.anim_room_bottom_gift);
                composer.Oooo00o(objOooO0o3);
            }
            composer.Oooo0o0();
            oO0Oo oo0ooOooO00o = p516o0o0O000.oo000o.OooO00o((int[]) objOooO0o3, 3000L, null, composer, 60);
            composer.Oooo0o0();
            o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(((Number) oo0ooOooO00o.getValue()).intValue(), composer);
            o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(oooO00o, 57);
            Intrinsics.checkNotNullParameter(o00oooo0OooOO0, "<this>");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
            Oooo0.o00.OooO00o(o000oo0oOooO00o, null, o00oooo0OooOO0.OooOOoo(new p028Oooo0o0.o00O00O(alignment, false)), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
            o0O0OO0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o00Oo0(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oo(MutableLiveData<Pair<Integer, Integer>> mutableLiveData, oOO00O ooo00o, int i) {
        o00OOOO0 other;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1275993638);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o0000oo.OooO0O0(8, null, ooo00oOooOOo, 6, 2);
        boolean zOooO = o00O.f43140OooO00o.OooO();
        ooo00oOooOOo.OooO0o0(2033673533);
        ooo00oOooOOo.OooO0o0(2033673537);
        boolean z = zOooO && Intrinsics.areEqual(p044OooooOO.o00O00O.OooO0O0(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO(), ooo00oOooOOo).getValue(), Boolean.TRUE);
        ooo00oOooOOo.Oooo0o0();
        if (z) {
            float f = 2;
            o00OOOO0 o00oooo0OooO00o = o000O0o.OooO00o(o000O0o.OooO00o(OnGloballyPositionedModifierKt.OooO00o(o00OOOO0.OooO00o.f4198Oooo0o, new o00oO0o(mutableLiveData)), 22, o00000OO.OooO0OO(4278245577L), new o0000O0O.OooOOO0(f)), 27, o00000O0.OooO0OO(o00000OO.OooO0OO(4278245577L), 0.5f), new o0000O0O.OooOOO0(f));
            Intrinsics.checkNotNullParameter(o00oooo0OooO00o, "<this>");
            Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
            other = o00oooo0OooO00o.OooOOoo(new o0O0o());
        } else {
            ooo00oOooOOo.OooO0o0(2033674081);
            Integer num = (Integer) p044OooooOO.o00O00O.OooO0O0(o00OO00O.f43313OooooOo.OooO00o().f43329OooOOOO, ooo00oOooOOo).getValue();
            boolean z2 = num != null && num.intValue() == 1;
            ooo00oOooOOo.Oooo0o0();
            if (z2) {
                boolean zOooO0O0 = o00O.OooO0o.f43216OooO00o.OooO0O0();
                boolean z3 = o00O.OooO0O0.f43203OooO00o.OooO0O0() > 0;
                boolean zBooleanValue = ((Boolean) o00O.f43192o000oOoO.getValue()).booleanValue();
                o00O.OooO0OO oooO0OO = o00O.OooO0OO.f43208OooO00o;
                other = Oooo000.o00O00.OooOOO0(o00OOOO0.OooO00o.f4198Oooo0o, zOooO0O0 || z3 || zBooleanValue || ((Boolean) o00O.OooO0OO.f43209OooO0O0.getValue()).booleanValue(), 0L, 3, false, false, 28, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 826);
            } else {
                other = o00OOOO0.OooO00o.f4198Oooo0o;
            }
        }
        ooo00oOooOOo.Oooo0o0();
        o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.mipmap.icon_room_bottom_menu, ooo00oOooOOo);
        Intrinsics.checkNotNullParameter(other, "other");
        Oooo0.o00.OooO00o(o000oo0oOooO00o, null, o000O0o.OooO0O0(OooOOOO(other), false, false, null, o00Ooo.f44401Oooo0o, 253), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 24632, 104);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oo000o(mutableLiveData, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooOO0(oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(380335940);
        if (i == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if (o00O.OooO0o.f43216OooO00o.OooO0o()) {
                o0000oo.OooO0O0(8, null, ooo00oOooOOo, 6, 2);
                Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(Intrinsics.areEqual(p044OooooOO.o00O00O.OooO0O0(o00OO00O.f43313OooooOo.OooO00o().f43336OooOo00, ooo00oOooOOo).getValue(), Boolean.TRUE) ? R.mipmap.icon_room_bottom_mic_off : R.mipmap.icon_room_bottom_mic_on, ooo00oOooOOo), null, o000O0o.OooO0O0(OooOOOO(o00OOOO0.OooO00o.f4198Oooo0o), false, false, null, o0O0O00.f44403Oooo0o, 253), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 24632, 104);
            }
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o000OOo(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooOO0O(oOO00O ooo00o, int i) {
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1224542724);
        if (i == 0 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0000oo.OooO0O0(8, null, ooo00oOooOOo, 6, 2);
            Oooo0.o00.OooO00o(o00000.OooO0O0.OooO00o(Intrinsics.areEqual(p044OooooOO.o00O00O.OooO0O0(o00OO00O.f43313OooooOo.OooO00o().f43333OooOOoo, ooo00oOooOOo).getValue(), Boolean.TRUE) ? R.mipmap.icon_room_bottom_sound_off : R.mipmap.icon_room_bottom_sound_on, ooo00oOooOOo), null, o000O0o.OooO0O0(o000O0o.OooO0OO(OooOOOO(o00OOOO0.OooO00o.f4198Oooo0o), ooo00oOooOOo), false, false, null, o000000.f44395Oooo0o, 253), null, o0O0O00.OooOO0.OooO00o.f35238OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, ooo00oOooOOo, 24632, 104);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new o000000O(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View OooOO0o(o0O00OO o0o00oo2) {
        return (View) o0o00oo2.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOOO(Activity activity, TipsBubbleView tipsBubbleView) {
        View viewFindViewWithTag;
        if (tipsBubbleView == null || !p254o00ooO0O.oOO00O.OooO0Oo(tipsBubbleView)) {
            return;
        }
        o00O o00o2 = o00O.f43140OooO00o;
        ((MutableLiveData) o00O.f43189OoooOoO.getValue()).setValue(Boolean.FALSE);
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        p497o0o00Oo.OooOOO0.OooO0o0().OooOOoo(false);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.v_room_root);
        if (viewGroup == null || (viewFindViewWithTag = viewGroup.findViewWithTag("room_chat_tips")) == null) {
            return;
        }
        viewGroup.removeView(viewFindViewWithTag);
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    public static final void OooOOO0(b8 b8Var, oOO00O ooo00o, int i) {
        oOO00O composer = ooo00o.OooOOo(-357047846);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0oO = SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), 58);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        Oooo0o0.o00O000.OooOOOO oooOOOO = p028Oooo0o0.o00O000.f2030OooO0O0;
        o0O0O00.o000000 o000000VarOooO00o = o0O00o00.OooO00o(oooOOOO, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r2 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO00o, r2);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r3);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r4);
        ?? r17 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r17, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o0O000O o0o000o = new o0O000O(true);
        oooO00o.OooOOoo(o0o000o);
        o0O0O00.o000000 o000000VarOooO00o2 = com.umeng.commonsdk.OooO0O0.OooO00o(composer, 693286680, oooOOOO, oooO0O0, composer, -1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o0o000o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        ((o00) function3OooO0O1).invoke(p031OoooO.o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r2, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r17, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-678309503);
        OooOO0O(composer, 0);
        OooOO0(composer, 0);
        OooO0o0(composer, 0);
        OooO(composer, 0);
        OooO0oo(b8Var.f44364OooO00o, composer, 8);
        OooO00o(composer, 0);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        OooO0oO(composer, 0);
        OooO0o(composer, 0);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new oOo00OO0(b8Var, i));
    }

    public static o00OOOO0 OooOOOO(o00OOOO0 o00oooo1) {
        return o00OOO0O.OooO0O0(o00oooo1, new oO00O0oO(true));
    }
}
