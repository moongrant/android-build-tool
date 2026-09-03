package com.yalla.yalla.ui.activity.store;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.base.base.activity.BaseActivity;
import com.app.base.fragment.StoreCoinFragment;
import com.app.base.fragment.StoreCrystalFragment;
import com.app.base.view.indicator.YlTableLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p168o00Ooo0.o0O0O00;
import p175o00OooOo.o0OOooO0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000OOo0;
import p498o0o00Oo0.OooOOO;
import p564o0oOo00.o000OOo;
import p564o0oOo00.o0OO00O;
import p564o0oOo00.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public class StoreActivity extends BaseActivity {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final /* synthetic */ int f23237Oooooo = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RtlViewPager f23238OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f23239OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f23240OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TextView f23241Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public TransitionDrawable f23242Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public TransitionDrawable f23243OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f23244OooooOO = 0;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public YlTableLayout f23245OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public ImageView f23246Oooooo0;

    public static void OooOoO(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) StoreActivity.class);
        if (z) {
            intent.putExtra("type", z);
        }
        context.startActivity(intent);
    }

    public final void OooOoOO() {
        this.f23240OoooOoo.setText(o0O0O00.OooO0Oo(String.valueOf(OooOOO.f41216OooO00o.OooO0o().getValue())));
        this.f23241Ooooo00.setText(R.string.Store_Crystak_Earn_Cystals);
        this.f23242Ooooo0o.startTransition(ShopVehicleListModel.VehicleTagType_Vip300);
        this.f23246Oooooo0.setVisibility(0);
        this.f23243OooooO0.startTransition(ShopVehicleListModel.VehicleTagType_Vip300);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23239OoooOoO = getIntent().getBooleanExtra("type", false);
        setContentView(R.layout.activity_store);
        this.f11463OoooO.setBackground(null);
        OooOo(R.string.store);
        o000OOo0.OooO0o(this);
        o000OOo0.OooO0O0(this.f11463OoooO);
        ImageView imageViewOooOoOO = this.f11463OoooO.OooOoOO(R.drawable.icon_store_cyrstal_history, new Function0() { // from class: o0oOo00.o0Oo0oo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                StoreActivity storeActivity = this.f45171Oooo0o;
                int i = StoreActivity.f23237Oooooo;
                Objects.requireNonNull(storeActivity);
                SharedUrlManager.INSTANCE.getCrystalExchangeHistoryUrl().observe(storeActivity, new o000000(storeActivity));
                return null;
            }
        });
        this.f23246Oooooo0 = imageViewOooOoOO;
        imageViewOooOoOO.setVisibility(8);
        this.f23238OoooOo0 = (RtlViewPager) findViewById(R.id.vp_store);
        View viewFindViewById = findViewById(R.id.v_top_bg);
        o000OOo0.OooO0O0(viewFindViewById);
        this.f23240OoooOoo = (TextView) findViewById(R.id.tv_balance);
        this.f23241Ooooo00 = (TextView) findViewById(R.id.tv_recharge);
        this.f23245OooooOo = (YlTableLayout) findViewById(R.id.store_magicIndicator);
        ArrayList titleList = new ArrayList();
        titleList.add(o000O0O0.OooO0OO(R.string.Golds));
        titleList.add(o000O0O0.OooO0OO(R.string.crystal));
        Intrinsics.checkNotNullParameter(this, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(this);
        oooO00o.f32980OooO0Oo = 16.0f;
        oooO00o.f32982OooO0o0 = 16.0f;
        Intrinsics.checkNotNullParameter(titleList, "titleList");
        oooO00o.f32979OooO0OO = titleList;
        oooO00o.f32981OooO0o = com.yalla.support.common.util.OooOOO.OooO00o(R.color.white);
        oooO00o.f32983OooO0oO = com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_white_70);
        oooO00o.OooO0OO(this.f23238OoooOo0);
        oooO00o.f32984OooO0oo = 5.0f;
        oooO00o.f32976OooO = com.yalla.support.common.util.OooOOO.OooO00o(R.color.white);
        oooO00o.f32985OooOO0 = OooOo00.OooO00o(40.0f);
        oooO00o.f32986OooOO0O = OooOo00.OooO00o(2.0f);
        oooO00o.f32978OooO0O0.setAdjustMode(true);
        oooO00o.OooO00o(this.f23245OooooOo);
        ImageView imageView = (ImageView) findViewById(R.id.iv_currency);
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{o000O0O0.OooO0O0(R.drawable.shape_store_coin_bg), o000O0O0.OooO0O0(R.drawable.shape_store_crystal_bg)});
        this.f23242Ooooo0o = transitionDrawable;
        viewFindViewById.setBackground(transitionDrawable);
        TransitionDrawable transitionDrawable2 = new TransitionDrawable(new Drawable[]{o000O0O0.OooO0O0(R.drawable.icon_store_coin_bg_coin), o000O0O0.OooO0O0(R.drawable.icon_store_crystal_bg_crystal)});
        this.f23243OooooO0 = transitionDrawable2;
        transitionDrawable2.setCrossFadeEnabled(true);
        imageView.setImageDrawable(this.f23243OooooO0);
        o0OOooO0 o0ooooo1 = new o0OOooO0(getSupportFragmentManager());
        StoreCoinFragment storeCoinFragment = new StoreCoinFragment();
        StoreCrystalFragment storeCrystalFragment = new StoreCrystalFragment();
        o0ooooo1.OooOOoo(storeCoinFragment, "coin");
        o0ooooo1.OooOOoo(storeCrystalFragment, "crystal");
        this.f23238OoooOo0.setAdapter(o0ooooo1);
        this.f23238OoooOo0.OooO0O0(new o0OO00O(this));
        this.f23241Ooooo00.setOnClickListener(new oo0o0Oo(this));
        if (this.f23239OoooOoO) {
            this.f23238OoooOo0.OooOoO(1, true);
            this.f23244OooooOO = 1;
            OooOoOO();
        }
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        oooOOO.OooO0OO().observe(this, new p564o0oOo00.o0O0O00(this));
        oooOOO.OooO0o().observe(this, new o000OOo(this));
    }
}
