package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.model.content.Mask;
import java.util.List;
import java.util.Locale;
import o00O00OO.OooOOOO;
import o00O00OO.OooOo;
import o00O00OO.OooOo00;
import p039OoooOoo.o00OO;
import p113o00O00Oo.o000oOoO;
import p113o00O00Oo.o00O0O;
import p115o00O00oO.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class Layer {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOo f8818OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o00O0O> f8819OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f8820OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f8821OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f8822OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f8823OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LayerType f8824OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String f8825OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final List<Mask> f8826OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f8827OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f8828OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f8829OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float f8830OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final float f8831OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f8832OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f8833OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final OooOo00 f8834OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public final OooOOOO f8835OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public final o00O00OO.OooO0O0 f8836OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @Nullable
    public final o0000Ooo f8837OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final MatteType f8838OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final List<o00O0O00.OooO00o<Float>> f8839OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f8840OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public final o000oOoO f8841OooOo0o;

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

    public Layer(List<o00O0O> list, OooOO0 oooOO1, String str, long j, LayerType layerType, long j2, @Nullable String str2, List<Mask> list2, OooOo oooOo, int i, int i2, int i3, float f, float f2, int i4, int i5, @Nullable OooOOOO oooOOOO, @Nullable OooOo00 oooOo00, List<o00O0O00.OooO00o<Float>> list3, MatteType matteType, @Nullable o00O00OO.OooO0O0 oooO0O0, boolean z, @Nullable o000oOoO o000oooo2, @Nullable o0000Ooo o0000ooo) {
        this.f8819OooO00o = list;
        this.f8820OooO0O0 = oooOO1;
        this.f8821OooO0OO = str;
        this.f8822OooO0Oo = j;
        this.f8824OooO0o0 = layerType;
        this.f8823OooO0o = j2;
        this.f8825OooO0oO = str2;
        this.f8826OooO0oo = list2;
        this.f8818OooO = oooOo;
        this.f8827OooOO0 = i;
        this.f8828OooOO0O = i2;
        this.f8829OooOO0o = i3;
        this.f8831OooOOO0 = f;
        this.f8830OooOOO = f2;
        this.f8832OooOOOO = i4;
        this.f8833OooOOOo = i5;
        this.f8835OooOOo0 = oooOOOO;
        this.f8834OooOOo = oooOo00;
        this.f8839OooOo00 = list3;
        this.f8838OooOo0 = matteType;
        this.f8836OooOOoo = oooO0O0;
        this.f8840OooOo0O = z;
        this.f8841OooOo0o = o000oooo2;
        this.f8837OooOo = o0000ooo;
    }

    public final String OooO00o(String str) {
        int i;
        StringBuilder sbOooO00o = o00OO.OooO00o(str);
        sbOooO00o.append(this.f8821OooO0OO);
        sbOooO00o.append("\n");
        OooOO0 oooOO1 = this.f8820OooO0O0;
        Layer layer = (Layer) oooOO1.f8730OooO0oo.OooO0oO(this.f8823OooO0o, null);
        if (layer != null) {
            sbOooO00o.append("\t\tParents: ");
            sbOooO00o.append(layer.f8821OooO0OO);
            for (Layer layer2 = (Layer) oooOO1.f8730OooO0oo.OooO0oO(layer.f8823OooO0o, null); layer2 != null; layer2 = (Layer) oooOO1.f8730OooO0oo.OooO0oO(layer2.f8823OooO0o, null)) {
                sbOooO00o.append("->");
                sbOooO00o.append(layer2.f8821OooO0OO);
            }
            sbOooO00o.append(str);
            sbOooO00o.append("\n");
        }
        List<Mask> list = this.f8826OooO0oo;
        if (!list.isEmpty()) {
            sbOooO00o.append(str);
            sbOooO00o.append("\tMasks: ");
            sbOooO00o.append(list.size());
            sbOooO00o.append("\n");
        }
        int i2 = this.f8827OooOO0;
        if (i2 != 0 && (i = this.f8828OooOO0O) != 0) {
            sbOooO00o.append(str);
            sbOooO00o.append("\tBackground: ");
            sbOooO00o.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f8829OooOO0o)));
        }
        List<o00O0O> list2 = this.f8819OooO00o;
        if (!list2.isEmpty()) {
            sbOooO00o.append(str);
            sbOooO00o.append("\tShapes:\n");
            for (o00O0O o00o0o2 : list2) {
                sbOooO00o.append(str);
                sbOooO00o.append("\t\t");
                sbOooO00o.append(o00o0o2);
                sbOooO00o.append("\n");
            }
        }
        return sbOooO00o.toString();
    }

    public final String toString() {
        return OooO00o("");
    }
}
