package com.yalla.support.cloudfilemanager;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import com.google.firebase.messaging.FirebaseMessagingService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;", "", "()V", "uploadType", "", "getUploadType", "()I", "setUploadType", "(I)V", "AWSUploadInfo", "QiNiuUploadInfo", "Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo$AWSUploadInfo;", "Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo$QiNiuUploadInfo;", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class CloudFileUploadInfo {
    private int uploadType;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo$AWSUploadInfo;", "Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;", "cloudFileName", "", "awsBucketName", "awsProviderName", "awsIdentityId", "awsIdentityPoolId", "awsRegion", "awsToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAwsBucketName", "()Ljava/lang/String;", "getAwsIdentityId", "getAwsIdentityPoolId", "getAwsProviderName", "getAwsRegion", "getAwsToken", "getCloudFileName", "setCloudFileName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class AWSUploadInfo extends CloudFileUploadInfo {

        @NotNull
        private final String awsBucketName;

        @NotNull
        private final String awsIdentityId;

        @NotNull
        private final String awsIdentityPoolId;

        @NotNull
        private final String awsProviderName;

        @NotNull
        private final String awsRegion;

        @NotNull
        private final String awsToken;

        @NotNull
        private String cloudFileName;

        public /* synthetic */ AWSUploadInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, str2, str3, str4, str5, str6, str7);
        }

        public static /* synthetic */ AWSUploadInfo copy$default(AWSUploadInfo aWSUploadInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aWSUploadInfo.cloudFileName;
            }
            if ((i & 2) != 0) {
                str2 = aWSUploadInfo.awsBucketName;
            }
            String str8 = str2;
            if ((i & 4) != 0) {
                str3 = aWSUploadInfo.awsProviderName;
            }
            String str9 = str3;
            if ((i & 8) != 0) {
                str4 = aWSUploadInfo.awsIdentityId;
            }
            String str10 = str4;
            if ((i & 16) != 0) {
                str5 = aWSUploadInfo.awsIdentityPoolId;
            }
            String str11 = str5;
            if ((i & 32) != 0) {
                str6 = aWSUploadInfo.awsRegion;
            }
            String str12 = str6;
            if ((i & 64) != 0) {
                str7 = aWSUploadInfo.awsToken;
            }
            return aWSUploadInfo.copy(str, str8, str9, str10, str11, str12, str7);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCloudFileName() {
            return this.cloudFileName;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAwsBucketName() {
            return this.awsBucketName;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getAwsProviderName() {
            return this.awsProviderName;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAwsIdentityId() {
            return this.awsIdentityId;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAwsIdentityPoolId() {
            return this.awsIdentityPoolId;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getAwsRegion() {
            return this.awsRegion;
        }

        @NotNull
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getAwsToken() {
            return this.awsToken;
        }

        @NotNull
        public final AWSUploadInfo copy(@NotNull String cloudFileName, @NotNull String awsBucketName, @NotNull String awsProviderName, @NotNull String awsIdentityId, @NotNull String awsIdentityPoolId, @NotNull String awsRegion, @NotNull String awsToken) {
            Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
            Intrinsics.checkNotNullParameter(awsBucketName, "awsBucketName");
            Intrinsics.checkNotNullParameter(awsProviderName, "awsProviderName");
            Intrinsics.checkNotNullParameter(awsIdentityId, "awsIdentityId");
            Intrinsics.checkNotNullParameter(awsIdentityPoolId, "awsIdentityPoolId");
            Intrinsics.checkNotNullParameter(awsRegion, "awsRegion");
            Intrinsics.checkNotNullParameter(awsToken, "awsToken");
            return new AWSUploadInfo(cloudFileName, awsBucketName, awsProviderName, awsIdentityId, awsIdentityPoolId, awsRegion, awsToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AWSUploadInfo)) {
                return false;
            }
            AWSUploadInfo aWSUploadInfo = (AWSUploadInfo) other;
            return Intrinsics.areEqual(this.cloudFileName, aWSUploadInfo.cloudFileName) && Intrinsics.areEqual(this.awsBucketName, aWSUploadInfo.awsBucketName) && Intrinsics.areEqual(this.awsProviderName, aWSUploadInfo.awsProviderName) && Intrinsics.areEqual(this.awsIdentityId, aWSUploadInfo.awsIdentityId) && Intrinsics.areEqual(this.awsIdentityPoolId, aWSUploadInfo.awsIdentityPoolId) && Intrinsics.areEqual(this.awsRegion, aWSUploadInfo.awsRegion) && Intrinsics.areEqual(this.awsToken, aWSUploadInfo.awsToken);
        }

        @NotNull
        public final String getAwsBucketName() {
            return this.awsBucketName;
        }

        @NotNull
        public final String getAwsIdentityId() {
            return this.awsIdentityId;
        }

        @NotNull
        public final String getAwsIdentityPoolId() {
            return this.awsIdentityPoolId;
        }

        @NotNull
        public final String getAwsProviderName() {
            return this.awsProviderName;
        }

        @NotNull
        public final String getAwsRegion() {
            return this.awsRegion;
        }

        @NotNull
        public final String getAwsToken() {
            return this.awsToken;
        }

        @NotNull
        public final String getCloudFileName() {
            return this.cloudFileName;
        }

        public int hashCode() {
            return this.awsToken.hashCode() + o0O0O00.OooO00o(this.awsRegion, o0O0O00.OooO00o(this.awsIdentityPoolId, o0O0O00.OooO00o(this.awsIdentityId, o0O0O00.OooO00o(this.awsProviderName, o0O0O00.OooO00o(this.awsBucketName, this.cloudFileName.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final void setCloudFileName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.cloudFileName = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AWSUploadInfo(cloudFileName=");
            sbOooO0o0.append(this.cloudFileName);
            sbOooO0o0.append(", awsBucketName=");
            sbOooO0o0.append(this.awsBucketName);
            sbOooO0o0.append(", awsProviderName=");
            sbOooO0o0.append(this.awsProviderName);
            sbOooO0o0.append(", awsIdentityId=");
            sbOooO0o0.append(this.awsIdentityId);
            sbOooO0o0.append(", awsIdentityPoolId=");
            sbOooO0o0.append(this.awsIdentityPoolId);
            sbOooO0o0.append(", awsRegion=");
            sbOooO0o0.append(this.awsRegion);
            sbOooO0o0.append(", awsToken=");
            return o00oO0o.OooO0O0(sbOooO0o0, this.awsToken, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AWSUploadInfo(@NotNull String cloudFileName, @NotNull String awsBucketName, @NotNull String awsProviderName, @NotNull String awsIdentityId, @NotNull String awsIdentityPoolId, @NotNull String awsRegion, @NotNull String awsToken) {
            super(null);
            Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
            Intrinsics.checkNotNullParameter(awsBucketName, "awsBucketName");
            Intrinsics.checkNotNullParameter(awsProviderName, "awsProviderName");
            Intrinsics.checkNotNullParameter(awsIdentityId, "awsIdentityId");
            Intrinsics.checkNotNullParameter(awsIdentityPoolId, "awsIdentityPoolId");
            Intrinsics.checkNotNullParameter(awsRegion, "awsRegion");
            Intrinsics.checkNotNullParameter(awsToken, "awsToken");
            this.cloudFileName = cloudFileName;
            this.awsBucketName = awsBucketName;
            this.awsProviderName = awsProviderName;
            this.awsIdentityId = awsIdentityId;
            this.awsIdentityPoolId = awsIdentityPoolId;
            this.awsRegion = awsRegion;
            this.awsToken = awsToken;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo$QiNiuUploadInfo;", "Lcom/yalla/support/cloudfilemanager/CloudFileUploadInfo;", "cloudFileName", "", FirebaseMessagingService.EXTRA_TOKEN, "(Ljava/lang/String;Ljava/lang/String;)V", "getCloudFileName", "()Ljava/lang/String;", "setCloudFileName", "(Ljava/lang/String;)V", "getToken", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class QiNiuUploadInfo extends CloudFileUploadInfo {

        @NotNull
        private String cloudFileName;

        @NotNull
        private final String token;

        public /* synthetic */ QiNiuUploadInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, str2);
        }

        public static /* synthetic */ QiNiuUploadInfo copy$default(QiNiuUploadInfo qiNiuUploadInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = qiNiuUploadInfo.cloudFileName;
            }
            if ((i & 2) != 0) {
                str2 = qiNiuUploadInfo.token;
            }
            return qiNiuUploadInfo.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCloudFileName() {
            return this.cloudFileName;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @NotNull
        public final QiNiuUploadInfo copy(@NotNull String cloudFileName, @NotNull String token) {
            Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
            Intrinsics.checkNotNullParameter(token, "token");
            return new QiNiuUploadInfo(cloudFileName, token);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QiNiuUploadInfo)) {
                return false;
            }
            QiNiuUploadInfo qiNiuUploadInfo = (QiNiuUploadInfo) other;
            return Intrinsics.areEqual(this.cloudFileName, qiNiuUploadInfo.cloudFileName) && Intrinsics.areEqual(this.token, qiNiuUploadInfo.token);
        }

        @NotNull
        public final String getCloudFileName() {
            return this.cloudFileName;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return this.token.hashCode() + (this.cloudFileName.hashCode() * 31);
        }

        public final void setCloudFileName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.cloudFileName = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("QiNiuUploadInfo(cloudFileName=");
            sbOooO0o0.append(this.cloudFileName);
            sbOooO0o0.append(", token=");
            return o00oO0o.OooO0O0(sbOooO0o0, this.token, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QiNiuUploadInfo(@NotNull String cloudFileName, @NotNull String token) {
            super(null);
            Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
            Intrinsics.checkNotNullParameter(token, "token");
            this.cloudFileName = cloudFileName;
            this.token = token;
        }
    }

    private CloudFileUploadInfo() {
        this.uploadType = 1;
    }

    public /* synthetic */ CloudFileUploadInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int getUploadType() {
        return this.uploadType;
    }

    public final void setUploadType(int i) {
        this.uploadType = i;
    }
}
