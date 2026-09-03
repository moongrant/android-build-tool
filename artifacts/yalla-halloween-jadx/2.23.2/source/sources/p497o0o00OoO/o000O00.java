package p497o0o00OoO;

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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000Ooo;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
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
import p022Oooo00O.o0O00oO0;
import p371o0OOo0oO.oo000o;
import p391o0OOooo0.oo0o0Oo;
import p423o0OoO0OO.o00O0000;
import p442o0OoOo0O.o000;
import p442o0OoOo0O.o00000;
import p442o0OoOo0O.o0000OO0;
import p448o0OoOoo.oo0oOO0;
import p476o0OooooO.o0OOo000;
import p557o0oOOooO.oOo00ooO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;
import p587o0oOooOO.t;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomBottomMessageInputComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,585:1\n73#2,5:586\n78#2:619\n82#2:624\n78#3,11:591\n91#3:623\n78#3,11:630\n78#3,11:668\n91#3:700\n91#3:706\n456#4,8:602\n464#4,3:616\n467#4,3:620\n456#4,8:641\n464#4,3:655\n456#4,8:679\n464#4,3:693\n467#4,3:697\n467#4,3:703\n25#4:717\n4144#5,6:610\n4144#5,6:649\n4144#5,6:687\n154#6:625\n154#6:626\n154#6:627\n154#6:659\n154#6:660\n154#6:661\n154#6:702\n154#6:708\n164#6:709\n154#6:710\n154#6:712\n154#6:728\n77#7,2:628\n79#7:658\n73#7,6:662\n79#7:696\n83#7:701\n83#7:707\n76#8:711\n76#8:729\n486#9,4:713\n490#9,2:721\n494#9:727\n1097#10,3:718\n1100#10,3:724\n486#11:723\n*S KotlinDebug\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt\n*L\n67#1:586,5\n67#1:619\n67#1:624\n67#1:591,11\n67#1:623\n107#1:630,11\n123#1:668,11\n123#1:700\n107#1:706\n67#1:602,8\n67#1:616,3\n67#1:620,3\n107#1:641,8\n107#1:655,3\n123#1:679,8\n123#1:693,3\n123#1:697,3\n107#1:703,3\n311#1:717\n67#1:610,6\n107#1:649,6\n123#1:687,6\n109#1:625\n112#1:626\n114#1:627\n116#1:659\n125#1:660\n126#1:661\n140#1:702\n204#1:708\n240#1:709\n240#1:710\n255#1:712\n470#1:728\n107#1:628,2\n107#1:658\n123#1:662,6\n123#1:696\n123#1:701\n107#1:707\n249#1:711\n580#1:729\n311#1:713,4\n311#1:721,2\n311#1:727\n311#1:718,3\n311#1:724,3\n311#1:723\n*E\n"})
public final class o000O00 {

