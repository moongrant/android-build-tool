package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000OO extends OooO0o<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f18947OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f18948OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o00000O.OooO0OO f18949OooO0oo;

    public o00000OO(o00000O.OooO0OO oooO0OO) {
        this.f18949OooO0oo = oooO0OO;
        this.f18948OooO0oO = oooO0OO.OooOOO().size();
    }

    @Override // com.google.common.collect.OooO0o
    @CheckForNull
    public final Map.Entry<Object, Object> OooO00o() {
        o00000O.OooO0OO oooO0OO;
        Object objOooOOO0;
        do {
            int i = this.f18947OooO0o + 1;
            this.f18947OooO0o = i;
            if (i >= this.f18948OooO0oO) {
                this.f18827OooO0Oo = OooO0o.OooO0O0.DONE;
                return null;
            }
            oooO0OO = this.f18949OooO0oo;
            objOooOOO0 = oooO0OO.OooOOO0(i);
        } while (objOooOOO0 == null);
        return new o000O0O0(oooO0OO.OooOO0o(this.f18947OooO0o), objOooOOO0);
    }
}
