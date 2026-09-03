package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OOO extends o0O0OOOo<Map.Entry<Object, Object>, Object> {
    public o00O0OOO(Iterator it) {
        super(it);
    }

    @Override // com.google.common.collect.o0O0OOOo
    public final Object OooO00o(Map.Entry<Object, Object> entry) {
        return entry.getKey();
    }
}
