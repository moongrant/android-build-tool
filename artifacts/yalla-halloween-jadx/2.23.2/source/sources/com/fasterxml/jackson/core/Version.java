package com.fasterxml.jackson.core;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Version implements Comparable<Version>, Serializable {
    public Version() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Version version) {
        Version version2 = version;
        if (version2 == this) {
            return 0;
        }
        version2.getClass();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return new StringBuilder("0.0.0").toString();
    }
}
