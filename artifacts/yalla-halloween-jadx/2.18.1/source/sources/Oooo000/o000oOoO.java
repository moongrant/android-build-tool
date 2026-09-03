package Oooo000;

import androidx.compose.animation.ExperimentalAnimationApi;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00O0;
import p023Oooo00O.oo00o;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalAnimationApi
public final class o000oOoO<S> implements oo00o.OooO0O0<S> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oo00o<S> f909OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public o00OO0O0 f910OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f911OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Map<S, oO0Oo<o0000O0O.o000oOoO>> f912OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public oO0Oo<o0000O0O.o000oOoO> f913OooO0o0;

    public static final class OooO00o implements o0O0O00.o000 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f914Oooo0o;

        public OooO00o(boolean z) {
            this.f914Oooo0o = z;
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

        @Override // p048OoooooO.o00OOOO0
        public final /* synthetic */ boolean OooooOo(Function1 function1) {
            return o00OOOOo.OooO00o(this, function1);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO00o) && this.f914Oooo0o == ((OooO00o) obj).f914Oooo0o;
        }

        public final int hashCode() {
            boolean z = this.f914Oooo0o;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @Override // p048OoooooO.o00OOOO0
        public final Object o0Oo0oo(Object obj, Function2 operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.invoke(this, obj);
        }

        @Override // o0O0O00.o000
        @NotNull
        public final Object o0ooOoO(@NotNull o0000O0O.OooO oooO, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            return this;
        }

        @NotNull
        public final String toString() {
            return Oooo0.OooO0O0(OooO00o.OooO00o.OooO0o0("ChildData(isTarget="), this.f914Oooo0o, ')');
        }
    }

    @ExperimentalAnimationApi
    public final class OooO0O0 extends o000O0O0 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final oo00o<S>.OooO00o<o0000O0O.o000oOoO, p023Oooo00O.o0OO00O> f915Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NotNull
        public final oO0Oo<o00O0000> f916Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000oOoO<S> f917Oooo0oo;

        public static final class OooO00o extends Lambda implements Function1<o0O0O00.o000O000.OooO00o, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o0O0O00.o000O000 f918Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ long f919Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0O0O00.o000O000 o000o001, long j) {
                super(1);
                this.f918Oooo0o = o000o001;
                this.f919Oooo0oO = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
                o0O0O00.o000O000.OooO00o layout = oooO00o;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                layout.OooO0o0(this.f918Oooo0o, this.f919Oooo0oO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: Oooo000.o000oOoO$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C0007OooO0O0 extends Lambda implements Function1<oo00o.OooO0O0<S>, p023Oooo00O.o0000O0O<o0000O0O.o000oOoO>> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o000oOoO<S> f920Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o000oOoO<S>.OooO0O0 f921Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0007OooO0O0(o000oOoO<S> o000oooo2, o000oOoO<S>.OooO0O0 oooO0O0) {
                super(1);
                this.f920Oooo0o = o000oooo2;
                this.f921Oooo0oO = oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function1
            public final p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> invoke(Object obj) {
                p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> o0000o0oOooO0O0;
                oo00o.OooO0O0 animate = (oo00o.OooO0O0) obj;
                Intrinsics.checkNotNullParameter(animate, "$this$animate");
                oO0Oo oo0oo = (oO0Oo) this.f920Oooo0o.f912OooO0Oo.get(animate.OooO00o());
                long j = oo0oo != null ? ((o0000O0O.o000oOoO) oo0oo.getValue()).f27322OooO00o : 0L;
                oO0Oo oo0oo2 = (oO0Oo) this.f920Oooo0o.f912OooO0Oo.get(animate.OooO0OO());
                long j2 = oo0oo2 != null ? ((o0000O0O.o000oOoO) oo0oo2.getValue()).f27322OooO00o : 0L;
                o00O0000 value = this.f921Oooo0oO.f916Oooo0oO.getValue();
                return (value == null || (o0000o0oOooO0O0 = value.OooO0O0(j, j2)) == null) ? p023Oooo00O.o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 7) : o0000o0oOooO0O0;
            }
        }

        public static final class OooO0OO extends Lambda implements Function1<S, o0000O0O.o000oOoO> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o000oOoO<S> f922Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(o000oOoO<S> o000oooo2) {
                super(1);
                this.f922Oooo0o = o000oooo2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final o0000O0O.o000oOoO invoke(Object obj) {
                oO0Oo oo0oo = (oO0Oo) this.f922Oooo0o.f912OooO0Oo.get(obj);
                return new o0000O0O.o000oOoO(oo0oo != null ? ((o0000O0O.o000oOoO) oo0oo.getValue()).f27322OooO00o : 0L);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(@NotNull o000oOoO o000oooo2, @NotNull oo00o<S>.OooO00o<o0000O0O.o000oOoO, p023Oooo00O.o0OO00O> sizeAnimation, oO0Oo<? extends o00O0000> sizeTransform) {
            Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
            Intrinsics.checkNotNullParameter(sizeTransform, "sizeTransform");
            this.f917Oooo0oo = o000oooo2;
            this.f915Oooo0o = sizeAnimation;
            this.f916Oooo0oO = sizeTransform;
        }

        @Override // o0O0O00.oo000o
        @NotNull
        public final o0O0O00.o000000O OoooO0(@NotNull o0O0O00.o00000O0 measure, @NotNull o0O0O00.o0O0O00 measurable, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            o0O0O00.o000O000 o000o000Oooo000 = measurable.Oooo000(j);
            oO0Oo<o0000O0O.o000oOoO> oo0ooOooO00o = this.f915Oooo0o.OooO00o(new C0007OooO0O0(this.f917Oooo0oo, this), new OooO0OO(this.f917Oooo0oo));
            o000oOoO<S> o000oooo2 = this.f917Oooo0oo;
            o000oooo2.f913OooO0o0 = oo0ooOooO00o;
            oo00o.OooO00o.C0010OooO00o c0010OooO00o = (oo00o.OooO00o.C0010OooO00o) oo0ooOooO00o;
            return measure.OooOooo((int) (((o0000O0O.o000oOoO) c0010OooO00o.getValue()).f27322OooO00o >> 32), o0000O0O.o000oOoO.OooO0O0(((o0000O0O.o000oOoO) c0010OooO00o.getValue()).f27322OooO00o), MapsKt.emptyMap(), new OooO00o(o000o000Oooo000, o000oooo2.f910OooO0O0.OooO00o(o0000O0O.o0OoOo0.OooO00o(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO), ((o0000O0O.o000oOoO) c0010OooO00o.getValue()).f27322OooO00o, LayoutDirection.Ltr)));
        }
    }

    public o000oOoO(@NotNull oo00o<S> transition, @NotNull o00OO0O0 contentAlignment, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.f909OooO00o = transition;
        this.f910OooO0O0 = contentAlignment;
        this.f911OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new o0000O0O.o000oOoO(0L));
        this.f912OooO0Oo = new LinkedHashMap();
    }

    @Override // Oooo00O.oo00o.OooO0O0
    public final S OooO00o() {
        return this.f909OooO00o.OooO0Oo().OooO00o();
    }

    @Override // Oooo00O.oo00o.OooO0O0
    public final /* synthetic */ boolean OooO0O0(Object obj, Object obj2) {
        return o00O0.OooO00o(this, obj, obj2);
    }

    @Override // Oooo00O.oo00o.OooO0O0
    public final S OooO0OO() {
        return this.f909OooO00o.OooO0Oo().OooO0OO();
    }
}
