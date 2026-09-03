package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.RedPaperList;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.ZegoConstants;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p168o00Ooo0.o0O0O00;
import p544o0o0OoOO.m5;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0O00;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class OpenRedRnvelopesActivity extends BaseActivity {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public NetImageView f22929OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public TextView f22930OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f22931OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public LinearLayout f22932Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public TextView f22933Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public ListView f22934OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public List<RedPaperList.Data> f22935OooooOO = new ArrayList();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_open_red_rnvelopes);
        this.f11463OoooO.setTitle(R.string.red_lucky_money);
        this.f22929OoooOo0 = (NetImageView) findViewById(R.id.userhead);
        this.f22930OoooOoO = (TextView) findViewById(R.id.txt_name);
        this.f22931OoooOoo = (TextView) findViewById(R.id.txt_amount);
        this.f22932Ooooo00 = (LinearLayout) findViewById(R.id.ll_myamount);
        this.f22933Ooooo0o = (TextView) findViewById(R.id.txt_num);
        this.f22934OooooO0 = (ListView) findViewById(R.id.lv_red);
        RedPaperList redPaperList = (RedPaperList) o0Oo0oo.OooO0O0(getIntent().getStringExtra("response"), RedPaperList.class);
        if (redPaperList != null) {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this);
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.f48429OooO0OO = redPaperList.headurl;
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(this.f22929OoooOo0);
            String str = redPaperList.nickname;
            this.f22930OoooOoO.setText(getString(R.string.gold_from) + ZegoConstants.ZegoVideoDataAuxPublishingStream + str);
            String str2 = redPaperList.myamount;
            if (str2 == null || "".equals(str2)) {
                this.f22932Ooooo00.setVisibility(8);
                this.f22933Ooooo0o.setText(getString(R.string.red_opened) + ZegoConstants.ZegoVideoDataAuxPublishingStream + redPaperList.getnum);
            } else {
                this.f22932Ooooo00.setVisibility(0);
                long jOooOOO0 = o0O0O00.OooOOO0(redPaperList.myamount);
                o00O0O00 o00o0o01 = o00O0O00.f48626OooO00o;
                String str3 = new DecimalFormat("#,###").format(jOooOOO0);
                Intrinsics.checkNotNullExpressionValue(str3, "df.format(coin)");
                this.f22931OoooOoo.setText(str3);
                String str4 = redPaperList.balance;
                if (str4 != null && !str4.isEmpty()) {
                    p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0OO().postValue(Long.valueOf(redPaperList.balance));
                }
                this.f22933Ooooo0o.setText(getString(R.string.red_opened) + ZegoConstants.ZegoVideoDataAuxPublishingStream + redPaperList.getnum);
            }
            this.f22935OooooOO.clear();
            this.f22935OooooOO.addAll(redPaperList.data);
        }
        this.f22934OooooO0.setAdapter((ListAdapter) new m5(this, this.f22935OooooOO));
    }
}
