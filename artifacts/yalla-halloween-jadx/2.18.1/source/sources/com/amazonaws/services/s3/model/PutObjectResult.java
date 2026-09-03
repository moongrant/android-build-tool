package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.SSEResultBase;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class PutObjectResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {
    @Override // com.amazonaws.services.s3.internal.S3VersionResult
    public final void OooO00o(String str) {
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void OooO0o(boolean z) {
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void OooOO0o(String str) {
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void OooOOO(Date date) {
    }
}
