package io.opentelemetry.sdk.trace.data;

import com.google.auto.value.AutoValue;
import io.opentelemetry.api.trace.StatusCode;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
abstract class ImmutableStatusData implements StatusData {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final StatusData f33544OooO00o = new AutoValue_ImmutableStatusData(StatusCode.OK, "");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final StatusData f33545OooO0O0 = new AutoValue_ImmutableStatusData(StatusCode.UNSET, "");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final StatusData f33546OooO0OO = new AutoValue_ImmutableStatusData(StatusCode.ERROR, "");

    /* JADX INFO: renamed from: io.opentelemetry.sdk.trace.data.ImmutableStatusData$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33547OooO00o;

        static {
            int[] iArr = new int[StatusCode.values().length];
            f33547OooO00o = iArr;
            try {
                iArr[StatusCode.UNSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33547OooO00o[StatusCode.OK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33547OooO00o[StatusCode.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
