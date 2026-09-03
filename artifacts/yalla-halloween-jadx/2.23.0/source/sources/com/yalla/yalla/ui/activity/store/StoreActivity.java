package com.yalla.yalla.ui.activity.store;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.booking.rtlviewpager.RtlViewPager;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O0O;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import com.yalla.yalla.ui.fragment.StoreCoinFragment;
import com.yalla.yalla.ui.fragment.StoreCrystalFragment;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p402o0Oo0OOO.o00O000o;
import p464o0Oooo.o000000O;
import p499o0o00o0O.o00O0;
import p499o0o00o0O.o00O00OO;
import p499o0o00o0O.o00O00o0;
import p499o0o00o0O.oo00o;
import p539o0o0OoOO.x1;
import p553o0oOOoo.o0oO0O0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public class StoreActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f27021OooOoO = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f27022OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RtlViewPager f27023OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f27024OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public YlTableLayout f27025OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public TransitionDrawable f27026OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TextView f27027OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public TransitionDrawable f27028OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f27029OooOo0o = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ImageView f27030OooOoO0;

    public static void OooOo0(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) StoreActivity.class);
        if (z) {
            intent.putExtra("type", z);
        }
        context.startActivity(intent);
    }

    public final void OooOo0O() {
        TextView textView = this.f27024OooOOoo;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        textView.setText(OooOOOO.OooO0Oo(String.valueOf(o000000O.OooO0Oo().getValue())));
        this.f27027OooOo00.setText(oO00OOo0.Earn_Crystals_);
        this.f27026OooOo0.startTransition(300);
        this.f27030OooOoO0.setVisibility(0);
        this.f27028OooOo0O.startTransition(300);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27022OooOOo = getIntent().getBooleanExtra("type", false);
        setContentView(oO00OO0O.activity_store);
        this.f22755OooOO0.setBackground(null);
        OooOOoo(oO00OOo0.store);
        o0000O0O.OooO0oO(this);
        o0000O0O.OooO0OO(this.f22755OooOO0);
        ImageView imageViewOooOo = this.f22755OooOO0.OooOo(oOo00OO0.icon_store_cyrstal_history, new Function0() { // from class: o0o00o0O.oOO00O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = StoreActivity.f27021OooOoO;
                StoreActivity storeActivity = this.f49416OooO0Oo;
                storeActivity.getClass();
                o00O000o.f44498OooOO0.observe(storeActivity, new o00O0O00(storeActivity));
                return null;
            }
        });
        this.f27030OooOoO0 = imageViewOooOo;
        imageViewOooOo.setVisibility(8);
        this.f27023OooOOo0 = (RtlViewPager) findViewById(oO00O0oO.vp_store);
        View viewFindViewById = findViewById(oO00O0oO.v_top_bg);
        o0000O0O.OooO0OO(viewFindViewById);
        this.f27024OooOOoo = (TextView) findViewById(oO00O0oO.tv_balance);
        this.f27027OooOo00 = (TextView) findViewById(oO00O0oO.tv_recharge);
        this.f27025OooOo = (YlTableLayout) findViewById(oO00O0oO.store_magicIndicator);
        ArrayList titleList = new ArrayList();
        titleList.add(o0000.OooO0OO(oO00OOo0.Golds));
        titleList.add(o0000.OooO0OO(oO00OOo0.crystal));
        Intrinsics.checkNotNullParameter(this, "context");
        o0oO0O0o.OooO00o oooO00o = new o0oO0O0o.OooO00o(this);
        oooO00o.f56019OooO0OO = 16.0f;
        oooO00o.f56020OooO0Oo = 16.0f;
        Intrinsics.checkNotNullParameter(titleList, "titleList");
        oooO00o.f56018OooO0O0 = titleList;
        int i = oO00O0o.white;
        oooO00o.f56022OooO0o0 = o0000.OooO00o(i);
        oooO00o.f56024OooO0oo = o0000.OooO00o(oO00O0o.color_white_70);
        oooO00o.OooO0Oo(this.f27023OooOOo0);
        oooO00o.f56016OooO = 5.0f;
        oooO00o.f56025OooOO0 = o0000.OooO00o(i);
        oooO00o.f56026OooOO0O = o0000O0.OooO00o(40);
        oooO00o.f56027OooOO0o = o0000O0.OooO00o(2);
        oooO00o.f56017OooO00o.setAdjustMode(true);
        oooO00o.OooO00o(this.f27025OooOo);
        ImageView imageView = (ImageView) findViewById(oO00O0oO.iv_currency);
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{o0000.OooO0O0(oOo00OO0.shape_store_coin_bg), o0000.OooO0O0(oOo00OO0.shape_store_crystal_bg)});
        this.f27026OooOo0 = transitionDrawable;
        viewFindViewById.setBackground(transitionDrawable);
        TransitionDrawable transitionDrawable2 = new TransitionDrawable(new Drawable[]{o0000.OooO0O0(oOo00OO0.icon_store_coin_bg_coin), o0000.OooO0O0(oOo00OO0.icon_store_crystal_bg_crystal)});
        this.f27028OooOo0O = transitionDrawable2;
        transitionDrawable2.setCrossFadeEnabled(true);
        imageView.setImageDrawable(this.f27028OooOo0O);
        x1 x1Var = new x1(getSupportFragmentManager());
        StoreCoinFragment storeCoinFragment = new StoreCoinFragment();
        StoreCrystalFragment storeCrystalFragment = new StoreCrystalFragment();
        x1Var.OooOOoo(storeCoinFragment, "coin");
        x1Var.OooOOoo(storeCrystalFragment, "crystal");
        this.f27023OooOOo0.setAdapter(x1Var);
        this.f27023OooOOo0.OooO0O0(new o00O00OO(this));
        this.f27027OooOo00.setOnClickListener(new o00O00o0(this));
        if (this.f27022OooOOo) {
            this.f27023OooOOo0.OooOo(1, true);
            this.f27029OooOo0o = 1;
            OooOo0O();
        }
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().observe(this, new oo00o(this));
        o000000O.OooO0Oo().observe(this, new o00O0(this));
    }
}
