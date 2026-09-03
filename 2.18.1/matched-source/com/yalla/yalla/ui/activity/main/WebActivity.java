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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o00000;
import p391o0OOooOo.o0O00000;
import p478o0OooooO.oO0OoOO0;
import p506o0o00oO0.o0O00o0;
import p516o0o0O000.o00000OO;
import p516o0o0O000.o00Oo0;
import p534o0o0OOo0.o0O0o;
import p535o0o0OOoO.oOOOOo0O;
import p535o0o0OOoO.oOOo0000;
import p535o0o0OOoO.oOOo0O00;
import p535o0o0OOoO.oOo0o00;
import p535o0o0OOoO.oo000000;
import p649o0ooOOoo.e7;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/WebActivity;", "Lcom/app/base/base/activity/BaseActivity;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"SetJavaScriptEnabled"})
public final class WebActivity extends BaseActivity {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22108OoooooO = new OooO00o();

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f22109OoooOo0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public o00Oo0 f22111OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public ValueCallback<Uri[]> f22112Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f22113Ooooo0o;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public e7 f22115OooooOO;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public Menu f22117Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public WebPageInfo f22118Oooooo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f22110OoooOoO = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public String f22114OooooO0 = "";

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f22116OooooOo = true;

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

    public static final class OooO0OO extends Lambda implements Function0<o0O00o0> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O00o0 invoke() {
            return new o0O00o0(WebActivity.this, ShareType.Room);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOoo() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebActivity.class.getName());
        sb.append("TYPE_ACCOUNT");
        WebPageInfo webPageInfo = this.f22118Oooooo0;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        sb.append(webPageInfo.f21216Oooo0o);
        MobclickAgent.onPageEnd(sb.toString());
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOo00() {
        StringBuilder sb = new StringBuilder();
        sb.append(WebActivity.class.getName());
        sb.append("TYPE_ACCOUNT");
        WebPageInfo webPageInfo = this.f22118Oooooo0;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        sb.append(webPageInfo.f21216Oooo0o);
        MobclickAgent.onPageStart(sb.toString());
    }

    public final String OooOoO() {
        e7 e7Var = this.f22115OooooOO;
        WebPageInfo webPageInfo = null;
        if (e7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e7Var = null;
        }
        String title = e7Var.f49213OooO0o0.getTitle();
        if (!(title == null || StringsKt.isBlank(title)) && !StringsKt.OooOoOO(title, "http")) {
            return title;
        }
        WebPageInfo webPageInfo2 = this.f22118Oooooo0;
        if (webPageInfo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
        } else {
            webPageInfo = webPageInfo2;
        }
        return webPageInfo.f21215Oooo;
    }

