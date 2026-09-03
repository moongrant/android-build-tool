package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import o00OO0.OooO0OO;
import o00OO0.o00Oo0;
import p134o00OO0o.o00Ooo;
import p134o00OO0o.o0ooOOo;
import p134o00OO0o.oo000o;
import p136o00OO0oO.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class ShapeStroke implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f11891OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f11892OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final oo000o f11893OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<oo000o> f11894OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Ooo f11895OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo000o f11896OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0ooOOo f11897OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LineCapType f11898OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final LineJoinType f11899OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f11900OooOO0;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f11901OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f11902OooO0O0;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f11902OooO0O0 = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11902OooO0O0[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11902OooO0O0[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f11901OooO00o = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11901OooO00o[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11901OooO00o[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @Nullable oo000o oo000oVar, ArrayList arrayList, o00Ooo o00ooo2, o0ooOOo o0ooooo, oo000o oo000oVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.f11892OooO00o = str;
        this.f11893OooO0O0 = oo000oVar;
        this.f11894OooO0OO = arrayList;
        this.f11895OooO0Oo = o00ooo2;
        this.f11897OooO0o0 = o0ooooo;
        this.f11896OooO0o = oo000oVar2;
        this.f11898OooO0oO = lineCapType;
        this.f11899OooO0oo = lineJoinType;
        this.f11891OooO = f;
        this.f11900OooOO0 = z;
    }

    @Override // p136o00OO0oO.OooO
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        return new o00Oo0(lottieDrawable, oooO00o, this);
    }
}
