package p158o00OoOOO;

import androidx.annotation.DrawableRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.OooOOO;
import androidx.compose.material.TextKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000O0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p150o00Oo0oO.o00000OO;
import p156o00OoOO.OooOo00;
import p157o00OoOO0.o0OOO0o;
import p157o00OoOO0.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nBottomListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomListDialog.kt\ncom/code/android/yldialog/compose/BottomListDialogKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,302:1\n1855#2,2:303\n154#3:305\n154#3:342\n154#3:343\n154#3:403\n154#3:439\n164#3:440\n154#3:446\n72#4,6:306\n78#4:340\n82#4:402\n78#5,11:312\n78#5,11:364\n91#5:396\n91#5:401\n78#5,11:410\n91#5:444\n78#5,11:454\n91#5:486\n456#6,8:323\n464#6,3:337\n25#6:344\n50#6:351\n49#6:352\n456#6,8:375\n464#6,3:389\n467#6,3:393\n467#6,3:398\n456#6,8:421\n464#6,3:435\n467#6,3:441\n456#6,8:465\n464#6,3:479\n467#6,3:483\n25#6:488\n4144#7,6:331\n4144#7,6:383\n4144#7,6:429\n4144#7,6:473\n1#8:341\n1097#9,6:345\n1097#9,6:353\n1097#9,6:489\n67#10,5:359\n72#10:392\n76#10:397\n66#10,6:404\n72#10:438\n76#10:445\n72#11,7:447\n79#11:482\n83#11:487\n*S KotlinDebug\n*F\n+ 1 BottomListDialog.kt\ncom/code/android/yldialog/compose/BottomListDialogKt\n*L\n57#1:303,2\n150#1:305\n225#1:342\n230#1:343\n253#1:403\n264#1:439\n268#1:440\n279#1:446\n147#1:306,6\n147#1:340\n147#1:402\n147#1:312,11\n227#1:364,11\n227#1:396\n147#1:401\n251#1:410,11\n251#1:444\n280#1:454,11\n280#1:486\n147#1:323,8\n147#1:337,3\n233#1:344\n235#1:351\n235#1:352\n227#1:375,8\n227#1:389,3\n227#1:393,3\n147#1:398,3\n251#1:421,8\n251#1:435,3\n251#1:441,3\n280#1:465,8\n280#1:479,3\n280#1:483,3\n294#1:488\n147#1:331,6\n227#1:383,6\n251#1:429,6\n280#1:473,6\n233#1:345,6\n235#1:353,6\n294#1:489,6\n227#1:359,5\n227#1:392\n227#1:397\n251#1:404,6\n251#1:438\n251#1:445\n280#1:447,7\n280#1:482\n280#1:487\n*E\n"})
public final class o00Oo0 {

