package p387o0OOoo0o;

import com.google.gson.internal.LinkedTreeMap;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0oOO0 implements o0o0Oo {
    public static int OooO0O0(float f, int i, int i2) {
        int i3 = (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i4 = (i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i5 = (i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i6 = i & KotlinVersion.MAX_COMPONENT_VALUE;
        int i7 = (i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        int i8 = (i3 + ((int) ((i7 - i3) * f))) << 24;
        int i9 = (i4 + ((int) ((((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - i4) * f))) << 16;
        return i8 | i9 | ((i5 + ((int) ((((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & KotlinVersion.MAX_COMPONENT_VALUE) - i6))));
    }

    @Override // p387o0OOoo0o.o0o0Oo
    public Object OooO00o() {
        return new LinkedTreeMap();
    }
}
