package androidx.camera.core.impl.utils;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import p031OoooO0.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements Enumeration<Map<String, o00Oo0>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Enumeration<Map<String, o00Oo0>> f3801OooO0Oo;

    public OooO00o(ExifData.OooO0O0 oooO0O0) {
        this.f3801OooO0Oo = Collections.enumeration(oooO0O0.f3797OooO00o);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f3801OooO0Oo.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Map<String, o00Oo0> nextElement() {
        return new HashMap(this.f3801OooO0Oo.nextElement());
    }
}