    public static final class OooO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Unit> f38306OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<T> f38307OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(Function2<? super Integer, ? super T, Unit> function2, List<? extends T> list) {
            super(1);
            this.f38306OooO0Oo = function2;
            this.f38307OooO0o0 = list;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            this.f38306OooO0Oo.invoke(Integer.valueOf(iIntValue), (T) this.f38307OooO0o0.get(iIntValue));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Integer, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f38308OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Integer num) {
            num.intValue();
            return Boolean.FALSE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f38309OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f38310OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<String> f38311OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f38312OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f38313OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f38314OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function4<RowScope, Integer, Composer, Integer, Unit> f38315OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function4<RowScope, Integer, Composer, Integer, Unit> f38316OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ long f38317OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38318OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Boolean> f38319OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ int f38320OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f38321OooOOOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(MutableState<Boolean> mutableState, String str, List<String> list, String str2, boolean z, Function1<? super Integer, Unit> function1, Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function5, long j, Function1<? super Integer, Boolean> function2, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f38310OooO0Oo = mutableState;
            this.f38312OooO0o0 = str;
            this.f38311OooO0o = list;
            this.f38313OooO0oO = str2;
            this.f38314OooO0oo = z;
            this.f38309OooO = function1;
            this.f38315OooOO0 = function4;
            this.f38316OooOO0O = function5;
            this.f38317OooOO0o = j;
            this.f38319OooOOO0 = function2;
            this.f38318OooOOO = function0;
            this.f38320OooOOOO = i;
            this.f38321OooOOOo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(110263364, iIntValue, -1, "com.code.android.yldialog.compose.BottomListDialog.<anonymous> (BottomListDialog.kt:115)");
                }
                MutableState<Boolean> mutableState = this.f38310OooO0Oo;
                String str = this.f38312OooO0o0;
                List<String> list = this.f38311OooO0o;
                String str2 = this.f38313OooO0oO;
                boolean z = this.f38314OooO0oo;
                Function1<Integer, Unit> function1 = this.f38309OooO;
                Function4<RowScope, Integer, Composer, Integer, Unit> function4 = this.f38315OooOO0;
                Function4<RowScope, Integer, Composer, Integer, Unit> function5 = this.f38316OooOO0O;
                long j = this.f38317OooOO0o;
                Function1<Integer, Boolean> function2 = this.f38319OooOOO0;
                Function0<Unit> function0 = this.f38318OooOOO;
                int i = this.f38320OooOOOO;
                o00Oo0.OooO0o0(mutableState, str, list, str2, z, function1, function4, function5, j, function2, function0, composer2, (i & 1879048192) | (i & 7168) | (i & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE | (i & 112) | (57344 & i) | (458752 & i) | (3670016 & i) | (29360128 & i) | (234881024 & i), (this.f38321OooOOOo >> 3) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f38322OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f38323OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<String> f38324OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f38325OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f38326OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f38327OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function4<RowScope, Integer, Composer, Integer, Unit> f38328OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function4<RowScope, Integer, Composer, Integer, Unit> f38329OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ long f38330OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38331OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Boolean> f38332OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38333OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f38334OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ int f38335OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f38336OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(MutableState<Boolean> mutableState, String str, List<String> list, String str2, boolean z, Function1<? super Integer, Unit> function1, Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function5, long j, Function1<? super Integer, Boolean> function2, Function0<Unit> function0, Function0<Unit> function3, int i, int i2, int i3) {
            super(2);
            this.f38323OooO0Oo = mutableState;
            this.f38325OooO0o0 = str;
            this.f38324OooO0o = list;
            this.f38326OooO0oO = str2;
            this.f38327OooO0oo = z;
            this.f38322OooO = function1;
            this.f38328OooOO0 = function4;
            this.f38329OooOO0O = function5;
            this.f38330OooOO0o = j;
            this.f38332OooOOO0 = function2;
            this.f38331OooOOO = function0;
            this.f38333OooOOOO = function3;
            this.f38334OooOOOo = i;
            this.f38336OooOOo0 = i2;
            this.f38335OooOOo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00Oo0.OooO00o(this.f38323OooO0Oo, this.f38325OooO0o0, this.f38324OooO0o, this.f38326OooO0oO, this.f38327OooO0oo, this.f38322OooO, this.f38328OooOO0, this.f38329OooOO0O, this.f38330OooOO0o, this.f38332OooOOO0, this.f38331OooOOO, this.f38333OooOOOO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38334OooOOOo | 1), RecomposeScopeImplKt.updateChangedFlags(this.f38336OooOOo0), this.f38335OooOOo);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class OooO0o<T> extends Lambda implements Function2<Integer, T, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f38337OooO0Oo = new OooO0o();

        public OooO0o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Integer num, Object obj) {
            num.intValue();
            Intrinsics.checkNotNullParameter((OooOo00) obj, "<anonymous parameter 1>");
            return Boolean.FALSE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Integer, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Boolean> f38338OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<T> f38339OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(Function2<? super Integer, ? super T, Boolean> function2, List<? extends T> list) {
            super(1);
            this.f38338OooO0Oo = function2;
            this.f38339OooO0o0 = list;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Integer num) {
            int iIntValue = num.intValue();
            return this.f38338OooO0Oo.invoke(Integer.valueOf(iIntValue), (T) this.f38339OooO0o0.get(iIntValue));
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Unit> f38340OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f38341OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<T> f38342OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f38343OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f38344OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f38345OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ Function4<RowScope, Integer, Composer, Integer, Unit> f38346OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Function4<RowScope, Integer, Composer, Integer, Unit> f38347OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ long f38348OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38349OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ Function2<Integer, T, Boolean> f38350OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f38351OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public final /* synthetic */ int f38352OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public final /* synthetic */ int f38353OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final /* synthetic */ int f38354OooOOo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(MutableState<Boolean> mutableState, String str, List<? extends T> list, String str2, boolean z, Function2<? super Integer, ? super T, Unit> function2, Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function5, long j, Function2<? super Integer, ? super T, Boolean> function3, Function0<Unit> function0, Function0<Unit> function1, int i, int i2, int i3) {
            super(2);
            this.f38341OooO0Oo = mutableState;
            this.f38343OooO0o0 = str;
            this.f38342OooO0o = list;
            this.f38344OooO0oO = str2;
            this.f38345OooO0oo = z;
            this.f38340OooO = function2;
            this.f38346OooOO0 = function4;
            this.f38347OooOO0O = function5;
            this.f38348OooOO0o = j;
            this.f38350OooOOO0 = function3;
            this.f38349OooOOO = function0;
            this.f38351OooOOOO = function1;
            this.f38352OooOOOo = i;
            this.f38354OooOOo0 = i2;
            this.f38353OooOOo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00Oo0.OooO0O0(this.f38341OooO0Oo, this.f38343OooO0o0, this.f38342OooO0o, this.f38344OooO0oO, this.f38345OooO0oo, this.f38340OooO, this.f38346OooOO0, this.f38347OooOO0O, this.f38348OooOO0o, this.f38350OooOOO0, this.f38349OooOOO, this.f38351OooOOOO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38352OooOOOo | 1), RecomposeScopeImplKt.updateChangedFlags(this.f38354OooOOo0), this.f38353OooOOo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f38355OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f38356OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f38357OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f38358OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f38359OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(float f, float f2, int i, int i2, int i3) {
            super(2);
            this.f38355OooO0Oo = i;
            this.f38357OooO0o0 = f;
            this.f38356OooO0o = f2;
            this.f38358OooO0oO = i2;
            this.f38359OooO0oo = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00Oo0.OooO0OO(this.f38355OooO0Oo, this.f38357OooO0o0, this.f38356OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38358OooO0oO | 1), this.f38359OooO0oo);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@NotNull MutableState<Boolean> show, @Nullable String str, @NotNull List<String> list, @Nullable String str2, boolean z, @NotNull Function1<? super Integer, Unit> onItemClick, @Nullable Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, @Nullable Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function5, long j, @Nullable Function1<? super Integer, Boolean> function1, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function2, @Nullable Composer composer, int i, int i2, int i3) {
        String strStringResource;
        int i4;
        Intrinsics.checkNotNullParameter(show, "show");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1096356626);
        String str3 = (i3 & 2) != 0 ? null : str;
        if ((i3 & 8) != 0) {
            strStringResource = StringResources_androidKt.stringResource(o0ooOOo.yl_dialog_Cancel, composerStartRestartGroup, 0);
            i4 = i & (-7169);
        } else {
            strStringResource = str2;
            i4 = i;
        }
        boolean z2 = (i3 & 16) != 0 ? true : z;
        Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function6 = (i3 & 64) != 0 ? null : function4;
        Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function7 = (i3 & 128) != 0 ? null : function5;
        long jColor = (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? ColorKt.Color(4278245577L) : j;
        Function1<? super Integer, Boolean> function3 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? OooO00o.f38308OooO0Oo : function1;
        Function0<Unit> function8 = (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : function0;
        Function0<Unit> function9 = (i3 & 2048) != 0 ? null : function2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1096356626, i4, i2, "com.code.android.yldialog.compose.BottomListDialog (BottomListDialog.kt:94)");
        }
        int i5 = i4;
        p158o00OoOOO.OooOOO0.OooO00o(show, true, false, function9, function8, 80, o0OOO0o.WindowAnimBottomWithAlpha, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 110263364, true, new OooO0O0(show, str3, list, strStringResource, z2, onItemClick, function6, function7, jColor, function3, function9, i5, i2)), composerStartRestartGroup, (i5 & 14) | 100663344 | ((i2 << 6) & 7168) | ((i2 << 12) & 57344), 132);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(show, str3, list, strStringResource, z2, onItemClick, function6, function7, jColor, function3, function8, function9, i, i2, i3));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final <T extends OooOo00> void OooO0O0(@NotNull MutableState<Boolean> show, @Nullable String str, @NotNull List<? extends T> list, @Nullable String str2, boolean z, @NotNull Function2<? super Integer, ? super T, Unit> onItemClick, @Nullable Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, @Nullable Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function5, long j, @Nullable Function2<? super Integer, ? super T, Boolean> function2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Composer composer, int i, int i2, int i3) {
        String strStringResource;
        int i4;
        Intrinsics.checkNotNullParameter(show, "show");
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1815463977);
        String str3 = (i3 & 2) != 0 ? null : str;
        if ((i3 & 8) != 0) {
            strStringResource = StringResources_androidKt.stringResource(o0ooOOo.yl_dialog_Cancel, composerStartRestartGroup, 0);
            i4 = i & (-7169);
        } else {
            strStringResource = str2;
            i4 = i;
        }
        boolean z2 = (i3 & 16) != 0 ? true : z;
        Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function6 = (i3 & 64) != 0 ? null : function4;
        Function4<? super RowScope, ? super Integer, ? super Composer, ? super Integer, Unit> function7 = (i3 & 128) != 0 ? null : function5;
        long jColor = (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? ColorKt.Color(4278245577L) : j;
        Function2<? super Integer, ? super T, Boolean> function3 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? OooO0o.f38337OooO0Oo : function2;
        Function0<Unit> function8 = (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : function0;
        Function0<Unit> function9 = (i3 & 2048) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1815463977, i4, i2, "com.code.android.yldialog.compose.BottomListEntityDialog (BottomListDialog.kt:41)");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((OooOo00) it.next()).getText());
        }
        OooO00o(show, str3, arrayList, strStringResource, z2, new OooO(onItemClick, list), function6, function7, jColor, new OooOO0(function3, list), function8, function9, composerStartRestartGroup, (i4 & 14) | ConstantsKt.MINIMUM_BLOCK_SIZE | (i4 & 112) | (i4 & 7168) | (57344 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4), (i2 & 14) | (i2 & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(show, str3, list, strStringResource, z2, onItemClick, function6, function7, jColor, function3, function8, function9, i, i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x0141  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(@DrawableRes int i, float f, float f2, @Nullable Composer composer, int i2, int i3) {
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        float fM3765constructorimpl;
        float fM3765constructorimpl2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(857584205);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 112) == 0) {
                f3 = f;
                i4 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 896) == 0) {
                    f4 = f2;
                    if (composerStartRestartGroup.changed(f4)) {
                        i6 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i4 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        fM3765constructorimpl = Dp.m3765constructorimpl(24);
                    } else {
                        fM3765constructorimpl = f3;
                    }
                    if (i5 != 0) {
                        fM3765constructorimpl2 = Dp.m3765constructorimpl(10);
                    } else {
                        fM3765constructorimpl2 = f4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(857584205, i4, -1, "com.code.android.yldialog.compose.BottomListItemImage (BottomListDialog.kt:278)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                    if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14);
                    Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(companion, fM3765constructorimpl);
                    float f6 = fM3765constructorimpl;
                    ImageKt.Image(painterPainterResource, (String) null, modifierM523size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    f4 = fM3765constructorimpl2;
                    com.code.android.util.OooOO0.OooO0Oo(f4, null, composerStartRestartGroup, (i4 >> 6) & 14, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f3 = f6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                f5 = f4;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(f3, f5, i, i2, i3));
            }
            i4 |= 384;
            f4 = f2;
            if ((i4 & 731) == 146) {
                if (i7 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(24);
                } else {
                    fM3765constructorimpl = f3;
                }
                if (i5 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(10);
                } else {
                    fM3765constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(857584205, i4, -1, "com.code.android.yldialog.compose.BottomListItemImage (BottomListDialog.kt:278)");
                }
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o2, composerM1309constructorimpl, currentCompositionLocalMap2);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                Painter painterPainterResource2 = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14);
                Modifier modifierM523size3ABfNKs2 = SizeKt.m523size3ABfNKs(companion3, fM3765constructorimpl);
                float f7 = fM3765constructorimpl;
                ImageKt.Image(painterPainterResource2, (String) null, modifierM523size3ABfNKs2, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                f4 = fM3765constructorimpl2;
                com.code.android.util.OooOO0.OooO0Oo(f4, null, composerStartRestartGroup, (i4 >> 6) & 14, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = f7;
            } else {
                if (i7 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(24);
                } else {
                    fM3765constructorimpl = f3;
                }
                if (i5 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(10);
                } else {
                    fM3765constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(857584205, i4, -1, "com.code.android.yldialog.compose.BottomListItemImage (BottomListDialog.kt:278)");
                }
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyOooO00o3 = OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion5);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyOooO00o3, composerM1309constructorimpl, currentCompositionLocalMap3);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                Painter painterPainterResource3 = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14);
                Modifier modifierM523size3ABfNKs3 = SizeKt.m523size3ABfNKs(companion5, fM3765constructorimpl);
                float f8 = fM3765constructorimpl;
                ImageKt.Image(painterPainterResource3, (String) null, modifierM523size3ABfNKs3, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                f4 = fM3765constructorimpl2;
                com.code.android.util.OooOO0.OooO0Oo(f4, null, composerStartRestartGroup, (i4 >> 6) & 14, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = f8;
            }
            f5 = f4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(f3, f5, i, i2, i3));
        }
        i4 |= 48;
        f3 = f;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 896) == 0) {
                f4 = f2;
                if (composerStartRestartGroup.changed(f4)) {
                    i6 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i4 & 731) == 146) {
                if (i7 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(24);
                } else {
                    fM3765constructorimpl = f3;
                }
                if (i5 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(10);
                } else {
                    fM3765constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(857584205, i4, -1, "com.code.android.yldialog.compose.BottomListItemImage (BottomListDialog.kt:278)");
                }
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion7 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyOooO00o4 = OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                constructor = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion7);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion8, composerM1309constructorimpl, measurePolicyOooO00o4, composerM1309constructorimpl, currentCompositionLocalMap4);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                Painter painterPainterResource4 = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14);
                Modifier modifierM523size3ABfNKs4 = SizeKt.m523size3ABfNKs(companion7, fM3765constructorimpl);
                float f9 = fM3765constructorimpl;
                ImageKt.Image(painterPainterResource4, (String) null, modifierM523size3ABfNKs4, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                f4 = fM3765constructorimpl2;
                com.code.android.util.OooOO0.OooO0Oo(f4, null, composerStartRestartGroup, (i4 >> 6) & 14, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = f9;
            } else {
                if (i7 != 0) {
                    fM3765constructorimpl = Dp.m3765constructorimpl(24);
                } else {
                    fM3765constructorimpl = f3;
                }
                if (i5 != 0) {
                    fM3765constructorimpl2 = Dp.m3765constructorimpl(10);
                } else {
                    fM3765constructorimpl2 = f4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(857584205, i4, -1, "com.code.android.yldialog.compose.BottomListItemImage (BottomListDialog.kt:278)");
                }
                composerStartRestartGroup.startReplaceableGroup(693286680);
                Modifier.Companion companion9 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyOooO00o5 = OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                constructor = companion10.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion9);
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
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion10, composerM1309constructorimpl, measurePolicyOooO00o5, composerM1309constructorimpl, currentCompositionLocalMap5);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                Painter painterPainterResource5 = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14);
                Modifier modifierM523size3ABfNKs5 = SizeKt.m523size3ABfNKs(companion9, fM3765constructorimpl);
                float f10 = fM3765constructorimpl;
                ImageKt.Image(painterPainterResource5, (String) null, modifierM523size3ABfNKs5, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                f4 = fM3765constructorimpl2;
                com.code.android.util.OooOO0.OooO0Oo(f4, null, composerStartRestartGroup, (i4 >> 6) & 14, 2);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = f10;
            }
            f5 = f4;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(f3, f5, i, i2, i3));
        }
        i4 |= 384;
        f4 = f2;
        if ((i4 & 731) == 146) {
            if (i7 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(24);
            } else {
                fM3765constructorimpl = f3;
            }
            if (i5 != 0) {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(10);
            } else {
                fM3765constructorimpl2 = f4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(857584205, i4, -1, "com.code.android.yldialog.compose.BottomListItemImage (BottomListDialog.kt:278)");
            }
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion11 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyOooO00o6 = OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
            constructor = companion12.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion11);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion12, composerM1309constructorimpl, measurePolicyOooO00o6, composerM1309constructorimpl, currentCompositionLocalMap6);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
            Painter painterPainterResource6 = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14);
            Modifier modifierM523size3ABfNKs6 = SizeKt.m523size3ABfNKs(companion11, fM3765constructorimpl);
            float f11 = fM3765constructorimpl;
            ImageKt.Image(painterPainterResource6, (String) null, modifierM523size3ABfNKs6, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            f4 = fM3765constructorimpl2;
            com.code.android.util.OooOO0.OooO0Oo(f4, null, composerStartRestartGroup, (i4 >> 6) & 14, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f11;
        } else {
            if (i7 != 0) {
                fM3765constructorimpl = Dp.m3765constructorimpl(24);
            } else {
                fM3765constructorimpl = f3;
            }
            if (i5 != 0) {
                fM3765constructorimpl2 = Dp.m3765constructorimpl(10);
            } else {
                fM3765constructorimpl2 = f4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(857584205, i4, -1, "com.code.android.yldialog.compose.BottomListItemImage (BottomListDialog.kt:278)");
            }
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion13 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyOooO00o7 = OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
            constructor = companion14.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(companion13);
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
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion14, composerM1309constructorimpl, measurePolicyOooO00o7, composerM1309constructorimpl, currentCompositionLocalMap7);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
            Painter painterPainterResource7 = PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i4 & 14);
            Modifier modifierM523size3ABfNKs7 = SizeKt.m523size3ABfNKs(companion13, fM3765constructorimpl);
            float f12 = fM3765constructorimpl;
            ImageKt.Image(painterPainterResource7, (String) null, modifierM523size3ABfNKs7, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            f4 = fM3765constructorimpl2;
            com.code.android.util.OooOO0.OooO0Oo(f4, null, composerStartRestartGroup, (i4 >> 6) & 14, 2);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f3 = f12;
        }
        f5 = f4;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(f3, f5, i, i2, i3));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(int i, int i2, Composer composer, Modifier modifier, String str) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1606949630);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1606949630, i5, -1, "com.code.android.yldialog.compose.TitleView (BottomListDialog.kt:249)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m511heightInVpY3zN4$default(modifier3, Dp.m3765constructorimpl(50), 0.0f, 2, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long jOooO0OO = o0000O0.OooO0OO(16, composerStartRestartGroup, 6);
            FontWeight medium = FontWeight.INSTANCE.getMedium();
            int iM3671getCentere0LSkKk = TextAlign.INSTANCE.m3671getCentere0LSkKk();
            long j = o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifier4 = modifier3;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(str, PaddingKt.m477paddingVpY3zN4(boxScopeInstance.align(companion3, companion.getCenter()), Dp.m3765constructorimpl(40), Dp.m3765constructorimpl(15)), j, jOooO0OO, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3671getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i5 >> 3) & 14) | 196608, 0, 130512);
            DividerKt.m1058DivideroMI9zvI(boxScopeInstance.align(companion3, companion.getBottomCenter()), o000OOo.OooO0OO(composer2).f37706OooO0o, Dp.m3765constructorimpl((float) 0.5d), 0.0f, composer2, 384, 8);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(modifier2, str, i, i2));
    }

    public static final void OooO0o0(MutableState mutableState, String str, List list, String str2, boolean z, Function1 function1, Function4 function4, Function4 function5, long j, Function1 function2, Function0 function0, Composer composer, int i, int i2, int i3) {
        String strStringResource;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-665534631);
        String str3 = (i3 & 2) != 0 ? null : str;
        if ((i3 & 8) != 0) {
            strStringResource = StringResources_androidKt.stringResource(o0ooOOo.yl_dialog_Cancel, composerStartRestartGroup, 0);
            i4 = i & (-7169);
        } else {
            strStringResource = str2;
            i4 = i;
        }
        boolean z2 = (i3 & 16) != 0 ? true : z;
        Function4 function6 = (i3 & 64) != 0 ? null : function4;
        Function4 function7 = (i3 & 128) != 0 ? null : function5;
        long jColor = (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? ColorKt.Color(4278245577L) : j;
        Function1 function3 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? OooOOOO.f38275OooO0Oo : function2;
        Function0 function8 = (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? null : function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-665534631, i4, i2, "com.code.android.yldialog.compose.BaseDialogContent (BottomListDialog.kt:133)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 16;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 0.0f, 0.0f, 12, null)), o000OOo.OooO0OO(composerStartRestartGroup).f37707OooO0o0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1112093159);
        if (str3 != null) {
            OooO0Oo(0, 1, composerStartRestartGroup, null, str3);
            Unit unit = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        String str4 = str3;
        Function0 function9 = function8;
        int i5 = i4;
        LazyDslKt.LazyColumn(columnScopeInstance.weight(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false), null, null, false, null, null, null, false, new o000oOoO(list, z2, mutableState, function1, function3, jColor, function6, function7, i4), composerStartRestartGroup, 0, 254);
        DividerKt.m1058DivideroMI9zvI(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(10)), o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO, 0.0f, 0.0f, composerStartRestartGroup, 6, 12);
        Alignment center = companion2.getCenter();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(50)), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue == companion4.getEmpty()) {
            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
        Indication indicationM1277rememberRipple9IZ8Weo = RippleKt.m1277rememberRipple9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7);
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function9);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = new o0OoOo0(mutableState, function9);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM200clickableO2vRcR0$default = ClickableKt.m200clickableO2vRcR0$default(modifierFillMaxWidth$default, mutableInteractionSource, indicationM1277rememberRipple9IZ8Weo, false, null, null, (Function0) objRememberedValue2, 28, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM200clickableO2vRcR0$default);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        TextKt.m1251Text4IGK_g(strStringResource, (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, o0000O0.OooO0OO(16, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i5 >> 9) & 14, 0, 131058);
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(mutableState, str4, list, strStringResource, z2, function1, function6, function7, jColor, function3, function9, i, i2, i3));
    }
}
