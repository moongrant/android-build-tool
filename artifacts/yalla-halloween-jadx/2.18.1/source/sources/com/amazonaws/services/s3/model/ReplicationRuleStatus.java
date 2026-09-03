package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
public enum ReplicationRuleStatus {
    Enabled("Enabled"),
    Disabled("Disabled");

    private final String status;

    ReplicationRuleStatus(String str) {
        this.status = str;
    }
}
