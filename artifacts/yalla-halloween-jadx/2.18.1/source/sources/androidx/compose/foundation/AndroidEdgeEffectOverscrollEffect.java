package androidx.compose.foundation;

import Oooo0.o0000Ooo;
import Oooo0.o00O0OO;
import Oooo0.oo0oOO0;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import o000000.o00O0O;
import o0000O0O.o000oOoO;
import o0000O0O.o00oO0o;
import o0000O0O.o0OoOo0;
import o0000O0O.oo000o;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O00OOO;
import p100o000oOoO.o0OOO00;
import p145o00Oo0.o00000OO;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect implements oo0oOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f5510OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0OO f5511OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f5512OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f5513OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f5514OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final List<EdgeEffect> f5515OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f5516OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f5517OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f5518OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f5519OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o0O00OO<Unit> f5520OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f5521OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f5522OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f5523OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o0O00OO<Boolean> f5524OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f5525OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f5526OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Function1<o000oOoO, Unit> f5527OooOOo0;

    public static final class OooO00o extends Lambda implements Function1<o000oOoO, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000oOoO o000oooo2) {
            long j = o000oooo2.f27322OooO00o;
            boolean z = !OooOo00.OooO00o(o0OoOo0.OooO0O0(j), AndroidEdgeEffectOverscrollEffect.this.f5522OooOOO);
            AndroidEdgeEffectOverscrollEffect.this.f5522OooOOO = o0OoOo0.OooO0O0(j);
            if (z) {
                int i = (int) (j >> 32);
                AndroidEdgeEffectOverscrollEffect.this.f5512OooO0O0.setSize(i, o000oOoO.OooO0O0(j));
                AndroidEdgeEffectOverscrollEffect.this.f5513OooO0OO.setSize(i, o000oOoO.OooO0O0(j));
                AndroidEdgeEffectOverscrollEffect.this.f5514OooO0Oo.setSize(o000oOoO.OooO0O0(j), i);
                AndroidEdgeEffectOverscrollEffect.this.f5516OooO0o0.setSize(o000oOoO.OooO0O0(j), i);
                AndroidEdgeEffectOverscrollEffect.this.f5517OooO0oO.setSize(i, o000oOoO.OooO0O0(j));
                AndroidEdgeEffectOverscrollEffect.this.f5518OooO0oo.setSize(i, o000oOoO.OooO0O0(j));
                AndroidEdgeEffectOverscrollEffect.this.f5510OooO.setSize(o000oOoO.OooO0O0(j), i);
                AndroidEdgeEffectOverscrollEffect.this.f5519OooOO0.setSize(o000oOoO.OooO0O0(j), i);
            }
            if (z) {
                AndroidEdgeEffectOverscrollEffect.this.OooOO0o();
                AndroidEdgeEffectOverscrollEffect.this.OooO0oO();
            }
            return Unit.INSTANCE;
        }
    }

    public AndroidEdgeEffectOverscrollEffect(@NotNull Context context, @NotNull o00O0OO overscrollConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overscrollConfig, "overscrollConfig");
        this.f5511OooO00o = overscrollConfig;
        EdgeEffect edgeEffectOooO00o = o0000Ooo.OooO00o(context);
        this.f5512OooO0O0 = edgeEffectOooO00o;
        EdgeEffect edgeEffectOooO00o2 = o0000Ooo.OooO00o(context);
        this.f5513OooO0OO = edgeEffectOooO00o2;
        EdgeEffect edgeEffectOooO00o3 = o0000Ooo.OooO00o(context);
        this.f5514OooO0Oo = edgeEffectOooO00o3;
        EdgeEffect edgeEffectOooO00o4 = o0000Ooo.OooO00o(context);
        this.f5516OooO0o0 = edgeEffectOooO00o4;
        List<EdgeEffect> listListOf = CollectionsKt.listOf((Object[]) new EdgeEffect[]{edgeEffectOooO00o3, edgeEffectOooO00o, edgeEffectOooO00o4, edgeEffectOooO00o2});
        this.f5515OooO0o = listListOf;
        this.f5517OooO0oO = o0000Ooo.OooO00o(context);
        this.f5518OooO0oo = o0000Ooo.OooO00o(context);
        this.f5510OooO = o0000Ooo.OooO00o(context);
        this.f5519OooOO0 = o0000Ooo.OooO00o(context);
        int size = listListOf.size();
        for (int i = 0; i < size; i++) {
            listListOf.get(i).setColor(o00000OO.OooO0oO(this.f5511OooO00o.f668OooO00o));
        }
        this.f5520OooOO0O = (ParcelableSnapshotMutableState) o0OOO00.OooO0OO(Unit.INSTANCE, o0O00OOO.f29537OooO00o);
        this.f5521OooOO0o = true;
        OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
        this.f5522OooOOO = OooOo00.f30417OooO0OO;
        this.f5524OooOOOO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);
        OooO00o oooO00o2 = new OooO00o();
        this.f5527OooOOo0 = oooO00o2;
        o00OOOO0 other = Oooo0.OooO00o.f488OooO0O0;
        Intrinsics.checkNotNullParameter(other, "other");
        o00OOOO0 o00oooo0OooO00o = OnRemeasuredModifierKt.OooO00o(other, oooO00o2);
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        this.f5526OooOOo = o00oooo0OooO00o.OooOOoo(new Oooo0.o00000OO(this));
    }

    public final boolean OooO(o0Oo0oo o0oo0oo2, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        o00O0O o00o0o2 = (o00O0O) o0oo0oo2;
        canvas.translate(-OooOo00.OooO0O0(this.f5522OooOOO), o00o0o2.OoooOoo(this.f5511OooO00o.f669OooO0O0.OooO0O0(o00o0o2.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // Oooo0.oo0oOO0
    public final void OooO00o(long j, long j2, @Nullable o00O0O.OooO oooO, int i) {
        boolean z;
        boolean zIsFinished;
        boolean z2 = true;
        if (i == 1) {
            long jOooO0O0 = oooO != null ? oooO.f30395OooO00o : OooOo.OooO0O0(this.f5522OooOOO);
            if (o00O0O.OooO.OooO0OO(j2) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                OooOOO(j2, jOooO0O0);
            } else if (o00O0O.OooO.OooO0OO(j2) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                OooOOOO(j2, jOooO0O0);
            }
            if (o00O0O.OooO.OooO0Oo(j2) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                OooOOOo(j2, jOooO0O0);
            } else if (o00O0O.OooO.OooO0Oo(j2) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                OooOOO0(j2, jOooO0O0);
            }
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            z = !o00O0O.OooO.OooO00o(j2, o00O0O.OooO.f30392OooO0OO);
        } else {
            z = false;
        }
        if (this.f5514OooO0Oo.isFinished() || o00O0O.OooO.OooO0OO(j) >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            zIsFinished = false;
        } else {
            this.f5514OooO0Oo.onRelease();
            zIsFinished = this.f5514OooO0Oo.isFinished();
        }
        if (!this.f5516OooO0o0.isFinished() && o00O0O.OooO.OooO0OO(j) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f5516OooO0o0.onRelease();
            zIsFinished = zIsFinished || this.f5516OooO0o0.isFinished();
        }
        if (!this.f5512OooO0O0.isFinished() && o00O0O.OooO.OooO0Oo(j) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f5512OooO0O0.onRelease();
            zIsFinished = zIsFinished || this.f5512OooO0O0.isFinished();
        }
        if (!this.f5513OooO0OO.isFinished() && o00O0O.OooO.OooO0Oo(j) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f5513OooO0OO.onRelease();
            zIsFinished = zIsFinished || this.f5513OooO0OO.isFinished();
        }
        if (!zIsFinished && !z) {
            z2 = false;
        }
        if (z2) {
            OooOO0o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    @Override // Oooo0.oo0oOO0
    @Nullable
    public final Object OooO0O0(long j) {
        float fOooO0O0;
        EdgeEffect edgeEffect;
        int i;
        float fOooO0O1;
        boolean z;
        EdgeEffect edgeEffect2;
        int i2;
        EdgeEffect edgeEffect3;
        int i3;
        float fOooO0O2;
        boolean z2;
        EdgeEffect edgeEffect4;
        int i4;
        float fOooO0O3 = oo000o.OooO0O0(j);
        float fOooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (fOooO0O3 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            EdgeEffect edgeEffect5 = this.f5514OooO0Oo;
            Intrinsics.checkNotNullParameter(edgeEffect5, "<this>");
            int i5 = Build.VERSION.SDK_INT;
            if (!((i5 >= 31 ? Oooo0.OooO0o.f496OooO00o.OooO0O0(edgeEffect5) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                EdgeEffect edgeEffect6 = this.f5514OooO0Oo;
                int iRoundToInt = MathKt.roundToInt(oo000o.OooO0O0(j));
                Intrinsics.checkNotNullParameter(edgeEffect6, "<this>");
                if (i5 >= 31 || edgeEffect6.isFinished()) {
                    edgeEffect6.onAbsorb(iRoundToInt);
                }
                fOooO0O0 = oo000o.OooO0O0(j);
            } else if (oo000o.OooO0O0(j) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                edgeEffect = this.f5516OooO0o0;
                Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
                i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    fOooO0O1 = Oooo0.OooO0o.f496OooO00o.OooO0O0(edgeEffect);
                } else {
                    fOooO0O1 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                if (fOooO0O1 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    fOooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    edgeEffect2 = this.f5516OooO0o0;
                    i2 = -MathKt.roundToInt(oo000o.OooO0O0(j));
                    Intrinsics.checkNotNullParameter(edgeEffect2, "<this>");
                    if (i < 31 || edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb(i2);
                    }
                    fOooO0O0 = oo000o.OooO0O0(j);
                }
            } else {
                fOooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
        } else if (oo000o.OooO0O0(j) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            edgeEffect = this.f5516OooO0o0;
            Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
            i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                fOooO0O1 = Oooo0.OooO0o.f496OooO00o.OooO0O0(edgeEffect);
            } else {
                fOooO0O1 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            if (fOooO0O1 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                edgeEffect2 = this.f5516OooO0o0;
                i2 = -MathKt.roundToInt(oo000o.OooO0O0(j));
                Intrinsics.checkNotNullParameter(edgeEffect2, "<this>");
                if (i < 31) {
                    edgeEffect2.onAbsorb(i2);
                } else {
                    edgeEffect2.onAbsorb(i2);
                }
                fOooO0O0 = oo000o.OooO0O0(j);
            } else {
                fOooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
        } else {
            fOooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        if (oo000o.OooO0OO(j) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            EdgeEffect edgeEffect7 = this.f5512OooO0O0;
            Intrinsics.checkNotNullParameter(edgeEffect7, "<this>");
            int i6 = Build.VERSION.SDK_INT;
            if (!((i6 >= 31 ? Oooo0.OooO0o.f496OooO00o.OooO0O0(edgeEffect7) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                EdgeEffect edgeEffect8 = this.f5512OooO0O0;
                int iRoundToInt2 = MathKt.roundToInt(oo000o.OooO0OO(j));
                Intrinsics.checkNotNullParameter(edgeEffect8, "<this>");
                if (i6 >= 31 || edgeEffect8.isFinished()) {
                    edgeEffect8.onAbsorb(iRoundToInt2);
                }
                fOooO0OO = oo000o.OooO0OO(j);
            } else if (oo000o.OooO0OO(j) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                edgeEffect3 = this.f5513OooO0OO;
                Intrinsics.checkNotNullParameter(edgeEffect3, "<this>");
                i3 = Build.VERSION.SDK_INT;
                if (i3 >= 31) {
                    fOooO0O2 = Oooo0.OooO0o.f496OooO00o.OooO0O0(edgeEffect3);
                } else {
                    fOooO0O2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                if (fOooO0O2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    edgeEffect4 = this.f5513OooO0OO;
                    i4 = -MathKt.roundToInt(oo000o.OooO0OO(j));
                    Intrinsics.checkNotNullParameter(edgeEffect4, "<this>");
                    if (i3 < 31 || edgeEffect4.isFinished()) {
                        edgeEffect4.onAbsorb(i4);
                    }
                    fOooO0OO = oo000o.OooO0OO(j);
                }
            }
        } else if (oo000o.OooO0OO(j) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            edgeEffect3 = this.f5513OooO0OO;
            Intrinsics.checkNotNullParameter(edgeEffect3, "<this>");
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 31) {
                fOooO0O2 = Oooo0.OooO0o.f496OooO00o.OooO0O0(edgeEffect3);
            } else {
                fOooO0O2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            if (fOooO0O2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                edgeEffect4 = this.f5513OooO0OO;
                i4 = -MathKt.roundToInt(oo000o.OooO0OO(j));
                Intrinsics.checkNotNullParameter(edgeEffect4, "<this>");
                if (i3 < 31) {
                    edgeEffect4.onAbsorb(i4);
                } else {
                    edgeEffect4.onAbsorb(i4);
                }
                fOooO0OO = oo000o.OooO0OO(j);
            }
        }
        long jOooO00o = o00oO0o.OooO00o(fOooO0O0, fOooO0OO);
        oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
        if (!(jOooO00o == oo000o.f27329OooO0OO)) {
            OooOO0o();
        }
        return new oo000o(jOooO00o);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00d0  */
    @Override // Oooo0.oo0oOO0
    public final long OooO0OO(long j, @Nullable o00O0O.OooO oooO) {
        float fOooOOO0;
        float fOooOOOO;
        boolean z = this.f5523OooOOO0;
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (!z) {
            long jOooO0O0 = OooOo.OooO0O0(this.f5522OooOOO);
            if (!(o0000Ooo.OooO0O0(this.f5514OooO0Oo) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
                OooOOO(o00O0O.OooO.f30392OooO0OO, jOooO0O0);
            }
            if (!(o0000Ooo.OooO0O0(this.f5516OooO0o0) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                o00O0O.OooO.OooO00o oooO00o2 = o00O0O.OooO.f30391OooO0O0;
                OooOOOO(o00O0O.OooO.f30392OooO0OO, jOooO0O0);
            }
            if (!(o0000Ooo.OooO0O0(this.f5512OooO0O0) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                o00O0O.OooO.OooO00o oooO00o3 = o00O0O.OooO.f30391OooO0O0;
                OooOOOo(o00O0O.OooO.f30392OooO0OO, jOooO0O0);
            }
            if (!(o0000Ooo.OooO0O0(this.f5513OooO0OO) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                o00O0O.OooO.OooO00o oooO00o4 = o00O0O.OooO.f30391OooO0O0;
                OooOOO0(o00O0O.OooO.f30392OooO0OO, jOooO0O0);
            }
            this.f5523OooOOO0 = true;
        }
        long jOooO0O1 = oooO != null ? oooO.f30395OooO00o : OooOo.OooO0O0(this.f5522OooOOO);
        if (o00O0O.OooO.OooO0Oo(j) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            fOooOOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        } else {
            if (o0000Ooo.OooO0O0(this.f5512OooO0O0) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                if (o0000Ooo.OooO0O0(this.f5513OooO0OO) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    fOooOOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    fOooOOO0 = OooOOO0(j, jOooO0O1);
                    if (o0000Ooo.OooO0O0(this.f5513OooO0OO) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        this.f5513OooO0OO.onRelease();
                    }
                }
            } else {
                fOooOOO0 = OooOOOo(j, jOooO0O1);
                if (o0000Ooo.OooO0O0(this.f5512OooO0O0) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    this.f5512OooO0O0.onRelease();
                }
            }
        }
        if (!(o00O0O.OooO.OooO0OO(j) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            if (o0000Ooo.OooO0O0(this.f5514OooO0Oo) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                if (!(o0000Ooo.OooO0O0(this.f5516OooO0o0) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    fOooOOOO = OooOOOO(j, jOooO0O1);
                    if (o0000Ooo.OooO0O0(this.f5516OooO0o0) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        this.f5516OooO0o0.onRelease();
                    }
                }
            } else {
                fOooOOOO = OooOOO(j, jOooO0O1);
                if (o0000Ooo.OooO0O0(this.f5514OooO0Oo) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    this.f5514OooO0Oo.onRelease();
                }
            }
            f = fOooOOOO;
        }
        long jOooO00o = o00O0O.OooOO0.OooO00o(f, fOooOOO0);
        o00O0O.OooO.OooO00o oooO00o5 = o00O0O.OooO.f30391OooO0O0;
        if (!o00O0O.OooO.OooO00o(jOooO00o, o00O0O.OooO.f30392OooO0OO)) {
            OooOO0o();
        }
        return jOooO00o;
    }

    @Override // Oooo0.oo0oOO0
    @NotNull
    public final o00OOOO0 OooO0Oo() {
        return this.f5526OooOOo;
    }

    @Override // Oooo0.oo0oOO0
    @Nullable
    public final Object OooO0o(long j) {
        this.f5523OooOOO0 = false;
        if (oo000o.OooO0O0(j) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            EdgeEffect edgeEffect = this.f5514OooO0Oo;
            int iRoundToInt = MathKt.roundToInt(oo000o.OooO0O0(j));
            Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
            if (Build.VERSION.SDK_INT >= 31 || edgeEffect.isFinished()) {
                edgeEffect.onAbsorb(iRoundToInt);
            }
        } else if (oo000o.OooO0O0(j) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            EdgeEffect edgeEffect2 = this.f5516OooO0o0;
            int i = -MathKt.roundToInt(oo000o.OooO0O0(j));
            Intrinsics.checkNotNullParameter(edgeEffect2, "<this>");
            if (Build.VERSION.SDK_INT >= 31 || edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb(i);
            }
        }
        if (oo000o.OooO0OO(j) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            EdgeEffect edgeEffect3 = this.f5512OooO0O0;
            int iRoundToInt2 = MathKt.roundToInt(oo000o.OooO0OO(j));
            Intrinsics.checkNotNullParameter(edgeEffect3, "<this>");
            if (Build.VERSION.SDK_INT >= 31 || edgeEffect3.isFinished()) {
                edgeEffect3.onAbsorb(iRoundToInt2);
            }
        } else if (oo000o.OooO0OO(j) < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            EdgeEffect edgeEffect4 = this.f5513OooO0OO;
            int i2 = -MathKt.roundToInt(oo000o.OooO0OO(j));
            Intrinsics.checkNotNullParameter(edgeEffect4, "<this>");
            if (Build.VERSION.SDK_INT >= 31 || edgeEffect4.isFinished()) {
                edgeEffect4.onAbsorb(i2);
            }
        }
        oo000o.OooO00o oooO00o = oo000o.f27328OooO0O0;
        if (!(j == oo000o.f27329OooO0OO)) {
            OooOO0o();
        }
        OooO0oO();
        return Unit.INSTANCE;
    }

    @Override // Oooo0.oo0oOO0
    public final boolean OooO0o0() {
        List<EdgeEffect> list = this.f5515OooO0o;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
            if (!((Build.VERSION.SDK_INT >= 31 ? Oooo0.OooO0o.f496OooO00o.OooO0O0(edgeEffect) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0oO() {
        List<EdgeEffect> list = this.f5515OooO0o;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            OooOO0o();
        }
    }

    public final boolean OooO0oo(o0Oo0oo o0oo0oo2, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-OooOo00.OooO0Oo(this.f5522OooOOO), (-OooOo00.OooO0O0(this.f5522OooOOO)) + ((o00O0O) o0oo0oo2).OoooOoo(this.f5511OooO00o.f669OooO0O0.OooO00o()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean OooOO0(o0Oo0oo o0oo0oo2, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iRoundToInt = MathKt.roundToInt(OooOo00.OooO0Oo(this.f5522OooOOO));
        o00O0O o00o0o2 = (o00O0O) o0oo0oo2;
        float fOooO0OO = this.f5511OooO00o.f669OooO0O0.OooO0OO(o00o0o2.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00o0o2.OoooOoo(fOooO0OO) + (-iRoundToInt));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean OooOO0O(o0Oo0oo o0oo0oo2, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ((o00O0O) o0oo0oo2).OoooOoo(this.f5511OooO00o.f669OooO0O0.OooO0Oo()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final void OooOO0o() {
        if (this.f5521OooOO0o) {
            this.f5520OooOO0O.setValue(Unit.INSTANCE);
        }
    }

    public final float OooOOO(long j, long j2) {
        float fOooO0Oo = o00O0O.OooO.OooO0Oo(j2) / OooOo00.OooO0O0(this.f5522OooOOO);
        float fOooO0OO = o00O0O.OooO.OooO0OO(j) / OooOo00.OooO0Oo(this.f5522OooOOO);
        EdgeEffect edgeEffect = this.f5514OooO0Oo;
        float f = 1 - fOooO0Oo;
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            fOooO0OO = Oooo0.OooO0o.f496OooO00o.OooO0OO(edgeEffect, fOooO0OO, f);
        } else {
            edgeEffect.onPull(fOooO0OO, f);
        }
        return OooOo00.OooO0Oo(this.f5522OooOOO) * fOooO0OO;
    }

    public final float OooOOO0(long j, long j2) {
        float fOooO0OO = o00O0O.OooO.OooO0OO(j2) / OooOo00.OooO0Oo(this.f5522OooOOO);
        float fOooO0Oo = o00O0O.OooO.OooO0Oo(j) / OooOo00.OooO0O0(this.f5522OooOOO);
        EdgeEffect edgeEffect = this.f5513OooO0OO;
        float fOooO0OO2 = -fOooO0Oo;
        float f = 1 - fOooO0OO;
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            fOooO0OO2 = Oooo0.OooO0o.f496OooO00o.OooO0OO(edgeEffect, fOooO0OO2, f);
        } else {
            edgeEffect.onPull(fOooO0OO2, f);
        }
        return OooOo00.OooO0O0(this.f5522OooOOO) * (-fOooO0OO2);
    }

    public final float OooOOOO(long j, long j2) {
        float fOooO0Oo = o00O0O.OooO.OooO0Oo(j2) / OooOo00.OooO0O0(this.f5522OooOOO);
        float fOooO0OO = o00O0O.OooO.OooO0OO(j) / OooOo00.OooO0Oo(this.f5522OooOOO);
        EdgeEffect edgeEffect = this.f5516OooO0o0;
        float fOooO0OO2 = -fOooO0OO;
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            fOooO0OO2 = Oooo0.OooO0o.f496OooO00o.OooO0OO(edgeEffect, fOooO0OO2, fOooO0Oo);
        } else {
            edgeEffect.onPull(fOooO0OO2, fOooO0Oo);
        }
        return OooOo00.OooO0Oo(this.f5522OooOOO) * (-fOooO0OO2);
    }

    public final float OooOOOo(long j, long j2) {
        float fOooO0OO = o00O0O.OooO.OooO0OO(j2) / OooOo00.OooO0Oo(this.f5522OooOOO);
        float fOooO0Oo = o00O0O.OooO.OooO0Oo(j) / OooOo00.OooO0O0(this.f5522OooOOO);
        EdgeEffect edgeEffect = this.f5512OooO0O0;
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            fOooO0Oo = Oooo0.OooO0o.f496OooO00o.OooO0OO(edgeEffect, fOooO0Oo, fOooO0OO);
        } else {
            edgeEffect.onPull(fOooO0Oo, fOooO0OO);
        }
        return OooOo00.OooO0O0(this.f5522OooOOO) * fOooO0Oo;
    }

    @Override // Oooo0.oo0oOO0
    public final boolean isEnabled() {
        return this.f5524OooOOOO.getValue().booleanValue();
    }

    @Override // Oooo0.oo0oOO0
    public final void setEnabled(boolean z) {
        boolean z2 = this.f5525OooOOOo != z;
        this.f5524OooOOOO.setValue(Boolean.valueOf(z));
        this.f5525OooOOOo = z;
        if (z2) {
            this.f5523OooOOO0 = false;
            OooO0oO();
        }
    }
}
