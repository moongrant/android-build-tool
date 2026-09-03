package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractSSEHandler extends AbstractHandler implements ServerSideEncryptionResult {
    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultOooOOO0 = OooOOO0();
        if (serverSideEncryptionResultOooOOO0 != null) {
            serverSideEncryptionResultOooOOO0.OooO(str);
        }
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO0O0(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultOooOOO0 = OooOOO0();
        if (serverSideEncryptionResultOooOOO0 != null) {
            serverSideEncryptionResultOooOOO0.OooO0O0(str);
        }
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO0o(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultOooOOO0 = OooOOO0();
        if (serverSideEncryptionResultOooOOO0 != null) {
            serverSideEncryptionResultOooOOO0.OooO0o(str);
        }
    }

    public abstract ServerSideEncryptionResult OooOOO0();
}
