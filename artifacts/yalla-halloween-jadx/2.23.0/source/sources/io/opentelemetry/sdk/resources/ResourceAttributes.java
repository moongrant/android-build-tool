package io.opentelemetry.sdk.resources;

import io.opentelemetry.api.common.OooO0o;
import io.opentelemetry.api.internal.InternalAttributeKeyImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class ResourceAttributes {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f33441OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f33442OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f33443OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f33444OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f33445OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final InternalAttributeKeyImpl f33446OooO0o0;

    public static final class AwsEcsLaunchtypeValues {
        private AwsEcsLaunchtypeValues() {
        }
    }

    public static final class CloudPlatformValues {
        private CloudPlatformValues() {
        }
    }

    public static final class CloudProviderValues {
        private CloudProviderValues() {
        }
    }

    public static final class HostArchValues {
        private HostArchValues() {
        }
    }

    public static final class OsTypeValues {
        private OsTypeValues() {
        }
    }

    public static final class TelemetrySdkLanguageValues {
        private TelemetrySdkLanguageValues() {
        }
    }

    static {
        OooO0o.OooO0o0("cloud.provider");
        OooO0o.OooO0o0("cloud.account.id");
        OooO0o.OooO0o0("cloud.region");
        OooO0o.OooO0o0("cloud.availability_zone");
        OooO0o.OooO0o0("cloud.platform");
        OooO0o.OooO0o0("aws.ecs.container.arn");
        OooO0o.OooO0o0("aws.ecs.cluster.arn");
        OooO0o.OooO0o0("aws.ecs.launchtype");
        OooO0o.OooO0o0("aws.ecs.task.arn");
        OooO0o.OooO0o0("aws.ecs.task.family");
        OooO0o.OooO0o0("aws.ecs.task.revision");
        OooO0o.OooO0o0("aws.eks.cluster.arn");
        OooO0o.OooO0Oo("aws.log.group.names");
        OooO0o.OooO0Oo("aws.log.group.arns");
        OooO0o.OooO0Oo("aws.log.stream.names");
        OooO0o.OooO0Oo("aws.log.stream.arns");
        OooO0o.OooO0o0("container.name");
        OooO0o.OooO0o0("container.id");
        OooO0o.OooO0o0("container.runtime");
        OooO0o.OooO0o0("container.image.name");
        OooO0o.OooO0o0("container.image.tag");
        OooO0o.OooO0o0("deployment.environment");
        OooO0o.OooO0o0("device.id");
        OooO0o.OooO0o0("device.model.identifier");
        OooO0o.OooO0o0("device.model.name");
        OooO0o.OooO0o0("faas.name");
        OooO0o.OooO0o0("faas.id");
        OooO0o.OooO0o0("faas.version");
        OooO0o.OooO0o0("faas.instance");
        OooO0o.OooO0OO("faas.max_memory");
        OooO0o.OooO0o0("host.id");
        OooO0o.OooO0o0("host.name");
        OooO0o.OooO0o0("host.type");
        OooO0o.OooO0o0("host.arch");
        OooO0o.OooO0o0("host.image.name");
        OooO0o.OooO0o0("host.image.id");
        OooO0o.OooO0o0("host.image.version");
        OooO0o.OooO0o0("k8s.cluster.name");
        OooO0o.OooO0o0("k8s.node.name");
        OooO0o.OooO0o0("k8s.node.uid");
        OooO0o.OooO0o0("k8s.namespace.name");
        OooO0o.OooO0o0("k8s.pod.uid");
        OooO0o.OooO0o0("k8s.pod.name");
        OooO0o.OooO0o0("k8s.container.name");
        OooO0o.OooO0o0("k8s.replicaset.uid");
        OooO0o.OooO0o0("k8s.replicaset.name");
        OooO0o.OooO0o0("k8s.deployment.uid");
        OooO0o.OooO0o0("k8s.deployment.name");
        OooO0o.OooO0o0("k8s.statefulset.uid");
        OooO0o.OooO0o0("k8s.statefulset.name");
        OooO0o.OooO0o0("k8s.daemonset.uid");
        OooO0o.OooO0o0("k8s.daemonset.name");
        OooO0o.OooO0o0("k8s.job.uid");
        OooO0o.OooO0o0("k8s.job.name");
        OooO0o.OooO0o0("k8s.cronjob.uid");
        OooO0o.OooO0o0("k8s.cronjob.name");
        f33441OooO00o = OooO0o.OooO0o0("os.type");
        OooO0o.OooO0o0("os.description");
        OooO0o.OooO0o0("os.name");
        f33442OooO0O0 = OooO0o.OooO0o0("os.version");
        OooO0o.OooO0OO("process.pid");
        OooO0o.OooO0o0("process.executable.name");
        OooO0o.OooO0o0("process.executable.path");
        OooO0o.OooO0o0("process.command");
        OooO0o.OooO0o0("process.command_line");
        OooO0o.OooO0Oo("process.command_args");
        OooO0o.OooO0o0("process.owner");
        OooO0o.OooO0o0("process.runtime.name");
        OooO0o.OooO0o0("process.runtime.version");
        OooO0o.OooO0o0("process.runtime.description");
        f33443OooO0OO = OooO0o.OooO0o0("service.name");
        OooO0o.OooO0o0("service.namespace");
        OooO0o.OooO0o0("service.instance.id");
        OooO0o.OooO0o0("service.version");
        f33444OooO0Oo = OooO0o.OooO0o0("telemetry.sdk.name");
        f33446OooO0o0 = OooO0o.OooO0o0("telemetry.sdk.language");
        f33445OooO0o = OooO0o.OooO0o0("telemetry.sdk.version");
        OooO0o.OooO0o0("telemetry.auto.version");
        OooO0o.OooO0o0("webengine.name");
        OooO0o.OooO0o0("webengine.version");
        OooO0o.OooO0o0("webengine.description");
    }

    private ResourceAttributes() {
    }
}
