package p490o0o00OOO;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000Ooo;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.support.keyboardpanel.KeyBoardUtil$showKeyboard$1;
import com.yalla.yalla.data.cache.SharedGifFaceManager;
import com.yalla.yalla.data.db.model.ChatMessageOld;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p385o0OOooOO.oOO00O;
import p411o0Oo0oO0.o000OOo;
import p411o0Oo0oO0.oo0o0Oo;
import p417o0OoO0.o00000O;
import p433o0OoOOo.o00O0OOO;
import p433o0OoOOo.o00OOO0O;
import p433o0OoOOo.o0o0Oo;
import p442o0OoOoO0.oo0O;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p539o0o0OoOO.y0;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p585o0oOooOO.h;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomBottomMessageInputComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,584:1\n73#2,5:585\n78#2:618\n82#2:623\n78#3,11:590\n91#3:622\n78#3,11:629\n78#3,11:667\n91#3:699\n91#3:705\n456#4,8:601\n464#4,3:615\n467#4,3:619\n456#4,8:640\n464#4,3:654\n456#4,8:678\n464#4,3:692\n467#4,3:696\n467#4,3:702\n25#4:716\n4144#5,6:609\n4144#5,6:648\n4144#5,6:686\n154#6:624\n154#6:625\n154#6:626\n154#6:658\n154#6:659\n154#6:660\n154#6:701\n154#6:707\n164#6:708\n154#6:709\n154#6:711\n154#6:727\n77#7,2:627\n79#7:657\n73#7,6:661\n79#7:695\n83#7:700\n83#7:706\n76#8:710\n76#8:728\n486#9,4:712\n490#9,2:720\n494#9:726\n1097#10,3:717\n1100#10,3:723\n486#11:722\n*S KotlinDebug\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt\n*L\n66#1:585,5\n66#1:618\n66#1:623\n66#1:590,11\n66#1:622\n106#1:629,11\n122#1:667,11\n122#1:699\n106#1:705\n66#1:601,8\n66#1:615,3\n66#1:619,3\n106#1:640,8\n106#1:654,3\n122#1:678,8\n122#1:692,3\n122#1:696,3\n106#1:702,3\n310#1:716\n66#1:609,6\n106#1:648,6\n122#1:686,6\n108#1:624\n111#1:625\n113#1:626\n115#1:658\n124#1:659\n125#1:660\n139#1:701\n203#1:707\n239#1:708\n239#1:709\n254#1:711\n469#1:727\n106#1:627,2\n106#1:657\n122#1:661,6\n122#1:695\n122#1:700\n106#1:706\n248#1:710\n579#1:728\n310#1:712,4\n310#1:720,2\n310#1:726\n310#1:717,3\n310#1:723,3\n310#1:722\n*E\n"})
public final class oo000o {

