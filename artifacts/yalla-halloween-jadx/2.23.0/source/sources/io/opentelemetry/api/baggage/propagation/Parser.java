package io.opentelemetry.api.baggage.propagation;

/* JADX INFO: loaded from: classes5.dex */
class Parser {

    /* JADX INFO: renamed from: io.opentelemetry.api.baggage.propagation.Parser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33026OooO00o;

        static {
            int[] iArr = new int[State.values().length];
            f33026OooO00o = iArr;
            try {
                iArr[State.VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33026OooO00o[State.META.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33026OooO00o[State.KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum State {
        KEY,
        VALUE,
        META
    }
}
