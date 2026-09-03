package com.amazonaws.mobileconnectors.s3.transferutility;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class TransferUtilityOptions implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TransferNetworkConnectionType f10531Oooo0o;

    public TransferUtilityOptions() {
        Runtime.getRuntime().availableProcessors();
        this.f10531Oooo0o = TransferNetworkConnectionType.ANY;
    }
}