    public static final class OooO extends Lambda implements Function1<Context, MessageEditText> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48672OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(p490o0o00OOO.OooOOOO oooOOOO) {
            super(1);
            this.f48672OooO0Oo = oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function1
        public final MessageEditText invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f48672OooO0Oo.OooO00o();
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48673OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(p490o0o00OOO.OooOOOO oooOOOO) {
            super(0);
            this.f48673OooO0Oo = oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("102202");
            MutableState<Boolean> roomAtVisible = this.f48673OooO0Oo.f48498OooO0O0;
            Intrinsics.checkNotNullParameter(roomAtVisible, "roomAtVisible");
            roomAtVisible.setValue(Boolean.valueOf(!roomAtVisible.getValue().booleanValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48674OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48675OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(p490o0o00OOO.OooOOOO oooOOOO, int i) {
            super(2);
            this.f48674OooO0Oo = oooOOOO;
            this.f48675OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48675OooO0o0 | 1);
            oo000o.OooO00o(this.f48674OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48676OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f48677OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(p490o0o00OOO.OooOOOO oooOOOO, Context context) {
            super(0);
            this.f48676OooO0Oo = oooOOOO;
            this.f48677OooO0o0 = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p490o0o00OOO.OooOOOO oooOOOO = this.f48676OooO0Oo;
            if (((Boolean) oooOOOO.f48504OooO0oo.getValue()).booleanValue()) {
                o0OO000.OooO00o("102061");
            } else {
                o0OO000.OooO00o("102062");
            }
            p367o0OOo0o0.OooOOOO oooOOOOOooO0O0 = oooOOOO.OooO0O0();
            if (oooOOOOOooO0O0 != null) {
                oooOOOOOooO0O0.OooO0OO(this.f48677OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48678OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48679OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(p490o0o00OOO.OooOOOO oooOOOO, int i) {
            super(2);
            this.f48678OooO0Oo = oooOOOO;
            this.f48679OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48679OooO0o0 | 1);
            oo000o.OooO0O0(this.f48678OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<MessageEditText, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48680OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48681OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(p490o0o00OOO.OooOOOO oooOOOO, int i) {
            super(1);
            this.f48680OooO0Oo = oooOOOO;
            this.f48681OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MessageEditText messageEditText) {
            MessageEditText it = messageEditText;
            Intrinsics.checkNotNullParameter(it, "it");
            p490o0o00OOO.OooOOOO oooOOOO = this.f48680OooO0Oo;
            if (oooOOOO.OooO0Oo()) {
                int i = this.f48681OooO0o0;
                if (i > 0) {
                    it.setHint(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.times_available), String.valueOf(i)));
                } else {
                    it.setHint(o0000.OooO0OO(oO00OOo0.please_chat_friendly));
                    String strOooO0OO = o0000.OooO0OO(oO00OOo0.Out_of_broadcast_chances);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                    oooOOOO.f48503OooO0oO.setValue(Boolean.FALSE);
                }
            } else {
                it.setHint(o0000.OooO0OO(oO00OOo0.please_chat_friendly));
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomBottomMessageInputComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$MessageEditTextCompose$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,584:1\n63#2,5:585\n*S KotlinDebug\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$MessageEditTextCompose$3\n*L\n221#1:585,5\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48682OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(p490o0o00OOO.OooOOOO oooOOOO) {
            super(1);
            this.f48682OooO0Oo = oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            p490o0o00OOO.OooOOOO oooOOOO = this.f48682OooO0Oo;
            oooOOOO.OooO00o().setTextIsSelectable(true);
            MessageEditText messageEditTextOooO00o = oooOOOO.OooO00o();
            Editable text = oooOOOO.OooO00o().getText();
            messageEditTextOooO00o.setSelection(text != null ? text.length() : 0);
            return new p490o0o00OOO.o00oO0o(oooOOOO);
        }
    }

    public static final class OooOOO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48683OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(p490o0o00OOO.OooOOOO oooOOOO) {
            super(3);
            this.f48683OooO0Oo = oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1766920698, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputComp.<anonymous>.<anonymous> (RoomBottomMessageInputComp.kt:71)");
            }
            p490o0o00OOO.OooOOOO oooOOOO = this.f48683OooO0Oo;
            o00O0OOO.OooO00o(new p490o0o00OOO.o0ooOOo(oooOOOO), new p490o0o00OOO.o0OOO0o(oooOOOO), oooOOOO.f48498OooO0O0, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f48684OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f48685OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48686OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(RowScope rowScope, p490o0o00OOO.OooOOOO oooOOOO, int i) {
            super(2);
            this.f48684OooO0Oo = rowScope;
            this.f48686OooO0o0 = oooOOOO;
            this.f48685OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48685OooO0o | 1);
            oo000o.OooO0OO(this.f48684OooO0Oo, this.f48686OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48687OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(p490o0o00OOO.OooOOOO oooOOOO) {
            super(3);
            this.f48687OooO0Oo = oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-153247427, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputComp.<anonymous>.<anonymous> (RoomBottomMessageInputComp.kt:89)");
            }
            o00OOO0O.OooO0OO(this.f48687OooO0Oo.OooO0OO(), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48688OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(p490o0o00OOO.OooOOOO oooOOOO) {
            super(0);
            this.f48688OooO0Oo = oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            p490o0o00OOO.OooOOOO oooOOOO = this.f48688OooO0Oo;
            oooOOOO.f48503OooO0oO.setValue(Boolean.valueOf(!oooOOOO.OooO0Oo()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48689OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48690OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(p490o0o00OOO.OooOOOO oooOOOO, int i) {
            super(2);
            this.f48689OooO0Oo = oooOOOO;
            this.f48690OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48690OooO0o0 | 1);
            oo000o.OooO0Oo(this.f48689OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48691OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48692OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(p490o0o00OOO.OooOOOO oooOOOO, int i) {
            super(2);
            this.f48691OooO0Oo = oooOOOO;
            this.f48692OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48692OooO0o0 | 1);
            oo000o.OooO0o0(this.f48691OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48693OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48694OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(p490o0o00OOO.OooOOOO oooOOOO, int i) {
            super(2);
            this.f48693OooO0Oo = oooOOOO;
            this.f48694OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48694OooO0o0 | 1);
            oo000o.OooO0o0(this.f48693OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f48695OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomBottomMessageInputComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$RoomMessageBottomLayoutLifecycleHelper$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,584:1\n63#2,5:585\n*S KotlinDebug\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$RoomMessageBottomLayoutLifecycleHelper$1\n*L\n291#1:585,5\n*E\n"})
    public static final class o00O0O extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48696OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(p490o0o00OOO.OooOOOO oooOOOO) {
            super(1);
            this.f48696OooO0Oo = oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o0Oo0oo(this.f48696OooO0Oo);
        }
    }

    public static final class o00Oo0 implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48697OooO0Oo;

        public o00Oo0(p490o0o00OOO.OooOOOO oooOOOO) {
            this.f48697OooO0Oo = oooOOOO;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            p367o0OOo0o0.OooOOOO oooOOOOOooO0O0;
            if (!bool.booleanValue() || (oooOOOOOooO0O0 = this.f48697OooO0Oo.OooO0O0()) == null) {
                return;
            }
            oooOOOOOooO0O0.OooO00o();
        }
    }

    public static final class o00Ooo implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48698OooO0Oo;

        public o00Ooo(p490o0o00OOO.OooOOOO oooOOOO) {
            this.f48698OooO0Oo = oooOOOO;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            if (zBooleanValue) {
                p367o0OOo0o0.OooOOOO oooOOOOOooO0O0 = this.f48698OooO0Oo.OooO0O0();
                p367o0OOo0o0.OooOO0 oooOO1 = oooOOOOOooO0O0 != null ? oooOOOOOooO0O0.f43974OooO0o0 : null;
                if (oooOO1 == null) {
                    return;
                }
                oooOO1.f43961OooO0OO = !zBooleanValue;
            }
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48699OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48700OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(p490o0o00OOO.OooOOOO oooOOOO, int i) {
            super(2);
            this.f48699OooO0Oo = oooOOOO;
            this.f48700OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48700OooO0o0 | 1);
            oo000o.OooO0oO(this.f48699OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f48701OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f48702OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48703OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(RowScope rowScope, p490o0o00OOO.OooOOOO oooOOOO, int i) {
            super(2);
            this.f48701OooO0Oo = rowScope;
            this.f48703OooO0o0 = oooOOOO;
            this.f48702OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48702OooO0o | 1);
            oo000o.OooO0oo(this.f48701OooO0Oo, this.f48703OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48704OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48705OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(p490o0o00OOO.OooOOOO oooOOOO, int i) {
            super(2);
            this.f48704OooO0Oo = oooOOOO;
            this.f48705OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48705OooO0o0 | 1);
            oo000o.OooO0o(this.f48704OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48706OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(p490o0o00OOO.OooOOOO oooOOOO) {
            super(3);
            this.f48706OooO0Oo = oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1992882003, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.SendView.<anonymous> (RoomBottomMessageInputComp.kt:270)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_moment_chat_send, composer2, 0), (String) null, o0O0O00.OooO0O0(oo000o.OooOO0O(Modifier.INSTANCE), false, false, 0L, false, null, null, null, new oo0o0Oo(this.f48706OooO0Oo), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o0o00OOO.oo000o$oo000o, reason: collision with other inner class name */
    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputCompKt$RoomMessageBottomLayoutLifecycleHelper$4", f = "RoomBottomMessageInputComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0485oo000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p490o0o00OOO.OooOOOO f48707OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f48708OooO0o0;

        /* JADX INFO: renamed from: o0o00OOO.oo000o$oo000o$OooO */
        public static final class OooO extends Lambda implements Function2<String, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO f48709OooO0Oo = new OooO();

            public OooO() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(String str, Integer num) {
                String gifUrl = str;
                int iIntValue = num.intValue();
                Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
                Room.GifMoticonRequest.Builder builderNewBuilder = Room.GifMoticonRequest.newBuilder();
                builderNewBuilder.setGifid(iIntValue);
                builderNewBuilder.setGifurl(gifUrl);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10067, builderNewBuilder.build().toByteArray());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: o0o00OOO.oo000o$oo000o$OooO00o */
        public static final class OooO00o extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ p490o0o00OOO.OooOOOO f48710OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f48711OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(p490o0o00OOO.OooOOOO oooOOOO, CoroutineScope coroutineScope) {
                super(2);
                this.f48710OooO0Oo = oooOOOO;
                this.f48711OooO0o0 = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25016OooOo.setValue(Boolean.valueOf(zBooleanValue));
                p490o0o00OOO.OooOOOO oooOOOO = this.f48710OooO0Oo;
                oo000o.OooOO0(false, oooOOOO.OooO00o());
                if (zBooleanValue) {
                    com.code.android.util.OooOOO.OooO0O0(this.f48711OooO0o0, new o0OO00O(null));
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    oooOOOO.f48505OooOO0.setValue(bool2);
                    oooOOOO.f48498OooO0O0.setValue(bool2);
                    oooOOOO.OooO0OO().f46033OooO0O0.setValue(bool2);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: o0o00OOO.oo000o$oo000o$OooO0O0 */
        public static final class OooO0O0 extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ p490o0o00OOO.OooOOOO f48712OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(p490o0o00OOO.OooOOOO oooOOOO) {
                super(2);
                this.f48712OooO0Oo = oooOOOO;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                p490o0o00OOO.OooOOOO oooOOOO = this.f48712OooO0Oo;
                oooOOOO.f48504OooO0oo.setValue(Boolean.valueOf(zBooleanValue));
                if (zBooleanValue) {
                    oo000o.OooOO0(false, oooOOOO.OooO00o());
                } else {
                    oo000o.OooOO0(!oooOOOO.f48499OooO0OO.f55749OooO0O0.getValue().booleanValue(), oooOOOO.OooO00o());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: o0o00OOO.oo000o$oo000o$OooO0OO */
        public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ p490o0o00OOO.OooOOOO f48713OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(p490o0o00OOO.OooOOOO oooOOOO) {
                super(1);
                this.f48713OooO0Oo = oooOOOO;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Boolean bool) {
                oo000o.OooOO0(!bool.booleanValue(), this.f48713OooO0Oo.OooO00o());
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: o0o00OOO.oo000o$oo000o$OooO0o */
        public static final class OooO0o extends Lambda implements Function1<Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO0o f48714OooO0Oo = new OooO0o();

            public OooO0o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Integer num) {
                int iIntValue = num.intValue();
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oO(10047, "{\"type\":" + iIntValue + "}");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0485oo000o(p490o0o00OOO.OooOOOO oooOOOO, CoroutineScope coroutineScope, Continuation<? super C0485oo000o> continuation) {
            super(2, continuation);
            this.f48707OooO0Oo = oooOOOO;
            this.f48708OooO0o0 = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0485oo000o(this.f48707OooO0Oo, this.f48708OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0485oo000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableStateFlow<Long> userId;
            MutableStateFlow<String> userName;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            p490o0o00OOO.OooOOOO oooOOOO = this.f48707OooO0Oo;
            if (oooOOOO.OooO0O0() == null) {
                oooOOOO.f48507OooOO0o.setValue(new p367o0OOo0o0.OooOOOO(oooOOOO.f48500OooO0Oo, oooOOOO.OooO00o()));
                p367o0OOo0o0.OooOOOO oooOOOOOooO0O0 = oooOOOO.OooO0O0();
                if (oooOOOOOooO0O0 != null) {
                    oooOOOOOooO0O0.f43972OooO0Oo = new OooO00o(oooOOOO, this.f48708OooO0o0);
                }
            }
            p367o0OOo0o0.OooOOOO oooOOOOOooO0O1 = oooOOOO.OooO0O0();
            if (oooOOOOOooO0O1 != null) {
                oooOOOOOooO0O1.f43971OooO0OO = new OooO0O0(oooOOOO);
            }
            MessageEditText messageEditTextOooO00o = oooOOOO.OooO00o();
            y0 y0Var = oooOOOO.f48499OooO0OO;
            y0Var.OooO00o(messageEditTextOooO00o);
            y0Var.f55748OooO00o = new OooO0OO(oooOOOO);
            y0Var.f55750OooO0OO = OooO0o.f48714OooO0Oo;
            y0Var.f55751OooO0Oo = OooO.f48709OooO0Oo;
            MessageEditText view = oooOOOO.OooO00o();
            p367o0OOo0o0.OooOOOO oooOOOOOooO0O2 = oooOOOO.OooO0O0();
            p367o0OOo0o0.OooOO0 oooOO1 = oooOOOOOooO0O2 != null ? oooOOOOOooO0O2.f43974OooO0o0 : null;
            boolean z = true;
            if (oooOO1 != null) {
                oooOO1.f43961OooO0OO = true;
            }
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            InputMethodManager inputMethodManagerOooO00o = p367o0OOo0o0.Oooo000.OooO00o(context);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
            o0o0Oo replyStates = oooOOOO.OooO0OO();
            Intrinsics.checkNotNullParameter(replyStates, "replyStates");
            replyStates.f46035OooO0Oo.setValue("");
            MutableState<SpannableString> mutableState = replyStates.f46037OooO0o0;
            mutableState.setValue(null);
            MutableState<String> mutableState2 = replyStates.f46036OooO0o;
            mutableState2.setValue("");
            MutableState<String> mutableState3 = replyStates.f46038OooO0oO;
            mutableState3.setValue("");
            MutableState<Integer> mutableState4 = replyStates.f46039OooO0oo;
            mutableState4.setValue(0);
            MutableState<String> mutableState5 = replyStates.f46031OooO;
            mutableState5.setValue("");
            MutableState<Integer> mutableState6 = replyStates.f46034OooO0OO;
            mutableState6.setValue(-1);
            ChatModel value = replyStates.f46032OooO00o.getValue();
            if (value != null) {
                mutableState6.setValue(Integer.valueOf(value.getType()));
                replyStates.f46033OooO0O0.setValue(Boolean.TRUE);
                RoomUserInfoModel newFrom = value.getNewFrom();
                String value2 = (newFrom == null || (userName = newFrom.getUserName()) == null) ? null : userName.getValue();
                RoomUserInfoModel newFrom2 = value.getNewFrom();
                String str = new h(value2, (newFrom2 == null || (userId = newFrom2.getUserId()) == null) ? 0L : userId.getValue().longValue()).f56769OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(str, "EditTextSpanItem(model.n…?.userId?.value?:0L).text");
                replyStates.f46035OooO0Oo.setValue(str);
                int type = value.getType();
                if (type == 0) {
                    MutableLiveData<List<p365o0OOo0Oo.OooOo>> mutableLiveData = p365o0OOo0Oo.Oooo000.f43954OooO00o;
                    String message = value.getMessage();
                    mutableState.setValue(p365o0OOo0Oo.Oooo000.OooO0Oo(o0000O0.OooO00o(14), message != null ? message : ""));
                } else if (type == 1) {
                    String giftUrl = value.getGiftUrl();
                    if (giftUrl != null && !StringsKt.isBlank(giftUrl)) {
                        z = false;
                    }
                    if (z) {
                        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = oOO00O.f44351OooO00o;
                        GiftPropModel giftPropModelOooO0O0 = oOO00O.OooO0O0(value.getGiftid());
                        giftUrl = giftPropModelOooO0O0 != null ? giftPropModelOooO0O0.getImageUrl() : null;
                    }
                    RoomUserInfoModel newTo = value.getNewTo();
                    if (newTo != null) {
                        mutableState3.setValue(giftUrl != null ? giftUrl : "");
                        mutableState4.setValue(Integer.valueOf(value.getNumber()));
                        mutableState5.setValue(newTo.getUserName().getValue());
                    }
                } else if (type == 7) {
                    String message2 = value.getMessage();
                    mutableState2.setValue(message2 != null ? message2 : "");
                } else if (type == 16) {
                    ChatMessageOld.Gif gif = value.getGif();
                    Intrinsics.checkNotNull(gif);
                    String str2 = gif.gifUrl;
                    Intrinsics.checkNotNullExpressionValue(str2, "model.gif!!.gifUrl");
                    if (str2.length() > 0) {
                        mutableState2.setValue(p139o00OOooO.OooO0o.OooO0Oo(str2));
                    }
                } else if (type == 11 || type == 12) {
                    MutableLiveData<List<p365o0OOo0Oo.OooOo>> mutableLiveData3 = p365o0OOo0Oo.Oooo000.f43954OooO00o;
                    String message3 = value.getMessage();
                    mutableState.setValue(p365o0OOo0Oo.Oooo000.OooO0Oo(o0000O0.OooO00o(14), message3 != null ? message3 : ""));
                }
            }
            view.requestFocus();
            view.requestFocusFromTouch();
            oooOOOO.f48503OooO0oO.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO(h hVar, MessageEditText messageEditText) {
        messageEditText.f30977OooOo0 = new androidx.compose.compiler.plugins.kotlin.OooO0o();
        messageEditText.setText("");
        messageEditText.OooO0Oo(hVar);
        Editable text = messageEditText.getText();
        Intrinsics.checkNotNull(text);
        messageEditText.setSelection(text.length());
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(p490o0o00OOO.OooOOOO oooOOOO, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1525146386);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1525146386, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.AtUser (RoomBottomMessageInputComp.kt:175)");
        }
        Integer num = (Integer) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o, composerStartRestartGroup, 8).getValue();
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 1 || iIntValue == 2) {
            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_at, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(OooOO0O(Modifier.INSTANCE), false, false, 0L, false, null, null, null, new OooO00o(oooOOOO), 253), oooOOOO.f48498OooO0O0.getValue().booleanValue() ? o0oO0O0o.f47092o000oo0o : o0oO0O0o.f46980Oooo0O0, composerStartRestartGroup, 56, 0);
            oooOOOO.f48501OooO0o.setValue(Boolean.TRUE);
        } else {
            oooOOOO.f48501OooO0o.setValue(Boolean.FALSE);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(oooOOOO, i));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"ClickableViewAccessibility"})
    public static final void OooO0O0(p490o0o00OOO.OooOOOO oooOOOO, Composer composer, int i) {
        Modifier modifierOooO00o;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-618056698);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-618056698, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.Emoji (RoomBottomMessageInputComp.kt:231)");
        }
        composerStartRestartGroup.startReplaceableGroup(-1287163617);
        if (oo0o0Oo.OooO0O0(composerStartRestartGroup)) {
            if (((Boolean) oooOOOO.f48504OooO0oo.getValue()).booleanValue()) {
                SharedGifFaceManager.f22774OooO00o.getClass();
                if (Intrinsics.areEqual(LiveDataAdapterKt.observeAsState(SharedGifFaceManager.f22776OooO0OO, composerStartRestartGroup, 8).getValue(), Boolean.TRUE)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z && Intrinsics.areEqual(LiveDataAdapterKt.observeAsState((MutableLiveData) p408o0Oo0o0O.o00Oo0.OooO0o0().f45219OooO0O0.getValue(), composerStartRestartGroup, 8).getValue(), Boolean.FALSE)) {
                modifierOooO00o = o0000Ooo.OooO00o(Modifier.INSTANCE, false, ColorKt.Color(4294863980L), Dp.m3765constructorimpl((float) 4.5d), false, true, Dp.m3765constructorimpl(18), Dp.m3765constructorimpl(-18), Dp.m3765constructorimpl(1), 553);
            } else {
                modifierOooO00o = Modifier.INSTANCE;
            }
        } else {
            modifierOooO00o = Modifier.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        float f = 8;
        ImageKt.Image(PainterResources_androidKt.painterResource(((Boolean) oooOOOO.f48504OooO0oo.getValue()).booleanValue() ? oO00OOO.iv_room_emoji_gray : oO00OOO.ic_moment_chat_keyboard_gray, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(ComposedModifierKt.composed$default(Modifier.INSTANCE, null, new o0O0O00(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f)), 1, null).then(modifierOooO00o), false, false, 0L, false, null, null, null, new OooO0OO(oooOOOO, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(oooOOOO, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(RowScope rowScope, p490o0o00OOO.OooOOOO oooOOOO, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1397026460);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1397026460, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.MessageEditTextCompose (RoomBottomMessageInputComp.kt:193)");
        }
        MutableLiveData<Integer> mutableLiveData = MixedRoomDataSource.OooO0o0().f23463OooO0oo;
        Intrinsics.checkNotNullExpressionValue(mutableLiveData, "getInstance().broadcastNumLiveData");
        Integer num = (Integer) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8).getValue();
        AndroidView_androidKt.AndroidView(new OooO(oooOOOO), PaddingKt.m478paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m3765constructorimpl(6), 0.0f, 2, null), new OooOO0(oooOOOO, num != null ? num.intValue() : 0), composerStartRestartGroup, 0, 0);
        EffectsKt.DisposableEffect(Unit.INSTANCE, new OooOO0O(oooOOOO), composerStartRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(rowScope, oooOOOO, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@NotNull p490o0o00OOO.OooOOOO messageInputState, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(messageInputState, "messageInputState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1209784248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1209784248, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputComp (RoomBottomMessageInputComp.kt:64)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        int i2 = o0oO0O0o.f47152o00OOOo;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(companion, o0oO0O0o.f46945OooO00o, null, 2, null);
        Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, bottom, composerStartRestartGroup, 6, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, messageInputState.f48498OooO0O0.getValue().booleanValue(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1766920698, true, new OooOOO(messageInputState)), composerStartRestartGroup, 1572870, 30);
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, messageInputState.OooO0OO().f46033OooO0O0.getValue().booleanValue(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -153247427, true, new OooOOOO(messageInputState)), composerStartRestartGroup, 1572870, 30);
        OooO0o(messageInputState, composerStartRestartGroup, 8);
        p490o0o00OOO.OooOo00.OooO00o(messageInputState.f48500OooO0Oo, messageInputState.f48499OooO0OO, 0, composerStartRestartGroup, 72, 4);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(messageInputState, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(p490o0o00OOO.OooOOOO oooOOOO, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(222573547);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(222573547, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomMessageBottomLayout (RoomBottomMessageInputComp.kt:102)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 0;
        Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(o0O0O00.OooO0O0(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(54)), o0oO0O0o.f46946OooO0O0, null, 2, null), false, false, 0L, false, null, null, null, o000oOoO.f48695OooO0Oo, 253), Dp.m3765constructorimpl(f), 0.0f, 2, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM390spacedBy0680j_4 = arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(f));
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM390spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRowMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-480245865);
        if (!((Boolean) oooOOOO.f48496OooO.getValue()).booleanValue() && !((Boolean) oooOOOO.f48501OooO0o.getValue()).booleanValue()) {
            oo0O.OooO00o(3, companion, composerStartRestartGroup, 6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        OooO0o0(oooOOOO, composerStartRestartGroup, 8);
        OooO00o(oooOOOO, composerStartRestartGroup, 8);
        float f2 = 12;
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m480paddingqDBjuR0$default(PaddingKt.m477paddingVpY3zN4(companion, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(8)), Dp.m3765constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), o0oO0O0o.f47079o000o0O0, null, 2, null), 1.0f, false, 2, null);
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        OooO0OO(rowScopeInstance, oooOOOO, composerStartRestartGroup, 70);
        OooO0O0(oooOOOO, composerStartRestartGroup, 8);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        OooO0oo(rowScopeInstance, oooOOOO, composerStartRestartGroup, 70);
        SpacerKt.Spacer(SizeKt.m528width3ABfNKs(companion, AnimateAsStateKt.m70animateDpAsStateAjpBEmI(((Boolean) oooOOOO.f48508OooOOO0.getValue()).booleanValue() ? Dp.m3765constructorimpl(15) : Dp.m3765constructorimpl(f2), null, "", null, composerStartRestartGroup, 384, 10).getValue().m3779unboximpl()), composerStartRestartGroup, 0);
        OooO0oO(oooOOOO, composerStartRestartGroup, 8);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(oooOOOO, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(p490o0o00OOO.OooOOOO oooOOOO, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1913764638);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1913764638, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomChatBroadcast (RoomBottomMessageInputComp.kt:151)");
        }
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Pair pair = (Pair) LiveDataAdapterKt.observeAsState(o000000O.OooOO0o(), composerStartRestartGroup, 8).getValue();
        if (pair == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(oooOOOO, i));
            return;
        }
        if (((Number) pair.getSecond()).intValue() <= PremiumLevel.Premium4.getValue() || !((Boolean) pair.getFirst()).booleanValue()) {
            oooOOOO.f48496OooO.setValue(Boolean.FALSE);
        } else {
            IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oOo00OO0.icv_chat_broadcast, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(o0O0O00.OooO0Oo(OooOO0O(Modifier.INSTANCE), composerStartRestartGroup, 0), false, false, 0L, false, null, null, null, new OooOo(oooOOOO), 253), oooOOOO.OooO0Oo() ? o0oO0O0o.f46993OoooOo0 : o0oO0O0o.f46980Oooo0O0, composerStartRestartGroup, 56, 0);
            oooOOOO.f48496OooO.setValue(Boolean.TRUE);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new Oooo000(oooOOOO, i));
    }

    @Composable
    public static final void OooO0oO(p490o0o00OOO.OooOOOO oooOOOO, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(590606489);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590606489, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomMessageBottomLayoutLifecycleHelper (RoomBottomMessageInputComp.kt:286)");
        }
        EffectsKt.DisposableEffect(Unit.INSTANCE, new o00O0O(oooOOOO), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(602281921);
        if (o000OOo.OooO0O0(composerStartRestartGroup)) {
            Intrinsics.checkNotNullParameter("HIDE_KEYBOARD", "key");
            Observable observable = LiveEventBus.get("roomHIDE_KEYBOARD", Object.class);
            Intrinsics.checkNotNullExpressionValue(observable, "get(\"room$key\", Any::class.java)");
            o00000O.OooO00o(observable, new o00Oo0(oooOOOO), composerStartRestartGroup, 8);
            Intrinsics.checkNotNullParameter("IGNORE_KEYBOARD", "key");
            Observable observable2 = LiveEventBus.get("roomIGNORE_KEYBOARD", Object.class);
            Intrinsics.checkNotNullExpressionValue(observable2, "get(\"room$key\", Any::class.java)");
            o00000O.OooO00o(observable2, new o00Ooo(oooOOOO), composerStartRestartGroup, 8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(773894976);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = androidx.compose.animation.OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(oooOOOO.OooO00o(), oooOOOO.OooO0O0(), new C0485oo000o(oooOOOO, coroutineScope, null), composerStartRestartGroup, 584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(oooOOOO, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oo(RowScope rowScope, p490o0o00OOO.OooOOOO oooOOOO, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1466570539);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1466570539, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.SendView (RoomBottomMessageInputComp.kt:267)");
        }
        AnimatedVisibilityKt.AnimatedVisibility(rowScope, !((Boolean) oooOOOO.f48508OooOOO0.getValue()).booleanValue(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1992882003, true, new o0ooOOo(oooOOOO)), composerStartRestartGroup, (i & 14) | 1572864, 30);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OOO0o(rowScope, oooOOOO, i));
    }

    public static final void OooOO0(boolean z, MessageEditText messageEditText) {
        messageEditText.setAlpha(z ? 0.5f : 1.0f);
        if (z) {
            messageEditText.clearFocus();
        } else {
            messageEditText.requestFocus();
        }
    }

    public static Modifier OooOO0O(Modifier.Companion companion) {
        return ComposedModifierKt.composed$default(companion, null, new o0O0O00(Dp.m3765constructorimpl(12), Dp.m3765constructorimpl(0)), 1, null);
    }
}
