package com.yalla.yalla.ui.activity.store;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.application.App;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.StoreTopCardModel;
import com.app.base.model.ViewTimeModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import com.yalla.yalla.ui.activity.store.TopCardPresentationActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p139o00OOOo0.o0ooOOo;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0OO;
import p254o00ooO0O.o000O0O0;
import p405o0Oo0OO0.OooOo;
import p405o0Oo0OO0.OooOo00;
import p564o0oOo00.o00Ooo;
import p564o0oOo00.o0OOO0o;
import p564o0oOo00.o0OoOo0;
import p564o0oOo00.oo000o;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes3.dex */
public class PurchaseTopCardActivity extends BaseActivity {

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public static final /* synthetic */ int f23222Ooooooo = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public TextView f23223OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public RecyclerView f23224OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f23225OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public XRefreshLayout f23226Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public OooO0OO<StoreTopCardModel.TopCard> f23227Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public StoreTopCardModel f23228OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public TextView f23229OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final Map<Integer, ViewTimeModel> f23230OooooOo = new HashMap();

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public CountDownTimer f23231Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public o000O f23232Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public OooOo f23233OoooooO;

    public class OooO00o implements OooOo00.OooO0O0 {
        public OooO00o() {
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onComplete(@NotNull OooOo oooOo) {
            PurchaseTopCardActivity purchaseTopCardActivity = PurchaseTopCardActivity.this;
            purchaseTopCardActivity.f23233OoooooO = oooOo;
            purchaseTopCardActivity.OooOoO();
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onError() {
        }
    }

    public class OooO0O0 extends o00OO0O0.OooO0O0 {

        public class OooO00o extends CountDownTimer {
            public OooO00o() {
                super(21600000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.model.ViewTimeModel>] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.model.ViewTimeModel>] */
            /* JADX WARN: Type inference failed for: r9v3, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.model.ViewTimeModel>] */
            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                PurchaseTopCardActivity purchaseTopCardActivity = PurchaseTopCardActivity.this;
                for (Integer num : purchaseTopCardActivity.f23230OooooOo.keySet()) {
                    ViewTimeModel viewTimeModel = (ViewTimeModel) purchaseTopCardActivity.f23230OooooOo.get(num);
                    long j2 = viewTimeModel.time;
                    if (j2 == 0) {
                        purchaseTopCardActivity.f23230OooooOo.remove(viewTimeModel);
                        if (purchaseTopCardActivity.f23232Oooooo0 == null) {
                            Objects.requireNonNull(o0ooOOo.OooO00o());
                            o000O o000o = new o000O();
                            purchaseTopCardActivity.f23232Oooooo0 = o000o;
                            o000o.OooO0OO(purchaseTopCardActivity, o000O0O0.OooO0OO(R.string.loading));
                            purchaseTopCardActivity.OooOoO();
                            return;
                        }
                        return;
                    }
                    long j3 = j2 - 1;
                    viewTimeModel.time = j3;
                    String strOooOoo0 = purchaseTopCardActivity.OooOoo0(j3);
                    if (num.intValue() == 100) {
                        viewTimeModel.tvTime.setText(o0O0O00.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Store_Top_Card_at_top), strOooOoo0), strOooOoo0, OooOOO.OooO00o(R.color.color_FD988C)));
                    } else {
                        viewTimeModel.tvTime.setText(strOooOoo0);
                    }
                }
            }
        }

        public OooO0O0(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            PurchaseTopCardActivity.this.f23227Ooooo0o.loadError();
            PurchaseTopCardActivity.this.f23226Ooooo00.Oooo0O0(true);
            o000O o000o = PurchaseTopCardActivity.this.f23232Oooooo0;
            if (o000o != null) {
                o000o.OooO00o();
            }
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.model.ViewTimeModel>] */
        /* JADX WARN: Type inference failed for: r9v12, types: [java.util.HashMap, java.util.Map<java.lang.Integer, com.app.base.model.ViewTimeModel>] */
        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            o000O o000o = PurchaseTopCardActivity.this.f23232Oooooo0;
            if (o000o != null) {
                o000o.OooO00o();
                PurchaseTopCardActivity.this.f23232Oooooo0 = null;
            }
            PurchaseTopCardActivity.this.f23228OooooO0 = (StoreTopCardModel) o0Oo0oo.OooO0O0(str, StoreTopCardModel.class);
            StoreTopCardModel storeTopCardModel = PurchaseTopCardActivity.this.f23228OooooO0;
            if (storeTopCardModel == null || com.yalla.support.common.util.OooO0OO.OooO00o(storeTopCardModel.data)) {
                PurchaseTopCardActivity.this.f23227Ooooo0o.setLoadComplete();
                PurchaseTopCardActivity.this.f23226Ooooo00.Oooo0o0(true, true, true);
                return;
            }
            PurchaseTopCardActivity.this.f23230OooooOo.clear();
            PurchaseTopCardActivity.this.f23227Ooooo0o.removeAllHeaderView();
            PurchaseTopCardActivity purchaseTopCardActivity = PurchaseTopCardActivity.this;
            StoreTopCardModel storeTopCardModel2 = purchaseTopCardActivity.f23228OooooO0;
            if (storeTopCardModel2.isRoom) {
                long j = storeTopCardModel2.isTop;
                if (j > 0) {
                    View viewInflate = View.inflate(purchaseTopCardActivity, R.layout.header_topcard_countdown, null);
                    purchaseTopCardActivity.f23229OooooOO = (TextView) viewInflate.findViewById(R.id.tv_countdown);
                    purchaseTopCardActivity.f23230OooooOo.put(100, new ViewTimeModel(purchaseTopCardActivity.f23229OooooOO, j));
                    String strOooOoo0 = purchaseTopCardActivity.OooOoo0(j);
                    purchaseTopCardActivity.f23229OooooOO.setText(o0O0O00.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Store_Top_Card_at_top), strOooOoo0), strOooOoo0, OooOOO.OooO00o(R.color.color_FD988C)));
                    purchaseTopCardActivity.f23227Ooooo0o.setHeaderView(viewInflate);
                }
            } else {
                View viewInflate2 = View.inflate(purchaseTopCardActivity, R.layout.header_topcard_creat, null);
                viewInflate2.findViewById(R.id.tv_creat).setOnClickListener(new o0OOO0o(purchaseTopCardActivity));
                purchaseTopCardActivity.f23227Ooooo0o.setHeaderView(viewInflate2);
            }
            PurchaseTopCardActivity purchaseTopCardActivity2 = PurchaseTopCardActivity.this;
            purchaseTopCardActivity2.f23227Ooooo0o.setNewData(purchaseTopCardActivity2.f23228OooooO0.data);
            PurchaseTopCardActivity.this.f23226Ooooo00.Oooo0o0(true, true, true);
            PurchaseTopCardActivity purchaseTopCardActivity3 = PurchaseTopCardActivity.this;
            CountDownTimer countDownTimer = purchaseTopCardActivity3.f23231Oooooo;
            if (countDownTimer == null) {
                purchaseTopCardActivity3.f23231Oooooo = new OooO00o();
            } else {
                countDownTimer.cancel();
            }
            PurchaseTopCardActivity.this.f23231Oooooo.start();
        }
    }

    public final void OooOoO() {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        p153o00Oo0oO.o0O0O00 o0o0o00 = o00000OO.f32211OooO0o;
        OooO0O0 oooO0O0 = new OooO0O0(this);
        App app = App.f11458Oooo0oO;
        Map mapOooO00o = com.app.base.Function.OooO0OO.OooO00o();
        p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, p153o00Oo0oO.o0ooOOo.f32244OooOoo, p153o00Oo0oO.o0ooOOo.f32285o00000O0, mapOooO00o, oooO0O0);
    }

    public final void OooOoOO() {
        this.f23223OoooOo0.setText(o0O0O00.OooO0Oo(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0OO().getValue())));
    }

    public final String OooOoo0(long j) {
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

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_store_top_card);
        this.f11463OoooO.setTitle(R.string.pin_on_top);
        this.f11463OoooO.OooOoOO(R.drawable.icon_aristocracy_doubt, new Function0() { // from class: o0oOo00.Oooo000
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PurchaseTopCardActivity purchaseTopCardActivity = this.f45129Oooo0o;
                int i = PurchaseTopCardActivity.f23222Ooooooo;
                Objects.requireNonNull(purchaseTopCardActivity);
                purchaseTopCardActivity.startActivity(new Intent(purchaseTopCardActivity, (Class<?>) TopCardPresentationActivity.class));
                return null;
            }
        });
        this.f23223OoooOo0 = (TextView) findViewById(R.id.tv_coins);
        this.f23224OoooOoO = (RecyclerView) findViewById(R.id.rv_top);
        this.f23225OoooOoo = (TextView) findViewById(R.id.ly_recharge);
        this.f23226Ooooo00 = (XRefreshLayout) findViewById(R.id.xrl_topcard);
        this.f23225OoooOoo.setOnClickListener(new com.yalla.yalla.ui.activity.store.OooO0O0(this));
        this.f23226Ooooo00.setOnRefreshListener(new o0OoOo0(this));
        o00Ooo o00ooo2 = new o00Ooo(this, this);
        this.f23227Ooooo0o = o00ooo2;
        o00ooo2.setLoadErrorClickListener(new oo000o(this));
        this.f23224OoooOoO.setLayoutManager(new FixLinearLayoutManager(this));
        this.f23224OoooOoO.setAdapter(this.f23227Ooooo0o);
        OooOoOO();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f23231Oooooo;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, p140o00OOOoO.OooO0o
    public final void onEventMainThread(p140o00OOOoO.OooO0OO oooO0OO) {
        super.onEventMainThread(oooO0OO);
        int i = oooO0OO.f31885OooO00o;
        if (i == 31 || i == 527) {
            OooOoO();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.f23233OoooooO == null) {
            new OooOo00(this).OooO0oO("svga/anim_store_topcard_hammer.svga", new OooO00o());
        } else {
            OooOoO();
        }
    }
}
