package p708oo000o;

import android.graphics.PathMeasure;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o000O000;
import p145o00Oo0.o000O00O;
import p145o00Oo0.o00Oo0;
import p145o00Oo0.o00Ooo;
import p145o00Oo0.o0Oo0oo;
import p145o00Oo0.o0OoOo0;
import p191o00o0O.o000000;
import p191o00o0O.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f53074OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o0Oo0oo f53075OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public float f53076OooO0OO = 1.0f;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public List<? extends OooOOOO> f53077OooO0Oo = o00Oo0.f53217OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f53078OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f53079OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o0Oo0oo f53080OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f53081OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f53082OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f53083OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f53084OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f53085OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f53086OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f53087OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f53088OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f53089OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public o000000 f53090OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f53091OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final OooOo00 f53092OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f53093OooOo00;

    public static final class OooO00o extends Lambda implements Function0<o000O00O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f53094Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O00O invoke() {
            return new o00Oo0(new PathMeasure());
        }
    }

    public OooOOO() {
        List<OooOOOO> list = o00Oo0.f53217OooO00o;
        this.f53079OooO0o0 = 1.0f;
        this.f53081OooO0oo = 0;
        this.f53074OooO = 0;
        this.f53082OooOO0 = 4.0f;
        this.f53084OooOO0o = 1.0f;
        this.f53085OooOOO = true;
        this.f53087OooOOOO = true;
        this.f53088OooOOOo = true;
        this.f53089OooOOo = (o0OoOo0) o00Ooo.OooO00o();
        this.f53091OooOOoo = (o0OoOo0) o00Ooo.OooO00o();
        this.f53093OooOo00 = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) OooO00o.f53094Oooo0o);
        this.f53092OooOo0 = new OooOo00();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p708oo000o.OooOo
    public final void OooO00o(@NotNull p191o00o0O.o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        if (this.f53085OooOOO) {
            this.f53092OooOo0.f53187OooO00o.clear();
            this.f53089OooOOo.OooO00o();
            OooOo00 oooOo00 = this.f53092OooOo0;
            List<? extends OooOOOO> nodes = this.f53077OooO0Oo;
            Objects.requireNonNull(oooOo00);
            Intrinsics.checkNotNullParameter(nodes, "nodes");
            oooOo00.f53187OooO00o.addAll(nodes);
            oooOo00.OooO0OO(this.f53089OooOOo);
            OooO0o();
        } else if (this.f53088OooOOOo) {
            OooO0o();
        }
        this.f53085OooOOO = false;
        this.f53088OooOOOo = false;
        o0Oo0oo o0oo0oo3 = this.f53075OooO0O0;
        if (o0oo0oo3 != null) {
            o0OOO0o.OooO0oO(o0oo0oo2, this.f53091OooOOoo, o0oo0oo3, this.f53076OooO0OO, null, null, 0, 56, null);
        }
        o0Oo0oo o0oo0oo4 = this.f53080OooO0oO;
        if (o0oo0oo4 != null) {
            o000000 o000000Var = this.f53090OooOOo0;
            if (this.f53087OooOOOO || o000000Var == null) {
                o000000Var = new o000000(this.f53078OooO0o, this.f53082OooOO0, this.f53081OooO0oo, this.f53074OooO, null, 16);
                this.f53090OooOOo0 = o000000Var;
                this.f53087OooOOOO = false;
            }
            o0OOO0o.OooO0oO(o0oo0oo2, this.f53091OooOOoo, o0oo0oo4, this.f53079OooO0o0, o000000Var, null, 0, 48, null);
        }
    }

    public final void OooO0o() {
        this.f53091OooOOoo.OooO00o();
        if (this.f53083OooOO0O == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (this.f53084OooOO0o == 1.0f) {
                o000O000.OooO00o(this.f53091OooOOoo, this.f53089OooOOo, 0L, 2, null);
                return;
            }
        }
        OooO0o0().OooO0OO(this.f53089OooOOo);
        float fOooO00o = OooO0o0().OooO00o();
        float f = this.f53083OooOO0O;
        float f2 = this.f53086OooOOO0;
        float f3 = ((f + f2) % 1.0f) * fOooO00o;
        float f4 = ((this.f53084OooOO0o + f2) % 1.0f) * fOooO00o;
        if (f3 <= f4) {
            OooO0o0().OooO0O0(f3, f4, this.f53091OooOOoo);
        } else {
            OooO0o0().OooO0O0(f3, fOooO00o, this.f53091OooOOoo);
            OooO0o0().OooO0O0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f4, this.f53091OooOOoo);
        }
    }

    public final o000O00O OooO0o0() {
        return (o000O00O) this.f53093OooOo00.getValue();
    }

    @NotNull
    public final String toString() {
        return this.f53089OooOOo.toString();
    }
}
