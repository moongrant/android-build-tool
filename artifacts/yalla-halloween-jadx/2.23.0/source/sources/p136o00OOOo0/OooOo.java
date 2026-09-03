package p136o00OOOo0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0O00o0;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f37395OooO00o = 1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public String f37396OooO0O0 = "";

    public static final class OooO00o extends OooOo {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NotNull
        public final String f37397OooO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final String f37398OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final String f37399OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final String f37400OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final String f37401OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @NotNull
        public final String f37402OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NotNull
        public final String f37403OooO0oo;

        public OooO00o(@NotNull String cloudFileName, @NotNull String awsBucketName, @NotNull String awsProviderName, @NotNull String awsIdentityId, @NotNull String awsIdentityPoolId, @NotNull String awsRegion, @NotNull String awsToken) {
            Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
            Intrinsics.checkNotNullParameter(awsBucketName, "awsBucketName");
            Intrinsics.checkNotNullParameter(awsProviderName, "awsProviderName");
            Intrinsics.checkNotNullParameter(awsIdentityId, "awsIdentityId");
            Intrinsics.checkNotNullParameter(awsIdentityPoolId, "awsIdentityPoolId");
            Intrinsics.checkNotNullParameter(awsRegion, "awsRegion");
            Intrinsics.checkNotNullParameter(awsToken, "awsToken");
            this.f37398OooO0OO = cloudFileName;
            this.f37399OooO0Oo = awsBucketName;
            this.f37401OooO0o0 = awsProviderName;
            this.f37400OooO0o = awsIdentityId;
            this.f37402OooO0oO = awsIdentityPoolId;
            this.f37403OooO0oo = awsRegion;
            this.f37397OooO = awsToken;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f37398OooO0OO, oooO00o.f37398OooO0OO) && Intrinsics.areEqual(this.f37399OooO0Oo, oooO00o.f37399OooO0Oo) && Intrinsics.areEqual(this.f37401OooO0o0, oooO00o.f37401OooO0o0) && Intrinsics.areEqual(this.f37400OooO0o, oooO00o.f37400OooO0o) && Intrinsics.areEqual(this.f37402OooO0oO, oooO00o.f37402OooO0oO) && Intrinsics.areEqual(this.f37403OooO0oo, oooO00o.f37403OooO0oo) && Intrinsics.areEqual(this.f37397OooO, oooO00o.f37397OooO);
        }

        public final int hashCode() {
            return this.f37397OooO.hashCode() + o0OO00O.OooO00o(this.f37403OooO0oo, o0OO00O.OooO00o(this.f37402OooO0oO, o0OO00O.OooO00o(this.f37400OooO0o, o0OO00O.OooO00o(this.f37401OooO0o0, o0OO00O.OooO00o(this.f37399OooO0Oo, this.f37398OooO0OO.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("AWSUploadInfo(cloudFileName=");
            sb.append(this.f37398OooO0OO);
            sb.append(", awsBucketName=");
            sb.append(this.f37399OooO0Oo);
            sb.append(", awsProviderName=");
            sb.append(this.f37401OooO0o0);
            sb.append(", awsIdentityId=");
            sb.append(this.f37400OooO0o);
            sb.append(", awsIdentityPoolId=");
            sb.append(this.f37402OooO0oO);
            sb.append(", awsRegion=");
            sb.append(this.f37403OooO0oo);
            sb.append(", awsToken=");
            return o0O00o0.OooO0O0(sb, this.f37397OooO, ")");
        }
    }

    public static final class OooO0O0 extends OooOo {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final String f37404OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final String f37405OooO0Oo;

        public OooO0O0(@NotNull String cloudFileName, @NotNull String token) {
            Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
            Intrinsics.checkNotNullParameter(token, "token");
            this.f37404OooO0OO = cloudFileName;
            this.f37405OooO0Oo = token;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return Intrinsics.areEqual(this.f37404OooO0OO, oooO0O0.f37404OooO0OO) && Intrinsics.areEqual(this.f37405OooO0Oo, oooO0O0.f37405OooO0Oo);
        }

        public final int hashCode() {
            return this.f37405OooO0Oo.hashCode() + (this.f37404OooO0OO.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("QiNiuUploadInfo(cloudFileName=");
            sb.append(this.f37404OooO0OO);
            sb.append(", token=");
            return o0O00o0.OooO0O0(sb, this.f37405OooO0Oo, ")");
        }
    }
}
