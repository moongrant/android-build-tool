package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.ArrayList;
import java.util.List;
import o00O000.OooO0OO;
import o00O000.o00Oo0;
import o00O00OO.OooO0O0;
import o00O00OO.OooO0o;
import p113o00O00Oo.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class ShapeStroke implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f8801OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f8802OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final OooO0O0 f8803OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<OooO0O0> f8804OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O00OO.OooO00o f8805OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f8806OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f8807OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LineCapType f8808OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final LineJoinType f8809OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f8810OooOO0;

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
        public static final /* synthetic */ int[] f8811OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f8812OooO0O0;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f8812OooO0O0 = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8812OooO0O0[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8812OooO0O0[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f8811OooO00o = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8811OooO00o[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8811OooO00o[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @Nullable OooO0O0 oooO0O0, ArrayList arrayList, o00O00OO.OooO00o oooO00o, OooO0o oooO0o, OooO0O0 oooO0O1, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.f8802OooO00o = str;
        this.f8803OooO0O0 = oooO0O0;
        this.f8804OooO0OO = arrayList;
        this.f8805OooO0Oo = oooO00o;
        this.f8807OooO0o0 = oooO0o;
        this.f8806OooO0o = oooO0O1;
        this.f8808OooO0oO = lineCapType;
        this.f8809OooO0oo = lineJoinType;
        this.f8801OooO = f;
        this.f8810OooOO0 = z;
    }

    @Override // p113o00O00Oo.o00O0O
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        return new o00Oo0(lottieDrawable, oooO00o, this);
    }
}
