package com.common.support.apm.utils;

import com.common.support.apm.protobuf.CommonProto;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0001J\u0014\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lcom/common/support/apm/utils/ProtoTypeUtil;", "", "()V", "anyValue", "Lcom/common/support/apm/protobuf/CommonProto$AnyValue;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "stringArray", "Lcom/common/support/apm/protobuf/CommonProto$StringArray;", "values", "", "", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ProtoTypeUtil {

    @NotNull
    public static final ProtoTypeUtil INSTANCE = new ProtoTypeUtil();

    private ProtoTypeUtil() {
    }

    @Nullable
    public final CommonProto.AnyValue anyValue(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof String) {
            CommonProto.AnyValue.Builder builderNewBuilder = CommonProto.AnyValue.newBuilder();
            builderNewBuilder.setStringValue((String) value);
            return builderNewBuilder.build();
        }
        if (value instanceof Boolean) {
            CommonProto.AnyValue.Builder builderNewBuilder2 = CommonProto.AnyValue.newBuilder();
            builderNewBuilder2.setBoolValue(((Boolean) value).booleanValue());
            return builderNewBuilder2.build();
        }
        if (value instanceof Long) {
            CommonProto.AnyValue.Builder builderNewBuilder3 = CommonProto.AnyValue.newBuilder();
            builderNewBuilder3.setIntValue(((Number) value).longValue());
            return builderNewBuilder3.build();
        }
        if (!(value instanceof Double)) {
            return null;
        }
        CommonProto.AnyValue.Builder builderNewBuilder4 = CommonProto.AnyValue.newBuilder();
        builderNewBuilder4.setDoubleValue(((Number) value).doubleValue());
        return builderNewBuilder4.build();
    }

    @NotNull
    public final CommonProto.StringArray stringArray(@NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        CommonProto.StringArray.Builder builderNewBuilder = CommonProto.StringArray.newBuilder();
        builderNewBuilder.addAllValues(values);
        CommonProto.StringArray stringArrayBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(stringArrayBuild, "builder.build()");
        return stringArrayBuild;
    }
}
