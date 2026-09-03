package com.yalla.yalla.ui.adapter.roomExplore;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import com.yalla.yalla.model.room.RoomIndexModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public class RoomExploreHotHeadView extends AbsView {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public LinearLayout f27745OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ConstraintLayout f27746OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ConstraintLayout f27747OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ConstraintLayout f27748OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public TextView f27749OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public TextView f27750OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public TextView f27751OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f27752OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public LottieAnimationView f27753OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public TextView f27754OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TextView f27755OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public LottieAnimationView f27756OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public LottieAnimationView f27757OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public NetImageView f27758OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public NetImageView f27759OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public NetImageView f27760OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ArrayList f27761OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ArrayList f27762OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ArrayList f27763OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ArrayList f27764OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public List<RoomIndexModel> f27765Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Function2<RoomIndexModel, Integer, Unit> f27766Oooo00O;

    public RoomExploreHotHeadView(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f27765Oooo000 = new ArrayList();
        this.f27766Oooo00O = null;
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final int OooO0OO() {
        return oO00OO0O.room_explore_hot_head;
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o() {
        LinearLayout linearLayout = (LinearLayout) OooO00o(oO00O0oO.ll_hot_bg);
        this.f27745OooOO0o = linearLayout;
        linearLayout.setVisibility(8);
        this.f27747OooOOO0 = (ConstraintLayout) OooO00o(oO00O0oO.item_hot_bg1);
        this.f27746OooOOO = (ConstraintLayout) OooO00o(oO00O0oO.item_hot_bg2);
        this.f27748OooOOOO = (ConstraintLayout) OooO00o(oO00O0oO.item_hot_bg3);
        this.f27749OooOOOo = (TextView) OooO00o(oO00O0oO.tv_online_num1);
        this.f27751OooOOo0 = (TextView) OooO00o(oO00O0oO.tv_room_name1);
        this.f27756OooOo0O = (LottieAnimationView) OooO00o(oO00O0oO.iv_honor1);
        this.f27759OooOoO0 = (NetImageView) OooO0O0(oO00O0oO.room_header1);
        this.f27750OooOOo = (TextView) OooO00o(oO00O0oO.tv_online_num2);
        this.f27752OooOOoo = (TextView) OooO00o(oO00O0oO.tv_room_name2);
        this.f27757OooOo0o = (LottieAnimationView) OooO00o(oO00O0oO.iv_honor2);
        this.f27758OooOoO = (NetImageView) OooO0O0(oO00O0oO.room_header2);
        this.f27755OooOo00 = (TextView) OooO00o(oO00O0oO.tv_online_num3);
        this.f27754OooOo0 = (TextView) OooO00o(oO00O0oO.tv_room_name3);
        this.f27753OooOo = (LottieAnimationView) OooO00o(oO00O0oO.iv_honor3);
        this.f27760OooOoOO = (NetImageView) OooO0O0(oO00O0oO.room_header3);
        if (this.f27762OooOoo0 == null) {
            ArrayList arrayList = new ArrayList();
            this.f27762OooOoo0 = arrayList;
            arrayList.add(this.f27749OooOOOo);
            this.f27762OooOoo0.add(this.f27750OooOOo);
            this.f27762OooOoo0.add(this.f27755OooOo00);
        }
        if (this.f27761OooOoo == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f27761OooOoo = arrayList2;
            arrayList2.add(this.f27751OooOOo0);
            this.f27761OooOoo.add(this.f27752OooOOoo);
            this.f27761OooOoo.add(this.f27754OooOo0);
        }
        if (this.f27763OooOooO == null) {
            ArrayList arrayList3 = new ArrayList();
            this.f27763OooOooO = arrayList3;
            arrayList3.add(this.f27756OooOo0O);
            this.f27763OooOooO.add(this.f27757OooOo0o);
            this.f27763OooOooO.add(this.f27753OooOo);
        }
        if (this.f27764OooOooo == null) {
            ArrayList arrayList4 = new ArrayList();
            this.f27764OooOooo = arrayList4;
            arrayList4.add(this.f27759OooOoO0);
            this.f27764OooOooo.add(this.f27758OooOoO);
            this.f27764OooOooo.add(this.f27760OooOoOO);
        }
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o0() {
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        int i = 0;
        if (view.getId() != oO00O0oO.room_header1) {
            if (view.getId() == oO00O0oO.room_header2) {
                i = 1;
            } else if (view.getId() == oO00O0oO.room_header3) {
                i = 2;
            }
        }
        RoomIndexModel roomIndexModel = this.f27765Oooo000.get(i);
        Function2<RoomIndexModel, Integer, Unit> function2 = this.f27766Oooo00O;
        if (function2 != null) {
            function2.invoke(roomIndexModel, Integer.valueOf(i));
        }
    }
}
