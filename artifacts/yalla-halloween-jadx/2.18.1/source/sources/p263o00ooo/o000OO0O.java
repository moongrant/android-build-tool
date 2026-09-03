package p263o00ooo;

import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooO;
import o00O0O.OooOO0O;
import o00O0O.OooOOO0;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.Oooo0;
import p145o00Oo0.o000;
import p145o00Oo0.o00000O;
import p145o00Oo0.o0O0O00;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000OO0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public Oooo0 f34903Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f34904Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public o00000O f34905Oooo0oo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f34902Oooo = 1.0f;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public LayoutDirection f34906OoooO00 = LayoutDirection.Ltr;

    public static final class OooO00o extends Lambda implements Function1<o0Oo0oo, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0Oo0oo o0oo0oo2) {
            o0Oo0oo o0oo0oo3 = o0oo0oo2;
            Intrinsics.checkNotNullParameter(o0oo0oo3, "$this$null");
            o000OO0O.this.OooOO0(o0oo0oo3);
            return Unit.INSTANCE;
        }
    }

    public o000OO0O() {
        new OooO00o();
    }

    public final o000 OooO() {
        Oooo0 oooo0 = this.f34903Oooo0o;
        if (oooo0 != null) {
            return oooo0;
        }
        Oooo0 oooo1 = new Oooo0();
        this.f34903Oooo0o = oooo1;
        return oooo1;
    }

    public boolean OooO0OO(float f) {
        return false;
    }

    public boolean OooO0o(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return false;
    }

    public boolean OooO0o0(@Nullable o00000O o00000o) {
        return false;
    }

    public final void OooO0oO(@NotNull o0Oo0oo draw, long j, float f, @Nullable o00000O o00000o) {
        Intrinsics.checkNotNullParameter(draw, "$this$draw");
        if (!(this.f34902Oooo == f)) {
            if (!OooO0OO(f)) {
                if (f == 1.0f) {
                    Oooo0 oooo0 = this.f34903Oooo0o;
                    if (oooo0 != null) {
                        oooo0.OooO0O0(f);
                    }
                    this.f34904Oooo0oO = false;
                } else {
                    ((Oooo0) OooO()).OooO0O0(f);
                    this.f34904Oooo0oO = true;
                }
            }
            this.f34902Oooo = f;
        }
        if (!Intrinsics.areEqual(this.f34905Oooo0oo, o00000o)) {
            if (!OooO0o0(o00000o)) {
                if (o00000o == null) {
                    Oooo0 oooo1 = this.f34903Oooo0o;
                    if (oooo1 != null) {
                        oooo1.OooOO0o(null);
                    }
                    this.f34904Oooo0oO = false;
                } else {
                    ((Oooo0) OooO()).OooOO0o(o00000o);
                    this.f34904Oooo0oO = true;
                }
            }
            this.f34905Oooo0oo = o00000o;
        }
        LayoutDirection layoutDirection = draw.getLayoutDirection();
        if (this.f34906OoooO00 != layoutDirection) {
            OooO0o(layoutDirection);
            this.f34906OoooO00 = layoutDirection;
        }
        float fOooO0Oo = OooOo00.OooO0Oo(draw.OooO0OO()) - OooOo00.OooO0Oo(j);
        float fOooO0O0 = OooOo00.OooO0O0(draw.OooO0OO()) - OooOo00.OooO0O0(j);
        draw.Ooooo0o().OooO0Oo().OooO0o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fOooO0Oo, fOooO0O0);
        if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && OooOo00.OooO0Oo(j) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && OooOo00.OooO0O0(j) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (this.f34904Oooo0oO) {
                OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
                OooOO0O oooOO0OOooO00o = OooOOO0.OooO00o(OooO.f30392OooO0OO, OooOo.OooO00o(OooOo00.OooO0Oo(j), OooOo00.OooO0O0(j)));
                o0O0O00 o0o0o00OooO0o = draw.Ooooo0o().OooO0o();
                try {
                    o0o0o00OooO0o.OooOo00(oooOO0OOooO00o, OooO());
                    OooOO0(draw);
                    o0o0o00OooO0o.OooOOo0();
                } catch (Throwable th) {
                    o0o0o00OooO0o.OooOOo0();
                    throw th;
                }
            } else {
                OooOO0(draw);
            }
        }
        draw.Ooooo0o().OooO0Oo().OooO0o(-0.0f, -0.0f, -fOooO0Oo, -fOooO0O0);
    }

    public abstract long OooO0oo();

    public abstract void OooOO0(@NotNull o0Oo0oo o0oo0oo2);
}