    public static final class OooO extends Lambda implements Function1<Context, MessageEditText> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49757OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0000 o0000Var) {
            super(1);
            this.f49757OooO0Oo = o0000Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final MessageEditText invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f49757OooO0Oo.OooO00o();
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49758OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000 o0000Var) {
            super(0);
            this.f49758OooO0Oo = o0000Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("102202");
            MutableState<Boolean> roomAtVisible = this.f49758OooO0Oo.f49683OooO0O0;
            Intrinsics.checkNotNullParameter(roomAtVisible, "roomAtVisible");
            roomAtVisible.setValue(Boolean.valueOf(!roomAtVisible.getValue().booleanValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49759OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49760OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0000 o0000Var, int i) {
            super(2);
            this.f49759OooO0Oo = o0000Var;
            this.f49760OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49760OooO0o0 | 1);
            o000O00.OooO00o(this.f49759OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49761OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Context f49762OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0000 o0000Var, Context context) {
            super(0);
            this.f49761OooO0Oo = o0000Var;
            this.f49762OooO0o0 = context;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0000 o0000Var = this.f49761OooO0Oo;
            if (((Boolean) o0000Var.f49689OooO0oo.getValue()).booleanValue()) {
                o0oo0000.OooO00o.OooO0O0("102061");
            } else {
                o0oo0000.OooO00o.OooO0O0("102062");
            }
            p371o0OOo0oO.oo000o oo000oVarOooO0O0 = o0000Var.OooO0O0();
            if (oo000oVarOooO0O0 != null) {
                oo000oVarOooO0O0.OooO0OO(this.f49762OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49763OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49764OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0000 o0000Var, int i) {
            super(2);
            this.f49763OooO0Oo = o0000Var;
            this.f49764OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49764OooO0o0 | 1);
            o000O00.OooO0O0(this.f49763OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<MessageEditText, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49765OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49766OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0000 o0000Var, int i) {
            super(1);
            this.f49765OooO0Oo = o0000Var;
            this.f49766OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MessageEditText messageEditText) {
            MessageEditText it = messageEditText;
            Intrinsics.checkNotNullParameter(it, "it");
            o0000 o0000Var = this.f49765OooO0Oo;
            if (o0000Var.OooO0Oo()) {
                int i = this.f49766OooO0o0;
                if (i > 0) {
                    it.setHint(o0000O.OooO00o(o0000.OooO0OO(o000000.times_available), String.valueOf(i)));
                } else {
                    it.setHint(o0000.OooO0OO(o000000.please_chat_friendly));
                    String strOooO0OO = o0000.OooO0OO(o000000.Out_of_broadcast_chances);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                    o0000Var.f49688OooO0oO.setValue(Boolean.FALSE);
                }
            } else {
                it.setHint(o0000.OooO0OO(o000000.please_chat_friendly));
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomBottomMessageInputComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$MessageEditTextCompose$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,585:1\n63#2,5:586\n*S KotlinDebug\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$MessageEditTextCompose$3\n*L\n222#1:586,5\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49767OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(o0000 o0000Var) {
            super(1);
            this.f49767OooO0Oo = o0000Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            o0000 o0000Var = this.f49767OooO0Oo;
            o0000Var.OooO00o().setTextIsSelectable(true);
            MessageEditText messageEditTextOooO00o = o0000Var.OooO00o();
            Editable text = o0000Var.OooO00o().getText();
            messageEditTextOooO00o.setSelection(text != null ? text.length() : 0);
            return new o000O00O(o0000Var);
        }
    }

    public static final class OooOOO extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f49768OooO0Oo = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f49769OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49770OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0000 f49771OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(RowScope rowScope, o0000 o0000Var, int i) {
            super(2);
            this.f49769OooO0Oo = rowScope;
            this.f49771OooO0o0 = o0000Var;
            this.f49770OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49770OooO0o | 1);
            o000O00.OooO0OO(this.f49769OooO0Oo, this.f49771OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49772OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o0000 o0000Var) {
            super(3);
            this.f49772OooO0Oo = o0000Var;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1766920698, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputComp.<anonymous>.<anonymous> (RoomBottomMessageInputComp.kt:73)");
            }
            o0000 o0000Var = this.f49772OooO0Oo;
            o00000.OooO00o(new o000O0(o0000Var), new o000O0Oo(o0000Var), o0000Var.f49683OooO0O0, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49773OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(o0000 o0000Var) {
            super(3);
            this.f49773OooO0Oo = o0000Var;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-153247427, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputComp.<anonymous>.<anonymous> (RoomBottomMessageInputComp.kt:91)");
            }
            o0000OO0.OooO0OO(this.f49773OooO0Oo.OooO0OO(), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f49774OooO0Oo = new OooOo00();

        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49775OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(o0000 o0000Var) {
            super(0);
            this.f49775OooO0Oo = o0000Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0000 o0000Var = this.f49775OooO0Oo;
            o0000Var.f49688OooO0oO.setValue(Boolean.valueOf(!o0000Var.OooO0Oo()));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49776OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49777OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(o0000 o0000Var, int i) {
            super(2);
            this.f49776OooO0Oo = o0000Var;
            this.f49777OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49777OooO0o0 | 1);
            o000O00.OooO0Oo(this.f49776OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49778OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49779OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(o0000 o0000Var, int i) {
            super(2);
            this.f49778OooO0Oo = o0000Var;
            this.f49779OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49779OooO0o0 | 1);
            o000O00.OooO0o0(this.f49778OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f49780OooO0Oo = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49781OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49782OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(o0000 o0000Var, int i) {
            super(2);
            this.f49781OooO0Oo = o0000Var;
            this.f49782OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49782OooO0o0 | 1);
            o000O00.OooO0o(this.f49781OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomBottomMessageInputComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$RoomMessageBottomLayoutLifecycleHelper$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,585:1\n63#2,5:586\n*S KotlinDebug\n*F\n+ 1 RoomBottomMessageInputComp.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomBottomMessageInputCompKt$RoomMessageBottomLayoutLifecycleHelper$1\n*L\n292#1:586,5\n*E\n"})
    public static final class o00Ooo extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49783OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(o0000 o0000Var) {
            super(1);
            this.f49783OooO0Oo = o0000Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o000OO0O(this.f49783OooO0Oo);
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49784OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49785OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(o0000 o0000Var, int i) {
            super(2);
            this.f49784OooO0Oo = o0000Var;
            this.f49785OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49785OooO0o0 | 1);
            o000O00.OooO0oO(this.f49784OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49786OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(o0000 o0000Var) {
            super(3);
            this.f49786OooO0Oo = o0000Var;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1992882003, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.bottom.SendView.<anonymous> (RoomBottomMessageInputComp.kt:272)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_moment_chat_send, composer2, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(o000O00.OooOO0O(Modifier.INSTANCE), false, false, 0L, false, null, null, null, new o000O(this.f49786OooO0Oo), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RowScope f49787OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49788OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0000 f49789OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(RowScope rowScope, o0000 o0000Var, int i) {
            super(2);
            this.f49787OooO0Oo = rowScope;
            this.f49789OooO0o0 = o0000Var;
            this.f49788OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49788OooO0o | 1);
            o000O00.OooO0oo(this.f49787OooO0Oo, this.f49789OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49790OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49791OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(o0000 o0000Var, int i) {
            super(2);
            this.f49790OooO0Oo = o0000Var;
            this.f49791OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49791OooO0o0 | 1);
            o000O00.OooO0o0(this.f49790OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0ooOOo f49792OooO0Oo = new o0ooOOo();

        public o0ooOOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputCompKt$RoomMessageBottomLayoutLifecycleHelper$4", f = "RoomBottomMessageInputComp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0000 f49793OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f49794OooO0o0;

        public static final class OooO extends Lambda implements Function2<String, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO f49795OooO0Oo = new OooO();

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
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10067, builderNewBuilder.build().toByteArray());
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO00o extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0000 f49796OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f49797OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0000 o0000Var, CoroutineScope coroutineScope) {
                super(2);
                this.f49796OooO0Oo = o0000Var;
                this.f49797OooO0o0 = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24554OooOo.setValue(Boolean.valueOf(zBooleanValue));
                o0000 o0000Var = this.f49796OooO0Oo;
                o000O00.OooOO0(false, o0000Var.OooO00o());
                if (zBooleanValue) {
                    com.code.android.util.OooOOO.OooO0O0(this.f49797OooO0o0, new o000O0O0(null));
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    o0000Var.f49690OooOO0.setValue(bool2);
                    o0000Var.f49683OooO0O0.setValue(bool2);
                    o0000Var.OooO0OO().f47212OooO0O0.setValue(bool2);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function2<Boolean, Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0000 f49798OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o0000 o0000Var) {
                super(2);
                this.f49798OooO0Oo = o0000Var;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(Boolean bool, Integer num) {
                boolean zBooleanValue = bool.booleanValue();
                num.intValue();
                o0000 o0000Var = this.f49798OooO0Oo;
                o0000Var.f49689OooO0oo.setValue(Boolean.valueOf(zBooleanValue));
                if (zBooleanValue) {
                    o000O00.OooOO0(false, o0000Var.OooO00o());
                } else {
                    o000O00.OooOO0(!o0000Var.f49684OooO0OO.f56977OooO0O0.getValue().booleanValue(), o0000Var.OooO00o());
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ o0000 f49799OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(o0000 o0000Var) {
                super(1);
                this.f49799OooO0Oo = o0000Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Boolean bool) {
                o000O00.OooOO0(!bool.booleanValue(), this.f49799OooO0Oo.OooO00o());
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0o extends Lambda implements Function1<Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO0o f49800OooO0Oo = new OooO0o();

            public OooO0o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Integer num) {
                int iIntValue = num.intValue();
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oO(10047, "{\"type\":" + iIntValue + "}");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(o0000 o0000Var, CoroutineScope coroutineScope, Continuation<? super oo000o> continuation) {
            super(2, continuation);
            this.f49793OooO0Oo = o0000Var;
            this.f49794OooO0o0 = coroutineScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new oo000o(this.f49793OooO0Oo, this.f49794OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((oo000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableStateFlow<Long> userId;
            MutableStateFlow<String> userName;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0000 o0000Var = this.f49793OooO0Oo;
            if (o0000Var.OooO0O0() == null) {
                o0000Var.f49692OooOO0o.setValue(new p371o0OOo0oO.oo000o(o0000Var.f49685OooO0Oo, o0000Var.OooO00o()));
                p371o0OOo0oO.oo000o oo000oVarOooO0O0 = o0000Var.OooO0O0();
                if (oo000oVarOooO0O0 != null) {
                    oo000oVarOooO0O0.f43184OooO0Oo = new OooO00o(o0000Var, this.f49794OooO0o0);
                }
            }
            p371o0OOo0oO.oo000o oo000oVarOooO0O1 = o0000Var.OooO0O0();
            if (oo000oVarOooO0O1 != null) {
                oo000oVarOooO0O1.f43183OooO0OO = new OooO0O0(o0000Var);
            }
            MessageEditText messageEditTextOooO00o = o0000Var.OooO00o();
            t tVar = o0000Var.f49684OooO0OO;
            tVar.OooO00o(messageEditTextOooO00o);
            tVar.f56976OooO00o = new OooO0OO(o0000Var);
            tVar.f56978OooO0OO = OooO0o.f49800OooO0Oo;
            tVar.f56979OooO0Oo = OooO.f49795OooO0Oo;
            MessageEditText view = o0000Var.OooO00o();
            p371o0OOo0oO.oo000o oo000oVarOooO0O2 = o0000Var.OooO0O0();
            p371o0OOo0oO.o0OoOo0 o0oooo1 = oo000oVarOooO0O2 != null ? oo000oVarOooO0O2.f43186OooO0o0 : null;
            boolean z = true;
            if (o0oooo1 != null) {
                o0oooo1.f43174OooO0OO = true;
            }
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o0OOO0o.OooO00o(context);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            inputMethodManagerOooO00o.showSoftInput(view, 2, new KeyBoardUtil$showKeyboard$1(view.getContext().getApplicationContext(), new Handler()));
            o000 replyStates = o0000Var.OooO0OO();
            Intrinsics.checkNotNullParameter(replyStates, "replyStates");
            replyStates.f47214OooO0Oo.setValue("");
            MutableState<SpannableString> mutableState = replyStates.f47216OooO0o0;
            mutableState.setValue(null);
            MutableState<String> mutableState2 = replyStates.f47215OooO0o;
            mutableState2.setValue("");
            MutableState<String> mutableState3 = replyStates.f47217OooO0oO;
            mutableState3.setValue("");
            MutableState<Integer> mutableState4 = replyStates.f47218OooO0oo;
            mutableState4.setValue(0);
            MutableState<String> mutableState5 = replyStates.f47210OooO;
            mutableState5.setValue("");
            MutableState<Integer> mutableState6 = replyStates.f47213OooO0OO;
            mutableState6.setValue(-1);
            ChatModel value = replyStates.f47211OooO00o.getValue();
            if (value != null) {
                mutableState6.setValue(Integer.valueOf(value.getType()));
                replyStates.f47212OooO0O0.setValue(Boolean.TRUE);
                RoomUserInfoModel newFrom = value.getNewFrom();
                String value2 = (newFrom == null || (userName = newFrom.getUserName()) == null) ? null : userName.getValue();
                RoomUserInfoModel newFrom2 = value.getNewFrom();
                String str = new oOo00ooO(value2, (newFrom2 == null || (userId = newFrom2.getUserId()) == null) ? 0L : userId.getValue().longValue()).f56180OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(str, "getText(...)");
                replyStates.f47214OooO0Oo.setValue(str);
                int type = value.getType();
                if (type == 0) {
                    MutableLiveData<List<p369o0OOo0o.OooOOO0>> mutableLiveData = p369o0OOo0o.OooOOO.f43158OooO00o;
                    String message = value.getMessage();
                    mutableState.setValue(p369o0OOo0o.OooOOO.OooO0Oo(o0000O0.OooO00o(14), message != null ? message : ""));
                } else if (type == 1) {
                    String giftUrl = value.getGiftUrl();
                    if (giftUrl != null && !StringsKt.isBlank(giftUrl)) {
                        z = false;
                    }
                    if (z) {
                        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = oo0o0Oo.f43573OooO00o;
                        GiftPropModel giftPropModelOooO0O0 = oo0o0Oo.OooO0O0(value.getGiftid());
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
                    String gifUrl = gif.gifUrl;
                    Intrinsics.checkNotNullExpressionValue(gifUrl, "gifUrl");
                    if (gifUrl.length() > 0) {
                        mutableState2.setValue(p184o00o00O0.OooO0OO.OooO0Oo(gifUrl));
                    }
                } else if (type == 11 || type == 12) {
                    MutableLiveData<List<p369o0OOo0o.OooOOO0>> mutableLiveData3 = p369o0OOo0o.OooOOO.f43158OooO00o;
                    String message3 = value.getMessage();
                    mutableState.setValue(p369o0OOo0o.OooOOO.OooO0Oo(o0000O0.OooO00o(14), message3 != null ? message3 : ""));
                }
            }
            view.requestFocus();
            view.requestFocusFromTouch();
            o0000Var.f49688OooO0oO.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO(oOo00ooO ooo00ooo, MessageEditText messageEditText) {
        messageEditText.f30432OooOo0 = new com.facebook.OooOOO();
        messageEditText.setText("");
        messageEditText.OooO0Oo(ooo00ooo);
        Editable text = messageEditText.getText();
        Intrinsics.checkNotNull(text);
        messageEditText.setSelection(text.length());
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(o0000 o0000Var, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1525146386);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1525146386, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.AtUser (RoomBottomMessageInputComp.kt:176)");
        }
        Integer num = (Integer) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24546OooOO0o, composerStartRestartGroup, 8).getValue();
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == 1 || iIntValue == 2) {
            IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.icv_at, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(OooOO0O(Modifier.INSTANCE), false, false, 0L, false, null, null, null, new OooO00o(o0000Var), 253), o0000Var.f49683OooO0O0.getValue().booleanValue() ? o0OOo000.f48282o000ooO : o0OOo000.f48170Oooo0OO, composerStartRestartGroup, 56, 0);
            o0000Var.f49686OooO0o.setValue(Boolean.TRUE);
        } else {
            o0000Var.f49686OooO0o.setValue(Boolean.FALSE);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(o0000Var, i));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"ClickableViewAccessibility"})
    public static final void OooO0O0(o0000 o0000Var, Composer composer, int i) {
        Modifier modifierOooO00o;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-618056698);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-618056698, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.Emoji (RoomBottomMessageInputComp.kt:234)");
        }
        composerStartRestartGroup.startReplaceableGroup(-1287163500);
        if (p417o0Oo0oo0.o0Oo0oo.OooO0O0(composerStartRestartGroup)) {
            if (((Boolean) o0000Var.f49689OooO0oo.getValue()).booleanValue()) {
                SharedGifFaceManager.f22301OooO00o.getClass();
                if (Intrinsics.areEqual(LiveDataAdapterKt.observeAsState(SharedGifFaceManager.f22303OooO0OO, composerStartRestartGroup, 8).getValue(), Boolean.TRUE)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z && Intrinsics.areEqual(LiveDataAdapterKt.observeAsState((MutableLiveData) p415o0Oo0oO0.o00Ooo.OooO0o0().f46399OooO0O0.getValue(), composerStartRestartGroup, 8).getValue(), Boolean.FALSE)) {
                modifierOooO00o = o0000Ooo.OooO00o(Modifier.INSTANCE, false, ColorKt.Color(4294863980L), Dp.m3775constructorimpl((float) 4.5d), false, true, Dp.m3775constructorimpl(18), Dp.m3775constructorimpl(-18), Dp.m3775constructorimpl(1), 553);
            } else {
                modifierOooO00o = Modifier.INSTANCE;
            }
        } else {
            modifierOooO00o = Modifier.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        float f = 8;
        ImageKt.Image(PainterResources_androidKt.painterResource(((Boolean) o0000Var.f49689OooO0oo.getValue()).booleanValue() ? o0O0O00.iv_room_emoji_gray : o0O0O00.ic_moment_chat_keyboard_gray, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(ComposedModifierKt.composed$default(Modifier.INSTANCE, null, new o000OO00(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f)), 1, null).then(modifierOooO00o), false, false, 0L, false, null, null, null, new OooO0OO(o0000Var, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(o0000Var, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(RowScope rowScope, o0000 o0000Var, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1397026460);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1397026460, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.MessageEditTextCompose (RoomBottomMessageInputComp.kt:196)");
        }
        MutableLiveData<Integer> mutableLiveData = MixedRoomDataSource.OooO0o0().f22994OooO0oo;
        Intrinsics.checkNotNullExpressionValue(mutableLiveData, "getBroadcastNumLiveData(...)");
        Integer num = (Integer) LiveDataAdapterKt.observeAsState(mutableLiveData, composerStartRestartGroup, 8).getValue();
        AndroidView_androidKt.AndroidView(new OooO(o0000Var), PaddingKt.m480paddingVpY3zN4$default(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), Dp.m3775constructorimpl(6), 0.0f, 2, null), new OooOO0(o0000Var, num != null ? num.intValue() : 0), composerStartRestartGroup, 0, 0);
        EffectsKt.DisposableEffect(Unit.INSTANCE, new OooOO0O(o0000Var), composerStartRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(rowScope, o0000Var, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@NotNull o0000 messageInputState, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(messageInputState, "messageInputState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1209784248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1209784248, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomBottomMessageInputComp (RoomBottomMessageInputComp.kt:65)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        int i2 = o0OOo000.f48347o00OOooO;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(companion, o0OOo000.f48134OooO00o, null, 2, null);
        Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, bottom, composerStartRestartGroup, 6, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, messageInputState.f49683OooO0O0.getValue().booleanValue(), SemanticsModifierKt.semantics$default(companion, false, OooOOO.f49768OooO0Oo, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1766920698, true, new OooOOOO(messageInputState)), composerStartRestartGroup, 1572870, 28);
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, messageInputState.OooO0OO().f47212OooO0O0.getValue().booleanValue(), SemanticsModifierKt.semantics$default(companion, false, OooOo00.f49774OooO0Oo, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -153247427, true, new OooOo(messageInputState)), composerStartRestartGroup, 1572870, 28);
        OooO0o(messageInputState, composerStartRestartGroup, 8);
        o0000O00.OooO00o(messageInputState.f49685OooO0Oo, messageInputState.f49684OooO0OO, 0, composerStartRestartGroup, 72, 4);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(messageInputState, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(o0000 o0000Var, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(222573547);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(222573547, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomMessageBottomLayout (RoomBottomMessageInputComp.kt:105)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 0;
        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(com.code.android.util.o0O0O00.OooO0O0(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(54)), o0OOo000.f48135OooO0O0, null, 2, null), false, false, 0L, false, null, null, null, o00O0O.f49780OooO0Oo, 253), Dp.m3775constructorimpl(f), 0.0f, 2, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_4 = arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f));
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyRowMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-480245748);
        if (!((Boolean) o0000Var.f49681OooO.getValue()).booleanValue() && !((Boolean) o0000Var.f49686OooO0o.getValue()).booleanValue()) {
            oo0oOO0.OooO00o(3, companion, composerStartRestartGroup, 6);
        }
        composerStartRestartGroup.endReplaceableGroup();
        OooO0o0(o0000Var, composerStartRestartGroup, 8);
        OooO00o(o0000Var, composerStartRestartGroup, 8);
        float f2 = 12;
        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m482paddingqDBjuR0$default(PaddingKt.m479paddingVpY3zN4(companion, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(8)), Dp.m3775constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), o0OOo000.f48270o000o0Oo, null, 2, null), 1.0f, false, 2, null);
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        OooO0OO(rowScopeInstance, o0000Var, composerStartRestartGroup, 70);
        OooO0O0(o0000Var, composerStartRestartGroup, 8);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        OooO0oo(rowScopeInstance, o0000Var, composerStartRestartGroup, 70);
        SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, AnimateAsStateKt.m70animateDpAsStateAjpBEmI(((Boolean) o0000Var.f49693OooOOO0.getValue()).booleanValue() ? Dp.m3775constructorimpl(15) : Dp.m3775constructorimpl(f2), null, "", null, composerStartRestartGroup, 384, 10).getValue().m3789unboximpl()), composerStartRestartGroup, 0);
        OooO0oO(o0000Var, composerStartRestartGroup, 8);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Oo0(o0000Var, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(o0000 o0000Var, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1913764638);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1913764638, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomChatBroadcast (RoomBottomMessageInputComp.kt:152)");
        }
        p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
        Pair pair = (Pair) LiveDataAdapterKt.observeAsState(p475o0Ooooo0.o0O00oO0.OooOO0o(), composerStartRestartGroup, 8).getValue();
        if (pair == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(o0000Var, i));
            return;
        }
        if (((Number) pair.getSecond()).intValue() <= PremiumLevel.Premium4.getValue() || !((Boolean) pair.getFirst()).booleanValue()) {
            o0000Var.f49681OooO.setValue(Boolean.FALSE);
        } else {
            IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.icv_chat_broadcast, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(com.code.android.util.o0O0O00.OooO0Oo(OooOO0O(Modifier.INSTANCE), composerStartRestartGroup, 0), false, false, 0L, false, null, null, null, new Oooo0(o0000Var), 253), o0000Var.OooO0Oo() ? o0OOo000.f48185Ooooo00 : o0OOo000.f48170Oooo0OO, composerStartRestartGroup, 56, 0);
            o0000Var.f49681OooO.setValue(Boolean.TRUE);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o000oOoO(o0000Var, i));
    }

    @Composable
    public static final void OooO0oO(final o0000 o0000Var, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(590606489);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590606489, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.RoomMessageBottomLayoutLifecycleHelper (RoomBottomMessageInputComp.kt:289)");
        }
        EffectsKt.DisposableEffect(Unit.INSTANCE, new o00Ooo(o0000Var), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(602282072);
        if (p417o0Oo0oo0.oo0o0Oo.OooO0O0(composerStartRestartGroup)) {
            Intrinsics.checkNotNullParameter("HIDE_KEYBOARD", "key");
            Observable observable = LiveEventBus.get("roomHIDE_KEYBOARD", Object.class);
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new Observer() { // from class: o0o00OoO.o000O0o
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    oo000o oo000oVarOooO0O0;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    o0000 messageInputState = o0000Var;
                    Intrinsics.checkNotNullParameter(messageInputState, "$messageInputState");
                    if (!zBooleanValue || (oo000oVarOooO0O0 = messageInputState.OooO0O0()) == null) {
                        return;
                    }
                    oo000oVarOooO0O0.OooO00o();
                }
            }, composerStartRestartGroup, 72);
            Intrinsics.checkNotNullParameter("IGNORE_KEYBOARD", "key");
            Observable observable2 = LiveEventBus.get("roomIGNORE_KEYBOARD", Object.class);
            Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
            o00O0000.OooO00o(observable2, new o000Oo0(o0000Var, 0), composerStartRestartGroup, 72);
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
        EffectsKt.LaunchedEffect(o0000Var.OooO00o(), o0000Var.OooO0O0(), new oo000o(o0000Var, coroutineScope, null), composerStartRestartGroup, 584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00oO0o(o0000Var, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oo(RowScope rowScope, o0000 o0000Var, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1466570539);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1466570539, i, -1, "com.yalla.yalla.ui.activity.room.live.bottom.SendView (RoomBottomMessageInputComp.kt:270)");
        }
        AnimatedVisibilityKt.AnimatedVisibility(rowScope, !((Boolean) o0000Var.f49693OooOOO0.getValue()).booleanValue(), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, o0ooOOo.f49792OooO0Oo, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1992882003, true, new o0OOO0o(o0000Var)), composerStartRestartGroup, (i & 14) | 1572864, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0Oo0oo(rowScope, o0000Var, i));
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
        return ComposedModifierKt.composed$default(companion, null, new o000OO00(Dp.m3775constructorimpl(12), Dp.m3775constructorimpl(0)), 1, null);
    }
}
