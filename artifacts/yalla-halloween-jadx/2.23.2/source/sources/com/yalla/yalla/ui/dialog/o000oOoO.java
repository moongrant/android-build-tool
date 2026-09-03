package com.yalla.yalla.ui.dialog;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.TreasureBoxCarouselInfo;
import com.youth.banner.adapter.BannerAdapter;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p405o0Oo0OOO.x0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends BannerAdapter<TreasureBoxCarouselInfo, TreasureBoxDialog.BannerViewHolder> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxDialog f27577OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(TreasureBoxDialog treasureBoxDialog, ArrayList arrayList) {
        super(arrayList);
        this.f27577OooO00o = treasureBoxDialog;
    }

    @Override // com.youth.banner.adapter.IViewHolder
    public final void onBindView(Object obj, Object obj2, int i, int i2) {
        TreasureBoxDialog.BannerViewHolder holder = (TreasureBoxDialog.BannerViewHolder) obj;
        TreasureBoxCarouselInfo treasureBoxCarouselInfo = (TreasureBoxCarouselInfo) obj2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (treasureBoxCarouselInfo == null) {
            return;
        }
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f27577OooO00o.f27502OooOO0O);
        oooO00o.f43126OooO0OO = treasureBoxCarouselInfo.getHeadUrl();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.OooO0Oo(holder.getBinding().f45679OooO0O0);
        holder.getBinding().f45680OooO0OO.setText(treasureBoxCarouselInfo.getNickName());
        holder.getBinding().f45681OooO0Oo.setText(o0000O.OooO00o(treasureBoxCarouselInfo.getBroadcast(), ZegoConstants.ZegoVideoDataAuxPublishingStream));
    }

    @Override // com.youth.banner.adapter.IViewHolder
    public final Object onCreateHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        x0 x0VarInflate = x0.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(x0VarInflate, "inflate(...)");
        return new TreasureBoxDialog.BannerViewHolder(x0VarInflate);
    }
}
