package com.google.firebase.perf.util;

/* JADX INFO: loaded from: classes3.dex */
public enum StorageUnit {
    TERABYTES { // from class: com.google.firebase.perf.util.StorageUnit.OooO00o
    },
    GIGABYTES { // from class: com.google.firebase.perf.util.StorageUnit.OooO0O0
    },
    MEGABYTES { // from class: com.google.firebase.perf.util.StorageUnit.OooO0OO
    },
    KILOBYTES { // from class: com.google.firebase.perf.util.StorageUnit.OooO0o
    },
    BYTES { // from class: com.google.firebase.perf.util.StorageUnit.OooO
    };

    long numBytes;

    StorageUnit() {
        throw null;
    }

    StorageUnit(long j) {
        this.numBytes = j;
    }

    public final long OooO00o(long j) {
        return (j * this.numBytes) / KILOBYTES.numBytes;
    }
}
