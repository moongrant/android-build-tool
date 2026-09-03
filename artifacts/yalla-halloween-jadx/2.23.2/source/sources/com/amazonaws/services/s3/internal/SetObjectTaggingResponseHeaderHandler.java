package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.SetObjectTaggingResult;

/* JADX INFO: loaded from: classes2.dex */
public class SetObjectTaggingResponseHeaderHandler implements HeaderHandler<SetObjectTaggingResult> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final void OooO00o(SetObjectTaggingResult setObjectTaggingResult, HttpResponse httpResponse) {
        httpResponse.f12183OooO0Oo.get("x-amz-version-id");
    }
}