    public final void OooOoOO() {
        e7 e7Var = this.f22115OooooOO;
        e7 e7Var2 = null;
        if (e7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e7Var = null;
        }
        ScrollView scrollView = e7Var.f49210OooO0O0.f49665OooO00o;
        Intrinsics.checkNotNullExpressionValue(scrollView, "binding.emptyView.root");
        o00O0O.OooO(scrollView);
        e7 e7Var3 = this.f22115OooooOO;
        if (e7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e7Var3 = null;
        }
        LinearLayout linearLayout = e7Var3.f49210OooO0O0.f49669OooO0o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.emptyView.nodataLayoutVFirst");
        o00O0O.OooO(linearLayout);
        e7 e7Var4 = this.f22115OooooOO;
        if (e7Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            e7Var4 = null;
        }
        LinearLayout linearLayout2 = e7Var4.f49210OooO0O0.f49668OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.emptyView.nodataLayoutVEmpty");
        o00O0O.OooO00o(linearLayout2);
        e7 e7Var5 = this.f22115OooooOO;
        if (e7Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            e7Var2 = e7Var5;
        }
        LinearLayout linearLayout3 = e7Var2.f49210OooO0O0.f49670OooO0o0;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.emptyView.nodataLayoutVError");
        o00O0O.OooO00o(linearLayout3);
        o00Oo0 o00oo1 = this.f22111OoooOoo;
        if (o00oo1 != null) {
            o00oo1.OooO0O0();
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        if (this.f22113Ooooo0o) {
            Intent intent = new Intent();
            intent.putExtra("INSTAGRAG_LOGIN_URI", this.f22114OooooO0);
            setResult(101, intent);
        }
        super.finish();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        ValueCallback<Uri[]> valueCallback;
        Uri data;
        super.onActivityResult(i, i2, intent);
        if (i != 1 || (valueCallback = this.f22112Ooooo00) == null) {
            return;
        }
        if (i2 != -1) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            this.f22112Ooooo00 = null;
        } else {
            if (intent == null || (data = intent.getData()) == null) {
                return;
            }
            ValueCallback<Uri[]> valueCallback2 = this.f22112Ooooo00;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(new Uri[]{data});
            }
            this.f22112Ooooo00 = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f22116OooooOo) {
            e7 e7Var = this.f22115OooooOO;
            e7 e7Var2 = null;
            if (e7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7Var = null;
            }
            if (!e7Var.f49213OooO0o0.canGoBack()) {
                super.onBackPressed();
                return;
            }
            e7 e7Var3 = this.f22115OooooOO;
            if (e7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                e7Var2 = e7Var3;
            }
            e7Var2.f49213OooO0o0.goBack();
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        HeaderLayout headerLayout;
        super.onCreate(bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra("pageinfo");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.common.util.WebPageInfo");
        this.f22118Oooooo0 = (WebPageInfo) serializableExtra;
        try {
            e7 e7VarInflate = e7.inflate(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(e7VarInflate, "inflate(layoutInflater)");
            this.f22115OooooOO = e7VarInflate;
            if (e7VarInflate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7VarInflate = null;
            }
            setContentView(e7VarInflate.f49209OooO00o);
            WebPageInfo webPageInfo = this.f22118Oooooo0;
            if (webPageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo = null;
            }
            int i = 1;
            if (webPageInfo.f21216Oooo0o == WebFrom.Ad) {
                HeaderLayout headerLayout2 = this.f11463OoooO;
                if (headerLayout2 != null) {
                    o00O0O.OooO00o(headerLayout2);
                }
                e7 e7Var = this.f22115OooooOO;
                if (e7Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    e7Var = null;
                }
                ProgressBar progressBar = e7Var.f49212OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(progressBar, "binding.pbWeb");
                o00O0O.OooO00o(progressBar);
                e7 e7Var2 = this.f22115OooooOO;
                if (e7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    e7Var2 = null;
                }
                ImageView imageView = e7Var2.f49211OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivClose");
                o00O0O.OooO(imageView);
                Window window = getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "window");
                oO0OoOO0.OooO0Oo(window, 0);
                e7 e7Var3 = this.f22115OooooOO;
                if (e7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    e7Var3 = null;
                }
                ImageView imageView2 = e7Var3.f49211OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivClose");
                oO0OoOO0.OooO0O0(imageView2, false, 3);
                e7 e7Var4 = this.f22115OooooOO;
                if (e7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    e7Var4 = null;
                }
                e7Var4.f49211OooO0OO.setOnClickListener(new o0O0o(this, i));
            } else {
                HeaderLayout headerLayout3 = this.f11463OoooO;
                if (headerLayout3 != null) {
                    o00O0O.OooO(headerLayout3);
                }
                e7 e7Var5 = this.f22115OooooOO;
                if (e7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    e7Var5 = null;
                }
                ProgressBar progressBar2 = e7Var5.f49212OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "binding.pbWeb");
                o00O0O.OooO(progressBar2);
                e7 e7Var6 = this.f22115OooooOO;
                if (e7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    e7Var6 = null;
                }
                ImageView imageView3 = e7Var6.f49211OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivClose");
                o00O0O.OooO00o(imageView3);
            }
            WebPageInfo webPageInfo2 = this.f22118Oooooo0;
            if (webPageInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo2 = null;
            }
            int i2 = OooO0O0.$EnumSwitchMapping$0[webPageInfo2.f21216Oooo0o.ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                OooOo0O(1);
            } else if (i2 != 4) {
                OooOo0O(0);
            } else {
                OooOo0O(3);
                e7 e7Var7 = this.f22115OooooOO;
                if (e7Var7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    e7Var7 = null;
                }
                e7Var7.f49209OooO00o.setBackgroundColor(OooOOO.OooO00o(R.color.color_111));
                e7 e7Var8 = this.f22115OooooOO;
                if (e7Var8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    e7Var8 = null;
                }
                e7Var8.f49213OooO0o0.setBackgroundColor(OooOOO.OooO00o(R.color.color_111));
            }
            WebPageInfo webPageInfo3 = this.f22118Oooooo0;
            if (webPageInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo3 = null;
            }
            OooOoO0(webPageInfo3.f21215Oooo);
            WebPageInfo webPageInfo4 = this.f22118Oooooo0;
            if (webPageInfo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo4 = null;
            }
            if (webPageInfo4.f21220OoooO0 && (headerLayout = this.f11463OoooO) != null) {
                headerLayout.setNavigationIcon(R.drawable.btn_header_close);
            }
            e7 e7Var9 = this.f22115OooooOO;
            if (e7Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7Var9 = null;
            }
            e7Var9.f49210OooO0O0.f49670OooO0o0.setBackgroundColor(OooOOO.OooO00o(R.color.white));
            e7 e7Var10 = this.f22115OooooOO;
            if (e7Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7Var10 = null;
            }
            e7Var10.f49210OooO0O0.f49666OooO0O0.setOnClickListener(new oOOOOo0O(this));
            e7 e7Var11 = this.f22115OooooOO;
            if (e7Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7Var11 = null;
            }
            ImageView imageView4 = e7Var11.f49210OooO0O0.f49667OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.emptyView.nodataLayoutIvFirstLoading");
            this.f22111OoooOoo = new o00Oo0(imageView4, R.array.horse_gray, 1000L, true);
            OooOoOO();
            e7 e7Var12 = this.f22115OooooOO;
            if (e7Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7Var12 = null;
            }
            e7Var12.f49213OooO0o0.getSettings().setCacheMode(2);
            e7 e7Var13 = this.f22115OooooOO;
            if (e7Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7Var13 = null;
            }
            e7Var13.f49213OooO0o0.addJavascriptInterface(new oOOo0O00(this), "Yalla");
            e7 e7Var14 = this.f22115OooooOO;
            if (e7Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7Var14 = null;
            }
            e7Var14.f49213OooO0o0.setLoadStateListener(new oOo0o00(this));
            e7 e7Var15 = this.f22115OooooOO;
            if (e7Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7Var15 = null;
            }
            e7Var15.f49213OooO0o0.setWebClientBridge(new oo000000(this));
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new oOOo0000(this, null), 3, null);
            LiveEventBus.get("refreshUniqueIDPage").observe(this, new o00000(this, i));
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onCreateOptionsMenu(menu);
        WebPageInfo webPageInfo = this.f22118Oooooo0;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        switch (OooO0O0.$EnumSwitchMapping$0[webPageInfo.f21216Oooo0o.ordinal()]) {
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
                this.f22117Oooooo = menu;
                break;
        }
        return true;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        e7 e7Var = this.f22115OooooOO;
        if (e7Var != null) {
            if (e7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7Var = null;
            }
            e7Var.f49213OooO0o0.OooO0OO();
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
        e7 e7Var = null;
        switch (item.getItemId()) {
            case R.id.item_web_action_browsers /* 2131297550 */:
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    WebPageInfo webPageInfo4 = this.f22118Oooooo0;
                    if (webPageInfo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    } else {
                        webPageInfo = webPageInfo4;
                    }
                    intent.setData(Uri.parse(o00000OO.OooO00o(webPageInfo.f21217Oooo0oO)));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(Intent.createChooser(intent, ""));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.item_web_action_refresh /* 2131297551 */:
                e7 e7Var2 = this.f22115OooooOO;
                if (e7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    e7Var = e7Var2;
                }
                e7Var.f49213OooO0o0.reload();
                break;
            case R.id.item_web_action_share /* 2131297552 */:
                o0O00o0 o0o00o1 = (o0O00o0) this.f22110OoooOoO.getValue();
                WebPageInfo webPageInfo5 = this.f22118Oooooo0;
                if (webPageInfo5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    webPageInfo5 = null;
                }
                if (webPageInfo5.f21216Oooo0o == WebFrom.MomentActivityBanner) {
                    z = true;
                } else {
                    WebPageInfo webPageInfo6 = this.f22118Oooooo0;
                    if (webPageInfo6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo6 = null;
                    }
                    if (webPageInfo6.f21216Oooo0o == WebFrom.RoomMainBanner) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                o0o00o1.f41670OoooOo0 = z;
                if (z) {
                    ShareModel shareModel = new ShareModel(ShareType.Web);
                    ShareWebModel shareWebModel = new ShareWebModel();
                    WebPageInfo webPageInfo7 = this.f22118Oooooo0;
                    if (webPageInfo7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo7 = null;
                    }
                    shareWebModel.setWebFrom(webPageInfo7.f21216Oooo0o);
                    WebPageInfo webPageInfo8 = this.f22118Oooooo0;
                    if (webPageInfo8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo8 = null;
                    }
                    shareWebModel.setTitle(webPageInfo8.f21215Oooo);
                    WebPageInfo webPageInfo9 = this.f22118Oooooo0;
                    if (webPageInfo9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo9 = null;
                    }
                    shareWebModel.setContent(webPageInfo9.f21228o000oOoO);
                    WebPageInfo webPageInfo10 = this.f22118Oooooo0;
                    if (webPageInfo10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo10 = null;
                    }
                    shareWebModel.setUrl(webPageInfo10.f21217Oooo0oO);
                    WebPageInfo webPageInfo11 = this.f22118Oooooo0;
                    if (webPageInfo11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo11 = null;
                    }
                    shareWebModel.setImagesUrl(webPageInfo11.f21223OoooOO0);
                    WebPageInfo webPageInfo12 = this.f22118Oooooo0;
                    if (webPageInfo12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo12 = null;
                    }
                    shareWebModel.setId((String) webPageInfo12.f21222OoooO0O.get("barId"));
                    WebPageInfo webPageInfo13 = this.f22118Oooooo0;
                    if (webPageInfo13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    } else {
                        webPageInfo2 = webPageInfo13;
                    }
                    shareWebModel.setIdx((String) webPageInfo2.f21222OoooO0O.get("barId"));
                    shareModel.setWeb(shareWebModel);
                    o0o00o1.f41672OoooOoo = shareModel;
                } else {
                    ShareModel shareModel2 = new ShareModel(ShareType.Room);
                    e7 e7Var3 = this.f22115OooooOO;
                    if (e7Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        e7Var3 = null;
                    }
                    String title2 = e7Var3.f49213OooO0o0.getTitle();
                    if (title2 == null || StringsKt.isBlank(title2)) {
                        WebPageInfo webPageInfo14 = this.f22118Oooooo0;
                        if (webPageInfo14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                            webPageInfo14 = null;
                        }
                        title = webPageInfo14.f21215Oooo;
                    } else {
                        e7 e7Var4 = this.f22115OooooOO;
                        if (e7Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            e7Var4 = null;
                        }
                        title = e7Var4.f49213OooO0o0.getTitle();
                    }
                    String str = title;
                    WebPageInfo webPageInfo15 = this.f22118Oooooo0;
                    if (webPageInfo15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo15 = null;
                    }
                    String str2 = webPageInfo15.f21228o000oOoO;
                    WebPageInfo webPageInfo16 = this.f22118Oooooo0;
                    if (webPageInfo16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo16 = null;
                    }
                    String strOooO00o = o00000OO.OooO00o(webPageInfo16.f21217Oooo0oO);
                    WebPageInfo webPageInfo17 = this.f22118Oooooo0;
                    if (webPageInfo17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo17 = null;
                    }
                    String str3 = webPageInfo17.f21223OoooOO0;
                    WebPageInfo webPageInfo18 = this.f22118Oooooo0;
                    if (webPageInfo18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo18 = null;
                    }
                    String str4 = (String) webPageInfo18.f21222OoooO0O.get("roomid");
                    WebPageInfo webPageInfo19 = this.f22118Oooooo0;
                    if (webPageInfo19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                        webPageInfo19 = null;
                    }
                    String str5 = (String) webPageInfo19.f21222OoooO0O.get("roomid");
                    WebPageInfo webPageInfo20 = this.f22118Oooooo0;
                    if (webPageInfo20 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                    } else {
                        webPageInfo3 = webPageInfo20;
                    }
                    shareModel2.setRoom(new RoomShareModel(str, str2, strOooO00o, str3, str4, str5, webPageInfo3.f21216Oooo0o.getValue()));
                    o0o00o1.f41672OoooOoo = shareModel2;
                }
                o0o00o1.OooOO0();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        WebPageInfo webPageInfo = this.f22118Oooooo0;
        WebPageInfo webPageInfo2 = null;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        if (webPageInfo.f21216Oooo0o == WebFrom.RoomMainBanner) {
            HashMap map = new HashMap();
            map.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, OooOoO());
            o0O00000.OooO0o("Room_banner_stay", map, (int) this.f11468OoooOOO);
        }
        WebPageInfo webPageInfo3 = this.f22118Oooooo0;
        if (webPageInfo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
        } else {
            webPageInfo2 = webPageInfo3;
        }
        if (webPageInfo2.f21216Oooo0o == WebFrom.ActivityNotice) {
            HashMap map2 = new HashMap();
            map2.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, OooOoO());
            o0O00000.OooO0o("InRoom_activity_stay", map2, (int) this.f11468OoooOOO);
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (menu.size() > 0) {
            MenuItem menuItemFindItem = menu.findItem(R.id.item_web_action_share);
            WebPageInfo webPageInfo = this.f22118Oooooo0;
            WebPageInfo webPageInfo2 = null;
            if (webPageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo = null;
            }
            menuItemFindItem.setVisible(webPageInfo.f21219OoooO != WebPageInfo.ShareType.NoShare);
            MenuItem menuItemFindItem2 = menu.findItem(R.id.item_web_action_browsers);
            WebPageInfo webPageInfo3 = this.f22118Oooooo0;
            if (webPageInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo2 = webPageInfo3;
            }
            menuItemFindItem2.setVisible(webPageInfo2.f21224OoooOOO);
        }
        return super.onPrepareOptionsMenu(menu);
    }
}
