package org.slf4j.helpers;

import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public class BasicMarker implements Marker {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Marker)) {
            return false;
        }
        ((Marker) obj).getName();
        throw null;
    }

    @Override // org.slf4j.Marker
    public final void getName() {
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
