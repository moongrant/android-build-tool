package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p129o00O0oOo.o000Oo0;
import p225o00oOOo.o00O0OO;
import p225o00oOOo.o00OO000;
import p225o00oOOo.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public List<Layer> f10040OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Map<String, List<Layer>> f10043OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, OooOo> f10044OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List<o00OO000> f10045OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Map<String, oo0o0O0> f10046OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public p021OooOooo.o0ooOOo<o00O0OO> f10047OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public p021OooOooo.o00Ooo<Layer> f10048OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Rect f10049OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f10050OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f10051OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f10052OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f10053OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Ooo f10041OooO00o = new o00Ooo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashSet<String> f10042OooO0O0 = new HashSet<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f10054OooOOOO = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void OooO00o(String str) {
        o000Oo0.OooO0OO(str);
        this.f10042OooO0O0.add(str);
    }

    public final float OooO0O0() {
        return (long) (((this.f10051OooOO0o - this.f10050OooOO0O) / this.f10053OooOOO0) * 1000.0f);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    @Nullable
    public final o00OO000 OooO0OO(String str) {
        int size = this.f10045OooO0o.size();
        for (int i = 0; i < size; i++) {
            o00OO000 o00oo001 = this.f10045OooO0o.get(i);
            boolean z = true;
            if (!o00oo001.f33867OooO00o.equalsIgnoreCase(str)) {
                if (o00oo001.f33867OooO00o.endsWith("\r")) {
                    String str2 = o00oo001.f33867OooO00o;
                    if (!str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                return o00oo001;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final Layer OooO0Oo(long j) {
        return this.f10048OooO0oo.OooO(j, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f10040OooO.iterator();
        while (it.hasNext()) {
            sb.append(it.next().OooO00o("\t"));
        }
        return sb.toString();
    }
}
