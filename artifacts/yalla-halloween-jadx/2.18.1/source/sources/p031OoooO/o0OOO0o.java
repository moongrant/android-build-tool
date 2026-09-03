package p031OoooO;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O0.o0OO00O;
import o00000O0.o0ooOOo;
import o00O0O.OooOo00;
import o0O0O00.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.OooOOO0;
import p145o00Oo0.o00000O;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;
import p263o00ooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00OOOO0 f2890OooO00o;

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f2891Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000OO0O f2892Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f2893Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f2894Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f2895OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f2896OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000OO0O o000oo0o2, String str, o00OOOO0 o00oooo1, long j, int i, int i2) {
            super(2);
            this.f2892Oooo0o = o000oo0o2;
            this.f2893Oooo0oO = str;
            this.f2894Oooo0oo = o00oooo1;
            this.f2891Oooo = j;
            this.f2896OoooO00 = i;
            this.f2895OoooO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0OOO0o.OooO00o(this.f2892Oooo0o, this.f2893Oooo0oO, this.f2894Oooo0oo, this.f2891Oooo, ooo00o, this.f2896OoooO00 | 1, this.f2895OoooO0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0OO00O, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f2897Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str) {
            super(1);
            this.f2897Oooo0o = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0OO00O o0oo00o2) {
            o0OO00O semantics = o0oo00o2;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            o0ooOOo.OooO0oO(semantics, this.f2897Oooo0o);
            o0ooOOo.OooOO0(semantics, 5);
            return Unit.INSTANCE;
        }
    }

    static {
        int i = o00OOOO0.f4197OooO00o;
        f2890OooO00o = SizeKt.OooOO0(o00OOOO0.OooO00o.f4198Oooo0o, 24);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull o000OO0O painter, @Nullable String str, @Nullable o00OOOO0 o00oooo1, long j, @Nullable oOO00O ooo00o, int i, int i2) {
        o00000O o00000o;
        o00OOOO0 o00oooo0OooO00o;
        o00OOOO0 o00oooo2;
        Intrinsics.checkNotNullParameter(painter, "painter");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1142959010);
        o00OOOO0 o00oooo3 = (i2 & 4) != 0 ? o00OOOO0.OooO00o.f4198Oooo0o : o00oooo1;
        long jOooO0OO = (i2 & 8) != 0 ? o00000O0.OooO0OO(((o00000O0) ooo00oOooOOo.OooOO0o(Oooo000.f2594OooO00o)).f32070OooO00o, ((Number) ooo00oOooOOo.OooOO0o(OooOo.f2588OooO00o)).floatValue()) : j;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        if (o00000O0.OooO0Oo(jOooO0OO, o00000O0.f32062OooO)) {
            o00000o = null;
        } else {
            o00000o = new o00000O(Build.VERSION.SDK_INT >= 29 ? p145o00Oo0.o0ooOOo.f32150OooO00o.OooO00o(jOooO0OO, 5) : new PorterDuffColorFilter(o00000OO.OooO0oO(jOooO0OO), OooOOO0.OooO0O0(5)));
        }
        ooo00oOooOOo.OooO0o0(1547385429);
        if (str != null) {
            o00OOOO0.OooO00o oooO00o2 = o00OOOO0.OooO00o.f4198Oooo0o;
            ooo00oOooOOo.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(str);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new OooO0O0(str);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o00oooo0OooO00o = SemanticsModifierKt.OooO00o(oooO00o2, false, (Function1) objOooO0o);
        } else {
            o00oooo0OooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        }
        o00OOOO0 o00oooo4 = o00oooo0OooO00o;
        ooo00oOooOOo.Oooo0o0();
        Intrinsics.checkNotNullParameter(o00oooo3, "<this>");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        long jOooO0oo = painter.OooO0oo();
        OooOo00.OooO00o oooO00o3 = OooOo00.f30416OooO0O0;
        if (OooOo00.OooO00o(jOooO0oo, OooOo00.f30418OooO0Oo)) {
            o00oooo2 = f2890OooO00o;
        } else {
            long jOooO0oo2 = painter.OooO0oo();
            if (Float.isInfinite(OooOo00.OooO0Oo(jOooO0oo2)) && Float.isInfinite(OooOo00.OooO0O0(jOooO0oo2))) {
                o00oooo2 = f2890OooO00o;
            } else {
                o00oooo2 = o00OOOO0.OooO00o.f4198Oooo0o;
            }
        }
        p028Oooo0o0.oOO00O.OooO00o(p442o0OoOo0.o0OOO0o.OooO00o(o00oooo3.OooOOoo(o00oooo2), painter, null, OooOO0.OooO00o.f35239OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00000o, 22).OooOOoo(o00oooo4), ooo00oOooOOo, 0);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(painter, str, o00oooo3, jOooO0OO, i, i2));
    }
}
