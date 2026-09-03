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
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class RoomExploreHotHeadView extends AbsView {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public LinearLayout f27283OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ConstraintLayout f27284OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ConstraintLayout f27285OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ConstraintLayout f27286OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public TextView f27287OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public TextView f27288OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public TextView f27289OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f27290OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public LottieAnimationView f27291OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public TextView f27292OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TextView f27293OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public LottieAnimationView f27294OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public LottieAnimationView f27295OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public NetImageView f27296OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public NetImageView f27297OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public NetImageView f27298OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ArrayList f27299OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public ArrayList f27300OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ArrayList f27301OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ArrayList f27302OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public List<RoomIndexModel> f27303Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Function2<RoomIndexModel, Integer, Unit> f27304Oooo00O;

    public RoomExploreHotHeadView(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f27303Oooo000 = new ArrayList();
        this.f27304Oooo00O = null;
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final int OooO0OO() {
        return oo0o0Oo.room_explore_hot_head;
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o() {
        LinearLayout linearLayout = (LinearLayout) OooO00o(o0OO00O.ll_hot_bg);
        this.f27283OooOO0o = linearLayout;
        linearLayout.setVisibility(8);
        this.f27285OooOOO0 = (ConstraintLayout) OooO00o(o0OO00O.item_hot_bg1);
        this.f27284OooOOO = (ConstraintLayout) OooO00o(o0OO00O.item_hot_bg2);
        this.f27286OooOOOO = (ConstraintLayout) OooO00o(o0OO00O.item_hot_bg3);
        this.f27287OooOOOo = (TextView) OooO00o(o0OO00O.tv_online_num1);
        this.f27289OooOOo0 = (TextView) OooO00o(o0OO00O.tv_room_name1);
        this.f27294OooOo0O = (LottieAnimationView) OooO00o(o0OO00O.iv_honor1);
        this.f27297OooOoO0 = (NetImageView) OooO0O0(o0OO00O.room_header1);
        this.f27288OooOOo = (TextView) OooO00o(o0OO00O.tv_online_num2);
        this.f27290OooOOoo = (TextView) OooO00o(o0OO00O.tv_room_name2);
        this.f27295OooOo0o = (LottieAnimationView) OooO00o(o0OO00O.iv_honor2);
        this.f27296OooOoO = (NetImageView) OooO0O0(o0OO00O.room_header2);
        this.f27293OooOo00 = (TextView) OooO00o(o0OO00O.tv_online_num3);
        this.f27292OooOo0 = (TextView) OooO00o(o0OO00O.tv_room_name3);
        this.f27291OooOo = (LottieAnimationView) OooO00o(o0OO00O.iv_honor3);
        this.f27298OooOoOO = (NetImageView) OooO0O0(o0OO00O.room_header3);
        if (this.f27300OooOoo0 == null) {
            ArrayList arrayList = new ArrayList();
            this.f27300OooOoo0 = arrayList;
            arrayList.add(this.f27287OooOOOo);
            this.f27300OooOoo0.add(this.f27288OooOOo);
            this.f27300OooOoo0.add(this.f27293OooOo00);
        }
        if (this.f27299OooOoo == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f27299OooOoo = arrayList2;
            arrayList2.add(this.f27289OooOOo0);
            this.f27299OooOoo.add(this.f27290OooOOoo);
            this.f27299OooOoo.add(this.f27292OooOo0);
        }
        if (this.f27301OooOooO == null) {
            ArrayList arrayList3 = new ArrayList();
            this.f27301OooOooO = arrayList3;
            arrayList3.add(this.f27294OooOo0O);
            this.f27301OooOooO.add(this.f27295OooOo0o);
            this.f27301OooOooO.add(this.f27291OooOo);
        }
        if (this.f27302OooOooo == null) {
            ArrayList arrayList4 = new ArrayList();
            this.f27302OooOooo = arrayList4;
            arrayList4.add(this.f27297OooOoO0);
            this.f27302OooOooo.add(this.f27296OooOoO);
            this.f27302OooOooo.add(this.f27298OooOoOO);
        }
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o0() {
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        int i = 0;
        if (view.getId() != o0OO00O.room_header1) {
            if (view.getId() == o0OO00O.room_header2) {
                i = 1;
            } else if (view.getId() == o0OO00O.room_header3) {
                i = 2;
            }
        }
        RoomIndexModel roomIndexModel = this.f27303Oooo000.get(i);
        Function2<RoomIndexModel, Integer, Unit> function2 = this.f27304Oooo00O;
        if (function2 != null) {
            function2.invoke(roomIndexModel, Integer.valueOf(i));
        }
    }
}
