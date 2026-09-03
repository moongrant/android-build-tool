package p028Oooo0o0;

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
import o0O0O00.OooOOOO;
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

/* JADX INFO: loaded from: classes.dex */
public final class o0O00OO extends o00O00 implements oo000o {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o0O00O0o f2129Oooo0oO;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2130Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00000O0 f2131Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O00OO f2132Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000 o000o001, o00000O0 o00000o1, o0O00OO o0o00oo2) {
            super(1);
            this.f2130Oooo0o = o000o001;
            this.f2131Oooo0oO = o00000o1;
            this.f2132Oooo0oo = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o000O000 o000o001 = this.f2130Oooo0o;
            o00000O0 o00000o1 = this.f2131Oooo0oO;
            layout.OooO0OO(o000o001, o00000o1.OoooooO(this.f2132Oooo0oo.f2129Oooo0oO.OooO0O0(o00000o1.getLayoutDirection())), this.f2131Oooo0oO.OoooooO(this.f2132Oooo0oo.f2129Oooo0oO.OooO0Oo()), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o0O00OO(@NotNull o0O00O0o paddingValues) {
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f2129Oooo0oO = paddingValues;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // o0O0O00.oo000o
    public final /* synthetic */ int Oooo000(OooOo00 oooOo00, OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO00o(this, oooOo00, oooOOOO, i);
    }

    @Override // o0O0O00.oo000o
    public final /* synthetic */ int OoooO(OooOo00 oooOo00, OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO0OO(this, oooOo00, oooOOOO, i);
    }

    @Override // o0O0O00.oo000o
    @NotNull
    public final o000000O OoooO0(@NotNull o00000O0 measure, @NotNull o0O0O00 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        boolean z = false;
        float f = 0;
        if (Float.compare(this.f2129Oooo0oO.OooO0O0(measure.getLayoutDirection()), f) >= 0 && Float.compare(this.f2129Oooo0oO.OooO0Oo(), f) >= 0 && Float.compare(this.f2129Oooo0oO.OooO0OO(measure.getLayoutDirection()), f) >= 0 && Float.compare(this.f2129Oooo0oO.OooO00o(), f) >= 0) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int iOoooooO = measure.OoooooO(this.f2129Oooo0oO.OooO0OO(measure.getLayoutDirection())) + measure.OoooooO(this.f2129Oooo0oO.OooO0O0(measure.getLayoutDirection()));
        int iOoooooO2 = measure.OoooooO(this.f2129Oooo0oO.OooO00o()) + measure.OoooooO(this.f2129Oooo0oO.OooO0Oo());
        o000O000 o000o000Oooo000 = measurable.Oooo000(OooO0OO.OooO0oO(j, -iOoooooO, -iOoooooO2));
        return measure.OooOooo(OooO0OO.OooO0o(j, o000o000Oooo000.f35265Oooo0o + iOoooooO), OooO0OO.OooO0o0(j, o000o000Oooo000.f35266Oooo0oO + iOoooooO2), MapsKt.emptyMap(), new OooO00o(o000o000Oooo000, measure, this));
    }

    @Override // o0O0O00.oo000o
    public final /* synthetic */ int OoooOOO(OooOo00 oooOo00, OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO0Oo(this, oooOo00, oooOOOO, i);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // o0O0O00.oo000o
    public final /* synthetic */ int Oooooo(OooOo00 oooOo00, OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO0O0(this, oooOo00, oooOOOO, i);
    }

    public final boolean equals(@Nullable Object obj) {
        o0O00OO o0o00oo2 = obj instanceof o0O00OO ? (o0O00OO) obj : null;
        if (o0o00oo2 == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f2129Oooo0oO, o0o00oo2.f2129Oooo0oO);
    }

    public final int hashCode() {
        return this.f2129Oooo0oO.hashCode();
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
