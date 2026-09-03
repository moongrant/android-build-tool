package p130o00O0oo;

import androidx.annotation.Px;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000Oo0 {

    public static final class OooO00o extends o000Oo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        public final int f36777OooO00o;

        public OooO00o(@Px int i) {
            this.f36777OooO00o = i;
            if (!(i > 0)) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO00o) {
                if (this.f36777OooO00o == ((OooO00o) obj).f36777OooO00o) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f36777OooO00o;
        }

        @NotNull
        public final String toString() {
            return String.valueOf(this.f36777OooO00o);
        }
    }

    public static final class OooO0O0 extends o000Oo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f36778OooO00o = new OooO0O0();

        @NotNull
        public final String toString() {
            return "Dimension.Undefined";
        }
    }
}
