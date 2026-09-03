package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class ListNextBatchOfVersionsRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public VersionListing f10830Oooo;

    public ListNextBatchOfVersionsRequest(VersionListing versionListing) {
        if (versionListing == null) {
            throw new IllegalArgumentException("The parameter previousVersionListing must be specified.");
        }
        this.f10830Oooo = versionListing;
    }
}
