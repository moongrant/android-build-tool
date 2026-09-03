package com.common.support.apm.xlog;

import com.common.support.apm.Sailfish;
import com.common.support.apm.logger.LogConvertor;
import com.common.support.apm.protobuf.BuriedProto;
import com.common.support.apm.protobuf.LogProto;
import com.common.support.apm.protobuf.NetDiagProto;
import com.common.support.apm.protobuf.SecDetectProto;
import com.common.support.apm.utils.ListSplitUtil;
import com.common.support.apm.utils.ProtoTypeUtil;
import com.common.support.apm.xlog.entity.MetricModel;
import com.common.support.apm.xlog.entity.TraceModel;
import com.common.support.sailfish_commons.logmodels.BaseModel;
import com.common.support.sailfish_commons.logmodels.CustomLogModel;
import com.common.support.sailfish_commons.logmodels.NetModel;
import com.common.support.sailfish_commons.logmodels.SecModel;
import com.common.support.sailfish_commons.logmodels.TrackModel;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import io.opentelemetry.exporter.otlp.internal.MetricAdapter;
import io.opentelemetry.exporter.otlp.internal.SpanAdapter;
import io.opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest;
import io.opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.trace.data.SpanData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0006H\u0016¢\u0006\u0002\u0010\tJ\u0010\u0010\u0005\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018H\u0002J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u0016\u0010 \u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¨\u0006\""}, d2 = {"Lcom/common/support/apm/xlog/XlogProtoConvertor;", "Lcom/common/support/apm/logger/LogConvertor;", "", "", "()V", "convert", "T", "Lcom/common/support/sailfish_commons/logmodels/BaseModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "(Lcom/common/support/sailfish_commons/logmodels/BaseModel;)Ljava/util/List;", "Lcom/common/support/apm/protobuf/LogProto$Log;", "logModel", "Lcom/common/support/sailfish_commons/logmodels/CustomLogModel;", "Lcom/common/support/apm/protobuf/NetDiagProto$NetDiag;", "netModel", "Lcom/common/support/sailfish_commons/logmodels/NetModel;", "Lcom/common/support/apm/protobuf/SecDetectProto$SecDetect;", "secModel", "Lcom/common/support/sailfish_commons/logmodels/SecModel;", "Lcom/common/support/apm/protobuf/BuriedProto$Buried;", "trackModel", "Lcom/common/support/sailfish_commons/logmodels/TrackModel;", "groupTraceData", "spans", "", "Lio/opentelemetry/sdk/trace/data/SpanData;", "originSpansPerGroup", "", "metricDataFromMetrics", "metrics", "Lio/opentelemetry/sdk/metrics/data/MetricData;", "traceData", "traceDataFromSpans", "Companion", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class XlogProtoConvertor implements LogConvertor<List<? extends byte[]>> {
    private static final int TRACE_GROUP_COUNT = 10;
    private static final int TYPE_APM_OLD = 400;
    private static final int TYPE_BURIED = 600;
    private static final int TYPE_LOG = 100;
    private static final int TYPE_NET_DIAG = 300;
    private static final int TYPE_OTLP_LOG = 502;
    private static final int TYPE_OTLP_METRIC = 501;
    private static final int TYPE_OTLP_TRACE = 500;
    private static final int TYPE_SEC_DETECT = 200;
    private static final int TYPE_UNKNOWN = 0;

    private final List<byte[]> groupTraceData(Collection<? extends SpanData> spans, int originSpansPerGroup) {
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            boolean z = true;
            while (true) {
                if (originSpansPerGroup <= 1 || !z) {
                    break loop0;
                }
                arrayList.clear();
                Iterator it = ListSplitUtil.INSTANCE.split(CollectionsKt.toList(spans), originSpansPerGroup).iterator();
                while (true) {
                    if (it.hasNext()) {
                        byte[] bArrTraceDataFromSpans = traceDataFromSpans((List) it.next());
                        if (bArrTraceDataFromSpans.length > XlogWriter.MAX_SIZE_OF_SINGLE_LINE_LOG) {
                            break;
                        }
                        arrayList.add(XlogFormatProtocol.INSTANCE.pack(500, bArrTraceDataFromSpans));
                    } else {
                        z = false;
                    }
                }
            }
            originSpansPerGroup /= 2;
        }
        if (originSpansPerGroup <= 1) {
            arrayList.clear();
            Iterator<T> it2 = spans.iterator();
            while (it2.hasNext()) {
                arrayList.add(XlogFormatProtocol.INSTANCE.pack(500, traceDataFromSpans(CollectionsKt.listOf((SpanData) it2.next()))));
            }
        }
        return arrayList;
    }

    private final byte[] metricDataFromMetrics(Collection<? extends MetricData> metrics) {
        ExportMetricsServiceRequest.Builder builderNewBuilder = ExportMetricsServiceRequest.newBuilder();
        MetricAdapter.f32587OooO00o.getClass();
        builderNewBuilder.OooO0O0(MetricAdapter.OooOO0(metrics));
        byte[] byteArray = builderNewBuilder.build().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "builder.build().toByteArray()");
        return byteArray;
    }

    private final List<byte[]> traceData(Collection<? extends SpanData> spans) {
        if (!spans.isEmpty() && spans.size() != 1) {
            if (spans.size() > 10) {
                return groupTraceData(spans, 10);
            }
            byte[] bArrTraceDataFromSpans = traceDataFromSpans(spans);
            return ((long) bArrTraceDataFromSpans.length) > XlogWriter.MAX_SIZE_OF_SINGLE_LINE_LOG ? groupTraceData(spans, spans.size() / 2) : CollectionsKt.listOf(XlogFormatProtocol.INSTANCE.pack(500, bArrTraceDataFromSpans));
        }
        Collection<? extends SpanData> collection = spans;
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(collection));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(XlogFormatProtocol.INSTANCE.pack(500, traceDataFromSpans(CollectionsKt.listOf((SpanData) it.next()))));
        }
        return arrayList;
    }

    private final byte[] traceDataFromSpans(Collection<? extends SpanData> spans) {
        ExportTraceServiceRequest.Builder builderNewBuilder = ExportTraceServiceRequest.newBuilder();
        builderNewBuilder.OooO0O0(SpanAdapter.OooO0Oo(spans));
        byte[] byteArray = builderNewBuilder.build().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "builder.build().toByteArray()");
        return byteArray;
    }

    @Override // com.common.support.apm.logger.LogConvertor
    @NotNull
    public <T extends BaseModel> List<? extends byte[]> convert(@NotNull T model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof CustomLogModel) {
            XlogFormatProtocol xlogFormatProtocol = XlogFormatProtocol.INSTANCE;
            byte[] byteArray = convert((CustomLogModel) model).toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "convert(model).toByteArray()");
            return CollectionsKt.listOf(xlogFormatProtocol.pack(100, byteArray));
        }
        if (model instanceof NetModel) {
            XlogFormatProtocol xlogFormatProtocol2 = XlogFormatProtocol.INSTANCE;
            byte[] byteArray2 = convert((NetModel) model).toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray2, "convert(model).toByteArray()");
            return CollectionsKt.listOf(xlogFormatProtocol2.pack(300, byteArray2));
        }
        if (model instanceof SecModel) {
            XlogFormatProtocol xlogFormatProtocol3 = XlogFormatProtocol.INSTANCE;
            byte[] byteArray3 = convert((SecModel) model).toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray3, "convert(model).toByteArray()");
            return CollectionsKt.listOf(xlogFormatProtocol3.pack(200, byteArray3));
        }
        if (model instanceof TrackModel) {
            XlogFormatProtocol xlogFormatProtocol4 = XlogFormatProtocol.INSTANCE;
            byte[] byteArray4 = convert((TrackModel) model).toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray4, "convert(model).toByteArray()");
            return CollectionsKt.listOf(xlogFormatProtocol4.pack(600, byteArray4));
        }
        if (model instanceof TraceModel) {
            return traceData(((TraceModel) model).getSpans());
        }
        if (!(model instanceof MetricModel)) {
            return CollectionsKt.listOf(XlogFormatProtocol.INSTANCE.pack(0, new byte[0]));
        }
        return CollectionsKt.listOf(XlogFormatProtocol.INSTANCE.pack(501, metricDataFromMetrics(((MetricModel) model).getMetrics())));
    }

    private final LogProto.Log convert(CustomLogModel logModel) {
        LogProto.Log.Builder builderNewBuilder = LogProto.Log.newBuilder();
        builderNewBuilder.setIden(logModel.getIden());
        builderNewBuilder.setMessage(logModel.getMessage());
        builderNewBuilder.setLevel(logModel.getLevel());
        builderNewBuilder.setTime(logModel.getTime());
        builderNewBuilder.setAppVersion(logModel.getAppVersion());
        builderNewBuilder.setNetworkAvailable(logModel.getNetworkAvailable());
        builderNewBuilder.setNetworkType(logModel.getNetworkType());
        builderNewBuilder.setTag(logModel.getTag());
        for (Map.Entry<String, Object> entry : logModel.getParams().entrySet()) {
            builderNewBuilder.putParams(entry.getKey(), ProtoTypeUtil.INSTANCE.anyValue(entry.getValue()));
        }
        for (Map.Entry<String, Object> entry2 : logModel.getOpsExpand().entrySet()) {
            builderNewBuilder.putOpsExpand(entry2.getKey(), ProtoTypeUtil.INSTANCE.anyValue(entry2.getValue()));
        }
        builderNewBuilder.setDoneAtTime(logModel.getDoneAtTime());
        LogProto.Log logBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(logBuild, "builder.build()");
        return logBuild;
    }

    private final NetDiagProto.NetDiag convert(NetModel netModel) {
        NetDiagProto.NetDiag.Builder builderNewBuilder = NetDiagProto.NetDiag.newBuilder();
        builderNewBuilder.setIden(netModel.getIden());
        builderNewBuilder.setStartTime(netModel.getStartTime());
        builderNewBuilder.setEndTime(netModel.getEndTime());
        builderNewBuilder.setUserId(netModel.getUserId());
        builderNewBuilder.setDevice(netModel.getDevice());
        builderNewBuilder.setVersion(netModel.getVersion());
        builderNewBuilder.setCountry(netModel.getCountry());
        builderNewBuilder.setNetwork(netModel.getNetwork());
        if (!StringsKt.isBlank(netModel.getUpload())) {
            builderNewBuilder.putSpeedTest("upload", netModel.getUpload());
        }
        if (!StringsKt.isBlank(netModel.getDownload())) {
            builderNewBuilder.putSpeedTest("download", netModel.getDownload());
        }
        List<String> operator = netModel.getOperator();
        if (operator != null) {
            builderNewBuilder.addAllOperator(operator);
        }
        List<String> publicIp = netModel.getPublicIp();
        if (publicIp != null) {
            builderNewBuilder.addAllPublicIp(publicIp);
        }
        List<String> dns = netModel.getDns();
        if (dns != null) {
            builderNewBuilder.addAllDNS(dns);
        }
        Map<String, List<String>> resolution = netModel.getResolution();
        if (resolution != null) {
            for (Map.Entry<String, List<String>> entry : resolution.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (!(value == null || value.isEmpty())) {
                    builderNewBuilder.putResolution(key, ProtoTypeUtil.INSTANCE.stringArray(value));
                }
            }
        }
        Map<String, List<String>> icmpPing = netModel.getIcmpPing();
        if (icmpPing != null) {
            for (Map.Entry<String, List<String>> entry2 : icmpPing.entrySet()) {
                String key2 = entry2.getKey();
                List<String> value2 = entry2.getValue();
                if (!(value2 == null || value2.isEmpty())) {
                    builderNewBuilder.putICMPPing(key2, ProtoTypeUtil.INSTANCE.stringArray(value2));
                }
            }
        }
        Map<String, List<String>> tcpPing = netModel.getTcpPing();
        if (tcpPing != null) {
            for (Map.Entry<String, List<String>> entry3 : tcpPing.entrySet()) {
                String key3 = entry3.getKey();
                List<String> value3 = entry3.getValue();
                if (!(value3 == null || value3.isEmpty())) {
                    builderNewBuilder.putTCPPing(key3, ProtoTypeUtil.INSTANCE.stringArray(value3));
                }
            }
        }
        Map<String, List<String>> traceRoute = netModel.getTraceRoute();
        if (traceRoute != null) {
            for (Map.Entry<String, List<String>> entry4 : traceRoute.entrySet()) {
                String key4 = entry4.getKey();
                List<String> value4 = entry4.getValue();
                if (!(value4 == null || value4.isEmpty())) {
                    builderNewBuilder.putTraceroute(key4, ProtoTypeUtil.INSTANCE.stringArray(value4));
                }
            }
        }
        builderNewBuilder.setDoneAtTime(netModel.getDoneAtTime());
        NetDiagProto.NetDiag netDiagBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(netDiagBuild, "builder.build()");
        return netDiagBuild;
    }

    private final SecDetectProto.SecDetect convert(SecModel secModel) {
        SecDetectProto.SecDetect.Builder builderNewBuilder = SecDetectProto.SecDetect.newBuilder();
        builderNewBuilder.setIden(secModel.getIden());
        builderNewBuilder.setTime(secModel.getTime());
        builderNewBuilder.setUserId(secModel.getUserId());
        builderNewBuilder.setVersion(secModel.getVersion());
        builderNewBuilder.setDevice(secModel.getDevice());
        builderNewBuilder.setDebug(secModel.getDebug());
        builderNewBuilder.setEmulator(secModel.getEmulator());
        builderNewBuilder.setFishHook(secModel.getFishHook());
        builderNewBuilder.setFileIntegrity(secModel.getFileIntegrity());
        builderNewBuilder.setReserveTool(secModel.getReserveTool());
        builderNewBuilder.setRuntimeHook(secModel.getRuntimeHook());
        builderNewBuilder.setMsHookFun(secModel.getMsHookFun());
        builderNewBuilder.setAppInstallS(secModel.getAppInstallS());
        builderNewBuilder.setRoot(secModel.getRoot());
        builderNewBuilder.setVPN(secModel.getVpn());
        builderNewBuilder.setInjection(secModel.getInjection());
        builderNewBuilder.setXposed(secModel.getXposed());
        builderNewBuilder.setFrida(secModel.getFrida());
        builderNewBuilder.setSubstrate(secModel.getSubstrate());
        builderNewBuilder.setWifiProxy(secModel.getWifiProxy());
        builderNewBuilder.setPtrace(secModel.getPtrace());
        builderNewBuilder.setAppVirtual(secModel.getAppVirtual());
        builderNewBuilder.setSensor(secModel.getSensor());
        builderNewBuilder.setHasFlash(secModel.getHasFlash());
        List<Integer> attachPort = secModel.getAttachPort();
        if (attachPort != null) {
            builderNewBuilder.addAllAttachPort(attachPort);
        }
        builderNewBuilder.setUSB(secModel.getUsb());
        builderNewBuilder.setLightSensor(secModel.getLightSensor());
        builderNewBuilder.setAccessibilityS(secModel.getAccessibilityS());
        builderNewBuilder.setLanguage(secModel.getLanguage());
        builderNewBuilder.setNetworkType(secModel.getNetworkType());
        builderNewBuilder.setTimeZone(secModel.getTimeZone());
        builderNewBuilder.setAppVirtualPkg(secModel.getAppVirtualPkg());
        builderNewBuilder.setHasSim(secModel.getHasSim());
        builderNewBuilder.setReserveToolName(secModel.getReserveToolName());
        builderNewBuilder.setMagisk(secModel.getMagisk());
        builderNewBuilder.setInlineHook(secModel.getInlineHook());
        builderNewBuilder.setZygisk(secModel.getZygisk());
        builderNewBuilder.setCertMD5(secModel.getCertMD5());
        builderNewBuilder.setAntiBypassJailbreak(secModel.getAntiBypassJailbreak());
        builderNewBuilder.setReSignature(secModel.getReSignature());
        builderNewBuilder.setDoneAtTime(secModel.getDoneAtTime());
        builderNewBuilder.setRiskFile(secModel.getRiskFile());
        builderNewBuilder.setAcsPackages(secModel.getAcsPackages());
        builderNewBuilder.setBootId(secModel.getBootId());
        builderNewBuilder.setSmid(secModel.getSmid());
        SecDetectProto.SecDetect secDetectBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(secDetectBuild, "builder.build()");
        return secDetectBuild;
    }

    private final BuriedProto.Buried convert(TrackModel trackModel) {
        BuriedProto.Buried.Builder builderNewBuilder = BuriedProto.Buried.newBuilder();
        builderNewBuilder.setSessionId(Sailfish.INSTANCE.getSessionId$sailfish_release());
        builderNewBuilder.setUuid(trackModel.getUuid());
        builderNewBuilder.setUserId(trackModel.getUserId());
        builderNewBuilder.setOsVersion(trackModel.getOsVersion());
        builderNewBuilder.setEventTime(trackModel.getEventTime());
        builderNewBuilder.setUrl(trackModel.getUrl());
        builderNewBuilder.setEventId(trackModel.getEventId());
        builderNewBuilder.setEventName(trackModel.getEventName());
        builderNewBuilder.setEventType(trackModel.getEventType());
        builderNewBuilder.setAppName(trackModel.getAppName());
        builderNewBuilder.setAppVersion(trackModel.getAppVersion());
        builderNewBuilder.setAppChannel(trackModel.getAppChannel());
        builderNewBuilder.setAppEnv(trackModel.getAppEnv());
        builderNewBuilder.setNetworkType(trackModel.getNetworkType());
        builderNewBuilder.setDeviceBrand(trackModel.getDeviceBrand());
        builderNewBuilder.setDeviceModel(trackModel.getDeviceModel());
        builderNewBuilder.setCarrier(trackModel.getCarrier());
        for (Map.Entry<String, Object> entry : trackModel.getExtInfo().entrySet()) {
            builderNewBuilder.putExtInfo(entry.getKey(), ProtoTypeUtil.INSTANCE.anyValue(entry.getValue()));
        }
        builderNewBuilder.setDoneAtTime(trackModel.getDoneAtTime());
        BuriedProto.Buried buriedBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(buriedBuild, "builder.build()");
        return buriedBuild;
    }
}
