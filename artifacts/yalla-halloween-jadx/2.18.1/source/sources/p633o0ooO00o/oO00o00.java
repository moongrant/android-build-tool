package p633o0ooO00o;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import dev.chrisbanes.snapper.ExperimentalSnapperApi;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o0000;
import p023Oooo00O.o00000OO;
import p027Oooo0o.o0000Ooo;
import p027Oooo0o.o000O00O;
import p027Oooo0o.oo000o;
import p100o000oOoO.o00OOO00;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@ExperimentalSnapperApi
public final class oO00o00 extends oOo000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O00O f48826OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function2<oOo000Oo, oOo0000O, Integer> f48827OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48828OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f48829OooO0Oo;

    public /* synthetic */ class OooO00o extends FunctionReferenceImpl implements Function1<oo000o, oO0OOO00> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f48830Oooo0o = new OooO00o();

        public OooO00o() {
            super(1, oO0OOO00.class, "<init>", "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final oO0OOO00 invoke(oo000o oo000oVar) {
            oo000o p0 = oo000oVar;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return new oO0OOO00(p0);
        }
    }

    public oO00o00(o000O00O lazyListState, Function2 snapOffsetForItem) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(snapOffsetForItem, "snapOffsetForItem");
        this.f48826OooO00o = lazyListState;
        this.f48827OooO0O0 = snapOffsetForItem;
        this.f48828OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0);
        this.f48829OooO0Oo = (o00OOO00) o0OOO00.OooO0O0(new oO00o000(this));
    }

    public final float OooO() {
        Object next;
        o0000Ooo o0000oooOooO0oO = this.f48826OooO00o.OooO0oO();
        if (o0000oooOooO0oO.OooO0O0().isEmpty()) {
            return -1.0f;
        }
        Iterator<T> it = o0000oooOooO0oO.OooO0O0().iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iOooO00o = ((oo000o) next).OooO00o();
                do {
                    Object next3 = it.next();
                    int iOooO00o2 = ((oo000o) next3).OooO00o();
                    if (iOooO00o > iOooO00o2) {
                        next = next3;
                        iOooO00o = iOooO00o2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        oo000o oo000oVar = (oo000o) next;
        if (oo000oVar == null) {
            return -1.0f;
        }
        Iterator<T> it2 = o0000oooOooO0oO.OooO0O0().iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                oo000o oo000oVar2 = (oo000o) next2;
                int size = oo000oVar2.getSize() + oo000oVar2.OooO00o();
                do {
                    Object next4 = it2.next();
                    oo000o oo000oVar3 = (oo000o) next4;
                    int size2 = oo000oVar3.getSize() + oo000oVar3.OooO00o();
                    if (size < size2) {
                        next2 = next4;
                        size = size2;
                    }
                } while (it2.hasNext());
            }
        }
        oo000o oo000oVar4 = (oo000o) next2;
        if (oo000oVar4 == null) {
            return -1.0f;
        }
        int iMax = Math.max(oo000oVar.getSize() + oo000oVar.OooO00o(), oo000oVar4.getSize() + oo000oVar4.OooO00o()) - Math.min(oo000oVar.OooO00o(), oo000oVar4.OooO00o());
        if (iMax == 0) {
            return -1.0f;
        }
        o0000Ooo o0000oooOooO0oO2 = this.f48826OooO00o.OooO0oO();
        int iOooO00o3 = 0;
        if (o0000oooOooO0oO2.OooO0O0().size() >= 2) {
            oo000o oo000oVar5 = o0000oooOooO0oO2.OooO0O0().get(0);
            iOooO00o3 = o0000oooOooO0oO2.OooO0O0().get(1).OooO00o() - (oo000oVar5.OooO00o() + oo000oVar5.getSize());
        }
        return (iMax + iOooO00o3) / o0000oooOooO0oO.OooO0O0().size();
    }

    @Override // p633o0ooO00o.oOo000Oo
    public final boolean OooO00o() {
        oo000o oo000oVar = (oo000o) CollectionsKt.lastOrNull((List) this.f48826OooO00o.OooO0oO().OooO0O0());
        if (oo000oVar != null) {
            if (oo000oVar.getIndex() < OooOO0() - 1) {
                return true;
            }
            if (oo000oVar.getSize() + oo000oVar.OooO00o() > OooO0o()) {
                return true;
            }
        }
        return false;
    }

    @Override // p633o0ooO00o.oOo000Oo
    public final boolean OooO0O0() {
        oo000o oo000oVar = (oo000o) CollectionsKt.firstOrNull((List) this.f48826OooO00o.OooO0oO().OooO0O0());
        if (oo000oVar == null) {
            return false;
        }
        return oo000oVar.getIndex() > 0 || oo000oVar.OooO00o() < 0;
    }

    @Override // p633o0ooO00o.oOo000Oo
    public final int OooO0OO(float f, @NotNull o00000OO<Float> decayAnimationSpec, float f2) {
        Intrinsics.checkNotNullParameter(decayAnimationSpec, "decayAnimationSpec");
        oOo0000O ooo0000oOooO0o0 = OooO0o0();
        if (ooo0000oOooO0o0 == null) {
            return -1;
        }
        float fOooO = OooO();
        if (fOooO <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return ooo0000oOooO0o0.OooO00o();
        }
        int iOooO0Oo = OooO0Oo(ooo0000oOooO0o0.OooO00o());
        int iOooO0Oo2 = OooO0Oo(ooo0000oOooO0o0.OooO00o() + 1);
        if (Math.abs(f) < 0.5f) {
            return RangesKt.coerceIn(Math.abs(iOooO0Oo) < Math.abs(iOooO0Oo2) ? ooo0000oOooO0o0.OooO00o() : ooo0000oOooO0o0.OooO00o() + 1, 0, OooOO0() - 1);
        }
        float fCoerceIn = RangesKt.coerceIn(o0000.OooO00o(decayAnimationSpec, f), -f2, f2);
        double d = fOooO;
        return RangesKt.coerceIn(ooo0000oOooO0o0.OooO00o() + MathKt.roundToInt((((double) (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? RangesKt.coerceAtMost(fCoerceIn + iOooO0Oo2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) : RangesKt.coerceAtLeast(fCoerceIn + iOooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))) / d) - (((double) iOooO0Oo) / d)), 0, OooOO0() - 1);
    }

    @Override // p633o0ooO00o.oOo000Oo
    public final int OooO0Oo(int i) {
        oOo0000O next;
        Iterator<oOo0000O> it = OooOO0O().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next.OooO00o() == i));
        oOo0000O ooo0000o = next;
        if (ooo0000o != null) {
            return ooo0000o.OooO0O0() - this.f48827OooO0O0.invoke(this, ooo0000o).intValue();
        }
        oOo0000O ooo0000oOooO0o0 = OooO0o0();
        if (ooo0000oOooO0o0 == null) {
            return 0;
        }
        return (ooo0000oOooO0o0.OooO0O0() + MathKt.roundToInt(OooO() * (i - ooo0000oOooO0o0.OooO00o()))) - this.f48827OooO0O0.invoke(this, ooo0000oOooO0o0).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p633o0ooO00o.oOo000Oo
    public final int OooO0o() {
        return this.f48826OooO00o.OooO0oO().OooO0Oo() - ((Number) this.f48828OooO0OO.getValue()).intValue();
    }

    @Override // p633o0ooO00o.oOo000Oo
    @Nullable
    public final oOo0000O OooO0o0() {
        return (oOo0000O) this.f48829OooO0Oo.getValue();
    }

    @Override // p633o0ooO00o.oOo000Oo
    public final void OooO0oO() {
    }

    @Override // p633o0ooO00o.oOo000Oo
    public final int OooO0oo() {
        return this.f48826OooO00o.OooO0oO().OooO00o();
    }

    public final int OooOO0() {
        return this.f48826OooO00o.OooO0oO().OooO00o();
    }

    @NotNull
    public final Sequence<oOo0000O> OooOO0O() {
        return SequencesKt.map(CollectionsKt.asSequence(this.f48826OooO00o.OooO0oO().OooO0O0()), OooO00o.f48830Oooo0o);
    }
}
