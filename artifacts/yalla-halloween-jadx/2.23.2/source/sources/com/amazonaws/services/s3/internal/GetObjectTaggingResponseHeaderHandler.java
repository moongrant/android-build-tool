package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.GetObjectTaggingResult;

/* JADX INFO: loaded from: classes2.dex */
public class GetObjectTaggingResponseHeaderHandler implements HeaderHandler<GetObjectTaggingResult> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final void OooO00o(GetObjectTaggingResult getObjectTaggingResult, HttpResponse httpResponse) {
        httpResponse.f12183OooO0Oo.get("x-amz-version-id");
    }
}
