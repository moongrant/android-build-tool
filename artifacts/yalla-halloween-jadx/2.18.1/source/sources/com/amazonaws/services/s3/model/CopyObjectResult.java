package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.SSEResultBase;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class CopyObjectResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult, Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10763Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public String f10764OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Date f10765OoooO00;

    @Override // com.amazonaws.services.s3.internal.S3VersionResult
    public final void OooO00o(String str) {
        this.f10764OoooO0 = str;
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
