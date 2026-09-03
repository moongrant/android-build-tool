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
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p418o0OoO000.OooOo;
import p464o0Oooo.o000000O;
import p499o0o00o0O.o000OO00;
import p499o0o00o0O.o00O0000;
import p499o0o00o0O.o00O000o;
import p499o0o00o0O.o0O0ooO;
import p519o0o0O0oO.O0000000;
import p519o0o0O0oO.o0O00O0o;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p590o0oo0.OooOOOO;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public class PurchaseTopCardActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f26998OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RecyclerView f26999OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public TextView f27000OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f27001OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final HashMap f27002OooOo = new HashMap();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o00O0000 f27003OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public XRefreshLayout f27004OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public StoreTopCardModel f27005OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TextView f27006OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public CountDownTimer f27007OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public O0000000 f27008OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public oo000o f27009OooOoOO;

    public class OooO00o implements com.opensource.svgaplayer.OooO0OO.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull oo000o oo000oVar) {
            PurchaseTopCardActivity purchaseTopCardActivity = PurchaseTopCardActivity.this;
            purchaseTopCardActivity.f27009OooOoOO = oo000oVar;
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
                HashMap map = purchaseTopCardActivity.f27002OooOo;
                for (Integer num : map.keySet()) {
                    ViewTimeModel viewTimeModel = (ViewTimeModel) map.get(num);
                    long j2 = viewTimeModel.time;
                    if (j2 == 0) {
                        map.remove(viewTimeModel);
                        if (purchaseTopCardActivity.f27008OooOoO0 == null) {
                            o0O00O0o.OooO00o().getClass();
                            O0000000 o0000000 = new O0000000();
                            purchaseTopCardActivity.f27008OooOoO0 = o0000000;
                            o0000000.OooO0OO(purchaseTopCardActivity, o0000.OooO0OO(oO00OOo0.loading));
                            purchaseTopCardActivity.OooOo0();
                            return;
                        }
                        return;
                    }
                    long j3 = j2 - 1;
                    viewTimeModel.time = j3;
                    String strOooOo0o = PurchaseTopCardActivity.OooOo0o(j3);
                    if (num.intValue() == 100) {
                        viewTimeModel.tvTime.setText(OooOOOO.OooO00o(o0000.OooO00o(oO00O0o.color_FD988C), o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Store_Top_Card_at_top), strOooOo0o), strOooOo0o));
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
            purchaseTopCardActivity.f27003OooOo0.OooOoo();
            purchaseTopCardActivity.f27004OooOo00.OooOoo(true);
            O0000000 o0000000 = purchaseTopCardActivity.f27008OooOoO0;
            if (o0000000 != null) {
                o0000000.OooO00o();
            }
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            PurchaseTopCardActivity purchaseTopCardActivity = PurchaseTopCardActivity.this;
            O0000000 o0000000 = purchaseTopCardActivity.f27008OooOoO0;
            if (o0000000 != null) {
                o0000000.OooO00o();
                purchaseTopCardActivity.f27008OooOoO0 = null;
            }
            StoreTopCardModel storeTopCardModel = (StoreTopCardModel) oOo00OO0.OooO00o(str, StoreTopCardModel.class);
            purchaseTopCardActivity.f27005OooOo0O = storeTopCardModel;
            if (storeTopCardModel == null || OooOo00.OooO00o(storeTopCardModel.data)) {
                purchaseTopCardActivity.f27003OooOo0.Oooo00o();
                purchaseTopCardActivity.f27004OooOo00.OooOooo(true, true, true);
                return;
            }
            HashMap map = purchaseTopCardActivity.f27002OooOo;
            map.clear();
            purchaseTopCardActivity.f27003OooOo0.OooOOoo();
            StoreTopCardModel storeTopCardModel2 = purchaseTopCardActivity.f27005OooOo0O;
            if (storeTopCardModel2.isRoom) {
                long j = storeTopCardModel2.isTop;
                if (j > 0) {
                    View viewInflate = View.inflate(purchaseTopCardActivity, oO00OO0O.header_topcard_countdown, null);
                    purchaseTopCardActivity.f27006OooOo0o = (TextView) viewInflate.findViewById(oO00O0oO.tv_countdown);
                    map.put(100, new ViewTimeModel(purchaseTopCardActivity.f27006OooOo0o, j));
                    String strOooOo0o = PurchaseTopCardActivity.OooOo0o(j);
                    purchaseTopCardActivity.f27006OooOo0o.setText(OooOOOO.OooO00o(o0000.OooO00o(oO00O0o.color_FD988C), o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Store_Top_Card_at_top), strOooOo0o), strOooOo0o));
                    purchaseTopCardActivity.f27003OooOo0.OooOo(viewInflate);
                }
            } else {
                View viewInflate2 = View.inflate(purchaseTopCardActivity, oO00OO0O.header_topcard_creat, null);
                viewInflate2.findViewById(oO00O0oO.tv_creat).setOnClickListener(new o00O000o(purchaseTopCardActivity));
                purchaseTopCardActivity.f27003OooOo0.OooOo(viewInflate2);
            }
            purchaseTopCardActivity.f27003OooOo0.OooOoO0(purchaseTopCardActivity.f27005OooOo0O.data);
            purchaseTopCardActivity.f27004OooOo00.OooOooo(true, true, true);
            CountDownTimer countDownTimer = purchaseTopCardActivity.f27007OooOoO;
            if (countDownTimer == null) {
                purchaseTopCardActivity.f27007OooOoO = new OooO00o();
            } else {
                countDownTimer.cancel();
            }
            purchaseTopCardActivity.f27007OooOoO.start();
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
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        OooO0O0 oooO0O0 = new OooO0O0(this);
        o000o00o2.getClass();
        boolean z = App.f22703OooO0o0;
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44136o000000, oO00o000.OooO00o(), oooO0O0);
    }

    public final void OooOo0O() {
        TextView textView = this.f27000OooOOo0;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        textView.setText(OooOOOO.OooO0Oo(String.valueOf(o000000O.OooO0O0().getValue())));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_store_top_card);
        this.f22755OooOO0.setTitle(oO00OOo0.pin_on_top);
        this.f22755OooOO0.OooOo(p584o0oOooO0.oOo00OO0.icon_aristocracy_doubt, new Function0() { // from class: o0o00o0O.o000OO0O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = PurchaseTopCardActivity.f26998OooOoo0;
                PurchaseTopCardActivity purchaseTopCardActivity = this.f49373OooO0Oo;
                purchaseTopCardActivity.getClass();
                purchaseTopCardActivity.startActivity(new Intent(purchaseTopCardActivity, (Class<?>) TopCardPresentationActivity.class));
                return null;
            }
        });
        this.f27000OooOOo0 = (TextView) findViewById(oO00O0oO.tv_coins);
        this.f26999OooOOo = (RecyclerView) findViewById(oO00O0oO.rv_top);
        this.f27001OooOOoo = (TextView) findViewById(oO00O0oO.ly_recharge);
        this.f27004OooOo00 = (XRefreshLayout) findViewById(oO00O0oO.xrl_topcard);
        this.f27001OooOOoo.setOnClickListener(new com.yalla.yalla.ui.activity.store.OooO0O0(this));
        this.f27004OooOo00.setOnRefreshListener(new o000OO00(this));
        o00O0000 o00o0001 = new o00O0000(this, this, oO00OO0O.item_store_top);
        this.f27003OooOo0 = o00o0001;
        o00o0001.Oooo0OO(new o0O0ooO(this));
        this.f26999OooOOo.setLayoutManager(new FixLinearLayoutManager(this));
        this.f26999OooOOo.setAdapter(this.f27003OooOo0);
        OooOo0O();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f27007OooOoO;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p418o0OoO000.Oooo000
    public final void onEventMainThread(OooOo oooOo) {
        super.onEventMainThread(oooOo);
        int i = oooOo.f45532OooO00o;
        if (i == 31 || i == 527) {
            OooOo0();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.f27009OooOoOO == null) {
            new com.opensource.svgaplayer.OooO0OO(this).OooO00o("svga/anim_store_topcard_hammer.svga", new OooO00o());
        } else {
            OooOo0();
        }
    }
}
