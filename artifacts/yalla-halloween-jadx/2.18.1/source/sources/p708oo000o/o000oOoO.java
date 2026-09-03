package p708oo000o;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o0000O0O.o0OoOo0;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00O0;
import p100o000oOoO.o0OOO00;
import p145o00Oo0.OooOOO;
import p145o00Oo0.o000000;
import p145o00Oo0.o00000O;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o0000O0O;
import p145o00Oo0.o0000oo;
import p145o00Oo0.o0O0O00;
import p191o00o0O.o00Oo0;
import p191o00o0O.o0OOO0o;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f53194OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOO0O f53195OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f53196OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOO0 f53197OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f53198OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public Function0<Unit> f53199OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f53200OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f53201OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Function1<o0Oo0oo, Unit> f53202OooOO0;

    public static final class OooO00o extends Lambda implements Function1<o0Oo0oo, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0Oo0oo o0oo0oo2) {
            o0Oo0oo o0oo0oo3 = o0oo0oo2;
            Intrinsics.checkNotNullParameter(o0oo0oo3, "$this$null");
            o000oOoO.this.f53195OooO0O0.OooO00o(o0oo0oo3);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f53204Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000oOoO.this.OooO0o0();
            return Unit.INSTANCE;
        }
    }

    public o000oOoO() {
        OooOO0O oooOO0O = new OooOO0O();
        oooOO0O.f53067OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooOO0O.f53073OooOOo0 = true;
        oooOO0O.OooO0OO();
        oooOO0O.f53068OooOO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooOO0O.f53073OooOOo0 = true;
        oooOO0O.OooO0OO();
        oooOO0O.OooO0Oo(new OooO0OO());
        this.f53195OooO0O0 = oooOO0O;
        this.f53196OooO0OO = true;
        this.f53197OooO0Oo = new OooOO0();
        this.f53199OooO0o0 = OooO0O0.f53204Oooo0o;
        this.f53198OooO0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
        this.f53194OooO = OooOo00.f30418OooO0Oo;
        this.f53202OooOO0 = new OooO00o();
    }

    @Override // p708oo000o.OooOo
    public final void OooO00o(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        OooO0o(o0oo0oo2, 1.0f, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o(@NotNull o0Oo0oo density, float f, @Nullable o00000O o00000o) {
        Intrinsics.checkNotNullParameter(density, "<this>");
        o00000O o00000o2 = o00000o != null ? o00000o : (o00000O) this.f53198OooO0o.getValue();
        if (this.f53196OooO0OO || !OooOo00.OooO00o(this.f53194OooO, density.OooO0OO())) {
            OooOO0O oooOO0O = this.f53195OooO0O0;
            oooOO0O.f53070OooOOO0 = OooOo00.OooO0Oo(density.OooO0OO()) / this.f53200OooO0oO;
            oooOO0O.f53073OooOOo0 = true;
            oooOO0O.OooO0OO();
            OooOO0O oooOO0O2 = this.f53195OooO0O0;
            oooOO0O2.f53069OooOOO = OooOo00.OooO0O0(density.OooO0OO()) / this.f53201OooO0oo;
            oooOO0O2.f53073OooOOo0 = true;
            oooOO0O2.OooO0OO();
            OooOO0 oooOO1 = this.f53197OooO0Oo;
            long jOooO00o = o0OoOo0.OooO00o((int) Math.ceil(OooOo00.OooO0Oo(density.OooO0OO())), (int) Math.ceil(OooOo00.OooO0O0(density.OooO0OO())));
            LayoutDirection layoutDirection = density.getLayoutDirection();
            Function1<o0Oo0oo, Unit> block = this.f53202OooOO0;
            Objects.requireNonNull(oooOO1);
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(block, "block");
            oooOO1.f53055OooO0OO = density;
            o0000oo o0000ooVarOooO00o = oooOO1.f53053OooO00o;
            o0O0O00 o0o0o00OooO00o = oooOO1.f53054OooO0O0;
            if (o0000ooVarOooO00o == null || o0o0o00OooO00o == null || ((int) (jOooO00o >> 32)) > o0000ooVarOooO00o.getWidth() || o0000O0O.o000oOoO.OooO0O0(jOooO00o) > o0000ooVarOooO00o.getHeight()) {
                o0000ooVarOooO00o = o0000O0O.OooO00o((int) (jOooO00o >> 32), o0000O0O.o000oOoO.OooO0O0(jOooO00o), 0, 28);
                o0o0o00OooO00o = o000000.OooO00o(o0000ooVarOooO00o);
                oooOO1.f53053OooO00o = (p145o00Oo0.OooOo00) o0000ooVarOooO00o;
                oooOO1.f53054OooO0O0 = (OooOOO) o0o0o00OooO00o;
            }
            oooOO1.f53056OooO0Oo = jOooO00o;
            o00Oo0 o00oo1 = oooOO1.f53057OooO0o0;
            long jOooO0O0 = o0OoOo0.OooO0O0(jOooO00o);
            o00Oo0.OooO00o oooO00o = o00oo1.f33067Oooo0o;
            OooO oooO = oooO00o.f33070OooO00o;
            LayoutDirection layoutDirection2 = oooO00o.f33071OooO0O0;
            o0O0O00 o0o0o00 = oooO00o.f33072OooO0OO;
            long j = oooO00o.f33073OooO0Oo;
            Intrinsics.checkNotNullParameter(density, "<set-?>");
            oooO00o.f33070OooO00o = density;
            Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
            oooO00o.f33071OooO0O0 = layoutDirection;
            Intrinsics.checkNotNullParameter(o0o0o00OooO00o, "<set-?>");
            oooO00o.f33072OooO0OO = o0o0o00OooO00o;
            oooO00o.f33073OooO0Oo = jOooO0O0;
            OooOOO oooOOO = (OooOOO) o0o0o00OooO00o;
            oooOOO.OooO0oo();
            o00000O0.OooO00o oooO00o2 = o00000O0.f32063OooO0O0;
            o0OOO0o.OooOO0(o00oo1, o00000O0.f32064OooO0OO, 0L, 0L, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, null, 0, 62, null);
            block.invoke(o00oo1);
            oooOOO.OooOOo0();
            o00Oo0.OooO00o oooO00o3 = o00oo1.f33067Oooo0o;
            oooO00o3.OooO0O0(oooO);
            oooO00o3.OooO0OO(layoutDirection2);
            oooO00o3.OooO00o(o0o0o00);
            oooO00o3.f33073OooO0Oo = j;
            ((p145o00Oo0.OooOo00) o0000ooVarOooO00o).OooO00o();
            this.f53196OooO0OO = false;
            this.f53194OooO = density.OooO0OO();
        }
        OooOO0 oooOO2 = this.f53197OooO0Oo;
        Objects.requireNonNull(oooOO2);
        Intrinsics.checkNotNullParameter(density, "target");
        p145o00Oo0.OooOo00 oooOo00 = oooOO2.f53053OooO00o;
        if (!(oooOo00 != null)) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
        }
        o0OOO0o.OooO0Oo(density, oooOo00, 0L, oooOO2.f53056OooO0Oo, 0L, 0L, f, null, o00000o2, 0, 0, 858, null);
    }

    public final void OooO0o0() {
        this.f53196OooO0OO = true;
        this.f53199OooO0o0.invoke();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO00o = Oooo0.OooO00o("Params: ", "\tname: ");
        o00O0.OooO0OO(sbOooO00o, this.f53195OooO0O0.f53058OooO, "\n", "\tviewportWidth: ");
        sbOooO00o.append(this.f53200OooO0oO);
        sbOooO00o.append("\n");
        sbOooO00o.append("\tviewportHeight: ");
        sbOooO00o.append(this.f53201OooO0oo);
        sbOooO00o.append("\n");
        String string = sbOooO00o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
