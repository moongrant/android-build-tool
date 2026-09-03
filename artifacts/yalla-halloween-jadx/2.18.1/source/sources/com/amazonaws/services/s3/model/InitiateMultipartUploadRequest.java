package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class InitiateMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f10818Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public SSEAwsKeyManagementParams f10819OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ObjectMetadata f10820OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f10821OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public CannedAccessControlList f10822OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ObjectTagging f10823OoooOO0;

    public InitiateMultipartUploadRequest(String str, String str2) {
        this.f10818Oooo = str;
        this.f10821OoooO00 = str2;
    }
}
