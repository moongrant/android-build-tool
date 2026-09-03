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
import p475o0Ooooo0.o0O00oO0;
import p505o0o00oOO.o0OO000o;
import p505o0o00oOO.o0OO00OO;
import p505o0o00oOO.oo0oO0;
import p505o0o00oOO.oo0ooO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p563o0oOo00O.o0O0O00;
import p583o0oOoo00.o00000OO;
import p587o0oOooOO.u0;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class StoreActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f26556OooOoO = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f26557OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RtlViewPager f26558OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f26559OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public YlTableLayout f26560OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public TransitionDrawable f26561OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TextView f26562OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public TransitionDrawable f26563OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f26564OooOo0o = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ImageView f26565OooOoO0;

    public static void OooOo0(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) StoreActivity.class);
        if (z) {
            intent.putExtra("type", z);
        }
        context.startActivity(intent);
    }

    public final void OooOo0O() {
        TextView textView = this.f26559OooOOoo;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        textView.setText(o0O0O0Oo.OooO0Oo(String.valueOf(o0O00oO0.OooO0Oo().getValue())));
        this.f26562OooOo00.setText(o000000.Earn_Crystals_);
        this.f26561OooOo0.startTransition(300);
        this.f26565OooOoO0.setVisibility(0);
        this.f26563OooOo0O.startTransition(300);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26557OooOOo = getIntent().getBooleanExtra("type", false);
        setContentView(oo0o0Oo.activity_store);
        this.f22282OooOO0.setBackground(null);
        OooOOoo(o000000.store);
        o0000O0O.OooO0oO(this);
        o0000O0O.OooO0OO(this.f22282OooOO0);
        ImageView imageViewOooOo = this.f22282OooOO0.OooOo(o0Oo0oo.icon_store_cyrstal_history, new Function0() { // from class: o0o00oOO.o0OO000
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = StoreActivity.f26556OooOoO;
                StoreActivity storeActivity = this.f50349OooO0Oo;
                storeActivity.getClass();
                o00000OO.f56667OooOO0.observe(storeActivity, new o0OO00o0(storeActivity));
                return null;
            }
        });
        this.f26565OooOoO0 = imageViewOooOo;
        imageViewOooOo.setVisibility(8);
        this.f26558OooOOo0 = (RtlViewPager) findViewById(o0OO00O.vp_store);
        View viewFindViewById = findViewById(o0OO00O.v_top_bg);
        o0000O0O.OooO0OO(viewFindViewById);
        this.f26559OooOOoo = (TextView) findViewById(o0OO00O.tv_balance);
        this.f26562OooOo00 = (TextView) findViewById(o0OO00O.tv_recharge);
        this.f26560OooOo = (YlTableLayout) findViewById(o0OO00O.store_magicIndicator);
        ArrayList titleList = new ArrayList();
        titleList.add(o0000.OooO0OO(o000000.Golds));
        titleList.add(o0000.OooO0OO(o000000.crystal));
        Intrinsics.checkNotNullParameter(this, "context");
        o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(this);
        oooO00o.f56259OooO0OO = 16.0f;
        oooO00o.f56260OooO0Oo = 16.0f;
        Intrinsics.checkNotNullParameter(titleList, "titleList");
        oooO00o.f56258OooO0O0 = titleList;
        int i = o0OOO0o.white;
        oooO00o.f56262OooO0o0 = o0000.OooO00o(i);
        oooO00o.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_white_70);
        oooO00o.OooO0Oo(this.f26558OooOOo0);
        oooO00o.f56256OooO = 5.0f;
        oooO00o.f56265OooOO0 = o0000.OooO00o(i);
        oooO00o.f56266OooOO0O = o0000O0.OooO00o(40);
        oooO00o.f56267OooOO0o = o0000O0.OooO00o(2);
        oooO00o.f56257OooO00o.setAdjustMode(true);
        oooO00o.OooO00o(this.f26560OooOo);
        ImageView imageView = (ImageView) findViewById(o0OO00O.iv_currency);
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{o0000.OooO0O0(o0Oo0oo.shape_store_coin_bg), o0000.OooO0O0(o0Oo0oo.shape_store_crystal_bg)});
        this.f26561OooOo0 = transitionDrawable;
        viewFindViewById.setBackground(transitionDrawable);
        TransitionDrawable transitionDrawable2 = new TransitionDrawable(new Drawable[]{o0000.OooO0O0(o0Oo0oo.icon_store_coin_bg_coin), o0000.OooO0O0(o0Oo0oo.icon_store_crystal_bg_crystal)});
        this.f26563OooOo0O = transitionDrawable2;
        transitionDrawable2.setCrossFadeEnabled(true);
        imageView.setImageDrawable(this.f26563OooOo0O);
        u0 u0Var = new u0(getSupportFragmentManager());
        StoreCoinFragment storeCoinFragment = new StoreCoinFragment();
        StoreCrystalFragment storeCrystalFragment = new StoreCrystalFragment();
        u0Var.OooOOoo(storeCoinFragment, "coin");
        u0Var.OooOOoo(storeCrystalFragment, "crystal");
        this.f26558OooOOo0.setAdapter(u0Var);
        this.f26558OooOOo0.OooO0O0(new o0OO000o(this));
        this.f26562OooOo00.setOnClickListener(new oo0oO0(this));
        if (this.f26557OooOOo) {
            this.f26558OooOOo0.OooOo(1, true);
            this.f26564OooOo0o = 1;
            OooOo0O();
        }
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().observe(this, new oo0ooO(this));
        o0O00oO0.OooO0Oo().observe(this, new o0OO00OO(this));
    }
}
