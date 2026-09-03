package io.opentelemetry.api.baggage.propagation;

import java.util.BitSet;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
class Element {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final BitSet f33024OooO00o = new BitSet(128);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final BitSet f33025OooO0O0 = new BitSet(128);

    static {
        char[] cArr = {'(', ')', Typography.less, Typography.greater, '@', ',', ';', ':', '\\', Typography.quote, '/', '[', ']', '?', '=', '{', '}'};
        for (int i = 0; i < 17; i++) {
            f33024OooO00o.set(cArr[i]);
        }
        char[] cArr2 = {Typography.quote, ',', ';', '\\'};
        for (int i2 = 0; i2 < 4; i2++) {
            f33025OooO0O0.set(cArr2[i2]);
        }
    }
}
