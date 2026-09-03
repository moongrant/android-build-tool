package com.common.support.apm.configuration;

import androidx.annotation.Keep;
import androidx.compose.animation.OooO0O0;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002\u0015\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/common/support/apm/configuration/Configuration;", "", "()V", "domains", "", "", "getDomains", "()Ljava/util/List;", "setDomains", "(Ljava/util/List;)V", "logConfig", "Lcom/common/support/apm/configuration/Configuration$LogConfig;", "getLogConfig", "()Lcom/common/support/apm/configuration/Configuration$LogConfig;", "setLogConfig", "(Lcom/common/support/apm/configuration/Configuration$LogConfig;)V", "equals", "", "other", "hashCode", "", "Companion", "LogConfig", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Configuration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final LogConfig defaultLogConfig = new LogConfig();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @NotNull
    private static final Configuration f25default = new Configuration();

    @NotNull
    private LogConfig logConfig = defaultLogConfig;

    @NotNull
    private List<String> domains = CollectionsKt.emptyList();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/common/support/apm/configuration/Configuration$Companion;", "", "()V", NewFriendsOld.State_Default, "Lcom/common/support/apm/configuration/Configuration;", "getDefault", "()Lcom/common/support/apm/configuration/Configuration;", "defaultLogConfig", "Lcom/common/support/apm/configuration/Configuration$LogConfig;", "getDefaultLogConfig", "()Lcom/common/support/apm/configuration/Configuration$LogConfig;", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Configuration getDefault() {
            return Configuration.f25default;
        }

        @NotNull
        public final LogConfig getDefaultLogConfig() {
            return Configuration.defaultLogConfig;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00104\u001a\u00020\u0004H\u0016R\u0016\u0010\u0003\u001a\u00020\u00048FX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8FX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8FX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0016\u0010\u0013\u001a\u00020\b8FX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0016\u0010\u0019\u001a\u00020\b8FX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0016\u0010\u001b\u001a\u00020\b8FX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u0014\u0010!\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0016\u0010#\u001a\u00020\u00048FX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006R\u0016\u0010%\u001a\u00020\b8FX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\nR\u0016\u0010'\u001a\u00020\b8FX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\nR\u0016\u0010)\u001a\u00020\b8FX\u0087D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\nR\u0014\u0010+\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0016\u0010-\u001a\u00020\u000e8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0010R\u0014\u0010/\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0006¨\u00065"}, d2 = {"Lcom/common/support/apm/configuration/Configuration$LogConfig;", "", "()V", "apmLogCollectionRate", "", "getApmLogCollectionRate", "()I", "apmLogReportFileSizeK", "", "getApmLogReportFileSizeK", "()J", "apmLogReportFrequencySec", "getApmLogReportFrequencySec", RemoteConfigConstants$RequestFieldKey.APP_ID, "", "getAppId", "()Ljava/lang/String;", "buriedTag", "getBuriedTag", "checkNetFrequencySec", "getCheckNetFrequencySec", "commLogCustomReportTag", "getCommLogCustomReportTag", "commLogNetReportTag", "getCommLogNetReportTag", "commLogReportFileSizeK", "getCommLogReportFileSizeK", "commLogReportFrequencySec", "getCommLogReportFrequencySec", "commLogSecReportTag", "getCommLogSecReportTag", "downStreamUrl", "getDownStreamUrl", "lagAnalysisTag", "getLagAnalysisTag", "lagThresholdNum", "getLagThresholdNum", "lagThresholdTimeConsumeMs", "getLagThresholdTimeConsumeMs", "metricsReportFrequencySec", "getMetricsReportFrequencySec", "monitorReportFrequencySec", "getMonitorReportFrequencySec", "startOverAnalysisTag", "getStartOverAnalysisTag", "uniqueId", "getUniqueId", ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "getVersion", "equals", "", "other", "hashCode", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class LogConfig {
        private final int apmLogCollectionRate;

        @NotNull
        private final String appId = "";

        @SerializedName("userIden")
        @NotNull
        private final String uniqueId = "";
        private final long checkNetFrequencySec = 300;
        private final long apmLogReportFrequencySec = 60;
        private final long apmLogReportFileSizeK = 100;
        private final long commLogReportFrequencySec = 1800;
        private final long commLogReportFileSizeK = 100;
        private final int commLogNetReportTag = 1;
        private final int commLogSecReportTag = 1;
        private final int commLogCustomReportTag = 1;
        private final int startOverAnalysisTag = -1;
        private final int lagAnalysisTag = -1;
        private final long lagThresholdTimeConsumeMs = 3000;
        private final int lagThresholdNum = 3;
        private final long metricsReportFrequencySec = 180;

        @NotNull
        private final String downStreamUrl = "";
        private final int buriedTag = 1;

        @SerializedName("cMonitorReportFrequencySec")
        private final long monitorReportFrequencySec = 120;
        private final int version = 1;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(LogConfig.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.common.support.apm.configuration.Configuration.LogConfig");
            LogConfig logConfig = (LogConfig) other;
            return Intrinsics.areEqual(this.appId, logConfig.appId) && Intrinsics.areEqual(this.uniqueId, logConfig.uniqueId) && getCheckNetFrequencySec() == logConfig.getCheckNetFrequencySec() && getApmLogCollectionRate() == logConfig.getApmLogCollectionRate() && getApmLogReportFrequencySec() == logConfig.getApmLogReportFrequencySec() && getApmLogReportFileSizeK() == logConfig.getApmLogReportFileSizeK() && getCommLogReportFrequencySec() == logConfig.getCommLogReportFrequencySec() && getCommLogReportFileSizeK() == logConfig.getCommLogReportFileSizeK() && this.commLogNetReportTag == logConfig.commLogNetReportTag && this.commLogSecReportTag == logConfig.commLogSecReportTag && this.commLogCustomReportTag == logConfig.commLogCustomReportTag && this.startOverAnalysisTag == logConfig.startOverAnalysisTag && this.lagAnalysisTag == logConfig.lagAnalysisTag && getLagThresholdTimeConsumeMs() == logConfig.getLagThresholdTimeConsumeMs() && getLagThresholdNum() == logConfig.getLagThresholdNum() && getMetricsReportFrequencySec() == logConfig.getMetricsReportFrequencySec() && Intrinsics.areEqual(this.downStreamUrl, logConfig.downStreamUrl) && this.buriedTag == logConfig.buriedTag && getMonitorReportFrequencySec() == logConfig.getMonitorReportFrequencySec() && this.version == logConfig.version;
        }

        public final int getApmLogCollectionRate() {
            int i = this.apmLogCollectionRate;
            if (i >= 0 && i < 101) {
                return i;
            }
            return 0;
        }

        public final long getApmLogReportFileSizeK() {
            long j = this.apmLogReportFileSizeK;
            if (j > 0) {
                return j;
            }
            return 100L;
        }

        public final long getApmLogReportFrequencySec() {
            long j = this.apmLogReportFrequencySec;
            if (j > 0) {
                return j;
            }
            return 60L;
        }

        @NotNull
        public final String getAppId() {
            return this.appId;
        }

        public final int getBuriedTag() {
            return this.buriedTag;
        }

        public final long getCheckNetFrequencySec() {
            long j = this.checkNetFrequencySec;
            if (j > 0) {
                return j;
            }
            return 300L;
        }

        public final int getCommLogCustomReportTag() {
            return this.commLogCustomReportTag;
        }

        public final int getCommLogNetReportTag() {
            return this.commLogNetReportTag;
        }

        public final long getCommLogReportFileSizeK() {
            long j = this.commLogReportFileSizeK;
            if (j > 0) {
                return j;
            }
            return 100L;
        }

        public final long getCommLogReportFrequencySec() {
            long j = this.commLogReportFrequencySec;
            if (j > 0) {
                return j;
            }
            return 1800L;
        }

        public final int getCommLogSecReportTag() {
            return this.commLogSecReportTag;
        }

        @NotNull
        public final String getDownStreamUrl() {
            return this.downStreamUrl;
        }

        public final int getLagAnalysisTag() {
            return this.lagAnalysisTag;
        }

        public final int getLagThresholdNum() {
            int i = this.lagThresholdNum;
            if (i > 0) {
                return i;
            }
            return 3;
        }

        public final long getLagThresholdTimeConsumeMs() {
            long j = this.lagThresholdTimeConsumeMs;
            if (j > 0) {
                return j;
            }
            return 3000L;
        }

        public final long getMetricsReportFrequencySec() {
            long j = this.metricsReportFrequencySec;
            if (j > 0) {
                return j;
            }
            return 180L;
        }

        public final long getMonitorReportFrequencySec() {
            long j = this.monitorReportFrequencySec;
            if (j > 0) {
                return j;
            }
            return 120L;
        }

        public final int getStartOverAnalysisTag() {
            return this.startOverAnalysisTag;
        }

        @NotNull
        public final String getUniqueId() {
            return this.uniqueId;
        }

        public final int getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iOooO00o = OooO0O0.OooO00o(this.uniqueId, this.appId.hashCode() * 31, 31);
            long checkNetFrequencySec = getCheckNetFrequencySec();
            int apmLogCollectionRate = (getApmLogCollectionRate() + ((iOooO00o + ((int) (checkNetFrequencySec ^ (checkNetFrequencySec >>> 32)))) * 31)) * 31;
            long apmLogReportFrequencySec = getApmLogReportFrequencySec();
            int i = (apmLogCollectionRate + ((int) (apmLogReportFrequencySec ^ (apmLogReportFrequencySec >>> 32)))) * 31;
            long apmLogReportFileSizeK = getApmLogReportFileSizeK();
            int i2 = (i + ((int) (apmLogReportFileSizeK ^ (apmLogReportFileSizeK >>> 32)))) * 31;
            long commLogReportFrequencySec = getCommLogReportFrequencySec();
            int i3 = (i2 + ((int) (commLogReportFrequencySec ^ (commLogReportFrequencySec >>> 32)))) * 31;
            long commLogReportFileSizeK = getCommLogReportFileSizeK();
            int i4 = (((((((((((i3 + ((int) (commLogReportFileSizeK ^ (commLogReportFileSizeK >>> 32)))) * 31) + this.commLogNetReportTag) * 31) + this.commLogSecReportTag) * 31) + this.commLogCustomReportTag) * 31) + this.startOverAnalysisTag) * 31) + this.lagAnalysisTag) * 31;
            long lagThresholdTimeConsumeMs = getLagThresholdTimeConsumeMs();
            int lagThresholdNum = (getLagThresholdNum() + ((i4 + ((int) (lagThresholdTimeConsumeMs ^ (lagThresholdTimeConsumeMs >>> 32)))) * 31)) * 31;
            long metricsReportFrequencySec = getMetricsReportFrequencySec();
            int iOooO00o2 = (OooO0O0.OooO00o(this.downStreamUrl, (lagThresholdNum + ((int) (metricsReportFrequencySec ^ (metricsReportFrequencySec >>> 32)))) * 31, 31) + this.buriedTag) * 31;
            long monitorReportFrequencySec = getMonitorReportFrequencySec();
            return ((iOooO00o2 + ((int) (monitorReportFrequencySec ^ (monitorReportFrequencySec >>> 32)))) * 31) + this.version;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Configuration.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.common.support.apm.configuration.Configuration");
        Configuration configuration = (Configuration) other;
        return Intrinsics.areEqual(this.logConfig, configuration.logConfig) && Intrinsics.areEqual(this.domains, configuration.domains);
    }

    @NotNull
    public final List<String> getDomains() {
        return this.domains;
    }

    @NotNull
    public final LogConfig getLogConfig() {
        return this.logConfig;
    }

    public int hashCode() {
        return this.domains.hashCode() + (this.logConfig.hashCode() * 31);
    }

    public final void setDomains(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.domains = list;
    }

    public final void setLogConfig(@NotNull LogConfig logConfig) {
        Intrinsics.checkNotNullParameter(logConfig, "<set-?>");
        this.logConfig = logConfig;
    }
}
