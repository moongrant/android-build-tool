package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<Layer> f8722OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Map<String, List<Layer>> f8725OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, o000oOoO> f8726OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<oOO00O.OooOO0O> f8727OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Map<String, oOO00O.OooO0O0> f8728OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public p188o00o0O.Oooo0<oOO00O.OooO0OO> f8729OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public p188o00o0O.OooOo00<Layer> f8730OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Rect f8731OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f8732OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f8733OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f8734OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f8735OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo f8723OooO00o = new o0ooOOo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet<String> f8724OooO0O0 = new HashSet<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f8736OooOOOO = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void OooO00o(String str) {
        o00O0.OooOO0.OooO0O0(str);
        this.f8724OooO0O0.add(str);
    }

    public final float OooO0O0() {
        return (long) (((this.f8733OooOO0o - this.f8732OooOO0O) / this.f8735OooOOO0) * 1000.0f);
    }

    @Nullable
    public final oOO00O.OooOO0O OooO0OO(String str) {
        int size = this.f8727OooO0o.size();
        for (int i = 0; i < size; i++) {
            oOO00O.OooOO0O oooOO0O = this.f8727OooO0o.get(i);
            String str2 = oooOO0O.f60846OooO00o;
            boolean z = true;
            if (!str2.equalsIgnoreCase(str) && (!str2.endsWith("\r") || !str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                z = false;
            }
            if (z) {
                return oooOO0O;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f8722OooO.iterator();
        while (it.hasNext()) {
            sb.append(it.next().OooO00o("\t"));
        }
        return sb.toString();
    }
}
