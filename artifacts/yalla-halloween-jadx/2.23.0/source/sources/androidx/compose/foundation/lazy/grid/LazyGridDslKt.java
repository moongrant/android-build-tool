package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a~\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001a\u001a&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0002\u001a?\u0010!\u001a\u0019\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"¢\u0006\u0002\b\u00162\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0000¢\u0006\u0002\u0010&\u001a?\u0010'\u001a\u0019\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"¢\u0006\u0002\b\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0000¢\u0006\u0002\u0010(\u001aá\u0001\u0010)\u001a\u00020\u0001\"\u0004\b\u0000\u0010**\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0+2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\u001420\b\n\u00101\u001a*\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000203\u0018\u00010\"¢\u0006\u0002\b\u00162%\b\n\u00104\u001a\u001f\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\u001423\b\u0004\u00105\u001a-\u0012\u0004\u0012\u000206\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b7¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u00108\u001aá\u0001\u0010)\u001a\u00020\u0001\"\u0004\b\u0000\u0010**\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0\u001c2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\u001420\b\n\u00101\u001a*\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000203\u0018\u00010\"¢\u0006\u0002\b\u00162%\b\n\u00104\u001a\u001f\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\u001423\b\u0004\u00105\u001a-\u0012\u0004\u0012\u000206\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b7¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u00109\u001aµ\u0002\u0010:\u001a\u00020\u0001\"\u0004\b\u0000\u0010**\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0+2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\"2E\b\n\u00101\u001a?\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000203\u0018\u00010<¢\u0006\u0002\b\u00162:\b\u0006\u00104\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\"2H\b\u0004\u00105\u001aB\u0012\u0004\u0012\u000206\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b7¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010=\u001aµ\u0002\u0010:\u001a\u00020\u0001\"\u0004\b\u0000\u0010**\u00020\u00152\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H*0\u001c2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\"2E\b\n\u00101\u001a?\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000203\u0018\u00010<¢\u0006\u0002\b\u00162:\b\u0006\u00104\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\"2H\b\u0004\u00105\u001aB\u0012\u0004\u0012\u000206\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H*¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b7¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010>\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006?"}, d2 = {"LazyHorizontalGrid", "", "rows", "Landroidx/compose/foundation/lazy/grid/GridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalGrid", "columns", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "calculateCellsCrossAxisSizeImpl", "", "", "gridSize", "slotCount", "spacing", "rememberColumnWidthSums", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "items", "T", "", "key", "Lkotlin/ParameterName;", "name", "item", "", "span", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "contentType", "itemContent", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,557:1\n154#2:558\n154#2:559\n67#3,3:560\n66#3:563\n67#3,3:570\n66#3:573\n1097#4,6:564\n1097#4,6:574\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt\n*L\n66#1:558\n119#1:559\n149#1:560,3\n149#1:563\n182#1:570,3\n182#1:573\n149#1:564,6\n182#1:574,6\n*E\n"})
public final class LazyGridDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$10\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass10 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Composable
        public final void invoke(@NotNull LazyGridItemScope items, int i, @Nullable Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(items) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407562193, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:520)");
            }
            this.$itemContent.invoke(items, this.$items[i], composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass2 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$key = function1;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke((T) this.$items.get(i));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$3\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass3 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<LazyGridItemSpanScope, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, List<? extends T> list) {
            super(2);
            this.$span = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m589boximpl(m598invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m598invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.$span.invoke(lazyGridItemSpanScope, (T) this.$items.get(i)).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$4\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass4 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$contentType = function1;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object invoke(int i) {
            return this.$contentType.invoke((T) this.$items.get(i));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass5 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyGridItemScope items, int i, @Nullable Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(items) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:454)");
            }
            this.$itemContent.invoke(items, (T) this.$items.get(i), composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$7\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass7 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$key = function1;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke(this.$items[i]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$8\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass8 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<LazyGridItemSpanScope, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, T[] tArr) {
            super(2);
            this.$span = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m589boximpl(m599invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m599invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.$span.invoke(lazyGridItemSpanScope, this.$items[i]).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$9\n*L\n1#1,557:1\n*E\n"})
    public static final class AnonymousClass9 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$contentType = function1;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Nullable
        public final Object invoke(int i) {
            return this.$contentType.invoke(this.$items[i]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$10\n*L\n1#1,557:1\n*E\n"})
    public static final class C070110 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C070110(Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Composable
        public final void invoke(@NotNull LazyGridItemScope items, int i, @Nullable Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(items) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-911455938, i3, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:553)");
            }
            this.$itemContent.invoke(items, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$2\n*L\n1#1,557:1\n*E\n"})
    public static final class C07022 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07022(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$key = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), (T) this.$items.get(i));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$3\n*L\n1#1,557:1\n*E\n"})
    public static final class C07033 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function3<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07033(Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, List<? extends T> list) {
            super(2);
            this.$span = function3;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m589boximpl(m600invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m600invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i), (T) this.$items.get(i)).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$4\n*L\n1#1,557:1\n*E\n"})
    public static final class C07044 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07044(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$contentType = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Nullable
        public final Object invoke(int i) {
            return this.$contentType.invoke(Integer.valueOf(i), (T) this.$items.get(i));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$5\n*L\n1#1,557:1\n*E\n"})
    public static final class C07055 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07055(Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyGridItemScope items, int i, @Nullable Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(items) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1229287273, i3, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:487)");
            }
            this.$itemContent.invoke(items, Integer.valueOf(i), (T) this.$items.get(i), composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$7\n*L\n1#1,557:1\n*E\n"})
    public static final class C07077 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07077(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$key = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), this.$items[i]);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "T", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "it", "", "invoke-_-orMbw", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;I)J"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$8\n*L\n1#1,557:1\n*E\n"})
    public static final class C07088 extends Lambda implements Function2<LazyGridItemSpanScope, Integer, GridItemSpan> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function3<LazyGridItemSpanScope, Integer, T, GridItemSpan> $span;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07088(Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, T[] tArr) {
            super(2);
            this.$span = function3;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ GridItemSpan invoke(LazyGridItemSpanScope lazyGridItemSpanScope, Integer num) {
            return GridItemSpan.m589boximpl(m601invoke_orMbw(lazyGridItemSpanScope, num.intValue()));
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: invoke-_-orMbw, reason: not valid java name */
        public final long m601invoke_orMbw(@NotNull LazyGridItemSpanScope lazyGridItemSpanScope, int i) {
            Intrinsics.checkNotNullParameter(lazyGridItemSpanScope, "$this$null");
            return this.$span.invoke(lazyGridItemSpanScope, Integer.valueOf(i), this.$items[i]).getPackedValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$itemsIndexed$9\n*L\n1#1,557:1\n*E\n"})
    public static final class C07099 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C07099(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$contentType = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Nullable
        public final Object invoke(int i) {
            return this.$contentType.invoke(Integer.valueOf(i), this.$items[i]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x0136  */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0165  */
    /* JADX WARN: Code duplicated, block: B:130:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0194  */
    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:135:0x019e  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:164:0x0206  */
    /* JADX WARN: Code duplicated, block: B:167:0x026c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0285  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyHorizontalGrid(@NotNull final GridCells rows, @Nullable Modifier modifier, @Nullable LazyGridState lazyGridState, @Nullable PaddingValues paddingValues, boolean z, @Nullable Arrangement.Horizontal horizontal, @Nullable Arrangement.Vertical vertical, @Nullable FlingBehavior flingBehavior, boolean z2, @NotNull final Function1<? super LazyGridScope, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        LazyGridState lazyGridState2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        Arrangement.Horizontal horizontal2;
        int i8;
        Arrangement.Vertical vertical2;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier modifier2;
        LazyGridState lazyGridStateRememberLazyGridState;
        PaddingValues paddingValuesM469PaddingValues0680j_4;
        boolean z4;
        Arrangement.Horizontal end;
        Arrangement.Vertical top;
        FlingBehavior flingBehavior2;
        boolean z5;
        LazyGridState lazyGridState3;
        boolean z6;
        PaddingValues paddingValues3;
        Arrangement.Horizontal horizontal3;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior3;
        Arrangement arrangement;
        final Modifier modifier3;
        final Arrangement.Vertical vertical4;
        final PaddingValues paddingValues4;
        final LazyGridState lazyGridState4;
        final boolean z7;
        final Arrangement.Horizontal horizontal4;
        final FlingBehavior flingBehavior4;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2123608858);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(rows) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    lazyGridState2 = lazyGridState;
                    int i14 = composerStartRestartGroup.changed(lazyGridState2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i3 |= i14;
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i3 |= i14;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        z3 = z;
                        if (composerStartRestartGroup.changed(z3)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            horizontal2 = horizontal;
                            int i15 = composerStartRestartGroup.changed(horizontal2) ? 131072 : 65536;
                            i3 |= i15;
                        } else {
                            horizontal2 = horizontal;
                        }
                        i3 |= i15;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        i3 |= 1572864;
                        vertical2 = vertical;
                    } else {
                        vertical2 = vertical;
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(vertical2)) {
                                i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                    }
                    if ((i & 29360128) != 0) {
                        i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                    }
                    i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i10 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(z2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((i & 1879048192) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i12 = 536870912;
                            } else {
                                i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                            }
                        }
                        if ((1533916891 & i3) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if ((i2 & 4) != 0) {
                                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridStateRememberLazyGridState = lazyGridState2;
                                }
                                if (i4 != 0) {
                                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                                } else {
                                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                                }
                                z4 = i6 == 0 ? z3 : false;
                                if ((i2 & 32) != 0) {
                                    arrangement = Arrangement.INSTANCE;
                                    if (z4) {
                                        end = arrangement.getEnd();
                                    } else {
                                        end = arrangement.getStart();
                                    }
                                    i3 &= -458753;
                                } else {
                                    end = horizontal2;
                                }
                                if (i8 != 0) {
                                    top = Arrangement.INSTANCE.getTop();
                                } else {
                                    top = vertical2;
                                }
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i10 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = z2;
                                }
                                lazyGridState3 = lazyGridStateRememberLazyGridState;
                                z6 = z4;
                                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                                horizontal3 = end;
                                vertical3 = top;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                modifier2 = modifier;
                                flingBehavior3 = flingBehavior;
                                z5 = z2;
                                lazyGridState3 = lazyGridState2;
                                z6 = z3;
                                horizontal3 = horizontal2;
                                paddingValues3 = paddingValues2;
                                vertical3 = vertical2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                            }
                            int i16 = i3 >> 3;
                            Arrangement.Vertical vertical5 = vertical3;
                            PaddingValues paddingValues5 = paddingValues3;
                            LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i16 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i16 & 14) | 196608 | (i16 & 112) | (i3 & 7168) | (57344 & i3) | (i16 & 3670016) | (i16 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            vertical4 = vertical5;
                            paddingValues4 = paddingValues5;
                            lazyGridState4 = lazyGridState3;
                            z7 = z6;
                            horizontal4 = horizontal3;
                            flingBehavior4 = flingBehavior3;
                            z8 = z5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z8 = z2;
                            lazyGridState4 = lazyGridState2;
                            paddingValues4 = paddingValues2;
                            vertical4 = vertical2;
                            z7 = z3;
                            horizontal4 = horizontal2;
                            flingBehavior4 = flingBehavior;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i17) {
                                LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i12 = 805306368;
                    i3 |= i12;
                    if ((1533916891 & i3) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i17 = i3 >> 3;
                        Arrangement.Vertical vertical6 = vertical3;
                        PaddingValues paddingValues6 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i17 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i17 & 14) | 196608 | (i17 & 112) | (i3 & 7168) | (57344 & i3) | (i17 & 3670016) | (i17 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        vertical4 = vertical6;
                        paddingValues4 = paddingValues6;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        horizontal4 = horizontal3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i18 = i3 >> 3;
                        Arrangement.Vertical vertical7 = vertical3;
                        PaddingValues paddingValues7 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i18 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i18 & 14) | 196608 | (i18 & 112) | (i3 & 7168) | (57344 & i3) | (i18 & 3670016) | (i18 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        vertical4 = vertical7;
                        paddingValues4 = paddingValues7;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        horizontal4 = horizontal3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i19) {
                            LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                z3 = z;
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        horizontal2 = horizontal;
                        if (composerStartRestartGroup.changed(horizontal2)) {
                        }
                        i3 |= i15;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i3 |= i15;
                } else {
                    horizontal2 = horizontal;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i10 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 536870912;
                        } else {
                            i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((1533916891 & i3) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i19 = i3 >> 3;
                        Arrangement.Vertical vertical8 = vertical3;
                        PaddingValues paddingValues8 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i19 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i19 & 14) | 196608 | (i19 & 112) | (i3 & 7168) | (57344 & i3) | (i19 & 3670016) | (i19 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        vertical4 = vertical8;
                        paddingValues4 = paddingValues8;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        horizontal4 = horizontal3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i110 = i3 >> 3;
                        Arrangement.Vertical vertical9 = vertical3;
                        PaddingValues paddingValues9 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i110 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i110 & 14) | 196608 | (i110 & 112) | (i3 & 7168) | (57344 & i3) | (i110 & 3670016) | (i110 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        vertical4 = vertical9;
                        paddingValues4 = paddingValues9;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        horizontal4 = horizontal3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i111) {
                            LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i12 = 805306368;
                i3 |= i12;
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i111 = i3 >> 3;
                    Arrangement.Vertical vertical10 = vertical3;
                    PaddingValues paddingValues10 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i111 & 14) | 196608 | (i111 & 112) | (i3 & 7168) | (57344 & i3) | (i111 & 3670016) | (i111 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical10;
                    paddingValues4 = paddingValues10;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i112 = i3 >> 3;
                    Arrangement.Vertical vertical11 = vertical3;
                    PaddingValues paddingValues11 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i112 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i112 & 14) | 196608 | (i112 & 112) | (i3 & 7168) | (57344 & i3) | (i112 & 3670016) | (i112 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical11;
                    paddingValues4 = paddingValues11;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i113) {
                        LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            paddingValues2 = paddingValues;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        horizontal2 = horizontal;
                        if (composerStartRestartGroup.changed(horizontal2)) {
                        }
                        i3 |= i15;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i3 |= i15;
                } else {
                    horizontal2 = horizontal;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i10 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 536870912;
                        } else {
                            i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((1533916891 & i3) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i113 = i3 >> 3;
                        Arrangement.Vertical vertical12 = vertical3;
                        PaddingValues paddingValues12 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i113 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i113 & 14) | 196608 | (i113 & 112) | (i3 & 7168) | (57344 & i3) | (i113 & 3670016) | (i113 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        vertical4 = vertical12;
                        paddingValues4 = paddingValues12;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        horizontal4 = horizontal3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i114 = i3 >> 3;
                        Arrangement.Vertical vertical13 = vertical3;
                        PaddingValues paddingValues13 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i114 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i114 & 14) | 196608 | (i114 & 112) | (i3 & 7168) | (57344 & i3) | (i114 & 3670016) | (i114 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        vertical4 = vertical13;
                        paddingValues4 = paddingValues13;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        horizontal4 = horizontal3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i115) {
                            LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i12 = 805306368;
                i3 |= i12;
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i115 = i3 >> 3;
                    Arrangement.Vertical vertical14 = vertical3;
                    PaddingValues paddingValues14 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i115 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i115 & 14) | 196608 | (i115 & 112) | (i3 & 7168) | (57344 & i3) | (i115 & 3670016) | (i115 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical14;
                    paddingValues4 = paddingValues14;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i116 = i3 >> 3;
                    Arrangement.Vertical vertical15 = vertical3;
                    PaddingValues paddingValues15 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i116 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i116 & 14) | 196608 | (i116 & 112) | (i3 & 7168) | (57344 & i3) | (i116 & 3670016) | (i116 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical15;
                    paddingValues4 = paddingValues15;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i117) {
                        LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            z3 = z;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i15;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i15;
            } else {
                horizontal2 = horizontal;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i10 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 536870912;
                    } else {
                        i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i117 = i3 >> 3;
                    Arrangement.Vertical vertical16 = vertical3;
                    PaddingValues paddingValues16 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i117 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i117 & 14) | 196608 | (i117 & 112) | (i3 & 7168) | (57344 & i3) | (i117 & 3670016) | (i117 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical16;
                    paddingValues4 = paddingValues16;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i118 = i3 >> 3;
                    Arrangement.Vertical vertical17 = vertical3;
                    PaddingValues paddingValues17 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i118 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i118 & 14) | 196608 | (i118 & 112) | (i3 & 7168) | (57344 & i3) | (i118 & 3670016) | (i118 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical17;
                    paddingValues4 = paddingValues17;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i119) {
                        LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i12 = 805306368;
            i3 |= i12;
            if ((1533916891 & i3) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i119 = i3 >> 3;
                Arrangement.Vertical vertical18 = vertical3;
                PaddingValues paddingValues18 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i119 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i119 & 14) | 196608 | (i119 & 112) | (i3 & 7168) | (57344 & i3) | (i119 & 3670016) | (i119 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                vertical4 = vertical18;
                paddingValues4 = paddingValues18;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i1110 = i3 >> 3;
                Arrangement.Vertical vertical19 = vertical3;
                PaddingValues paddingValues19 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1110 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i1110 & 14) | 196608 | (i1110 & 112) | (i3 & 7168) | (57344 & i3) | (i1110 & 3670016) | (i1110 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                vertical4 = vertical19;
                paddingValues4 = paddingValues19;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1111) {
                    LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                lazyGridState2 = lazyGridState;
                if (composerStartRestartGroup.changed(lazyGridState2)) {
                }
                i3 |= i14;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i3 |= i14;
        } else {
            lazyGridState2 = lazyGridState;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        horizontal2 = horizontal;
                        if (composerStartRestartGroup.changed(horizontal2)) {
                        }
                        i3 |= i15;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i3 |= i15;
                } else {
                    horizontal2 = horizontal;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i10 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 536870912;
                        } else {
                            i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((1533916891 & i3) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i1111 = i3 >> 3;
                        Arrangement.Vertical vertical110 = vertical3;
                        PaddingValues paddingValues110 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i1111 & 14) | 196608 | (i1111 & 112) | (i3 & 7168) | (57344 & i3) | (i1111 & 3670016) | (i1111 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        vertical4 = vertical110;
                        paddingValues4 = paddingValues110;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        horizontal4 = horizontal3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getStart();
                                } else {
                                    end = arrangement.getEnd();
                                }
                                i3 &= -458753;
                            } else {
                                end = horizontal2;
                            }
                            if (i8 != 0) {
                                top = Arrangement.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                        }
                        int i1112 = i3 >> 3;
                        Arrangement.Vertical vertical111 = vertical3;
                        PaddingValues paddingValues111 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1112 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i1112 & 14) | 196608 | (i1112 & 112) | (i3 & 7168) | (57344 & i3) | (i1112 & 3670016) | (i1112 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        vertical4 = vertical111;
                        paddingValues4 = paddingValues111;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        horizontal4 = horizontal3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i1113) {
                            LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i12 = 805306368;
                i3 |= i12;
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i1113 = i3 >> 3;
                    Arrangement.Vertical vertical112 = vertical3;
                    PaddingValues paddingValues112 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1113 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i1113 & 14) | 196608 | (i1113 & 112) | (i3 & 7168) | (57344 & i3) | (i1113 & 3670016) | (i1113 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical112;
                    paddingValues4 = paddingValues112;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i1114 = i3 >> 3;
                    Arrangement.Vertical vertical113 = vertical3;
                    PaddingValues paddingValues113 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1114 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i1114 & 14) | 196608 | (i1114 & 112) | (i3 & 7168) | (57344 & i3) | (i1114 & 3670016) | (i1114 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical113;
                    paddingValues4 = paddingValues113;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1115) {
                        LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            z3 = z;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i15;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i15;
            } else {
                horizontal2 = horizontal;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i10 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 536870912;
                    } else {
                        i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i1115 = i3 >> 3;
                    Arrangement.Vertical vertical114 = vertical3;
                    PaddingValues paddingValues114 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1115 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i1115 & 14) | 196608 | (i1115 & 112) | (i3 & 7168) | (57344 & i3) | (i1115 & 3670016) | (i1115 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical114;
                    paddingValues4 = paddingValues114;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i1116 = i3 >> 3;
                    Arrangement.Vertical vertical115 = vertical3;
                    PaddingValues paddingValues115 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1116 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i1116 & 14) | 196608 | (i1116 & 112) | (i3 & 7168) | (57344 & i3) | (i1116 & 3670016) | (i1116 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical115;
                    paddingValues4 = paddingValues115;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1117) {
                        LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i12 = 805306368;
            i3 |= i12;
            if ((1533916891 & i3) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i1117 = i3 >> 3;
                Arrangement.Vertical vertical116 = vertical3;
                PaddingValues paddingValues116 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1117 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i1117 & 14) | 196608 | (i1117 & 112) | (i3 & 7168) | (57344 & i3) | (i1117 & 3670016) | (i1117 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                vertical4 = vertical116;
                paddingValues4 = paddingValues116;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i1118 = i3 >> 3;
                Arrangement.Vertical vertical117 = vertical3;
                PaddingValues paddingValues117 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1118 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i1118 & 14) | 196608 | (i1118 & 112) | (i3 & 7168) | (57344 & i3) | (i1118 & 3670016) | (i1118 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                vertical4 = vertical117;
                paddingValues4 = paddingValues117;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1119) {
                    LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        paddingValues2 = paddingValues;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                z3 = z;
                if (composerStartRestartGroup.changed(z3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i15;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i15;
            } else {
                horizontal2 = horizontal;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i10 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 536870912;
                    } else {
                        i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i1119 = i3 >> 3;
                    Arrangement.Vertical vertical118 = vertical3;
                    PaddingValues paddingValues118 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1119 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i1119 & 14) | 196608 | (i1119 & 112) | (i3 & 7168) | (57344 & i3) | (i1119 & 3670016) | (i1119 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical118;
                    paddingValues4 = paddingValues118;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -458753;
                        } else {
                            end = horizontal2;
                        }
                        if (i8 != 0) {
                            top = Arrangement.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                    }
                    int i11110 = i3 >> 3;
                    Arrangement.Vertical vertical119 = vertical3;
                    PaddingValues paddingValues119 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11110 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i11110 & 14) | 196608 | (i11110 & 112) | (i3 & 7168) | (57344 & i3) | (i11110 & 3670016) | (i11110 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    vertical4 = vertical119;
                    paddingValues4 = paddingValues119;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11111) {
                        LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i12 = 805306368;
            i3 |= i12;
            if ((1533916891 & i3) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i11111 = i3 >> 3;
                Arrangement.Vertical vertical1110 = vertical3;
                PaddingValues paddingValues1110 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i11111 & 14) | 196608 | (i11111 & 112) | (i3 & 7168) | (57344 & i3) | (i11111 & 3670016) | (i11111 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                vertical4 = vertical1110;
                paddingValues4 = paddingValues1110;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i11112 = i3 >> 3;
                Arrangement.Vertical vertical1111 = vertical3;
                PaddingValues paddingValues1111 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11112 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i11112 & 14) | 196608 | (i11112 & 112) | (i3 & 7168) | (57344 & i3) | (i11112 & 3670016) | (i11112 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                vertical4 = vertical1111;
                paddingValues4 = paddingValues1111;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11113) {
                    LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        z3 = z;
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                horizontal2 = horizontal;
                if (composerStartRestartGroup.changed(horizontal2)) {
                }
                i3 |= i15;
            } else {
                horizontal2 = horizontal;
            }
            i3 |= i15;
        } else {
            horizontal2 = horizontal;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
            vertical2 = vertical;
        } else {
            vertical2 = vertical;
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
        }
        if ((i & 29360128) != 0) {
            i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
        }
        i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i10 != 0) {
            i3 |= 100663296;
        } else if ((i & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i3 |= i11;
        }
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i12 = 536870912;
                } else {
                    i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
            }
            if ((1533916891 & i3) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i11113 = i3 >> 3;
                Arrangement.Vertical vertical1112 = vertical3;
                PaddingValues paddingValues1112 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11113 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i11113 & 14) | 196608 | (i11113 & 112) | (i3 & 7168) | (57344 & i3) | (i11113 & 3670016) | (i11113 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                vertical4 = vertical1112;
                paddingValues4 = paddingValues1112;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -458753;
                    } else {
                        end = horizontal2;
                    }
                    if (i8 != 0) {
                        top = Arrangement.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
                }
                int i11114 = i3 >> 3;
                Arrangement.Vertical vertical1113 = vertical3;
                PaddingValues paddingValues1113 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11114 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i11114 & 14) | 196608 | (i11114 & 112) | (i3 & 7168) | (57344 & i3) | (i11114 & 3670016) | (i11114 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                vertical4 = vertical1113;
                paddingValues4 = paddingValues1113;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11115) {
                    LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i12 = 805306368;
        i3 |= i12;
        if ((1533916891 & i3) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i4 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -458753;
                } else {
                    end = horizontal2;
                }
                if (i8 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i4 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -458753;
                } else {
                    end = horizontal2;
                }
                if (i8 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
            }
            int i11115 = i3 >> 3;
            Arrangement.Vertical vertical1114 = vertical3;
            PaddingValues paddingValues1114 = paddingValues3;
            LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11115 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i11115 & 14) | 196608 | (i11115 & 112) | (i3 & 7168) | (57344 & i3) | (i11115 & 3670016) | (i11115 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            vertical4 = vertical1114;
            paddingValues4 = paddingValues1114;
            lazyGridState4 = lazyGridState3;
            z7 = z6;
            horizontal4 = horizontal3;
            flingBehavior4 = flingBehavior3;
            z8 = z5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i4 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -458753;
                } else {
                    end = horizontal2;
                }
                if (i8 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i4 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -458753;
                } else {
                    end = horizontal2;
                }
                if (i8 != 0) {
                    top = Arrangement.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:114)");
            }
            int i11116 = i3 >> 3;
            Arrangement.Vertical vertical1115 = vertical3;
            PaddingValues paddingValues1115 = paddingValues3;
            LazyGridKt.LazyGrid(modifier2, lazyGridState3, rememberRowHeightSums(rows, vertical3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11116 & 896)), paddingValues3, z6, false, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, (i11116 & 14) | 196608 | (i11116 & 112) | (i3 & 7168) | (57344 & i3) | (i11116 & 3670016) | (i11116 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            vertical4 = vertical1115;
            paddingValues4 = paddingValues1115;
            lazyGridState4 = lazyGridState3;
            z7 = z6;
            horizontal4 = horizontal3;
            flingBehavior4 = flingBehavior3;
            z8 = z5;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11117) {
                LazyGridDslKt.LazyHorizontalGrid(rows, modifier3, lazyGridState4, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x0136  */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0165  */
    /* JADX WARN: Code duplicated, block: B:130:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x0194  */
    /* JADX WARN: Code duplicated, block: B:132:0x0197  */
    /* JADX WARN: Code duplicated, block: B:135:0x019e  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:164:0x0206  */
    /* JADX WARN: Code duplicated, block: B:167:0x0269  */
    /* JADX WARN: Code duplicated, block: B:172:0x0282  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0118  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyVerticalGrid(@NotNull final GridCells columns, @Nullable Modifier modifier, @Nullable LazyGridState lazyGridState, @Nullable PaddingValues paddingValues, boolean z, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, @Nullable FlingBehavior flingBehavior, boolean z2, @NotNull final Function1<? super LazyGridScope, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        LazyGridState lazyGridState2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        Arrangement.Vertical vertical2;
        int i8;
        Arrangement.Horizontal horizontal2;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier modifier2;
        LazyGridState lazyGridStateRememberLazyGridState;
        PaddingValues paddingValuesM469PaddingValues0680j_4;
        boolean z4;
        Arrangement.Vertical bottom;
        Arrangement.Horizontal start;
        FlingBehavior flingBehavior2;
        boolean z5;
        LazyGridState lazyGridState3;
        boolean z6;
        PaddingValues paddingValues3;
        Arrangement.Vertical vertical3;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        Arrangement arrangement;
        final Modifier modifier3;
        final Arrangement.Horizontal horizontal4;
        final PaddingValues paddingValues4;
        final LazyGridState lazyGridState4;
        final boolean z7;
        final Arrangement.Vertical vertical4;
        final FlingBehavior flingBehavior4;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1485410512);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(columns) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    lazyGridState2 = lazyGridState;
                    int i14 = composerStartRestartGroup.changed(lazyGridState2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
                    i3 |= i14;
                } else {
                    lazyGridState2 = lazyGridState;
                }
                i3 |= i14;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 57344) == 0) {
                        z3 = z;
                        if (composerStartRestartGroup.changed(z3)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((458752 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            vertical2 = vertical;
                            int i15 = composerStartRestartGroup.changed(vertical2) ? 131072 : 65536;
                            i3 |= i15;
                        } else {
                            vertical2 = vertical;
                        }
                        i3 |= i15;
                    } else {
                        vertical2 = vertical;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        i3 |= 1572864;
                        horizontal2 = horizontal;
                    } else {
                        horizontal2 = horizontal;
                        if ((i & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(horizontal2)) {
                                i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                    }
                    if ((i & 29360128) != 0) {
                        i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                    }
                    i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i10 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(z2)) {
                            i11 = 67108864;
                        } else {
                            i11 = 33554432;
                        }
                        i3 |= i11;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((i & 1879048192) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i12 = 536870912;
                            } else {
                                i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                            }
                        }
                        if ((1533916891 & i3) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if ((i2 & 4) != 0) {
                                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridStateRememberLazyGridState = lazyGridState2;
                                }
                                if (i4 != 0) {
                                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                                } else {
                                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                                }
                                z4 = i6 == 0 ? z3 : false;
                                if ((i2 & 32) != 0) {
                                    arrangement = Arrangement.INSTANCE;
                                    if (z4) {
                                        bottom = arrangement.getBottom();
                                    } else {
                                        bottom = arrangement.getTop();
                                    }
                                    i3 &= -458753;
                                } else {
                                    bottom = vertical2;
                                }
                                if (i8 != 0) {
                                    start = Arrangement.INSTANCE.getStart();
                                } else {
                                    start = horizontal2;
                                }
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i10 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = z2;
                                }
                                lazyGridState3 = lazyGridStateRememberLazyGridState;
                                z6 = z4;
                                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                                vertical3 = bottom;
                                horizontal3 = start;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                modifier2 = modifier;
                                flingBehavior3 = flingBehavior;
                                z5 = z2;
                                lazyGridState3 = lazyGridState2;
                                z6 = z3;
                                vertical3 = vertical2;
                                paddingValues3 = paddingValues2;
                                horizontal3 = horizontal2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                            }
                            int i16 = i3 >> 3;
                            Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i16 & 896));
                            int i17 = (i16 & 14) | 196608 | (i16 & 112) | (i3 & 7168) | (57344 & i3) | (i16 & 3670016) | (i16 & 29360128);
                            int i18 = i3 << 9;
                            Arrangement.Horizontal horizontal5 = horizontal3;
                            PaddingValues paddingValues5 = paddingValues3;
                            LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i17 | (i18 & 234881024) | (i18 & 1879048192), (i3 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            horizontal4 = horizontal5;
                            paddingValues4 = paddingValues5;
                            lazyGridState4 = lazyGridState3;
                            z7 = z6;
                            vertical4 = vertical3;
                            flingBehavior4 = flingBehavior3;
                            z8 = z5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            z8 = z2;
                            lazyGridState4 = lazyGridState2;
                            paddingValues4 = paddingValues2;
                            horizontal4 = horizontal2;
                            z7 = z3;
                            vertical4 = vertical2;
                            flingBehavior4 = flingBehavior;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i19) {
                                LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i12 = 805306368;
                    i3 |= i12;
                    if ((1533916891 & i3) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i19 = i3 >> 3;
                        Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums2 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i19 & 896));
                        int i110 = (i19 & 14) | 196608 | (i19 & 112) | (i3 & 7168) | (57344 & i3) | (i19 & 3670016) | (i19 & 29360128);
                        int i111 = i3 << 9;
                        Arrangement.Horizontal horizontal6 = horizontal3;
                        PaddingValues paddingValues6 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums2, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i110 | (i111 & 234881024) | (i111 & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        horizontal4 = horizontal6;
                        paddingValues4 = paddingValues6;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        vertical4 = vertical3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i112 = i3 >> 3;
                        Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums3 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i112 & 896));
                        int i113 = (i112 & 14) | 196608 | (i112 & 112) | (i3 & 7168) | (57344 & i3) | (i112 & 3670016) | (i112 & 29360128);
                        int i114 = i3 << 9;
                        Arrangement.Horizontal horizontal7 = horizontal3;
                        PaddingValues paddingValues7 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums3, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i113 | (i114 & 234881024) | (i114 & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        horizontal4 = horizontal7;
                        paddingValues4 = paddingValues7;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        vertical4 = vertical3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i115) {
                            LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                z3 = z;
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vertical2 = vertical;
                        if (composerStartRestartGroup.changed(vertical2)) {
                        }
                        i3 |= i15;
                    } else {
                        vertical2 = vertical;
                    }
                    i3 |= i15;
                } else {
                    vertical2 = vertical;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    horizontal2 = horizontal;
                } else {
                    horizontal2 = horizontal;
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(horizontal2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i10 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 536870912;
                        } else {
                            i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((1533916891 & i3) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i115 = i3 >> 3;
                        Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums4 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i115 & 896));
                        int i116 = (i115 & 14) | 196608 | (i115 & 112) | (i3 & 7168) | (57344 & i3) | (i115 & 3670016) | (i115 & 29360128);
                        int i117 = i3 << 9;
                        Arrangement.Horizontal horizontal8 = horizontal3;
                        PaddingValues paddingValues8 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums4, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i116 | (i117 & 234881024) | (i117 & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        horizontal4 = horizontal8;
                        paddingValues4 = paddingValues8;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        vertical4 = vertical3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i118 = i3 >> 3;
                        Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums5 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i118 & 896));
                        int i119 = (i118 & 14) | 196608 | (i118 & 112) | (i3 & 7168) | (57344 & i3) | (i118 & 3670016) | (i118 & 29360128);
                        int i1110 = i3 << 9;
                        Arrangement.Horizontal horizontal9 = horizontal3;
                        PaddingValues paddingValues9 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums5, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i119 | (i1110 & 234881024) | (i1110 & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        horizontal4 = horizontal9;
                        paddingValues4 = paddingValues9;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        vertical4 = vertical3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i1111) {
                            LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i12 = 805306368;
                i3 |= i12;
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i1111 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums6 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111 & 896));
                    int i1112 = (i1111 & 14) | 196608 | (i1111 & 112) | (i3 & 7168) | (57344 & i3) | (i1111 & 3670016) | (i1111 & 29360128);
                    int i1113 = i3 << 9;
                    Arrangement.Horizontal horizontal10 = horizontal3;
                    PaddingValues paddingValues10 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums6, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i1112 | (i1113 & 234881024) | (i1113 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal10;
                    paddingValues4 = paddingValues10;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i1114 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums7 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1114 & 896));
                    int i1115 = (i1114 & 14) | 196608 | (i1114 & 112) | (i3 & 7168) | (57344 & i3) | (i1114 & 3670016) | (i1114 & 29360128);
                    int i1116 = i3 << 9;
                    Arrangement.Horizontal horizontal11 = horizontal3;
                    PaddingValues paddingValues11 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums7, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i1115 | (i1116 & 234881024) | (i1116 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal11;
                    paddingValues4 = paddingValues11;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1117) {
                        LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            paddingValues2 = paddingValues;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vertical2 = vertical;
                        if (composerStartRestartGroup.changed(vertical2)) {
                        }
                        i3 |= i15;
                    } else {
                        vertical2 = vertical;
                    }
                    i3 |= i15;
                } else {
                    vertical2 = vertical;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    horizontal2 = horizontal;
                } else {
                    horizontal2 = horizontal;
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(horizontal2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i10 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 536870912;
                        } else {
                            i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((1533916891 & i3) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i1117 = i3 >> 3;
                        Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums8 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1117 & 896));
                        int i1118 = (i1117 & 14) | 196608 | (i1117 & 112) | (i3 & 7168) | (57344 & i3) | (i1117 & 3670016) | (i1117 & 29360128);
                        int i1119 = i3 << 9;
                        Arrangement.Horizontal horizontal12 = horizontal3;
                        PaddingValues paddingValues12 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums8, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i1118 | (i1119 & 234881024) | (i1119 & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        horizontal4 = horizontal12;
                        paddingValues4 = paddingValues12;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        vertical4 = vertical3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i11110 = i3 >> 3;
                        Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums9 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11110 & 896));
                        int i11111 = (i11110 & 14) | 196608 | (i11110 & 112) | (i3 & 7168) | (57344 & i3) | (i11110 & 3670016) | (i11110 & 29360128);
                        int i11112 = i3 << 9;
                        Arrangement.Horizontal horizontal13 = horizontal3;
                        PaddingValues paddingValues13 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums9, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i11111 | (i11112 & 234881024) | (i11112 & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        horizontal4 = horizontal13;
                        paddingValues4 = paddingValues13;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        vertical4 = vertical3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i11113) {
                            LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i12 = 805306368;
                i3 |= i12;
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i11113 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums10 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11113 & 896));
                    int i11114 = (i11113 & 14) | 196608 | (i11113 & 112) | (i3 & 7168) | (57344 & i3) | (i11113 & 3670016) | (i11113 & 29360128);
                    int i11115 = i3 << 9;
                    Arrangement.Horizontal horizontal14 = horizontal3;
                    PaddingValues paddingValues14 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums10, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i11114 | (i11115 & 234881024) | (i11115 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal14;
                    paddingValues4 = paddingValues14;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i11116 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums11 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11116 & 896));
                    int i11117 = (i11116 & 14) | 196608 | (i11116 & 112) | (i3 & 7168) | (57344 & i3) | (i11116 & 3670016) | (i11116 & 29360128);
                    int i11118 = i3 << 9;
                    Arrangement.Horizontal horizontal15 = horizontal3;
                    PaddingValues paddingValues15 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums11, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i11117 | (i11118 & 234881024) | (i11118 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal15;
                    paddingValues4 = paddingValues15;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11119) {
                        LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            z3 = z;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i15;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i15;
            } else {
                vertical2 = vertical;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                horizontal2 = horizontal;
            } else {
                horizontal2 = horizontal;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i10 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 536870912;
                    } else {
                        i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i11119 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums12 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11119 & 896));
                    int i111110 = (i11119 & 14) | 196608 | (i11119 & 112) | (i3 & 7168) | (57344 & i3) | (i11119 & 3670016) | (i11119 & 29360128);
                    int i111111 = i3 << 9;
                    Arrangement.Horizontal horizontal16 = horizontal3;
                    PaddingValues paddingValues16 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums12, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i111110 | (i111111 & 234881024) | (i111111 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal16;
                    paddingValues4 = paddingValues16;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i111112 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums13 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111112 & 896));
                    int i111113 = (i111112 & 14) | 196608 | (i111112 & 112) | (i3 & 7168) | (57344 & i3) | (i111112 & 3670016) | (i111112 & 29360128);
                    int i111114 = i3 << 9;
                    Arrangement.Horizontal horizontal17 = horizontal3;
                    PaddingValues paddingValues17 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums13, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i111113 | (i111114 & 234881024) | (i111114 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal17;
                    paddingValues4 = paddingValues17;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i111115) {
                        LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i12 = 805306368;
            i3 |= i12;
            if ((1533916891 & i3) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i111115 = i3 >> 3;
                Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums14 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111115 & 896));
                int i111116 = (i111115 & 14) | 196608 | (i111115 & 112) | (i3 & 7168) | (57344 & i3) | (i111115 & 3670016) | (i111115 & 29360128);
                int i111117 = i3 << 9;
                Arrangement.Horizontal horizontal18 = horizontal3;
                PaddingValues paddingValues18 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums14, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i111116 | (i111117 & 234881024) | (i111117 & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                horizontal4 = horizontal18;
                paddingValues4 = paddingValues18;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i111118 = i3 >> 3;
                Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums15 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111118 & 896));
                int i111119 = (i111118 & 14) | 196608 | (i111118 & 112) | (i3 & 7168) | (57344 & i3) | (i111118 & 3670016) | (i111118 & 29360128);
                int i1111110 = i3 << 9;
                Arrangement.Horizontal horizontal19 = horizontal3;
                PaddingValues paddingValues19 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums15, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i111119 | (i1111110 & 234881024) | (i1111110 & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                horizontal4 = horizontal19;
                paddingValues4 = paddingValues19;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1111111) {
                    LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                lazyGridState2 = lazyGridState;
                if (composerStartRestartGroup.changed(lazyGridState2)) {
                }
                i3 |= i14;
            } else {
                lazyGridState2 = lazyGridState;
            }
            i3 |= i14;
        } else {
            lazyGridState2 = lazyGridState;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 57344) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        vertical2 = vertical;
                        if (composerStartRestartGroup.changed(vertical2)) {
                        }
                        i3 |= i15;
                    } else {
                        vertical2 = vertical;
                    }
                    i3 |= i15;
                } else {
                    vertical2 = vertical;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                    horizontal2 = horizontal;
                } else {
                    horizontal2 = horizontal;
                    if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(horizontal2)) {
                            i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i10 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i11 = 67108864;
                    } else {
                        i11 = 33554432;
                    }
                    i3 |= i11;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((i & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i12 = 536870912;
                        } else {
                            i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if ((1533916891 & i3) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i1111111 = i3 >> 3;
                        Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums16 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111111 & 896));
                        int i1111112 = (i1111111 & 14) | 196608 | (i1111111 & 112) | (i3 & 7168) | (57344 & i3) | (i1111111 & 3670016) | (i1111111 & 29360128);
                        int i1111113 = i3 << 9;
                        Arrangement.Horizontal horizontal110 = horizontal3;
                        PaddingValues paddingValues110 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums16, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i1111112 | (i1111113 & 234881024) | (i1111113 & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        horizontal4 = horizontal110;
                        paddingValues4 = paddingValues110;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        vertical4 = vertical3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            if (i13 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 4) != 0) {
                                lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyGridStateRememberLazyGridState = lazyGridState2;
                            }
                            if (i4 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 32) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getTop();
                                } else {
                                    bottom = arrangement.getBottom();
                                }
                                i3 &= -458753;
                            } else {
                                bottom = vertical2;
                            }
                            if (i8 != 0) {
                                start = Arrangement.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i10 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            lazyGridState3 = lazyGridStateRememberLazyGridState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                        }
                        int i1111114 = i3 >> 3;
                        Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums17 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111114 & 896));
                        int i1111115 = (i1111114 & 14) | 196608 | (i1111114 & 112) | (i3 & 7168) | (57344 & i3) | (i1111114 & 3670016) | (i1111114 & 29360128);
                        int i1111116 = i3 << 9;
                        Arrangement.Horizontal horizontal111 = horizontal3;
                        PaddingValues paddingValues111 = paddingValues3;
                        LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums17, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i1111115 | (i1111116 & 234881024) | (i1111116 & 1879048192), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        horizontal4 = horizontal111;
                        paddingValues4 = paddingValues111;
                        lazyGridState4 = lazyGridState3;
                        z7 = z6;
                        vertical4 = vertical3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i1111117) {
                            LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i12 = 805306368;
                i3 |= i12;
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i1111117 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums18 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111117 & 896));
                    int i1111118 = (i1111117 & 14) | 196608 | (i1111117 & 112) | (i3 & 7168) | (57344 & i3) | (i1111117 & 3670016) | (i1111117 & 29360128);
                    int i1111119 = i3 << 9;
                    Arrangement.Horizontal horizontal112 = horizontal3;
                    PaddingValues paddingValues112 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums18, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i1111118 | (i1111119 & 234881024) | (i1111119 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal112;
                    paddingValues4 = paddingValues112;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i11111110 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums19 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111110 & 896));
                    int i11111111 = (i11111110 & 14) | 196608 | (i11111110 & 112) | (i3 & 7168) | (57344 & i3) | (i11111110 & 3670016) | (i11111110 & 29360128);
                    int i11111112 = i3 << 9;
                    Arrangement.Horizontal horizontal113 = horizontal3;
                    PaddingValues paddingValues113 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums19, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i11111111 | (i11111112 & 234881024) | (i11111112 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal113;
                    paddingValues4 = paddingValues113;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11111113) {
                        LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            z3 = z;
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i15;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i15;
            } else {
                vertical2 = vertical;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                horizontal2 = horizontal;
            } else {
                horizontal2 = horizontal;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i10 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 536870912;
                    } else {
                        i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i11111113 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums110 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111113 & 896));
                    int i11111114 = (i11111113 & 14) | 196608 | (i11111113 & 112) | (i3 & 7168) | (57344 & i3) | (i11111113 & 3670016) | (i11111113 & 29360128);
                    int i11111115 = i3 << 9;
                    Arrangement.Horizontal horizontal114 = horizontal3;
                    PaddingValues paddingValues114 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums110, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i11111114 | (i11111115 & 234881024) | (i11111115 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal114;
                    paddingValues4 = paddingValues114;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i11111116 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums111 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111116 & 896));
                    int i11111117 = (i11111116 & 14) | 196608 | (i11111116 & 112) | (i3 & 7168) | (57344 & i3) | (i11111116 & 3670016) | (i11111116 & 29360128);
                    int i11111118 = i3 << 9;
                    Arrangement.Horizontal horizontal115 = horizontal3;
                    PaddingValues paddingValues115 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums111, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i11111117 | (i11111118 & 234881024) | (i11111118 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal115;
                    paddingValues4 = paddingValues115;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i11111119) {
                        LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i12 = 805306368;
            i3 |= i12;
            if ((1533916891 & i3) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i11111119 = i3 >> 3;
                Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums112 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111119 & 896));
                int i111111110 = (i11111119 & 14) | 196608 | (i11111119 & 112) | (i3 & 7168) | (57344 & i3) | (i11111119 & 3670016) | (i11111119 & 29360128);
                int i111111111 = i3 << 9;
                Arrangement.Horizontal horizontal116 = horizontal3;
                PaddingValues paddingValues116 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums112, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i111111110 | (i111111111 & 234881024) | (i111111111 & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                horizontal4 = horizontal116;
                paddingValues4 = paddingValues116;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i111111112 = i3 >> 3;
                Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums113 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111111112 & 896));
                int i111111113 = (i111111112 & 14) | 196608 | (i111111112 & 112) | (i3 & 7168) | (57344 & i3) | (i111111112 & 3670016) | (i111111112 & 29360128);
                int i111111114 = i3 << 9;
                Arrangement.Horizontal horizontal117 = horizontal3;
                PaddingValues paddingValues117 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums113, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i111111113 | (i111111114 & 234881024) | (i111111114 & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                horizontal4 = horizontal117;
                paddingValues4 = paddingValues117;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i111111115) {
                    LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        paddingValues2 = paddingValues;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 57344) == 0) {
                z3 = z;
                if (composerStartRestartGroup.changed(z3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i15;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i15;
            } else {
                vertical2 = vertical;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
                horizontal2 = horizontal;
            } else {
                horizontal2 = horizontal;
                if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i10 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i3 |= i11;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((i & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i12 = 536870912;
                    } else {
                        i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if ((1533916891 & i3) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i111111115 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums114 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111111115 & 896));
                    int i111111116 = (i111111115 & 14) | 196608 | (i111111115 & 112) | (i3 & 7168) | (57344 & i3) | (i111111115 & 3670016) | (i111111115 & 29360128);
                    int i111111117 = i3 << 9;
                    Arrangement.Horizontal horizontal118 = horizontal3;
                    PaddingValues paddingValues118 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums114, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i111111116 | (i111111117 & 234881024) | (i111111117 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal118;
                    paddingValues4 = paddingValues118;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i13 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 4) != 0) {
                            lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyGridStateRememberLazyGridState = lazyGridState2;
                        }
                        if (i4 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -458753;
                        } else {
                            bottom = vertical2;
                        }
                        if (i8 != 0) {
                            start = Arrangement.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i10 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        lazyGridState3 = lazyGridStateRememberLazyGridState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                    }
                    int i111111118 = i3 >> 3;
                    Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums115 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111111118 & 896));
                    int i111111119 = (i111111118 & 14) | 196608 | (i111111118 & 112) | (i3 & 7168) | (57344 & i3) | (i111111118 & 3670016) | (i111111118 & 29360128);
                    int i1111111110 = i3 << 9;
                    Arrangement.Horizontal horizontal119 = horizontal3;
                    PaddingValues paddingValues119 = paddingValues3;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums115, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i111111119 | (i1111111110 & 234881024) | (i1111111110 & 1879048192), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    horizontal4 = horizontal119;
                    paddingValues4 = paddingValues119;
                    lazyGridState4 = lazyGridState3;
                    z7 = z6;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1111111111) {
                        LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i12 = 805306368;
            i3 |= i12;
            if ((1533916891 & i3) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i1111111111 = i3 >> 3;
                Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums116 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111111111 & 896));
                int i1111111112 = (i1111111111 & 14) | 196608 | (i1111111111 & 112) | (i3 & 7168) | (57344 & i3) | (i1111111111 & 3670016) | (i1111111111 & 29360128);
                int i1111111113 = i3 << 9;
                Arrangement.Horizontal horizontal1110 = horizontal3;
                PaddingValues paddingValues1110 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums116, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i1111111112 | (i1111111113 & 234881024) | (i1111111113 & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                horizontal4 = horizontal1110;
                paddingValues4 = paddingValues1110;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i1111111114 = i3 >> 3;
                Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums117 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111111114 & 896));
                int i1111111115 = (i1111111114 & 14) | 196608 | (i1111111114 & 112) | (i3 & 7168) | (57344 & i3) | (i1111111114 & 3670016) | (i1111111114 & 29360128);
                int i1111111116 = i3 << 9;
                Arrangement.Horizontal horizontal1111 = horizontal3;
                PaddingValues paddingValues1111 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums117, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i1111111115 | (i1111111116 & 234881024) | (i1111111116 & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                horizontal4 = horizontal1111;
                paddingValues4 = paddingValues1111;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1111111117) {
                    LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        z3 = z;
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                vertical2 = vertical;
                if (composerStartRestartGroup.changed(vertical2)) {
                }
                i3 |= i15;
            } else {
                vertical2 = vertical;
            }
            i3 |= i15;
        } else {
            vertical2 = vertical;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
            horizontal2 = horizontal;
        } else {
            horizontal2 = horizontal;
            if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(horizontal2)) {
                    i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
        }
        if ((i & 29360128) != 0) {
            i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
        }
        i10 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i10 != 0) {
            i3 |= 100663296;
        } else if ((i & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i3 |= i11;
        }
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            if ((i & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i12 = 536870912;
                } else {
                    i12 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
            }
            if ((1533916891 & i3) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i1111111117 = i3 >> 3;
                Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums118 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111111117 & 896));
                int i1111111118 = (i1111111117 & 14) | 196608 | (i1111111117 & 112) | (i3 & 7168) | (57344 & i3) | (i1111111117 & 3670016) | (i1111111117 & 29360128);
                int i1111111119 = i3 << 9;
                Arrangement.Horizontal horizontal1112 = horizontal3;
                PaddingValues paddingValues1112 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums118, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i1111111118 | (i1111111119 & 234881024) | (i1111111119 & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                horizontal4 = horizontal1112;
                paddingValues4 = paddingValues1112;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 4) != 0) {
                        lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyGridStateRememberLazyGridState = lazyGridState2;
                    }
                    if (i4 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i6 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -458753;
                    } else {
                        bottom = vertical2;
                    }
                    if (i8 != 0) {
                        start = Arrangement.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i10 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    lazyGridState3 = lazyGridStateRememberLazyGridState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
                }
                int i11111111110 = i3 >> 3;
                Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums119 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111111110 & 896));
                int i11111111111 = (i11111111110 & 14) | 196608 | (i11111111110 & 112) | (i3 & 7168) | (57344 & i3) | (i11111111110 & 3670016) | (i11111111110 & 29360128);
                int i11111111112 = i3 << 9;
                Arrangement.Horizontal horizontal1113 = horizontal3;
                PaddingValues paddingValues1113 = paddingValues3;
                LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums119, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i11111111111 | (i11111111112 & 234881024) | (i11111111112 & 1879048192), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                horizontal4 = horizontal1113;
                paddingValues4 = paddingValues1113;
                lazyGridState4 = lazyGridState3;
                z7 = z6;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i11111111113) {
                    LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i12 = 805306368;
        i3 |= i12;
        if ((1533916891 & i3) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i4 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -458753;
                } else {
                    bottom = vertical2;
                }
                if (i8 != 0) {
                    start = Arrangement.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i4 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -458753;
                } else {
                    bottom = vertical2;
                }
                if (i8 != 0) {
                    start = Arrangement.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
            }
            int i11111111113 = i3 >> 3;
            Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums1110 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111111113 & 896));
            int i11111111114 = (i11111111113 & 14) | 196608 | (i11111111113 & 112) | (i3 & 7168) | (57344 & i3) | (i11111111113 & 3670016) | (i11111111113 & 29360128);
            int i11111111115 = i3 << 9;
            Arrangement.Horizontal horizontal1114 = horizontal3;
            PaddingValues paddingValues1114 = paddingValues3;
            LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums1110, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i11111111114 | (i11111111115 & 234881024) | (i11111111115 & 1879048192), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            horizontal4 = horizontal1114;
            paddingValues4 = paddingValues1114;
            lazyGridState4 = lazyGridState3;
            z7 = z6;
            vertical4 = vertical3;
            flingBehavior4 = flingBehavior3;
            z8 = z5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i4 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -458753;
                } else {
                    bottom = vertical2;
                }
                if (i8 != 0) {
                    start = Arrangement.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 4) != 0) {
                    lazyGridStateRememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyGridStateRememberLazyGridState = lazyGridState2;
                }
                if (i4 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i6 == 0) {
                }
                if ((i2 & 32) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -458753;
                } else {
                    bottom = vertical2;
                }
                if (i8 != 0) {
                    start = Arrangement.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i10 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                lazyGridState3 = lazyGridStateRememberLazyGridState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:61)");
            }
            int i11111111116 = i3 >> 3;
            Function2<Density, Constraints, LazyGridSlots> function2RememberColumnWidthSums1111 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111111116 & 896));
            int i11111111117 = (i11111111116 & 14) | 196608 | (i11111111116 & 112) | (i3 & 7168) | (57344 & i3) | (i11111111116 & 3670016) | (i11111111116 & 29360128);
            int i11111111118 = i3 << 9;
            Arrangement.Horizontal horizontal1115 = horizontal3;
            PaddingValues paddingValues1115 = paddingValues3;
            LazyGridKt.LazyGrid(modifier2, lazyGridState3, function2RememberColumnWidthSums1111, paddingValues3, z6, true, flingBehavior3, z5, vertical3, horizontal3, content, composerStartRestartGroup, i11111111117 | (i11111111118 & 234881024) | (i11111111118 & 1879048192), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            horizontal4 = horizontal1115;
            paddingValues4 = paddingValues1115;
            lazyGridState4 = lazyGridState3;
            z7 = z6;
            vertical4 = vertical3;
            flingBehavior4 = flingBehavior3;
            z8 = z5;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11111111119) {
                LazyGridDslKt.LazyVerticalGrid(columns, modifier3, lazyGridState4, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i, int i2, int i3) {
        int i4 = i - ((i2 - 1) * i3);
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> items, @Nullable Function1<? super T, ? extends Object> function1, @Nullable Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, @NotNull Function1<? super T, ? extends Object> contentType, @NotNull Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new AnonymousClass2(function1, items) : null, function2 != null ? new AnonymousClass3(function2, items) : null, new AnonymousClass4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List items, Function1 function1, Function2 function2, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new AnonymousClass2(function1, items) : null, function2 != null ? new AnonymousClass3(function2, items) : null, new AnonymousClass4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new AnonymousClass5(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull List<? extends T> items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @Nullable Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @NotNull Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 != null ? new C07022(function2, items) : null, function3 != null ? new C07033(function3, items) : null, new C07044(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C07055(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List items, Function2 function2, Function3 function3, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = null;
        }
        if ((i & 8) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.1
                @Nullable
                public final Void invoke(int i2, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 != null ? new C07022(function2, items) : null, function3 != null ? new C07033(function3, items) : null, new C07044(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new C07055(itemContent, items)));
    }

    @Composable
    private static final Function2<Density, Constraints, LazyGridSlots> rememberColumnWidthSums(final GridCells gridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(-1355301804);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1355301804, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(gridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new GridSlotCache(new Function2<Density, Constraints, LazyGridSlots>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
                    return m602invoke0kLqBqw(density, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridSlots m602invoke0kLqBqw(@NotNull Density $receiver, long j) {
                    Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                    if (!(Constraints.m3733getMaxWidthimpl(j) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
                    }
                    PaddingValues paddingValues2 = paddingValues;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    int iM3733getMaxWidthimpl = Constraints.m3733getMaxWidthimpl(j) - $receiver.mo318roundToPx0680j_4(Dp.m3765constructorimpl(PaddingKt.calculateEndPadding(paddingValues, layoutDirection) + PaddingKt.calculateStartPadding(paddingValues2, layoutDirection)));
                    GridCells gridCells2 = gridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] intArray = CollectionsKt___CollectionsKt.toIntArray(gridCells2.calculateCrossAxisCellSizes($receiver, iM3733getMaxWidthimpl, $receiver.mo318roundToPx0680j_4(horizontal2.getSpacing())));
                    int[] iArr = new int[intArray.length];
                    horizontal2.arrange($receiver, iM3733getMaxWidthimpl, intArray, layoutDirection, iArr);
                    return new LazyGridSlots(intArray, iArr);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, LazyGridSlots> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    @Composable
    private static final Function2<Density, Constraints, LazyGridSlots> rememberRowHeightSums(final GridCells gridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(239683573);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(239683573, i, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(gridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new GridSlotCache(new Function2<Density, Constraints, LazyGridSlots>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
                    return m603invoke0kLqBqw(density, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridSlots m603invoke0kLqBqw(@NotNull Density $receiver, long j) {
                    Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                    if (!(Constraints.m3732getMaxHeightimpl(j) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
                    }
                    int iM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(j) - $receiver.mo318roundToPx0680j_4(Dp.m3765constructorimpl(paddingValues.getBottom() + paddingValues.getTop()));
                    GridCells gridCells2 = gridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] intArray = CollectionsKt___CollectionsKt.toIntArray(gridCells2.calculateCrossAxisCellSizes($receiver, iM3732getMaxHeightimpl, $receiver.mo318roundToPx0680j_4(vertical2.getSpacing())));
                    int[] iArr = new int[intArray.length];
                    vertical2.arrange($receiver, iM3732getMaxHeightimpl, intArray, iArr);
                    return new LazyGridSlots(intArray, iArr);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, LazyGridSlots> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyGridScope lazyGridScope, @NotNull T[] items, @Nullable Function1<? super T, ? extends Object> function1, @Nullable Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, @NotNull Function1<? super T, ? extends Object> contentType, @NotNull Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new AnonymousClass7(function1, items) : null, function2 != null ? new AnonymousClass8(function2, items) : null, new AnonymousClass9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyGridScope lazyGridScope, @NotNull T[] items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @Nullable Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @NotNull Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 != null ? new C07077(function2, items) : null, function3 != null ? new C07088(function3, items) : null, new C07099(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C070110(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] items, Function1 function1, Function2 function2, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.items.6
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new AnonymousClass7(function1, items) : null, function2 != null ? new AnonymousClass8(function2, items) : null, new AnonymousClass9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new AnonymousClass10(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] items, Function2 function2, Function3 function3, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = null;
        }
        if ((i & 8) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt.itemsIndexed.6
                @Nullable
                public final Void invoke(int i2, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 != null ? new C07077(function2, items) : null, function3 != null ? new C07088(function3, items) : null, new C07099(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new C070110(itemContent, items)));
    }
}
