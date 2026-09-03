package Oooo000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00OO0O0;
import p023Oooo00O.oo0O;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 extends o000O0O0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public OooO00o f886Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final p023Oooo00O.oo000o<o0000O0O.o000oOoO> f887Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f888Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Function2<? super o0000O0O.o000oOoO, ? super o0000O0O.o000oOoO, Unit> f889Oooo0oo;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final p023Oooo00O.Oooo0<o0000O0O.o000oOoO, p023Oooo00O.o0OO00O> f890OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f891OooO0O0;

        public OooO00o(p023Oooo00O.Oooo0 oooo0, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this.f890OooO00o = oooo0;
            this.f891OooO0O0 = j;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f890OooO00o, oooO00o.f890OooO00o) && o0000O0O.o000oOoO.OooO00o(this.f891OooO0O0, oooO00o.f891OooO0O0);
        }

        public final int hashCode() {
            return o0000O0O.o000oOoO.OooO0OO(this.f891OooO0O0) + (this.f890OooO00o.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("AnimData(anim=");
            sbOooO0o0.append(this.f890OooO00o);
            sbOooO0o0.append(", startSize=");
            sbOooO0o0.append((Object) o0000O0O.o000oOoO.OooO0Oo(this.f891OooO0O0));
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0O0O00.o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0O00.o000O000 f892Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O0O00.o000O000 o000o001) {
            super(1);
            this.f892Oooo0o = o000o001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
            o0O0O00.o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o0O0O00.o000O000.OooO00o.OooO0oO(layout, this.f892Oooo0o, 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    public o000OOo0(@NotNull p023Oooo00O.oo000o<o0000O0O.o000oOoO> animSpec, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(animSpec, "animSpec");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f887Oooo0o = animSpec;
        this.f888Oooo0oO = scope;
    }

    @Override // o0O0O00.oo000o
    @NotNull
    public final o0O0O00.o000000O OoooO0(@NotNull o0O0O00.o00000O0 measure, @NotNull o0O0O00.o0O0O00 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        o0O0O00.o000O000 o000o000Oooo000 = measurable.Oooo000(j);
        long jOooO00o = o0000O0O.o0OoOo0.OooO00o(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO);
        OooO00o oooO00o = this.f886Oooo;
        if (oooO00o == null) {
            o0000O0O.o000oOoO o000oooo2 = new o0000O0O.o000oOoO(jOooO00o);
            o0000O0O.o000oOoO.OooO00o oooO00o2 = o0000O0O.o000oOoO.f27321OooO0O0;
            o00OO0O0<Float, p023Oooo00O.o0Oo0oo> o00oo0o1 = oo0O.f1293OooO00o;
            Intrinsics.checkNotNullParameter(oooO00o2, "<this>");
            oooO00o = new OooO00o(new p023Oooo00O.Oooo0(o000oooo2, oo0O.f1300OooO0oo, new o0000O0O.o000oOoO(o0000O0O.o0OoOo0.OooO00o(1, 1))), jOooO00o, null);
        } else if (!o0000O0O.o000oOoO.OooO00o(jOooO00o, oooO00o.f890OooO00o.OooO0o0().f27322OooO00o)) {
            oooO00o.f891OooO0O0 = oooO00o.f890OooO00o.OooO0o().f27322OooO00o;
            BuildersKt__Builders_commonKt.launch$default(this.f888Oooo0oO, null, null, new o00(oooO00o, jOooO00o, this, null), 3, null);
        }
        this.f886Oooo = oooO00o;
        long j2 = oooO00o.f890OooO00o.OooO0o().f27322OooO00o;
        return measure.OooOooo((int) (j2 >> 32), o0000O0O.o000oOoO.OooO0O0(j2), MapsKt.emptyMap(), new OooO0O0(o000o000Oooo000));
    }
}
