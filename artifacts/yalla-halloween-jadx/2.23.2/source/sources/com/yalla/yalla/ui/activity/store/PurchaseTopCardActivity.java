package com.yalla.yalla.ui.activity.store;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.StoreTopCardModel;
import com.yalla.yalla.model.ViewTimeModel;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import com.yalla.yalla.ui.activity.store.TopCardPresentationActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import o0OO0O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p426o0OoO0o0.OooOOOO;
import p475o0Ooooo0.o0O00oO0;
import p505o0o00oOO.o0O0OO0;
import p505o0o00oOO.o0O0o000;
import p505o0o00oOO.o0oOo0O0;
import p505o0o00oOO.oo0OOoo;
import p545o0oO0O00.OooOOO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p590o0oOooo0.oOOO00;
import p605o0oo0O0O.o0O0O0Oo;
import p650o0ooo.a;
import p650o0ooo.o00O0OO0;

/* JADX INFO: loaded from: classes4.dex */
public class PurchaseTopCardActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f26533OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RecyclerView f26534OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public TextView f26535OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f26536OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final HashMap f26537OooOo = new HashMap();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public oo0OOoo f26538OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public XRefreshLayout f26539OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public StoreTopCardModel f26540OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TextView f26541OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public CountDownTimer f26542OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public a f26543OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o00Ooo f26544OooOoOO;

    public class OooO00o implements com.opensource.svgaplayer.OooO0OO.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull o00Ooo o00ooo2) {
            PurchaseTopCardActivity purchaseTopCardActivity = PurchaseTopCardActivity.this;
            purchaseTopCardActivity.f26544OooOoOO = o00ooo2;
            purchaseTopCardActivity.OooOo0();
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void onError() {
        }
    }

    public class OooO0O0 extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

        public class OooO00o extends CountDownTimer {
            public OooO00o() {
                super(21600000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                PurchaseTopCardActivity purchaseTopCardActivity = PurchaseTopCardActivity.this;
                HashMap map = purchaseTopCardActivity.f26537OooOo;
                for (Integer num : map.keySet()) {
                    ViewTimeModel viewTimeModel = (ViewTimeModel) map.get(num);
                    long j2 = viewTimeModel.time;
                    if (j2 == 0) {
                        map.remove(viewTimeModel);
                        if (purchaseTopCardActivity.f26543OooOoO0 == null) {
                            o00O0OO0.OooO00o().getClass();
                            a aVar = new a();
                            purchaseTopCardActivity.f26543OooOoO0 = aVar;
                            aVar.OooO0OO(purchaseTopCardActivity, o0000.OooO0OO(o000000.loading));
                            purchaseTopCardActivity.OooOo0();
                            return;
                        }
                        return;
                    }
                    long j3 = j2 - 1;
                    viewTimeModel.time = j3;
                    String strOooOo0o = PurchaseTopCardActivity.OooOo0o(j3);
                    if (num.intValue() == 100) {
                        viewTimeModel.tvTime.setText(o0O0O0Oo.OooO00o(o0000.OooO00o(o0OOO0o.color_FD988C), o0000O.OooO00o(o0000.OooO0OO(o000000.Store_Top_Card_at_top), strOooOo0o), strOooOo0o));
                    } else {
                        viewTimeModel.tvTime.setText(strOooOo0o);
                    }
                }
            }
        }

        public OooO0O0(Context context) {
            super(context);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(String str, String str2) {
            super.OooO0O0(str, str2);
            PurchaseTopCardActivity purchaseTopCardActivity = PurchaseTopCardActivity.this;
            purchaseTopCardActivity.f26538OooOo0.OooOoo();
            purchaseTopCardActivity.f26539OooOo00.OooOoo(true);
            a aVar = purchaseTopCardActivity.f26543OooOoO0;
            if (aVar != null) {
                aVar.OooO00o();
            }
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            PurchaseTopCardActivity purchaseTopCardActivity = PurchaseTopCardActivity.this;
            a aVar = purchaseTopCardActivity.f26543OooOoO0;
            if (aVar != null) {
                aVar.OooO00o();
                purchaseTopCardActivity.f26543OooOoO0 = null;
            }
            StoreTopCardModel storeTopCardModel = (StoreTopCardModel) oOOO00.OooO00o(str, StoreTopCardModel.class);
            purchaseTopCardActivity.f26540OooOo0O = storeTopCardModel;
            if (storeTopCardModel == null || OooOo00.OooO00o(storeTopCardModel.data)) {
                purchaseTopCardActivity.f26538OooOo0.Oooo00o();
                purchaseTopCardActivity.f26539OooOo00.OooOooo(true, true, true);
                return;
            }
            HashMap map = purchaseTopCardActivity.f26537OooOo;
            map.clear();
            purchaseTopCardActivity.f26538OooOo0.OooOOoo();
            StoreTopCardModel storeTopCardModel2 = purchaseTopCardActivity.f26540OooOo0O;
            if (storeTopCardModel2.isRoom) {
                long j = storeTopCardModel2.isTop;
                if (j > 0) {
                    View viewInflate = View.inflate(purchaseTopCardActivity, oo0o0Oo.header_topcard_countdown, null);
                    purchaseTopCardActivity.f26541OooOo0o = (TextView) viewInflate.findViewById(o0OO00O.tv_countdown);
                    map.put(100, new ViewTimeModel(purchaseTopCardActivity.f26541OooOo0o, j));
                    String strOooOo0o = PurchaseTopCardActivity.OooOo0o(j);
                    purchaseTopCardActivity.f26541OooOo0o.setText(o0O0O0Oo.OooO00o(o0000.OooO00o(o0OOO0o.color_FD988C), o0000O.OooO00o(o0000.OooO0OO(o000000.Store_Top_Card_at_top), strOooOo0o), strOooOo0o));
                    purchaseTopCardActivity.f26538OooOo0.OooOo(viewInflate);
                }
            } else {
                View viewInflate2 = View.inflate(purchaseTopCardActivity, oo0o0Oo.header_topcard_creat, null);
                viewInflate2.findViewById(o0OO00O.tv_creat).setOnClickListener(new o0oOo0O0(purchaseTopCardActivity));
                purchaseTopCardActivity.f26538OooOo0.OooOo(viewInflate2);
            }
            purchaseTopCardActivity.f26538OooOo0.OooOoO0(purchaseTopCardActivity.f26540OooOo0O.data);
            purchaseTopCardActivity.f26539OooOo00.OooOooo(true, true, true);
            CountDownTimer countDownTimer = purchaseTopCardActivity.f26542OooOoO;
            if (countDownTimer == null) {
                purchaseTopCardActivity.f26542OooOoO = new OooO00o();
            } else {
                countDownTimer.cancel();
            }
            purchaseTopCardActivity.f26542OooOoO.start();
        }
    }

    public static String OooOo0o(long j) {
        StringBuffer stringBuffer = new StringBuffer();
        long j2 = j / 3600;
        if (j2 < 10) {
            stringBuffer.append(AppEventsConstants.EVENT_PARAM_VALUE_NO + j2);
        } else {
            stringBuffer.append(j2);
        }
        long j3 = j % 3600;
        long j4 = j3 / 60;
        if (j4 < 10) {
            stringBuffer.append(":0" + j4);
        } else {
            stringBuffer.append(CertificateUtil.DELIMITER + j4);
        }
        long j5 = j3 % 60;
        if (j5 < 10) {
            stringBuffer.append(":0" + j5);
        } else {
            stringBuffer.append(CertificateUtil.DELIMITER + j5);
        }
        return stringBuffer.toString();
    }

    public final void OooOo0() {
        o00oO0o o00oo0o2 = p384o0OOoo0O.o0OO00O.f43462OooO00o;
        OooO0O0 oooO0O0 = new OooO0O0(this);
        o00oo0o2.getClass();
        boolean z = App.f22233OooO0o0;
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43395o000000, OooOOOO.OooO00o(), oooO0O0);
    }

    public final void OooOo0O() {
        TextView textView = this.f26535OooOOo0;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        textView.setText(o0O0O0Oo.OooO0Oo(String.valueOf(o0O00oO0.OooO0O0().getValue())));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oo0o0Oo.activity_store_top_card);
        this.f22282OooOO0.setTitle(o000000.pin_on_top);
        this.f22282OooOO0.OooOo(o0Oo0oo.icon_aristocracy_doubt, new Function0() { // from class: o0o00oOO.o0O0oo0o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = PurchaseTopCardActivity.f26533OooOoo0;
                PurchaseTopCardActivity purchaseTopCardActivity = this.f50347OooO0Oo;
                purchaseTopCardActivity.getClass();
                purchaseTopCardActivity.startActivity(new Intent(purchaseTopCardActivity, (Class<?>) TopCardPresentationActivity.class));
                return null;
            }
        });
        this.f26535OooOOo0 = (TextView) findViewById(o0OO00O.tv_coins);
        this.f26534OooOOo = (RecyclerView) findViewById(o0OO00O.rv_top);
        this.f26536OooOOoo = (TextView) findViewById(o0OO00O.ly_recharge);
        this.f26539OooOo00 = (XRefreshLayout) findViewById(o0OO00O.xrl_topcard);
        this.f26536OooOOoo.setOnClickListener(new com.yalla.yalla.ui.activity.store.OooO0O0(this));
        this.f26539OooOo00.setOnRefreshListener(new o0O0OO0(this));
        oo0OOoo oo0oooo = new oo0OOoo(this, this, oo0o0Oo.item_store_top);
        this.f26538OooOo0 = oo0oooo;
        oo0oooo.Oooo0OO(new o0O0o000(this));
        this.f26534OooOOo.setLayoutManager(new FixLinearLayoutManager(this));
        this.f26534OooOOo.setAdapter(this.f26538OooOo0);
        OooOo0O();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f26542OooOoO;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p545o0oO0O00.OooOOOO
    public final void onEventMainThread(OooOOO oooOOO) {
        super.onEventMainThread(oooOOO);
        int i = oooOOO.f55758OooO00o;
        if (i == 31 || i == 527) {
            OooOo0();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.f26544OooOoOO == null) {
            new com.opensource.svgaplayer.OooO0OO(this).OooO00o("svga/anim_store_topcard_hammer.svga", new OooO00o());
        } else {
            OooOo0();
        }
    }
}
