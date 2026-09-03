package com.amazonaws.mobileconnectors.s3.transferutility;

/* JADX INFO: loaded from: classes.dex */
public class TransferUtilityException extends Exception {
    public TransferUtilityException() {
    }

    public TransferUtilityException(String str) {
        super("TransferNetworkLossHandler is not created. Please call `TransferNetworkLossHandler.getInstance(Context)` to instantiate it before retrieving");
    }
}
