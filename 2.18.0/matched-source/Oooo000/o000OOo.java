package Oooo000;

import androidx.compose.animation.EnterExitState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o00OO0O0;
import p023Oooo00O.o00OO0OO;
import p023Oooo00O.o0O00000;
import p023Oooo00O.oo0O;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00OO0O0<p146o00Oo0.o00O00, p023Oooo00O.o0OO00O> f887OooO00o = (o00OO0OO) oo0O.OooO00o(OooO00o.f893Oooo, OooO0O0.f894Oooo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o0O00O<Float> f888OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Float.valueOf(1.0f));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final p023Oooo00O.o00O000o<Float> f889OooO0OO = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, null, 5);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final p023Oooo00O.o00O000o<o0000O0O.OooOo> f890OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final p023Oooo00O.o00O000o<o0000O0O.o000oOoO> f891OooO0o0;

    public static final class OooO extends Lambda implements Function1<o0000O0O.o000oOoO, o0000O0O.OooOo> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f892Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f892Oooo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0000O0O.OooOo invoke(o0000O0O.o000oOoO o000oooo2) {
            return new o0000O0O.OooOo(o0000O0O.Oooo000.OooO00o(this.f892Oooo.invoke(Integer.valueOf((int) (o000oooo2.f27342OooO00o >> 32))).intValue(), 0));
        }
    }

    public static final class OooO00o extends Lambda implements Function1<p146o00Oo0.o00O00, p023Oooo00O.o0OO00O> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO00o f893Oooo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final p023Oooo00O.o0OO00O invoke(p146o00Oo0.o00O00 o00o01) {
            long j = o00o01.f32135OooO00o;
            return new p023Oooo00O.o0OO00O(p146o00Oo0.o00O00.OooO00o(j), p146o00Oo0.o00O00.OooO0O0(j));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<p023Oooo00O.o0OO00O, p146o00Oo0.o00O00> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO0O0 f894Oooo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final p146o00Oo0.o00O00 invoke(p023Oooo00O.o0OO00O o0oo00o2) {
            p023Oooo00O.o0OO00O it = o0oo00o2;
            Intrinsics.checkNotNullParameter(it, "it");
            return new p146o00Oo0.o00O00(p302o0O0Oooo.o00O0000.OooO00o(it.f1220OooO00o, it.f1221OooO0O0));
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o0000O0O.o000oOoO, o0000O0O.OooOo> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Integer> f895Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f895Oooo = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0000O0O.OooOo invoke(o0000O0O.o000oOoO o000oooo2) {
            return new o0000O0O.OooOo(o0000O0O.Oooo000.OooO00o(this.f895Oooo.invoke(Integer.valueOf((int) (o000oooo2.f27342OooO00o >> 32))).intValue(), 0));
        }
    }

    static {
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27330OooO0O0;
        f890OooO0Oo = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.OooOo(o0O00000.OooO00o()), 1);
        f891OooO0o0 = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
    }

    @Stable
    @NotNull
    public static final o000O0o OooO(@NotNull p023Oooo00O.o0000O0O<o0000O0O.OooOo> animationSpec, @NotNull Function1<? super Integer, Integer> initialOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffsetX, "initialOffsetX");
        OooO0o initialOffset = new OooO0o(initialOffsetX);
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        return new o000Oo0(new o00O0(null, new o00O00(initialOffset, animationSpec), null, null, 13));
    }

    @Stable
    @NotNull
    public static final o000O0o OooO00o(@NotNull p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> animationSpec, @NotNull p048OoooooO.o00OO0O0 expandFrom, boolean z, @NotNull Function1<? super o0000O0O.o000oOoO, o0000O0O.o000oOoO> initialSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialSize, "initialSize");
        return new o000Oo0(new o00O0(null, null, new o0OOO0o(expandFrom, initialSize, animationSpec, z), null, 11));
    }

    public static o000O0o OooO0OO() {
        p023Oooo00O.o00O000o animationSpec = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
        OoooooO.o00OO0OO.OooO0O0 expandFrom = OoooooO.o00OO0O0.OooO00o.f4200OooOOO0;
        o0000 initialHeight = o0000.f831Oooo;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(expandFrom, "expandFrom");
        Intrinsics.checkNotNullParameter(initialHeight, "initialHeight");
        return OooO00o(animationSpec, OooOO0o(expandFrom), true, new o0000O00(initialHeight));
    }

    public static o000O0o OooO0Oo(p023Oooo00O.o0000O0O animationSpec, int i) {
        if ((i & 1) != 0) {
            animationSpec = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, null, 5);
        }
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new o000Oo0(new o00O0(new o000O0Oo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, animationSpec), null, null, null, 14));
    }

    @Stable
    @NotNull
    public static final o000O00 OooO0o(@NotNull p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> animationSpec, @NotNull p048OoooooO.o00OO0O0 shrinkTowards, boolean z, @NotNull Function1<? super o0000O0O.o000oOoO, o0000O0O.o000oOoO> targetSize) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetSize, "targetSize");
        return new o000O00O(new o00O0(null, null, new o0OOO0o(shrinkTowards, targetSize, animationSpec, z), null, 11));
    }

    public static o000O00 OooO0o0(p023Oooo00O.o0000O0O animationSpec, int i) {
        if ((i & 1) != 0) {
            animationSpec = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, null, 5);
        }
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new o000O00O(new o00O0(new o000O0Oo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, animationSpec), null, null, null, 14));
    }

    public static o000O00 OooO0oo() {
        p023Oooo00O.o00O000o animationSpec = p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 400.0f, new o0000O0O.o000oOoO(o0O00000.OooO0O0()), 1);
        OoooooO.o00OO0OO.OooO0O0 shrinkTowards = OoooooO.o00OO0O0.OooO00o.f4200OooOOO0;
        o0000OO0 targetHeight = o0000OO0.f849Oooo;
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(shrinkTowards, "shrinkTowards");
        Intrinsics.checkNotNullParameter(targetHeight, "targetHeight");
        return OooO0o(animationSpec, OooOO0o(shrinkTowards), true, new o000(targetHeight));
    }

    @Stable
    @NotNull
    public static final o000O00 OooOO0(@NotNull p023Oooo00O.o0000O0O<o0000O0O.OooOo> animationSpec, @NotNull Function1<? super Integer, Integer> targetOffsetX) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffsetX, "targetOffsetX");
        OooO targetOffset = new OooO(targetOffsetX);
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        return new o000O00O(new o00O0(null, new o00O00(targetOffset, animationSpec), null, null, 13));
    }

    public static final p048OoooooO.o00OO0O0 OooOO0O(OoooooO.o00OO0O0.OooO0O0 oooO0O0) {
        if (Intrinsics.areEqual(oooO0O0, OoooooO.o00OO0O0.OooO00o.f4199OooOOO)) {
            return OoooooO.o00OO0O0.OooO00o.f4193OooO0o0;
        }
        return Intrinsics.areEqual(oooO0O0, OoooooO.o00OO0O0.OooO00o.f4202OooOOOo) ? OoooooO.o00OO0O0.OooO00o.f4194OooO0oO : OoooooO.o00OO0O0.OooO00o.f4192OooO0o;
    }

    public static final p048OoooooO.o00OO0O0 OooOO0o(OoooooO.o00OO0O0.OooO0OO oooO0OO) {
        if (Intrinsics.areEqual(oooO0OO, OoooooO.o00OO0O0.OooO00o.f4197OooOO0O)) {
            return OoooooO.o00OO0O0.OooO00o.f4190OooO0OO;
        }
        return Intrinsics.areEqual(oooO0OO, OoooooO.o00OO0O0.OooO00o.f4200OooOOO0) ? OoooooO.o00OO0O0.OooO00o.f4187OooO : OoooooO.o00OO0O0.OooO00o.f4192OooO0o;
    }
}
