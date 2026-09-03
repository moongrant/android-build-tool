package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00OO extends o0OO0oO0 {
    @Override // com.google.android.gms.internal.measurement.o0OO0oO0
    public final void OooO00o() {
        if (!this.f15119OooO0oO) {
            for (int i = 0; i < OooO0O0(); i++) {
                Map.Entry entry = (Map.Entry) this.f15118OooO0o0.get(i);
                if (((zzkr) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : this.f15117OooO0o.isEmpty() ? o0OO0O0.f15108OooO0O0 : this.f15117OooO0o.entrySet()) {
                if (((zzkr) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.OooO00o();
    }
}
