package com.qiniu.android.dns.local;

import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.NetworkInfo;
import java.util.Hashtable;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class Hosts {
    private final Hashtable<String, LinkedList<Value>> hosts = new Hashtable<>();

    private LinkedList<Value> filter(LinkedList<Value> linkedList, NetworkInfo networkInfo) {
        LinkedList<Value> linkedList2 = new LinkedList<>();
        LinkedList<Value> linkedList3 = new LinkedList<>();
        for (Value value : linkedList) {
            if (value.provider == 0) {
                linkedList2.add(value);
            }
            int i = networkInfo.provider;
            if (i != 0 && value.provider == i) {
                linkedList3.add(value);
            }
        }
        return linkedList3.size() != 0 ? linkedList3 : linkedList2;
    }

    public synchronized Hosts put(String str, Value value) {
        LinkedList<Value> linkedList = this.hosts.get(str);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        linkedList.add(value);
        this.hosts.put(str, linkedList);
        return this;
    }

    public synchronized String[] query(Domain domain, NetworkInfo networkInfo) {
        LinkedList<Value> linkedList = this.hosts.get(domain.domain);
        if (linkedList != null && !linkedList.isEmpty()) {
            if (linkedList.size() > 1) {
                Value value = linkedList.get(0);
                linkedList.remove(0);
                linkedList.add(value);
            }
            return toIps(filter(linkedList, networkInfo));
        }
        return null;
    }

    public synchronized String[] toIps(LinkedList<Value> linkedList) {
        String[] strArr;
        int size = linkedList.size();
        strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = linkedList.get(i).ip;
        }
        return strArr;
    }

    public static class Value {
        public final String ip;
        public final int provider;

        public Value(String str, int i) {
            this.ip = str;
            this.provider = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return this.ip.equals(value.ip) && this.provider == value.provider;
        }

        public Value(String str) {
            this(str, 0);
        }
    }

    public Hosts put(String str, String str2) {
        put(str, new Value(str2));
        return this;
    }
}
