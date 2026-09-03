package p519o0o0O0oO;

import com.yalla.yalla.model.TreasureBoxCarouselInfo;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import com.yalla.yalla.ui.dialog.o0OoOo0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class h4 extends Lambda implements Function1<List<TreasureBoxCarouselInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxDialog f52340OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(TreasureBoxDialog treasureBoxDialog) {
        super(1);
        this.f52340OooO0Oo = treasureBoxDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<TreasureBoxCarouselInfo> list) {
        List<TreasureBoxCarouselInfo> list2 = list;
        if (list2 != null) {
            TreasureBoxDialog treasureBoxDialog = this.f52340OooO0Oo;
            o0OoOo0 o0oooo0 = treasureBoxDialog.f27967OooOOO0;
            o0OoOo0 o0oooo1 = null;
            if (o0oooo0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bannerAdapter");
                o0oooo0 = null;
            }
            o0oooo0.setDatas(list2);
            o0OoOo0 o0oooo2 = treasureBoxDialog.f27967OooOOO0;
            if (o0oooo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bannerAdapter");
            } else {
                o0oooo1 = o0oooo2;
            }
            o0oooo1.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }
}
