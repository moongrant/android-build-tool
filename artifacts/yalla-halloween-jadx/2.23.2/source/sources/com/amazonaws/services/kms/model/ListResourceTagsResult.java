package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ListResourceTagsResult implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList f12385OooO0Oo = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListResourceTagsResult)) {
            return false;
        }
        ArrayList arrayList = ((ListResourceTagsResult) obj).f12385OooO0Oo;
        boolean z = arrayList == null;
        ArrayList arrayList2 = this.f12385OooO0Oo;
        if (z ^ (arrayList2 == null)) {
            return false;
        }
        return arrayList == null || arrayList.equals(arrayList2);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f12385OooO0Oo;
        return (((((arrayList == null ? 0 : arrayList.hashCode()) + 31) * 31) + 0) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        ArrayList arrayList = this.f12385OooO0Oo;
        if (arrayList != null) {
            sb.append("Tags: " + arrayList + ",");
        }
        sb.append("}");
        return sb.toString();
    }
}
