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
import p377o0OOoOo.o0000O;
import p464o0Oooo.o000000O;
import p499o0o00o0O.o000O0;
import p499o0o00o0O.o000O00O;
import p553o0oOOoo.o0oO0O0o;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public class PurchaseSkillCardActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f26987OooOoO = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public SkillCardListModel f26988OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public TextView f26989OooOOo0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public SkillCardDataFragment f26991OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ArrayList<Fragment> f26992OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public RtlViewPager f26993OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public SkillCardDataFragment f26994OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public SkillCardDataFragment f26995OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final int[] f26990OooOOoo = {oO00OOo0.headwear, oO00OOo0.balderdash, oO00OOo0.Voice_Changer};

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f26996OooOoO0 = 0;

    public class OooO00o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(String str, String str2) {
            super.OooO0O0(str, str2);
            PurchaseSkillCardActivity purchaseSkillCardActivity = PurchaseSkillCardActivity.this;
            SkillCardDataFragment skillCardDataFragment = purchaseSkillCardActivity.f26994OooOo0O;
            if (skillCardDataFragment == null || purchaseSkillCardActivity.f26995OooOo0o == null) {
                return;
            }
            skillCardDataFragment.loadError(str, str2);
            purchaseSkillCardActivity.f26995OooOo0o.loadError(str, str2);
            purchaseSkillCardActivity.f26991OooOo.loadError(str, str2);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            SkillCardListModel skillCardListModel = (SkillCardListModel) oOo00OO0.OooO00o(str, SkillCardListModel.class);
            PurchaseSkillCardActivity purchaseSkillCardActivity = PurchaseSkillCardActivity.this;
            purchaseSkillCardActivity.f26988OooOOo = skillCardListModel;
            SkillCardDataFragment skillCardDataFragment = purchaseSkillCardActivity.f26994OooOo0O;
            if (skillCardDataFragment == null || purchaseSkillCardActivity.f26995OooOo0o == null || purchaseSkillCardActivity.f26991OooOo == null) {
                return;
            }
            skillCardDataFragment.setData(purchaseSkillCardActivity.f26988OooOOo.data1);
            purchaseSkillCardActivity.f26995OooOo0o.setData(purchaseSkillCardActivity.f26988OooOOo.data);
            purchaseSkillCardActivity.f26991OooOo.setData(purchaseSkillCardActivity.f26988OooOOo.data2);
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
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Pair pair = (Pair) o000000O.OooOO0o().getValue();
        if (((Boolean) pair.getFirst()).booleanValue()) {
            linkedHashMapOooO00o.put("viplevel", pair.getSecond() + "");
        }
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44125Ooooo00, linkedHashMapOooO00o, oooO00o);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_skillcardstore);
        OooOOoo(oO00OOo0.magic_cards);
        this.f22755OooOO0.OooOo(p584o0oOooO0.oOo00OO0.icon_aristocracy_doubt, new Function0() { // from class: o0o00o0O.o000O0o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = PurchaseSkillCardActivity.f26987OooOoO;
                PurchaseSkillCardActivity purchaseSkillCardActivity = this.f49371OooO0Oo;
                purchaseSkillCardActivity.getClass();
                purchaseSkillCardActivity.startActivity(new Intent(purchaseSkillCardActivity, (Class<?>) SkillCarDescriptionActivity.class));
                return null;
            }
        });
        this.f26989OooOOo0 = (TextView) findViewById(oO00O0oO.tv_skillcardstore_golds);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().observe(this, new o000O00O(this));
        RtlViewPager rtlViewPager = (RtlViewPager) findViewById(oO00O0oO.vp_skill_card_data);
        this.f26993OooOo00 = rtlViewPager;
        rtlViewPager.setOffscreenPageLimit(2);
        this.f26992OooOo0 = new ArrayList<>();
        this.f26994OooOo0O = SkillCardDataFragment.newInstence(1);
        this.f26995OooOo0o = SkillCardDataFragment.newInstence(2);
        this.f26991OooOo = SkillCardDataFragment.newInstence(3);
        this.f26992OooOo0.add(this.f26994OooOo0O);
        this.f26992OooOo0.add(this.f26995OooOo0o);
        this.f26992OooOo0.add(this.f26991OooOo);
        this.f26993OooOo00.setAdapter(new o000O0(this, getSupportFragmentManager()));
        YlTableLayout ylTableLayout = (YlTableLayout) findViewById(oO00O0oO.skill_card_magicIndicator);
        ArrayList titleList = new ArrayList();
        int[] iArr = this.f26990OooOOoo;
        titleList.add(o0000.OooO0OO(iArr[0]));
        titleList.add(o0000.OooO0OO(iArr[1]));
        titleList.add(o0000.OooO0OO(iArr[2]));
        Intrinsics.checkNotNullParameter(this, "context");
        o0oO0O0o.OooO00o oooO00o = new o0oO0O0o.OooO00o(this);
        oooO00o.f56019OooO0OO = 16.0f;
        oooO00o.f56020OooO0Oo = 16.0f;
        Intrinsics.checkNotNullParameter(titleList, "titleList");
        oooO00o.f56018OooO0O0 = titleList;
        oooO00o.f56022OooO0o0 = o0000.OooO00o(oO00O0o.color_ffffff);
        oooO00o.f56024OooO0oo = o0000.OooO00o(oO00O0o.color_white_70);
        oooO00o.OooO0Oo(this.f26993OooOo00);
        oooO00o.f56016OooO = 5.0f;
        oooO00o.f56025OooOO0 = o0000.OooO00o(oO00O0o.white);
        oooO00o.f56026OooOO0O = o0000O0.OooO00o(40);
        oooO00o.f56027OooOO0o = o0000O0.OooO00o(2);
        oooO00o.f56017OooO00o.setAdjustMode(true);
        oooO00o.OooO00o(ylTableLayout);
        ((TextView) findViewById(oO00O0oO.ly_recharge)).setOnClickListener(new com.yalla.yalla.ui.activity.store.OooO00o(this));
        if (getIntent() != null) {
            this.f26996OooOoO0 = getIntent().getIntExtra("page", this.f26996OooOoO0);
        }
        OooOo0O();
        this.f26993OooOo00.setCurrentItem(this.f26996OooOoO0);
    }
}
