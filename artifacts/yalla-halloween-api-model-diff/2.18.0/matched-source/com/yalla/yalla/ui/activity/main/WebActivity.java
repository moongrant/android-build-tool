package com.yalla.yalla.ui.activity.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.app.base.base.activity.BaseActivity;
import com.app.base.view.HeaderLayout;
import com.app.base.view.pop.roomSharePop.RoomShareModel;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.model.ShareWebModel;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o00000;
import p393o0OOooOo.o0O00000;
import p480o0OooooO.oO0o0o;
import p508o0o00oO0.oo00oO;
import p518o0o0O000.o00000OO;
import p518o0o0O000.o00Oo0;
import p537o0o0OOoO.oOOOOo0O;
import p537o0o0OOoO.oOOOoo00;
import p537o0o0OOoO.oOOo0000;
import p537o0o0OOoO.oOOo0O00;
import p537o0o0OOoO.oOo0o00;
import p651o0ooOOoo.d7;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/WebActivity;", "Lcom/app/base/base/activity/BaseActivity;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"SetJavaScriptEnabled"})
public final class WebActivity extends BaseActivity {

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22127ooOO = new OooO00o();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f22128Ooooo00;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public o00Oo0 f22130OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public ValueCallback<Uri[]> f22131OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f22132OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public d7 f22133Oooooo;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public WebPageInfo f22136Ooooooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @Nullable
    public Menu f22137o0OoOo0;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f22129Ooooo0o = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public String f22134Oooooo0 = "";

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f22135OoooooO = true;

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context, @Nullable WebPageInfo webPageInfo) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) WebActivity.class);
            intent.putExtra("pageinfo", webPageInfo);
            context.startActivity(intent);
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebFrom.values().length];
            iArr[WebFrom.FAQ.ordinal()] = 1;
            iArr[WebFrom.RoomBonus.ordinal()] = 2;
            iArr[WebFrom.TermsOfService.ordinal()] = 3;
            iArr[WebFrom.KaVipDetails.ordinal()] = 4;
            iArr[WebFrom.StoreCoin.ordinal()] = 5;
            iArr[WebFrom.LoginInstagram.ordinal()] = 6;
            iArr[WebFrom.LoginPageFeedback.ordinal()] = 7;
            iArr[WebFrom.VerificationCodeFeedback.ordinal()] = 8;
            iArr[WebFrom.UserLevel.ordinal()] = 9;
            iArr[WebFrom.CrystalExchangeRecord.ordinal()] = 10;
            iArr[WebFrom.Mintroute_Recharge.ordinal()] = 11;
            iArr[WebFrom.Ad.ordinal()] = 12;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<oo00oO> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oo00oO invoke() {
            return new oo00oO(WebActivity.this, ShareType.Room);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOoo() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebActivity.class.getName());
        sb.append("TYPE_ACCOUNT");
        WebPageInfo webPageInfo = this.f22136Ooooooo;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        sb.append(webPageInfo.f21234Oooo);
        MobclickAgent.onPageEnd(sb.toString());
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOo00() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebActivity.class.getName());
        sb.append("TYPE_ACCOUNT");
        WebPageInfo webPageInfo = this.f22136Ooooooo;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        sb.append(webPageInfo.f21234Oooo);
        MobclickAgent.onPageStart(sb.toString());
    }

    public final String OooOoO() {
        d7 d7Var = this.f22133Oooooo;
        WebPageInfo webPageInfo = null;
        if (d7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            d7Var = null;
        }
        String title = d7Var.f49150OooO0o0.getTitle();
        if (!(title == null || StringsKt.isBlank(title)) && !StringsKt__StringsJVMKt.startsWith$default(title, "http", false, 2, null)) {
            return title;
        }
        WebPageInfo webPageInfo2 = this.f22136Ooooooo;
        if (webPageInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
        } else {
            webPageInfo = webPageInfo2;
        }
        return webPageInfo.f21238OoooO0O;
    }

    public final void OooOoOO() {
        d7 d7Var = this.f22133Oooooo;
        d7 d7Var2 = null;
        if (d7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            d7Var = null;
        }
        ScrollView scrollView = d7Var.f49147OooO0O0.f49602OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.emptyView.root");
        o00O0O.OooO(scrollView);
        d7 d7Var3 = this.f22133Oooooo;
        if (d7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            d7Var3 = null;
        }
        LinearLayout linearLayout = d7Var3.f49147OooO0O0.f49606OooO0o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.emptyView.nodataLayoutVFirst");
        o00O0O.OooO(linearLayout);
        d7 d7Var4 = this.f22133Oooooo;
        if (d7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            d7Var4 = null;
        }
        LinearLayout linearLayout2 = d7Var4.f49147OooO0O0.f49605OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.emptyView.nodataLayoutVEmpty");
        o00O0O.OooO00o(linearLayout2);
        d7 d7Var5 = this.f22133Oooooo;
        if (d7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            d7Var2 = d7Var5;
        }
        LinearLayout linearLayout3 = d7Var2.f49147OooO0O0.f49607OooO0o0;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.emptyView.nodataLayoutVError");
        o00O0O.OooO00o(linearLayout3);
        o00Oo0 o00oo1 = this.f22130OooooO0;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        if (this.f22132OooooOo) {
            Intent intent = new Intent();
            intent.putExtra("INSTAGRAG_LOGIN_URI", this.f22134Oooooo0);
            setResult(101, intent);
        }
        super.finish();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        ValueCallback<Uri[]> valueCallback;
        Uri data;
        super.onActivityResult(i, i2, intent);
        if (i != 1 || (valueCallback = this.f22131OooooOO) == null) {
            return;
        }
        if (i2 != -1) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            this.f22131OooooOO = null;
        } else {
            if (intent == null || (data = intent.getData()) == null) {
                return;
            }
            ValueCallback<Uri[]> valueCallback2 = this.f22131OooooOO;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(new Uri[]{data});
            }
            this.f22131OooooOO = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f22135OoooooO) {
            d7 d7Var = this.f22133Oooooo;
            d7 d7Var2 = null;
            if (d7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                d7Var = null;
            }
            if (!d7Var.f49150OooO0o0.canGoBack()) {
                super.onBackPressed();
                return;
            }
            d7 d7Var3 = this.f22133Oooooo;
            if (d7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                d7Var2 = d7Var3;
            }
            d7Var2.f49150OooO0o0.goBack();
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        HeaderLayout headerLayout;
        super.onCreate(bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra("pageinfo");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.common.util.WebPageInfo");
        this.f22136Ooooooo = (WebPageInfo) serializableExtra;
        try {
            d7 d7VarInflate = d7.inflate(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(d7VarInflate, "inflate(layoutInflater)");
            this.f22133Oooooo = d7VarInflate;
            if (d7VarInflate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                d7VarInflate = null;
            }
            setContentView(d7VarInflate.f49146OooO00o);
            WebPageInfo webPageInfo = this.f22136Ooooooo;
            if (webPageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo = null;
            }
            int i = 1;
            if (webPageInfo.f21234Oooo == WebFrom.Ad) {
                HeaderLayout headerLayout2 = this.f11480OoooOOO;
                if (headerLayout2 != null) {
                    o00O0O.OooO00o(headerLayout2);
                }
                d7 d7Var = this.f22133Oooooo;
                if (d7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    d7Var = null;
                }
                ProgressBar progressBar = d7Var.f49149OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(progressBar, "binding.pbWeb");
                o00O0O.OooO00o(progressBar);
                d7 d7Var2 = this.f22133Oooooo;
                if (d7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    d7Var2 = null;
                }
                ImageView imageView = d7Var2.f49148OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClose");
                o00O0O.OooO(imageView);
                Window window = getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "window");
                oO0o0o.OooO0Oo(window, 0);
                d7 d7Var3 = this.f22133Oooooo;
                if (d7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    d7Var3 = null;
                }
                ImageView imageView2 = d7Var3.f49148OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivClose");
                oO0o0o.OooO0O0(imageView2, false, 3);
                d7 d7Var4 = this.f22133Oooooo;
                if (d7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    d7Var4 = null;
                }
                d7Var4.f49148OooO0OO.setOnClickListener(new p536o0o0OOo0.oo00oO(this, i));
            } else {
                HeaderLayout headerLayout3 = this.f11480OoooOOO;
                if (headerLayout3 != null) {
                    o00O0O.OooO(headerLayout3);
                }
                d7 d7Var5 = this.f22133Oooooo;
                if (d7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    d7Var5 = null;
                }
                ProgressBar progressBar2 = d7Var5.f49149OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "binding.pbWeb");
                o00O0O.OooO(progressBar2);
                d7 d7Var6 = this.f22133Oooooo;
                if (d7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    d7Var6 = null;
                }
                ImageView imageView3 = d7Var6.f49148OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivClose");
                o00O0O.OooO00o(imageView3);
            }
            WebPageInfo webPageInfo2 = this.f22136Ooooooo;
            if (webPageInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo2 = null;
            }
            int i2 = OooO0O0.$EnumSwitchMapping$0[webPageInfo2.f21234Oooo.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                OooOo0O(1);
            } else if (i2 != 4) {
                OooOo0O(0);
            } else {
                OooOo0O(3);
                d7 d7Var7 = this.f22133Oooooo;
                if (d7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    d7Var7 = null;
                }
                d7Var7.f49146OooO00o.setBackgroundColor(OooOOO.OooO00o(R.color.color_111));
                d7 d7Var8 = this.f22133Oooooo;
                if (d7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    d7Var8 = null;
                }
                d7Var8.f49150OooO0o0.setBackgroundColor(OooOOO.OooO00o(R.color.color_111));
            }
            WebPageInfo webPageInfo3 = this.f22136Ooooooo;
            if (webPageInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo3 = null;
            }
            OooOoO0(webPageInfo3.f21238OoooO0O);
            WebPageInfo webPageInfo4 = this.f22136Ooooooo;
            if (webPageInfo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo4 = null;
            }
            if (webPageInfo4.f21239OoooOO0 && (headerLayout = this.f11480OoooOOO) != null) {
                headerLayout.setNavigationIcon(R.drawable.btn_header_close);
            }
            d7 d7Var9 = this.f22133Oooooo;
            if (d7Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                d7Var9 = null;
            }
            d7Var9.f49147OooO0O0.f49607OooO0o0.setBackgroundColor(OooOOO.OooO00o(R.color.white));
            d7 d7Var10 = this.f22133Oooooo;
            if (d7Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                d7Var10 = null;
            }
            d7Var10.f49147OooO0O0.f49603OooO0O0.setOnClickListener(new oOOOoo00(this));
            d7 d7Var11 = this.f22133Oooooo;
            if (d7Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                d7Var11 = null;
            }
            ImageView imageView4 = d7Var11.f49147OooO0O0.f49604OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.emptyView.nodataLayoutIvFirstLoading");
            this.f22130OooooO0 = new o00Oo0(imageView4, R.array.horse_gray, 1000L, true);
            OooOoOO();
            d7 d7Var12 = this.f22133Oooooo;
            if (d7Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                d7Var12 = null;
            }
            d7Var12.f49150OooO0o0.getSettings().setCacheMode(2);
            d7 d7Var13 = this.f22133Oooooo;
            if (d7Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                d7Var13 = null;
            }
            d7Var13.f49150OooO0o0.addJavascriptInterface(new oOOo0000(this), "Yalla");
            d7 d7Var14 = this.f22133Oooooo;
            if (d7Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                d7Var14 = null;
            }
            d7Var14.f49150OooO0o0.setLoadStateListener(new oOOo0O00(this));
            d7 d7Var15 = this.f22133Oooooo;
            if (d7Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                d7Var15 = null;
            }
            d7Var15.f49150OooO0o0.setWebClientBridge(new oOo0o00(this));
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new oOOOOo0O(this, null), 3, null);
            LiveEventBus.get("refreshUniqueIDPage").observe(this, new o00000(this, i));
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onCreateOptionsMenu(menu);
        WebPageInfo webPageInfo = this.f22136Ooooooo;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        switch (OooO0O0.$EnumSwitchMapping$0[webPageInfo.f21234Oooo.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                break;
            case 2:
            default:
                getMenuInflater().inflate(R.menu.menu_web, menu);
                this.f22137o0OoOo0 = menu;
                break;
        }
        return true;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        d7 d7Var = this.f22133Oooooo;
        if (d7Var != null) {
            if (d7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                d7Var = null;
            }
            d7Var.f49150OooO0o0.OooO0OO();
        }
        super.onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // com.app.base.base.activity.BaseFragmentActivity, android.app.Activity
    public final boolean onOptionsItemSelected(@NotNull MenuItem item) {
        boolean z;
        String title;
        Intrinsics.checkNotNullParameter(item, "item");
        WebPageInfo webPageInfo = null;
        WebPageInfo webPageInfo2 = null;
        WebPageInfo webPageInfo3 = null;
        d7 d7Var = null;
        switch (item.getItemId()) {
            case R.id.item_web_action_browsers /* 2131297550 */:
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    WebPageInfo webPageInfo4 = this.f22136Ooooooo;
                    if (webPageInfo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    } else {
                        webPageInfo = webPageInfo4;
                    }
                    intent.setData(Uri.parse(o00000OO.OooO00o(webPageInfo.f21237OoooO00)));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(Intent.createChooser(intent, ""));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.item_web_action_refresh /* 2131297551 */:
                d7 d7Var2 = this.f22133Oooooo;
                if (d7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    d7Var = d7Var2;
                }
                d7Var.f49150OooO0o0.reload();
                break;
            case R.id.item_web_action_share /* 2131297552 */:
                oo00oO oo00oo = (oo00oO) this.f22129Ooooo0o.getValue();
                WebPageInfo webPageInfo5 = this.f22136Ooooooo;
                if (webPageInfo5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo5 = null;
                }
                if (webPageInfo5.f21234Oooo == WebFrom.MomentActivityBanner) {
                    z = true;
                } else {
                    WebPageInfo webPageInfo6 = this.f22136Ooooooo;
                    if (webPageInfo6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo6 = null;
                    }
                    if (webPageInfo6.f21234Oooo == WebFrom.RoomMainBanner) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                oo00oo.f41703Ooooo00 = z;
                if (z) {
                    ShareModel shareModel = new ShareModel(ShareType.Web);
                    ShareWebModel shareWebModel = new ShareWebModel();
                    WebPageInfo webPageInfo7 = this.f22136Ooooooo;
                    if (webPageInfo7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo7 = null;
                    }
                    shareWebModel.setWebFrom(webPageInfo7.f21234Oooo);
                    WebPageInfo webPageInfo8 = this.f22136Ooooooo;
                    if (webPageInfo8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo8 = null;
                    }
                    shareWebModel.setTitle(webPageInfo8.f21238OoooO0O);
                    WebPageInfo webPageInfo9 = this.f22136Ooooooo;
                    if (webPageInfo9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo9 = null;
                    }
                    shareWebModel.setContent(webPageInfo9.f21242OoooOo0);
                    WebPageInfo webPageInfo10 = this.f22136Ooooooo;
                    if (webPageInfo10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo10 = null;
                    }
                    shareWebModel.setUrl(webPageInfo10.f21237OoooO00);
                    WebPageInfo webPageInfo11 = this.f22136Ooooooo;
                    if (webPageInfo11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo11 = null;
                    }
                    shareWebModel.setImagesUrl(webPageInfo11.f21241OoooOOo);
                    WebPageInfo webPageInfo12 = this.f22136Ooooooo;
                    if (webPageInfo12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo12 = null;
                    }
                    shareWebModel.setId((String) webPageInfo12.f21247o000oOoO.get("barId"));
                    WebPageInfo webPageInfo13 = this.f22136Ooooooo;
                    if (webPageInfo13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    } else {
                        webPageInfo2 = webPageInfo13;
                    }
                    shareWebModel.setIdx((String) webPageInfo2.f21247o000oOoO.get("barId"));
                    shareModel.setWeb(shareWebModel);
                    oo00oo.f41705OooooO0 = shareModel;
                } else {
                    ShareModel shareModel2 = new ShareModel(ShareType.Room);
                    d7 d7Var3 = this.f22133Oooooo;
                    if (d7Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        d7Var3 = null;
                    }
                    String title2 = d7Var3.f49150OooO0o0.getTitle();
                    if (title2 == null || StringsKt.isBlank(title2)) {
                        WebPageInfo webPageInfo14 = this.f22136Ooooooo;
                        if (webPageInfo14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                            webPageInfo14 = null;
                        }
                        title = webPageInfo14.f21238OoooO0O;
                    } else {
                        d7 d7Var4 = this.f22133Oooooo;
                        if (d7Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            d7Var4 = null;
                        }
                        title = d7Var4.f49150OooO0o0.getTitle();
                    }
                    String str = title;
                    WebPageInfo webPageInfo15 = this.f22136Ooooooo;
                    if (webPageInfo15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo15 = null;
                    }
                    String str2 = webPageInfo15.f21242OoooOo0;
                    WebPageInfo webPageInfo16 = this.f22136Ooooooo;
                    if (webPageInfo16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo16 = null;
                    }
                    String strOooO00o = o00000OO.OooO00o(webPageInfo16.f21237OoooO00);
                    WebPageInfo webPageInfo17 = this.f22136Ooooooo;
                    if (webPageInfo17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo17 = null;
                    }
                    String str3 = webPageInfo17.f21241OoooOOo;
                    WebPageInfo webPageInfo18 = this.f22136Ooooooo;
                    if (webPageInfo18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo18 = null;
                    }
                    String str4 = (String) webPageInfo18.f21247o000oOoO.get("roomid");
                    WebPageInfo webPageInfo19 = this.f22136Ooooooo;
                    if (webPageInfo19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo19 = null;
                    }
                    String str5 = (String) webPageInfo19.f21247o000oOoO.get("roomid");
                    WebPageInfo webPageInfo20 = this.f22136Ooooooo;
                    if (webPageInfo20 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    } else {
                        webPageInfo3 = webPageInfo20;
                    }
                    shareModel2.setRoom(new RoomShareModel(str, str2, strOooO00o, str3, str4, str5, webPageInfo3.f21234Oooo.getValue()));
                    oo00oo.f41705OooooO0 = shareModel2;
                }
                oo00oo.OooOO0();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        WebPageInfo webPageInfo = this.f22136Ooooooo;
        WebPageInfo webPageInfo2 = null;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        if (webPageInfo.f21234Oooo == WebFrom.RoomMainBanner) {
            HashMap map = new HashMap();
            map.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, OooOoO());
            o0O00000.OooO0o("Room_banner_stay", map, (int) this.f11483OoooOoO);
        }
        WebPageInfo webPageInfo3 = this.f22136Ooooooo;
        if (webPageInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
        } else {
            webPageInfo2 = webPageInfo3;
        }
        if (webPageInfo2.f21234Oooo == WebFrom.ActivityNotice) {
            HashMap map2 = new HashMap();
            map2.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, OooOoO());
            o0O00000.OooO0o("InRoom_activity_stay", map2, (int) this.f11483OoooOoO);
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (menu.size() > 0) {
            MenuItem menuItemFindItem = menu.findItem(R.id.item_web_action_share);
            WebPageInfo webPageInfo = this.f22136Ooooooo;
            WebPageInfo webPageInfo2 = null;
            if (webPageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo = null;
            }
            menuItemFindItem.setVisible(webPageInfo.f21240OoooOOO != WebPageInfo.ShareType.NoShare);
            MenuItem menuItemFindItem2 = menu.findItem(R.id.item_web_action_browsers);
            WebPageInfo webPageInfo3 = this.f22136Ooooooo;
            if (webPageInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo2 = webPageInfo3;
            }
            menuItemFindItem2.setVisible(webPageInfo2.f21243OoooOoO);
        }
        return super.onPrepareOptionsMenu(menu);
    }
}
