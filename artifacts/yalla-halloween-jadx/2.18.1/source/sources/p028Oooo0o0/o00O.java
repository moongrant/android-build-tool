package p028Oooo0o0;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO0OO;
import o0O0O00.OooOo00;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o00Ooo;
import o0O0O00.o0O0O00;
import o0O0O00.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p076o000OOo.OooOO0O;
import p076o000OOo.OooOOO;
import p076o000OOo.OooOOOO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class o00O extends o00O00 implements oo000o, OooOO0O, OooOOO<o0oOo0O0> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f2020Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o0oOo0O0 f2021Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f2022Oooo0oo;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2023Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f2024Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f2025Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000 o000o001, int i, int i2) {
            super(1);
            this.f2023Oooo0o = o000o001;
            this.f2024Oooo0oO = i;
            this.f2025Oooo0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            layout.OooO0OO(this.f2023Oooo0o, this.f2024Oooo0oO, this.f2025Oooo0oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o00O(o0oOo0O0 insets) {
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f2021Oooo0oO = insets;
        this.f2022Oooo0oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(insets);
        this.f2020Oooo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(insets);
    }

    public final o0oOo0O0 OooO0O0() {
        return (o0oOo0O0) this.f2022Oooo0oo.getValue();
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull OooOOOO scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        o0oOo0O0 insets = (o0oOo0O0) scope.OooO00o(oo0oO0.f2236OooO00o);
        o0oOo0O0 o0ooo0o1 = this.f2021Oooo0oO;
        Intrinsics.checkNotNullParameter(o0ooo0o1, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.f2022Oooo0oo.setValue(new o00O0OO0(o0ooo0o1, insets));
        this.f2020Oooo.setValue(o0OO000o.OooO0O0(insets, this.f2021Oooo0oO));
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // o0O0O00.oo000o
    public final /* synthetic */ int Oooo000(OooOo00 oooOo00, o0O0O00.OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO00o(this, oooOo00, oooOOOO, i);
    }

    @Override // o0O0O00.oo000o
    public final /* synthetic */ int OoooO(OooOo00 oooOo00, o0O0O00.OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO0OO(this, oooOo00, oooOOOO, i);
    }

    @Override // o0O0O00.oo000o
    @NotNull
    public final o000000O OoooO0(@NotNull o00000O0 measure, @NotNull o0O0O00 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int iOooO00o = OooO0O0().OooO00o(measure, measure.getLayoutDirection());
        int iOooO0OO = OooO0O0().OooO0OO(measure);
        int iOooO0O0 = OooO0O0().OooO0O0(measure, measure.getLayoutDirection()) + iOooO00o;
        int iOooO0Oo = OooO0O0().OooO0Oo(measure) + iOooO0OO;
        o000O000 o000o000Oooo000 = measurable.Oooo000(OooO0OO.OooO0oO(j, -iOooO0O0, -iOooO0Oo));
        return measure.OooOooo(OooO0OO.OooO0o(j, o000o000Oooo000.f35265Oooo0o + iOooO0O0), OooO0OO.OooO0o0(j, o000o000Oooo000.f35266Oooo0oO + iOooO0Oo), MapsKt.emptyMap(), new OooO00o(o000o000Oooo000, iOooO00o, iOooO0OO));
    }

    @Override // o0O0O00.oo000o
    public final /* synthetic */ int OoooOOO(OooOo00 oooOo00, o0O0O00.OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO0Oo(this, oooOo00, oooOOOO, i);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // o0O0O00.oo000o
    public final /* synthetic */ int Oooooo(OooOo00 oooOo00, o0O0O00.OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO0O0(this, oooOo00, oooOOOO, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00O) {
            return Intrinsics.areEqual(((o00O) obj).f2021Oooo0oO, this.f2021Oooo0oO);
        }
        return false;
    }

    @Override // p076o000OOo.OooOOO
    @NotNull
    public final p076o000OOo.OooOo00<o0oOo0O0> getKey() {
        return oo0oO0.f2236OooO00o;
    }

    @Override // p076o000OOo.OooOOO
    public final o0oOo0O0 getValue() {
        return (o0oOo0O0) this.f2020Oooo.getValue();
    }

    public final int hashCode() {
        return this.f2021Oooo0oO.hashCode();
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
