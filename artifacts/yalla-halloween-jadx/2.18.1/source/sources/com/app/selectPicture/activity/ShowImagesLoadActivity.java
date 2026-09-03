package com.app.selectPicture.activity;

import OooO00o.OooO00o;
import android.os.Bundle;
import com.booking.rtlviewpager.RtlViewPager;
import java.util.ArrayList;
import p192o00o0O0.o00000O;
import p192o00o0O0.o00000O0;
import p192o00o0O0.o00000OO;
import p197o00o0OOO.o000O0O0;
import p201o00o0OoO.o00;
import p400o0Oo0O.OooOOO;
import p400o0Oo0O.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public class ShowImagesLoadActivity extends BaseFixOrientationActivity {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f12276OoooO0O = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public o00 f12277Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ArrayList<String> f12278Oooo0oO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public RtlViewPager f12280OoooO0;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f12279Oooo0oo = false;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f12281OoooO00 = 0;

    @Override // com.app.selectPicture.activity.BaseFixOrientationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOOO.activity_show_images_load);
        o00 o00Var = new o00(this);
        this.f12277Oooo = o00Var;
        o00Var.f33230OoooOoO = new o00000O0(this);
        o00Var.f33225OoooO0O.setVisibility(8);
        RtlViewPager rtlViewPager = (RtlViewPager) findViewById(OooOOO0.activity_show_images_load_viewpager);
        this.f12280OoooO0 = rtlViewPager;
        rtlViewPager.OooO0O0(new o00000OO(this));
        this.f12281OoooO00 = getIntent().getIntExtra("File_Index", 0);
        this.f12278Oooo0oO = getIntent().getStringArrayListExtra("data");
        this.f12279Oooo0oo = getIntent().getBooleanExtra("IsImageViewFinishActivity", false);
        ArrayList<String> arrayList = this.f12278Oooo0oO;
        if (arrayList == null) {
            finish();
            return;
        }
        o000O0O0 o000o0o1 = new o000O0O0(this, arrayList);
        o000o0o1.f33207OooO0oO = new o00000O(this);
        this.f12280OoooO0.setAdapter(o000o0o1);
        this.f12280OoooO0.setCurrentItem(this.f12281OoooO00);
        o00 o00Var2 = this.f12277Oooo;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
        sbOooO0o0.append(this.f12281OoooO00 + 1);
        sbOooO0o0.append("/");
        sbOooO0o0.append(this.f12278Oooo0oO.size());
        o00Var2.OooO0o0(sbOooO0o0.toString());
    }
}
