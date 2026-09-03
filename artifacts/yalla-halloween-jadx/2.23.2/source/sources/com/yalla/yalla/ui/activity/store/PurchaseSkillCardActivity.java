package com.yalla.yalla.ui.activity.store;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.booking.rtlviewpager.RtlViewPager;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.SkillCardListModel;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.activity.store.SkillCarDescriptionActivity;
import com.yalla.yalla.ui.fragment.SkillCardDataFragment;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p384o0OOoo0O.Oooo0;
import p426o0OoO0o0.OooOOOO;
import p475o0Ooooo0.o0O00oO0;
import p505o0o00oOO.o0O0O0O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p563o0oOo00O.o0O0O00;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public class PurchaseSkillCardActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f26522OooOoO = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public SkillCardListModel f26523OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public TextView f26524OooOOo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public SkillCardDataFragment f26526OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ArrayList<Fragment> f26527OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public RtlViewPager f26528OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public SkillCardDataFragment f26529OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public SkillCardDataFragment f26530OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int[] f26525OooOOoo = {o000000.headwear, o000000.balderdash, o000000.Voice_Changer};

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f26531OooOoO0 = 0;

    public class OooO00o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(String str, String str2) {
            super.OooO0O0(str, str2);
            PurchaseSkillCardActivity purchaseSkillCardActivity = PurchaseSkillCardActivity.this;
            SkillCardDataFragment skillCardDataFragment = purchaseSkillCardActivity.f26529OooOo0O;
            if (skillCardDataFragment == null || purchaseSkillCardActivity.f26530OooOo0o == null) {
                return;
            }
            skillCardDataFragment.loadError(str, str2);
            purchaseSkillCardActivity.f26530OooOo0o.loadError(str, str2);
            purchaseSkillCardActivity.f26526OooOo.loadError(str, str2);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            SkillCardListModel skillCardListModel = (SkillCardListModel) oOOO00.OooO00o(str, SkillCardListModel.class);
            PurchaseSkillCardActivity purchaseSkillCardActivity = PurchaseSkillCardActivity.this;
            purchaseSkillCardActivity.f26523OooOOo = skillCardListModel;
            SkillCardDataFragment skillCardDataFragment = purchaseSkillCardActivity.f26529OooOo0O;
            if (skillCardDataFragment == null || purchaseSkillCardActivity.f26530OooOo0o == null || purchaseSkillCardActivity.f26526OooOo == null) {
                return;
            }
            skillCardDataFragment.setData(purchaseSkillCardActivity.f26523OooOOo.data1);
            purchaseSkillCardActivity.f26530OooOo0o.setData(purchaseSkillCardActivity.f26523OooOOo.data);
            purchaseSkillCardActivity.f26526OooOo.setData(purchaseSkillCardActivity.f26523OooOOo.data2);
        }
    }

    public static void OooOo0(int i, Context context) {
        Intent intent = new Intent(context, (Class<?>) PurchaseSkillCardActivity.class);
        intent.putExtra("page", i);
        context.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOo0O() {
        OooO00o oooO00o = new OooO00o(this);
        LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
        if (((Boolean) pair.getFirst()).booleanValue()) {
            linkedHashMapOooO00o.put("viplevel", pair.getSecond() + "");
        }
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43384Ooooo00, linkedHashMapOooO00o, oooO00o);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oo0o0Oo.activity_skillcardstore);
        OooOOoo(o000000.magic_cards);
        this.f22282OooOO0.OooOo(o0Oo0oo.icon_aristocracy_doubt, new Function0() { // from class: o0o00oOO.o0O00OOO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = PurchaseSkillCardActivity.f26522OooOoO;
                PurchaseSkillCardActivity purchaseSkillCardActivity = this.f50331OooO0Oo;
                purchaseSkillCardActivity.getClass();
                purchaseSkillCardActivity.startActivity(new Intent(purchaseSkillCardActivity, (Class<?>) SkillCarDescriptionActivity.class));
                return null;
            }
        });
        this.f26524OooOOo0 = (TextView) findViewById(o0OO00O.tv_skillcardstore_golds);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().observe(this, new p505o0o00oOO.o0O00oO0(this));
        RtlViewPager rtlViewPager = (RtlViewPager) findViewById(o0OO00O.vp_skill_card_data);
        this.f26528OooOo00 = rtlViewPager;
        rtlViewPager.setOffscreenPageLimit(2);
        this.f26527OooOo0 = new ArrayList<>();
        this.f26529OooOo0O = SkillCardDataFragment.newInstence(1);
        this.f26530OooOo0o = SkillCardDataFragment.newInstence(2);
        this.f26526OooOo = SkillCardDataFragment.newInstence(3);
        this.f26527OooOo0.add(this.f26529OooOo0O);
        this.f26527OooOo0.add(this.f26530OooOo0o);
        this.f26527OooOo0.add(this.f26526OooOo);
        this.f26528OooOo00.setAdapter(new o0O0O0O(this, getSupportFragmentManager()));
        YlTableLayout ylTableLayout = (YlTableLayout) findViewById(o0OO00O.skill_card_magicIndicator);
        ArrayList titleList = new ArrayList();
        int[] iArr = this.f26525OooOOoo;
        titleList.add(o0000.OooO0OO(iArr[0]));
        titleList.add(o0000.OooO0OO(iArr[1]));
        titleList.add(o0000.OooO0OO(iArr[2]));
        Intrinsics.checkNotNullParameter(this, "context");
        o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(this);
        oooO00o.f56259OooO0OO = 16.0f;
        oooO00o.f56260OooO0Oo = 16.0f;
        Intrinsics.checkNotNullParameter(titleList, "titleList");
        oooO00o.f56258OooO0O0 = titleList;
        oooO00o.f56262OooO0o0 = o0000.OooO00o(o0OOO0o.color_ffffff);
        oooO00o.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_white_70);
        oooO00o.OooO0Oo(this.f26528OooOo00);
        oooO00o.f56256OooO = 5.0f;
        oooO00o.f56265OooOO0 = o0000.OooO00o(o0OOO0o.white);
        oooO00o.f56266OooOO0O = o0000O0.OooO00o(40);
        oooO00o.f56267OooOO0o = o0000O0.OooO00o(2);
        oooO00o.f56257OooO00o.setAdjustMode(true);
        oooO00o.OooO00o(ylTableLayout);
        ((TextView) findViewById(o0OO00O.ly_recharge)).setOnClickListener(new com.yalla.yalla.ui.activity.store.OooO00o(this));
        if (getIntent() != null) {
            this.f26531OooOoO0 = getIntent().getIntExtra("page", this.f26531OooOoO0);
        }
        OooOo0O();
        this.f26528OooOo00.setCurrentItem(this.f26531OooOoO0);
    }
}
