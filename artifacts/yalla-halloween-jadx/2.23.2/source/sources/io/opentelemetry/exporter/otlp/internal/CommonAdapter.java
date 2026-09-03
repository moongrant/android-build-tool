package io.opentelemetry.exporter.otlp.internal;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.context.internal.shaded.WeakConcurrentMap;
import io.opentelemetry.proto.common.v1.AnyValue;
import io.opentelemetry.proto.common.v1.ArrayValue;
import io.opentelemetry.proto.common.v1.InstrumentationLibrary;
import io.opentelemetry.proto.common.v1.KeyValue;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes5.dex */
public final class CommonAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final WeakConcurrentMap.WithInlinedExpunction f32585OooO00o = new WeakConcurrentMap.WithInlinedExpunction();

    /* JADX INFO: renamed from: io.opentelemetry.exporter.otlp.internal.CommonAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32586OooO00o;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f32586OooO00o = iArr;
            try {
                iArr[AttributeType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32586OooO00o[AttributeType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32586OooO00o[AttributeType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32586OooO00o[AttributeType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32586OooO00o[AttributeType.BOOLEAN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32586OooO00o[AttributeType.LONG_ARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32586OooO00o[AttributeType.DOUBLE_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32586OooO00o[AttributeType.STRING_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private CommonAdapter() {
    }

    public static KeyValue OooO00o(AttributeKey<?> attributeKey, Object obj) {
        switch (AnonymousClass1.f32586OooO00o[attributeKey.getType().ordinal()]) {
            case 1:
                KeyValue.Builder builderNewBuilder = KeyValue.newBuilder();
                builderNewBuilder.OooO0O0(attributeKey.getKey());
                AnyValue.Builder builderNewBuilder2 = AnyValue.newBuilder();
                builderNewBuilder2.OooO0oO((String) obj);
                builderNewBuilder.OooO0Oo(builderNewBuilder2.build());
                return builderNewBuilder.build();
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                KeyValue.Builder builderNewBuilder3 = KeyValue.newBuilder();
                builderNewBuilder3.OooO0O0(attributeKey.getKey());
                AnyValue.Builder builderNewBuilder4 = AnyValue.newBuilder();
                builderNewBuilder4.OooO0Oo(zBooleanValue);
                builderNewBuilder3.OooO0Oo(builderNewBuilder4.build());
                return builderNewBuilder3.build();
            case 3:
                long jLongValue = ((Long) obj).longValue();
                KeyValue.Builder builderNewBuilder5 = KeyValue.newBuilder();
                builderNewBuilder5.OooO0O0(attributeKey.getKey());
                AnyValue.Builder builderNewBuilder6 = AnyValue.newBuilder();
                builderNewBuilder6.OooO0o(jLongValue);
                builderNewBuilder5.OooO0Oo(builderNewBuilder6.build());
                return builderNewBuilder5.build();
            case 4:
                double dDoubleValue = ((Double) obj).doubleValue();
                KeyValue.Builder builderNewBuilder7 = KeyValue.newBuilder();
                builderNewBuilder7.OooO0O0(attributeKey.getKey());
                AnyValue.Builder builderNewBuilder8 = AnyValue.newBuilder();
                builderNewBuilder8.OooO0o0(dDoubleValue);
                builderNewBuilder7.OooO0Oo(builderNewBuilder8.build());
                return builderNewBuilder7.build();
            case 5:
                KeyValue.Builder builderNewBuilder9 = KeyValue.newBuilder();
                builderNewBuilder9.OooO0O0(attributeKey.getKey());
                AnyValue.Builder builderNewBuilder10 = AnyValue.newBuilder();
                ArrayValue.Builder builderNewBuilder11 = ArrayValue.newBuilder();
                for (Boolean bool : (List) obj) {
                    AnyValue.Builder builderNewBuilder12 = AnyValue.newBuilder();
                    builderNewBuilder12.OooO0Oo(bool.booleanValue());
                    builderNewBuilder11.OooO0O0(builderNewBuilder12.build());
                }
                builderNewBuilder10.OooO0O0(builderNewBuilder11.build());
                builderNewBuilder9.OooO0Oo(builderNewBuilder10.build());
                return builderNewBuilder9.build();
            case 6:
                KeyValue.Builder builderNewBuilder13 = KeyValue.newBuilder();
                builderNewBuilder13.OooO0O0(attributeKey.getKey());
                AnyValue.Builder builderNewBuilder14 = AnyValue.newBuilder();
                ArrayValue.Builder builderNewBuilder15 = ArrayValue.newBuilder();
                for (Long l : (List) obj) {
                    AnyValue.Builder builderNewBuilder16 = AnyValue.newBuilder();
                    builderNewBuilder16.OooO0o(l.longValue());
                    builderNewBuilder15.OooO0O0(builderNewBuilder16.build());
                }
                builderNewBuilder14.OooO0O0(builderNewBuilder15.build());
                builderNewBuilder13.OooO0Oo(builderNewBuilder14.build());
                return builderNewBuilder13.build();
            case 7:
                KeyValue.Builder builderNewBuilder17 = KeyValue.newBuilder();
                builderNewBuilder17.OooO0O0(attributeKey.getKey());
                AnyValue.Builder builderNewBuilder18 = AnyValue.newBuilder();
                ArrayValue.Builder builderNewBuilder19 = ArrayValue.newBuilder();
                for (Double d : (List) obj) {
                    AnyValue.Builder builderNewBuilder20 = AnyValue.newBuilder();
                    builderNewBuilder20.OooO0o0(d.doubleValue());
                    builderNewBuilder19.OooO0O0(builderNewBuilder20.build());
                }
                builderNewBuilder18.OooO0O0(builderNewBuilder19.build());
                builderNewBuilder17.OooO0Oo(builderNewBuilder18.build());
                return builderNewBuilder17.build();
            case 8:
                KeyValue.Builder builderNewBuilder21 = KeyValue.newBuilder();
                builderNewBuilder21.OooO0O0(attributeKey.getKey());
                AnyValue.Builder builderNewBuilder22 = AnyValue.newBuilder();
                ArrayValue.Builder builderNewBuilder23 = ArrayValue.newBuilder();
                for (String str : (List) obj) {
                    AnyValue.Builder builderNewBuilder24 = AnyValue.newBuilder();
                    builderNewBuilder24.OooO0oO(str);
                    builderNewBuilder23.OooO0O0(builderNewBuilder24.build());
                }
                builderNewBuilder22.OooO0O0(builderNewBuilder23.build());
                builderNewBuilder21.OooO0Oo(builderNewBuilder22.build());
                return builderNewBuilder21.build();
            default:
                KeyValue.Builder builderNewBuilder25 = KeyValue.newBuilder();
                builderNewBuilder25.OooO0O0(attributeKey.getKey());
                builderNewBuilder25.OooO0Oo(AnyValue.getDefaultInstance());
                return builderNewBuilder25.build();
        }
    }

    public static InstrumentationLibrary OooO0O0(InstrumentationLibraryInfo instrumentationLibraryInfo) {
        WeakConcurrentMap.WithInlinedExpunction withInlinedExpunction = f32585OooO00o;
        InstrumentationLibrary instrumentationLibrary = (InstrumentationLibrary) withInlinedExpunction.OooO0O0(instrumentationLibraryInfo);
        if (instrumentationLibrary != null) {
            return instrumentationLibrary;
        }
        InstrumentationLibrary.Builder builderNewBuilder = InstrumentationLibrary.newBuilder();
        builderNewBuilder.OooO0O0(instrumentationLibraryInfo.OooO0O0());
        builderNewBuilder.OooO0Oo(instrumentationLibraryInfo.OooO0Oo() == null ? "" : instrumentationLibraryInfo.OooO0Oo());
        InstrumentationLibrary instrumentationLibraryBuild = builderNewBuilder.build();
        withInlinedExpunction.OooO0Oo(instrumentationLibraryInfo, instrumentationLibraryBuild);
        return instrumentationLibraryBuild;
    }
}
