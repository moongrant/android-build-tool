package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o00OOO0O<K0, V0> {

    public static final class OooO00o<V> implements com.google.common.base.o0O0O00<List<V>>, Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f19527OooO0Oo;

        public OooO00o(int i) {
            oo000o.OooO0O0(i, "expectedValuesPerKey");
            this.f19527OooO0Oo = i;
        }

        @Override // com.google.common.base.o0O0O00
        public final Object get() {
            return new ArrayList(this.f19527OooO0Oo);
        }
    }

    public static abstract class OooO0O0<K0, V0> extends o00OOO0O<K0, V0> {
    }

    public static abstract class OooO0OO<K0> {
        public final o0o0Oo OooO00o() {
            oo000o.OooO0O0(2, "expectedValuesPerKey");
            return new o0o0Oo(this);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> OooO0O0();
    }
}
