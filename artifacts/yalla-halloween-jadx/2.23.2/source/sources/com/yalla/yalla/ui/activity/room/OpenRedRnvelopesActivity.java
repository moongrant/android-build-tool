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
import p590o0oOooo0.oOOO00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class OpenRedRnvelopesActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public TextView f26152OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public NetImageView f26153OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f26154OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public TextView f26155OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public LinearLayout f26156OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ListView f26157OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList f26158OooOo0o = new ArrayList();

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_open_red_rnvelopes);
        this.f22282OooOO0.setTitle(p562o0oOo000.o000000.red_lucky_money);
        this.f26153OooOOo0 = (NetImageView) findViewById(p562o0oOo000.o0OO00O.userhead);
        this.f26152OooOOo = (TextView) findViewById(p562o0oOo000.o0OO00O.txt_name);
        this.f26154OooOOoo = (TextView) findViewById(p562o0oOo000.o0OO00O.txt_amount);
        this.f26156OooOo00 = (LinearLayout) findViewById(p562o0oOo000.o0OO00O.ll_myamount);
        this.f26155OooOo0 = (TextView) findViewById(p562o0oOo000.o0OO00O.txt_num);
        this.f26157OooOo0O = (ListView) findViewById(p562o0oOo000.o0OO00O.lv_red);
        RedPaperList redPaperList = (RedPaperList) oOOO00.OooO00o(getIntent().getStringExtra("response"), RedPaperList.class);
        ArrayList arrayList = this.f26158OooOo0o;
        if (redPaperList != null) {
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = redPaperList.headurl;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(this.f26153OooOOo0);
            String str = redPaperList.nickname;
            this.f26152OooOOo.setText(getString(p562o0oOo000.o000000.gold_from) + ZegoConstants.ZegoVideoDataAuxPublishingStream + str);
            String str2 = redPaperList.myamount;
            if (str2 == null || "".equals(str2)) {
                this.f26156OooOo00.setVisibility(8);
                this.f26155OooOo0.setText(getString(p562o0oOo000.o000000.red_opened) + ZegoConstants.ZegoVideoDataAuxPublishingStream + redPaperList.getnum);
            } else {
                this.f26156OooOo00.setVisibility(0);
                long jOooOO0o = p605o0oo0O0O.o0O0O0Oo.OooOO0o(redPaperList.myamount);
                int i = p606o0oo0O0o.o0O0OO0.f57399OooO00o;
                String str3 = new DecimalFormat("#,###").format(jOooOO0o);
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                this.f26154OooOOoo.setText(str3);
                String str4 = redPaperList.balance;
                if (str4 != null && !str4.isEmpty()) {
                    p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                    p475o0Ooooo0.o0O00oO0.OooO0O0().postValue(Long.valueOf(redPaperList.balance));
                }
                this.f26155OooOo0.setText(getString(p562o0oOo000.o000000.red_opened) + ZegoConstants.ZegoVideoDataAuxPublishingStream + redPaperList.getnum);
            }
            arrayList.clear();
            arrayList.addAll(redPaperList.data);
        }
        this.f26157OooOo0O.setAdapter((ListAdapter) new o00O0000(this, arrayList, p562o0oOo000.oo0o0Oo.lst_red_rnvelopes));
    }
}
