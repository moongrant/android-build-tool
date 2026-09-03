package p182o00o000O;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f38464OooO00o = 1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public String f38465OooO0O0 = "";

    public static final class OooO00o extends Oooo000 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NotNull
        public final String f38466OooO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final String f38467OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final String f38468OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final String f38469OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final String f38470OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final String f38471OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NotNull
        public final String f38472OooO0oo;

        public OooO00o(@NotNull String cloudFileName, @NotNull String awsBucketName, @NotNull String awsProviderName, @NotNull String awsIdentityId, @NotNull String awsIdentityPoolId, @NotNull String awsRegion, @NotNull String awsToken) {
            Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
            Intrinsics.checkNotNullParameter(awsBucketName, "awsBucketName");
            Intrinsics.checkNotNullParameter(awsProviderName, "awsProviderName");
            Intrinsics.checkNotNullParameter(awsIdentityId, "awsIdentityId");
            Intrinsics.checkNotNullParameter(awsIdentityPoolId, "awsIdentityPoolId");
            Intrinsics.checkNotNullParameter(awsRegion, "awsRegion");
            Intrinsics.checkNotNullParameter(awsToken, "awsToken");
            this.f38467OooO0OO = cloudFileName;
            this.f38468OooO0Oo = awsBucketName;
            this.f38470OooO0o0 = awsProviderName;
            this.f38469OooO0o = awsIdentityId;
            this.f38471OooO0oO = awsIdentityPoolId;
            this.f38472OooO0oo = awsRegion;
            this.f38466OooO = awsToken;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f38467OooO0OO, oooO00o.f38467OooO0OO) && Intrinsics.areEqual(this.f38468OooO0Oo, oooO00o.f38468OooO0Oo) && Intrinsics.areEqual(this.f38470OooO0o0, oooO00o.f38470OooO0o0) && Intrinsics.areEqual(this.f38469OooO0o, oooO00o.f38469OooO0o) && Intrinsics.areEqual(this.f38471OooO0oO, oooO00o.f38471OooO0oO) && Intrinsics.areEqual(this.f38472OooO0oo, oooO00o.f38472OooO0oo) && Intrinsics.areEqual(this.f38466OooO, oooO00o.f38466OooO);
        }

        public final int hashCode() {
            return this.f38466OooO.hashCode() + androidx.compose.animation.OooO0O0.OooO00o(this.f38472OooO0oo, androidx.compose.animation.OooO0O0.OooO00o(this.f38471OooO0oO, androidx.compose.animation.OooO0O0.OooO00o(this.f38469OooO0o, androidx.compose.animation.OooO0O0.OooO00o(this.f38470OooO0o0, androidx.compose.animation.OooO0O0.OooO00o(this.f38468OooO0Oo, this.f38467OooO0OO.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("AWSUploadInfo(cloudFileName=");
            sb.append(this.f38467OooO0OO);
            sb.append(", awsBucketName=");
            sb.append(this.f38468OooO0Oo);
            sb.append(", awsProviderName=");
            sb.append(this.f38470OooO0o0);
            sb.append(", awsIdentityId=");
            sb.append(this.f38469OooO0o);
            sb.append(", awsIdentityPoolId=");
            sb.append(this.f38471OooO0oO);
            sb.append(", awsRegion=");
            sb.append(this.f38472OooO0oo);
            sb.append(", awsToken=");
            return o0oOO.OooO0O0(sb, this.f38466OooO, ")");
        }
    }

    public static final class OooO0O0 extends Oooo000 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final String f38473OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final String f38474OooO0Oo;

        public OooO0O0(@NotNull String cloudFileName, @NotNull String token) {
            Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
            Intrinsics.checkNotNullParameter(token, "token");
            this.f38473OooO0OO = cloudFileName;
            this.f38474OooO0Oo = token;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return Intrinsics.areEqual(this.f38473OooO0OO, oooO0O0.f38473OooO0OO) && Intrinsics.areEqual(this.f38474OooO0Oo, oooO0O0.f38474OooO0Oo);
        }

        public final int hashCode() {
            return this.f38474OooO0Oo.hashCode() + (this.f38473OooO0OO.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("QiNiuUploadInfo(cloudFileName=");
            sb.append(this.f38473OooO0OO);
            sb.append(", token=");
            return o0oOO.OooO0O0(sb, this.f38474OooO0Oo, ")");
        }
    }
}
