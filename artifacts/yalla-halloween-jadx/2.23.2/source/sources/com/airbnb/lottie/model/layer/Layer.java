package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;
import o00OO.OooOOOO;
import p039OoooOoo.o0o0Oo;
import p134o00OO0o.o000000;
import p134o00OO0o.o000000O;
import p134o00OO0o.o000OOo;
import p134o00OO0o.oo000o;
import p136o00OO0oO.OooO;
import p136o00OO0oO.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class Layer {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000000O f11908OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooO> f11909OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f11910OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f11911OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f11912OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f11913OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LayerType f11914OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String f11915OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<Mask> f11916OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f11917OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f11918OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f11919OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float f11920OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f11921OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f11922OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f11923OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final o000000 f11924OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final o000OOo f11925OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final oo000o f11926OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public final OooOOOO f11927OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final MatteType f11928OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final List<o00OOO0O.OooO00o<Float>> f11929OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f11930OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public final OooO0OO f11931OooOo0o;

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

    public Layer(List<OooO> list, OooOO0 oooOO1, String str, long j, LayerType layerType, long j2, @Nullable String str2, List<Mask> list2, o000000O o000000o2, int i, int i2, int i3, float f, float f2, int i4, int i5, @Nullable o000OOo o000ooo2, @Nullable o000000 o000000Var, List<o00OOO0O.OooO00o<Float>> list3, MatteType matteType, @Nullable oo000o oo000oVar, boolean z, @Nullable OooO0OO oooO0OO, @Nullable OooOOOO oooOOOO) {
        this.f11909OooO00o = list;
        this.f11910OooO0O0 = oooOO1;
        this.f11911OooO0OO = str;
        this.f11912OooO0Oo = j;
        this.f11914OooO0o0 = layerType;
        this.f11913OooO0o = j2;
        this.f11915OooO0oO = str2;
        this.f11916OooO0oo = list2;
        this.f11908OooO = o000000o2;
        this.f11917OooOO0 = i;
        this.f11918OooOO0O = i2;
        this.f11919OooOO0o = i3;
        this.f11921OooOOO0 = f;
        this.f11920OooOOO = f2;
        this.f11922OooOOOO = i4;
        this.f11923OooOOOo = i5;
        this.f11925OooOOo0 = o000ooo2;
        this.f11924OooOOo = o000000Var;
        this.f11929OooOo00 = list3;
        this.f11928OooOo0 = matteType;
        this.f11926OooOOoo = oo000oVar;
        this.f11930OooOo0O = z;
        this.f11931OooOo0o = oooO0OO;
        this.f11927OooOo = oooOOOO;
    }

    public final String OooO00o(String str) {
        int i;
        StringBuilder sbOooO00o = o0o0Oo.OooO00o(str);
        sbOooO00o.append(this.f11911OooO0OO);
        sbOooO00o.append("\n");
        OooOO0 oooOO1 = this.f11910OooO0O0;
        Layer layer = (Layer) oooOO1.f11820OooO0oo.OooO0oO(this.f11913OooO0o, null);
        if (layer != null) {
            sbOooO00o.append("\t\tParents: ");
            sbOooO00o.append(layer.f11911OooO0OO);
            for (Layer layer2 = (Layer) oooOO1.f11820OooO0oo.OooO0oO(layer.f11913OooO0o, null); layer2 != null; layer2 = (Layer) oooOO1.f11820OooO0oo.OooO0oO(layer2.f11913OooO0o, null)) {
                sbOooO00o.append("->");
                sbOooO00o.append(layer2.f11911OooO0OO);
            }
            sbOooO00o.append(str);
            sbOooO00o.append("\n");
        }
        List<Mask> list = this.f11916OooO0oo;
        if (!list.isEmpty()) {
            sbOooO00o.append(str);
            sbOooO00o.append("\tMasks: ");
            sbOooO00o.append(list.size());
            sbOooO00o.append("\n");
        }
        int i2 = this.f11917OooOO0;
        if (i2 != 0 && (i = this.f11918OooOO0O) != 0) {
            sbOooO00o.append(str);
            sbOooO00o.append("\tBackground: ");
            sbOooO00o.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f11919OooOO0o)));
        }
        List<OooO> list2 = this.f11909OooO00o;
        if (!list2.isEmpty()) {
            sbOooO00o.append(str);
            sbOooO00o.append("\tShapes:\n");
            for (OooO oooO : list2) {
                sbOooO00o.append(str);
                sbOooO00o.append("\t\t");
                sbOooO00o.append(oooO);
                sbOooO00o.append("\n");
            }
        }
        return sbOooO00o.toString();
    }

    public final String toString() {
        return OooO00o("");
    }
}
