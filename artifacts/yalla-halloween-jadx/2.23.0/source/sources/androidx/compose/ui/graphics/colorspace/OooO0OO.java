package androidx.compose.ui.graphics.colorspace;

import com.common.support.apm.otlp.biz.HttpTracer;
import io.opentelemetry.context.propagation.TextMapSetter;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements DoubleFunction, TextMapSetter {
    public static Object OooO0O0() {
        T value = o000000O.OooOOo0().getValue();
        Intrinsics.checkNotNull(value);
        return value;
    }

    @Override // io.opentelemetry.context.propagation.TextMapSetter
    public void OooO00o(LinkedHashMap linkedHashMap, String str, String str2) {
        HttpTracer.m4014textMapSetter$lambda0(linkedHashMap, str, str2);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        return ColorSpaces.ExtendedSrgb$lambda$1(d);
    }
}
