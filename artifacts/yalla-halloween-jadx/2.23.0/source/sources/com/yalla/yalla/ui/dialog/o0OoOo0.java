package com.yalla.yalla.ui.dialog;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.TreasureBoxCarouselInfo;
import com.youth.banner.adapter.BannerAdapter;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p641o0ooOOOO.i9;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOo0 extends BannerAdapter<TreasureBoxCarouselInfo, TreasureBoxDialog.BannerViewHolder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxDialog f28050OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(TreasureBoxDialog treasureBoxDialog, ArrayList arrayList) {
        super(arrayList);
        this.f28050OooO00o = treasureBoxDialog;
    }

    @Override // com.youth.banner.adapter.IViewHolder
    public final void onBindView(Object obj, Object obj2, int i, int i2) {
        TreasureBoxDialog.BannerViewHolder holder = (TreasureBoxDialog.BannerViewHolder) obj;
        TreasureBoxCarouselInfo treasureBoxCarouselInfo = (TreasureBoxCarouselInfo) obj2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (treasureBoxCarouselInfo == null) {
            return;
        }
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f28050OooO00o.f27965OooOO0O);
        oooO00o.f43911OooO0OO = treasureBoxCarouselInfo.getHeadUrl();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.OooO0Oo(holder.getBinding().f58142OooO0O0);
        holder.getBinding().f58143OooO0OO.setText(treasureBoxCarouselInfo.getNickName());
        holder.getBinding().f58144OooO0Oo.setText(o0000O.OooO00o(treasureBoxCarouselInfo.getBroadcast(), ZegoConstants.ZegoVideoDataAuxPublishingStream));
    }

    @Override // com.youth.banner.adapter.IViewHolder
    public final Object onCreateHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        i9 i9VarInflate = i9.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(i9VarInflate, "inflate(layoutInflater, parent, false)");
        return new TreasureBoxDialog.BannerViewHolder(i9VarInflate);
    }
}
