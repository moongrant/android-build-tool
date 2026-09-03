package com.yalla.yalla.ui.activity.store;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.base.activity.BaseActivity;
import com.app.base.fragment.SkillCardDataFragment;
import com.app.base.model.SkillCardListModel;
import com.app.base.view.indicator.YlTableLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.activity.store.SkillCarDescriptionActivity;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;
import p564o0oOo00.OooOOOO;
import p564o0oOo00.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public class PurchaseSkillCardActivity extends BaseActivity {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final /* synthetic */ int f23211Oooooo = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public TextView f23212OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public SkillCardListModel f23213OoooOoO;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public RtlViewPager f23215Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ArrayList<Fragment> f23216Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public SkillCardDataFragment f23217OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public SkillCardDataFragment f23218OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public SkillCardDataFragment f23219OooooOo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int[] f23214OoooOoo = {R.string.headwear, R.string.balderdash, R.string.Voice_Changer};

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f23220Oooooo0 = 0;

    public class OooO00o extends o00OO0O0.OooO0O0 {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            PurchaseSkillCardActivity purchaseSkillCardActivity = PurchaseSkillCardActivity.this;
            SkillCardDataFragment skillCardDataFragment = purchaseSkillCardActivity.f23217OooooO0;
            if (skillCardDataFragment == null || purchaseSkillCardActivity.f23218OooooOO == null) {
                return;
            }
            skillCardDataFragment.loadError(str, str2);
            PurchaseSkillCardActivity.this.f23218OooooOO.loadError(str, str2);
            PurchaseSkillCardActivity.this.f23219OooooOo.loadError(str, str2);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
            PurchaseSkillCardActivity.this.f23213OoooOoO = (SkillCardListModel) o0Oo0oo.OooO0O0(str, SkillCardListModel.class);
            PurchaseSkillCardActivity purchaseSkillCardActivity = PurchaseSkillCardActivity.this;
            SkillCardDataFragment skillCardDataFragment = purchaseSkillCardActivity.f23217OooooO0;
            if (skillCardDataFragment == null || purchaseSkillCardActivity.f23218OooooOO == null || purchaseSkillCardActivity.f23219OooooOo == null) {
                return;
            }
            skillCardDataFragment.setData(purchaseSkillCardActivity.f23213OoooOoO.data1);
            PurchaseSkillCardActivity purchaseSkillCardActivity2 = PurchaseSkillCardActivity.this;
            purchaseSkillCardActivity2.f23218OooooOO.setData(purchaseSkillCardActivity2.f23213OoooOoO.data);
            PurchaseSkillCardActivity purchaseSkillCardActivity3 = PurchaseSkillCardActivity.this;
            purchaseSkillCardActivity3.f23219OooooOo.setData(purchaseSkillCardActivity3.f23213OoooOoO.data2);
        }
    }

    public final void OooOoO() {
        OooO00o oooO00o = new OooO00o(this);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        Pair<Boolean, Integer> value = OooOOO.f41216OooO00o.OooOOO0().getValue();
        if (value.getFirst().booleanValue()) {
            mapOooO0O0.put("viplevel", value.getSecond() + "");
        }
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32269Ooooo00, mapOooO0O0, oooO00o);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_skillcardstore);
        OooOo(R.string.magic_cards);
        this.f11463OoooO.OooOoOO(R.drawable.icon_aristocracy_doubt, new Function0() { // from class: o0oOo00.OooOO0O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PurchaseSkillCardActivity purchaseSkillCardActivity = this.f45120Oooo0o;
                int i = PurchaseSkillCardActivity.f23211Oooooo;
                Objects.requireNonNull(purchaseSkillCardActivity);
                purchaseSkillCardActivity.startActivity(new Intent(purchaseSkillCardActivity, (Class<?>) SkillCarDescriptionActivity.class));
                return null;
            }
        });
        this.f23212OoooOo0 = (TextView) findViewById(R.id.tv_skillcardstore_golds);
        OooOOO.f41216OooO00o.OooO0OO().observe(this, new OooOOOO(this));
        RtlViewPager rtlViewPager = (RtlViewPager) findViewById(R.id.vp_skill_card_data);
        this.f23215Ooooo00 = rtlViewPager;
        rtlViewPager.setOffscreenPageLimit(2);
        this.f23216Ooooo0o = new ArrayList<>();
        this.f23217OooooO0 = SkillCardDataFragment.newInstence(1);
        this.f23218OooooOO = SkillCardDataFragment.newInstence(2);
        this.f23219OooooOo = SkillCardDataFragment.newInstence(3);
        this.f23216Ooooo0o.add(this.f23217OooooO0);
        this.f23216Ooooo0o.add(this.f23218OooooOO);
        this.f23216Ooooo0o.add(this.f23219OooooOo);
        this.f23215Ooooo00.setAdapter(new OooOo00(this, getSupportFragmentManager()));
        YlTableLayout ylTableLayout = (YlTableLayout) findViewById(R.id.skill_card_magicIndicator);
        ArrayList titleList = new ArrayList();
        titleList.add(o000O0O0.OooO0OO(this.f23214OoooOoo[0]));
        titleList.add(o000O0O0.OooO0OO(this.f23214OoooOoo[1]));
        titleList.add(o000O0O0.OooO0OO(this.f23214OoooOoo[2]));
        Intrinsics.checkNotNullParameter(this, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(this);
        oooO00o.f32980OooO0Oo = 16.0f;
        oooO00o.f32982OooO0o0 = 16.0f;
        Intrinsics.checkNotNullParameter(titleList, "titleList");
        oooO00o.f32979OooO0OO = titleList;
        oooO00o.f32981OooO0o = com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_ffffff);
        oooO00o.f32983OooO0oO = com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_white_70);
        oooO00o.OooO0OO(this.f23215Ooooo00);
        oooO00o.f32984OooO0oo = 5.0f;
        oooO00o.f32976OooO = com.yalla.support.common.util.OooOOO.OooO00o(R.color.white);
        oooO00o.f32985OooOO0 = com.yalla.support.common.util.OooOo00.OooO00o(40.0f);
        oooO00o.f32986OooOO0O = com.yalla.support.common.util.OooOo00.OooO00o(2.0f);
        oooO00o.f32978OooO0O0.setAdjustMode(true);
        oooO00o.OooO00o(ylTableLayout);
        ((TextView) findViewById(R.id.ly_recharge)).setOnClickListener(new com.yalla.yalla.ui.activity.store.OooO00o(this));
        if (getIntent() != null) {
            this.f23220Oooooo0 = getIntent().getIntExtra("page", this.f23220Oooooo0);
        }
        OooOoO();
        this.f23215Ooooo00.setCurrentItem(this.f23220Oooooo0);
    }
}
