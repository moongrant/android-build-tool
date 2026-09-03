package p708oo000o;

import Oooo000.o000O00O;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public abstract class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f53125OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f53126OooO0O0;

    @Immutable
    public static final class OooO extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53127OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53128OooO0Oo;

        public OooO(float f, float f2) {
            super(false, false, 3);
            this.f53127OooO0OO = f;
            this.f53128OooO0Oo = f2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO)) {
                return false;
            }
            OooO oooO = (OooO) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53127OooO0OO), (Object) Float.valueOf(oooO.f53127OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53128OooO0Oo), (Object) Float.valueOf(oooO.f53128OooO0Oo));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53128OooO0Oo) + (Float.floatToIntBits(this.f53127OooO0OO) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LineTo(x=");
            sbOooO0o0.append(this.f53127OooO0OO);
            sbOooO0o0.append(", y=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53128OooO0Oo, ')');
        }
    }

    @Immutable
    public static final class OooO00o extends OooOOOO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float f53129OooO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53130OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53131OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f53132OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f53133OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f53134OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f53135OooO0oo;

        public OooO00o(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3);
            this.f53130OooO0OO = f;
            this.f53131OooO0Oo = f2;
            this.f53133OooO0o0 = f3;
            this.f53132OooO0o = z;
            this.f53134OooO0oO = z2;
            this.f53135OooO0oo = f4;
            this.f53129OooO = f5;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53130OooO0OO), (Object) Float.valueOf(oooO00o.f53130OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53131OooO0Oo), (Object) Float.valueOf(oooO00o.f53131OooO0Oo)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53133OooO0o0), (Object) Float.valueOf(oooO00o.f53133OooO0o0)) && this.f53132OooO0o == oooO00o.f53132OooO0o && this.f53134OooO0oO == oooO00o.f53134OooO0oO && Intrinsics.areEqual((Object) Float.valueOf(this.f53135OooO0oo), (Object) Float.valueOf(oooO00o.f53135OooO0oo)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53129OooO), (Object) Float.valueOf(oooO00o.f53129OooO));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            int iOooO00o = o000O00O.OooO00o(this.f53133OooO0o0, o000O00O.OooO00o(this.f53131OooO0Oo, Float.floatToIntBits(this.f53130OooO0OO) * 31, 31), 31);
            boolean z = this.f53132OooO0o;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iOooO00o + r1) * 31;
            boolean z2 = this.f53134OooO0oO;
            return Float.floatToIntBits(this.f53129OooO) + o000O00O.OooO00o(this.f53135OooO0oo, (i + (z2 ? 1 : z2)) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ArcTo(horizontalEllipseRadius=");
            sbOooO0o0.append(this.f53130OooO0OO);
            sbOooO0o0.append(", verticalEllipseRadius=");
            sbOooO0o0.append(this.f53131OooO0Oo);
            sbOooO0o0.append(", theta=");
            sbOooO0o0.append(this.f53133OooO0o0);
            sbOooO0o0.append(", isMoreThanHalf=");
            sbOooO0o0.append(this.f53132OooO0o);
            sbOooO0o0.append(", isPositiveArc=");
            sbOooO0o0.append(this.f53134OooO0oO);
            sbOooO0o0.append(", arcStartX=");
            sbOooO0o0.append(this.f53135OooO0oo);
            sbOooO0o0.append(", arcStartY=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53129OooO, ')');
        }
    }

    @Immutable
    public static final class OooO0O0 extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f53136OooO0OO = new OooO0O0();

        public OooO0O0() {
            super(false, false, 3);
        }
    }

    @Immutable
    public static final class OooO0OO extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53137OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53138OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f53139OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f53140OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f53141OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f53142OooO0oo;

        public OooO0OO(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2);
            this.f53137OooO0OO = f;
            this.f53138OooO0Oo = f2;
            this.f53140OooO0o0 = f3;
            this.f53139OooO0o = f4;
            this.f53141OooO0oO = f5;
            this.f53142OooO0oo = f6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53137OooO0OO), (Object) Float.valueOf(oooO0OO.f53137OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53138OooO0Oo), (Object) Float.valueOf(oooO0OO.f53138OooO0Oo)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53140OooO0o0), (Object) Float.valueOf(oooO0OO.f53140OooO0o0)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53139OooO0o), (Object) Float.valueOf(oooO0OO.f53139OooO0o)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53141OooO0oO), (Object) Float.valueOf(oooO0OO.f53141OooO0oO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53142OooO0oo), (Object) Float.valueOf(oooO0OO.f53142OooO0oo));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53142OooO0oo) + o000O00O.OooO00o(this.f53141OooO0oO, o000O00O.OooO00o(this.f53139OooO0o, o000O00O.OooO00o(this.f53140OooO0o0, o000O00O.OooO00o(this.f53138OooO0Oo, Float.floatToIntBits(this.f53137OooO0OO) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CurveTo(x1=");
            sbOooO0o0.append(this.f53137OooO0OO);
            sbOooO0o0.append(", y1=");
            sbOooO0o0.append(this.f53138OooO0Oo);
            sbOooO0o0.append(", x2=");
            sbOooO0o0.append(this.f53140OooO0o0);
            sbOooO0o0.append(", y2=");
            sbOooO0o0.append(this.f53139OooO0o);
            sbOooO0o0.append(", x3=");
            sbOooO0o0.append(this.f53141OooO0oO);
            sbOooO0o0.append(", y3=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53142OooO0oo, ')');
        }
    }

    @Immutable
    public static final class OooO0o extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53143OooO0OO;

        public OooO0o(float f) {
            super(false, false, 3);
            this.f53143OooO0OO = f;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0o) && Intrinsics.areEqual((Object) Float.valueOf(this.f53143OooO0OO), (Object) Float.valueOf(((OooO0o) obj).f53143OooO0OO));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53143OooO0OO);
        }

        @NotNull
        public final String toString() {
            return Oooo000.OooO0O0.OooO00o(OooO00o.OooO00o.OooO0o0("HorizontalTo(x="), this.f53143OooO0OO, ')');
        }
    }

    @Immutable
    public static final class OooOO0 extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53144OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53145OooO0Oo;

        public OooOO0(float f, float f2) {
            super(false, false, 3);
            this.f53144OooO0OO = f;
            this.f53145OooO0Oo = f2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOO0)) {
                return false;
            }
            OooOO0 oooOO1 = (OooOO0) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53144OooO0OO), (Object) Float.valueOf(oooOO1.f53144OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53145OooO0Oo), (Object) Float.valueOf(oooOO1.f53145OooO0Oo));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53145OooO0Oo) + (Float.floatToIntBits(this.f53144OooO0OO) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MoveTo(x=");
            sbOooO0o0.append(this.f53144OooO0OO);
            sbOooO0o0.append(", y=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53145OooO0Oo, ')');
        }
    }

    @Immutable
    public static final class OooOO0O extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53146OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53147OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f53148OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f53149OooO0o0;

        public OooOO0O(float f, float f2, float f3, float f4) {
            super(false, true, 1);
            this.f53146OooO0OO = f;
            this.f53147OooO0Oo = f2;
            this.f53149OooO0o0 = f3;
            this.f53148OooO0o = f4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOO0O)) {
                return false;
            }
            OooOO0O oooOO0O = (OooOO0O) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53146OooO0OO), (Object) Float.valueOf(oooOO0O.f53146OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53147OooO0Oo), (Object) Float.valueOf(oooOO0O.f53147OooO0Oo)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53149OooO0o0), (Object) Float.valueOf(oooOO0O.f53149OooO0o0)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53148OooO0o), (Object) Float.valueOf(oooOO0O.f53148OooO0o));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53148OooO0o) + o000O00O.OooO00o(this.f53149OooO0o0, o000O00O.OooO00o(this.f53147OooO0Oo, Float.floatToIntBits(this.f53146OooO0OO) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("QuadTo(x1=");
            sbOooO0o0.append(this.f53146OooO0OO);
            sbOooO0o0.append(", y1=");
            sbOooO0o0.append(this.f53147OooO0Oo);
            sbOooO0o0.append(", x2=");
            sbOooO0o0.append(this.f53149OooO0o0);
            sbOooO0o0.append(", y2=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53148OooO0o, ')');
        }
    }

    @Immutable
    public static final class OooOOO extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53150OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53151OooO0Oo;

        public OooOOO(float f, float f2) {
            super(false, true, 1);
            this.f53150OooO0OO = f;
            this.f53151OooO0Oo = f2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOOO)) {
                return false;
            }
            OooOOO oooOOO = (OooOOO) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53150OooO0OO), (Object) Float.valueOf(oooOOO.f53150OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53151OooO0Oo), (Object) Float.valueOf(oooOOO.f53151OooO0Oo));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53151OooO0Oo) + (Float.floatToIntBits(this.f53150OooO0OO) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ReflectiveQuadTo(x=");
            sbOooO0o0.append(this.f53150OooO0OO);
            sbOooO0o0.append(", y=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53151OooO0Oo, ')');
        }
    }

    @Immutable
    public static final class OooOOO0 extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53152OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53153OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f53154OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f53155OooO0o0;

        public OooOOO0(float f, float f2, float f3, float f4) {
            super(true, false, 2);
            this.f53152OooO0OO = f;
            this.f53153OooO0Oo = f2;
            this.f53155OooO0o0 = f3;
            this.f53154OooO0o = f4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOOO0)) {
                return false;
            }
            OooOOO0 oooOOO0 = (OooOOO0) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53152OooO0OO), (Object) Float.valueOf(oooOOO0.f53152OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53153OooO0Oo), (Object) Float.valueOf(oooOOO0.f53153OooO0Oo)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53155OooO0o0), (Object) Float.valueOf(oooOOO0.f53155OooO0o0)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53154OooO0o), (Object) Float.valueOf(oooOOO0.f53154OooO0o));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53154OooO0o) + o000O00O.OooO00o(this.f53155OooO0o0, o000O00O.OooO00o(this.f53153OooO0Oo, Float.floatToIntBits(this.f53152OooO0OO) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ReflectiveCurveTo(x1=");
            sbOooO0o0.append(this.f53152OooO0OO);
            sbOooO0o0.append(", y1=");
            sbOooO0o0.append(this.f53153OooO0Oo);
            sbOooO0o0.append(", x2=");
            sbOooO0o0.append(this.f53155OooO0o0);
            sbOooO0o0.append(", y2=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53154OooO0o, ')');
        }
    }

    /* JADX INFO: renamed from: oo000o.OooOOOO$OooOOOO, reason: collision with other inner class name */
    @Immutable
    public static final class C0437OooOOOO extends OooOOOO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float f53156OooO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53157OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53158OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f53159OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f53160OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f53161OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f53162OooO0oo;

        public C0437OooOOOO(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(false, false, 3);
            this.f53157OooO0OO = f;
            this.f53158OooO0Oo = f2;
            this.f53160OooO0o0 = f3;
            this.f53159OooO0o = z;
            this.f53161OooO0oO = z2;
            this.f53162OooO0oo = f4;
            this.f53156OooO = f5;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0437OooOOOO)) {
                return false;
            }
            C0437OooOOOO c0437OooOOOO = (C0437OooOOOO) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53157OooO0OO), (Object) Float.valueOf(c0437OooOOOO.f53157OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53158OooO0Oo), (Object) Float.valueOf(c0437OooOOOO.f53158OooO0Oo)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53160OooO0o0), (Object) Float.valueOf(c0437OooOOOO.f53160OooO0o0)) && this.f53159OooO0o == c0437OooOOOO.f53159OooO0o && this.f53161OooO0oO == c0437OooOOOO.f53161OooO0oO && Intrinsics.areEqual((Object) Float.valueOf(this.f53162OooO0oo), (Object) Float.valueOf(c0437OooOOOO.f53162OooO0oo)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53156OooO), (Object) Float.valueOf(c0437OooOOOO.f53156OooO));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            int iOooO00o = o000O00O.OooO00o(this.f53160OooO0o0, o000O00O.OooO00o(this.f53158OooO0Oo, Float.floatToIntBits(this.f53157OooO0OO) * 31, 31), 31);
            boolean z = this.f53159OooO0o;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iOooO00o + r1) * 31;
            boolean z2 = this.f53161OooO0oO;
            return Float.floatToIntBits(this.f53156OooO) + o000O00O.OooO00o(this.f53162OooO0oo, (i + (z2 ? 1 : z2)) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RelativeArcTo(horizontalEllipseRadius=");
            sbOooO0o0.append(this.f53157OooO0OO);
            sbOooO0o0.append(", verticalEllipseRadius=");
            sbOooO0o0.append(this.f53158OooO0Oo);
            sbOooO0o0.append(", theta=");
            sbOooO0o0.append(this.f53160OooO0o0);
            sbOooO0o0.append(", isMoreThanHalf=");
            sbOooO0o0.append(this.f53159OooO0o);
            sbOooO0o0.append(", isPositiveArc=");
            sbOooO0o0.append(this.f53161OooO0oO);
            sbOooO0o0.append(", arcStartDx=");
            sbOooO0o0.append(this.f53162OooO0oo);
            sbOooO0o0.append(", arcStartDy=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53156OooO, ')');
        }
    }

    @Immutable
    public static final class OooOo extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53163OooO0OO;

        public OooOo(float f) {
            super(false, false, 3);
            this.f53163OooO0OO = f;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooOo) && Intrinsics.areEqual((Object) Float.valueOf(this.f53163OooO0OO), (Object) Float.valueOf(((OooOo) obj).f53163OooO0OO));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53163OooO0OO);
        }

        @NotNull
        public final String toString() {
            return Oooo000.OooO0O0.OooO00o(OooO00o.OooO00o.OooO0o0("RelativeHorizontalTo(dx="), this.f53163OooO0OO, ')');
        }
    }

    @Immutable
    public static final class OooOo00 extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53164OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53165OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f53166OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f53167OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f53168OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f53169OooO0oo;

        public OooOo00(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2);
            this.f53164OooO0OO = f;
            this.f53165OooO0Oo = f2;
            this.f53167OooO0o0 = f3;
            this.f53166OooO0o = f4;
            this.f53168OooO0oO = f5;
            this.f53169OooO0oo = f6;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOo00)) {
                return false;
            }
            OooOo00 oooOo00 = (OooOo00) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53164OooO0OO), (Object) Float.valueOf(oooOo00.f53164OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53165OooO0Oo), (Object) Float.valueOf(oooOo00.f53165OooO0Oo)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53167OooO0o0), (Object) Float.valueOf(oooOo00.f53167OooO0o0)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53166OooO0o), (Object) Float.valueOf(oooOo00.f53166OooO0o)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53168OooO0oO), (Object) Float.valueOf(oooOo00.f53168OooO0oO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53169OooO0oo), (Object) Float.valueOf(oooOo00.f53169OooO0oo));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53169OooO0oo) + o000O00O.OooO00o(this.f53168OooO0oO, o000O00O.OooO00o(this.f53166OooO0o, o000O00O.OooO00o(this.f53167OooO0o0, o000O00O.OooO00o(this.f53165OooO0Oo, Float.floatToIntBits(this.f53164OooO0OO) * 31, 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RelativeCurveTo(dx1=");
            sbOooO0o0.append(this.f53164OooO0OO);
            sbOooO0o0.append(", dy1=");
            sbOooO0o0.append(this.f53165OooO0Oo);
            sbOooO0o0.append(", dx2=");
            sbOooO0o0.append(this.f53167OooO0o0);
            sbOooO0o0.append(", dy2=");
            sbOooO0o0.append(this.f53166OooO0o);
            sbOooO0o0.append(", dx3=");
            sbOooO0o0.append(this.f53168OooO0oO);
            sbOooO0o0.append(", dy3=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53169OooO0oo, ')');
        }
    }

    @Immutable
    public static final class Oooo0 extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53170OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53171OooO0Oo;

        public Oooo0(float f, float f2) {
            super(false, false, 3);
            this.f53170OooO0OO = f;
            this.f53171OooO0Oo = f2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Oooo0)) {
                return false;
            }
            Oooo0 oooo0 = (Oooo0) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53170OooO0OO), (Object) Float.valueOf(oooo0.f53170OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53171OooO0Oo), (Object) Float.valueOf(oooo0.f53171OooO0Oo));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53171OooO0Oo) + (Float.floatToIntBits(this.f53170OooO0OO) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RelativeMoveTo(dx=");
            sbOooO0o0.append(this.f53170OooO0OO);
            sbOooO0o0.append(", dy=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53171OooO0Oo, ')');
        }
    }

    @Immutable
    public static final class Oooo000 extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53172OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53173OooO0Oo;

        public Oooo000(float f, float f2) {
            super(false, false, 3);
            this.f53172OooO0OO = f;
            this.f53173OooO0Oo = f2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Oooo000)) {
                return false;
            }
            Oooo000 oooo000 = (Oooo000) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53172OooO0OO), (Object) Float.valueOf(oooo000.f53172OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53173OooO0Oo), (Object) Float.valueOf(oooo000.f53173OooO0Oo));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53173OooO0Oo) + (Float.floatToIntBits(this.f53172OooO0OO) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RelativeLineTo(dx=");
            sbOooO0o0.append(this.f53172OooO0OO);
            sbOooO0o0.append(", dy=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53173OooO0Oo, ')');
        }
    }

    @Immutable
    public static final class o000oOoO extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53174OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53175OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f53176OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f53177OooO0o0;

        public o000oOoO(float f, float f2, float f3, float f4) {
            super(false, true, 1);
            this.f53174OooO0OO = f;
            this.f53175OooO0Oo = f2;
            this.f53177OooO0o0 = f3;
            this.f53176OooO0o = f4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o000oOoO)) {
                return false;
            }
            o000oOoO o000oooo2 = (o000oOoO) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53174OooO0OO), (Object) Float.valueOf(o000oooo2.f53174OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53175OooO0Oo), (Object) Float.valueOf(o000oooo2.f53175OooO0Oo)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53177OooO0o0), (Object) Float.valueOf(o000oooo2.f53177OooO0o0)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53176OooO0o), (Object) Float.valueOf(o000oooo2.f53176OooO0o));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53176OooO0o) + o000O00O.OooO00o(this.f53177OooO0o0, o000O00O.OooO00o(this.f53175OooO0Oo, Float.floatToIntBits(this.f53174OooO0OO) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RelativeQuadTo(dx1=");
            sbOooO0o0.append(this.f53174OooO0OO);
            sbOooO0o0.append(", dy1=");
            sbOooO0o0.append(this.f53175OooO0Oo);
            sbOooO0o0.append(", dx2=");
            sbOooO0o0.append(this.f53177OooO0o0);
            sbOooO0o0.append(", dy2=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53176OooO0o, ')');
        }
    }

    @Immutable
    public static final class o00O0O extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53178OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53179OooO0Oo;

        public o00O0O(float f, float f2) {
            super(false, true, 1);
            this.f53178OooO0OO = f;
            this.f53179OooO0Oo = f2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o00O0O)) {
                return false;
            }
            o00O0O o00o0o2 = (o00O0O) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53178OooO0OO), (Object) Float.valueOf(o00o0o2.f53178OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53179OooO0Oo), (Object) Float.valueOf(o00o0o2.f53179OooO0Oo));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53179OooO0Oo) + (Float.floatToIntBits(this.f53178OooO0OO) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RelativeReflectiveQuadTo(dx=");
            sbOooO0o0.append(this.f53178OooO0OO);
            sbOooO0o0.append(", dy=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53179OooO0Oo, ')');
        }
    }

    @Immutable
    public static final class o00Oo0 extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53180OooO0OO;

        public o00Oo0(float f) {
            super(false, false, 3);
            this.f53180OooO0OO = f;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o00Oo0) && Intrinsics.areEqual((Object) Float.valueOf(this.f53180OooO0OO), (Object) Float.valueOf(((o00Oo0) obj).f53180OooO0OO));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53180OooO0OO);
        }

        @NotNull
        public final String toString() {
            return Oooo000.OooO0O0.OooO00o(OooO00o.OooO00o.OooO0o0("RelativeVerticalTo(dy="), this.f53180OooO0OO, ')');
        }
    }

    @Immutable
    public static final class o00Ooo extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53181OooO0OO;

        public o00Ooo(float f) {
            super(false, false, 3);
            this.f53181OooO0OO = f;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o00Ooo) && Intrinsics.areEqual((Object) Float.valueOf(this.f53181OooO0OO), (Object) Float.valueOf(((o00Ooo) obj).f53181OooO0OO));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53181OooO0OO);
        }

        @NotNull
        public final String toString() {
            return Oooo000.OooO0O0.OooO00o(OooO00o.OooO00o.OooO0o0("VerticalTo(y="), this.f53181OooO0OO, ')');
        }
    }

    @Immutable
    public static final class o0OoOo0 extends OooOOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f53182OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f53183OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f53184OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f53185OooO0o0;

        public o0OoOo0(float f, float f2, float f3, float f4) {
            super(true, false, 2);
            this.f53182OooO0OO = f;
            this.f53183OooO0Oo = f2;
            this.f53185OooO0o0 = f3;
            this.f53184OooO0o = f4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o0OoOo0)) {
                return false;
            }
            o0OoOo0 o0oooo1 = (o0OoOo0) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53182OooO0OO), (Object) Float.valueOf(o0oooo1.f53182OooO0OO)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53183OooO0Oo), (Object) Float.valueOf(o0oooo1.f53183OooO0Oo)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53185OooO0o0), (Object) Float.valueOf(o0oooo1.f53185OooO0o0)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53184OooO0o), (Object) Float.valueOf(o0oooo1.f53184OooO0o));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53184OooO0o) + o000O00O.OooO00o(this.f53185OooO0o0, o000O00O.OooO00o(this.f53183OooO0Oo, Float.floatToIntBits(this.f53182OooO0OO) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RelativeReflectiveCurveTo(dx1=");
            sbOooO0o0.append(this.f53182OooO0OO);
            sbOooO0o0.append(", dy1=");
            sbOooO0o0.append(this.f53183OooO0Oo);
            sbOooO0o0.append(", dx2=");
            sbOooO0o0.append(this.f53185OooO0o0);
            sbOooO0o0.append(", dy2=");
            return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f53184OooO0o, ')');
        }
    }

    public OooOOOO(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        this.f53125OooO00o = z;
        this.f53126OooO0O0 = z2;
    }
}
