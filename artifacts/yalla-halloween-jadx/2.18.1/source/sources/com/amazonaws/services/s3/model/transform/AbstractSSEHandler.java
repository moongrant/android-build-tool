package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSSEHandler extends AbstractHandler implements ServerSideEncryptionResult {
    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultOooOOOo = OooOOOo();
        if (serverSideEncryptionResultOooOOOo != null) {
            serverSideEncryptionResultOooOOOo.OooO(str);
        }
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO0OO(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultOooOOOo = OooOOOo();
        if (serverSideEncryptionResultOooOOOo != null) {
            serverSideEncryptionResultOooOOOo.OooO0OO(str);
        }
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO0Oo(String str) {
        ServerSideEncryptionResult serverSideEncryptionResultOooOOOo = OooOOOo();
        if (serverSideEncryptionResultOooOOOo != null) {
            serverSideEncryptionResultOooOOOo.OooO0Oo(str);
        }
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public String OooO0oO() {
        ServerSideEncryptionResult serverSideEncryptionResultOooOOOo = OooOOOo();
        if (serverSideEncryptionResultOooOOOo == null) {
            return null;
        }
        return serverSideEncryptionResultOooOOOo.OooO0oO();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public String OooOO0() {
        ServerSideEncryptionResult serverSideEncryptionResultOooOOOo = OooOOOo();
        if (serverSideEncryptionResultOooOOOo == null) {
            return null;
        }
        return serverSideEncryptionResultOooOOOo.OooOO0();
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public String OooOOO0() {
        ServerSideEncryptionResult serverSideEncryptionResultOooOOOo = OooOOOo();
        if (serverSideEncryptionResultOooOOOo == null) {
            return null;
        }
        return serverSideEncryptionResultOooOOOo.OooOOO0();
    }

    public abstract ServerSideEncryptionResult OooOOOo();
}
