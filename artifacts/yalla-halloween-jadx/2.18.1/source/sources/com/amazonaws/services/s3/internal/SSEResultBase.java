package com.amazonaws.services.s3.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class SSEResultBase implements ServerSideEncryptionResult {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10678Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f10679Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public String f10680Oooo0oo;

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO(String str) {
        this.f10680Oooo0oo = str;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO0OO(String str) {
        this.f10679Oooo0oO = str;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO0Oo(String str) {
        this.f10678Oooo0o = str;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String OooO0oO() {
        return this.f10678Oooo0o;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String OooOO0() {
        return this.f10680Oooo0oo;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String OooOOO0() {
        return this.f10679Oooo0oO;
    }
}
