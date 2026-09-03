package io.opentelemetry.sdk.metrics.internal.view;

import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.view.InstrumentSelector;
import io.opentelemetry.sdk.metrics.view.MeterSelector;
import io.opentelemetry.sdk.metrics.view.View;
import io.opentelemetry.sdk.metrics.view.ViewBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public final class ViewRegistry {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final View f33404OooO0O0 = new ViewBuilder().OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<RegisteredView> f33405OooO00o;

    public ViewRegistry(List<RegisteredView> list) {
        this.f33405OooO00o = list;
    }

    public final List<View> OooO00o(InstrumentDescriptor instrumentDescriptor, InstrumentationLibraryInfo instrumentationLibraryInfo) {
        ArrayList arrayList = new ArrayList();
        for (RegisteredView registeredView : this.f33405OooO00o) {
            InstrumentSelector instrumentSelectorOooO00o = registeredView.OooO00o();
            boolean z = false;
            if ((instrumentSelectorOooO00o.OooO0OO() == null || instrumentSelectorOooO00o.OooO0OO() == instrumentDescriptor.OooO0Oo()) && instrumentSelectorOooO00o.OooO0O0().OooO00o(instrumentDescriptor.OooO0OO())) {
                MeterSelector meterSelectorOooO0Oo = instrumentSelectorOooO00o.OooO0Oo();
                if (meterSelectorOooO0Oo.OooO00o().OooO00o(instrumentationLibraryInfo.OooO0O0()) && meterSelectorOooO0Oo.OooO0OO().OooO00o(instrumentationLibraryInfo.OooO0Oo()) && meterSelectorOooO0Oo.OooO0O0().OooO00o(instrumentationLibraryInfo.OooO0OO())) {
                    z = true;
                }
            }
            if (z) {
                arrayList.add(registeredView.OooO0O0());
            }
        }
        return arrayList.isEmpty() ? Collections.singletonList(f33404OooO0O0) : Collections.unmodifiableList(arrayList);
    }
}
