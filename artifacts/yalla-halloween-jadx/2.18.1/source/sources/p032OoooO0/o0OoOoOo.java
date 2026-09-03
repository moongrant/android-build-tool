package p032OoooO0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p054o00000oo.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f3371OooO00o = 100000;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO00o f3372OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO00o f3373OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f3374OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f3375OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Long f3376OooO0o0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public OooO00o f3377OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public oo0oOO0 f3378OooO0O0;

        public OooO00o(@Nullable OooO00o oooO00o, @NotNull oo0oOO0 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f3377OooO00o = oooO00o;
            this.f3378OooO0O0 = value;
        }
    }

    public o0OoOoOo() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    public final void OooO00o(@NotNull oo0oOO0 value) {
        OooO00o oooO00o;
        oo0oOO0 oo0ooo0;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f3375OooO0o = false;
        OooO00o oooO00o2 = this.f3372OooO0O0;
        if (Intrinsics.areEqual(value, oooO00o2 != null ? oooO00o2.f3378OooO0O0 : null)) {
            return;
        }
        String str = value.f27236OooO00o.f26756Oooo0o;
        OooO00o oooO00o3 = this.f3372OooO0O0;
        if (Intrinsics.areEqual(str, (oooO00o3 == null || (oo0ooo0 = oooO00o3.f3378OooO0O0) == null) ? null : oo0ooo0.f27236OooO00o.f26756Oooo0o)) {
            OooO00o oooO00o4 = this.f3372OooO0O0;
            if (oooO00o4 == null) {
                return;
            }
            Intrinsics.checkNotNullParameter(value, "<set-?>");
            oooO00o4.f3378OooO0O0 = value;
            return;
        }
        this.f3372OooO0O0 = new OooO00o(this.f3372OooO0O0, value);
        this.f3373OooO0OO = null;
        int length = value.f27236OooO00o.f26756Oooo0o.length() + this.f3374OooO0Oo;
        this.f3374OooO0Oo = length;
        if (length > this.f3371OooO00o) {
            OooO00o oooO00o5 = this.f3372OooO0O0;
            if ((oooO00o5 != null ? oooO00o5.f3377OooO00o : null) == null) {
                return;
            }
            while (true) {
                if (oooO00o5 == null) {
                    oooO00o = null;
                } else {
                    OooO00o oooO00o6 = oooO00o5.f3377OooO00o;
                    if (oooO00o6 != null) {
                        oooO00o = oooO00o6.f3377OooO00o;
                    } else {
                        oooO00o = null;
                    }
                }
                if (oooO00o == null) {
                    break;
                } else {
                    oooO00o5 = oooO00o5.f3377OooO00o;
                }
            }
            if (oooO00o5 == null) {
                return;
            }
            oooO00o5.f3377OooO00o = null;
        }
    }

    public o0OoOoOo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
