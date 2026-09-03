package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.SSEResultBase;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class CompleteMultipartUploadResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, Serializable {
    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void OooO0Oo(String str) {
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void OooO0o0(Date date) {
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void OooO0oO(boolean z) {
    }
}
