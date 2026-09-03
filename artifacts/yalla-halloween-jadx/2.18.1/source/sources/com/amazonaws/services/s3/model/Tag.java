package com.amazonaws.services.s3.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Tag implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public String f10939Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f10940Oooo0oO;

    public Tag(String str, String str2) {
        this.f10939Oooo0o = str;
        this.f10940Oooo0oO = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tag tag = (Tag) obj;
        String str = this.f10939Oooo0o;
        if (str == null ? tag.f10939Oooo0o != null : !str.equals(tag.f10939Oooo0o)) {
            return false;
        }
        String str2 = this.f10940Oooo0oO;
        String str3 = tag.f10940Oooo0oO;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    public final int hashCode() {
        String str = this.f10939Oooo0o;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f10940Oooo0oO;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
