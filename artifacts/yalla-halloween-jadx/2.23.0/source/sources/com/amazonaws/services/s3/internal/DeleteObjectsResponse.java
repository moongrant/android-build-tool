package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DeleteObjectsResponse implements S3RequesterChargedResult {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<DeleteObjectsResult.DeletedObject> f9307OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<MultiObjectDeleteException.DeleteError> f9308OooO0o0;

    public DeleteObjectsResponse() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f9307OooO0Oo = arrayList;
        this.f9308OooO0o0 = arrayList2;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void OooO0oO(boolean z) {
    }
}
