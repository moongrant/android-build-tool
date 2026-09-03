package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0oOO0 extends o0O0OOOo<Map.Entry<Object, Object>, Object> {
    public oo0oOO0(Iterator it) {
        super(it);
    }

    @Override // com.google.common.collect.o0O0OOOo
    public final Object OooO00o(Map.Entry<Object, Object> entry) {
        return entry.getValue();
    }
}
