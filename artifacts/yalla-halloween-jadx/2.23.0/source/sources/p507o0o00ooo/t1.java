package p507o0o00ooo;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p445o0OoOoo.o0oOO;
import p469o0OoooOO.o0oO0O0o;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toolbar.kt\ncom/yalla/yalla/ui/composable/common/ToolbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,169:1\n154#2:170\n154#2:206\n154#2:207\n154#2:215\n154#2:216\n154#2:224\n154#2:260\n154#2:266\n154#2:279\n154#2:319\n154#2:320\n154#2:328\n154#2:329\n73#3,6:171\n79#3:205\n73#3,6:225\n79#3:259\n83#3:265\n83#3:271\n78#4,11:177\n78#4,11:231\n91#4:264\n91#4:270\n78#4,11:285\n91#4:317\n456#5,8:188\n464#5,3:202\n36#5:208\n36#5:217\n456#5,8:242\n464#5,3:256\n467#5,3:261\n467#5,3:267\n36#5:272\n456#5,8:296\n464#5,3:310\n467#5,3:314\n36#5:321\n36#5:330\n4144#6,6:196\n4144#6,6:250\n4144#6,6:304\n1097#7,6:209\n1097#7,6:218\n1097#7,6:273\n1097#7,6:322\n1097#7,6:331\n67#8,5:280\n72#8:313\n76#8:318\n*S KotlinDebug\n*F\n+ 1 Toolbar.kt\ncom/yalla/yalla/ui/composable/common/ToolbarKt\n*L\n57#1:170\n61#1:206\n68#1:207\n75#1:215\n80#1:216\n87#1:224\n95#1:260\n108#1:266\n119#1:279\n145#1:319\n146#1:320\n163#1:328\n164#1:329\n52#1:171,6\n52#1:205\n89#1:225,6\n89#1:259\n89#1:265\n52#1:271\n52#1:177,11\n89#1:231,11\n89#1:264\n52#1:270\n114#1:285,11\n114#1:317\n52#1:188,8\n52#1:202,3\n71#1:208\n83#1:217\n89#1:242,8\n89#1:256,3\n89#1:261,3\n52#1:267,3\n118#1:272\n114#1:296,8\n114#1:310,3\n114#1:314,3\n147#1:321\n165#1:330\n52#1:196,6\n89#1:250,6\n114#1:304,6\n71#1:209,6\n83#1:218,6\n118#1:273,6\n147#1:322,6\n165#1:331,6\n114#1:280,5\n114#1:313\n114#1:318\n*E\n"})
public final class t1 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f50233OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Painter f50234OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f50235OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f50236OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50237OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f50238OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Painter painter, long j, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f50234OooO0Oo = painter;
            this.f50236OooO0o0 = j;
            this.f50235OooO0o = z;
            this.f50237OooO0oO = function0;
            this.f50238OooO0oo = i;
            this.f50233OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            t1.OooO0O0(this.f50234OooO0Oo, this.f50236OooO0o0, this.f50235OooO0o, this.f50237OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50238OooO0oo | 1), this.f50233OooO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50239OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f50239OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f50239OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            } else {
                oo0oOO0.OooO0o(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50240OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0) {
            super(0);
            this.f50240OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Function0<Unit> function0 = this.f50240OooO0Oo;
            if (function0 != null) {
                function0.invoke();
            } else {
                oo0oOO0.OooO0o(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50241OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f50242OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f50243OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f50244OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Integer f50245OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Integer f50246OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f50247OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f50248OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f50249OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f50250OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ int f50251OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(String str, float f, long j, Integer num, Integer num2, Function0<Unit> function0, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4, Modifier modifier, int i, int i2) {
            super(2);
            this.f50242OooO0Oo = str;
            this.f50244OooO0o0 = f;
            this.f50243OooO0o = j;
            this.f50245OooO0oO = num;
            this.f50246OooO0oo = num2;
            this.f50241OooO = function0;
            this.f50247OooOO0 = function3;
            this.f50248OooOO0O = function4;
            this.f50249OooOO0o = modifier;
            this.f50251OooOOO0 = i;
            this.f50250OooOOO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            t1.OooO00o(this.f50242OooO0Oo, this.f50244OooO0o0, this.f50243OooO0o, this.f50245OooO0oO, this.f50246OooO0oo, this.f50241OooO, this.f50247OooOO0, this.f50248OooOO0O, this.f50249OooOO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50251OooOOO0 | 1), this.f50250OooOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50252OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Function0<Unit> function0) {
            super(0);
            this.f50252OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f50252OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50253OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Function0<Unit> function0) {
            super(0);
            this.f50253OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f50253OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f50254OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50255OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f50256OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50257OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f50258OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i, boolean z, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f50254OooO0Oo = i;
            this.f50256OooO0o0 = z;
            this.f50255OooO0o = function0;
            this.f50257OooO0oO = i2;
            this.f50258OooO0oo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            t1.OooO0OO(this.f50254OooO0Oo, this.f50256OooO0o0, this.f50255OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50257OooO0oO | 1), this.f50258OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f50259OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50260OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f50261OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50262OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f50263OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(int i, int i2, String str, Function0 function0, boolean z) {
            super(2);
            this.f50259OooO0Oo = str;
            this.f50261OooO0o0 = z;
            this.f50260OooO0o = function0;
            this.f50262OooO0oO = i;
            this.f50263OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            t1.OooO0Oo(this.f50259OooO0Oo, this.f50261OooO0o0, this.f50260OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f50262OooO0oO | 1), this.f50263OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f50264OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Function0<Unit> function0) {
            super(0);
            this.f50264OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f50264OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0143  */
    /* JADX WARN: Code duplicated, block: B:116:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x016b  */
    /* JADX WARN: Code duplicated, block: B:118:0x016e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x0175  */
    /* JADX WARN: Code duplicated, block: B:124:0x017b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0184  */
    /* JADX WARN: Code duplicated, block: B:128:0x018a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0194  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:133:0x0199  */
    /* JADX WARN: Code duplicated, block: B:134:0x019b  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:153:0x022a  */
    /* JADX WARN: Code duplicated, block: B:154:0x022e  */
    /* JADX WARN: Code duplicated, block: B:157:0x023f  */
    /* JADX WARN: Code duplicated, block: B:159:0x024d  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0278  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:170:0x0306  */
    /* JADX WARN: Code duplicated, block: B:172:0x0340  */
    /* JADX WARN: Code duplicated, block: B:174:0x0348  */
    /* JADX WARN: Code duplicated, block: B:178:0x03de  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:187:0x040d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0434  */
    /* JADX WARN: Code duplicated, block: B:191:0x0488  */
    /* JADX WARN: Code duplicated, block: B:194:0x0496  */
    /* JADX WARN: Code duplicated, block: B:195:0x0499  */
    /* JADX WARN: Code duplicated, block: B:198:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:199:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:202:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:207:0x050d  */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@Nullable String str, float f, long j, @DrawableRes @Nullable Integer num, @DrawableRes @Nullable Integer num2, @Nullable Function0<Unit> function0, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        Integer numValueOf;
        int i4;
        Integer num3;
        int i5;
        int i6;
        Function0<Unit> function1;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        float f2;
        long j2;
        Integer num4;
        Function0<Unit> function2;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function6;
        Modifier modifier2;
        int i14;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function7;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function8;
        Modifier.Companion companion;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function9;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function10;
        int currentCompositeKeyHash;
        float f3;
        String str3;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        RowScopeInstance rowScopeInstance;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM1309constructorimpl2;
        Function2 function2OooO00o2;
        float f4;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function11;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function12;
        int i15;
        float f5;
        long j3;
        Integer num5;
        Function0<Unit> function13;
        String str4;
        Modifier modifier3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function14;
        Integer num6;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function15;
        float f6;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i16;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2006263186);
        int i17 = i2 & 1;
        if (i17 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
            }
            if ((i & 896) != 0) {
                i3 |= ((i2 & 4) == 0 || !composerStartRestartGroup.changed(j)) ? 128 : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if ((i & 7168) == 0) {
                if ((i2 & 8) == 0) {
                    numValueOf = num;
                    if (composerStartRestartGroup.changed(numValueOf)) {
                        i16 = 2048;
                    }
                    i3 |= i16;
                } else {
                    numValueOf = num;
                }
                i16 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                i3 |= i16;
            } else {
                numValueOf = num;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((57344 & i) == 0) {
                    num3 = num2;
                    if (composerStartRestartGroup.changed(num3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((458752 & i) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i11 = 8388608;
                        } else {
                            i11 = Configuration.BLOCK_SIZE;
                        }
                        i3 |= i11;
                    }
                    i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i12 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(modifier)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i3 |= i13;
                    }
                    if ((191739611 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i17 != 0) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            if (i18 != 0) {
                                f2 = 1.0f;
                            } else {
                                f2 = f;
                            }
                            if ((i2 & 4) != 0) {
                                j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                                i3 &= -897;
                            } else {
                                j2 = j;
                            }
                            if ((i2 & 8) != 0) {
                                numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                num4 = null;
                            } else {
                                num4 = num3;
                            }
                            if (i6 != 0) {
                                function2 = null;
                            } else {
                                function2 = function1;
                            }
                            if (i8 != 0) {
                                function5 = null;
                            } else {
                                function5 = function3;
                            }
                            if (i10 != 0) {
                                function6 = null;
                            } else {
                                function6 = function4;
                            }
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            i14 = i3;
                            function7 = function6;
                            function8 = function5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            str2 = str;
                            f2 = f;
                            j2 = j;
                            function8 = function3;
                            modifier2 = modifier;
                            i14 = i3;
                            num4 = num3;
                            function2 = function1;
                            function7 = function4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                        }
                        companion = Modifier.INSTANCE;
                        Modifier modifier4 = modifier2;
                        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        function9 = function7;
                        function10 = function8;
                        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        f3 = f2;
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        str3 = str2;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        rowScopeInstance = RowScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(-925610141);
                        if (numValueOf != null) {
                            f6 = 8;
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                            if (num4 == null) {
                                composerStartRestartGroup.startReplaceableGroup(-925610025);
                                Painter painterPainterResource = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                                Modifier modifierClip = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged2 = composerStartRestartGroup.changed(function2);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new OooO00o(function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                IconKt.m1103Iconww6aTOc(painterPainterResource, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-925609427);
                                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                                Modifier modifierClip2 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(function2);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new OooO0O0(function2);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                ImageKt.Image(painterPainterResource2, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip2, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                        Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        constructor2 = companion3.getConstructor();
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
                        composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                        function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        function3ModifierMaterializerOf2.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-346255791);
                        if (!StringsKt.isBlank(str3)) {
                            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                            f4 = f3;
                            TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                        } else {
                            f4 = f3;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-925608359);
                        if (function10 == null) {
                            function11 = function10;
                        } else {
                            function11 = function10;
                            function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                            Unit unit = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-925608322);
                        if (function9 == null) {
                            i15 = 6;
                            function12 = function9;
                        } else {
                            function12 = function9;
                            function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                            Unit unit2 = Unit.INSTANCE;
                            i15 = 6;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f5 = f4;
                        j3 = j2;
                        num5 = num4;
                        function13 = function2;
                        str4 = str3;
                        modifier3 = modifier4;
                        function14 = function12;
                        num6 = numValueOf;
                        function15 = function11;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        str4 = str;
                        f5 = f;
                        j3 = j;
                        function14 = function4;
                        num6 = numValueOf;
                        num5 = num3;
                        function13 = function1;
                        function15 = function3;
                        modifier3 = modifier;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str4, f5, j3, num6, num5, function13, function15, function14, modifier3, i, i2));
                }
                i3 |= 196608;
                function1 = function0;
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    } else {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifier5 = modifier2;
                    Modifier modifierM509height3ABfNKs2 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically3 = companion4.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    function9 = function7;
                    function10 = function8;
                    MeasurePolicy measurePolicyOooO00o3 = androidx.compose.material.OooO.OooO00o(arrangement2, centerVertically3, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    f3 = f2;
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    str3 = str2;
                    constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl, measurePolicyOooO00o3, composerM1309constructorimpl, currentCompositionLocalMap3);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-925610141);
                    if (numValueOf != null) {
                        f6 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                        if (num4 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-925610025);
                            Painter painterPainterResource3 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                            Modifier modifierClip3 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            IconKt.m1103Iconww6aTOc(painterPainterResource3, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip3, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-925609427);
                            Painter painterPainterResource4 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                            Modifier modifierClip4 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ImageKt.Image(painterPainterResource4, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip4, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Vertical centerVertically4 = companion4.getCenterVertically();
                    Modifier modifierOooO00o2 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o4 = androidx.compose.material.OooO.OooO00o(arrangement2, centerVertically4, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion5, composerM1309constructorimpl2, measurePolicyOooO00o4, composerM1309constructorimpl2, currentCompositionLocalMap4);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-346255791);
                    if (!StringsKt.isBlank(str3)) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        f4 = f3;
                        TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                    } else {
                        f4 = f3;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608359);
                    if (function10 == null) {
                        function11 = function10;
                    } else {
                        function11 = function10;
                        function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                        Unit unit3 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608322);
                    if (function9 == null) {
                        i15 = 6;
                        function12 = function9;
                    } else {
                        function12 = function9;
                        function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                        Unit unit4 = Unit.INSTANCE;
                        i15 = 6;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    num5 = num4;
                    function13 = function2;
                    str4 = str3;
                    modifier3 = modifier5;
                    function14 = function12;
                    num6 = numValueOf;
                    function15 = function11;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    } else {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifier6 = modifier2;
                    Modifier modifierM509height3ABfNKs3 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically5 = companion6.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement3 = Arrangement.INSTANCE;
                    function9 = function7;
                    function10 = function8;
                    MeasurePolicy measurePolicyOooO00o5 = androidx.compose.material.OooO.OooO00o(arrangement3, centerVertically5, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    f3 = f2;
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    str3 = str2;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion7, composerM1309constructorimpl, measurePolicyOooO00o5, composerM1309constructorimpl, currentCompositionLocalMap5);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-925610141);
                    if (numValueOf != null) {
                        f6 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                        if (num4 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-925610025);
                            Painter painterPainterResource5 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                            Modifier modifierClip5 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            IconKt.m1103Iconww6aTOc(painterPainterResource5, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip5, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-925609427);
                            Painter painterPainterResource6 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                            Modifier modifierClip6 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ImageKt.Image(painterPainterResource6, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip6, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Vertical centerVertically6 = companion6.getCenterVertically();
                    Modifier modifierOooO00o3 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o6 = androidx.compose.material.OooO.OooO00o(arrangement3, centerVertically6, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierOooO00o3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion7, composerM1309constructorimpl2, measurePolicyOooO00o6, composerM1309constructorimpl2, currentCompositionLocalMap6);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    function3ModifierMaterializerOf6.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-346255791);
                    if (!StringsKt.isBlank(str3)) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        f4 = f3;
                        TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                    } else {
                        f4 = f3;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608359);
                    if (function10 == null) {
                        function11 = function10;
                    } else {
                        function11 = function10;
                        function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                        Unit unit5 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608322);
                    if (function9 == null) {
                        i15 = 6;
                        function12 = function9;
                    } else {
                        function12 = function9;
                        function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                        Unit unit6 = Unit.INSTANCE;
                        i15 = 6;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    num5 = num4;
                    function13 = function2;
                    str4 = str3;
                    modifier3 = modifier6;
                    function14 = function12;
                    num6 = numValueOf;
                    function15 = function11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str4, f5, j3, num6, num5, function13, function15, function14, modifier3, i, i2));
            }
            i3 |= 24576;
            num3 = num2;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((458752 & i) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    } else {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifier7 = modifier2;
                    Modifier modifierM509height3ABfNKs4 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                    Alignment.Companion companion8 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically7 = companion8.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement4 = Arrangement.INSTANCE;
                    function9 = function7;
                    function10 = function8;
                    MeasurePolicy measurePolicyOooO00o7 = androidx.compose.material.OooO.OooO00o(arrangement4, centerVertically7, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    f3 = f2;
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    str3 = str2;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion9, composerM1309constructorimpl, measurePolicyOooO00o7, composerM1309constructorimpl, currentCompositionLocalMap7);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-925610141);
                    if (numValueOf != null) {
                        f6 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                        if (num4 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-925610025);
                            Painter painterPainterResource7 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                            Modifier modifierClip7 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            IconKt.m1103Iconww6aTOc(painterPainterResource7, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip7, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-925609427);
                            Painter painterPainterResource8 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                            Modifier modifierClip8 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ImageKt.Image(painterPainterResource8, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip8, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Vertical centerVertically8 = companion8.getCenterVertically();
                    Modifier modifierOooO00o4 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o8 = androidx.compose.material.OooO.OooO00o(arrangement4, centerVertically8, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierOooO00o4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion9, composerM1309constructorimpl2, measurePolicyOooO00o8, composerM1309constructorimpl2, currentCompositionLocalMap8);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    function3ModifierMaterializerOf8.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-346255791);
                    if (!StringsKt.isBlank(str3)) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        f4 = f3;
                        TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                    } else {
                        f4 = f3;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608359);
                    if (function10 == null) {
                        function11 = function10;
                    } else {
                        function11 = function10;
                        function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                        Unit unit7 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608322);
                    if (function9 == null) {
                        i15 = 6;
                        function12 = function9;
                    } else {
                        function12 = function9;
                        function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                        Unit unit8 = Unit.INSTANCE;
                        i15 = 6;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    num5 = num4;
                    function13 = function2;
                    str4 = str3;
                    modifier3 = modifier7;
                    function14 = function12;
                    num6 = numValueOf;
                    function15 = function11;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    } else {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifier8 = modifier2;
                    Modifier modifierM509height3ABfNKs5 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                    Alignment.Companion companion10 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically9 = companion10.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement5 = Arrangement.INSTANCE;
                    function9 = function7;
                    function10 = function8;
                    MeasurePolicy measurePolicyOooO00o9 = androidx.compose.material.OooO.OooO00o(arrangement5, centerVertically9, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    f3 = f2;
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    str3 = str2;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion11, composerM1309constructorimpl, measurePolicyOooO00o9, composerM1309constructorimpl, currentCompositionLocalMap9);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf9, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-925610141);
                    if (numValueOf != null) {
                        f6 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                        if (num4 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-925610025);
                            Painter painterPainterResource9 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                            Modifier modifierClip9 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            IconKt.m1103Iconww6aTOc(painterPainterResource9, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip9, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-925609427);
                            Painter painterPainterResource10 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                            Modifier modifierClip10 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ImageKt.Image(painterPainterResource10, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip10, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Vertical centerVertically10 = companion10.getCenterVertically();
                    Modifier modifierOooO00o5 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o10 = androidx.compose.material.OooO.OooO00o(arrangement5, centerVertically10, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierOooO00o5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion11, composerM1309constructorimpl2, measurePolicyOooO00o10, composerM1309constructorimpl2, currentCompositionLocalMap10);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    function3ModifierMaterializerOf10.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-346255791);
                    if (!StringsKt.isBlank(str3)) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        f4 = f3;
                        TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                    } else {
                        f4 = f3;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608359);
                    if (function10 == null) {
                        function11 = function10;
                    } else {
                        function11 = function10;
                        function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                        Unit unit9 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608322);
                    if (function9 == null) {
                        i15 = 6;
                        function12 = function9;
                    } else {
                        function12 = function9;
                        function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                        Unit unit10 = Unit.INSTANCE;
                        i15 = 6;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    num5 = num4;
                    function13 = function2;
                    str4 = str3;
                    modifier3 = modifier8;
                    function14 = function12;
                    num6 = numValueOf;
                    function15 = function11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str4, f5, j3, num6, num5, function13, function15, function14, modifier3, i, i2));
            }
            i3 |= 196608;
            function1 = function0;
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i11 = 8388608;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i3 |= i11;
            }
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                } else {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifier9 = modifier2;
                Modifier modifierM509height3ABfNKs6 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                Alignment.Companion companion12 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically11 = companion12.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement6 = Arrangement.INSTANCE;
                function9 = function7;
                function10 = function8;
                MeasurePolicy measurePolicyOooO00o11 = androidx.compose.material.OooO.OooO00o(arrangement6, centerVertically11, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                f3 = f2;
                ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                str3 = str2;
                constructor = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion13, composerM1309constructorimpl, measurePolicyOooO00o11, composerM1309constructorimpl, currentCompositionLocalMap11);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf11, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-925610141);
                if (numValueOf != null) {
                    f6 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                    if (num4 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-925610025);
                        Painter painterPainterResource11 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                        Modifier modifierClip11 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        IconKt.m1103Iconww6aTOc(painterPainterResource11, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip11, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-925609427);
                        Painter painterPainterResource12 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                        Modifier modifierClip12 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(painterPainterResource12, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip12, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Vertical centerVertically12 = companion12.getCenterVertically();
                Modifier modifierOooO00o6 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o12 = androidx.compose.material.OooO.OooO00o(arrangement6, centerVertically12, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierOooO00o6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion13, composerM1309constructorimpl2, measurePolicyOooO00o12, composerM1309constructorimpl2, currentCompositionLocalMap12);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                function3ModifierMaterializerOf12.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-346255791);
                if (!StringsKt.isBlank(str3)) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    f4 = f3;
                    TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                } else {
                    f4 = f3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608359);
                if (function10 == null) {
                    function11 = function10;
                } else {
                    function11 = function10;
                    function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                    Unit unit11 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608322);
                if (function9 == null) {
                    i15 = 6;
                    function12 = function9;
                } else {
                    function12 = function9;
                    function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                    Unit unit12 = Unit.INSTANCE;
                    i15 = 6;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                num5 = num4;
                function13 = function2;
                str4 = str3;
                modifier3 = modifier9;
                function14 = function12;
                num6 = numValueOf;
                function15 = function11;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                } else {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifier10 = modifier2;
                Modifier modifierM509height3ABfNKs7 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                Alignment.Companion companion14 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically13 = companion14.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement7 = Arrangement.INSTANCE;
                function9 = function7;
                function10 = function8;
                MeasurePolicy measurePolicyOooO00o13 = androidx.compose.material.OooO.OooO00o(arrangement7, centerVertically13, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                f3 = f2;
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                str3 = str2;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion15, composerM1309constructorimpl, measurePolicyOooO00o13, composerM1309constructorimpl, currentCompositionLocalMap13);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf13, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-925610141);
                if (numValueOf != null) {
                    f6 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                    if (num4 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-925610025);
                        Painter painterPainterResource13 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                        Modifier modifierClip13 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        IconKt.m1103Iconww6aTOc(painterPainterResource13, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip13, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-925609427);
                        Painter painterPainterResource14 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                        Modifier modifierClip14 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(painterPainterResource14, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip14, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Vertical centerVertically14 = companion14.getCenterVertically();
                Modifier modifierOooO00o7 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o14 = androidx.compose.material.OooO.OooO00o(arrangement7, centerVertically14, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierOooO00o7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion15, composerM1309constructorimpl2, measurePolicyOooO00o14, composerM1309constructorimpl2, currentCompositionLocalMap14);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                function3ModifierMaterializerOf14.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-346255791);
                if (!StringsKt.isBlank(str3)) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    f4 = f3;
                    TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                } else {
                    f4 = f3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608359);
                if (function10 == null) {
                    function11 = function10;
                } else {
                    function11 = function10;
                    function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                    Unit unit13 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608322);
                if (function9 == null) {
                    i15 = 6;
                    function12 = function9;
                } else {
                    function12 = function9;
                    function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                    Unit unit14 = Unit.INSTANCE;
                    i15 = 6;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                num5 = num4;
                function13 = function2;
                str4 = str3;
                modifier3 = modifier10;
                function14 = function12;
                num6 = numValueOf;
                function15 = function11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str4, f5, j3, num6, num5, function13, function15, function14, modifier3, i, i2));
        }
        i3 |= 48;
        if ((i & 896) != 0) {
            i3 |= ((i2 & 4) == 0 || !composerStartRestartGroup.changed(j)) ? 128 : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                numValueOf = num;
                if (composerStartRestartGroup.changed(numValueOf)) {
                    i16 = 2048;
                }
                i3 |= i16;
            } else {
                numValueOf = num;
            }
            i16 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            i3 |= i16;
        } else {
            numValueOf = num;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((57344 & i) == 0) {
                num3 = num2;
                if (composerStartRestartGroup.changed(num3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((458752 & i) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i11 = 8388608;
                    } else {
                        i11 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i11;
                }
                i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i12 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(modifier)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i3 |= i13;
                }
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    } else {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifier11 = modifier2;
                    Modifier modifierM509height3ABfNKs8 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                    Alignment.Companion companion16 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically15 = companion16.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement8 = Arrangement.INSTANCE;
                    function9 = function7;
                    function10 = function8;
                    MeasurePolicy measurePolicyOooO00o15 = androidx.compose.material.OooO.OooO00o(arrangement8, centerVertically15, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    f3 = f2;
                    ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                    str3 = str2;
                    constructor = companion17.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion17, composerM1309constructorimpl, measurePolicyOooO00o15, composerM1309constructorimpl, currentCompositionLocalMap15);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf15, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-925610141);
                    if (numValueOf != null) {
                        f6 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                        if (num4 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-925610025);
                            Painter painterPainterResource15 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                            Modifier modifierClip15 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            IconKt.m1103Iconww6aTOc(painterPainterResource15, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip15, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-925609427);
                            Painter painterPainterResource16 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                            Modifier modifierClip16 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ImageKt.Image(painterPainterResource16, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip16, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Vertical centerVertically16 = companion16.getCenterVertically();
                    Modifier modifierOooO00o8 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o16 = androidx.compose.material.OooO.OooO00o(arrangement8, centerVertically16, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap16 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion17.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierOooO00o8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion17, composerM1309constructorimpl2, measurePolicyOooO00o16, composerM1309constructorimpl2, currentCompositionLocalMap16);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    function3ModifierMaterializerOf16.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-346255791);
                    if (!StringsKt.isBlank(str3)) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        f4 = f3;
                        TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                    } else {
                        f4 = f3;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608359);
                    if (function10 == null) {
                        function11 = function10;
                    } else {
                        function11 = function10;
                        function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                        Unit unit15 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608322);
                    if (function9 == null) {
                        i15 = 6;
                        function12 = function9;
                    } else {
                        function12 = function9;
                        function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                        Unit unit16 = Unit.INSTANCE;
                        i15 = 6;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    num5 = num4;
                    function13 = function2;
                    str4 = str3;
                    modifier3 = modifier11;
                    function14 = function12;
                    num6 = numValueOf;
                    function15 = function11;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    } else {
                        if (i17 != 0) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (i18 != 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = f;
                        }
                        if ((i2 & 4) != 0) {
                            j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                            i3 &= -897;
                        } else {
                            j2 = j;
                        }
                        if ((i2 & 8) != 0) {
                            numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            num4 = null;
                        } else {
                            num4 = num3;
                        }
                        if (i6 != 0) {
                            function2 = null;
                        } else {
                            function2 = function1;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        } else {
                            function5 = function3;
                        }
                        if (i10 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        i14 = i3;
                        function7 = function6;
                        function8 = function5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifier12 = modifier2;
                    Modifier modifierM509height3ABfNKs9 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                    Alignment.Companion companion18 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically17 = companion18.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Arrangement arrangement9 = Arrangement.INSTANCE;
                    function9 = function7;
                    function10 = function8;
                    MeasurePolicy measurePolicyOooO00o17 = androidx.compose.material.OooO.OooO00o(arrangement9, centerVertically17, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap17 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    f3 = f2;
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    str3 = str2;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion19, composerM1309constructorimpl, measurePolicyOooO00o17, composerM1309constructorimpl, currentCompositionLocalMap17);
                    if (composerM1309constructorimpl.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf17, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    rowScopeInstance = RowScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-925610141);
                    if (numValueOf != null) {
                        f6 = 8;
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                        if (num4 == null) {
                            composerStartRestartGroup.startReplaceableGroup(-925610025);
                            Painter painterPainterResource17 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                            Modifier modifierClip17 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged2 = composerStartRestartGroup.changed(function2);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2) {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                objRememberedValue2 = new OooO00o(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            IconKt.m1103Iconww6aTOc(painterPainterResource17, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip17, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-925609427);
                            Painter painterPainterResource18 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                            Modifier modifierClip18 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function2);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                objRememberedValue = new OooO0O0(function2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            ImageKt.Image(painterPainterResource18, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip18, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Alignment.Vertical centerVertically18 = companion18.getCenterVertically();
                    Modifier modifierOooO00o9 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyOooO00o18 = androidx.compose.material.OooO.OooO00o(arrangement9, centerVertically18, composerStartRestartGroup, 48, -1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierOooO00o9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion19, composerM1309constructorimpl2, measurePolicyOooO00o18, composerM1309constructorimpl2, currentCompositionLocalMap18);
                    if (composerM1309constructorimpl2.getInserting()) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    } else {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                    }
                    function3ModifierMaterializerOf18.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-346255791);
                    if (!StringsKt.isBlank(str3)) {
                        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                        f4 = f3;
                        TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                    } else {
                        f4 = f3;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608359);
                    if (function10 == null) {
                        function11 = function10;
                    } else {
                        function11 = function10;
                        function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                        Unit unit17 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-925608322);
                    if (function9 == null) {
                        i15 = 6;
                        function12 = function9;
                    } else {
                        function12 = function9;
                        function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                        Unit unit18 = Unit.INSTANCE;
                        i15 = 6;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f4;
                    j3 = j2;
                    num5 = num4;
                    function13 = function2;
                    str4 = str3;
                    modifier3 = modifier12;
                    function14 = function12;
                    num6 = numValueOf;
                    function15 = function11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str4, f5, j3, num6, num5, function13, function15, function14, modifier3, i, i2));
            }
            i3 |= 196608;
            function1 = function0;
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i11 = 8388608;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i3 |= i11;
            }
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                } else {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifier13 = modifier2;
                Modifier modifierM509height3ABfNKs10 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                Alignment.Companion companion110 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically19 = companion110.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement10 = Arrangement.INSTANCE;
                function9 = function7;
                function10 = function8;
                MeasurePolicy measurePolicyOooO00o19 = androidx.compose.material.OooO.OooO00o(arrangement10, centerVertically19, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap19 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                f3 = f2;
                ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                str3 = str2;
                constructor = companion111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion111, composerM1309constructorimpl, measurePolicyOooO00o19, composerM1309constructorimpl, currentCompositionLocalMap19);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf19, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-925610141);
                if (numValueOf != null) {
                    f6 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                    if (num4 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-925610025);
                        Painter painterPainterResource19 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                        Modifier modifierClip19 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        IconKt.m1103Iconww6aTOc(painterPainterResource19, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip19, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-925609427);
                        Painter painterPainterResource110 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                        Modifier modifierClip110 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(painterPainterResource110, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip110, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Vertical centerVertically110 = companion110.getCenterVertically();
                Modifier modifierOooO00o10 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o110 = androidx.compose.material.OooO.OooO00o(arrangement10, centerVertically110, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion111.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierOooO00o10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion111, composerM1309constructorimpl2, measurePolicyOooO00o110, composerM1309constructorimpl2, currentCompositionLocalMap110);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                function3ModifierMaterializerOf110.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-346255791);
                if (!StringsKt.isBlank(str3)) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    f4 = f3;
                    TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                } else {
                    f4 = f3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608359);
                if (function10 == null) {
                    function11 = function10;
                } else {
                    function11 = function10;
                    function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                    Unit unit19 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608322);
                if (function9 == null) {
                    i15 = 6;
                    function12 = function9;
                } else {
                    function12 = function9;
                    function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                    Unit unit110 = Unit.INSTANCE;
                    i15 = 6;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                num5 = num4;
                function13 = function2;
                str4 = str3;
                modifier3 = modifier13;
                function14 = function12;
                num6 = numValueOf;
                function15 = function11;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                } else {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifier14 = modifier2;
                Modifier modifierM509height3ABfNKs11 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                Alignment.Companion companion112 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically111 = companion112.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement11 = Arrangement.INSTANCE;
                function9 = function7;
                function10 = function8;
                MeasurePolicy measurePolicyOooO00o111 = androidx.compose.material.OooO.OooO00o(arrangement11, centerVertically111, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap111 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                f3 = f2;
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                str3 = str2;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion113, composerM1309constructorimpl, measurePolicyOooO00o111, composerM1309constructorimpl, currentCompositionLocalMap111);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf111, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-925610141);
                if (numValueOf != null) {
                    f6 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                    if (num4 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-925610025);
                        Painter painterPainterResource111 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                        Modifier modifierClip111 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        IconKt.m1103Iconww6aTOc(painterPainterResource111, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip111, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-925609427);
                        Painter painterPainterResource112 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                        Modifier modifierClip112 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(painterPainterResource112, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip112, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Vertical centerVertically112 = companion112.getCenterVertically();
                Modifier modifierOooO00o11 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o112 = androidx.compose.material.OooO.OooO00o(arrangement11, centerVertically112, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierOooO00o11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion113, composerM1309constructorimpl2, measurePolicyOooO00o112, composerM1309constructorimpl2, currentCompositionLocalMap112);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                function3ModifierMaterializerOf112.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-346255791);
                if (!StringsKt.isBlank(str3)) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    f4 = f3;
                    TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                } else {
                    f4 = f3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608359);
                if (function10 == null) {
                    function11 = function10;
                } else {
                    function11 = function10;
                    function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                    Unit unit111 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608322);
                if (function9 == null) {
                    i15 = 6;
                    function12 = function9;
                } else {
                    function12 = function9;
                    function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                    Unit unit112 = Unit.INSTANCE;
                    i15 = 6;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                num5 = num4;
                function13 = function2;
                str4 = str3;
                modifier3 = modifier14;
                function14 = function12;
                num6 = numValueOf;
                function15 = function11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str4, f5, j3, num6, num5, function13, function15, function14, modifier3, i, i2));
        }
        i3 |= 24576;
        num3 = num2;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((458752 & i) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i11 = 8388608;
                } else {
                    i11 = Configuration.BLOCK_SIZE;
                }
                i3 |= i11;
            }
            i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i12 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(modifier)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i3 |= i13;
            }
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                } else {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifier15 = modifier2;
                Modifier modifierM509height3ABfNKs12 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                Alignment.Companion companion114 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically113 = companion114.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement12 = Arrangement.INSTANCE;
                function9 = function7;
                function10 = function8;
                MeasurePolicy measurePolicyOooO00o113 = androidx.compose.material.OooO.OooO00o(arrangement12, centerVertically113, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                f3 = f2;
                ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                str3 = str2;
                constructor = companion115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion115, composerM1309constructorimpl, measurePolicyOooO00o113, composerM1309constructorimpl, currentCompositionLocalMap113);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf113, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-925610141);
                if (numValueOf != null) {
                    f6 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                    if (num4 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-925610025);
                        Painter painterPainterResource113 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                        Modifier modifierClip113 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        IconKt.m1103Iconww6aTOc(painterPainterResource113, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip113, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-925609427);
                        Painter painterPainterResource114 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                        Modifier modifierClip114 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(painterPainterResource114, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip114, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Vertical centerVertically114 = companion114.getCenterVertically();
                Modifier modifierOooO00o12 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o114 = androidx.compose.material.OooO.OooO00o(arrangement12, centerVertically114, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap114 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierOooO00o12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion115, composerM1309constructorimpl2, measurePolicyOooO00o114, composerM1309constructorimpl2, currentCompositionLocalMap114);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                function3ModifierMaterializerOf114.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-346255791);
                if (!StringsKt.isBlank(str3)) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    f4 = f3;
                    TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                } else {
                    f4 = f3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608359);
                if (function10 == null) {
                    function11 = function10;
                } else {
                    function11 = function10;
                    function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                    Unit unit113 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608322);
                if (function9 == null) {
                    i15 = 6;
                    function12 = function9;
                } else {
                    function12 = function9;
                    function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                    Unit unit114 = Unit.INSTANCE;
                    i15 = 6;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                num5 = num4;
                function13 = function2;
                str4 = str3;
                modifier3 = modifier15;
                function14 = function12;
                num6 = numValueOf;
                function15 = function11;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                } else {
                    if (i17 != 0) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    if (i18 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                        i3 &= -897;
                    } else {
                        j2 = j;
                    }
                    if ((i2 & 8) != 0) {
                        numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        num4 = null;
                    } else {
                        num4 = num3;
                    }
                    if (i6 != 0) {
                        function2 = null;
                    } else {
                        function2 = function1;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function3;
                    }
                    if (i10 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    i14 = i3;
                    function7 = function6;
                    function8 = function5;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifier16 = modifier2;
                Modifier modifierM509height3ABfNKs13 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
                Alignment.Companion companion116 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically115 = companion116.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Arrangement arrangement13 = Arrangement.INSTANCE;
                function9 = function7;
                function10 = function8;
                MeasurePolicy measurePolicyOooO00o115 = androidx.compose.material.OooO.OooO00o(arrangement13, centerVertically115, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap115 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                f3 = f2;
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                str3 = str2;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion117, composerM1309constructorimpl, measurePolicyOooO00o115, composerM1309constructorimpl, currentCompositionLocalMap115);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf115, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-925610141);
                if (numValueOf != null) {
                    f6 = 8;
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                    if (num4 == null) {
                        composerStartRestartGroup.startReplaceableGroup(-925610025);
                        Painter painterPainterResource115 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                        Modifier modifierClip115 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged2 = composerStartRestartGroup.changed(function2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            objRememberedValue2 = new OooO00o(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        IconKt.m1103Iconww6aTOc(painterPainterResource115, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip115, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-925609427);
                        Painter painterPainterResource116 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                        Modifier modifierClip116 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new OooO0O0(function2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        ImageKt.Image(painterPainterResource116, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip116, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                Alignment.Vertical centerVertically116 = companion116.getCenterVertically();
                Modifier modifierOooO00o13 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o116 = androidx.compose.material.OooO.OooO00o(arrangement13, centerVertically116, composerStartRestartGroup, 48, -1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierOooO00o13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion117, composerM1309constructorimpl2, measurePolicyOooO00o116, composerM1309constructorimpl2, currentCompositionLocalMap116);
                if (composerM1309constructorimpl2.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                function3ModifierMaterializerOf116.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-346255791);
                if (!StringsKt.isBlank(str3)) {
                    com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                    f4 = f3;
                    TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
                } else {
                    f4 = f3;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608359);
                if (function10 == null) {
                    function11 = function10;
                } else {
                    function11 = function10;
                    function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                    Unit unit115 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-925608322);
                if (function9 == null) {
                    i15 = 6;
                    function12 = function9;
                } else {
                    function12 = function9;
                    function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                    Unit unit116 = Unit.INSTANCE;
                    i15 = 6;
                }
                composerStartRestartGroup.endReplaceableGroup();
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = f4;
                j3 = j2;
                num5 = num4;
                function13 = function2;
                str4 = str3;
                modifier3 = modifier16;
                function14 = function12;
                num6 = numValueOf;
                function15 = function11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str4, f5, j3, num6, num5, function13, function15, function14, modifier3, i, i2));
        }
        i3 |= 196608;
        function1 = function0;
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        i10 = i2 & 128;
        if (i10 != 0) {
            i3 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i11 = 8388608;
            } else {
                i11 = Configuration.BLOCK_SIZE;
            }
            i3 |= i11;
        }
        i12 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i12 != 0) {
            i3 |= 100663296;
        } else if ((i & 234881024) == 0) {
            if (composerStartRestartGroup.changed(modifier)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i3 |= i13;
        }
        if ((191739611 & i3) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i18 != 0) {
                    f2 = 1.0f;
                } else {
                    f2 = f;
                }
                if ((i2 & 4) != 0) {
                    j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                    i3 &= -897;
                } else {
                    j2 = j;
                }
                if ((i2 & 8) != 0) {
                    numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    num4 = null;
                } else {
                    num4 = num3;
                }
                if (i6 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i8 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i10 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                i14 = i3;
                function7 = function6;
                function8 = function5;
            } else {
                if (i17 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i18 != 0) {
                    f2 = 1.0f;
                } else {
                    f2 = f;
                }
                if ((i2 & 4) != 0) {
                    j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                    i3 &= -897;
                } else {
                    j2 = j;
                }
                if ((i2 & 8) != 0) {
                    numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    num4 = null;
                } else {
                    num4 = num3;
                }
                if (i6 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i8 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i10 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                i14 = i3;
                function7 = function6;
                function8 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifier17 = modifier2;
            Modifier modifierM509height3ABfNKs14 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
            Alignment.Companion companion118 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically117 = companion118.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement14 = Arrangement.INSTANCE;
            function9 = function7;
            function10 = function8;
            MeasurePolicy measurePolicyOooO00o117 = androidx.compose.material.OooO.OooO00o(arrangement14, centerVertically117, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap117 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            f3 = f2;
            ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
            str3 = str2;
            constructor = companion119.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion119, composerM1309constructorimpl, measurePolicyOooO00o117, composerM1309constructorimpl, currentCompositionLocalMap117);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf117, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-925610141);
            if (numValueOf != null) {
                f6 = 8;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                if (num4 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-925610025);
                    Painter painterPainterResource117 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                    Modifier modifierClip117 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO00o(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO00o(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    IconKt.m1103Iconww6aTOc(painterPainterResource117, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip117, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-925609427);
                    Painter painterPainterResource118 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                    Modifier modifierClip118 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(painterPainterResource118, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip118, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            Alignment.Vertical centerVertically118 = companion118.getCenterVertically();
            Modifier modifierOooO00o14 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o118 = androidx.compose.material.OooO.OooO00o(arrangement14, centerVertically118, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap118 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion119.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierOooO00o14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion119, composerM1309constructorimpl2, measurePolicyOooO00o118, composerM1309constructorimpl2, currentCompositionLocalMap118);
            if (composerM1309constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            function3ModifierMaterializerOf118.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-346255791);
            if (!StringsKt.isBlank(str3)) {
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                f4 = f3;
                TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
            } else {
                f4 = f3;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-925608359);
            if (function10 == null) {
                function11 = function10;
            } else {
                function11 = function10;
                function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                Unit unit117 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-925608322);
            if (function9 == null) {
                i15 = 6;
                function12 = function9;
            } else {
                function12 = function9;
                function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                Unit unit118 = Unit.INSTANCE;
                i15 = 6;
            }
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = f4;
            j3 = j2;
            num5 = num4;
            function13 = function2;
            str4 = str3;
            modifier3 = modifier17;
            function14 = function12;
            num6 = numValueOf;
            function15 = function11;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i18 != 0) {
                    f2 = 1.0f;
                } else {
                    f2 = f;
                }
                if ((i2 & 4) != 0) {
                    j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                    i3 &= -897;
                } else {
                    j2 = j;
                }
                if ((i2 & 8) != 0) {
                    numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    num4 = null;
                } else {
                    num4 = num3;
                }
                if (i6 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i8 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i10 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                i14 = i3;
                function7 = function6;
                function8 = function5;
            } else {
                if (i17 != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i18 != 0) {
                    f2 = 1.0f;
                } else {
                    f2 = f;
                }
                if ((i2 & 4) != 0) {
                    j2 = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
                    i3 &= -897;
                } else {
                    j2 = j;
                }
                if ((i2 & 8) != 0) {
                    numValueOf = Integer.valueOf(oOo00OO0.icv_arrow_back);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    num4 = null;
                } else {
                    num4 = num3;
                }
                if (i6 != 0) {
                    function2 = null;
                } else {
                    function2 = function1;
                }
                if (i8 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                if (i10 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                i14 = i3;
                function7 = function6;
                function8 = function5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2006263186, i14, -1, "com.yalla.yalla.ui.composable.common.Toolbar (Toolbar.kt:40)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifier18 = modifier2;
            Modifier modifierM509height3ABfNKs15 = SizeKt.m509height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(companion.then(modifier2), 0.0f, 1, null)), Dp.m3765constructorimpl(50));
            Alignment.Companion companion1110 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically119 = companion1110.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Arrangement arrangement15 = Arrangement.INSTANCE;
            function9 = function7;
            function10 = function8;
            MeasurePolicy measurePolicyOooO00o119 = androidx.compose.material.OooO.OooO00o(arrangement15, centerVertically119, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap119 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            f3 = f2;
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            str3 = str2;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierM509height3ABfNKs15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion1111, composerM1309constructorimpl, measurePolicyOooO00o119, composerM1309constructorimpl, currentCompositionLocalMap119);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf119, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-925610141);
            if (numValueOf != null) {
                f6 = 8;
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f6), null, composerStartRestartGroup, 6, 2);
                if (num4 == null) {
                    composerStartRestartGroup.startReplaceableGroup(-925610025);
                    Painter painterPainterResource119 = PainterResources_androidKt.painterResource(numValueOf.intValue(), composerStartRestartGroup, (i14 >> 9) & 14);
                    Modifier modifierClip119 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged2 = composerStartRestartGroup.changed(function2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        objRememberedValue2 = new OooO00o(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = new OooO00o(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    IconKt.m1103Iconww6aTOc(painterPainterResource119, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip119, false, null, null, (Function0) objRememberedValue2, 7, null), Dp.m3765constructorimpl(f6)), j2, composerStartRestartGroup, ((i14 << 3) & 7168) | 56, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-925609427);
                    Painter painterPainterResource1110 = PainterResources_androidKt.painterResource(num4.intValue(), composerStartRestartGroup, (i14 >> 12) & 14);
                    Modifier modifierClip1110 = ClipKt.clip(o0O0O00.OooO0Oo(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(40)), composerStartRestartGroup, 6), RoundedCornerShapeKt.getCircleShape());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new OooO0O0(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new OooO0O0(function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ImageKt.Image(painterPainterResource1110, (String) null, PaddingKt.m476padding3ABfNKs(ClickableKt.m202clickableXHw0xAI$default(modifierClip1110, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m3765constructorimpl(f6)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            Alignment.Vertical centerVertically1110 = companion1110.getCenterVertically();
            Modifier modifierOooO00o15 = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o1110 = androidx.compose.material.OooO.OooO00o(arrangement15, centerVertically1110, composerStartRestartGroup, 48, -1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierOooO00o15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion1111, composerM1309constructorimpl2, measurePolicyOooO00o1110, composerM1309constructorimpl2, currentCompositionLocalMap1110);
            if (composerM1309constructorimpl2.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            function3ModifierMaterializerOf1110.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-346255791);
            if (!StringsKt.isBlank(str3)) {
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
                f4 = f3;
                TextKt.m1251Text4IGK_g(str3, AlphaKt.alpha(companion, RangesKt.coerceIn(f4, 0.0f, 1.0f)), j2, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i14 & 14) | 3072 | (i14 & 896), 3120, 120816);
            } else {
                f4 = f3;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-925608359);
            if (function10 == null) {
                function11 = function10;
            } else {
                function11 = function10;
                function11.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 15) & 112) | 6));
                Unit unit119 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-925608322);
            if (function9 == null) {
                i15 = 6;
                function12 = function9;
            } else {
                function12 = function9;
                function12.invoke(rowScopeInstance, composerStartRestartGroup, Integer.valueOf(((i14 >> 18) & 112) | 6));
                Unit unit1110 = Unit.INSTANCE;
                i15 = 6;
            }
            composerStartRestartGroup.endReplaceableGroup();
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(8), null, composerStartRestartGroup, i15, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = f4;
            j3 = j2;
            num5 = num4;
            function13 = function2;
            str4 = str3;
            modifier3 = modifier18;
            function14 = function12;
            num6 = numValueOf;
            function15 = function11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(str4, f5, j3, num6, num5, function13, function15, function14, modifier3, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull Painter painter, long j, boolean z, @NotNull Function0<Unit> onClick, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-608251847);
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-608251847, i, -1, "com.yalla.yalla.ui.composable.common.ToolbarImageMenu (Toolbar.kt:133)");
        }
        Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(36)), Dp.m3765constructorimpl(6));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(onClick);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new OooO0o(onClick);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        IconKt.m1103Iconww6aTOc(painter, (String) null, o0O0O00.OooO0O0(modifierM476padding3ABfNKs, z2, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), j, composerStartRestartGroup, ((i << 6) & 7168) | 56, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(painter, j, z2, onClick, i, i2));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(int i, boolean z, @NotNull Function0<Unit> onClick, @Nullable Composer composer, int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(843332798);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 == 0) {
            if ((i2 & 112) == 0) {
                z2 = z;
                i4 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i3 & 4) != 0) {
                i4 |= 384;
            } else if ((i2 & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i4 |= i5;
            }
            if ((i4 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(843332798, i4, -1, "com.yalla.yalla.ui.composable.common.ToolbarImageMenu2 (Toolbar.kt:153)");
                }
                Painter painterPainterResource = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14);
                Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(36)), Dp.m3765constructorimpl(6));
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooOO0(onClick);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0O0(modifierM476padding3ABfNKs, z3, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(i, z3, onClick, i2, i3));
        }
        i4 |= 48;
        z2 = z;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(onClick)) {
                i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else {
                i5 = 128;
            }
            i4 |= i5;
        }
        if ((i4 & 731) == 146) {
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(843332798, i4, -1, "com.yalla.yalla.ui.composable.common.ToolbarImageMenu2 (Toolbar.kt:153)");
            }
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14);
            Modifier modifierM476padding3ABfNKs2 = PaddingKt.m476padding3ABfNKs(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(36)), Dp.m3765constructorimpl(6));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(onClick);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooOO0(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooOO0(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(painterPainterResource2, (String) null, o0O0O00.OooO0O0(modifierM476padding3ABfNKs2, z3, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(843332798, i4, -1, "com.yalla.yalla.ui.composable.common.ToolbarImageMenu2 (Toolbar.kt:153)");
            }
            Painter painterPainterResource3 = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14);
            Modifier modifierM476padding3ABfNKs3 = PaddingKt.m476padding3ABfNKs(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(36)), Dp.m3765constructorimpl(6));
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(onClick);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooOO0(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooOO0(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(painterPainterResource3, (String) null, o0O0O00.OooO0O0(modifierM476padding3ABfNKs3, z3, false, 0L, false, null, null, null, (Function0) objRememberedValue, 252), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(i, z3, onClick, i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x012a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x0151  */
    /* JADX WARN: Code duplicated, block: B:67:0x0154  */
    /* JADX WARN: Code duplicated, block: B:70:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:0x019a  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(@NotNull String text, boolean z, @NotNull Function0<Unit> onClick, @Nullable Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        long j;
        Composer composer2;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1799162226);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i3;
            if ((i5 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1799162226, i5, -1, "com.yalla.yalla.ui.composable.common.ToolbarTextMenu (Toolbar.kt:112)");
                }
                Alignment center = Alignment.INSTANCE.getCenter();
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooOOO0(onClick);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO00o = o0oOO.OooO00o(8, o0O0O00.OooO0O0(modifierFillMaxHeight$default, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 2, null, composerStartRestartGroup, 733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i7 = o0oO0O0o.f47152o00OOOo;
                if (z3) {
                    j = o0oO0O0o.f46946OooO0O0;
                } else {
                    j = o0oO0O0o.f46958OooOOOO;
                }
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(text, (Modifier) null, j, o0000O0.OooO0OO(16, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i5 & 14, 0, 131058);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i, i2, text, onClick, z4));
        }
        i3 |= 48;
        z2 = z;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(onClick)) {
                i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i3;
        if ((i5 & 731) == 146) {
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1799162226, i5, -1, "com.yalla.yalla.ui.composable.common.ToolbarTextMenu (Toolbar.kt:112)");
            }
            Alignment center2 = Alignment.INSTANCE.getCenter();
            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(onClick);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooOOO0(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooOOO0(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO00o2 = o0oOO.OooO00o(8, o0O0O00.OooO0O0(modifierFillMaxHeight$default2, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 2, null, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM1309constructorimpl, currentCompositionLocalMap2);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i8 = o0oO0O0o.f47152o00OOOo;
            if (z3) {
                j = o0oO0O0o.f46946OooO0O0;
            } else {
                j = o0oO0O0o.f46958OooOOOO;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(text, (Modifier) null, j, o0000O0.OooO0OO(16, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i5 & 14, 0, 131058);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            z4 = z3;
        } else {
            if (i6 != 0) {
                z3 = true;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1799162226, i5, -1, "com.yalla.yalla.ui.composable.common.ToolbarTextMenu (Toolbar.kt:112)");
            }
            Alignment center3 = Alignment.INSTANCE.getCenter();
            Modifier modifierFillMaxHeight$default3 = SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(onClick);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooOOO0(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooOOO0(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO00o3 = o0oOO.OooO00o(8, o0O0O00.OooO0O0(modifierFillMaxHeight$default3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 2, null, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM1309constructorimpl, currentCompositionLocalMap3);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            int i9 = o0oO0O0o.f47152o00OOOo;
            if (z3) {
                j = o0oO0O0o.f46946OooO0O0;
            } else {
                j = o0oO0O0o.f46958OooOOOO;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(text, (Modifier) null, j, o0000O0.OooO0OO(16, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i5 & 14, 0, 131058);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            z4 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(i, i2, text, onClick, z4));
    }
}
