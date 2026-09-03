package com.qiniu.android.dns;

/* JADX INFO: loaded from: classes3.dex */
public final class Record {
    public static final int TTL_MIN_SECONDS = 600;
    public static final int TYPE_A = 1;
    public static final int TYPE_CNAME = 5;
    public final Source source;
    public final long timeStamp;
    public final int ttl;
    public final int type;
    public final String value;

    public enum Source {
        Unknown,
        DnspodFree,
        DnspodEnterprise,
        System
    }

    public Record(String str, int i, int i2, long j, Source source) {
        this.value = str;
        this.type = i;
        this.ttl = i2 < 600 ? 600 : i2;
        this.timeStamp = j;
        this.source = source;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Record)) {
            return false;
        }
        Record record = (Record) obj;
        return this.value.equals(record.value) && this.type == record.type && this.ttl == record.ttl && this.timeStamp == record.timeStamp;
    }

    public boolean isA() {
        return this.type == 1;
    }

    public boolean isCname() {
        return this.type == 5;
    }

    public boolean isExpired() {
        return isExpired(System.currentTimeMillis() / 1000);
    }

    public boolean isExpired(long j) {
        return this.timeStamp + ((long) this.ttl) < j;
    }
}
