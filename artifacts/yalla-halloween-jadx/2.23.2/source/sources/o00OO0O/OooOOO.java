package o00OO0O;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface OooOOO {

    @JvmInline
    public static final class OooO implements OooOOO {
        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO)) {
                return false;
            }
            ((OooO) obj).getClass();
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
    public static final class OooO00o implements OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final String f37199OooO00o = "lottie/guide_send_gift.json";

        public final boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                return Intrinsics.areEqual(this.f37199OooO00o, ((OooO00o) obj).f37199OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f37199OooO00o.hashCode();
        }

        public final String toString() {
            return "Asset(assetName=" + this.f37199OooO00o + ')';
        }
    }

    @JvmInline
    public static final class OooO0O0 implements OooOOO {
        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            ((OooO0O0) obj).getClass();
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
    public static final class OooO0OO implements OooOOO {
        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            ((OooO0OO) obj).getClass();
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
    public static final class OooO0o implements OooOOO {
        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            ((OooO0o) obj).getClass();
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
