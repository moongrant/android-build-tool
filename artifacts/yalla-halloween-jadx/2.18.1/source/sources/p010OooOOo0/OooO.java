package p010OooOOo0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.OooOOOO;
import androidx.activity.OooOo;
import androidx.activity.Oooo000;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o0O0O00;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o;
import p100o000oOoO.o00OO0O0;
import p100o000oOoO.o00OOOOo;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO f182OooO00o = new OooO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<OooOOOO> f183OooO0O0 = (o00OOOOo) o00OO0O0.OooO0O0(o.f29323OooO00o, OooO00o.f184Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<OooOOOO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f184Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ OooOOOO invoke() {
            return null;
        }
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final OooOOOO OooO00o(@Nullable oOO00O ooo00o) {
        ooo00o.OooO0o0(-2068013981);
        OooOOOO oooOOOO = (OooOOOO) ooo00o.OooOO0o(f183OooO0O0);
        ooo00o.OooO0o0(1680121597);
        if (oooOOOO == null) {
            View view = (View) ooo00o.OooOO0o(o0O0O00.f6594OooO0o);
            Intrinsics.checkNotNullParameter(view, "<this>");
            oooOOOO = (OooOOOO) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(view, OooOo.f4331Oooo0o), Oooo000.f4332Oooo0o));
        }
        ooo00o.Oooo0o0();
        if (oooOOOO == null) {
            Object baseContext = (Context) ooo00o.OooOO0o(o0O0O00.f6591OooO0O0);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof OooOOOO) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                Intrinsics.checkNotNullExpressionValue(baseContext, "innerContext.baseContext");
            }
            oooOOOO = (OooOOOO) baseContext;
        }
        ooo00o.Oooo0o0();
        return oooOOOO;
    }
}
