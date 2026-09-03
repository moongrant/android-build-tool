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
    public List<Layer> f11812OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Map<String, List<Layer>> f11815OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, o000oOoO> f11816OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<p135o00OO0o0.o0Oo0oo> f11817OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Map<String, p135o00OO0o0.o00Ooo> f11818OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public p190o00o0O.Oooo000<p135o00OO0o0.oo000o> f11819OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public p190o00o0O.OooOOOO<Layer> f11820OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Rect f11821OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f11822OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f11823OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f11824OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f11825OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo f11813OooO00o = new o0ooOOo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet<String> f11814OooO0O0 = new HashSet<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f11826OooOOOO = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void OooO00o(String str) {
        o00OOO0.OooOO0.OooO0O0(str);
        this.f11814OooO0O0.add(str);
    }

    public final float OooO0O0() {
        return (long) (((this.f11823OooOO0o - this.f11822OooOO0O) / this.f11825OooOOO0) * 1000.0f);
    }

    @Nullable
    public final p135o00OO0o0.o0Oo0oo OooO0OO(String str) {
        int size = this.f11817OooO0o.size();
        for (int i = 0; i < size; i++) {
            p135o00OO0o0.o0Oo0oo o0oo0oo2 = this.f11817OooO0o.get(i);
            String str2 = o0oo0oo2.f37333OooO00o;
            boolean z = true;
            if (!str2.equalsIgnoreCase(str) && (!str2.endsWith("\r") || !str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                z = false;
            }
            if (z) {
                return o0oo0oo2;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f11812OooO.iterator();
        while (it.hasNext()) {
            sb.append(it.next().OooO00o("\t"));
        }
        return sb.toString();
    }
}
