package androidx.compose.runtime;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import kotlin.KotlinNothingValueException;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements o00000O0.OooO00o {
    public /* synthetic */ OooO0o(AnalyticsListener.OooO00o oooO00o, String str, long j, long j2) {
    }

    public static KotlinNothingValueException OooO00o(String str) {
        ComposerKt.composeRuntimeError(str.toString());
        return new KotlinNothingValueException();
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.o0OoOo0();
        analyticsListener.o00ooo();
    }
}
