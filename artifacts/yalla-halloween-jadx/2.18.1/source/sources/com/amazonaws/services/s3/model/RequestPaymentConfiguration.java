package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
public class RequestPaymentConfiguration {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Payer f10888OooO00o;

    public enum Payer {
        Requester,
        BucketOwner
    }

    public RequestPaymentConfiguration(Payer payer) {
        this.f10888OooO00o = payer;
    }
}
