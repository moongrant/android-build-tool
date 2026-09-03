package com.app.base.adapter.roomExplore;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.app.base.framework.abs.AbsView.AbsView;
import com.app.base.model.RoomIndexModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public class RoomExploreHotHeadView extends AbsView {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ConstraintLayout f11419OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ConstraintLayout f11420OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public ConstraintLayout f11421OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public TextView f11422OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f11423OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TextView f11424Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public TextView f11425Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public TextView f11426OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public TextView f11427OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public LottieAnimationView f11428OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public LottieAnimationView f11429Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public LottieAnimationView f11430Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public NetImageView f11431OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public NetImageView f11432Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public LinearLayout f11433o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public List<TextView> f11434o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public List<LottieAnimationView> f11435o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public List<NetImageView> f11436o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public List<RoomIndexModel> f11437o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public Function2<RoomIndexModel, Integer, Unit> f11438o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public NetImageView f11439o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public List<TextView> f11440ooOO;

    public RoomExploreHotHeadView(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f11437o00o0O = new ArrayList();
        this.f11438o00ooo = null;
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final int OooO0OO() {
        return R.layout.room_explore_hot_head;
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.util.netimage.NetImageView>] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.util.netimage.NetImageView>] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.LottieAnimationView>] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.util.ArrayList, java.util.List<com.airbnb.lottie.LottieAnimationView>] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.util.ArrayList, java.util.List<android.widget.TextView>] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.util.ArrayList, java.util.List<android.widget.TextView>] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.util.ArrayList, java.util.List<android.widget.TextView>] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.util.ArrayList, java.util.List<android.widget.TextView>] */
    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o() {
        LinearLayout linearLayout = (LinearLayout) OooO00o(R.id.ll_hot_bg);
        this.f11433o000oOoO = linearLayout;
        linearLayout.setVisibility(8);
        this.f11419OoooOOO = (ConstraintLayout) OooO00o(R.id.item_hot_bg1);
        this.f11420OoooOOo = (ConstraintLayout) OooO00o(R.id.item_hot_bg2);
        this.f11421OoooOo0 = (ConstraintLayout) OooO00o(R.id.item_hot_bg3);
        this.f11422OoooOoO = (TextView) OooO00o(R.id.tv_online_num1);
        this.f11423OoooOoo = (TextView) OooO00o(R.id.tv_room_name1);
        this.f11428OooooOo = (LottieAnimationView) OooO00o(R.id.iv_honor1);
        this.f11431OoooooO = (NetImageView) OooO0O0(R.id.room_header1);
        this.f11424Ooooo00 = (TextView) OooO00o(R.id.tv_online_num2);
        this.f11425Ooooo0o = (TextView) OooO00o(R.id.tv_room_name2);
        this.f11430Oooooo0 = (LottieAnimationView) OooO00o(R.id.iv_honor2);
        this.f11432Ooooooo = (NetImageView) OooO0O0(R.id.room_header2);
        this.f11426OooooO0 = (TextView) OooO00o(R.id.tv_online_num3);
        this.f11427OooooOO = (TextView) OooO00o(R.id.tv_room_name3);
        this.f11429Oooooo = (LottieAnimationView) OooO00o(R.id.iv_honor3);
        this.f11439o0OoOo0 = (NetImageView) OooO0O0(R.id.room_header3);
        if (this.f11440ooOO == null) {
            ArrayList arrayList = new ArrayList();
            this.f11440ooOO = arrayList;
            arrayList.add(this.f11422OoooOoO);
            this.f11440ooOO.add(this.f11424Ooooo00);
            this.f11440ooOO.add(this.f11426OooooO0);
        }
        if (this.f11434o00O0O == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f11434o00O0O = arrayList2;
            arrayList2.add(this.f11423OoooOoo);
            this.f11434o00O0O.add(this.f11425Ooooo0o);
            this.f11434o00O0O.add(this.f11427OooooOO);
        }
        if (this.f11435o00Oo0 == null) {
            ArrayList arrayList3 = new ArrayList();
            this.f11435o00Oo0 = arrayList3;
            arrayList3.add(this.f11428OooooOo);
            this.f11435o00Oo0.add(this.f11430Oooooo0);
            this.f11435o00Oo0.add(this.f11429Oooooo);
        }
        if (this.f11436o00Ooo == null) {
            ArrayList arrayList4 = new ArrayList();
            this.f11436o00Ooo = arrayList4;
            arrayList4.add(this.f11431OoooooO);
            this.f11436o00Ooo.add(this.f11432Ooooooo);
            this.f11436o00Ooo.add(this.f11439o0OoOo0);
        }
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o0() {
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        int i = 0;
        if (view.getId() != R.id.room_header1) {
            if (view.getId() == R.id.room_header2) {
                i = 1;
            } else if (view.getId() == R.id.room_header3) {
                i = 2;
            }
        }
        RoomIndexModel roomIndexModel = this.f11437o00o0O.get(i);
        Function2<RoomIndexModel, Integer, Unit> function2 = this.f11438o00ooo;
        if (function2 != null) {
            function2.invoke(roomIndexModel, Integer.valueOf(i));
        }
    }
}
