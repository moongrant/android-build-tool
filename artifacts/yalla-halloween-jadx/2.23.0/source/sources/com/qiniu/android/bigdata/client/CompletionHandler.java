package com.qiniu.android.bigdata.client;

import com.qiniu.android.http.ResponseInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface CompletionHandler {
    void complete(ResponseInfo responseInfo, JSONObject jSONObject);
}
