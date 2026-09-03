package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class SSEAwsKeyManagementParams implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f10911Oooo0o;

    public SSEAwsKeyManagementParams() {
        this.f10911Oooo0o = null;
    }

    public SSEAwsKeyManagementParams(String str) {
        if (str != null && !str.trim().isEmpty()) {
            this.f10911Oooo0o = str;
            return;
        }
        throw new IllegalArgumentException("AWS Key Management System Key id cannot be null");
    }
}
