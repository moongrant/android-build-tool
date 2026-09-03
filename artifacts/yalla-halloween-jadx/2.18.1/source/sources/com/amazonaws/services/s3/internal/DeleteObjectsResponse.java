package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DeleteObjectsResponse implements S3RequesterChargedResult {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<DeleteObjectsResult.DeletedObject> f10639Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<MultiObjectDeleteException.DeleteError> f10640Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f10641Oooo0oo;

    public DeleteObjectsResponse() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f10639Oooo0o = arrayList;
        this.f10640Oooo0oO = arrayList2;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void OooO0o(boolean z) {
        this.f10641Oooo0oo = z;
    }
}
