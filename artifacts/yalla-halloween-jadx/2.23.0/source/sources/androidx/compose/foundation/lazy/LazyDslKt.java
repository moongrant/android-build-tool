package androidx.compose.foundation.lazy;

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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.qiniu.android.storage.Configuration;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016\u001al\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001av\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a¬\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0085\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010,\u001a¬\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010.\u001a\u0085\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001aë\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u00104\u001a¯\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001aë\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u00106\u001a¯\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u00107\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00068"}, d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "userScrollEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "items", "T", "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,423:1\n136#1,12:424\n171#1,12:436\n206#1,12:448\n241#1,12:460\n154#2:472\n154#2:473\n154#2:474\n154#2:475\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n154#1:424,12\n189#1:436,12\n224#1:448,12\n259#1:460,12\n293#1:472\n349#1:473\n377#1:474\n403#1:475\n*E\n"})
public final class LazyDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$1\n*L\n1#1,423:1\n*E\n"})
    public static final class C06871 extends Lambda implements Function1 {
        public static final C06871 INSTANCE = new C06871();

        public C06871() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$2\n*L\n1#1,423:1\n*E\n"})
    public static final class C06882 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06882(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$3\n*L\n1#1,423:1\n*E\n"})
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyItemScope items, int i, @Nullable Composer composer, int i2) {
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
                ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
            }
            this.$itemContent.invoke(items, (T) this.$items.get(i), composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$5\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass5 extends Lambda implements Function1 {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$6\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass6 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Function1<? super T, ? extends Object> function1, T[] tArr) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$7\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass7 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Function1<? super T, ? extends Object> function1, T[] tArr) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$8\n*L\n1#1,423:1\n*E\n"})
    public static final class AnonymousClass8 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
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
        public final void invoke(@NotNull LazyItemScope items, int i, @Nullable Composer composer, int i2) {
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
                ComposerKt.traceEventStart(-1043393750, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:214)");
            }
            this.$itemContent.invoke(items, this.$items[i], composer, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$2\n*L\n1#1,423:1\n*E\n"})
    public static final class C06902 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ List<T> $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06902(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$3\n*L\n1#1,423:1\n*E\n"})
    public static final class C06913 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06913(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n*L\n1#1,423:1\n*E\n"})
    public static final class C06924 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06924(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyItemScope items, int i, @Nullable Composer composer, int i2) {
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
                ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
            }
            this.$itemContent.invoke(items, Integer.valueOf(i), (T) this.$items.get(i), composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$6\n*L\n1#1,423:1\n*E\n"})
    public static final class C06946 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ T[] $items;
        final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06946(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$7\n*L\n1#1,423:1\n*E\n"})
    public static final class C06957 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06957(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
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

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$8\n*L\n1#1,423:1\n*E\n"})
    public static final class C06968 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06968(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
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
        public final void invoke(@NotNull LazyItemScope items, int i, @Nullable Composer composer, int i2) {
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
                ComposerKt.traceEventStart(1600639390, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:249)");
            }
            this.$itemContent.invoke(items, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0148  */
    /* JADX WARN: Code duplicated, block: B:118:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0177  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0181  */
    /* JADX WARN: Code duplicated, block: B:124:0x0189  */
    /* JADX WARN: Code duplicated, block: B:126:0x018d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0197  */
    /* JADX WARN: Code duplicated, block: B:130:0x019b  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:155:0x0240  */
    /* JADX WARN: Code duplicated, block: B:160:0x025a  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:96:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyColumn(@Nullable Modifier modifier, @Nullable LazyListState lazyListState, @Nullable PaddingValues paddingValues, boolean z, @Nullable Arrangement.Vertical vertical, @Nullable Alignment.Horizontal horizontal, @Nullable FlingBehavior flingBehavior, boolean z2, @NotNull final Function1<? super LazyListScope, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        int i5;
        Arrangement.Vertical vertical2;
        int i6;
        Alignment.Horizontal horizontal2;
        int i7;
        int i8;
        int i9;
        int i10;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM469PaddingValues0680j_4;
        boolean z4;
        Arrangement.Vertical bottom;
        Alignment.Horizontal start;
        FlingBehavior flingBehavior2;
        boolean z5;
        Modifier modifier3;
        LazyListState lazyListState2;
        boolean z6;
        PaddingValues paddingValues3;
        Arrangement.Vertical vertical3;
        Alignment.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        Arrangement arrangement;
        Composer composer2;
        final Modifier modifier4;
        final LazyListState lazyListState3;
        final PaddingValues paddingValues4;
        final boolean z7;
        final Arrangement.Vertical vertical4;
        final Alignment.Horizontal horizontal4;
        final FlingBehavior flingBehavior4;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-740714857);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(lazyListState)) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 896) == 0) {
                paddingValues2 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValues2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        int i14 = composerStartRestartGroup.changed(vertical2) ? 16384 : 8192;
                        i3 |= i14;
                    } else {
                        vertical2 = vertical;
                    }
                    i3 |= i14;
                } else {
                    vertical2 = vertical;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                    horizontal2 = horizontal;
                } else {
                    horizontal2 = horizontal;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(horizontal2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                }
                if ((i & 3670016) != 0) {
                    if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i11 = 524288;
                    } else {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    }
                    i3 |= i11;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((i & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                    }
                    if ((191739611 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i13 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            z4 = i4 == 0 ? z3 : false;
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    bottom = arrangement.getBottom();
                                } else {
                                    bottom = arrangement.getTop();
                                }
                                i3 &= -57345;
                            } else {
                                bottom = vertical2;
                            }
                            if (i6 != 0) {
                                start = Alignment.INSTANCE.getStart();
                            } else {
                                start = horizontal2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            modifier3 = modifier2;
                            lazyListState2 = lazyListStateRememberLazyListState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            vertical3 = bottom;
                            horizontal3 = start;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            modifier3 = modifier;
                            lazyListState2 = lazyListState;
                            flingBehavior3 = flingBehavior;
                            z5 = z2;
                            paddingValues3 = paddingValues2;
                            z6 = z3;
                            vertical3 = vertical2;
                            horizontal3 = horizontal2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                        }
                        int i15 = i3 >> 3;
                        composer2 = composerStartRestartGroup;
                        LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i15) | (i15 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyListState3 = lazyListState2;
                        paddingValues4 = paddingValues3;
                        z7 = z6;
                        vertical4 = vertical3;
                        horizontal4 = horizontal3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        lazyListState3 = lazyListState;
                        flingBehavior4 = flingBehavior;
                        paddingValues4 = paddingValues2;
                        composer2 = composerStartRestartGroup;
                        z7 = z3;
                        vertical4 = vertical2;
                        horizontal4 = horizontal2;
                        z8 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i16) {
                            LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = 100663296;
                i3 |= i10;
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i16 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i16) | (i16 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i17 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i17) | (i17 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i18) {
                        LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z3 = z;
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i14;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i14;
            } else {
                vertical2 = vertical;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                horizontal2 = horizontal;
            } else {
                horizontal2 = horizontal;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = Configuration.BLOCK_SIZE;
                }
                i3 |= i9;
            }
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                }
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i18 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i18) | (i18 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i19 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i19) | (i19 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i110) {
                        LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = 100663296;
            i3 |= i10;
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i110 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i110) | (i110 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i111 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i111) | (i111 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i112) {
                    LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                z3 = z;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i14;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i14;
            } else {
                vertical2 = vertical;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                horizontal2 = horizontal;
            } else {
                horizontal2 = horizontal;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(horizontal2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = Configuration.BLOCK_SIZE;
                }
                i3 |= i9;
            }
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((i & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                }
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i112 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112) | (i112 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                        } else {
                            bottom = vertical2;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        vertical3 = bottom;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                    }
                    int i113 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i113) | (i113 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i114) {
                        LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = 100663296;
            i3 |= i10;
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i114 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i114) | (i114 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i115 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i115) | (i115 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i116) {
                    LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z3 = z;
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                vertical2 = vertical;
                if (composerStartRestartGroup.changed(vertical2)) {
                }
                i3 |= i14;
            } else {
                vertical2 = vertical;
            }
            i3 |= i14;
        } else {
            vertical2 = vertical;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
            horizontal2 = horizontal;
        } else {
            horizontal2 = horizontal;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(horizontal2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
        }
        if ((i & 3670016) != 0) {
            if ((i2 & 64) == 0) {
                i11 = 524288;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i9 = 8388608;
            } else {
                i9 = Configuration.BLOCK_SIZE;
            }
            i3 |= i9;
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            if ((i & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
            }
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i116 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i116) | (i116 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                    } else {
                        bottom = vertical2;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    vertical3 = bottom;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
                }
                int i117 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i117) | (i117 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i118) {
                    LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i10 = 100663296;
        i3 |= i10;
        if ((191739611 & i3) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i13 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i13 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
            }
            int i118 = i3 >> 3;
            composer2 = composerStartRestartGroup;
            LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i118) | (i118 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState3 = lazyListState2;
            paddingValues4 = paddingValues3;
            z7 = z6;
            vertical4 = vertical3;
            horizontal4 = horizontal3;
            flingBehavior4 = flingBehavior3;
            z8 = z5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i13 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i13 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                } else {
                    bottom = vertical2;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                vertical3 = bottom;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:345)");
            }
            int i119 = i3 >> 3;
            composer2 = composerStartRestartGroup;
            LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, true, flingBehavior3, z5, 0, horizontal3, vertical3, null, null, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i119) | (i119 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState3 = lazyListState2;
            paddingValues4 = paddingValues3;
            z7 = z6;
            vertical4 = vertical3;
            horizontal4 = horizontal3;
            flingBehavior4 = flingBehavior3;
            z8 = z5;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i1110) {
                LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues4, z7, vertical4, horizontal4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0147  */
    /* JADX WARN: Code duplicated, block: B:118:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0176  */
    /* JADX WARN: Code duplicated, block: B:120:0x0179  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:124:0x0188  */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0196  */
    /* JADX WARN: Code duplicated, block: B:130:0x019a  */
    /* JADX WARN: Code duplicated, block: B:133:0x019f  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01af  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01be  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:152:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:155:0x023f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LazyRow(@Nullable Modifier modifier, @Nullable LazyListState lazyListState, @Nullable PaddingValues paddingValues, boolean z, @Nullable Arrangement.Horizontal horizontal, @Nullable Alignment.Vertical vertical, @Nullable FlingBehavior flingBehavior, boolean z2, @NotNull final Function1<? super LazyListScope, Unit> content, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        int i5;
        Arrangement.Horizontal horizontal2;
        int i6;
        Alignment.Vertical vertical2;
        int i7;
        int i8;
        int i9;
        int i10;
        Modifier modifier2;
        LazyListState lazyListStateRememberLazyListState;
        PaddingValues paddingValuesM469PaddingValues0680j_4;
        boolean z4;
        Arrangement.Horizontal end;
        Alignment.Vertical top;
        FlingBehavior flingBehavior2;
        boolean z5;
        Modifier modifier3;
        LazyListState lazyListState2;
        boolean z6;
        PaddingValues paddingValues3;
        Arrangement.Horizontal horizontal3;
        Alignment.Vertical vertical3;
        FlingBehavior flingBehavior3;
        Arrangement arrangement;
        Composer composer2;
        final Modifier modifier4;
        final LazyListState lazyListState3;
        final PaddingValues paddingValues4;
        final boolean z7;
        final Arrangement.Horizontal horizontal4;
        final Alignment.Vertical vertical4;
        final FlingBehavior flingBehavior4;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1724297413);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(lazyListState)) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 896) == 0) {
                paddingValues2 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValues2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    z3 = z;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i14 = composerStartRestartGroup.changed(horizontal2) ? 16384 : 8192;
                        i3 |= i14;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i3 |= i14;
                } else {
                    horizontal2 = horizontal;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(vertical2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                }
                if ((i & 3670016) != 0) {
                    if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i11 = 524288;
                    } else {
                        i11 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    }
                    i3 |= i11;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i9 = 8388608;
                    } else {
                        i9 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i9;
                }
                if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    if ((234881024 & i) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i10 = 67108864;
                        } else {
                            i10 = 33554432;
                        }
                    }
                    if ((191739611 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= -113;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState;
                            }
                            if (i13 != 0) {
                                paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                            } else {
                                paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                            }
                            z4 = i4 == 0 ? z3 : false;
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z4) {
                                    end = arrangement.getEnd();
                                } else {
                                    end = arrangement.getStart();
                                }
                                i3 &= -57345;
                            } else {
                                end = horizontal2;
                            }
                            if (i6 != 0) {
                                top = Alignment.INSTANCE.getTop();
                            } else {
                                top = vertical2;
                            }
                            if ((i2 & 64) != 0) {
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i8 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            modifier3 = modifier2;
                            lazyListState2 = lazyListStateRememberLazyListState;
                            z6 = z4;
                            paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                            horizontal3 = end;
                            vertical3 = top;
                            flingBehavior3 = flingBehavior2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            modifier3 = modifier;
                            lazyListState2 = lazyListState;
                            flingBehavior3 = flingBehavior;
                            z5 = z2;
                            paddingValues3 = paddingValues2;
                            z6 = z3;
                            horizontal3 = horizontal2;
                            vertical3 = vertical2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                        }
                        int i15 = i3 >> 3;
                        composer2 = composerStartRestartGroup;
                        LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i15) | (i15 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        lazyListState3 = lazyListState2;
                        paddingValues4 = paddingValues3;
                        z7 = z6;
                        horizontal4 = horizontal3;
                        vertical4 = vertical3;
                        flingBehavior4 = flingBehavior3;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier;
                        lazyListState3 = lazyListState;
                        flingBehavior4 = flingBehavior;
                        paddingValues4 = paddingValues2;
                        z7 = z3;
                        horizontal4 = horizontal2;
                        composer2 = composerStartRestartGroup;
                        vertical4 = vertical2;
                        z8 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i16) {
                            LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
                i10 = 100663296;
                i3 |= i10;
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i16 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i16) | (i16 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i17 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i17) | (i17 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i18) {
                        LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z3 = z;
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i14;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i14;
            } else {
                horizontal2 = horizontal;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = Configuration.BLOCK_SIZE;
                }
                i3 |= i9;
            }
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                }
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i18 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i18) | (i18 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i19 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i19) | (i19 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i110) {
                        LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = 100663296;
            i3 |= i10;
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i110 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i110) | (i110 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i111 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i111) | (i111 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i112) {
                    LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                z3 = z;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            if ((57344 & i) == 0) {
                if ((i2 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i14;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i14;
            } else {
                horizontal2 = horizontal;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                vertical2 = vertical;
            } else {
                vertical2 = vertical;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(vertical2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i9 = 8388608;
                } else {
                    i9 = Configuration.BLOCK_SIZE;
                }
                i3 |= i9;
            }
            if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                if ((234881024 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                }
                if ((191739611 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i112 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112) | (i112 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState;
                        }
                        if (i13 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        } else {
                            paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                        }
                        if (i4 == 0) {
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z4) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                        } else {
                            end = horizontal2;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        } else {
                            top = vertical2;
                        }
                        if ((i2 & 64) != 0) {
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        if (i8 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        modifier3 = modifier2;
                        lazyListState2 = lazyListStateRememberLazyListState;
                        z6 = z4;
                        paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                        horizontal3 = end;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                    }
                    int i113 = i3 >> 3;
                    composer2 = composerStartRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i113) | (i113 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState3 = lazyListState2;
                    paddingValues4 = paddingValues3;
                    z7 = z6;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z8 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i114) {
                        LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i10 = 100663296;
            i3 |= i10;
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i114 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i114) | (i114 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i115 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i115) | (i115 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i116) {
                    LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z3 = z;
        if ((57344 & i) == 0) {
            if ((i2 & 16) == 0) {
                horizontal2 = horizontal;
                if (composerStartRestartGroup.changed(horizontal2)) {
                }
                i3 |= i14;
            } else {
                horizontal2 = horizontal;
            }
            i3 |= i14;
        } else {
            horizontal2 = horizontal;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
            vertical2 = vertical;
        } else {
            vertical2 = vertical;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(vertical2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
        }
        if ((i & 3670016) != 0) {
            if ((i2 & 64) == 0) {
                i11 = 524288;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 29360128) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i9 = 8388608;
            } else {
                i9 = Configuration.BLOCK_SIZE;
            }
            i3 |= i9;
        }
        if ((i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            if ((234881024 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
            }
            if ((191739611 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i116 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i116) | (i116 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState;
                    }
                    if (i13 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    } else {
                        paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z4) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                    } else {
                        end = horizontal2;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    } else {
                        top = vertical2;
                    }
                    if ((i2 & 64) != 0) {
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if (i8 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    modifier3 = modifier2;
                    lazyListState2 = lazyListStateRememberLazyListState;
                    z6 = z4;
                    paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    horizontal3 = end;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
                }
                int i117 = i3 >> 3;
                composer2 = composerStartRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i117) | (i117 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState3 = lazyListState2;
                paddingValues4 = paddingValues3;
                z7 = z6;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z8 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i118) {
                    LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i10 = 100663296;
        i3 |= i10;
        if ((191739611 & i3) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i13 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i13 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
            }
            int i118 = i3 >> 3;
            composer2 = composerStartRestartGroup;
            LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i118) | (i118 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState3 = lazyListState2;
            paddingValues4 = paddingValues3;
            z7 = z6;
            horizontal4 = horizontal3;
            vertical4 = vertical3;
            flingBehavior4 = flingBehavior3;
            z8 = z5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i13 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState;
                }
                if (i13 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                } else {
                    paddingValuesM469PaddingValues0680j_4 = paddingValues2;
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z4) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                } else {
                    end = horizontal2;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                } else {
                    top = vertical2;
                }
                if ((i2 & 64) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if (i8 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                modifier3 = modifier2;
                lazyListState2 = lazyListStateRememberLazyListState;
                z6 = z4;
                paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                horizontal3 = end;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:289)");
            }
            int i119 = i3 >> 3;
            composer2 = composerStartRestartGroup;
            LazyListKt.LazyList(modifier3, lazyListState2, paddingValues3, z6, false, flingBehavior3, z5, 0, null, null, vertical3, horizontal3, content, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i119) | (i119 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState3 = lazyListState2;
            paddingValues4 = paddingValues3;
            z7 = z6;
            horizontal4 = horizontal3;
            vertical4 = vertical3;
            flingBehavior4 = flingBehavior3;
            z8 = z5;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i1110) {
                LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues4, z7, horizontal4, vertical4, flingBehavior4, z8, content, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> contentType, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new C06882(function1, items) : null, new AnonymousClass3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List items, Function1 function1, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            contentType = C06871.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new C06882(function1, items) : null, new AnonymousClass3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new C06902(function2, items) : null, new C06913(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C06924(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List items, Function2 function2, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1
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
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new C06902(function2, items) : null, new C06913(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C06924(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull T[] items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function1<? super T, ? extends Object> contentType, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new AnonymousClass6(function1, items) : null, new AnonymousClass7(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull T[] items, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function2<? super Integer, ? super T, ? extends Object> contentType, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new C06946(function2, items) : null, new C06957(contentType, items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C06968(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List items, Function1 function1, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new C06882(function1, items) : null, new AnonymousClass3(C06871.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List items, Function2 function2, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new C06902(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C06924(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, List<? extends T> items, Function1<? super T, ? extends Object> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new C06882(function1, items) : null, new AnonymousClass3(C06871.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new AnonymousClass4(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> items, Function2<? super Integer, ? super T, ? extends Object> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new C06902(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C06924(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] items, Function2 function2, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5
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
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new C06946(function2, items) : null, new C06957(contentType, items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C06968(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] items, Function1 function1, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            contentType = AnonymousClass5.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new AnonymousClass6(function1, items) : null, new AnonymousClass7(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, T[] items, Function2<? super Integer, ? super T, ? extends Object> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new C06946(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C06968(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, T[] items, Function1<? super T, ? extends Object> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new AnonymousClass6(function1, items) : null, new AnonymousClass7(AnonymousClass5.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(itemContent, items)));
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:117:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:122:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0182  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:144:0x0212  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @Composable
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, final Function1 content, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValuesM469PaddingValues0680j_4;
        int i4;
        boolean z2;
        int i5;
        Arrangement.Vertical vertical2;
        int i6;
        Alignment.Horizontal start;
        int i7;
        int i8;
        Modifier modifier2;
        Modifier modifier3;
        LazyListState lazyListStateRememberLazyListState;
        FlingBehavior flingBehavior2;
        LazyListState lazyListState3;
        Arrangement arrangement;
        Arrangement.Vertical bottom;
        final Modifier modifier4;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues2;
        final boolean z3;
        final Arrangement.Vertical vertical3;
        final Alignment.Horizontal horizontal2;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-563353797);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                int i11 = composerStartRestartGroup.changed(lazyListState2) ? 32 : 16;
                i3 |= i11;
            } else {
                lazyListState2 = lazyListState;
            }
            i3 |= i11;
        } else {
            lazyListState2 = lazyListState;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 896) == 0) {
                paddingValuesM469PaddingValues0680j_4 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValuesM469PaddingValues0680j_4) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        int i13 = composerStartRestartGroup.changed(vertical2) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        vertical2 = vertical;
                    }
                    i3 |= i13;
                } else {
                    vertical2 = vertical;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                    start = horizontal;
                } else {
                    start = horizontal;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(start)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                }
                if ((i & 3670016) != 0) {
                    if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i9 = 524288;
                    } else {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    }
                    i3 |= i9;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = 8388608;
                    } else {
                        i8 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i8;
                }
                if ((23967451 & i3) != 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    flingBehavior3 = flingBehavior;
                    lazyListState4 = lazyListState2;
                    paddingValues2 = paddingValuesM469PaddingValues0680j_4;
                    z3 = z2;
                    horizontal2 = start;
                    vertical3 = vertical2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        modifier3 = modifier2;
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i12 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getBottom();
                            } else {
                                bottom = arrangement.getTop();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if (i6 != 0) {
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        lazyListState3 = lazyListStateRememberLazyListState;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        modifier3 = modifier;
                        flingBehavior2 = flingBehavior;
                        lazyListState3 = lazyListState2;
                    }
                    PaddingValues paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    boolean z4 = z2;
                    Alignment.Horizontal horizontal3 = start;
                    Arrangement.Vertical vertical4 = vertical2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-563353797, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                    }
                    LazyColumn(modifier3, lazyListState3, paddingValues3, z4, vertical4, horizontal3, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState4 = lazyListState3;
                    paddingValues2 = paddingValues3;
                    z3 = z4;
                    vertical3 = vertical4;
                    horizontal2 = horizontal3;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
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

                    public final void invoke(@Nullable Composer composer2, int i14) {
                        LazyDslKt.LazyColumn(modifier4, lazyListState4, paddingValues2, z3, vertical3, horizontal2, flingBehavior3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 57344) == 0) {
                if ((i2 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i13;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i13;
            } else {
                vertical2 = vertical;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                start = horizontal;
            } else {
                start = horizontal;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(start)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 64) == 0) {
                    i9 = 524288;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i8 = 8388608;
                } else {
                    i8 = Configuration.BLOCK_SIZE;
                }
                i3 |= i8;
            }
            if ((23967451 & i3) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues4 = paddingValuesM469PaddingValues0680j_4;
                boolean z5 = z2;
                Alignment.Horizontal horizontal4 = start;
                Arrangement.Vertical vertical5 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                LazyColumn(modifier3, lazyListState3, paddingValues4, z5, vertical5, horizontal4, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues4;
                z3 = z5;
                vertical3 = vertical5;
                horizontal2 = horizontal4;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues5 = paddingValuesM469PaddingValues0680j_4;
                boolean z6 = z2;
                Alignment.Horizontal horizontal5 = start;
                Arrangement.Vertical vertical6 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                LazyColumn(modifier3, lazyListState3, paddingValues5, z6, vertical6, horizontal5, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues5;
                z3 = z6;
                vertical3 = vertical6;
                horizontal2 = horizontal5;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
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

                public final void invoke(@Nullable Composer composer2, int i14) {
                    LazyDslKt.LazyColumn(modifier4, lazyListState4, paddingValues2, z3, vertical3, horizontal2, flingBehavior3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        paddingValuesM469PaddingValues0680j_4 = paddingValues;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            if ((i & 57344) == 0) {
                if ((i2 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i13;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i13;
            } else {
                vertical2 = vertical;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                start = horizontal;
            } else {
                start = horizontal;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(start)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 64) == 0) {
                    i9 = 524288;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i8 = 8388608;
                } else {
                    i8 = Configuration.BLOCK_SIZE;
                }
                i3 |= i8;
            }
            if ((23967451 & i3) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues6 = paddingValuesM469PaddingValues0680j_4;
                boolean z7 = z2;
                Alignment.Horizontal horizontal6 = start;
                Arrangement.Vertical vertical7 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                LazyColumn(modifier3, lazyListState3, paddingValues6, z7, vertical7, horizontal6, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues6;
                z3 = z7;
                vertical3 = vertical7;
                horizontal2 = horizontal6;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if (i6 != 0) {
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues7 = paddingValuesM469PaddingValues0680j_4;
                boolean z8 = z2;
                Alignment.Horizontal horizontal7 = start;
                Arrangement.Vertical vertical8 = vertical2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-563353797, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
                }
                LazyColumn(modifier3, lazyListState3, paddingValues7, z8, vertical8, horizontal7, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues7;
                z3 = z8;
                vertical3 = vertical8;
                horizontal2 = horizontal7;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
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

                public final void invoke(@Nullable Composer composer2, int i14) {
                    LazyDslKt.LazyColumn(modifier4, lazyListState4, paddingValues2, z3, vertical3, horizontal2, flingBehavior3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                vertical2 = vertical;
                if (composerStartRestartGroup.changed(vertical2)) {
                }
                i3 |= i13;
            } else {
                vertical2 = vertical;
            }
            i3 |= i13;
        } else {
            vertical2 = vertical;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
            start = horizontal;
        } else {
            start = horizontal;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(start)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
        }
        if ((i & 3670016) != 0) {
            if ((i2 & 64) == 0) {
                i9 = 524288;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i8 = 8388608;
            } else {
                i8 = Configuration.BLOCK_SIZE;
            }
            i3 |= i8;
        }
        if ((23967451 & i3) != 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i12 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                    vertical2 = bottom;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i12 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                    vertical2 = bottom;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            }
            PaddingValues paddingValues8 = paddingValuesM469PaddingValues0680j_4;
            boolean z9 = z2;
            Alignment.Horizontal horizontal8 = start;
            Arrangement.Vertical vertical9 = vertical2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-563353797, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
            }
            LazyColumn(modifier3, lazyListState3, paddingValues8, z9, vertical9, horizontal8, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState4 = lazyListState3;
            paddingValues2 = paddingValues8;
            z3 = z9;
            vertical3 = vertical9;
            horizontal2 = horizontal8;
            flingBehavior3 = flingBehavior2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i12 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                    vertical2 = bottom;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i12 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                    vertical2 = bottom;
                }
                if (i6 != 0) {
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            }
            PaddingValues paddingValues9 = paddingValuesM469PaddingValues0680j_4;
            boolean z10 = z2;
            Alignment.Horizontal horizontal9 = start;
            Arrangement.Vertical vertical10 = vertical2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-563353797, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:373)");
            }
            LazyColumn(modifier3, lazyListState3, paddingValues9, z10, vertical10, horizontal9, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState4 = lazyListState3;
            paddingValues2 = paddingValues9;
            z3 = z10;
            vertical3 = vertical10;
            horizontal2 = horizontal9;
            flingBehavior3 = flingBehavior2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.2
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

            public final void invoke(@Nullable Composer composer2, int i14) {
                LazyDslKt.LazyColumn(modifier4, lazyListState4, paddingValues2, z3, vertical3, horizontal2, flingBehavior3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:117:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x0174  */
    /* JADX WARN: Code duplicated, block: B:122:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x017d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0182  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:144:0x0212  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    @Composable
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, final Function1 content, Composer composer, final int i, final int i2) {
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValuesM469PaddingValues0680j_4;
        int i4;
        boolean z2;
        int i5;
        Arrangement.Horizontal horizontal2;
        int i6;
        Alignment.Vertical top;
        int i7;
        int i8;
        Modifier modifier2;
        Modifier modifier3;
        LazyListState lazyListStateRememberLazyListState;
        FlingBehavior flingBehavior2;
        LazyListState lazyListState3;
        Arrangement arrangement;
        Arrangement.Horizontal end;
        final Modifier modifier4;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues2;
        final boolean z3;
        final Arrangement.Horizontal horizontal3;
        final Alignment.Vertical vertical2;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(407929823);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                int i11 = composerStartRestartGroup.changed(lazyListState2) ? 32 : 16;
                i3 |= i11;
            } else {
                lazyListState2 = lazyListState;
            }
            i3 |= i11;
        } else {
            lazyListState2 = lazyListState;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 896) == 0) {
                paddingValuesM469PaddingValues0680j_4 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValuesM469PaddingValues0680j_4) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i5;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i13 = composerStartRestartGroup.changed(horizontal2) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i3 |= i13;
                } else {
                    horizontal2 = horizontal;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                    top = vertical;
                } else {
                    top = vertical;
                    if ((i & 458752) == 0) {
                        if (composerStartRestartGroup.changed(top)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                }
                if ((i & 3670016) != 0) {
                    if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior)) {
                        i9 = 524288;
                    } else {
                        i9 = ZegoConstants.ErrorMask.RoomServerErrorMask;
                    }
                    i3 |= i9;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i8 = 8388608;
                    } else {
                        i8 = Configuration.BLOCK_SIZE;
                    }
                    i3 |= i8;
                }
                if ((23967451 & i3) != 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    flingBehavior3 = flingBehavior;
                    lazyListState4 = lazyListState2;
                    paddingValues2 = paddingValuesM469PaddingValues0680j_4;
                    z3 = z2;
                    vertical2 = top;
                    horizontal3 = horizontal2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        modifier3 = modifier2;
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i12 != 0) {
                            paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getEnd();
                            } else {
                                end = arrangement.getStart();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if (i6 != 0) {
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        lazyListState3 = lazyListStateRememberLazyListState;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        modifier3 = modifier;
                        flingBehavior2 = flingBehavior;
                        lazyListState3 = lazyListState2;
                    }
                    PaddingValues paddingValues3 = paddingValuesM469PaddingValues0680j_4;
                    boolean z4 = z2;
                    Alignment.Vertical vertical3 = top;
                    Arrangement.Horizontal horizontal4 = horizontal2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(407929823, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                    }
                    LazyRow(modifier3, lazyListState3, paddingValues3, z4, horizontal4, vertical3, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    lazyListState4 = lazyListState3;
                    paddingValues2 = paddingValues3;
                    z3 = z4;
                    horizontal3 = horizontal4;
                    vertical2 = vertical3;
                    flingBehavior3 = flingBehavior2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
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

                    public final void invoke(@Nullable Composer composer2, int i14) {
                        LazyDslKt.LazyRow(modifier4, lazyListState4, paddingValues2, z3, horizontal3, vertical2, flingBehavior3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 57344) == 0) {
                if ((i2 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i13;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i13;
            } else {
                horizontal2 = horizontal;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                top = vertical;
            } else {
                top = vertical;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(top)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 64) == 0) {
                    i9 = 524288;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i8 = 8388608;
                } else {
                    i8 = Configuration.BLOCK_SIZE;
                }
                i3 |= i8;
            }
            if ((23967451 & i3) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues4 = paddingValuesM469PaddingValues0680j_4;
                boolean z5 = z2;
                Alignment.Vertical vertical4 = top;
                Arrangement.Horizontal horizontal5 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                LazyRow(modifier3, lazyListState3, paddingValues4, z5, horizontal5, vertical4, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues4;
                z3 = z5;
                horizontal3 = horizontal5;
                vertical2 = vertical4;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues5 = paddingValuesM469PaddingValues0680j_4;
                boolean z6 = z2;
                Alignment.Vertical vertical5 = top;
                Arrangement.Horizontal horizontal6 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                LazyRow(modifier3, lazyListState3, paddingValues5, z6, horizontal6, vertical5, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues5;
                z3 = z6;
                horizontal3 = horizontal6;
                vertical2 = vertical5;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
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

                public final void invoke(@Nullable Composer composer2, int i14) {
                    LazyDslKt.LazyRow(modifier4, lazyListState4, paddingValues2, z3, horizontal3, vertical2, flingBehavior3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        paddingValuesM469PaddingValues0680j_4 = paddingValues;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i5;
            }
            if ((i & 57344) == 0) {
                if ((i2 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i13;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i13;
            } else {
                horizontal2 = horizontal;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
                top = vertical;
            } else {
                top = vertical;
                if ((i & 458752) == 0) {
                    if (composerStartRestartGroup.changed(top)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
            }
            if ((i & 3670016) != 0) {
                if ((i2 & 64) == 0) {
                    i9 = 524288;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i2 & 128) != 0) {
                i3 |= 12582912;
            } else if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i8 = 8388608;
                } else {
                    i8 = Configuration.BLOCK_SIZE;
                }
                i3 |= i8;
            }
            if ((23967451 & i3) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues6 = paddingValuesM469PaddingValues0680j_4;
                boolean z7 = z2;
                Alignment.Vertical vertical6 = top;
                Arrangement.Horizontal horizontal7 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                LazyRow(modifier3, lazyListState3, paddingValues6, z7, horizontal7, vertical6, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues6;
                z3 = z7;
                horizontal3 = horizontal7;
                vertical2 = vertical6;
                flingBehavior3 = flingBehavior2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                } else {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    modifier3 = modifier2;
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= -113;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i12 != 0) {
                        paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if (i6 != 0) {
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    lazyListState3 = lazyListStateRememberLazyListState;
                }
                PaddingValues paddingValues7 = paddingValuesM469PaddingValues0680j_4;
                boolean z8 = z2;
                Alignment.Vertical vertical7 = top;
                Arrangement.Horizontal horizontal8 = horizontal2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(407929823, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
                }
                LazyRow(modifier3, lazyListState3, paddingValues7, z8, horizontal8, vertical7, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues2 = paddingValues7;
                z3 = z8;
                horizontal3 = horizontal8;
                vertical2 = vertical7;
                flingBehavior3 = flingBehavior2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
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

                public final void invoke(@Nullable Composer composer2, int i14) {
                    LazyDslKt.LazyRow(modifier4, lazyListState4, paddingValues2, z3, horizontal3, vertical2, flingBehavior3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                horizontal2 = horizontal;
                if (composerStartRestartGroup.changed(horizontal2)) {
                }
                i3 |= i13;
            } else {
                horizontal2 = horizontal;
            }
            i3 |= i13;
        } else {
            horizontal2 = horizontal;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
            top = vertical;
        } else {
            top = vertical;
            if ((i & 458752) == 0) {
                if (composerStartRestartGroup.changed(top)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
        }
        if ((i & 3670016) != 0) {
            if ((i2 & 64) == 0) {
                i9 = 524288;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i8 = 8388608;
            } else {
                i8 = Configuration.BLOCK_SIZE;
            }
            i3 |= i8;
        }
        if ((23967451 & i3) != 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i12 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                    horizontal2 = end;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i12 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                    horizontal2 = end;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            }
            PaddingValues paddingValues8 = paddingValuesM469PaddingValues0680j_4;
            boolean z9 = z2;
            Alignment.Vertical vertical8 = top;
            Arrangement.Horizontal horizontal9 = horizontal2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407929823, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
            }
            LazyRow(modifier3, lazyListState3, paddingValues8, z9, horizontal9, vertical8, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState4 = lazyListState3;
            paddingValues2 = paddingValues8;
            z3 = z9;
            horizontal3 = horizontal9;
            vertical2 = vertical8;
            flingBehavior3 = flingBehavior2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i12 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                    horizontal2 = end;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            } else {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                modifier3 = modifier2;
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= -113;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i12 != 0) {
                    paddingValuesM469PaddingValues0680j_4 = PaddingKt.m469PaddingValues0680j_4(Dp.m3765constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                    horizontal2 = end;
                }
                if (i6 != 0) {
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                } else {
                    flingBehavior2 = flingBehavior;
                }
                lazyListState3 = lazyListStateRememberLazyListState;
            }
            PaddingValues paddingValues9 = paddingValuesM469PaddingValues0680j_4;
            boolean z10 = z2;
            Alignment.Vertical vertical9 = top;
            Arrangement.Horizontal horizontal10 = horizontal2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407929823, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:399)");
            }
            LazyRow(modifier3, lazyListState3, paddingValues9, z10, horizontal10, vertical9, flingBehavior2, true, content, composerStartRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            lazyListState4 = lazyListState3;
            paddingValues2 = paddingValues9;
            z3 = z10;
            horizontal3 = horizontal10;
            vertical2 = vertical9;
            flingBehavior3 = flingBehavior2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.2
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

            public final void invoke(@Nullable Composer composer2, int i14) {
                LazyDslKt.LazyRow(modifier4, lazyListState4, paddingValues2, z3, horizontal3, vertical2, flingBehavior3, content, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] items, Function2 function2, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new C06946(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new C06968(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] items, Function1 function1, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new AnonymousClass6(function1, items) : null, new AnonymousClass7(AnonymousClass5.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new AnonymousClass8(itemContent, items)));
    }
}
