package com.fasterxml.jackson.core;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class JsonLocation implements Serializable {
    public JsonLocation() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = (int) 0;
        return (1 ^ i) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        sb.append("UNKNOWN");
        sb.append("; line: 0, column: 0]");
        return sb.toString();
    }
}
