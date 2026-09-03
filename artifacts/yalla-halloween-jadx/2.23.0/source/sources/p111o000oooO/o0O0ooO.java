package p111o000oooO;

import androidx.annotation.Px;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0O0ooO {

    public static final class OooO00o extends o0O0ooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        public final int f35937OooO00o;

        public OooO00o(@Px int i) {
            this.f35937OooO00o = i;
            if (!(i > 0)) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO00o) {
                if (this.f35937OooO00o == ((OooO00o) obj).f35937OooO00o) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f35937OooO00o;
        }

        @NotNull
        public final String toString() {
            return String.valueOf(this.f35937OooO00o);
        }
    }

    public static final class OooO0O0 extends o0O0ooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f35938OooO00o = new OooO0O0();

        @NotNull
        public final String toString() {
            return "Dimension.Undefined";
        }
    }
}
