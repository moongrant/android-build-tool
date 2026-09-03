package p230o00oOo0o;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPagerIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerIndicator.kt\ncom/google/accompanist/pager/PagerIndicatorKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,434:1\n76#2:435\n76#2:444\n76#2:453\n76#2:455\n76#2:457\n76#2:464\n76#2:498\n76#2:534\n76#2:543\n76#2:552\n76#2:554\n76#2:555\n76#2:562\n76#2:596\n154#3:436\n154#3:445\n154#3:454\n154#3:535\n154#3:544\n154#3:553\n36#4:437\n36#4:446\n460#4,13:476\n460#4,13:510\n473#4,3:524\n473#4,3:529\n36#4:536\n36#4:545\n460#4,13:574\n460#4,13:608\n473#4,3:622\n473#4,3:627\n1114#5,6:438\n1114#5,6:447\n1114#5,6:537\n1114#5,6:546\n1#6:456\n68#7,5:458\n73#7:489\n77#7:533\n68#7,5:556\n73#7:587\n77#7:631\n75#8:463\n76#8,11:465\n75#8:497\n76#8,11:499\n89#8:527\n89#8:532\n75#8:561\n76#8,11:563\n75#8:595\n76#8,11:597\n89#8:625\n89#8:630\n74#9,7:490\n81#9:523\n85#9:528\n73#10,7:588\n80#10:621\n84#10:626\n*S KotlinDebug\n*F\n+ 1 PagerIndicator.kt\ncom/google/accompanist/pager/PagerIndicatorKt\n*L\n82#1:435\n146#1:444\n182#1:453\n190#1:455\n191#1:457\n193#1:464\n197#1:498\n278#1:534\n340#1:543\n376#1:552\n384#1:554\n385#1:555\n387#1:562\n391#1:596\n84#1:436\n148#1:445\n184#1:454\n280#1:535\n342#1:544\n378#1:553\n89#1:437\n153#1:446\n193#1:476,13\n197#1:510,13\n197#1:524,3\n193#1:529,3\n285#1:536\n347#1:545\n387#1:574,13\n391#1:608,13\n391#1:622,3\n387#1:627,3\n89#1:438,6\n153#1:447,6\n285#1:537,6\n347#1:546,6\n193#1:458,5\n193#1:489\n193#1:533\n387#1:556,5\n387#1:587\n387#1:631\n193#1:463\n193#1:465,11\n197#1:497\n197#1:499,11\n197#1:527\n193#1:532\n387#1:561\n387#1:563,11\n391#1:595\n391#1:597,11\n391#1:625\n387#1:630\n197#1:490,7\n197#1:523\n197#1:528\n391#1:588,7\n391#1:621\n391#1:626\n*E\n"})
public final class oo0o0Oo {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ long f39793OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000000O f39794OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f39795OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f39796OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f39797OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f39798OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ float f39799OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f39800OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ float f39801OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f39802OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Shape f39803OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f39804OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(o000000O o000000o2, int i, Modifier modifier, Function1<? super Integer, Integer> function1, long j, long j2, float f, float f2, float f3, Shape shape, int i2, int i3) {
            super(2);
            this.f39794OooO0Oo = o000000o2;
            this.f39796OooO0o0 = i;
            this.f39795OooO0o = modifier;
            this.f39797OooO0oO = function1;
            this.f39798OooO0oo = j;
            this.f39793OooO = j2;
            this.f39799OooOO0 = f;
            this.f39800OooOO0O = f2;
            this.f39801OooOO0o = f3;
            this.f39803OooOOO0 = shape;
            this.f39802OooOOO = i2;
            this.f39804OooOOOO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oo0o0Oo.OooO0O0(this.f39794OooO0Oo, this.f39796OooO0o0, this.f39795OooO0o, this.f39797OooO0oO, this.f39798OooO0oo, this.f39793OooO, this.f39799OooOO0, this.f39800OooOO0O, this.f39801OooOO0o, this.f39803OooOOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39802OooOOO | 1), this.f39804OooOOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f39805OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ long f39806OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000000 f39807OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f39808OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f39809OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f39810OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f39811OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ float f39812OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ float f39813OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ float f39814OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ int f39815OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Shape f39816OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f39817OooOOOO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(o000000 o000000Var, Modifier modifier, int i, Function1<? super Integer, Integer> function1, long j, long j2, float f, float f2, float f3, Shape shape, int i2, int i3) {
            super(2);
            this.f39807OooO0Oo = o000000Var;
            this.f39809OooO0o0 = modifier;
            this.f39808OooO0o = i;
            this.f39810OooO0oO = function1;
            this.f39811OooO0oo = j;
            this.f39806OooO = j2;
            this.f39812OooOO0 = f;
            this.f39813OooOO0O = f2;
            this.f39814OooOO0o = f3;
            this.f39816OooOOO0 = shape;
            this.f39815OooOOO = i2;
            this.f39817OooOOOO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oo0o0Oo.OooO00o(this.f39807OooO0Oo, this.f39809OooO0o0, this.f39808OooO0o, this.f39810OooO0oO, this.f39811OooO0oo, this.f39806OooO, this.f39812OooOO0, this.f39813OooOO0O, this.f39814OooOO0o, this.f39816OooOOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39815OooOOO | 1), this.f39817OooOOOO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f39818OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Density, IntOffset> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f39819OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f39820OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000000O f39821OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f39822OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f39823OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Function1<? super Integer, Integer> function1, o000000O o000000o2, int i, int i2, int i3) {
            super(1);
            this.f39819OooO0Oo = function1;
            this.f39821OooO0o0 = o000000o2;
            this.f39820OooO0o = i;
            this.f39822OooO0oO = i2;
            this.f39823OooO0oo = i3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final IntOffset invoke(Density density) {
            Density offset = density;
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            o000000O o000000o2 = this.f39821OooO0o0;
            Integer numValueOf = Integer.valueOf(o000000o2.OooO00o());
            Function1<Integer, Integer> function1 = this.f39819OooO0Oo;
            int iIntValue = function1.invoke(numValueOf).intValue();
            float fOooO0O0 = o000000o2.OooO0O0();
            return IntOffset.m3884boximpl(IntOffsetKt.IntOffset((int) ((this.f39822OooO0oO + this.f39823OooO0oo) * RangesKt.coerceIn((Math.abs(fOooO0O0) * (function1.invoke(Integer.valueOf(o000000o2.OooO00o() + ((int) Math.signum(fOooO0O0)))).intValue() - iIntValue)) + iIntValue, 0.0f, RangesKt.coerceAtLeast(this.f39820OooO0o - 1, 0))), 0));
        }
    }

    public static final class OooOO0 implements o000000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o000000 f39824OooO00o;

        public OooOO0(o000000 o000000Var) {
            this.f39824OooO00o = o000000Var;
        }

        @Override // p230o00oOo0o.o000000O
        public final int OooO00o() {
            return this.f39824OooO00o.OooO0oO();
        }

