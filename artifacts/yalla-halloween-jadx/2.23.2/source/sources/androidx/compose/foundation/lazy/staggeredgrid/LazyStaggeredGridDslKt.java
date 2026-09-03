package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
@Metadata(d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0086\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a?\u0010 \u001a\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!¢\u0006\u0002\b\u00162\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0001¢\u0006\u0002\u0010%\u001a?\u0010&\u001a\u0019\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0!¢\u0006\u0002\b\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0001¢\u0006\u0002\u0010'\u001aÓ\u0001\u0010(\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)0*2%\b\n\u0010+\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010\u00142%\b\u0006\u00100\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0\u00142%\b\n\u00101\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010\u001423\b\u0004\u00103\u001a-\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0002¢\u0006\u0002\u00106\u001aÓ\u0001\u0010(\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)072%\b\n\u0010+\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010\u00142%\b\u0006\u00100\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0\u00142%\b\n\u00101\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010\u001423\b\u0004\u00103\u001a-\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010!¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0002¢\u0006\u0002\u00108\u001a§\u0002\u00109\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)0*2:\b\n\u0010+\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010!2:\b\u0006\u00100\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0!2:\b\n\u00101\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010!2H\b\u0004\u00103\u001aB\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0002¢\u0006\u0002\u0010=\u001a§\u0002\u00109\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)072:\b\n\u0010+\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010!2:\b\u0006\u00100\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0!2:\b\n\u00101\u001a4\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010!2H\b\u0004\u00103\u001aB\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110:¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0002¢\u0006\u0002\u0010>\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006?"}, d2 = {"LazyHorizontalStaggeredGrid", "", "rows", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalItemSpacing", "Landroidx/compose/ui/unit/Dp;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "columns", "verticalItemSpacing", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberColumnSlots", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberRowSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "items", "T", "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "itemContent", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,456:1\n154#2:457\n154#2:458\n154#2:459\n154#2:470\n154#2:471\n154#2:472\n67#3,3:460\n66#3:463\n67#3,3:473\n66#3:476\n1097#4,6:464\n1097#4,6:477\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt\n*L\n66#1:457\n68#1:458\n69#1:459\n156#1:470\n158#1:471\n159#1:472\n95#1:460,3\n95#1:463\n185#1:473,3\n185#1:476\n95#1:464,6\n185#1:477,6\n*E\n"})
public final class LazyStaggeredGridDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$10\n*L\n1#1,456:1\n*E\n"})
    public static final class AnonymousClass10 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
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
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i, @Nullable Composer composer, int i2) {
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
                ComposerKt.traceEventStart(2101296000, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:414)");
            }
            this.$itemContent.invoke(items, this.$items[i], composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$3\n*L\n1#1,456:1\n*E\n"})
    public static final class AnonymousClass3 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$5\n*L\n1#1,456:1\n*E\n"})
    public static final class AnonymousClass5 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i, @Nullable Composer composer, int i2) {
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
                ComposerKt.traceEventStart(-886456479, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:336)");
            }
            this.$itemContent.invoke(items, (T) this.$items.get(i), composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$8\n*L\n1#1,456:1\n*E\n"})
    public static final class AnonymousClass8 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function1<? super T, ? extends Object> function1, T[] tArr) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$10\n*L\n1#1,456:1\n*E\n"})
    public static final class C068810 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C068810(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
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
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i, @Nullable Composer composer, int i2) {
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
                ComposerKt.traceEventStart(-804487775, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:453)");
            }
            this.$itemContent.invoke(items, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$3\n*L\n1#1,456:1\n*E\n"})
    public static final class C06893 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06893(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$5\n*L\n1#1,456:1\n*E\n"})
    public static final class C06905 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06905(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyStaggeredGridItemScope items, int i, @Nullable Composer composer, int i2) {
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
                ComposerKt.traceEventStart(284833944, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:375)");
            }
            this.$itemContent.invoke(items, Integer.valueOf(i), (T) this.$items.get(i), composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$itemsIndexed$8\n*L\n1#1,456:1\n*E\n"})
    public static final class C06928 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06928(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
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

    /* JADX WARN: Code duplicated, block: B:102:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0157  */
    /* JADX WARN: Code duplicated, block: B:120:0x0178 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x017a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:125:0x0188  */
    /* JADX WARN: Code duplicated, block: B:127:0x018c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0196  */
    /* JADX WARN: Code duplicated, block: B:130:0x0199  */
    /* JADX WARN: Code duplicated, block: B:132:0x019c  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:150:0x0246  */
    /* JADX WARN: Code duplicated, block: B:155:0x025f  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    public static final void m646LazyHorizontalStaggeredGridcJHQLPU(@NotNull final StaggeredGridCells rows, @Nullable Modifier modifier, @Nullable LazyStaggeredGridState lazyStaggeredGridState, @Nullable PaddingValues paddingValues, boolean z, @Nullable Arrangement.Vertical vertical, float f, @Nullable FlingBehavior flingBehavior, boolean z2, @NotNull final Function1<? super LazyStaggeredGridScope, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        Arrangement.Vertical vertical2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        LazyStaggeredGridState lazyStaggeredGridStateRememberLazyStaggeredGridState;
        PaddingValues paddingValuesM471PaddingValues0680j_4;
        Arrangement.Vertical verticalM392spacedBy0680j_4;
        float fM3775constructorimpl;
        FlingBehavior flingBehavior2;
        boolean z4;
        LazyStaggeredGridState lazyStaggeredGridState2;
        Modifier modifier3;
        FlingBehavior flingBehavior3;
        boolean z5;
        PaddingValues paddingValues3;
        final Modifier modifier4;
        final LazyStaggeredGridState lazyStaggeredGridState3;
        final Arrangement.Vertical vertical3;
        final boolean z6;
        final PaddingValues paddingValues4;
        final float f2;
        final FlingBehavior flingBehavior4;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-8666074);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(rows) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((i & 57344) == 0) {
                        z3 = z;
                        if (composerStartRestartGroup.changed(z3)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        i3 |= 196608;
                        vertical2 = vertical;
                    } else {
                        vertical2 = vertical;
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changed(vertical2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f)) {
                            i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((i & 29360128) != 0) {
                        i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                    }
                    i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i13 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(z2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i3 |= i14;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((1879048192 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i15 = 536870912;
                            } else {
                                i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                            }
                        }
                        if (i4 != 4 && (1533916891 & i3) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            lazyStaggeredGridState3 = lazyStaggeredGridState;
                            f2 = f;
                            flingBehavior4 = flingBehavior;
                            modifier4 = modifier2;
                            paddingValues4 = paddingValues2;
                            vertical3 = vertical2;
                            z6 = z3;
                            z7 = z2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i16 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                                }
                                if (i5 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i7 != 0) {
                                    z3 = false;
                                }
                                if (i9 != 0) {
                                    verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    verticalM392spacedBy0680j_4 = vertical2;
                                }
                                if (i11 != 0) {
                                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                                } else {
                                    fM3775constructorimpl = f;
                                }
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i13 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                                modifier3 = modifier2;
                                vertical2 = verticalM392spacedBy0680j_4;
                                flingBehavior3 = flingBehavior2;
                                z5 = z3;
                                paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if (i4 != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridState;
                                fM3775constructorimpl = f;
                                flingBehavior3 = flingBehavior;
                                z4 = z2;
                                modifier3 = modifier2;
                                z5 = z3;
                                paddingValues3 = paddingValues2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                            }
                            int i17 = i3 >> 3;
                            int i18 = i3 << 6;
                            int i19 = i3 << 3;
                            Arrangement.Vertical vertical4 = vertical2;
                            PaddingValues paddingValues5 = paddingValues3;
                            LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i17 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i17 & 29360128) | (i18 & 7168) | 56 | (57344 & i19) | (i19 & 458752) | (i17 & 3670016) | (i18 & 234881024), (i3 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            vertical3 = vertical4;
                            z6 = z5;
                            paddingValues4 = paddingValues5;
                            f2 = fM3775constructorimpl;
                            flingBehavior4 = flingBehavior3;
                            z7 = z4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                            public final void invoke(@Nullable Composer composer2, int i20) {
                                LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i15 = 805306368;
                    i3 |= i15;
                    if (i4 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        int i110 = i3 >> 3;
                        int i111 = i3 << 6;
                        int i112 = i3 << 3;
                        Arrangement.Vertical vertical5 = vertical2;
                        PaddingValues paddingValues6 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i110 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i110 & 29360128) | (i111 & 7168) | 56 | (57344 & i112) | (i112 & 458752) | (i110 & 3670016) | (i111 & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical5;
                        z6 = z5;
                        paddingValues4 = paddingValues6;
                        f2 = fM3775constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        int i113 = i3 >> 3;
                        int i114 = i3 << 6;
                        int i115 = i3 << 3;
                        Arrangement.Vertical vertical6 = vertical2;
                        PaddingValues paddingValues7 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i113 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i113 & 29360128) | (i114 & 7168) | 56 | (57344 & i115) | (i115 & 458752) | (i113 & 3670016) | (i114 & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical6;
                        z6 = z5;
                        paddingValues4 = paddingValues7;
                        f2 = fM3775constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                z3 = z;
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i13 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i3 |= i14;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 536870912;
                        } else {
                            i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if (i4 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        int i116 = i3 >> 3;
                        int i117 = i3 << 6;
                        int i118 = i3 << 3;
                        Arrangement.Vertical vertical7 = vertical2;
                        PaddingValues paddingValues8 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i116 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i116 & 29360128) | (i117 & 7168) | 56 | (57344 & i118) | (i118 & 458752) | (i116 & 3670016) | (i117 & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical7;
                        z6 = z5;
                        paddingValues4 = paddingValues8;
                        f2 = fM3775constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        int i119 = i3 >> 3;
                        int i1110 = i3 << 6;
                        int i1111 = i3 << 3;
                        Arrangement.Vertical vertical8 = vertical2;
                        PaddingValues paddingValues9 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i119 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i119 & 29360128) | (i1110 & 7168) | 56 | (57344 & i1111) | (i1111 & 458752) | (i119 & 3670016) | (i1110 & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical8;
                        z6 = z5;
                        paddingValues4 = paddingValues9;
                        f2 = fM3775constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i15 = 805306368;
                i3 |= i15;
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i1112 = i3 >> 3;
                    int i1113 = i3 << 6;
                    int i1114 = i3 << 3;
                    Arrangement.Vertical vertical9 = vertical2;
                    PaddingValues paddingValues10 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i1112 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i1112 & 29360128) | (i1113 & 7168) | 56 | (57344 & i1114) | (i1114 & 458752) | (i1112 & 3670016) | (i1113 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical9;
                    z6 = z5;
                    paddingValues4 = paddingValues10;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i1115 = i3 >> 3;
                    int i1116 = i3 << 6;
                    int i1117 = i3 << 3;
                    Arrangement.Vertical vertical10 = vertical2;
                    PaddingValues paddingValues11 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i1115 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i1115 & 29360128) | (i1116 & 7168) | 56 | (57344 & i1117) | (i1117 & 458752) | (i1115 & 3670016) | (i1116 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical10;
                    z6 = z5;
                    paddingValues4 = paddingValues11;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            paddingValues2 = paddingValues;
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 57344) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i13 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i3 |= i14;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 536870912;
                        } else {
                            i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if (i4 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        int i1118 = i3 >> 3;
                        int i1119 = i3 << 6;
                        int i11110 = i3 << 3;
                        Arrangement.Vertical vertical11 = vertical2;
                        PaddingValues paddingValues12 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i1118 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i1118 & 29360128) | (i1119 & 7168) | 56 | (57344 & i11110) | (i11110 & 458752) | (i1118 & 3670016) | (i1119 & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical11;
                        z6 = z5;
                        paddingValues4 = paddingValues12;
                        f2 = fM3775constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        int i11111 = i3 >> 3;
                        int i11112 = i3 << 6;
                        int i11113 = i3 << 3;
                        Arrangement.Vertical vertical12 = vertical2;
                        PaddingValues paddingValues13 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i11111 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i11111 & 29360128) | (i11112 & 7168) | 56 | (57344 & i11113) | (i11113 & 458752) | (i11111 & 3670016) | (i11112 & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical12;
                        z6 = z5;
                        paddingValues4 = paddingValues13;
                        f2 = fM3775constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i15 = 805306368;
                i3 |= i15;
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i11114 = i3 >> 3;
                    int i11115 = i3 << 6;
                    int i11116 = i3 << 3;
                    Arrangement.Vertical vertical13 = vertical2;
                    PaddingValues paddingValues14 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i11114 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i11114 & 29360128) | (i11115 & 7168) | 56 | (57344 & i11116) | (i11116 & 458752) | (i11114 & 3670016) | (i11115 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical13;
                    z6 = z5;
                    paddingValues4 = paddingValues14;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i11117 = i3 >> 3;
                    int i11118 = i3 << 6;
                    int i11119 = i3 << 3;
                    Arrangement.Vertical vertical14 = vertical2;
                    PaddingValues paddingValues15 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i11117 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i11117 & 29360128) | (i11118 & 7168) | 56 | (57344 & i11119) | (i11119 & 458752) | (i11117 & 3670016) | (i11118 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical14;
                    z6 = z5;
                    paddingValues4 = paddingValues15;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            z3 = z;
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i13 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i3 |= i14;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 536870912;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i111110 = i3 >> 3;
                    int i111111 = i3 << 6;
                    int i111112 = i3 << 3;
                    Arrangement.Vertical vertical15 = vertical2;
                    PaddingValues paddingValues16 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i111110 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i111110 & 29360128) | (i111111 & 7168) | 56 | (57344 & i111112) | (i111112 & 458752) | (i111110 & 3670016) | (i111111 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical15;
                    z6 = z5;
                    paddingValues4 = paddingValues16;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i111113 = i3 >> 3;
                    int i111114 = i3 << 6;
                    int i111115 = i3 << 3;
                    Arrangement.Vertical vertical16 = vertical2;
                    PaddingValues paddingValues17 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i111113 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i111113 & 29360128) | (i111114 & 7168) | 56 | (57344 & i111115) | (i111115 & 458752) | (i111113 & 3670016) | (i111114 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical16;
                    z6 = z5;
                    paddingValues4 = paddingValues17;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i15 = 805306368;
            i3 |= i15;
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                int i111116 = i3 >> 3;
                int i111117 = i3 << 6;
                int i111118 = i3 << 3;
                Arrangement.Vertical vertical17 = vertical2;
                PaddingValues paddingValues18 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i111116 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i111116 & 29360128) | (i111117 & 7168) | 56 | (57344 & i111118) | (i111118 & 458752) | (i111116 & 3670016) | (i111117 & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical17;
                z6 = z5;
                paddingValues4 = paddingValues18;
                f2 = fM3775constructorimpl;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                int i111119 = i3 >> 3;
                int i1111110 = i3 << 6;
                int i1111111 = i3 << 3;
                Arrangement.Vertical vertical18 = vertical2;
                PaddingValues paddingValues19 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i111119 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i111119 & 29360128) | (i1111110 & 7168) | 56 | (57344 & i1111111) | (i1111111 & 458752) | (i111119 & 3670016) | (i1111110 & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical18;
                z6 = z5;
                paddingValues4 = paddingValues19;
                f2 = fM3775constructorimpl;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                public final void invoke(@Nullable Composer composer2, int i20) {
                    LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 57344) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i13 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i3 |= i14;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 536870912;
                        } else {
                            i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if (i4 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        int i1111112 = i3 >> 3;
                        int i1111113 = i3 << 6;
                        int i1111114 = i3 << 3;
                        Arrangement.Vertical vertical19 = vertical2;
                        PaddingValues paddingValues110 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i1111112 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i1111112 & 29360128) | (i1111113 & 7168) | 56 | (57344 & i1111114) | (i1111114 & 458752) | (i1111112 & 3670016) | (i1111113 & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical19;
                        z6 = z5;
                        paddingValues4 = paddingValues110;
                        f2 = fM3775constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                verticalM392spacedBy0680j_4 = vertical2;
                            }
                            if (i11 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            vertical2 = verticalM392spacedBy0680j_4;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                        }
                        int i1111115 = i3 >> 3;
                        int i1111116 = i3 << 6;
                        int i1111117 = i3 << 3;
                        Arrangement.Vertical vertical110 = vertical2;
                        PaddingValues paddingValues111 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i1111115 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i1111115 & 29360128) | (i1111116 & 7168) | 56 | (57344 & i1111117) | (i1111117 & 458752) | (i1111115 & 3670016) | (i1111116 & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        vertical3 = vertical110;
                        z6 = z5;
                        paddingValues4 = paddingValues111;
                        f2 = fM3775constructorimpl;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                        public final void invoke(@Nullable Composer composer2, int i20) {
                            LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i15 = 805306368;
                i3 |= i15;
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i1111118 = i3 >> 3;
                    int i1111119 = i3 << 6;
                    int i11111110 = i3 << 3;
                    Arrangement.Vertical vertical111 = vertical2;
                    PaddingValues paddingValues112 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i1111118 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i1111118 & 29360128) | (i1111119 & 7168) | 56 | (57344 & i11111110) | (i11111110 & 458752) | (i1111118 & 3670016) | (i1111119 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical111;
                    z6 = z5;
                    paddingValues4 = paddingValues112;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i11111111 = i3 >> 3;
                    int i11111112 = i3 << 6;
                    int i11111113 = i3 << 3;
                    Arrangement.Vertical vertical112 = vertical2;
                    PaddingValues paddingValues113 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i11111111 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i11111111 & 29360128) | (i11111112 & 7168) | 56 | (57344 & i11111113) | (i11111113 & 458752) | (i11111111 & 3670016) | (i11111112 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical112;
                    z6 = z5;
                    paddingValues4 = paddingValues113;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            z3 = z;
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i13 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i3 |= i14;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 536870912;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i11111114 = i3 >> 3;
                    int i11111115 = i3 << 6;
                    int i11111116 = i3 << 3;
                    Arrangement.Vertical vertical113 = vertical2;
                    PaddingValues paddingValues114 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i11111114 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i11111114 & 29360128) | (i11111115 & 7168) | 56 | (57344 & i11111116) | (i11111116 & 458752) | (i11111114 & 3670016) | (i11111115 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical113;
                    z6 = z5;
                    paddingValues4 = paddingValues114;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i11111117 = i3 >> 3;
                    int i11111118 = i3 << 6;
                    int i11111119 = i3 << 3;
                    Arrangement.Vertical vertical114 = vertical2;
                    PaddingValues paddingValues115 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i11111117 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i11111117 & 29360128) | (i11111118 & 7168) | 56 | (57344 & i11111119) | (i11111119 & 458752) | (i11111117 & 3670016) | (i11111118 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical114;
                    z6 = z5;
                    paddingValues4 = paddingValues115;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i15 = 805306368;
            i3 |= i15;
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                int i111111110 = i3 >> 3;
                int i111111111 = i3 << 6;
                int i111111112 = i3 << 3;
                Arrangement.Vertical vertical115 = vertical2;
                PaddingValues paddingValues116 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i111111110 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i111111110 & 29360128) | (i111111111 & 7168) | 56 | (57344 & i111111112) | (i111111112 & 458752) | (i111111110 & 3670016) | (i111111111 & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical115;
                z6 = z5;
                paddingValues4 = paddingValues116;
                f2 = fM3775constructorimpl;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                int i111111113 = i3 >> 3;
                int i111111114 = i3 << 6;
                int i111111115 = i3 << 3;
                Arrangement.Vertical vertical116 = vertical2;
                PaddingValues paddingValues117 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i111111113 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i111111113 & 29360128) | (i111111114 & 7168) | 56 | (57344 & i111111115) | (i111111115 & 458752) | (i111111113 & 3670016) | (i111111114 & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical116;
                z6 = z5;
                paddingValues4 = paddingValues117;
                f2 = fM3775constructorimpl;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                public final void invoke(@Nullable Composer composer2, int i20) {
                    LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        paddingValues2 = paddingValues;
        i7 = i2 & 16;
        if (i7 != 0) {
            if ((i & 57344) == 0) {
                z3 = z;
                if (composerStartRestartGroup.changed(z3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i13 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i3 |= i14;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 536870912;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i111111116 = i3 >> 3;
                    int i111111117 = i3 << 6;
                    int i111111118 = i3 << 3;
                    Arrangement.Vertical vertical117 = vertical2;
                    PaddingValues paddingValues118 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i111111116 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i111111116 & 29360128) | (i111111117 & 7168) | 56 | (57344 & i111111118) | (i111111118 & 458752) | (i111111116 & 3670016) | (i111111117 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical117;
                    z6 = z5;
                    paddingValues4 = paddingValues118;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            verticalM392spacedBy0680j_4 = vertical2;
                        }
                        if (i11 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        vertical2 = verticalM392spacedBy0680j_4;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                    }
                    int i111111119 = i3 >> 3;
                    int i1111111110 = i3 << 6;
                    int i1111111111 = i3 << 3;
                    Arrangement.Vertical vertical118 = vertical2;
                    PaddingValues paddingValues119 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i111111119 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i111111119 & 29360128) | (i1111111110 & 7168) | 56 | (57344 & i1111111111) | (i1111111111 & 458752) | (i111111119 & 3670016) | (i1111111110 & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    vertical3 = vertical118;
                    z6 = z5;
                    paddingValues4 = paddingValues119;
                    f2 = fM3775constructorimpl;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                    public final void invoke(@Nullable Composer composer2, int i20) {
                        LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i15 = 805306368;
            i3 |= i15;
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                int i1111111112 = i3 >> 3;
                int i1111111113 = i3 << 6;
                int i1111111114 = i3 << 3;
                Arrangement.Vertical vertical119 = vertical2;
                PaddingValues paddingValues1110 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i1111111112 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i1111111112 & 29360128) | (i1111111113 & 7168) | 56 | (57344 & i1111111114) | (i1111111114 & 458752) | (i1111111112 & 3670016) | (i1111111113 & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical119;
                z6 = z5;
                paddingValues4 = paddingValues1110;
                f2 = fM3775constructorimpl;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                int i1111111115 = i3 >> 3;
                int i1111111116 = i3 << 6;
                int i1111111117 = i3 << 3;
                Arrangement.Vertical vertical1110 = vertical2;
                PaddingValues paddingValues1111 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i1111111115 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i1111111115 & 29360128) | (i1111111116 & 7168) | 56 | (57344 & i1111111117) | (i1111111117 & 458752) | (i1111111115 & 3670016) | (i1111111116 & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical1110;
                z6 = z5;
                paddingValues4 = paddingValues1111;
                f2 = fM3775constructorimpl;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                public final void invoke(@Nullable Composer composer2, int i20) {
                    LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        z3 = z;
        i9 = i2 & 32;
        if (i9 != 0) {
            i3 |= 196608;
            vertical2 = vertical;
        } else {
            vertical2 = vertical;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
        }
        i11 = i2 & 64;
        if (i11 != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changed(f)) {
                i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        }
        if ((i & 29360128) != 0) {
            i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
        }
        i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i13 != 0) {
            i3 |= 100663296;
        } else if ((i & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i3 |= i14;
        }
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            if ((1879048192 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 536870912;
                } else {
                    i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
            }
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                int i1111111118 = i3 >> 3;
                int i1111111119 = i3 << 6;
                int i11111111110 = i3 << 3;
                Arrangement.Vertical vertical1111 = vertical2;
                PaddingValues paddingValues1112 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i1111111118 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i1111111118 & 29360128) | (i1111111119 & 7168) | 56 | (57344 & i11111111110) | (i11111111110 & 458752) | (i1111111118 & 3670016) | (i1111111119 & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical1111;
                z6 = z5;
                paddingValues4 = paddingValues1112;
                f2 = fM3775constructorimpl;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        verticalM392spacedBy0680j_4 = vertical2;
                    }
                    if (i11 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    vertical2 = verticalM392spacedBy0680j_4;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
                }
                int i11111111111 = i3 >> 3;
                int i11111111112 = i3 << 6;
                int i11111111113 = i3 << 3;
                Arrangement.Vertical vertical1112 = vertical2;
                PaddingValues paddingValues1113 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i11111111111 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i11111111111 & 29360128) | (i11111111112 & 7168) | 56 | (57344 & i11111111113) | (i11111111113 & 458752) | (i11111111111 & 3670016) | (i11111111112 & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                vertical3 = vertical1112;
                z6 = z5;
                paddingValues4 = paddingValues1113;
                f2 = fM3775constructorimpl;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                public final void invoke(@Nullable Composer composer2, int i20) {
                    LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i15 = 805306368;
        i3 |= i15;
        if (i4 != 4) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i5 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if (i9 != 0) {
                    verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    verticalM392spacedBy0680j_4 = vertical2;
                }
                if (i11 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                vertical2 = verticalM392spacedBy0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z3;
                paddingValues3 = paddingValuesM471PaddingValues0680j_4;
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i5 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if (i9 != 0) {
                    verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    verticalM392spacedBy0680j_4 = vertical2;
                }
                if (i11 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                vertical2 = verticalM392spacedBy0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z3;
                paddingValues3 = paddingValuesM471PaddingValues0680j_4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
            }
            int i11111111114 = i3 >> 3;
            int i11111111115 = i3 << 6;
            int i11111111116 = i3 << 3;
            Arrangement.Vertical vertical1113 = vertical2;
            PaddingValues paddingValues1114 = paddingValues3;
            LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i11111111114 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i11111111114 & 29360128) | (i11111111115 & 7168) | 56 | (57344 & i11111111116) | (i11111111116 & 458752) | (i11111111114 & 3670016) | (i11111111115 & 234881024), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            vertical3 = vertical1113;
            z6 = z5;
            paddingValues4 = paddingValues1114;
            f2 = fM3775constructorimpl;
            flingBehavior4 = flingBehavior3;
            z7 = z4;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i5 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if (i9 != 0) {
                    verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    verticalM392spacedBy0680j_4 = vertical2;
                }
                if (i11 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                vertical2 = verticalM392spacedBy0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z3;
                paddingValues3 = paddingValuesM471PaddingValues0680j_4;
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i5 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if (i9 != 0) {
                    verticalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    verticalM392spacedBy0680j_4 = vertical2;
                }
                if (i11 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                vertical2 = verticalM392spacedBy0680j_4;
                flingBehavior3 = flingBehavior2;
                z5 = z3;
                paddingValues3 = paddingValuesM471PaddingValues0680j_4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-8666074, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:151)");
            }
            int i11111111117 = i3 >> 3;
            int i11111111118 = i3 << 6;
            int i11111111119 = i3 << 3;
            Arrangement.Vertical vertical1114 = vertical2;
            PaddingValues paddingValues1115 = paddingValues3;
            LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Horizontal, rememberRowSlots(rows, vertical2, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 12) & 112) | (i11111111117 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, fM3775constructorimpl, vertical2.getSpacing(), content, composerStartRestartGroup, (i11111111117 & 29360128) | (i11111111118 & 7168) | 56 | (57344 & i11111111119) | (i11111111119 & 458752) | (i11111111117 & 3670016) | (i11111111118 & 234881024), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            vertical3 = vertical1114;
            z6 = z5;
            paddingValues4 = paddingValues1115;
            f2 = fM3775constructorimpl;
            flingBehavior4 = flingBehavior3;
            z7 = z4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

            public final void invoke(@Nullable Composer composer2, int i20) {
                LazyStaggeredGridDslKt.m646LazyHorizontalStaggeredGridcJHQLPU(rows, modifier4, lazyStaggeredGridState3, paddingValues4, z6, vertical3, f2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0157  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x017c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0182  */
    /* JADX WARN: Code duplicated, block: B:125:0x018a  */
    /* JADX WARN: Code duplicated, block: B:127:0x018e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0198  */
    /* JADX WARN: Code duplicated, block: B:130:0x019b  */
    /* JADX WARN: Code duplicated, block: B:132:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:143:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:150:0x0249  */
    /* JADX WARN: Code duplicated, block: B:155:0x0262  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x0107  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    public static final void m647LazyVerticalStaggeredGridzadm560(@NotNull final StaggeredGridCells columns, @Nullable Modifier modifier, @Nullable LazyStaggeredGridState lazyStaggeredGridState, @Nullable PaddingValues paddingValues, boolean z, float f, @Nullable Arrangement.Horizontal horizontal, @Nullable FlingBehavior flingBehavior, boolean z2, @NotNull final Function1<? super LazyStaggeredGridScope, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        PaddingValues paddingValues2;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        float f2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        LazyStaggeredGridState lazyStaggeredGridStateRememberLazyStaggeredGridState;
        PaddingValues paddingValuesM471PaddingValues0680j_4;
        float fM3775constructorimpl;
        Arrangement.Horizontal horizontalM392spacedBy0680j_4;
        FlingBehavior flingBehavior2;
        boolean z4;
        LazyStaggeredGridState lazyStaggeredGridState2;
        Modifier modifier3;
        float f3;
        FlingBehavior flingBehavior3;
        boolean z5;
        PaddingValues paddingValues3;
        final Modifier modifier4;
        final LazyStaggeredGridState lazyStaggeredGridState3;
        final Arrangement.Horizontal horizontal2;
        final boolean z6;
        final PaddingValues paddingValues4;
        final float f4;
        final FlingBehavior flingBehavior4;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1695323794);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(columns) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 == 0) {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i6;
                }
                i7 = i2 & 16;
                if (i7 != 0) {
                    if ((i & 57344) == 0) {
                        z3 = z;
                        if (composerStartRestartGroup.changed(z3)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i3 |= i8;
                    }
                    i9 = i2 & 32;
                    if (i9 != 0) {
                        i3 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i & 458752) == 0) {
                            if (composerStartRestartGroup.changed(f2)) {
                                i10 = 131072;
                            } else {
                                i10 = 65536;
                            }
                            i3 |= i10;
                        }
                    }
                    i11 = i2 & 64;
                    if (i11 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(horizontal)) {
                            i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                        } else {
                            i12 = 524288;
                        }
                        i3 |= i12;
                    }
                    if ((i & 29360128) != 0) {
                        i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                    }
                    i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    if (i13 != 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(z2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i3 |= i14;
                    }
                    if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                        if ((1879048192 & i) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i15 = 536870912;
                            } else {
                                i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                            }
                        }
                        if (i4 != 4 && (1533916891 & i3) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            lazyStaggeredGridState3 = lazyStaggeredGridState;
                            horizontal2 = horizontal;
                            flingBehavior4 = flingBehavior;
                            modifier4 = modifier2;
                            paddingValues4 = paddingValues2;
                            f4 = f2;
                            z6 = z3;
                            z7 = z2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i16 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                                }
                                if (i5 != 0) {
                                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                                }
                                if (i7 != 0) {
                                    z3 = false;
                                }
                                if (i9 != 0) {
                                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                                } else {
                                    fM3775constructorimpl = f2;
                                }
                                if (i11 != 0) {
                                    horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                                } else {
                                    horizontalM392spacedBy0680j_4 = horizontal;
                                }
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i13 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                                modifier3 = modifier2;
                                f3 = fM3775constructorimpl;
                                flingBehavior3 = flingBehavior2;
                                z5 = z3;
                                paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if (i4 != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                lazyStaggeredGridState2 = lazyStaggeredGridState;
                                flingBehavior3 = flingBehavior;
                                z4 = z2;
                                modifier3 = modifier2;
                                f3 = f2;
                                z5 = z3;
                                horizontalM392spacedBy0680j_4 = horizontal;
                                paddingValues3 = paddingValues2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                            }
                            int i17 = i3 >> 3;
                            int i18 = i3 << 3;
                            Arrangement.Horizontal horizontal3 = horizontalM392spacedBy0680j_4;
                            PaddingValues paddingValues5 = paddingValues3;
                            LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i17 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i18) | (i18 & 458752) | (i17 & 3670016) | (i17 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            lazyStaggeredGridState3 = lazyStaggeredGridState2;
                            horizontal2 = horizontal3;
                            z6 = z5;
                            paddingValues4 = paddingValues5;
                            f4 = f3;
                            flingBehavior4 = flingBehavior3;
                            z7 = z4;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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
                                LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                    i15 = 805306368;
                    i3 |= i15;
                    if (i4 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        int i19 = i3 >> 3;
                        int i110 = i3 << 3;
                        Arrangement.Horizontal horizontal4 = horizontalM392spacedBy0680j_4;
                        PaddingValues paddingValues6 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i19 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i110) | (i110 & 458752) | (i19 & 3670016) | (i19 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal4;
                        z6 = z5;
                        paddingValues4 = paddingValues6;
                        f4 = f3;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        int i111 = i3 >> 3;
                        int i112 = i3 << 3;
                        Arrangement.Horizontal horizontal5 = horizontalM392spacedBy0680j_4;
                        PaddingValues paddingValues7 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i112) | (i112 & 458752) | (i111 & 3670016) | (i111 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal5;
                        z6 = z5;
                        paddingValues4 = paddingValues7;
                        f4 = f3;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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
                            LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i3 |= 24576;
                z3 = z;
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i13 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i3 |= i14;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 536870912;
                        } else {
                            i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if (i4 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        int i113 = i3 >> 3;
                        int i114 = i3 << 3;
                        Arrangement.Horizontal horizontal6 = horizontalM392spacedBy0680j_4;
                        PaddingValues paddingValues8 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i113 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i114) | (i114 & 458752) | (i113 & 3670016) | (i113 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal6;
                        z6 = z5;
                        paddingValues4 = paddingValues8;
                        f4 = f3;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        int i115 = i3 >> 3;
                        int i116 = i3 << 3;
                        Arrangement.Horizontal horizontal7 = horizontalM392spacedBy0680j_4;
                        PaddingValues paddingValues9 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i115 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i116) | (i116 & 458752) | (i115 & 3670016) | (i115 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal7;
                        z6 = z5;
                        paddingValues4 = paddingValues9;
                        f4 = f3;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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
                            LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i15 = 805306368;
                i3 |= i15;
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i117 = i3 >> 3;
                    int i118 = i3 << 3;
                    Arrangement.Horizontal horizontal8 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues10 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i117 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i118) | (i118 & 458752) | (i117 & 3670016) | (i117 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal8;
                    z6 = z5;
                    paddingValues4 = paddingValues10;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i119 = i3 >> 3;
                    int i1110 = i3 << 3;
                    Arrangement.Horizontal horizontal9 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues11 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i119 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i1110) | (i1110 & 458752) | (i119 & 3670016) | (i119 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal9;
                    z6 = z5;
                    paddingValues4 = paddingValues11;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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
                        LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            paddingValues2 = paddingValues;
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 57344) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i13 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i3 |= i14;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 536870912;
                        } else {
                            i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if (i4 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        int i1111 = i3 >> 3;
                        int i1112 = i3 << 3;
                        Arrangement.Horizontal horizontal10 = horizontalM392spacedBy0680j_4;
                        PaddingValues paddingValues12 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i1112) | (i1112 & 458752) | (i1111 & 3670016) | (i1111 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal10;
                        z6 = z5;
                        paddingValues4 = paddingValues12;
                        f4 = f3;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        int i1113 = i3 >> 3;
                        int i1114 = i3 << 3;
                        Arrangement.Horizontal horizontal11 = horizontalM392spacedBy0680j_4;
                        PaddingValues paddingValues13 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1113 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i1114) | (i1114 & 458752) | (i1113 & 3670016) | (i1113 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal11;
                        z6 = z5;
                        paddingValues4 = paddingValues13;
                        f4 = f3;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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
                            LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i15 = 805306368;
                i3 |= i15;
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i1115 = i3 >> 3;
                    int i1116 = i3 << 3;
                    Arrangement.Horizontal horizontal12 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues14 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1115 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i1116) | (i1116 & 458752) | (i1115 & 3670016) | (i1115 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal12;
                    z6 = z5;
                    paddingValues4 = paddingValues14;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i1117 = i3 >> 3;
                    int i1118 = i3 << 3;
                    Arrangement.Horizontal horizontal13 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues15 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1117 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i1118) | (i1118 & 458752) | (i1117 & 3670016) | (i1117 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal13;
                    z6 = z5;
                    paddingValues4 = paddingValues15;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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
                        LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            z3 = z;
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i13 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i3 |= i14;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 536870912;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i1119 = i3 >> 3;
                    int i11110 = i3 << 3;
                    Arrangement.Horizontal horizontal14 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues16 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1119 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i11110) | (i11110 & 458752) | (i1119 & 3670016) | (i1119 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal14;
                    z6 = z5;
                    paddingValues4 = paddingValues16;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i11111 = i3 >> 3;
                    int i11112 = i3 << 3;
                    Arrangement.Horizontal horizontal15 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues17 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i11112) | (i11112 & 458752) | (i11111 & 3670016) | (i11111 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal15;
                    z6 = z5;
                    paddingValues4 = paddingValues17;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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
                        LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i15 = 805306368;
            i3 |= i15;
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                int i11113 = i3 >> 3;
                int i11114 = i3 << 3;
                Arrangement.Horizontal horizontal16 = horizontalM392spacedBy0680j_4;
                PaddingValues paddingValues18 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11113 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i11114) | (i11114 & 458752) | (i11113 & 3670016) | (i11113 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal16;
                z6 = z5;
                paddingValues4 = paddingValues18;
                f4 = f3;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                int i11115 = i3 >> 3;
                int i11116 = i3 << 3;
                Arrangement.Horizontal horizontal17 = horizontalM392spacedBy0680j_4;
                PaddingValues paddingValues19 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11115 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i11116) | (i11116 & 458752) | (i11115 & 3670016) | (i11115 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal17;
                z6 = z5;
                paddingValues4 = paddingValues19;
                f4 = f3;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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
                    LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        i5 = i2 & 8;
        if (i5 != 0) {
            if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            i7 = i2 & 16;
            if (i7 != 0) {
                if ((i & 57344) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i3 |= i8;
                }
                i9 = i2 & 32;
                if (i9 != 0) {
                    i3 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(f2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i3 |= i10;
                    }
                }
                i11 = i2 & 64;
                if (i11 != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(horizontal)) {
                        i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    } else {
                        i12 = 524288;
                    }
                    i3 |= i12;
                }
                if ((i & 29360128) != 0) {
                    i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
                }
                i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (i13 != 0) {
                    i3 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i3 |= i14;
                }
                if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                    if ((1879048192 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 536870912;
                        } else {
                            i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                        }
                    }
                    if (i4 != 4) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        int i11117 = i3 >> 3;
                        int i11118 = i3 << 3;
                        Arrangement.Horizontal horizontal18 = horizontalM392spacedBy0680j_4;
                        PaddingValues paddingValues110 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11117 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i11118) | (i11118 & 458752) | (i11117 & 3670016) | (i11117 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal18;
                        z6 = z5;
                        paddingValues4 = paddingValues110;
                        f4 = f3;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        } else {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                            }
                            if (i5 != 0) {
                                paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                            }
                            if (i7 != 0) {
                                z3 = false;
                            }
                            if (i9 != 0) {
                                fM3775constructorimpl = Dp.m3775constructorimpl(0);
                            } else {
                                fM3775constructorimpl = f2;
                            }
                            if (i11 != 0) {
                                horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                            } else {
                                horizontalM392spacedBy0680j_4 = horizontal;
                            }
                            if ((i2 & 128) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i13 != 0) {
                                z4 = true;
                            } else {
                                z4 = z2;
                            }
                            lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                            modifier3 = modifier2;
                            f3 = fM3775constructorimpl;
                            flingBehavior3 = flingBehavior2;
                            z5 = z3;
                            paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                        }
                        int i11119 = i3 >> 3;
                        int i111110 = i3 << 3;
                        Arrangement.Horizontal horizontal19 = horizontalM392spacedBy0680j_4;
                        PaddingValues paddingValues111 = paddingValues3;
                        LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11119 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i111110) | (i111110 & 458752) | (i11119 & 3670016) | (i11119 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = horizontal19;
                        z6 = z5;
                        paddingValues4 = paddingValues111;
                        f4 = f3;
                        flingBehavior4 = flingBehavior3;
                        z7 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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

                        public final void invoke(@Nullable Composer composer2, int i111111) {
                            LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i15 = 805306368;
                i3 |= i15;
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i111111 = i3 >> 3;
                    int i111112 = i3 << 3;
                    Arrangement.Horizontal horizontal110 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues112 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111111 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i111112) | (i111112 & 458752) | (i111111 & 3670016) | (i111111 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal110;
                    z6 = z5;
                    paddingValues4 = paddingValues112;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i111113 = i3 >> 3;
                    int i111114 = i3 << 3;
                    Arrangement.Horizontal horizontal111 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues113 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111113 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i111114) | (i111114 & 458752) | (i111113 & 3670016) | (i111113 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal111;
                    z6 = z5;
                    paddingValues4 = paddingValues113;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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
                        LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 24576;
            z3 = z;
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i13 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i3 |= i14;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 536870912;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i111115 = i3 >> 3;
                    int i111116 = i3 << 3;
                    Arrangement.Horizontal horizontal112 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues114 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111115 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i111116) | (i111116 & 458752) | (i111115 & 3670016) | (i111115 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal112;
                    z6 = z5;
                    paddingValues4 = paddingValues114;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i111117 = i3 >> 3;
                    int i111118 = i3 << 3;
                    Arrangement.Horizontal horizontal113 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues115 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111117 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i111118) | (i111118 & 458752) | (i111117 & 3670016) | (i111117 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal113;
                    z6 = z5;
                    paddingValues4 = paddingValues115;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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

                    public final void invoke(@Nullable Composer composer2, int i111119) {
                        LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i15 = 805306368;
            i3 |= i15;
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                int i111119 = i3 >> 3;
                int i1111110 = i3 << 3;
                Arrangement.Horizontal horizontal114 = horizontalM392spacedBy0680j_4;
                PaddingValues paddingValues116 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i111119 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i1111110) | (i1111110 & 458752) | (i111119 & 3670016) | (i111119 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal114;
                z6 = z5;
                paddingValues4 = paddingValues116;
                f4 = f3;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                int i1111111 = i3 >> 3;
                int i1111112 = i3 << 3;
                Arrangement.Horizontal horizontal115 = horizontalM392spacedBy0680j_4;
                PaddingValues paddingValues117 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111111 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i1111112) | (i1111112 & 458752) | (i1111111 & 3670016) | (i1111111 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal115;
                z6 = z5;
                paddingValues4 = paddingValues117;
                f4 = f3;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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

                public final void invoke(@Nullable Composer composer2, int i1111113) {
                    LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        paddingValues2 = paddingValues;
        i7 = i2 & 16;
        if (i7 != 0) {
            if ((i & 57344) == 0) {
                z3 = z;
                if (composerStartRestartGroup.changed(z3)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i3 |= i8;
            }
            i9 = i2 & 32;
            if (i9 != 0) {
                i3 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i3 |= i10;
                }
            }
            i11 = i2 & 64;
            if (i11 != 0) {
                i3 |= 1572864;
            } else if ((i & 3670016) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                } else {
                    i12 = 524288;
                }
                i3 |= i12;
            }
            if ((i & 29360128) != 0) {
                i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
            }
            i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            if (i13 != 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i3 |= i14;
            }
            if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                if ((1879048192 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 536870912;
                    } else {
                        i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                }
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i1111113 = i3 >> 3;
                    int i1111114 = i3 << 3;
                    Arrangement.Horizontal horizontal116 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues118 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111113 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i1111114) | (i1111114 & 458752) | (i1111113 & 3670016) | (i1111113 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal116;
                    z6 = z5;
                    paddingValues4 = paddingValues118;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -897;
                        } else {
                            lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                        }
                        if (i5 != 0) {
                            paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i7 != 0) {
                            z3 = false;
                        }
                        if (i9 != 0) {
                            fM3775constructorimpl = Dp.m3775constructorimpl(0);
                        } else {
                            fM3775constructorimpl = f2;
                        }
                        if (i11 != 0) {
                            horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                        } else {
                            horizontalM392spacedBy0680j_4 = horizontal;
                        }
                        if ((i2 & 128) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i13 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                        modifier3 = modifier2;
                        f3 = fM3775constructorimpl;
                        flingBehavior3 = flingBehavior2;
                        z5 = z3;
                        paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                    }
                    int i1111115 = i3 >> 3;
                    int i1111116 = i3 << 3;
                    Arrangement.Horizontal horizontal117 = horizontalM392spacedBy0680j_4;
                    PaddingValues paddingValues119 = paddingValues3;
                    LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111115 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i1111116) | (i1111116 & 458752) | (i1111115 & 3670016) | (i1111115 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyStaggeredGridState3 = lazyStaggeredGridState2;
                    horizontal2 = horizontal117;
                    z6 = z5;
                    paddingValues4 = paddingValues119;
                    f4 = f3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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
                        LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i15 = 805306368;
            i3 |= i15;
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                int i1111117 = i3 >> 3;
                int i1111118 = i3 << 3;
                Arrangement.Horizontal horizontal118 = horizontalM392spacedBy0680j_4;
                PaddingValues paddingValues1110 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111117 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i1111118) | (i1111118 & 458752) | (i1111117 & 3670016) | (i1111117 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal118;
                z6 = z5;
                paddingValues4 = paddingValues1110;
                f4 = f3;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                int i1111119 = i3 >> 3;
                int i11111110 = i3 << 3;
                Arrangement.Horizontal horizontal119 = horizontalM392spacedBy0680j_4;
                PaddingValues paddingValues1111 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1111119 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i11111110) | (i11111110 & 458752) | (i1111119 & 3670016) | (i1111119 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal119;
                z6 = z5;
                paddingValues4 = paddingValues1111;
                f4 = f3;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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

                public final void invoke(@Nullable Composer composer2, int i11111111) {
                    LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 24576;
        z3 = z;
        i9 = i2 & 32;
        if (i9 != 0) {
            i3 |= 196608;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
        }
        i11 = i2 & 64;
        if (i11 != 0) {
            i3 |= 1572864;
        } else if ((i & 3670016) == 0) {
            if (composerStartRestartGroup.changed(horizontal)) {
                i12 = ZegoConstants.ErrorMask.RoomServerErrorMask;
            } else {
                i12 = 524288;
            }
            i3 |= i12;
        }
        if ((i & 29360128) != 0) {
            i3 |= ((i2 & 128) == 0 || !composerStartRestartGroup.changed(flingBehavior)) ? Configuration.BLOCK_SIZE : 8388608;
        }
        i13 = i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (i13 != 0) {
            i3 |= 100663296;
        } else if ((i & 234881024) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i3 |= i14;
        }
        if ((i2 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
            if ((1879048192 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 536870912;
                } else {
                    i15 = SQLiteDatabase.CREATE_IF_NECESSARY;
                }
            }
            if (i4 != 4) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                int i11111111 = i3 >> 3;
                int i11111112 = i3 << 3;
                Arrangement.Horizontal horizontal1110 = horizontalM392spacedBy0680j_4;
                PaddingValues paddingValues1112 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111111 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i11111112) | (i11111112 & 458752) | (i11111111 & 3670016) | (i11111111 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal1110;
                z6 = z5;
                paddingValues4 = paddingValues1112;
                f4 = f3;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -897;
                    } else {
                        lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                    }
                    if (i5 != 0) {
                        paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i7 != 0) {
                        z3 = false;
                    }
                    if (i9 != 0) {
                        fM3775constructorimpl = Dp.m3775constructorimpl(0);
                    } else {
                        fM3775constructorimpl = f2;
                    }
                    if (i11 != 0) {
                        horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                    } else {
                        horizontalM392spacedBy0680j_4 = horizontal;
                    }
                    if ((i2 & 128) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i13 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                    modifier3 = modifier2;
                    f3 = fM3775constructorimpl;
                    flingBehavior3 = flingBehavior2;
                    z5 = z3;
                    paddingValues3 = paddingValuesM471PaddingValues0680j_4;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
                }
                int i11111113 = i3 >> 3;
                int i11111114 = i3 << 3;
                Arrangement.Horizontal horizontal1111 = horizontalM392spacedBy0680j_4;
                PaddingValues paddingValues1113 = paddingValues3;
                LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111113 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i11111114) | (i11111114 & 458752) | (i11111113 & 3670016) | (i11111113 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                horizontal2 = horizontal1111;
                z6 = z5;
                paddingValues4 = paddingValues1113;
                f4 = f3;
                flingBehavior4 = flingBehavior3;
                z7 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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

                public final void invoke(@Nullable Composer composer2, int i11111115) {
                    LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i15 = 805306368;
        i3 |= i15;
        if (i4 != 4) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i5 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f2;
                }
                if (i11 != 0) {
                    horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    horizontalM392spacedBy0680j_4 = horizontal;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                f3 = fM3775constructorimpl;
                flingBehavior3 = flingBehavior2;
                z5 = z3;
                paddingValues3 = paddingValuesM471PaddingValues0680j_4;
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i5 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f2;
                }
                if (i11 != 0) {
                    horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    horizontalM392spacedBy0680j_4 = horizontal;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                f3 = fM3775constructorimpl;
                flingBehavior3 = flingBehavior2;
                z5 = z3;
                paddingValues3 = paddingValuesM471PaddingValues0680j_4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
            }
            int i11111115 = i3 >> 3;
            int i11111116 = i3 << 3;
            Arrangement.Horizontal horizontal1112 = horizontalM392spacedBy0680j_4;
            PaddingValues paddingValues1114 = paddingValues3;
            LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111115 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i11111116) | (i11111116 & 458752) | (i11111115 & 3670016) | (i11111115 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            horizontal2 = horizontal1112;
            z6 = z5;
            paddingValues4 = paddingValues1114;
            f4 = f3;
            flingBehavior4 = flingBehavior3;
            z7 = z4;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i5 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f2;
                }
                if (i11 != 0) {
                    horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    horizontalM392spacedBy0680j_4 = horizontal;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                f3 = fM3775constructorimpl;
                flingBehavior3 = flingBehavior2;
                z5 = z3;
                paddingValues3 = paddingValuesM471PaddingValues0680j_4;
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -897;
                } else {
                    lazyStaggeredGridStateRememberLazyStaggeredGridState = lazyStaggeredGridState;
                }
                if (i5 != 0) {
                    paddingValuesM471PaddingValues0680j_4 = PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    paddingValuesM471PaddingValues0680j_4 = paddingValues2;
                }
                if (i7 != 0) {
                    z3 = false;
                }
                if (i9 != 0) {
                    fM3775constructorimpl = Dp.m3775constructorimpl(0);
                } else {
                    fM3775constructorimpl = f2;
                }
                if (i11 != 0) {
                    horizontalM392spacedBy0680j_4 = Arrangement.INSTANCE.m392spacedBy0680j_4(Dp.m3775constructorimpl(0));
                } else {
                    horizontalM392spacedBy0680j_4 = horizontal;
                }
                if ((i2 & 128) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i13 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                lazyStaggeredGridState2 = lazyStaggeredGridStateRememberLazyStaggeredGridState;
                modifier3 = modifier2;
                f3 = fM3775constructorimpl;
                flingBehavior3 = flingBehavior2;
                z5 = z3;
                paddingValues3 = paddingValuesM471PaddingValues0680j_4;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1695323794, i3, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:61)");
            }
            int i11111117 = i3 >> 3;
            int i11111118 = i3 << 3;
            Arrangement.Horizontal horizontal1113 = horizontalM392spacedBy0680j_4;
            PaddingValues paddingValues1115 = paddingValues3;
            LazyStaggeredGridKt.m652LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, Orientation.Vertical, rememberColumnSlots(columns, horizontalM392spacedBy0680j_4, paddingValues3, composerStartRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i11111117 & 896)), modifier3, paddingValues3, z5, flingBehavior3, z4, f3, horizontalM392spacedBy0680j_4.getSpacing(), content, composerStartRestartGroup, ((i3 << 6) & 7168) | 56 | (57344 & i11111118) | (i11111118 & 458752) | (i11111117 & 3670016) | (i11111117 & 29360128) | ((i3 << 9) & 234881024), (i3 >> 27) & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyStaggeredGridState3 = lazyStaggeredGridState2;
            horizontal2 = horizontal1113;
            z6 = z5;
            paddingValues4 = paddingValues1115;
            f4 = f3;
            flingBehavior4 = flingBehavior3;
            z7 = z4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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
                LazyStaggeredGridDslKt.m647LazyVerticalStaggeredGridzadm560(columns, modifier4, lazyStaggeredGridState3, paddingValues4, z6, f4, horizontal2, flingBehavior4, z7, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull List<? extends T> items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> contentType, @Nullable Function1<? super T, StaggeredGridItemSpan> function2, @NotNull Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, items) : null, new AnonymousClass3(contentType, items), function2 != null ? new LazyStaggeredGridDslKt$items$4$1(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List items, Function1 function1, Function1 contentType, Function1 function2, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i & 8) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, items) : null, new AnonymousClass3(contentType, items), function2 != null ? new LazyStaggeredGridDslKt$items$4$1(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull List<? extends T> items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @Nullable Function2<? super Integer, ? super T, StaggeredGridItemSpan> function3, @NotNull Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, items) : null, new C06893(contentType, items), function3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function3, items) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C06905(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List items, Function2 function2, Function2 contentType, Function2 function3, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1
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
        if ((i & 8) != 0) {
            function3 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, items) : null, new C06893(contentType, items), function3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function3, items) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C06905(itemContent, items)));
    }

    @Composable
    private static final Function2<Density, Constraints, LazyStaggeredGridSlots> rememberColumnSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(-1038659655);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1038659655, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(staggeredGridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return m648invoke0kLqBqw(density, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m648invoke0kLqBqw(@NotNull Density $receiver, long j) {
                    Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                    if (!(Constraints.m3743getMaxWidthimpl(j) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
                    }
                    PaddingValues paddingValues2 = paddingValues;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(j) - $receiver.mo320roundToPx0680j_4(Dp.m3775constructorimpl(PaddingKt.calculateEndPadding(paddingValues, layoutDirection) + PaddingKt.calculateStartPadding(paddingValues2, layoutDirection)));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes($receiver, iM3743getMaxWidthimpl, $receiver.mo320roundToPx0680j_4(horizontal2.getSpacing()));
                    int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
                    horizontal2.arrange($receiver, iM3743getMaxWidthimpl, iArrCalculateCrossAxisCellSizes, layoutDirection, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, LazyStaggeredGridSlots> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    @Composable
    private static final Function2<Density, Constraints, LazyStaggeredGridSlots> rememberRowSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(-675899235);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-675899235, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(staggeredGridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return m649invoke0kLqBqw(density, constraints.getValue());
                }

                @NotNull
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m649invoke0kLqBqw(@NotNull Density $receiver, long j) {
                    Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                    if (!(Constraints.m3742getMaxHeightimpl(j) != Integer.MAX_VALUE)) {
                        throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.".toString());
                    }
                    int iM3742getMaxHeightimpl = Constraints.m3742getMaxHeightimpl(j) - $receiver.mo320roundToPx0680j_4(Dp.m3775constructorimpl(paddingValues.getBottom() + paddingValues.getTop()));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes($receiver, iM3742getMaxHeightimpl, $receiver.mo320roundToPx0680j_4(vertical2.getSpacing()));
                    int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
                    vertical2.arrange($receiver, iM3742getMaxHeightimpl, iArrCalculateCrossAxisCellSizes, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, LazyStaggeredGridSlots> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull T[] items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> contentType, @Nullable Function1<? super T, StaggeredGridItemSpan> function2, @NotNull Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, items) : null, new AnonymousClass8(contentType, items), function2 != null ? new LazyStaggeredGridDslKt$items$9$1(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyStaggeredGridScope lazyStaggeredGridScope, @NotNull T[] items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @Nullable Function2<? super Integer, ? super T, StaggeredGridItemSpan> function3, @NotNull Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, items) : null, new C06928(contentType, items), function3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function3, items) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C068810(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] items, Function1 function1, Function1 contentType, Function1 function2, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i & 8) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, items) : null, new AnonymousClass8(contentType, items), function2 != null ? new LazyStaggeredGridDslKt$items$9$1(function2, items) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] items, Function2 function2, Function2 contentType, Function2 function3, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6
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
        if ((i & 8) != 0) {
            function3 = null;
        }
        Intrinsics.checkNotNullParameter(lazyStaggeredGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, items) : null, new C06928(contentType, items), function3 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function3, items) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C068810(itemContent, items)));
    }
}
