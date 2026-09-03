package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooOo;
import o0000O0O.Oooo000;
import o0000O0O.o000oOoO;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o0O0O0Oo;
import p028Oooo0o0.o0O0O0o0;
import p028Oooo0o0.o0O0oo0o;
import p028Oooo0o0.o0OO00OO;
import p028Oooo0o0.o0oO0O0o;
import p028Oooo0o0.oo0o0O0;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class SizeKt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo0o0O0 f5763OooO00o = new oo0o0O0(Direction.Horizontal, 1.0f, new o0O0O0Oo(1.0f));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final oo0o0O0 f5764OooO0O0 = new oo0o0O0(Direction.Vertical, 1.0f, new o0oO0O0o(1.0f));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final oo0o0O0 f5765OooO0OO = new oo0o0O0(Direction.Both, 1.0f, new o0O0oo0o(1.0f));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final o0OO00OO f5766OooO0Oo = OooO0OO(o00OO0O0.OooO00o.f4184OooOOOO, false);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final o0OO00OO f5768OooO0o0 = OooO0OO(o00OO0O0.OooO00o.f4182OooOOO, false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o0OO00OO f5767OooO0o = OooO00o(o00OO0O0.OooO00o.f4181OooOO0o, false);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final o0OO00OO f5769OooO0oO = OooO00o(o00OO0O0.OooO00o.f4180OooOO0O, false);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final o0OO00OO f5770OooO0oo = OooO0O0(o00OO0O0.OooO00o.f4175OooO0o, false);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final o0OO00OO f5762OooO = OooO0O0(o00OO0O0.OooO00o.f4172OooO0O0, false);

    public static final class OooO extends Lambda implements Function2<o000oOoO, LayoutDirection, OooOo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0.OooO0O0 f5771Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o00OO0O0.OooO0O0 oooO0O0) {
            super(2);
            this.f5771Oooo0o = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final OooOo invoke(o000oOoO o000oooo2, LayoutDirection layoutDirection) {
            long j = o000oooo2.f27322OooO00o;
            LayoutDirection layoutDirection2 = layoutDirection;
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            return new OooOo(Oooo000.OooO00o(this.f5771Oooo0o.OooO00o(0, (int) (j >> 32), layoutDirection2), 0));
        }
    }

    public static final class OooO00o extends Lambda implements Function2<o000oOoO, LayoutDirection, OooOo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0.OooO0OO f5772Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OO0O0.OooO0OO oooO0OO) {
            super(2);
            this.f5772Oooo0o = oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final OooOo invoke(o000oOoO o000oooo2, LayoutDirection layoutDirection) {
            long j = o000oooo2.f27322OooO00o;
            Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
            return new OooOo(Oooo000.OooO00o(0, this.f5772Oooo0o.OooO00o(0, o000oOoO.OooO0O0(j))));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o00O000o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0.OooO0OO f5773Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f5774Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00OO0O0.OooO0OO oooO0OO, boolean z) {
            super(1);
            this.f5773Oooo0o = oooO0OO;
            this.f5774Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00O000o o00o000o2) {
            o00O000o $receiver = o00o000o2;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Objects.requireNonNull($receiver);
            $receiver.f6462OooO0O0.OooO00o("align", this.f5773Oooo0o);
            $receiver.f6462OooO0O0.OooO00o("unbounded", Boolean.valueOf(this.f5774Oooo0oO));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<o000oOoO, LayoutDirection, OooOo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f5775Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00OO0O0 o00oo0o1) {
            super(2);
            this.f5775Oooo0o = o00oo0o1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final OooOo invoke(o000oOoO o000oooo2, LayoutDirection layoutDirection) {
            long j = o000oooo2.f27322OooO00o;
            LayoutDirection layoutDirection2 = layoutDirection;
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            return new OooOo(this.f5775Oooo0o.OooO00o(0L, j, layoutDirection2));
        }
    }

    public static final class OooO0o extends Lambda implements Function1<o00O000o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f5776Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f5777Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00OO0O0 o00oo0o1, boolean z) {
            super(1);
            this.f5776Oooo0o = o00oo0o1;
            this.f5777Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00O000o o00o000o2) {
            o00O000o $receiver = o00o000o2;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Objects.requireNonNull($receiver);
            $receiver.f6462OooO0O0.OooO00o("align", this.f5776Oooo0o);
            $receiver.f6462OooO0O0.OooO00o("unbounded", Boolean.valueOf(this.f5777Oooo0oO));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<o00O000o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0.OooO0O0 f5778Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f5779Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o00OO0O0.OooO0O0 oooO0O0, boolean z) {
            super(1);
            this.f5778Oooo0o = oooO0O0;
            this.f5779Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00O000o o00o000o2) {
            o00O000o $receiver = o00o000o2;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Objects.requireNonNull($receiver);
            $receiver.f6462OooO0O0.OooO00o("align", this.f5778Oooo0o);
            $receiver.f6462OooO0O0.OooO00o("unbounded", Boolean.valueOf(this.f5779Oooo0oO));
            return Unit.INSTANCE;
        }
    }

    @Stable
    @NotNull
    public static final o00OOOO0 OooO(float f) {
        o00OOOO0.OooO00o requiredHeight = o00OOOO0.OooO00o.f4198Oooo0o;
        Intrinsics.checkNotNullParameter(requiredHeight, "$this$requiredHeight");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o0O0O0o0 other = new o0O0O0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, false, 5);
        Intrinsics.checkNotNullParameter(other, "other");
        return other;
    }

    public static final o0OO00OO OooO00o(o00OO0O0.OooO0OO oooO0OO, boolean z) {
        return new o0OO00OO(Direction.Vertical, z, new OooO00o(oooO0OO), oooO0OO, new OooO0O0(oooO0OO, z));
    }

    public static final o0OO00OO OooO0O0(o00OO0O0 o00oo0o1, boolean z) {
        return new o0OO00OO(Direction.Both, z, new OooO0OO(o00oo0o1), o00oo0o1, new OooO0o(o00oo0o1, z));
    }

    public static final o0OO00OO OooO0OO(o00OO0O0.OooO0O0 oooO0O0, boolean z) {
        return new o0OO00OO(Direction.Horizontal, z, new OooO(oooO0O0), oooO0O0, new OooOO0(oooO0O0, z));
    }

    public static o00OOOO0 OooO0Oo(o00OOOO0 o00oooo1) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        return o00oooo1.OooOOoo(f5764OooO0O0);
    }

    public static o00OOOO0 OooO0o(o00OOOO0 o00oooo1) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        return o00oooo1.OooOOoo(f5763OooO00o);
    }

    public static o00OOOO0 OooO0o0(o00OOOO0 o00oooo1) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        return o00oooo1.OooOOoo(f5765OooO0OO);
    }

    @Stable
    @NotNull
    public static final o00OOOO0 OooO0oO(@NotNull o00OOOO0 height, float f) {
        Intrinsics.checkNotNullParameter(height, "$this$height");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return height.OooOOoo(new o0O0O0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, true, 5));
    }

    public static o00OOOO0 OooO0oo(o00OOOO0 heightIn, float f, float f2, int i) {
        float f3 = (i & 1) != 0 ? Float.NaN : f;
        float f4 = (i & 2) != 0 ? Float.NaN : f2;
        Intrinsics.checkNotNullParameter(heightIn, "$this$heightIn");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return heightIn.OooOOoo(new o0O0O0o0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f4, true, 5));
    }

    @Stable
    @NotNull
    public static final o00OOOO0 OooOO0(@NotNull o00OOOO0 size, float f) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return size.OooOOoo(new o0O0O0o0(f, f, f, f, true));
    }

    @Stable
    @NotNull
    public static final o00OOOO0 OooOO0O(@NotNull o00OOOO0 size, float f, float f2) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return size.OooOOoo(new o0O0O0o0(f, f2, f, f2, true));
    }

    @Stable
    @NotNull
    public static final o00OOOO0 OooOO0o(@NotNull o00OOOO0 width, float f) {
        Intrinsics.checkNotNullParameter(width, "$this$width");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return width.OooOOoo(new o0O0O0o0(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, true, 10));
    }

    public static o00OOOO0 OooOOO(o00OOOO0 o00oooo1) {
        o0OO00OO o0oo00ooOooO00o;
        o00OO0OO.OooO0O0 align = o00OO0O0.OooO00o.f4181OooOO0o;
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        if (Intrinsics.areEqual(align, align)) {
            o0oo00ooOooO00o = f5767OooO0o;
        } else {
            o0oo00ooOooO00o = Intrinsics.areEqual(align, o00OO0O0.OooO00o.f4180OooOO0O) ? f5769OooO0oO : OooO00o(align, false);
        }
        return o00oooo1.OooOOoo(o0oo00ooOooO00o);
    }

    public static o00OOOO0 OooOOO0(o00OOOO0 widthIn, float f, float f2, int i) {
        float f3 = (i & 1) != 0 ? Float.NaN : f;
        float f4 = (i & 2) != 0 ? Float.NaN : f2;
        Intrinsics.checkNotNullParameter(widthIn, "$this$widthIn");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return widthIn.OooOOoo(new o0O0O0o0(f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, true, 10));
    }

    public static o00OOOO0 OooOOOO(o00OOOO0 o00oooo1, o00OO0O0 align, int i) {
        o0OO00OO o0oo00ooOooO0O0;
        if ((i & 1) != 0) {
            align = o00OO0O0.OooO00o.f4175OooO0o;
        }
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        if (Intrinsics.areEqual(align, o00OO0O0.OooO00o.f4175OooO0o)) {
            o0oo00ooOooO0O0 = f5770OooO0oo;
        } else {
            o0oo00ooOooO0O0 = Intrinsics.areEqual(align, o00OO0O0.OooO00o.f4172OooO0O0) ? f5762OooO : OooO0O0(align, false);
        }
        return o00oooo1.OooOOoo(o0oo00ooOooO0O0);
    }

    public static o00OOOO0 OooOOOo(o00OO0O0.OooO0O0 align, int i) {
        o0OO00OO other;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        if ((i & 1) != 0) {
            align = o00OO0O0.OooO00o.f4184OooOOOO;
        }
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        if (Intrinsics.areEqual(align, o00OO0O0.OooO00o.f4184OooOOOO)) {
            other = f5766OooO0Oo;
        } else {
            other = Intrinsics.areEqual(align, o00OO0O0.OooO00o.f4182OooOOO) ? f5768OooO0o0 : OooO0OO(align, false);
        }
        Intrinsics.checkNotNullParameter(other, "other");
        return other;
    }
}
