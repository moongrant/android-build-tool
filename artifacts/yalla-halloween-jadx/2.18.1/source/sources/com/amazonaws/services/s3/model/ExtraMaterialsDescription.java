package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ExtraMaterialsDescription implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Map<String, String> f10785Oooo0o;

    public enum ConflictResolution {
        FAIL_FAST,
        OVERRIDE,
        OVERRIDDEN
    }

    static {
        new ExtraMaterialsDescription(Collections.EMPTY_MAP);
    }

    public ExtraMaterialsDescription(Map<String, String> map) {
        ConflictResolution conflictResolution = ConflictResolution.FAIL_FAST;
        if (map == null || conflictResolution == null) {
            throw new IllegalArgumentException();
        }
        this.f10785Oooo0o = Collections.unmodifiableMap(new HashMap(map));
    }
}
