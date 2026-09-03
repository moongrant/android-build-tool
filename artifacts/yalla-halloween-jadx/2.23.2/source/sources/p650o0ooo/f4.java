package p650o0ooo;

import com.yalla.yalla.model.TreasureBoxCarouselInfo;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import com.yalla.yalla.ui.dialog.o000oOoO;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class f4 extends Lambda implements Function1<List<TreasureBoxCarouselInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxDialog f58218OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(TreasureBoxDialog treasureBoxDialog) {
        super(1);
        this.f58218OooO0Oo = treasureBoxDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<TreasureBoxCarouselInfo> list) {
        List<TreasureBoxCarouselInfo> list2 = list;
        if (list2 != null) {
            TreasureBoxDialog treasureBoxDialog = this.f58218OooO0Oo;
            o000oOoO o000oooo2 = treasureBoxDialog.f27504OooOOO0;
            o000oOoO o000oooo3 = null;
            if (o000oooo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bannerAdapter");
                o000oooo2 = null;
            }
            o000oooo2.setDatas(list2);
            o000oOoO o000oooo4 = treasureBoxDialog.f27504OooOOO0;
            if (o000oooo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bannerAdapter");
            } else {
                o000oooo3 = o000oooo4;
            }
            o000oooo3.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }
}
