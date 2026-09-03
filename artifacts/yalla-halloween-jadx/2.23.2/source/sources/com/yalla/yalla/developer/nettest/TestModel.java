package com.yalla.yalla.developer.nettest;

import OooO0OO.OooO0O0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/developer/nettest/TestModel;", "Ljava/io/Serializable;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class TestModel implements Serializable {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public transient MutableStateFlow<String> f22907OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public String f22905OooO0Oo = "";

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public transient MutableState<String> f22906OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final String f22908OooO0oO = "bingfeng";

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final transient MutableStateFlow<String> f22909OooO0oo = StateFlowKt.MutableStateFlow("liveData");

    @NotNull
    public final String OooO00o() {
        if (this.f22906OooO0o == null) {
            this.f22906OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(this.f22905OooO0Oo, null, 2, null);
        }
        String str = this.f22905OooO0Oo;
        MutableState<String> mutableState = this.f22906OooO0o;
        Intrinsics.checkNotNull(mutableState);
        if (!Intrinsics.areEqual(str, mutableState.getValue())) {
            MutableState<String> mutableState2 = this.f22906OooO0o;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(this.f22905OooO0Oo);
        }
        if (this.f22907OooO0o0 == null) {
            this.f22907OooO0o0 = StateFlowKt.MutableStateFlow(this.f22905OooO0Oo);
        }
        String str2 = this.f22905OooO0Oo;
        MutableStateFlow<String> mutableStateFlow = this.f22907OooO0o0;
        Intrinsics.checkNotNull(mutableStateFlow);
        if (!Intrinsics.areEqual(str2, mutableStateFlow.getValue())) {
            MutableStateFlow<String> mutableStateFlow2 = this.f22907OooO0o0;
            Intrinsics.checkNotNull(mutableStateFlow2);
            mutableStateFlow2.setValue(this.f22905OooO0Oo);
        }
        MutableState<String> mutableState3 = this.f22906OooO0o;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue();
    }

    @NotNull
    public final String toString() {
        if (this.f22907OooO0o0 == null) {
            OooO00o();
        }
        MutableStateFlow<String> mutableStateFlow = this.f22907OooO0o0;
        Intrinsics.checkNotNull(mutableStateFlow);
        String value = mutableStateFlow.getValue();
        MutableState<String> mutableState = this.f22906OooO0o;
        String value2 = mutableState != null ? mutableState.getValue() : null;
        MutableStateFlow<String> mutableStateFlow2 = this.f22909OooO0oo;
        String value3 = mutableStateFlow2 != null ? mutableStateFlow2.getValue() : null;
        String strOooO00o = OooO00o();
        StringBuilder sb = new StringBuilder("TestModel(nameStateFlow=");
        sb.append((Object) value);
        sb.append(", _name=");
        sb.append(value2);
        sb.append(", name2='");
        OooO0O0.OooO00o(sb, this.f22908OooO0oO, "', age=0, testLiveData=", value3, ")+  ");
        sb.append(strOooO00o);
        return sb.toString();
    }
}
