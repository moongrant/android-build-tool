package p543o0o0Ooo0;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.OooOO0;
import com.yalla.yalla.model.ShopVehicleListModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVehiclesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$ItemBubbleUseButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,361:1\n154#2:362\n154#2:363\n*S KotlinDebug\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$ItemBubbleUseButton$1\n*L\n213#1:362\n215#1:363\n*E\n"})
public final class t2 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShopVehicleListModel f55685OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(ShopVehicleListModel shopVehicleListModel) {
        super(3);
        this.f55685OooO0Oo = shopVehicleListModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        RowScope TextButton = rowScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1824524455, iIntValue, -1, "com.yalla.yalla.ui.screen.user.ItemBubbleUseButton.<anonymous> (VehiclesScreen.kt:208)");
            }
            if (this.f55685OooO0Oo.isSelected()) {
                ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_store_bubble_use, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(12)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), null, composer2, 6, 2);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
