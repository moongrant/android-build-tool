package p579o0oOoOOo;

import com.yalla.yalla.model.TreasureBoxCarouselInfo;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import com.youth.banner.adapter.BannerAdapter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends Lambda implements Function1<List<TreasureBoxCarouselInfo>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxDialog f45964Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(TreasureBoxDialog treasureBoxDialog) {
        super(1);
        this.f45964Oooo0o = treasureBoxDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<TreasureBoxCarouselInfo> list) {
        List<TreasureBoxCarouselInfo> list2 = list;
        if (list2 != null) {
            BannerAdapter<TreasureBoxCarouselInfo, TreasureBoxDialog.OooO00o> bannerAdapter = this.f45964Oooo0o.f23786OoooOOO;
            BannerAdapter<TreasureBoxCarouselInfo, TreasureBoxDialog.OooO00o> bannerAdapter2 = null;
            if (bannerAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bannerAdapter");
                bannerAdapter = null;
            }
            bannerAdapter.setDatas(list2);
            BannerAdapter<TreasureBoxCarouselInfo, TreasureBoxDialog.OooO00o> bannerAdapter3 = this.f45964Oooo0o.f23786OoooOOO;
            if (bannerAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bannerAdapter");
            } else {
                bannerAdapter2 = bannerAdapter3;
            }
            bannerAdapter2.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }
}