        @Override // p230o00oOo0o.o000000O
        public final float OooO0O0() {
            return this.f39824OooO00o.OooO0OO();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0119  */
    /* JADX WARN: Code duplicated, block: B:103:0x011d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:112:0x013b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0151  */
    /* JADX WARN: Code duplicated, block: B:118:0x015e  */
    /* JADX WARN: Code duplicated, block: B:140:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:158:0x020a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0212  */
    /* JADX WARN: Code duplicated, block: B:162:0x0217  */
    /* JADX WARN: Code duplicated, block: B:165:0x0220  */
    /* JADX WARN: Code duplicated, block: B:166:0x0227  */
    /* JADX WARN: Code duplicated, block: B:169:0x022e  */
    /* JADX WARN: Code duplicated, block: B:170:0x023d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0249  */
    /* JADX WARN: Code duplicated, block: B:174:0x0255  */
    /* JADX WARN: Code duplicated, block: B:177:0x0267  */
    /* JADX WARN: Code duplicated, block: B:179:0x026f  */
    /* JADX WARN: Code duplicated, block: B:182:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:187:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0111  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "\n   HorizontalPagerIndicator for accompanist Pagers are deprecated, please use the version that takes \n   androidx.compose.foundation.pager.PagerState instead\nFor more migration information, please visit https://google.github.io/accompanist/pager/#migration\n")
    @Composable
    public static final void OooO00o(@NotNull o000000 pagerState, @Nullable Modifier modifier, int i, @Nullable Function1<? super Integer, Integer> function1, long j, long j2, float f, float f2, float f3, @Nullable Shape shape, @Nullable Composer composer, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Function1<? super Integer, Integer> function2;
        int i7;
        long jM1680copywmQWz5c$default;
        int i8;
        float f4;
        int i9;
        float f5;
        Modifier modifier2;
        int iOooO0o;
        Function1<? super Integer, Integer> function3;
        long jM1680copywmQWz5c$default2;
        float fM3775constructorimpl;
        int i10;
        float f6;
        int i11;
        Shape circleShape;
        boolean zChanged;
        Object objRememberedValue;
        Shape shape2;
        float f7;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1678773673);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 == 0) {
            if ((i2 & 112) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0) {
                    i5 = i;
                    int i15 = composerStartRestartGroup.changed(i5) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i4 |= i15;
                } else {
                    i5 = i;
                }
                i4 |= i15;
            } else {
                i5 = i;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i2 & 7168) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i7 = 2048;
                    } else {
                        i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i4 |= i7;
                }
                if ((i2 & 57344) != 0) {
                    i4 |= ((i3 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
                }
                if ((i2 & 458752) == 0) {
                    jM1680copywmQWz5c$default = j2;
                    if ((i3 & 32) == 0 || !composerStartRestartGroup.changed(jM1680copywmQWz5c$default)) {
                        i13 = 65536;
                    } else {
                        i13 = 131072;
                    }
                    i4 |= i13;
                } else {
                    jM1680copywmQWz5c$default = j2;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                    f4 = f;
                } else {
                    f4 = f;
                    if ((i2 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f4)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i4 |= i9;
                    }
                }
                if ((i2 & 29360128) == 0) {
                    if ((i3 & 128) == 0) {
                        f5 = f2;
                        if (composerStartRestartGroup.changed(f5)) {
                            i12 = 8388608;
                        }
                        i4 |= i12;
                    } else {
                        f5 = f2;
                    }
                    i12 = Configuration.BLOCK_SIZE;
                    i4 |= i12;
                } else {
                    f5 = f2;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
                }
                if ((i2 & 1879048192) != 0) {
                    i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i4 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i3 & 4) != 0) {
                            iOooO0o = pagerState.OooO0o();
                            i4 &= -897;
                        } else {
                            iOooO0o = i5;
                        }
                        if (i6 != 0) {
                            function3 = OooO00o.f39805OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default2 = j;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        }
                        if (i8 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                            f5 = fM3775constructorimpl;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i4 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i4;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i11 = i10 & (-1879048193);
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                        } else {
                            i11 = i10;
                            circleShape = shape;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i4 &= -234881025;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            i4 &= -1879048193;
                        }
                        modifier2 = modifier;
                        circleShape = shape;
                        iOooO0o = i5;
                        function3 = function2;
                        fM3775constructorimpl = f4;
                        jM1680copywmQWz5c$default2 = j;
                        i11 = i4;
                        f6 = f3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1678773673, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:76)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(pagerState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new OooOO0(pagerState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OooO0O0((OooOO0) objRememberedValue, iOooO0o, modifier2, function3, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default, fM3775constructorimpl, f5, f6, circleShape, composerStartRestartGroup, ((i11 >> 3) & 112) | ((i11 << 3) & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape2 = circleShape;
                    f7 = f6;
                    f4 = fM3775constructorimpl;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    f7 = f3;
                    shape2 = shape;
                    iOooO0o = i5;
                    function3 = function2;
                    jM1680copywmQWz5c$default2 = j;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(pagerState, modifier3, iOooO0o, function3, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default, f4, f5, f7, shape2, i2, i3));
            }
            i4 |= 3072;
            function2 = function1;
            if ((i2 & 57344) != 0) {
                i4 |= ((i3 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
            }
            if ((i2 & 458752) == 0) {
                jM1680copywmQWz5c$default = j2;
                if ((i3 & 32) == 0) {
                    i13 = 65536;
                } else {
                    i13 = 65536;
                }
                i4 |= i13;
            } else {
                jM1680copywmQWz5c$default = j2;
            }
            i8 = i3 & 64;
            if (i8 != 0) {
                i4 |= 1572864;
                f4 = f;
            } else {
                f4 = f;
                if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
            }
            if ((i2 & 29360128) == 0) {
                if ((i3 & 128) == 0) {
                    f5 = f2;
                    if (composerStartRestartGroup.changed(f5)) {
                        i12 = 8388608;
                    }
                    i4 |= i12;
                } else {
                    f5 = f2;
                }
                i12 = Configuration.BLOCK_SIZE;
                i4 |= i12;
            } else {
                f5 = f2;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
            }
            if ((i2 & 1879048192) != 0) {
                i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i4 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO0o = pagerState.OooO0o();
                        i4 &= -897;
                    } else {
                        iOooO0o = i5;
                    }
                    if (i6 != 0) {
                        function3 = OooO00o.f39805OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default2 = j;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        f5 = fM3775constructorimpl;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i4 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i4;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i11 = i10 & (-1879048193);
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                    } else {
                        i11 = i10;
                        circleShape = shape;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO0o = pagerState.OooO0o();
                        i4 &= -897;
                    } else {
                        iOooO0o = i5;
                    }
                    if (i6 != 0) {
                        function3 = OooO00o.f39805OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default2 = j;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        f5 = fM3775constructorimpl;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i4 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i4;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i11 = i10 & (-1879048193);
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                    } else {
                        i11 = i10;
                        circleShape = shape;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1678773673, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:76)");
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(pagerState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooOO0(pagerState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooOO0(pagerState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooO0O0((OooOO0) objRememberedValue, iOooO0o, modifier2, function3, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default, fM3775constructorimpl, f5, f6, circleShape, composerStartRestartGroup, ((i11 >> 3) & 112) | ((i11 << 3) & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = circleShape;
                f7 = f6;
                f4 = fM3775constructorimpl;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO0o = pagerState.OooO0o();
                        i4 &= -897;
                    } else {
                        iOooO0o = i5;
                    }
                    if (i6 != 0) {
                        function3 = OooO00o.f39805OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default2 = j;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        f5 = fM3775constructorimpl;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i4 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i4;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i11 = i10 & (-1879048193);
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                    } else {
                        i11 = i10;
                        circleShape = shape;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO0o = pagerState.OooO0o();
                        i4 &= -897;
                    } else {
                        iOooO0o = i5;
                    }
                    if (i6 != 0) {
                        function3 = OooO00o.f39805OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default2 = j;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        f5 = fM3775constructorimpl;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i4 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i4;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i11 = i10 & (-1879048193);
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                    } else {
                        i11 = i10;
                        circleShape = shape;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1678773673, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:76)");
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(pagerState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooOO0(pagerState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooOO0(pagerState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooO0O0((OooOO0) objRememberedValue, iOooO0o, modifier2, function3, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default, fM3775constructorimpl, f5, f6, circleShape, composerStartRestartGroup, ((i11 >> 3) & 112) | ((i11 << 3) & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = circleShape;
                f7 = f6;
                f4 = fM3775constructorimpl;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(pagerState, modifier3, iOooO0o, function3, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default, f4, f5, f7, shape2, i2, i3));
        }
        i4 |= 48;
        if ((i2 & 896) == 0) {
            if ((i3 & 4) == 0) {
                i5 = i;
                if (composerStartRestartGroup.changed(i5)) {
                }
                i4 |= i15;
            } else {
                i5 = i;
            }
            i4 |= i15;
        } else {
            i5 = i;
        }
        i6 = i3 & 8;
        if (i6 != 0) {
            if ((i2 & 7168) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i7 = 2048;
                } else {
                    i7 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i7;
            }
            if ((i2 & 57344) != 0) {
                i4 |= ((i3 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
            }
            if ((i2 & 458752) == 0) {
                jM1680copywmQWz5c$default = j2;
                if ((i3 & 32) == 0) {
                    i13 = 65536;
                } else {
                    i13 = 65536;
                }
                i4 |= i13;
            } else {
                jM1680copywmQWz5c$default = j2;
            }
            i8 = i3 & 64;
            if (i8 != 0) {
                i4 |= 1572864;
                f4 = f;
            } else {
                f4 = f;
                if ((i2 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f4)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i4 |= i9;
                }
            }
            if ((i2 & 29360128) == 0) {
                if ((i3 & 128) == 0) {
                    f5 = f2;
                    if (composerStartRestartGroup.changed(f5)) {
                        i12 = 8388608;
                    }
                    i4 |= i12;
                } else {
                    f5 = f2;
                }
                i12 = Configuration.BLOCK_SIZE;
                i4 |= i12;
            } else {
                f5 = f2;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
            }
            if ((i2 & 1879048192) != 0) {
                i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i4 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO0o = pagerState.OooO0o();
                        i4 &= -897;
                    } else {
                        iOooO0o = i5;
                    }
                    if (i6 != 0) {
                        function3 = OooO00o.f39805OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default2 = j;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        f5 = fM3775constructorimpl;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i4 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i4;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i11 = i10 & (-1879048193);
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                    } else {
                        i11 = i10;
                        circleShape = shape;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO0o = pagerState.OooO0o();
                        i4 &= -897;
                    } else {
                        iOooO0o = i5;
                    }
                    if (i6 != 0) {
                        function3 = OooO00o.f39805OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default2 = j;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        f5 = fM3775constructorimpl;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i4 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i4;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i11 = i10 & (-1879048193);
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                    } else {
                        i11 = i10;
                        circleShape = shape;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1678773673, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:76)");
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(pagerState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooOO0(pagerState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooOO0(pagerState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooO0O0((OooOO0) objRememberedValue, iOooO0o, modifier2, function3, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default, fM3775constructorimpl, f5, f6, circleShape, composerStartRestartGroup, ((i11 >> 3) & 112) | ((i11 << 3) & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = circleShape;
                f7 = f6;
                f4 = fM3775constructorimpl;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO0o = pagerState.OooO0o();
                        i4 &= -897;
                    } else {
                        iOooO0o = i5;
                    }
                    if (i6 != 0) {
                        function3 = OooO00o.f39805OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default2 = j;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        f5 = fM3775constructorimpl;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i4 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i4;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i11 = i10 & (-1879048193);
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                    } else {
                        i11 = i10;
                        circleShape = shape;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i3 & 4) != 0) {
                        iOooO0o = pagerState.OooO0o();
                        i4 &= -897;
                    } else {
                        iOooO0o = i5;
                    }
                    if (i6 != 0) {
                        function3 = OooO00o.f39805OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default2 = j;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    }
                    if (i8 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i4 &= -29360129;
                        f5 = fM3775constructorimpl;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i4 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i4;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        i11 = i10 & (-1879048193);
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                    } else {
                        i11 = i10;
                        circleShape = shape;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1678773673, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:76)");
                }
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(pagerState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new OooOO0(pagerState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new OooOO0(pagerState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                OooO0O0((OooOO0) objRememberedValue, iOooO0o, modifier2, function3, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default, fM3775constructorimpl, f5, f6, circleShape, composerStartRestartGroup, ((i11 >> 3) & 112) | ((i11 << 3) & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = circleShape;
                f7 = f6;
                f4 = fM3775constructorimpl;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(pagerState, modifier3, iOooO0o, function3, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default, f4, f5, f7, shape2, i2, i3));
        }
        i4 |= 3072;
        function2 = function1;
        if ((i2 & 57344) != 0) {
            i4 |= ((i3 & 16) == 0 || !composerStartRestartGroup.changed(j)) ? 8192 : 16384;
        }
        if ((i2 & 458752) == 0) {
            jM1680copywmQWz5c$default = j2;
            if ((i3 & 32) == 0) {
                i13 = 65536;
            } else {
                i13 = 65536;
            }
            i4 |= i13;
        } else {
            jM1680copywmQWz5c$default = j2;
        }
        i8 = i3 & 64;
        if (i8 != 0) {
            i4 |= 1572864;
            f4 = f;
        } else {
            f4 = f;
            if ((i2 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f4)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i4 |= i9;
            }
        }
        if ((i2 & 29360128) == 0) {
            if ((i3 & 128) == 0) {
                f5 = f2;
                if (composerStartRestartGroup.changed(f5)) {
                    i12 = 8388608;
                }
                i4 |= i12;
            } else {
                f5 = f2;
            }
            i12 = Configuration.BLOCK_SIZE;
            i4 |= i12;
        } else {
            f5 = f2;
        }
        if ((i2 & 234881024) != 0) {
            i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
        }
        if ((i2 & 1879048192) != 0) {
            i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
        }
        if ((i4 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    iOooO0o = pagerState.OooO0o();
                    i4 &= -897;
                } else {
                    iOooO0o = i5;
                }
                if (i6 != 0) {
                    function3 = OooO00o.f39805OooO0Oo;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -57345;
                } else {
                    jM1680copywmQWz5c$default2 = j;
                }
                if ((i3 & 32) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -458753;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(8);
                } else {
                    fM3775constructorimpl = f4;
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                    f5 = fM3775constructorimpl;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i10 = i4 & (-234881025);
                    f6 = fM3775constructorimpl;
                } else {
                    i10 = i4;
                    f6 = f3;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i11 = i10 & (-1879048193);
                    circleShape = RoundedCornerShapeKt.getCircleShape();
                } else {
                    i11 = i10;
                    circleShape = shape;
                }
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    iOooO0o = pagerState.OooO0o();
                    i4 &= -897;
                } else {
                    iOooO0o = i5;
                }
                if (i6 != 0) {
                    function3 = OooO00o.f39805OooO0Oo;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -57345;
                } else {
                    jM1680copywmQWz5c$default2 = j;
                }
                if ((i3 & 32) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -458753;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(8);
                } else {
                    fM3775constructorimpl = f4;
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                    f5 = fM3775constructorimpl;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i10 = i4 & (-234881025);
                    f6 = fM3775constructorimpl;
                } else {
                    i10 = i4;
                    f6 = f3;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i11 = i10 & (-1879048193);
                    circleShape = RoundedCornerShapeKt.getCircleShape();
                } else {
                    i11 = i10;
                    circleShape = shape;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1678773673, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:76)");
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(pagerState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooOO0(pagerState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooOO0(pagerState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0O0((OooOO0) objRememberedValue, iOooO0o, modifier2, function3, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default, fM3775constructorimpl, f5, f6, circleShape, composerStartRestartGroup, ((i11 >> 3) & 112) | ((i11 << 3) & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape2 = circleShape;
            f7 = f6;
            f4 = fM3775constructorimpl;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    iOooO0o = pagerState.OooO0o();
                    i4 &= -897;
                } else {
                    iOooO0o = i5;
                }
                if (i6 != 0) {
                    function3 = OooO00o.f39805OooO0Oo;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -57345;
                } else {
                    jM1680copywmQWz5c$default2 = j;
                }
                if ((i3 & 32) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -458753;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(8);
                } else {
                    fM3775constructorimpl = f4;
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                    f5 = fM3775constructorimpl;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i10 = i4 & (-234881025);
                    f6 = fM3775constructorimpl;
                } else {
                    i10 = i4;
                    f6 = f3;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i11 = i10 & (-1879048193);
                    circleShape = RoundedCornerShapeKt.getCircleShape();
                } else {
                    i11 = i10;
                    circleShape = shape;
                }
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i3 & 4) != 0) {
                    iOooO0o = pagerState.OooO0o();
                    i4 &= -897;
                } else {
                    iOooO0o = i5;
                }
                if (i6 != 0) {
                    function3 = OooO00o.f39805OooO0Oo;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -57345;
                } else {
                    jM1680copywmQWz5c$default2 = j;
                }
                if ((i3 & 32) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -458753;
                }
                if (i8 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(8);
                } else {
                    fM3775constructorimpl = f4;
                }
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                    f5 = fM3775constructorimpl;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i10 = i4 & (-234881025);
                    f6 = fM3775constructorimpl;
                } else {
                    i10 = i4;
                    f6 = f3;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    i11 = i10 & (-1879048193);
                    circleShape = RoundedCornerShapeKt.getCircleShape();
                } else {
                    i11 = i10;
                    circleShape = shape;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1678773673, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:76)");
            }
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(pagerState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooOO0(pagerState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooOO0(pagerState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0O0((OooOO0) objRememberedValue, iOooO0o, modifier2, function3, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default, fM3775constructorimpl, f5, f6, circleShape, composerStartRestartGroup, ((i11 >> 3) & 112) | ((i11 << 3) & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128) | (i11 & 234881024) | (i11 & 1879048192), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape2 = circleShape;
            f7 = f6;
            f4 = fM3775constructorimpl;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(pagerState, modifier3, iOooO0o, function3, jM1680copywmQWz5c$default2, jM1680copywmQWz5c$default, f4, f5, f7, shape2, i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0116  */
    /* JADX WARN: Code duplicated, block: B:104:0x011a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x012c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0138  */
    /* JADX WARN: Code duplicated, block: B:117:0x0151  */
    /* JADX WARN: Code duplicated, block: B:119:0x0167  */
    /* JADX WARN: Code duplicated, block: B:138:0x019d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x019f  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:147:0x01db  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:151:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:153:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:154:0x0206  */
    /* JADX WARN: Code duplicated, block: B:157:0x020b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0210  */
    /* JADX WARN: Code duplicated, block: B:161:0x0217  */
    /* JADX WARN: Code duplicated, block: B:162:0x021c  */
    /* JADX WARN: Code duplicated, block: B:165:0x0223  */
    /* JADX WARN: Code duplicated, block: B:166:0x0229  */
    /* JADX WARN: Code duplicated, block: B:169:0x0235  */
    /* JADX WARN: Code duplicated, block: B:172:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:175:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:176:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:179:0x035c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0368  */
    /* JADX WARN: Code duplicated, block: B:183:0x036c  */
    /* JADX WARN: Code duplicated, block: B:186:0x03b9 A[LOOP:0: B:185:0x03b7->B:186:0x03b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:190:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:193:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:198:0x040f  */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x010e  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(o000000O o000000o2, int i, Modifier modifier, Function1<? super Integer, Integer> function1, long j, long j2, float f, float f2, float f3, Shape shape, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Function1<? super Integer, Integer> function2;
        int i6;
        long j3;
        long j4;
        int i7;
        float f4;
        int i8;
        Modifier modifier2;
        Function1<? super Integer, Integer> function3;
        long jM1680copywmQWz5c$default;
        long jM1680copywmQWz5c$default2;
        float fM3775constructorimpl;
        int i9;
        float f5;
        int i10;
        float f6;
        Shape circleShape;
        int i11;
        long j5;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> constructor2;
        int i12;
        Modifier modifierM170backgroundbw27NRU;
        int i13;
        Modifier modifierM170backgroundbw27NRU2;
        long j6;
        Function1<? super Integer, Integer> function4;
        float f7;
        float f8;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1605247238);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(o000000o2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i14 = i3 & 4;
        if (i14 == 0) {
            if ((i2 & 896) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 7168) == 0) {
                    function2 = function1;
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i4 |= i6;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        j3 = j;
                        int i15 = composerStartRestartGroup.changed(j3) ? 16384 : 8192;
                        i4 |= i15;
                    } else {
                        j3 = j;
                    }
                    i4 |= i15;
                } else {
                    j3 = j;
                }
                if ((458752 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        j4 = j2;
                        int i16 = composerStartRestartGroup.changed(j4) ? 131072 : 65536;
                        i4 |= i16;
                    } else {
                        j4 = j2;
                    }
                    i4 |= i16;
                } else {
                    j4 = j2;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    if ((3670016 & i2) == 0) {
                        f4 = f;
                        if (composerStartRestartGroup.changed(f4)) {
                            i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                    if ((i2 & 29360128) != 0) {
                        i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(f2)) ? Configuration.BLOCK_SIZE : 8388608;
                    }
                    if ((i2 & 234881024) != 0) {
                        i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
                    }
                    if ((i2 & 1879048192) != 0) {
                        i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                    }
                    if ((i4 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i14 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i5 != 0) {
                                function3 = OooO0OO.f39818OooO0Oo;
                            } else {
                                function3 = function2;
                            }
                            if ((i3 & 16) != 0) {
                                jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                                i4 &= -57345;
                            } else {
                                jM1680copywmQWz5c$default = j3;
                            }
                            if ((i3 & 32) != 0) {
                                jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                                i4 &= -458753;
                            } else {
                                jM1680copywmQWz5c$default2 = j4;
                            }
                            if (i7 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(8);
                            } else {
                                fM3775constructorimpl = f4;
                            }
                            if ((i3 & 128) != 0) {
                                i9 = i4 & (-29360129);
                                f5 = fM3775constructorimpl;
                            } else {
                                i9 = i4;
                                f5 = f2;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                i10 = i9 & (-234881025);
                                f6 = fM3775constructorimpl;
                            } else {
                                i10 = i9;
                                f6 = f3;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                circleShape = RoundedCornerShapeKt.getCircleShape();
                                i11 = (-1879048193) & i10;
                            } else {
                                circleShape = shape;
                                i11 = i10;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                                i4 &= -1879048193;
                            }
                            modifier2 = modifier;
                            i11 = i4;
                            function3 = function2;
                            jM1680copywmQWz5c$default = j3;
                            jM1680copywmQWz5c$default2 = j4;
                            fM3775constructorimpl = f4;
                            f5 = f2;
                            f6 = f3;
                            circleShape = shape;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                        }
                        int iMo320roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                        int iMo320roundToPx0680j_5 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                        Alignment.Companion companion = Alignment.INSTANCE;
                        j5 = jM1680copywmQWz5c$default;
                        Alignment centerStart = companion.getCenterStart();
                        int i17 = ((i11 >> 6) & 14) | 48;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        int i18 = i17 >> 3;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, (i18 & 14) | (i18 & 112));
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function1<? super Integer, Integer> function5 = function3;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier2);
                        int i19 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
                        Modifier modifier4 = modifier2;
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                        Updater.m1327setimpl(composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m1327setimpl(composerM1320constructorimpl, density, companion2.getSetDensity());
                        Updater.m1327setimpl(composerM1320constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                        Updater.m1327setimpl(composerM1320constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        androidx.compose.animation.OooOO0.OooO00o((i19 >> 3) & 112, function3MaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        composerStartRestartGroup.startReplaceableGroup(693286680);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        constructor2 = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(companion3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
                        Updater.m1327setimpl(composerM1320constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m1327setimpl(composerM1320constructorimpl2, density2, companion2.getSetDensity());
                        Updater.m1327setimpl(composerM1320constructorimpl2, layoutDirection2, companion2.getSetLayoutDirection());
                        Updater.m1327setimpl(composerM1320constructorimpl2, viewConfiguration2, companion2.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        i12 = 0;
                        androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion3, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                        composerStartRestartGroup.startReplaceableGroup(-29720124);
                        i13 = 0;
                        while (i12 < i) {
                            BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                            i12++;
                            i13 = 0;
                        }
                        o00O000o.OooO00o(composerStartRestartGroup);
                        modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                        Modifier modifierM527sizeVpY3zN4 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function5, o000000o2, i, iMo320roundToPx0680j_5, iMo320roundToPx0680j_4)), fM3775constructorimpl, f5);
                        if (i > 0) {
                            j6 = j5;
                            modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                        } else {
                            j6 = j5;
                        }
                        BoxKt.Box(modifierM527sizeVpY3zN4.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function5;
                        f7 = f6;
                        f8 = f5;
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        f7 = f3;
                        function4 = function2;
                        j6 = j3;
                        jM1680copywmQWz5c$default2 = j4;
                        fM3775constructorimpl = f4;
                        f8 = f2;
                        circleShape = shape;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO(o000000o2, i, modifier3, function4, j6, jM1680copywmQWz5c$default2, fM3775constructorimpl, f8, f7, circleShape, i2, i3));
                }
                i4 |= 1572864;
                f4 = f;
                if ((i2 & 29360128) != 0) {
                    i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(f2)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
                }
                if ((i2 & 1879048192) != 0) {
                    i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i4 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                    }
                    int iMo320roundToPx0680j_6 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                    int iMo320roundToPx0680j_7 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    j5 = jM1680copywmQWz5c$default;
                    Alignment centerStart2 = companion4.getCenterStart();
                    int i110 = ((i11 >> 6) & 14) | 48;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    int i111 = i110 >> 3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart2, false, composerStartRestartGroup, (i111 & 14) | (i111 & 112));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function1<? super Integer, Integer> function6 = function3;
                    constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifier2);
                    int i112 = ((((i110 << 3) & 112) << 9) & 7168) | 6;
                    Modifier modifier5 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl3, density3, companion5.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl3, layoutDirection3, companion5.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl3, viewConfiguration3, companion5.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    androidx.compose.animation.OooOO0.OooO00o((i112 >> 3) & 112, function3MaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_5 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                    Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_5, centerVertically2, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(companion6);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl4, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl4, density4, companion5.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl4, layoutDirection4, companion5.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl4, viewConfiguration4, companion5.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    i12 = 0;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf4, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion6, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                    composerStartRestartGroup.startReplaceableGroup(-29720124);
                    i13 = 0;
                    while (i12 < i) {
                        BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                        i12++;
                        i13 = 0;
                    }
                    o00O000o.OooO00o(composerStartRestartGroup);
                    modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                    Modifier modifierM527sizeVpY3zN5 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function6, o000000o2, i, iMo320roundToPx0680j_7, iMo320roundToPx0680j_6)), fM3775constructorimpl, f5);
                    if (i > 0) {
                        j6 = j5;
                        modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                    } else {
                        j6 = j5;
                    }
                    BoxKt.Box(modifierM527sizeVpY3zN5.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function6;
                    f7 = f6;
                    f8 = f5;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                    }
                    int iMo320roundToPx0680j_8 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                    int iMo320roundToPx0680j_9 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    j5 = jM1680copywmQWz5c$default;
                    Alignment centerStart3 = companion7.getCenterStart();
                    int i113 = ((i11 >> 6) & 14) | 48;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    int i114 = i113 >> 3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(centerStart3, false, composerStartRestartGroup, (i114 & 14) | (i114 & 112));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function1<? super Integer, Integer> function7 = function3;
                    constructor = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifier2);
                    int i115 = ((((i113 << 3) & 112) << 9) & 7168) | 6;
                    Modifier modifier6 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl5 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion8.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl5, density5, companion8.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl5, layoutDirection5, companion8.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl5, viewConfiguration5, companion8.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    androidx.compose.animation.OooOO0.OooO00o((i115 >> 3) & 112, function3MaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_6 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                    Alignment.Vertical centerVertically3 = companion7.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Modifier.Companion companion9 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_6, centerVertically3, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(companion9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl6 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl6, measurePolicyRowMeasurePolicy3, companion8.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl6, density6, companion8.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl6, layoutDirection6, companion8.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl6, viewConfiguration6, companion8.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    i12 = 0;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf6, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion9, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                    composerStartRestartGroup.startReplaceableGroup(-29720124);
                    i13 = 0;
                    while (i12 < i) {
                        BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                        i12++;
                        i13 = 0;
                    }
                    o00O000o.OooO00o(composerStartRestartGroup);
                    modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                    Modifier modifierM527sizeVpY3zN6 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function7, o000000o2, i, iMo320roundToPx0680j_9, iMo320roundToPx0680j_8)), fM3775constructorimpl, f5);
                    if (i > 0) {
                        j6 = j5;
                        modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                    } else {
                        j6 = j5;
                    }
                    BoxKt.Box(modifierM527sizeVpY3zN6.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function7;
                    f7 = f6;
                    f8 = f5;
                    modifier3 = modifier6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(o000000o2, i, modifier3, function4, j6, jM1680copywmQWz5c$default2, fM3775constructorimpl, f8, f7, circleShape, i2, i3));
            }
            i4 |= 3072;
            function2 = function1;
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    j3 = j;
                    if (composerStartRestartGroup.changed(j3)) {
                    }
                    i4 |= i15;
                } else {
                    j3 = j;
                }
                i4 |= i15;
            } else {
                j3 = j;
            }
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                    }
                    i4 |= i16;
                } else {
                    j4 = j2;
                }
                i4 |= i16;
            } else {
                j4 = j2;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((3670016 & i2) == 0) {
                    f4 = f;
                    if (composerStartRestartGroup.changed(f4)) {
                        i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                if ((i2 & 29360128) != 0) {
                    i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(f2)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
                }
                if ((i2 & 1879048192) != 0) {
                    i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i4 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                    }
                    int iMo320roundToPx0680j_10 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                    int iMo320roundToPx0680j_11 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                    Alignment.Companion companion10 = Alignment.INSTANCE;
                    j5 = jM1680copywmQWz5c$default;
                    Alignment centerStart4 = companion10.getCenterStart();
                    int i116 = ((i11 >> 6) & 14) | 48;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    int i117 = i116 >> 3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(centerStart4, false, composerStartRestartGroup, (i117 & 14) | (i117 & 112));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    Function1<? super Integer, Integer> function8 = function3;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifier2);
                    int i118 = ((((i116 << 3) & 112) << 9) & 7168) | 6;
                    Modifier modifier7 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl7 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl7, measurePolicyRememberBoxMeasurePolicy4, companion11.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl7, density7, companion11.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl7, layoutDirection7, companion11.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl7, viewConfiguration7, companion11.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    androidx.compose.animation.OooOO0.OooO00o((i118 >> 3) & 112, function3MaterializerOf7, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_7 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                    Alignment.Vertical centerVertically4 = companion10.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Modifier.Companion companion12 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_7, centerVertically4, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(companion12);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl8 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl8, measurePolicyRowMeasurePolicy4, companion11.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl8, density8, companion11.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl8, layoutDirection8, companion11.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl8, viewConfiguration8, companion11.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    i12 = 0;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf8, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                    modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion12, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                    composerStartRestartGroup.startReplaceableGroup(-29720124);
                    i13 = 0;
                    while (i12 < i) {
                        BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                        i12++;
                        i13 = 0;
                    }
                    o00O000o.OooO00o(composerStartRestartGroup);
                    modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                    Modifier modifierM527sizeVpY3zN7 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function8, o000000o2, i, iMo320roundToPx0680j_11, iMo320roundToPx0680j_10)), fM3775constructorimpl, f5);
                    if (i > 0) {
                        j6 = j5;
                        modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                    } else {
                        j6 = j5;
                    }
                    BoxKt.Box(modifierM527sizeVpY3zN7.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function8;
                    f7 = f6;
                    f8 = f5;
                    modifier3 = modifier7;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                    }
                    int iMo320roundToPx0680j_12 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                    int iMo320roundToPx0680j_13 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                    Alignment.Companion companion13 = Alignment.INSTANCE;
                    j5 = jM1680copywmQWz5c$default;
                    Alignment centerStart5 = companion13.getCenterStart();
                    int i119 = ((i11 >> 6) & 14) | 48;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    int i1110 = i119 >> 3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(centerStart5, false, composerStartRestartGroup, (i1110 & 14) | (i1110 & 112));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    Function1<? super Integer, Integer> function9 = function3;
                    constructor = companion14.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifier2);
                    int i1111 = ((((i119 << 3) & 112) << 9) & 7168) | 6;
                    Modifier modifier8 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl9 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl9, measurePolicyRememberBoxMeasurePolicy5, companion14.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl9, density9, companion14.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl9, layoutDirection9, companion14.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl9, viewConfiguration9, companion14.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    androidx.compose.animation.OooOO0.OooO00o((i1111 >> 3) & 112, function3MaterializerOf9, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_8 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                    Alignment.Vertical centerVertically5 = companion13.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Modifier.Companion companion15 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_8, centerVertically5, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion14.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(companion15);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl10 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl10, measurePolicyRowMeasurePolicy5, companion14.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl10, density10, companion14.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl10, layoutDirection10, companion14.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl10, viewConfiguration10, companion14.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    i12 = 0;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf10, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                    modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion15, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                    composerStartRestartGroup.startReplaceableGroup(-29720124);
                    i13 = 0;
                    while (i12 < i) {
                        BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                        i12++;
                        i13 = 0;
                    }
                    o00O000o.OooO00o(composerStartRestartGroup);
                    modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                    Modifier modifierM527sizeVpY3zN8 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function9, o000000o2, i, iMo320roundToPx0680j_13, iMo320roundToPx0680j_12)), fM3775constructorimpl, f5);
                    if (i > 0) {
                        j6 = j5;
                        modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                    } else {
                        j6 = j5;
                    }
                    BoxKt.Box(modifierM527sizeVpY3zN8.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function9;
                    f7 = f6;
                    f8 = f5;
                    modifier3 = modifier8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(o000000o2, i, modifier3, function4, j6, jM1680copywmQWz5c$default2, fM3775constructorimpl, f8, f7, circleShape, i2, i3));
            }
            i4 |= 1572864;
            f4 = f;
            if ((i2 & 29360128) != 0) {
                i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(f2)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
            }
            if ((i2 & 1879048192) != 0) {
                i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i4 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                }
                int iMo320roundToPx0680j_14 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                int iMo320roundToPx0680j_15 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                Alignment.Companion companion16 = Alignment.INSTANCE;
                j5 = jM1680copywmQWz5c$default;
                Alignment centerStart6 = companion16.getCenterStart();
                int i1112 = ((i11 >> 6) & 14) | 48;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i1113 = i1112 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(centerStart6, false, composerStartRestartGroup, (i1113 & 14) | (i1113 & 112));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                Function1<? super Integer, Integer> function10 = function3;
                constructor = companion17.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifier2);
                int i1114 = ((((i1112 << 3) & 112) << 9) & 7168) | 6;
                Modifier modifier9 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl11 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl11, measurePolicyRememberBoxMeasurePolicy6, companion17.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl11, density11, companion17.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl11, layoutDirection11, companion17.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl11, viewConfiguration11, companion17.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                androidx.compose.animation.OooOO0.OooO00o((i1114 >> 3) & 112, function3MaterializerOf11, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_9 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                Alignment.Vertical centerVertically6 = companion16.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion18 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_9, centerVertically6, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion17.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(companion18);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl12 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl12, measurePolicyRowMeasurePolicy6, companion17.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl12, density12, companion17.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl12, layoutDirection12, companion17.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl12, viewConfiguration12, companion17.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                i12 = 0;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf12, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
                modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion18, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                composerStartRestartGroup.startReplaceableGroup(-29720124);
                i13 = 0;
                while (i12 < i) {
                    BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                    i12++;
                    i13 = 0;
                }
                o00O000o.OooO00o(composerStartRestartGroup);
                modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                Modifier modifierM527sizeVpY3zN9 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function10, o000000o2, i, iMo320roundToPx0680j_15, iMo320roundToPx0680j_14)), fM3775constructorimpl, f5);
                if (i > 0) {
                    j6 = j5;
                    modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                } else {
                    j6 = j5;
                }
                BoxKt.Box(modifierM527sizeVpY3zN9.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function10;
                f7 = f6;
                f8 = f5;
                modifier3 = modifier9;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                }
                int iMo320roundToPx0680j_16 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                int iMo320roundToPx0680j_17 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                Alignment.Companion companion19 = Alignment.INSTANCE;
                j5 = jM1680copywmQWz5c$default;
                Alignment centerStart7 = companion19.getCenterStart();
                int i1115 = ((i11 >> 6) & 14) | 48;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i1116 = i1115 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(centerStart7, false, composerStartRestartGroup, (i1116 & 14) | (i1116 & 112));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                Function1<? super Integer, Integer> function11 = function3;
                constructor = companion110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifier2);
                int i1117 = ((((i1115 << 3) & 112) << 9) & 7168) | 6;
                Modifier modifier10 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl13 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl13, measurePolicyRememberBoxMeasurePolicy7, companion110.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl13, density13, companion110.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl13, layoutDirection13, companion110.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl13, viewConfiguration13, companion110.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                androidx.compose.animation.OooOO0.OooO00o((i1117 >> 3) & 112, function3MaterializerOf13, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_10 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                Alignment.Vertical centerVertically7 = companion19.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion111 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_10, centerVertically7, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(companion111);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl14 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl14, measurePolicyRowMeasurePolicy7, companion110.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl14, density14, companion110.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl14, layoutDirection14, companion110.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl14, viewConfiguration14, companion110.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                i12 = 0;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf14, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
                modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion111, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                composerStartRestartGroup.startReplaceableGroup(-29720124);
                i13 = 0;
                while (i12 < i) {
                    BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                    i12++;
                    i13 = 0;
                }
                o00O000o.OooO00o(composerStartRestartGroup);
                modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                Modifier modifierM527sizeVpY3zN10 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function11, o000000o2, i, iMo320roundToPx0680j_17, iMo320roundToPx0680j_16)), fM3775constructorimpl, f5);
                if (i > 0) {
                    j6 = j5;
                    modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                } else {
                    j6 = j5;
                }
                BoxKt.Box(modifierM527sizeVpY3zN10.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function11;
                f7 = f6;
                f8 = f5;
                modifier3 = modifier10;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(o000000o2, i, modifier3, function4, j6, jM1680copywmQWz5c$default2, fM3775constructorimpl, f8, f7, circleShape, i2, i3));
        }
        i4 |= 384;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 7168) == 0) {
                function2 = function1;
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i4 |= i6;
            }
            if ((57344 & i2) == 0) {
                if ((i3 & 16) == 0) {
                    j3 = j;
                    if (composerStartRestartGroup.changed(j3)) {
                    }
                    i4 |= i15;
                } else {
                    j3 = j;
                }
                i4 |= i15;
            } else {
                j3 = j;
            }
            if ((458752 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                    }
                    i4 |= i16;
                } else {
                    j4 = j2;
                }
                i4 |= i16;
            } else {
                j4 = j2;
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                if ((3670016 & i2) == 0) {
                    f4 = f;
                    if (composerStartRestartGroup.changed(f4)) {
                        i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                if ((i2 & 29360128) != 0) {
                    i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(f2)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                if ((i2 & 234881024) != 0) {
                    i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
                }
                if ((i2 & 1879048192) != 0) {
                    i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
                }
                if ((i4 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                    }
                    int iMo320roundToPx0680j_18 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                    int iMo320roundToPx0680j_19 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                    Alignment.Companion companion112 = Alignment.INSTANCE;
                    j5 = jM1680copywmQWz5c$default;
                    Alignment centerStart8 = companion112.getCenterStart();
                    int i1118 = ((i11 >> 6) & 14) | 48;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    int i1119 = i1118 >> 3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(centerStart8, false, composerStartRestartGroup, (i1119 & 14) | (i1119 & 112));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration15 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                    Function1<? super Integer, Integer> function12 = function3;
                    constructor = companion113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifier2);
                    int i11110 = ((((i1118 << 3) & 112) << 9) & 7168) | 6;
                    Modifier modifier11 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl15 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl15, measurePolicyRememberBoxMeasurePolicy8, companion113.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl15, density15, companion113.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl15, layoutDirection15, companion113.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl15, viewConfiguration15, companion113.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    androidx.compose.animation.OooOO0.OooO00o((i11110 >> 3) & 112, function3MaterializerOf15, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_11 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                    Alignment.Vertical centerVertically8 = companion112.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Modifier.Companion companion114 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy8 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_11, centerVertically8, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection16 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration16 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion113.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(companion114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl16 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl16, measurePolicyRowMeasurePolicy8, companion113.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl16, density16, companion113.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl16, layoutDirection16, companion113.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl16, viewConfiguration16, companion113.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    i12 = 0;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf16, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance8 = RowScopeInstance.INSTANCE;
                    modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion114, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                    composerStartRestartGroup.startReplaceableGroup(-29720124);
                    i13 = 0;
                    while (i12 < i) {
                        BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                        i12++;
                        i13 = 0;
                    }
                    o00O000o.OooO00o(composerStartRestartGroup);
                    modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                    Modifier modifierM527sizeVpY3zN11 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function12, o000000o2, i, iMo320roundToPx0680j_19, iMo320roundToPx0680j_18)), fM3775constructorimpl, f5);
                    if (i > 0) {
                        j6 = j5;
                        modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                    } else {
                        j6 = j5;
                    }
                    BoxKt.Box(modifierM527sizeVpY3zN11.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function12;
                    f7 = f6;
                    f8 = f5;
                    modifier3 = modifier11;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    } else {
                        if (i14 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i5 != 0) {
                            function3 = OooO0OO.f39818OooO0Oo;
                        } else {
                            function3 = function2;
                        }
                        if ((i3 & 16) != 0) {
                            jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -57345;
                        } else {
                            jM1680copywmQWz5c$default = j3;
                        }
                        if ((i3 & 32) != 0) {
                            jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                            i4 &= -458753;
                        } else {
                            jM1680copywmQWz5c$default2 = j4;
                        }
                        if (i7 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(8);
                        } else {
                            fM3775constructorimpl = f4;
                        }
                        if ((i3 & 128) != 0) {
                            i9 = i4 & (-29360129);
                            f5 = fM3775constructorimpl;
                        } else {
                            i9 = i4;
                            f5 = f2;
                        }
                        if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            i10 = i9 & (-234881025);
                            f6 = fM3775constructorimpl;
                        } else {
                            i10 = i9;
                            f6 = f3;
                        }
                        if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                            circleShape = RoundedCornerShapeKt.getCircleShape();
                            i11 = (-1879048193) & i10;
                        } else {
                            circleShape = shape;
                            i11 = i10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                    }
                    int iMo320roundToPx0680j_110 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                    int iMo320roundToPx0680j_111 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                    Alignment.Companion companion115 = Alignment.INSTANCE;
                    j5 = jM1680copywmQWz5c$default;
                    Alignment centerStart9 = companion115.getCenterStart();
                    int i11111 = ((i11 >> 6) & 14) | 48;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    int i11112 = i11111 >> 3;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(centerStart9, false, composerStartRestartGroup, (i11112 & 14) | (i11112 & 112));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection17 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration17 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                    Function1<? super Integer, Integer> function13 = function3;
                    constructor = companion116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf17 = LayoutKt.materializerOf(modifier2);
                    int i11113 = ((((i11111 << 3) & 112) << 9) & 7168) | 6;
                    Modifier modifier12 = modifier2;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl17 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl17, measurePolicyRememberBoxMeasurePolicy9, companion116.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl17, density17, companion116.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl17, layoutDirection17, companion116.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl17, viewConfiguration17, companion116.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    androidx.compose.animation.OooOO0.OooO00o((i11113 >> 3) & 112, function3MaterializerOf17, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_12 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                    Alignment.Vertical centerVertically9 = companion115.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Modifier.Companion companion117 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy9 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_12, centerVertically9, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection18 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration18 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    constructor2 = companion116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf18 = LayoutKt.materializerOf(companion117);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM1320constructorimpl18 = Updater.m1320constructorimpl(composerStartRestartGroup);
                    Updater.m1327setimpl(composerM1320constructorimpl18, measurePolicyRowMeasurePolicy9, companion116.getSetMeasurePolicy());
                    Updater.m1327setimpl(composerM1320constructorimpl18, density18, companion116.getSetDensity());
                    Updater.m1327setimpl(composerM1320constructorimpl18, layoutDirection18, companion116.getSetLayoutDirection());
                    Updater.m1327setimpl(composerM1320constructorimpl18, viewConfiguration18, companion116.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    i12 = 0;
                    androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf18, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance9 = RowScopeInstance.INSTANCE;
                    modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion117, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                    composerStartRestartGroup.startReplaceableGroup(-29720124);
                    i13 = 0;
                    while (i12 < i) {
                        BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                        i12++;
                        i13 = 0;
                    }
                    o00O000o.OooO00o(composerStartRestartGroup);
                    modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                    Modifier modifierM527sizeVpY3zN12 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function13, o000000o2, i, iMo320roundToPx0680j_111, iMo320roundToPx0680j_110)), fM3775constructorimpl, f5);
                    if (i > 0) {
                        j6 = j5;
                        modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                    } else {
                        j6 = j5;
                    }
                    BoxKt.Box(modifierM527sizeVpY3zN12.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function13;
                    f7 = f6;
                    f8 = f5;
                    modifier3 = modifier12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(o000000o2, i, modifier3, function4, j6, jM1680copywmQWz5c$default2, fM3775constructorimpl, f8, f7, circleShape, i2, i3));
            }
            i4 |= 1572864;
            f4 = f;
            if ((i2 & 29360128) != 0) {
                i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(f2)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
            }
            if ((i2 & 1879048192) != 0) {
                i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i4 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                }
                int iMo320roundToPx0680j_112 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                int iMo320roundToPx0680j_113 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                Alignment.Companion companion118 = Alignment.INSTANCE;
                j5 = jM1680copywmQWz5c$default;
                Alignment centerStart10 = companion118.getCenterStart();
                int i11114 = ((i11 >> 6) & 14) | 48;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i11115 = i11114 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(centerStart10, false, composerStartRestartGroup, (i11115 & 14) | (i11115 & 112));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection19 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration19 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                Function1<? super Integer, Integer> function14 = function3;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf19 = LayoutKt.materializerOf(modifier2);
                int i11116 = ((((i11114 << 3) & 112) << 9) & 7168) | 6;
                Modifier modifier13 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl19 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl19, measurePolicyRememberBoxMeasurePolicy10, companion119.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl19, density19, companion119.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl19, layoutDirection19, companion119.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl19, viewConfiguration19, companion119.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                androidx.compose.animation.OooOO0.OooO00o((i11116 >> 3) & 112, function3MaterializerOf19, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_13 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                Alignment.Vertical centerVertically10 = companion118.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion1110 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy10 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_13, centerVertically10, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf110 = LayoutKt.materializerOf(companion1110);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl110 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl110, measurePolicyRowMeasurePolicy10, companion119.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl110, density110, companion119.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl110, layoutDirection110, companion119.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl110, viewConfiguration110, companion119.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                i12 = 0;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance10 = RowScopeInstance.INSTANCE;
                modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion1110, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                composerStartRestartGroup.startReplaceableGroup(-29720124);
                i13 = 0;
                while (i12 < i) {
                    BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                    i12++;
                    i13 = 0;
                }
                o00O000o.OooO00o(composerStartRestartGroup);
                modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                Modifier modifierM527sizeVpY3zN13 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function14, o000000o2, i, iMo320roundToPx0680j_113, iMo320roundToPx0680j_112)), fM3775constructorimpl, f5);
                if (i > 0) {
                    j6 = j5;
                    modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                } else {
                    j6 = j5;
                }
                BoxKt.Box(modifierM527sizeVpY3zN13.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function14;
                f7 = f6;
                f8 = f5;
                modifier3 = modifier13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                }
                int iMo320roundToPx0680j_114 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                int iMo320roundToPx0680j_115 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                Alignment.Companion companion1111 = Alignment.INSTANCE;
                j5 = jM1680copywmQWz5c$default;
                Alignment centerStart11 = companion1111.getCenterStart();
                int i11117 = ((i11 >> 6) & 14) | 48;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i11118 = i11117 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(centerStart11, false, composerStartRestartGroup, (i11118 & 14) | (i11118 & 112));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
                Function1<? super Integer, Integer> function15 = function3;
                constructor = companion1112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111 = LayoutKt.materializerOf(modifier2);
                int i11119 = ((((i11117 << 3) & 112) << 9) & 7168) | 6;
                Modifier modifier14 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl111 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl111, measurePolicyRememberBoxMeasurePolicy11, companion1112.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl111, density111, companion1112.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl111, layoutDirection111, companion1112.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl111, viewConfiguration111, companion1112.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                androidx.compose.animation.OooOO0.OooO00o((i11119 >> 3) & 112, function3MaterializerOf111, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_14 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                Alignment.Vertical centerVertically11 = companion1111.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion1113 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy11 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_14, centerVertically11, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion1112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf112 = LayoutKt.materializerOf(companion1113);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl112 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl112, measurePolicyRowMeasurePolicy11, companion1112.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl112, density112, companion1112.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl112, layoutDirection112, companion1112.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl112, viewConfiguration112, companion1112.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                i12 = 0;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf112, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance11 = RowScopeInstance.INSTANCE;
                modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion1113, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                composerStartRestartGroup.startReplaceableGroup(-29720124);
                i13 = 0;
                while (i12 < i) {
                    BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                    i12++;
                    i13 = 0;
                }
                o00O000o.OooO00o(composerStartRestartGroup);
                modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                Modifier modifierM527sizeVpY3zN14 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function15, o000000o2, i, iMo320roundToPx0680j_115, iMo320roundToPx0680j_114)), fM3775constructorimpl, f5);
                if (i > 0) {
                    j6 = j5;
                    modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                } else {
                    j6 = j5;
                }
                BoxKt.Box(modifierM527sizeVpY3zN14.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function15;
                f7 = f6;
                f8 = f5;
                modifier3 = modifier14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(o000000o2, i, modifier3, function4, j6, jM1680copywmQWz5c$default2, fM3775constructorimpl, f8, f7, circleShape, i2, i3));
        }
        i4 |= 3072;
        function2 = function1;
        if ((57344 & i2) == 0) {
            if ((i3 & 16) == 0) {
                j3 = j;
                if (composerStartRestartGroup.changed(j3)) {
                }
                i4 |= i15;
            } else {
                j3 = j;
            }
            i4 |= i15;
        } else {
            j3 = j;
        }
        if ((458752 & i2) == 0) {
            if ((i3 & 32) == 0) {
                j4 = j2;
                if (composerStartRestartGroup.changed(j4)) {
                }
                i4 |= i16;
            } else {
                j4 = j2;
            }
            i4 |= i16;
        } else {
            j4 = j2;
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            if ((3670016 & i2) == 0) {
                f4 = f;
                if (composerStartRestartGroup.changed(f4)) {
                    i8 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            if ((i2 & 29360128) != 0) {
                i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(f2)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            if ((i2 & 234881024) != 0) {
                i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
            }
            if ((i2 & 1879048192) != 0) {
                i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
            }
            if ((i4 & 1533916891) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                }
                int iMo320roundToPx0680j_116 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                int iMo320roundToPx0680j_117 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                Alignment.Companion companion1114 = Alignment.INSTANCE;
                j5 = jM1680copywmQWz5c$default;
                Alignment centerStart12 = companion1114.getCenterStart();
                int i111110 = ((i11 >> 6) & 14) | 48;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i111111 = i111110 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(centerStart12, false, composerStartRestartGroup, (i111111 & 14) | (i111111 & 112));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion1115 = ComposeUiNode.INSTANCE;
                Function1<? super Integer, Integer> function16 = function3;
                constructor = companion1115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf113 = LayoutKt.materializerOf(modifier2);
                int i111112 = ((((i111110 << 3) & 112) << 9) & 7168) | 6;
                Modifier modifier15 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl113 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl113, measurePolicyRememberBoxMeasurePolicy12, companion1115.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl113, density113, companion1115.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl113, layoutDirection113, companion1115.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl113, viewConfiguration113, companion1115.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                androidx.compose.animation.OooOO0.OooO00o((i111112 >> 3) & 112, function3MaterializerOf113, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_15 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                Alignment.Vertical centerVertically12 = companion1114.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion1116 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy12 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_15, centerVertically12, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion1115.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf114 = LayoutKt.materializerOf(companion1116);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl114 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl114, measurePolicyRowMeasurePolicy12, companion1115.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl114, density114, companion1115.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl114, layoutDirection114, companion1115.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl114, viewConfiguration114, companion1115.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                i12 = 0;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf114, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance12 = RowScopeInstance.INSTANCE;
                modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion1116, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                composerStartRestartGroup.startReplaceableGroup(-29720124);
                i13 = 0;
                while (i12 < i) {
                    BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                    i12++;
                    i13 = 0;
                }
                o00O000o.OooO00o(composerStartRestartGroup);
                modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                Modifier modifierM527sizeVpY3zN15 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function16, o000000o2, i, iMo320roundToPx0680j_117, iMo320roundToPx0680j_116)), fM3775constructorimpl, f5);
                if (i > 0) {
                    j6 = j5;
                    modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                } else {
                    j6 = j5;
                }
                BoxKt.Box(modifierM527sizeVpY3zN15.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function16;
                f7 = f6;
                f8 = f5;
                modifier3 = modifier15;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                } else {
                    if (i14 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i5 != 0) {
                        function3 = OooO0OO.f39818OooO0Oo;
                    } else {
                        function3 = function2;
                    }
                    if ((i3 & 16) != 0) {
                        jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -57345;
                    } else {
                        jM1680copywmQWz5c$default = j3;
                    }
                    if ((i3 & 32) != 0) {
                        jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                        i4 &= -458753;
                    } else {
                        jM1680copywmQWz5c$default2 = j4;
                    }
                    if (i7 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(8);
                    } else {
                        fM3775constructorimpl = f4;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = i4 & (-29360129);
                        f5 = fM3775constructorimpl;
                    } else {
                        i9 = i4;
                        f5 = f2;
                    }
                    if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                        i10 = i9 & (-234881025);
                        f6 = fM3775constructorimpl;
                    } else {
                        i10 = i9;
                        f6 = f3;
                    }
                    if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        circleShape = RoundedCornerShapeKt.getCircleShape();
                        i11 = (-1879048193) & i10;
                    } else {
                        circleShape = shape;
                        i11 = i10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
                }
                int iMo320roundToPx0680j_118 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
                int iMo320roundToPx0680j_119 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
                Alignment.Companion companion1117 = Alignment.INSTANCE;
                j5 = jM1680copywmQWz5c$default;
                Alignment centerStart13 = companion1117.getCenterStart();
                int i111113 = ((i11 >> 6) & 14) | 48;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                int i111114 = i111113 >> 3;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(centerStart13, false, composerStartRestartGroup, (i111114 & 14) | (i111114 & 112));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion1118 = ComposeUiNode.INSTANCE;
                Function1<? super Integer, Integer> function17 = function3;
                constructor = companion1118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf115 = LayoutKt.materializerOf(modifier2);
                int i111115 = ((((i111113 << 3) & 112) << 9) & 7168) | 6;
                Modifier modifier16 = modifier2;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl115 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl115, measurePolicyRememberBoxMeasurePolicy13, companion1118.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl115, density115, companion1118.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl115, layoutDirection115, companion1118.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl115, viewConfiguration115, companion1118.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                androidx.compose.animation.OooOO0.OooO00o((i111115 >> 3) & 112, function3MaterializerOf115, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_16 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
                Alignment.Vertical centerVertically13 = companion1117.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion1119 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy13 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_16, centerVertically13, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration116 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                constructor2 = companion1118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf116 = LayoutKt.materializerOf(companion1119);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM1320constructorimpl116 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Updater.m1327setimpl(composerM1320constructorimpl116, measurePolicyRowMeasurePolicy13, companion1118.getSetMeasurePolicy());
                Updater.m1327setimpl(composerM1320constructorimpl116, density116, companion1118.getSetDensity());
                Updater.m1327setimpl(composerM1320constructorimpl116, layoutDirection116, companion1118.getSetLayoutDirection());
                Updater.m1327setimpl(composerM1320constructorimpl116, viewConfiguration116, companion1118.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                i12 = 0;
                androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf116, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance13 = RowScopeInstance.INSTANCE;
                modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion1119, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
                composerStartRestartGroup.startReplaceableGroup(-29720124);
                i13 = 0;
                while (i12 < i) {
                    BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                    i12++;
                    i13 = 0;
                }
                o00O000o.OooO00o(composerStartRestartGroup);
                modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
                Modifier modifierM527sizeVpY3zN16 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function17, o000000o2, i, iMo320roundToPx0680j_119, iMo320roundToPx0680j_118)), fM3775constructorimpl, f5);
                if (i > 0) {
                    j6 = j5;
                    modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
                } else {
                    j6 = j5;
                }
                BoxKt.Box(modifierM527sizeVpY3zN16.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function17;
                f7 = f6;
                f8 = f5;
                modifier3 = modifier16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO(o000000o2, i, modifier3, function4, j6, jM1680copywmQWz5c$default2, fM3775constructorimpl, f8, f7, circleShape, i2, i3));
        }
        i4 |= 1572864;
        f4 = f;
        if ((i2 & 29360128) != 0) {
            i4 |= ((i3 & 128) == 0 || !composerStartRestartGroup.changed(f2)) ? Configuration.BLOCK_SIZE : 8388608;
        }
        if ((i2 & 234881024) != 0) {
            i4 |= ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 || !composerStartRestartGroup.changed(f3)) ? 33554432 : 67108864;
        }
        if ((i2 & 1879048192) != 0) {
            i4 |= ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 || !composerStartRestartGroup.changed(shape)) ? SQLiteDatabase.CREATE_IF_NECESSARY : 536870912;
        }
        if ((i4 & 1533916891) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    function3 = OooO0OO.f39818OooO0Oo;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -57345;
                } else {
                    jM1680copywmQWz5c$default = j3;
                }
                if ((i3 & 32) != 0) {
                    jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -458753;
                } else {
                    jM1680copywmQWz5c$default2 = j4;
                }
                if (i7 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(8);
                } else {
                    fM3775constructorimpl = f4;
                }
                if ((i3 & 128) != 0) {
                    i9 = i4 & (-29360129);
                    f5 = fM3775constructorimpl;
                } else {
                    i9 = i4;
                    f5 = f2;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i10 = i9 & (-234881025);
                    f6 = fM3775constructorimpl;
                } else {
                    i10 = i9;
                    f6 = f3;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    circleShape = RoundedCornerShapeKt.getCircleShape();
                    i11 = (-1879048193) & i10;
                } else {
                    circleShape = shape;
                    i11 = i10;
                }
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    function3 = OooO0OO.f39818OooO0Oo;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -57345;
                } else {
                    jM1680copywmQWz5c$default = j3;
                }
                if ((i3 & 32) != 0) {
                    jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -458753;
                } else {
                    jM1680copywmQWz5c$default2 = j4;
                }
                if (i7 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(8);
                } else {
                    fM3775constructorimpl = f4;
                }
                if ((i3 & 128) != 0) {
                    i9 = i4 & (-29360129);
                    f5 = fM3775constructorimpl;
                } else {
                    i9 = i4;
                    f5 = f2;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i10 = i9 & (-234881025);
                    f6 = fM3775constructorimpl;
                } else {
                    i10 = i9;
                    f6 = f3;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    circleShape = RoundedCornerShapeKt.getCircleShape();
                    i11 = (-1879048193) & i10;
                } else {
                    circleShape = shape;
                    i11 = i10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
            }
            int iMo320roundToPx0680j_1110 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
            int iMo320roundToPx0680j_1111 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
            Alignment.Companion companion11110 = Alignment.INSTANCE;
            j5 = jM1680copywmQWz5c$default;
            Alignment centerStart14 = companion11110.getCenterStart();
            int i111116 = ((i11 >> 6) & 14) | 48;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i111117 = i111116 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(centerStart14, false, composerStartRestartGroup, (i111117 & 14) | (i111117 & 112));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration117 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion11111 = ComposeUiNode.INSTANCE;
            Function1<? super Integer, Integer> function18 = function3;
            constructor = companion11111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf117 = LayoutKt.materializerOf(modifier2);
            int i111118 = ((((i111116 << 3) & 112) << 9) & 7168) | 6;
            Modifier modifier17 = modifier2;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1320constructorimpl117 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Updater.m1327setimpl(composerM1320constructorimpl117, measurePolicyRememberBoxMeasurePolicy14, companion11111.getSetMeasurePolicy());
            Updater.m1327setimpl(composerM1320constructorimpl117, density117, companion11111.getSetDensity());
            Updater.m1327setimpl(composerM1320constructorimpl117, layoutDirection117, companion11111.getSetLayoutDirection());
            Updater.m1327setimpl(composerM1320constructorimpl117, viewConfiguration117, companion11111.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            androidx.compose.animation.OooOO0.OooO00o((i111118 >> 3) & 112, function3MaterializerOf117, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_17 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
            Alignment.Vertical centerVertically14 = companion11110.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion11112 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy14 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_17, centerVertically14, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration118 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion11111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf118 = LayoutKt.materializerOf(companion11112);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1320constructorimpl118 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Updater.m1327setimpl(composerM1320constructorimpl118, measurePolicyRowMeasurePolicy14, companion11111.getSetMeasurePolicy());
            Updater.m1327setimpl(composerM1320constructorimpl118, density118, companion11111.getSetDensity());
            Updater.m1327setimpl(composerM1320constructorimpl118, layoutDirection118, companion11111.getSetLayoutDirection());
            Updater.m1327setimpl(composerM1320constructorimpl118, viewConfiguration118, companion11111.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            i12 = 0;
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf118, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance14 = RowScopeInstance.INSTANCE;
            modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion11112, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
            composerStartRestartGroup.startReplaceableGroup(-29720124);
            i13 = 0;
            while (i12 < i) {
                BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                i12++;
                i13 = 0;
            }
            o00O000o.OooO00o(composerStartRestartGroup);
            modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
            Modifier modifierM527sizeVpY3zN17 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function18, o000000o2, i, iMo320roundToPx0680j_1111, iMo320roundToPx0680j_1110)), fM3775constructorimpl, f5);
            if (i > 0) {
                j6 = j5;
                modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
            } else {
                j6 = j5;
            }
            BoxKt.Box(modifierM527sizeVpY3zN17.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function18;
            f7 = f6;
            f8 = f5;
            modifier3 = modifier17;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    function3 = OooO0OO.f39818OooO0Oo;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -57345;
                } else {
                    jM1680copywmQWz5c$default = j3;
                }
                if ((i3 & 32) != 0) {
                    jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -458753;
                } else {
                    jM1680copywmQWz5c$default2 = j4;
                }
                if (i7 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(8);
                } else {
                    fM3775constructorimpl = f4;
                }
                if ((i3 & 128) != 0) {
                    i9 = i4 & (-29360129);
                    f5 = fM3775constructorimpl;
                } else {
                    i9 = i4;
                    f5 = f2;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i10 = i9 & (-234881025);
                    f6 = fM3775constructorimpl;
                } else {
                    i10 = i9;
                    f6 = f3;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    circleShape = RoundedCornerShapeKt.getCircleShape();
                    i11 = (-1879048193) & i10;
                } else {
                    circleShape = shape;
                    i11 = i10;
                }
            } else {
                if (i14 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i5 != 0) {
                    function3 = OooO0OO.f39818OooO0Oo;
                } else {
                    function3 = function2;
                }
                if ((i3 & 16) != 0) {
                    jM1680copywmQWz5c$default = Color.m1680copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m1691unboximpl(), ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -57345;
                } else {
                    jM1680copywmQWz5c$default = j3;
                }
                if ((i3 & 32) != 0) {
                    jM1680copywmQWz5c$default2 = Color.m1680copywmQWz5c$default(jM1680copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable), 0.0f, 0.0f, 0.0f, 14, null);
                    i4 &= -458753;
                } else {
                    jM1680copywmQWz5c$default2 = j4;
                }
                if (i7 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(8);
                } else {
                    fM3775constructorimpl = f4;
                }
                if ((i3 & 128) != 0) {
                    i9 = i4 & (-29360129);
                    f5 = fM3775constructorimpl;
                } else {
                    i9 = i4;
                    f5 = f2;
                }
                if ((i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    i10 = i9 & (-234881025);
                    f6 = fM3775constructorimpl;
                } else {
                    i10 = i9;
                    f6 = f3;
                }
                if ((i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    circleShape = RoundedCornerShapeKt.getCircleShape();
                    i11 = (-1879048193) & i10;
                } else {
                    circleShape = shape;
                    i11 = i10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1605247238, i11, -1, "com.google.accompanist.pager.HorizontalPagerIndicator (PagerIndicator.kt:176)");
            }
            int iMo320roundToPx0680j_1112 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(fM3775constructorimpl);
            int iMo320roundToPx0680j_1113 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo320roundToPx0680j_4(f6);
            Alignment.Companion companion11113 = Alignment.INSTANCE;
            j5 = jM1680copywmQWz5c$default;
            Alignment centerStart15 = companion11113.getCenterStart();
            int i111119 = ((i11 >> 6) & 14) | 48;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i1111110 = i111119 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(centerStart15, false, composerStartRestartGroup, (i1111110 & 14) | (i1111110 & 112));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration119 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion11114 = ComposeUiNode.INSTANCE;
            Function1<? super Integer, Integer> function19 = function3;
            constructor = companion11114.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf119 = LayoutKt.materializerOf(modifier2);
            int i1111111 = ((((i111119 << 3) & 112) << 9) & 7168) | 6;
            Modifier modifier18 = modifier2;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1320constructorimpl119 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Updater.m1327setimpl(composerM1320constructorimpl119, measurePolicyRememberBoxMeasurePolicy15, companion11114.getSetMeasurePolicy());
            Updater.m1327setimpl(composerM1320constructorimpl119, density119, companion11114.getSetDensity());
            Updater.m1327setimpl(composerM1320constructorimpl119, layoutDirection119, companion11114.getSetLayoutDirection());
            Updater.m1327setimpl(composerM1320constructorimpl119, viewConfiguration119, companion11114.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            androidx.compose.animation.OooOO0.OooO00o((i1111111 >> 3) & 112, function3MaterializerOf119, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM392spacedBy0680j_18 = Arrangement.INSTANCE.m392spacedBy0680j_4(f6);
            Alignment.Vertical centerVertically15 = companion11113.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion11115 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy15 = RowKt.rowMeasurePolicy(horizontalOrVerticalM392spacedBy0680j_18, centerVertically15, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density1110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            constructor2 = companion11114.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1110 = LayoutKt.materializerOf(companion11115);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1320constructorimpl1110 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Updater.m1327setimpl(composerM1320constructorimpl1110, measurePolicyRowMeasurePolicy15, companion11114.getSetMeasurePolicy());
            Updater.m1327setimpl(composerM1320constructorimpl1110, density1110, companion11114.getSetDensity());
            Updater.m1327setimpl(composerM1320constructorimpl1110, layoutDirection1110, companion11114.getSetLayoutDirection());
            Updater.m1327setimpl(composerM1320constructorimpl1110, viewConfiguration1110, companion11114.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            i12 = 0;
            androidx.compose.animation.OooOO0.OooO00o(0, function3MaterializerOf1110, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance15 = RowScopeInstance.INSTANCE;
            modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.m527sizeVpY3zN4(companion11115, fM3775constructorimpl, f5), jM1680copywmQWz5c$default2, circleShape);
            composerStartRestartGroup.startReplaceableGroup(-29720124);
            i13 = 0;
            while (i12 < i) {
                BoxKt.Box(modifierM170backgroundbw27NRU, composerStartRestartGroup, i13);
                i12++;
                i13 = 0;
            }
            o00O000o.OooO00o(composerStartRestartGroup);
            modifierM170backgroundbw27NRU2 = Modifier.INSTANCE;
            Modifier modifierM527sizeVpY3zN18 = SizeKt.m527sizeVpY3zN4(OffsetKt.offset(modifierM170backgroundbw27NRU2, new OooO0o(function19, o000000o2, i, iMo320roundToPx0680j_1113, iMo320roundToPx0680j_1112)), fM3775constructorimpl, f5);
            if (i > 0) {
                j6 = j5;
                modifierM170backgroundbw27NRU2 = BackgroundKt.m170backgroundbw27NRU(modifierM170backgroundbw27NRU2, j6, circleShape);
            } else {
                j6 = j5;
            }
            BoxKt.Box(modifierM527sizeVpY3zN18.then(modifierM170backgroundbw27NRU2), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function19;
            f7 = f6;
            f8 = f5;
            modifier3 = modifier18;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(o000000o2, i, modifier3, function4, j6, jM1680copywmQWz5c$default2, fM3775constructorimpl, f8, f7, circleShape, i2, i3));
    }
}
