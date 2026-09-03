package p032OoooO0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import o00000O.o0OO00O;
import o00O0O.OooOO0O;
import org.jetbrains.annotations.NotNull;
import p045OooooOo.o00O;
import p045OooooOo.o00OO000;
import p045OooooOo.o00OO00O;
import p045OooooOo.oOO00O;
import p100o000oOoO.o;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class oo00oO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f3404OooO0o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final o00O<oo00oO, Object> f3405OooO0oO = (o00OO000.OooO0OO) oOO00O.OooO00o(OooO00o.f3411Oooo0o, OooO0O0.f3412Oooo0o);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3406OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3407OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public OooOO0O f3408OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f3409OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3410OooO0o0;

    public static final class OooO00o extends Lambda implements Function2<o00OO00O, oo00oO, List<? extends Object>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f3411Oooo0o = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends Object> invoke(o00OO00O o00oo00o, oo00oO oo00oo) {
            o00OO00O listSaver = o00oo00o;
            oo00oO it = oo00oo;
            Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
            Intrinsics.checkNotNullParameter(it, "it");
            Object[] objArr = new Object[2];
            objArr[0] = Float.valueOf(it.OooO0O0());
            objArr[1] = Boolean.valueOf(it.OooO0OO() == Orientation.Vertical);
            return CollectionsKt.listOf(objArr);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<List<? extends Object>, oo00oO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f3412Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final oo00oO invoke(List<? extends Object> list) {
            List<? extends Object> restored = list;
            Intrinsics.checkNotNullParameter(restored, "restored");
            return new oo00oO(((Boolean) restored.get(1)).booleanValue() ? Orientation.Vertical : Orientation.Horizontal, ((Float) restored.get(0)).floatValue());
        }
    }

    public static final class OooO0OO {
    }

    public oo00oO(@NotNull Orientation initialOrientation, float f) {
        Intrinsics.checkNotNullParameter(initialOrientation, "initialOrientation");
        this.f3406OooO00o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Float.valueOf(f));
        this.f3407OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        this.f3408OooO0OO = OooOO0O.f30402OooO0o;
        o0OO00O.OooO00o oooO00o = o0OO00O.f26874OooO0O0;
        this.f3409OooO0Oo = o0OO00O.f26875OooO0OO;
        this.f3410OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0OO(initialOrientation, o.f29323OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float OooO00o() {
        return ((Number) this.f3407OooO0O0.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float OooO0O0() {
        return ((Number) this.f3406OooO00o.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Orientation OooO0OO() {
        return (Orientation) this.f3410OooO0o0.getValue();
    }

    public final void OooO0Oo(float f) {
        this.f3406OooO00o.setValue(Float.valueOf(f));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    public final void OooO0o0(@NotNull Orientation orientation, @NotNull OooOO0O cursorRect, int i, int i2) {
        boolean z;
        float f;
        float fOooO0O0;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(cursorRect, "cursorRect");
        float f4 = i2 - i;
        this.f3407OooO0O0.setValue(Float.valueOf(f4));
        float f5 = cursorRect.f30404OooO00o;
        OooOO0O oooOO0O = this.f3408OooO0OO;
        if (f5 == oooOO0O.f30404OooO00o) {
            if (!(cursorRect.f30405OooO0O0 == oooOO0O.f30405OooO0O0)) {
                if (orientation == Orientation.Vertical) {
                }
                if (z) {
                    f5 = cursorRect.f30405OooO0O0;
                }
                if (z) {
                    f = cursorRect.f30407OooO0Oo;
                } else {
                    f = cursorRect.f30406OooO0OO;
                }
                fOooO0O0 = OooO0O0();
                float f6 = i;
                f2 = fOooO0O0 + f6;
                if (f <= f2) {
                    f3 = f - f2;
                } else if (f5 < fOooO0O0) {
                    f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                OooO0Oo(OooO0O0() + f3);
                this.f3408OooO0OO = cursorRect;
            }
        } else {
            z = orientation == Orientation.Vertical;
            if (z) {
                f5 = cursorRect.f30405OooO0O0;
            }
            if (z) {
                f = cursorRect.f30407OooO0Oo;
            } else {
                f = cursorRect.f30406OooO0OO;
            }
            fOooO0O0 = OooO0O0();
            float f7 = i;
            f2 = fOooO0O0 + f7;
            if (f <= f2 || (f5 < fOooO0O0 && f - f5 > f7)) {
                f3 = f - f2;
            } else if (f5 < fOooO0O0 || f - f5 > f7) {
                f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            } else {
                f3 = f5 - fOooO0O0;
            }
            OooO0Oo(OooO0O0() + f3);
            this.f3408OooO0OO = cursorRect;
        }
        OooO0Oo(RangesKt.coerceIn(OooO0O0(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f4));
    }

    public oo00oO() {
        this(Orientation.Vertical, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }
}
