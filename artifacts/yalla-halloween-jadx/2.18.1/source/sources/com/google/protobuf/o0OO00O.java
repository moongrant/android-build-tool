package com.google.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O extends oo0o0Oo<OooOo.OooO0O0<Object>, Object> {
    public o0OO00O(int i) {
        super(i);
    }

    @Override // com.google.protobuf.oo0o0Oo
    public final void OooO0oo() {
        if (!this.f19406Oooo) {
            for (int i = 0; i < OooO0Oo(); i++) {
                Map.Entry<OooOo.OooO0O0<Object>, Object> entryOooO0OO = OooO0OO(i);
                if (entryOooO0OO.getKey().isRepeated()) {
                    entryOooO0OO.setValue(Collections.unmodifiableList((List) entryOooO0OO.getValue()));
                }
            }
            for (Map.Entry<OooOo.OooO0O0<Object>, Object> entry : OooO0o0()) {
                if (entry.getKey().isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.OooO0oo();
    }

    @Override // com.google.protobuf.oo0o0Oo, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((OooOo.OooO0O0) obj, obj2);
    }
}
