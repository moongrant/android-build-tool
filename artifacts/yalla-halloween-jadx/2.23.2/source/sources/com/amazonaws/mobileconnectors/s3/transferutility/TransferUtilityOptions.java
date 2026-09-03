package com.amazonaws.mobileconnectors.s3.transferutility;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class TransferUtilityOptions implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TransferNetworkConnectionType f12301OooO0Oo;

    public TransferUtilityOptions() {
        Runtime.getRuntime().availableProcessors();
        this.f12301OooO0Oo = TransferNetworkConnectionType.ANY;
    }
}
