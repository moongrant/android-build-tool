package com.yalla.yalla.common.manager.googlepay;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.facebook.appevents.AppEventsLogger;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.model.RechargeMenuType;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p141o00OOoo.OooO;
import p168o00Ooo0.o0O0O00;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002J,\u0010\u0011\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002J/\u0010\u0012\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00132\b\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0002\u0010\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/PayLogUpload;", "", "()V", "appEventsLogger", "Lcom/facebook/appevents/AppEventsLogger;", "getAppEventsLogger", "()Lcom/facebook/appevents/AppEventsLogger;", "appEventsLogger$delegate", "Lkotlin/Lazy;", "appsFlyerLog", "", "amount", "", "sku", "list", "", "Lcom/yalla/yalla/common/model/RechargeMenuType;", "fbLogger", "onAppEventsLogger", "", "(Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PayLogUpload {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: appEventsLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy appEventsLogger = LazyKt.lazy(new Function0<AppEventsLogger>() { // from class: com.yalla.yalla.common.manager.googlepay.PayLogUpload$appEventsLogger$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final AppEventsLogger invoke() {
            AppEventsLogger.Companion companion = AppEventsLogger.INSTANCE;
            Context context = o0000O.f2657OooO00o;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                context = null;
            }
            return companion.newLogger(context);
        }
    });

    /* JADX WARN: Code duplicated, block: B:12:0x0013  */
    private final void appsFlyerLog(String amount, String sku, List<RechargeMenuType> list) {
        boolean z;
        if (sku == null) {
            return;
        }
        if (amount != null) {
            try {
                if (StringsKt.isBlank(amount)) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else {
            z = true;
        }
        if (z) {
            if (list != null) {
                for (RechargeMenuType rechargeMenuType : list) {
                    if (sku == rechargeMenuType.getSku()) {
                        HashMap map = new HashMap();
                        map.put(AFInAppEventParameterName.REVENUE, Double.valueOf(rechargeMenuType.getAmount()));
                        map.put(AFInAppEventParameterName.CONTENT_TYPE, "category_a");
                        map.put(AFInAppEventParameterName.CONTENT_ID, rechargeMenuType.getSku());
                        map.put(AFInAppEventParameterName.CURRENCY, "USD");
                        OooO.OooO00o(AFInAppEventType.PURCHASE, map);
                    }
                }
                return;
            }
            return;
        }
        o00O00.OooO0O0("GooglePlayPay amount =" + amount + "===" + o0O0O00.OooOO0O(amount) + "===" + sku);
        HashMap map2 = new HashMap();
        map2.put(AFInAppEventParameterName.REVENUE, Double.valueOf(o0O0O00.OooOO0O(amount)));
        map2.put(AFInAppEventParameterName.CONTENT_TYPE, "category_a");
        map2.put(AFInAppEventParameterName.CONTENT_ID, sku);
        map2.put(AFInAppEventParameterName.CURRENCY, "USD");
        OooO.OooO00o(AFInAppEventType.PURCHASE, map2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    private final void fbLogger(String amount, String sku, List<RechargeMenuType> list) {
        boolean z;
        if (sku == null) {
            return;
        }
        if (amount != null) {
            try {
                if (StringsKt.isBlank(amount)) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else {
            z = true;
        }
        if (!z) {
            getAppEventsLogger().logPurchase(BigDecimal.valueOf(o0O0O00.OooOO0O(amount)), Currency.getInstance("USD"));
            return;
        }
        if (list != null) {
            for (RechargeMenuType rechargeMenuType : list) {
                if (sku == rechargeMenuType.getSku()) {
                    getAppEventsLogger().logPurchase(BigDecimal.valueOf(rechargeMenuType.getAmount()), Currency.getInstance("USD"));
                }
            }
        }
    }

    private final AppEventsLogger getAppEventsLogger() {
        return (AppEventsLogger) this.appEventsLogger.getValue();
    }

    public final void onAppEventsLogger(@Nullable Double amount, @Nullable String sku, @Nullable List<RechargeMenuType> list) {
        String string;
        String str = "";
        String str2 = null;
        if (amount != null) {
            Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
            try {
                string = amount.toString();
                if (string == null) {
                    string = "";
                }
            } catch (Exception unused) {
            }
        } else {
            string = null;
        }
        fbLogger(string, sku, list);
        if (amount != null) {
            Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
            try {
                String string2 = amount.toString();
                if (string2 != null) {
                    str = string2;
                }
            } catch (Exception unused2) {
            }
            str2 = str;
        }
        appsFlyerLog(str2, sku, list);
    }
}
