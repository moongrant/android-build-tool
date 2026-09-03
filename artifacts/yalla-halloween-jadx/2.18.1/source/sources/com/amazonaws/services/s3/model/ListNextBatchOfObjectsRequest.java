package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ListNextBatchOfObjectsRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ObjectListing f10829Oooo;

    public ListNextBatchOfObjectsRequest(ObjectListing objectListing) {
        if (objectListing == null) {
            throw new IllegalArgumentException("The parameter previousObjectListing must be specified.");
        }
        this.f10829Oooo = objectListing;
    }
}
