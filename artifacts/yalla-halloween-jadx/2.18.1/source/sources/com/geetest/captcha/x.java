package com.geetest.captcha;

import com.facebook.internal.AnalyticsEvents;
import com.qiniu.android.collect.ReportItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J \u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0007H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0007H&¨\u0006\u0013"}, d2 = {"Lcom/geetest/captcha/observer/WebViewObserver;", "", "onCallReady", "", "onClose", "onError", "errorCode", "", "errorMsg", "errorDesc", "Lorg/json/JSONObject;", "onResult", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "", ReportItem.QualityKeyResult, "onWebError", "error", "onWebFailure", "fail", "captcha_release"}, k = 1, mv = {1, 1, 16})
public interface x {
    void a();

    void a(@NotNull String str);

    void a(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject);

    void a(boolean z, @NotNull String str);

    void b();
}
