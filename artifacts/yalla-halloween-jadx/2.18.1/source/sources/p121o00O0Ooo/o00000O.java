package p121o00O0Ooo;

import java.util.Objects;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface o00000O {

    @JvmInline
    public static final class OooO implements o00000O {
        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO)) {
                return false;
            }
            Objects.requireNonNull((OooO) obj);
            return Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Url(url=null)";
        }
    }

    @JvmInline
    public static final class OooO00o implements o00000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f30872OooO00o = "lottie/guide_send_gift.json";

        public final boolean equals(Object obj) {
            return (obj instanceof OooO00o) && Intrinsics.areEqual(this.f30872OooO00o, ((OooO00o) obj).f30872OooO00o);
        }

        public final int hashCode() {
            return this.f30872OooO00o.hashCode();
        }

        public final String toString() {
            return "Asset(assetName=" + this.f30872OooO00o + ')';
        }
    }

    @JvmInline
    public static final class OooO0O0 implements o00000O {
        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            Objects.requireNonNull((OooO0O0) obj);
            return Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "File(fileName=null)";
        }
    }

    @JvmInline
    public static final class OooO0OO implements o00000O {
        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            Objects.requireNonNull((OooO0OO) obj);
            return Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "JsonString(jsonString=null)";
        }
    }

    @JvmInline
    public static final class OooO0o implements o00000O {
        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            Objects.requireNonNull((OooO0o) obj);
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "RawRes(resId=0)";
        }
    }
}
