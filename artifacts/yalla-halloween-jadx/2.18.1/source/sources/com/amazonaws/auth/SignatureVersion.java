package com.amazonaws.auth;

import com.app.base.interfaceType.FeedbackType;

/* JADX INFO: loaded from: classes.dex */
public enum SignatureVersion {
    V1("1"),
    V2(FeedbackType.Suggestions);

    private String value;

    SignatureVersion(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
