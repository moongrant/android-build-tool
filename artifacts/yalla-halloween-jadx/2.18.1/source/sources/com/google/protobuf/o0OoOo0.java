package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 extends o00O0O {

    public static class OooO0O0<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Map.Entry<K, o0OoOo0> f19403Oooo0o;

        public OooO0O0(Map.Entry entry, OooO00o oooO00o) {
            this.f19403Oooo0o = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f19403Oooo0o.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            o0OoOo0 value = this.f19403Oooo0o.getValue();
            if (value == null) {
                return null;
            }
            return value.OooO00o();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof oo000o)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            o0OoOo0 value = this.f19403Oooo0o.getValue();
            oo000o oo000oVar = value.f19397OooO00o;
            value.f19397OooO00o = (oo000o) obj;
            return oo000oVar;
        }
    }

    public static class OooO0OO<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f19404Oooo0o;

        public OooO0OO(Iterator<Map.Entry<K, Object>> it) {
            this.f19404Oooo0o = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19404Oooo0o.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f19404Oooo0o.next();
            return next.getValue() instanceof o0OoOo0 ? new OooO0O0(next, null) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f19404Oooo0o.remove();
        }
    }

    public final oo000o OooO00o() {
        if (this.f19397OooO00o == null) {
            synchronized (this) {
                if (this.f19397OooO00o == null) {
                    try {
                        this.f19397OooO00o = null;
                        ByteString.OooO0o oooO0o = ByteString.f19322Oooo0oO;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f19397OooO00o = null;
                        ByteString.OooO0o oooO0o2 = ByteString.f19322Oooo0oO;
                    }
                }
            }
        }
        return this.f19397OooO00o;
    }

    public final boolean equals(Object obj) {
        return OooO00o().equals(obj);
    }

    public final int hashCode() {
        return OooO00o().hashCode();
    }

    public final String toString() {
        return OooO00o().toString();
    }
}
