package p579o0oOoOOo;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.model.TreasureBoxCarouselInfo;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import com.youth.banner.adapter.BannerAdapter;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o00OOO.OooO00o;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.tg;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends BannerAdapter<TreasureBoxCarouselInfo, TreasureBoxDialog.OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxDialog f45954OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(TreasureBoxDialog treasureBoxDialog, List<TreasureBoxCarouselInfo> list) {
        super(list);
        this.f45954OooO00o = treasureBoxDialog;
    }

    @Override // com.youth.banner.adapter.IViewHolder
    public final void onBindView(Object obj, Object obj2, int i, int i2) {
        TreasureBoxDialog.OooO00o holder = (TreasureBoxDialog.OooO00o) obj;
        TreasureBoxCarouselInfo treasureBoxCarouselInfo = (TreasureBoxCarouselInfo) obj2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (treasureBoxCarouselInfo == null) {
            return;
        }
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f45954OooO00o.f23784OoooO);
        oooO00o.f48429OooO0OO = treasureBoxCarouselInfo.getHeadUrl();
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO00o(OooO00o.OooO0o0());
        oooO00o.OooO0o(holder.f23788OooO00o.f50666OooO0O0);
        holder.f23788OooO00o.f50667OooO0OO.setText(treasureBoxCarouselInfo.getNickName());
        holder.f23788OooO00o.f50668OooO0Oo.setText(OooOo.OooO00o(treasureBoxCarouselInfo.getBroadcast(), ZegoConstants.ZegoVideoDataAuxPublishingStream));
    }

    @Override // com.youth.banner.adapter.IViewHolder
    public final Object onCreateHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        tg tgVarInflate = tg.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(tgVarInflate, "inflate(layoutInflater, parent, false)");
        return new TreasureBoxDialog.OooO00o(tgVarInflate);
    }
}
