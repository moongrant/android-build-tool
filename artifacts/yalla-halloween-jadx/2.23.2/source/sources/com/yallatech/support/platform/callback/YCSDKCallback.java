package com.yallatech.support.platform.callback;

import com.qiniu.android.collect.ReportItem;
import com.yallatech.support.platform.base.BaseResp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yallatech/support/platform/callback/YCSDKCallback;", "", "Lcom/yallatech/support/platform/base/BaseResp;", ReportItem.QualityKeyResult, "", "onResult", "(Lcom/yallatech/support/platform/base/BaseResp;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface YCSDKCallback {
    void onResult(@NotNull BaseResp result);
}
