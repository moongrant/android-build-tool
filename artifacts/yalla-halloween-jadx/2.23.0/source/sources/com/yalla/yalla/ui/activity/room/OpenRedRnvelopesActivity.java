package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.RedPaperList;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class OpenRedRnvelopesActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public TextView f26606OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public NetImageView f26607OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f26608OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public TextView f26609OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public LinearLayout f26610OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ListView f26611OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f26612OooOo0o = new ArrayList();

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_open_red_rnvelopes);
        this.f22755OooOO0.setTitle(oO00OOo0.red_lucky_money);
        this.f26607OooOOo0 = (NetImageView) findViewById(oO00O0oO.userhead);
        this.f26606OooOOo = (TextView) findViewById(oO00O0oO.txt_name);
        this.f26608OooOOoo = (TextView) findViewById(oO00O0oO.txt_amount);
        this.f26610OooOo00 = (LinearLayout) findViewById(oO00O0oO.ll_myamount);
        this.f26609OooOo0 = (TextView) findViewById(oO00O0oO.txt_num);
        this.f26611OooOo0O = (ListView) findViewById(oO00O0oO.lv_red);
        RedPaperList redPaperList = (RedPaperList) oOo00OO0.OooO00o(getIntent().getStringExtra("response"), RedPaperList.class);
        ArrayList arrayList = this.f26612OooOo0o;
        if (redPaperList != null) {
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43911OooO0OO = redPaperList.headurl;
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(this.f26607OooOOo0);
            String str = redPaperList.nickname;
            this.f26606OooOOo.setText(getString(oO00OOo0.gold_from) + ZegoConstants.ZegoVideoDataAuxPublishingStream + str);
            String str2 = redPaperList.myamount;
            if (str2 == null || "".equals(str2)) {
                this.f26610OooOo00.setVisibility(8);
                this.f26609OooOo0.setText(getString(oO00OOo0.red_opened) + ZegoConstants.ZegoVideoDataAuxPublishingStream + redPaperList.getnum);
            } else {
                this.f26610OooOo00.setVisibility(0);
                long jOooOO0o = p590o0oo0.OooOOOO.OooOO0o(redPaperList.myamount);
                int i = p601o0oo0O0.o0000O0.f56870OooO00o;
                String str3 = new DecimalFormat("#,###").format(jOooOO0o);
                Intrinsics.checkNotNullExpressionValue(str3, "df.format(coin)");
                this.f26608OooOOoo.setText(str3);
                String str4 = redPaperList.balance;
                if (str4 != null && !str4.isEmpty()) {
                    p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                    p464o0Oooo.o000000O.OooO0O0().postValue(Long.valueOf(redPaperList.balance));
                }
                this.f26609OooOo0.setText(getString(oO00OOo0.red_opened) + ZegoConstants.ZegoVideoDataAuxPublishingStream + redPaperList.getnum);
            }
            arrayList.clear();
            arrayList.addAll(redPaperList.data);
        }
        this.f26611OooOo0O.setAdapter((ListAdapter) new o00oOoo(this, arrayList, oO00OO0O.lst_red_rnvelopes));
    }
}
