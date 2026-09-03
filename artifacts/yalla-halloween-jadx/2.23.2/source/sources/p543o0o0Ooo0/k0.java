package p543o0o0Ooo0;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.yalla.yalla.ui.screen.user.StoreScreenKt$GoldsPage$1$invoke$$inlined$items$default$1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nStoreScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoreScreen.kt\ncom/yalla/yalla/ui/screen/user/StoreScreenKt$GoldsPage$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,229:1\n136#2,12:230\n*S KotlinDebug\n*F\n+ 1 StoreScreen.kt\ncom/yalla/yalla/ui/screen/user/StoreScreenKt$GoldsPage$1\n*L\n217#1:230,12\n*E\n"})
public final class k0 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final k0 f55457OooO0Oo = new k0();

    public k0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List listListOf = CollectionsKt.listOf((Object[]) new String[]{"111", "2222", "333"});
        final StoreScreenKt$GoldsPage$1$invoke$$inlined$items$default$1 storeScreenKt$GoldsPage$1$invoke$$inlined$items$default$1 = StoreScreenKt$GoldsPage$1$invoke$$inlined$items$default$1.f29585OooO0Oo;
        LazyColumn.items(listListOf.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.user.StoreScreenKt$GoldsPage$1$invoke$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                return storeScreenKt$GoldsPage$1$invoke$$inlined$items$default$1.invoke(listListOf.get(num.intValue()));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.StoreScreenKt$GoldsPage$1$invoke$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                int i;
                LazyItemScope items = lazyItemScope;
                int iIntValue = num.intValue();
                Composer composer2 = composer;
                int iIntValue2 = num2.intValue();
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((iIntValue2 & 14) == 0) {
                    i = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 112) == 0) {
                    i |= composer2.changed(iIntValue) ? 32 : 16;
                }
                if ((i & 731) == 146 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                    }
                    TextKt.m1261Text4IGK_g((String) listListOf.get(iIntValue), (Modifier) null, Color.INSTANCE.m1707getBlack0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (((i & 14) >> 3) & 14) | 384, 0, 131066);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }
}
