package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;
import p123o00O0o0.o000oOoO;
import p123o00O0o0.o00O0O;
import p123o00O0o0.o0OoOo0;
import p125o00O0o0O.o000OOo;
import p125o00O0o0O.oo0o0Oo;
import p127o00O0oO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class Layer {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00O0O f10139OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o000OOo> f10140OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O f10141OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f10142OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f10143OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f10144OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LayerType f10145OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String f10146OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<Mask> f10147OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f10148OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f10149OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f10150OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float f10151OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f10152OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f10153OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f10154OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final o0OoOo0 f10155OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final o000oOoO f10156OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final p123o00O0o0.OooOO0O f10157OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public final o00000O0 f10158OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final MatteType f10159OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final List<p131o00O0oo0.o000OOo<Float>> f10160OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f10161OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public final oo0o0Oo f10162OooOo0o;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(List<o000OOo> list, OooOO0O oooOO0O, String str, long j, LayerType layerType, long j2, @Nullable String str2, List<Mask> list2, o00O0O o00o0o2, int i, int i2, int i3, float f, float f2, int i4, int i5, @Nullable o000oOoO o000oooo2, @Nullable o0OoOo0 o0oooo1, List<p131o00O0oo0.o000OOo<Float>> list3, MatteType matteType, @Nullable p123o00O0o0.OooOO0O oooOO0O2, boolean z, @Nullable oo0o0Oo oo0o0oo, @Nullable o00000O0 o00000o1) {
        this.f10140OooO00o = list;
        this.f10141OooO0O0 = oooOO0O;
        this.f10142OooO0OO = str;
        this.f10143OooO0Oo = j;
        this.f10145OooO0o0 = layerType;
        this.f10144OooO0o = j2;
        this.f10146OooO0oO = str2;
        this.f10147OooO0oo = list2;
        this.f10139OooO = o00o0o2;
        this.f10148OooOO0 = i;
        this.f10149OooOO0O = i2;
        this.f10150OooOO0o = i3;
        this.f10152OooOOO0 = f;
        this.f10151OooOOO = f2;
        this.f10153OooOOOO = i4;
        this.f10154OooOOOo = i5;
        this.f10156OooOOo0 = o000oooo2;
        this.f10155OooOOo = o0oooo1;
        this.f10160OooOo00 = list3;
        this.f10159OooOo0 = matteType;
        this.f10157OooOOoo = oooOO0O2;
        this.f10161OooOo0O = z;
        this.f10162OooOo0o = oo0o0oo;
        this.f10158OooOo = o00000o1;
    }

    public final String OooO00o(String str) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(str);
        sbOooO0o0.append(this.f10142OooO0OO);
        sbOooO0o0.append("\n");
        Layer layerOooO0Oo = this.f10141OooO0O0.OooO0Oo(this.f10144OooO0o);
        if (layerOooO0Oo != null) {
            sbOooO0o0.append("\t\tParents: ");
            sbOooO0o0.append(layerOooO0Oo.f10142OooO0OO);
            Layer layerOooO0Oo2 = this.f10141OooO0O0.OooO0Oo(layerOooO0Oo.f10144OooO0o);
            while (layerOooO0Oo2 != null) {
                sbOooO0o0.append("->");
                sbOooO0o0.append(layerOooO0Oo2.f10142OooO0OO);
                layerOooO0Oo2 = this.f10141OooO0O0.OooO0Oo(layerOooO0Oo2.f10144OooO0o);
            }
            sbOooO0o0.append(str);
            sbOooO0o0.append("\n");
        }
        if (!this.f10147OooO0oo.isEmpty()) {
            sbOooO0o0.append(str);
            sbOooO0o0.append("\tMasks: ");
            sbOooO0o0.append(this.f10147OooO0oo.size());
            sbOooO0o0.append("\n");
        }
        if (this.f10148OooOO0 != 0 && this.f10149OooOO0O != 0) {
            sbOooO0o0.append(str);
            sbOooO0o0.append("\tBackground: ");
            sbOooO0o0.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.f10148OooOO0), Integer.valueOf(this.f10149OooOO0O), Integer.valueOf(this.f10150OooOO0o)));
        }
        if (!this.f10140OooO00o.isEmpty()) {
            sbOooO0o0.append(str);
            sbOooO0o0.append("\tShapes:\n");
            for (o000OOo o000ooo2 : this.f10140OooO00o) {
                sbOooO0o0.append(str);
                sbOooO0o0.append("\t\t");
                sbOooO0o0.append(o000ooo2);
                sbOooO0o0.append("\n");
            }
        }
        return sbOooO0o0.toString();
    }

    public final String toString() {
        return OooO00o("");
    }
}
