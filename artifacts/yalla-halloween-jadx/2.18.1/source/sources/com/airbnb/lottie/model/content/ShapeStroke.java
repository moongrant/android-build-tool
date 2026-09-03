package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import java.util.List;
import p118o00O0Oo.o00oO0o;
import p123o00O0o0.OooOO0;
import p123o00O0o0.OooOO0O;
import p123o00O0o0.OooOOO;
import p125o00O0o0O.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class ShapeStroke implements o000OOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f10121OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10122OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final OooOO0O f10123OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<OooOO0O> f10124OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0 f10125OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0O f10126OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO f10127OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LineCapType f10128OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final LineJoinType f10129OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f10130OooOO0;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public final Paint.Cap OooO00o() {
            int i = OooO00o.f10131OooO00o[ordinal()];
            if (i != 1) {
                return i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public final Paint.Join OooO00o() {
            int i = OooO00o.f10132OooO0O0[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f10131OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f10132OooO0O0;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f10132OooO0O0 = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10132OooO0O0[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10132OooO0O0[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f10131OooO00o = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10131OooO00o[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10131OooO00o[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @Nullable OooOO0O oooOO0O, List<OooOO0O> list, OooOO0 oooOO1, OooOOO oooOOO, OooOO0O oooOO0O2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.f10122OooO00o = str;
        this.f10123OooO0O0 = oooOO0O;
        this.f10124OooO0OO = list;
        this.f10125OooO0Oo = oooOO1;
        this.f10127OooO0o0 = oooOOO;
        this.f10126OooO0o = oooOO0O2;
        this.f10128OooO0oO = lineCapType;
        this.f10129OooO0oo = lineJoinType;
        this.f10121OooO = f;
        this.f10130OooOO0 = z;
    }

    @Override // p125o00O0o0O.o000OOo
    public final p118o00O0Oo.OooOO0 OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        return new o00oO0o(lottieDrawable, oooO00o, this);
    }
}
