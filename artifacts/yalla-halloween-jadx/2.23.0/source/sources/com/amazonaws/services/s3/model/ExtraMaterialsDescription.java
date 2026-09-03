package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ExtraMaterialsDescription implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, String> f9390OooO0Oo;

    public enum ConflictResolution {
        FAIL_FAST,
        OVERRIDE,
        OVERRIDDEN
    }

    static {
        new ExtraMaterialsDescription(Collections.EMPTY_MAP);
    }

    public ExtraMaterialsDescription() {
        throw null;
    }

    public ExtraMaterialsDescription(Map<String, String> map) {
        ConflictResolution conflictResolution = ConflictResolution.FAIL_FAST;
        if (map == null || conflictResolution == null) {
            throw new IllegalArgumentException();
        }
        this.f9390OooO0Oo = Collections.unmodifiableMap(new HashMap(map));
    }
}
