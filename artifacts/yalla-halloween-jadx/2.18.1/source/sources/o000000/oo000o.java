package o000000;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.o0000O;
import o0O0O00.o000O000;
import o0O0O00.o000OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.oo00o;
import p047Oooooo0.oo0o0O0;
import p048OoooooO.o00OOOO0;
import p145o00Oo0.o000;
import p145o00Oo0.o000O0O0;
import p145o00Oo0.o000O0Oo;
import p145o00Oo0.o000OOo0;
import p145o00Oo0.o00O00;

/* JADX INFO: loaded from: classes.dex */
public abstract class oo000o extends o000O000 implements o0O0O00.o0O0O00, o0O0O00.Oooo000, o00000O0, Function1<p145o00Oo0.o0O0O00, Unit> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public Function1<? super p145o00Oo0.o0000, Unit> f26700OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public oo000o f26701OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final LayoutNode f26702OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f26703OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public o0000O0O.OooO f26704OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f26705OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f26706OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public o0O0O00.o000000O f26707OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @Nullable
    public Map<o0O0O00.OooO00o, Integer> f26708OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public long f26709OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f26710Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f26711Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public o00O0O.OooO0o f26712OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final o00Oo0<?, ?>[] f26713OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f26714OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public o000000 f26715Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f26716Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public LayoutDirection f26717o000oOoO;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public static final OooO f26694OoooooO = new OooO();

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public static final Function1<oo000o, Unit> f26695Ooooooo = OooO0o.f26719Oooo0o;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public static final Function1<oo000o, Unit> f26698o0OoOo0 = OooO0OO.f26718Oooo0o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NotNull
    public static final o000O0O0 f26699ooOO = new o000O0O0();

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @NotNull
    public static final OooOO0<o0000Ooo, p418o0Oo0oo.o000000, p418o0Oo0oo.o000000O> f26696o00O0O = new OooO00o();

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    @NotNull
    public static final OooOO0<o00000O0.OooOo, o00000O0.OooOo, o00000O0.Oooo000> f26697o00Oo0 = new OooO0O0();

    public static final class OooO {
    }

    public static final class OooO00o implements OooOO0<o0000Ooo, p418o0Oo0oo.o000000, p418o0Oo0oo.o000000O> {
        @Override // o000000.oo000o.OooOO0
        public final void OooO00o(o00Oo0 o00oo1) {
            o0000Ooo entity = (o0000Ooo) o00oo1;
            Intrinsics.checkNotNullParameter(entity, "entity");
            Objects.requireNonNull(((p418o0Oo0oo.o000000O) entity.f26653Oooo0oO).OoooO00());
        }

        @Override // o000000.oo000o.OooOO0
        public final void OooO0O0(@NotNull LayoutNode layoutNode, long j, @NotNull o000000.OooOOO0<p418o0Oo0oo.o000000> hitTestResult, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.OooOo0O(j, hitTestResult, z, z2);
        }

        @Override // o000000.oo000o.OooOO0
        public final boolean OooO0OO(@NotNull LayoutNode parentLayoutNode) {
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            return true;
        }

        @Override // o000000.oo000o.OooOO0
        public final p418o0Oo0oo.o000000 OooO0Oo(o00Oo0 o00oo1) {
            o0000Ooo entity = (o0000Ooo) o00oo1;
            Intrinsics.checkNotNullParameter(entity, "entity");
            return ((p418o0Oo0oo.o000000O) entity.f26653Oooo0oO).OoooO00();
        }

        @Override // o000000.oo000o.OooOO0
        public final int OooO0o0() {
            return 1;
        }
    }

    public static final class OooO0O0 implements OooOO0<o00000O0.OooOo, o00000O0.OooOo, o00000O0.Oooo000> {
        @Override // o000000.oo000o.OooOO0
        public final void OooO00o(o00Oo0 o00oo1) {
            o00000O0.OooOo entity = (o00000O0.OooOo) o00oo1;
            Intrinsics.checkNotNullParameter(entity, "entity");
        }

        @Override // o000000.oo000o.OooOO0
        public final void OooO0O0(@NotNull LayoutNode layoutNode, long j, @NotNull o000000.OooOOO0<o00000O0.OooOo> hitTestResult, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
            Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
            layoutNode.OooOo0o(j, hitTestResult, z2);
        }

        @Override // o000000.oo000o.OooOO0
        public final boolean OooO0OO(@NotNull LayoutNode parentLayoutNode) {
            o00000O0.OooOOOO oooOOOOOooO0OO;
            Intrinsics.checkNotNullParameter(parentLayoutNode, "parentLayoutNode");
            o00000O0.OooOo oooOoOooO0Oo = o00000O0.o00Oo0.OooO0Oo(parentLayoutNode);
            boolean z = false;
            if (oooOoOooO0Oo != null && (oooOOOOOooO0OO = oooOoOooO0Oo.OooO0OO()) != null && oooOOOOOooO0OO.f26936Oooo0oo) {
                z = true;
            }
            return !z;
        }

        @Override // o000000.oo000o.OooOO0
        public final o00000O0.OooOo OooO0Oo(o00Oo0 o00oo1) {
            o00000O0.OooOo entity = (o00000O0.OooOo) o00oo1;
            Intrinsics.checkNotNullParameter(entity, "entity");
            return entity;
        }

        @Override // o000000.oo000o.OooOO0
        public final int OooO0o0() {
            return 2;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<oo000o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f26718Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oo000o oo000oVar) {
            oo000o wrapper = oo000oVar;
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            o000000 o000000Var = wrapper.f26715Oooooo;
            if (o000000Var != null) {
                o000000Var.invalidate();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<oo000o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f26719Oooo0o = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oo000o oo000oVar) {
            oo000o wrapper = oo000oVar;
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            if (wrapper.f26715Oooooo != null) {
                wrapper.o0000Oo0();
            }
            return Unit.INSTANCE;
        }
    }

    public interface OooOO0<T extends o00Oo0<T, M>, C, M extends o00OOOO0> {
        /* JADX WARN: Incorrect return type in method signature: (TT;)Z */
        void OooO00o(@NotNull o00Oo0 o00oo1);

        void OooO0O0(@NotNull LayoutNode layoutNode, long j, @NotNull o000000.OooOOO0<C> oooOOO0, boolean z, boolean z2);

        boolean OooO0OO(@NotNull LayoutNode layoutNode);

        C OooO0Oo(@NotNull T t);

        int OooO0o0();
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f26720Oooo;

        /* JADX INFO: Incorrect field signature: TT; */
        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00Oo0 f26722Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0<T, C, M> f26723Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ boolean f26724OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000000.OooOOO0<C> f26725OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f26726OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lo000000/oo000o;TT;Lo000000/oo000o$OooOO0<TT;TC;TM;>;JLo000000/OooOOO0<TC;>;ZZ)V */
        public OooOO0O(o00Oo0 o00oo1, OooOO0 oooOO1, long j, o000000.OooOOO0 oooOOO0, boolean z, boolean z2) {
            super(0);
            this.f26722Oooo0oO = o00oo1;
            this.f26723Oooo0oo = oooOO1;
            this.f26720Oooo = j;
            this.f26725OoooO00 = oooOOO0;
            this.f26724OoooO0 = z;
            this.f26726OoooO0O = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo000o.this.o00000o0(this.f26722Oooo0oO.f26654Oooo0oo, this.f26723Oooo0oo, this.f26720Oooo, this.f26725OoooO00, this.f26724OoooO0, this.f26726OoooO0O);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo000o oo000oVar = oo000o.this.f26701OoooO0;
            if (oo000oVar != null) {
                oo000oVar.o0000();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f26728Oooo;

        /* JADX INFO: Incorrect field signature: TT; */
        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00Oo0 f26730Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0<T, C, M> f26731Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ float f26732OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ boolean f26733OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000000.OooOOO0<C> f26734OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f26735OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lo000000/oo000o;TT;Lo000000/oo000o$OooOO0<TT;TC;TM;>;JLo000000/OooOOO0<TC;>;ZZF)V */
        public OooOOO0(o00Oo0 o00oo1, OooOO0 oooOO1, long j, o000000.OooOOO0 oooOOO0, boolean z, boolean z2, float f) {
            super(0);
            this.f26730Oooo0oO = o00oo1;
            this.f26731Oooo0oo = oooOO1;
            this.f26728Oooo = j;
            this.f26734OoooO00 = oooOOO0;
            this.f26733OoooO0 = z;
            this.f26735OoooO0O = z2;
            this.f26732OoooO = f;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo000o.this.o0000Ooo(this.f26730Oooo0oO.f26654Oooo0oo, this.f26731Oooo0oo, this.f26728Oooo, this.f26734OoooO00, this.f26733OoooO0, this.f26735OoooO0O, this.f26732OoooO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<p145o00Oo0.o0000, Unit> f26736Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOOO(Function1<? super p145o00Oo0.o0000, Unit> function1) {
            super(0);
            this.f26736Oooo0o = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f26736Oooo0o.invoke(oo000o.f26699ooOO);
            return Unit.INSTANCE;
        }
    }

    public oo000o(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f26702OoooO00 = layoutNode;
        this.f26704OoooOO0 = layoutNode.f6150Ooooo00;
        this.f26717o000oOoO = layoutNode.f6152OooooO0;
        this.f26705OoooOOO = 0.8f;
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
        this.f26709OoooOoo = o0000O0O.OooOo.f27311OooO0OO;
        o00Oo0<?, ?>[] entities = new o00Oo0[6];
        Intrinsics.checkNotNullParameter(entities, "entities");
        this.f26713OooooOO = entities;
        this.f26714OooooOo = new OooOOO();
    }

    @Override // o0O0O00.Oooo000
    public final long OooO00o() {
        return this.f35267Oooo0oo;
    }

    @Override // o0O0O00.Oooo000
    public final long OooOOoo(long j) {
        return o00Ooo.OooO00o(this.f26702OoooO00).OooO0Oo(OoooO00(j));
    }

    @Override // o0O0O00.o00000O
    public final int OooOo0o(@NotNull o0O0O00.OooO00o alignmentLine) {
        int iO0Oo0oo;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if ((this.f26707OoooOo0 != null) && (iO0Oo0oo = o0Oo0oo(alignmentLine)) != Integer.MIN_VALUE) {
            return o0000O0O.OooOo.OooO0OO(o000oOoO()) + iO0Oo0oo;
        }
        return Integer.MIN_VALUE;
    }

    @Override // o0O0O00.Oooo000
    public final boolean OooOoO() {
        if (!this.f26706OoooOOo || this.f26702OoooO00.OooOoo0()) {
            return this.f26706OoooOOo;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // o0O0O00.Oooo000
    @NotNull
    public final o00O0O.OooOO0O Oooo(@NotNull o0O0O00.Oooo000 sourceCoordinates, boolean z) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        if (!OooOoO()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        if (!sourceCoordinates.OooOoO()) {
            throw new IllegalStateException(("LayoutCoordinates " + sourceCoordinates + " is not attached!").toString());
        }
        oo000o oo000oVar = (oo000o) sourceCoordinates;
        oo000o oo000oVarO000000O = o000000O(oo000oVar);
        o00O0O.OooO0o oooO0o = this.f26712OooooO0;
        if (oooO0o == null) {
            oooO0o = new o00O0O.OooO0o();
            this.f26712OooooO0 = oooO0o;
        }
        oooO0o.f30398OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO0o.f30399OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO0o.f30400OooO0OO = (int) (sourceCoordinates.OooO00o() >> 32);
        oooO0o.f30401OooO0Oo = o0000O0O.o000oOoO.OooO0O0(sourceCoordinates.OooO00o());
        while (oo000oVar != oo000oVarO000000O) {
            oo000oVar.o0000O(oooO0o, z, false);
            if (oooO0o.OooO0O0()) {
                return o00O0O.OooOO0O.f30402OooO0o;
            }
            oo000oVar = oo000oVar.f26701OoooO0;
            Intrinsics.checkNotNull(oo000oVar);
        }
        o0ooOO0(oo000oVarO000000O, oooO0o, z);
        Intrinsics.checkNotNullParameter(oooO0o, "<this>");
        return new o00O0O.OooOO0O(oooO0o.f30398OooO00o, oooO0o.f30399OooO0O0, oooO0o.f30400OooO0OO, oooO0o.f30401OooO0Oo);
    }

    @Override // o0O0O00.Oooo000
    public final long Oooo00O(long j) {
        if (!OooOoO()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        o0O0O00.Oooo000 oooo000OooO0Oo = o0O0O00.Oooo0.OooO0Oo(this);
        return OoooO0(oooo000OooO0Oo, o00O0O.OooO.OooO0o(o00Ooo.OooO00o(this.f26702OoooO00).OooO0o0(j), o0O0O00.Oooo0.OooO0o0(oooo000OooO0Oo)));
    }

    @Override // o0O0O00.o000O000, o0O0O00.OooOOOO
    @Nullable
    public final Object Oooo0o() {
        return o00000OO((o0000oo) this.f26713OooooOO[3]);
    }

    @Override // o0O0O00.Oooo000
    @Nullable
    public final o0O0O00.Oooo000 Oooo0oo() {
        if (OooOoO()) {
            return this.f26702OoooO00.f6166o00o0O.f26635OoooO0.f26701OoooO0;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // o0O0O00.Oooo000
    public final long OoooO0(@NotNull o0O0O00.Oooo000 sourceCoordinates, long j) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        oo000o oo000oVar = (oo000o) sourceCoordinates;
        oo000o oo000oVarO000000O = o000000O(oo000oVar);
        while (oo000oVar != oo000oVarO000000O) {
            j = oo000oVar.o0000OOo(j);
            oo000oVar = oo000oVar.f26701OoooO0;
            Intrinsics.checkNotNull(oo000oVar);
        }
        return o0ooOoO(oo000oVarO000000O, j);
    }

    @Override // o0O0O00.Oooo000
    public final long OoooO00(long j) {
        if (!OooOoO()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        for (oo000o oo000oVar = this; oo000oVar != null; oo000oVar = oo000oVar.f26701OoooO0) {
            j = oo000oVar.o0000OOo(j);
        }
        return j;
    }

    @Override // o0O0O00.o000O000
    public void OooooOo(long j, float f, @Nullable Function1<? super p145o00Oo0.o0000, Unit> function1) {
        o0000oo(function1);
        if (!o0000O0O.OooOo.OooO0O0(this.f26709OoooOoo, j)) {
            this.f26709OoooOoo = j;
            o000000 o000000Var = this.f26715Oooooo;
            if (o000000Var != null) {
                o000000Var.OooO0oO(j);
            } else {
                oo000o oo000oVar = this.f26701OoooO0;
                if (oo000oVar != null) {
                    oo000oVar.o0000();
                }
            }
            oo000o oo000oVarO00000Oo = o00000Oo();
            if (Intrinsics.areEqual(oo000oVarO00000Oo != null ? oo000oVarO00000Oo.f26702OoooO00 : null, this.f26702OoooO00)) {
                LayoutNode layoutNodeOooOOoo = this.f26702OoooO00.OooOOoo();
                if (layoutNodeOooOOoo != null) {
                    layoutNodeOooOOoo.Oooo0O0();
                }
            } else {
                this.f26702OoooO00.Oooo0O0();
            }
            LayoutNode layoutNode = this.f26702OoooO00;
            o00000 o00000Var = layoutNode.f6143OoooO0O;
            if (o00000Var != null) {
                o00000Var.OooO0o(layoutNode);
            }
        }
        this.f26710Ooooo00 = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p145o00Oo0.o0O0O00 o0o0o00) {
        p145o00Oo0.o0O0O00 canvas = o0o0o00;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        LayoutNode layoutNode = this.f26702OoooO00;
        if (layoutNode.f6156Oooooo0) {
            o00Ooo.OooO00o(layoutNode).getSnapshotObserver().OooO00o(this, f26698o0OoOo0, new o00oO0o(this, canvas));
            this.f26716Oooooo0 = false;
        } else {
            this.f26716Oooooo0 = true;
        }
        return Unit.INSTANCE;
    }

    @Override // o000000.o00000O0
    public final boolean isValid() {
        return this.f26715Oooooo != null;
    }

    public final void o0000() {
        o000000 o000000Var = this.f26715Oooooo;
        if (o000000Var != null) {
            o000000Var.invalidate();
            return;
        }
        oo000o oo000oVar = this.f26701OoooO0;
        if (oo000oVar != null) {
            oo000oVar.o0000();
        }
    }

    @NotNull
    public final o0O0O00.o000000O o00000() {
        o0O0O00.o000000O o000000o2 = this.f26707OoooOo0;
        if (o000000o2 != null) {
            return o000000o2;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    public final void o000000(@NotNull p145o00Oo0.o0O0O00 canvas, @NotNull o000 paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        long j = this.f35267Oooo0oo;
        canvas.OooO0o0(new o00O0O.OooOO0O(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, o0000O0O.o000oOoO.OooO0O0(j) - 0.5f), paint);
    }

    @NotNull
    public final oo000o o000000O(@NotNull oo000o other) {
        Intrinsics.checkNotNullParameter(other, "other");
        LayoutNode layoutNodeOooOOoo = other.f26702OoooO00;
        LayoutNode layoutNodeOooOOoo2 = this.f26702OoooO00;
        if (layoutNodeOooOOoo == layoutNodeOooOOoo2) {
            oo000o oo000oVar = layoutNodeOooOOoo2.f6166o00o0O.f26635OoooO0;
            oo000o oo000oVar2 = this;
            while (oo000oVar2 != oo000oVar && oo000oVar2 != other) {
                oo000oVar2 = oo000oVar2.f26701OoooO0;
                Intrinsics.checkNotNull(oo000oVar2);
            }
            return oo000oVar2 == other ? other : this;
        }
        while (layoutNodeOooOOoo.f6140OoooO > layoutNodeOooOOoo2.f6140OoooO) {
            layoutNodeOooOOoo = layoutNodeOooOOoo.OooOOoo();
            Intrinsics.checkNotNull(layoutNodeOooOOoo);
        }
        while (layoutNodeOooOOoo2.f6140OoooO > layoutNodeOooOOoo.f6140OoooO) {
            layoutNodeOooOOoo2 = layoutNodeOooOOoo2.OooOOoo();
            Intrinsics.checkNotNull(layoutNodeOooOOoo2);
        }
        while (layoutNodeOooOOoo != layoutNodeOooOOoo2) {
            layoutNodeOooOOoo = layoutNodeOooOOoo.OooOOoo();
            layoutNodeOooOOoo2 = layoutNodeOooOOoo2.OooOOoo();
            if (layoutNodeOooOOoo == null || layoutNodeOooOOoo2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNodeOooOOoo2 == this.f26702OoooO00) {
            return this;
        }
        return layoutNodeOooOOoo == other.f26702OoooO00 ? other : layoutNodeOooOOoo.f6165o00Ooo;
    }

    public final long o000000o(long j) {
        long j2 = this.f26709OoooOoo;
        float fOooO0OO = o00O0O.OooO.OooO0OO(j);
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
        long jOooO00o = o00O0O.OooOO0.OooO00o(fOooO0OO - ((int) (j2 >> 32)), o00O0O.OooO.OooO0Oo(j) - o0000O0O.OooOo.OooO0OO(j2));
        o000000 o000000Var = this.f26715Oooooo;
        return o000000Var != null ? o000000Var.OooO0o0(jOooO00o, true) : jOooO00o;
    }

    public final long o00000O() {
        return this.f26704OoooOO0.o00ooo(this.f26702OoooO00.f6153OooooOO.OooO0Oo());
    }

    @NotNull
    public abstract o0O0O00.o00000O0 o00000O0();

    public final Object o00000OO(o0000oo<o0O0O00.o000> o0000ooVar) {
        if (o0000ooVar != null) {
            return ((o0O0O00.o000) o0000ooVar.f26653Oooo0oO).o0ooOoO(o00000O0(), o00000OO((o0000oo) o0000ooVar.f26654Oooo0oo));
        }
        oo000o oo000oVarO00000Oo = o00000Oo();
        if (oo000oVarO00000Oo != null) {
            return oo000oVarO00000Oo.Oooo0o();
        }
        return null;
    }

    @Nullable
    public oo000o o00000Oo() {
        return null;
    }

    public final <T extends o00Oo0<T, M>, C, M extends o00OOOO0> void o00000o0(T t, OooOO0<T, C, M> oooOO1, long j, o000000.OooOOO0<C> oooOOO0, boolean z, boolean z2) {
        if (t == null) {
            o00000oo(oooOO1, j, oooOOO0, z, z2);
            return;
        }
        C cOooO0Oo = oooOO1.OooO0Oo(t);
        OooOO0O childHitTest = new OooOO0O(t, oooOO1, j, oooOOO0, z, z2);
        Objects.requireNonNull(oooOOO0);
        Intrinsics.checkNotNullParameter(childHitTest, "childHitTest");
        oooOOO0.OooO0O0(cOooO0Oo, -1.0f, z2, childHitTest);
    }

    public final <T extends o00Oo0<T, M>, C, M extends o00OOOO0> void o00000oO(@NotNull OooOO0<T, C, M> hitTestSource, long j, @NotNull o000000.OooOOO0<C> hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        o00Oo0<?, ?> o00oo1 = this.f26713OooooOO[hitTestSource.OooO0o0()];
        if (!o0000Oo(j)) {
            if (z) {
                float fO0O0O00 = o0O0O00(j, o00000O());
                if (((Float.isInfinite(fO0O0O00) || Float.isNaN(fO0O0O00)) ? false : true) && hitTestResult.OooO0OO(fO0O0O00, false)) {
                    o0000Ooo(o00oo1, hitTestSource, j, hitTestResult, z, false, fO0O0O00);
                    return;
                }
                return;
            }
            return;
        }
        if (o00oo1 == null) {
            o00000oo(hitTestSource, j, hitTestResult, z, z2);
            return;
        }
        float fOooO0OO = o00O0O.OooO.OooO0OO(j);
        float fOooO0Oo = o00O0O.OooO.OooO0Oo(j);
        if (fOooO0OO >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && fOooO0Oo >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && fOooO0OO < ((float) OoooOoO()) && fOooO0Oo < ((float) OoooOOO())) {
            o00000o0(o00oo1, hitTestSource, j, hitTestResult, z, z2);
            return;
        }
        float fO0O0O01 = !z ? Float.POSITIVE_INFINITY : o0O0O00(j, o00000O());
        if (((Float.isInfinite(fO0O0O01) || Float.isNaN(fO0O0O01)) ? false : true) && hitTestResult.OooO0OO(fO0O0O01, z2)) {
            o0000Ooo(o00oo1, hitTestSource, j, hitTestResult, z, z2, fO0O0O01);
        } else {
            o0000OOO(o00oo1, hitTestSource, j, hitTestResult, z, z2, fO0O0O01);
        }
    }

    public <T extends o00Oo0<T, M>, C, M extends o00OOOO0> void o00000oo(@NotNull OooOO0<T, C, M> hitTestSource, long j, @NotNull o000000.OooOOO0<C> hitTestResult, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(hitTestSource, "hitTestSource");
        Intrinsics.checkNotNullParameter(hitTestResult, "hitTestResult");
        oo000o oo000oVarO00000Oo = o00000Oo();
        if (oo000oVarO00000Oo != null) {
            oo000oVarO00000Oo.o00000oO(hitTestSource, oo000oVarO00000Oo.o000000o(j), hitTestResult, z, z2);
        }
    }

    public final void o0000O(@NotNull o00O0O.OooO0o bounds, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        o000000 o000000Var = this.f26715Oooooo;
        if (o000000Var != null) {
            if (this.f26703OoooO0O) {
                if (z2) {
                    long jO00000O = o00000O();
                    float fOooO0Oo = o00O0O.OooOo00.OooO0Oo(jO00000O) / 2.0f;
                    float fOooO0O0 = o00O0O.OooOo00.OooO0O0(jO00000O) / 2.0f;
                    long j = this.f35267Oooo0oo;
                    bounds.OooO00o(-fOooO0Oo, -fOooO0O0, ((int) (j >> 32)) + fOooO0Oo, o0000O0O.o000oOoO.OooO0O0(j) + fOooO0O0);
                } else if (z) {
                    long j2 = this.f35267Oooo0oo;
                    bounds.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (int) (j2 >> 32), o0000O0O.o000oOoO.OooO0O0(j2));
                }
                if (bounds.OooO0O0()) {
                    return;
                }
            }
            o000000Var.OooO0OO(bounds, false);
        }
        long j3 = this.f26709OoooOoo;
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
        float f = (int) (j3 >> 32);
        bounds.f30398OooO00o += f;
        bounds.f30400OooO0OO += f;
        float fOooO0OO = o0000O0O.OooOo.OooO0OO(j3);
        bounds.f30399OooO0O0 += fOooO0OO;
        bounds.f30401OooO0Oo += fOooO0OO;
    }

    public void o0000O0() {
        o000000 o000000Var = this.f26715Oooooo;
        if (o000000Var != null) {
            o000000Var.invalidate();
        }
    }

    public final boolean o0000O00() {
        if (this.f26715Oooooo != null && this.f26705OoooOOO <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return true;
        }
        oo000o oo000oVar = this.f26701OoooO0;
        if (oo000oVar != null) {
            return oo000oVar.o0000O00();
        }
        return false;
    }

    public final void o0000O0O() {
        for (o00Oo0 o00oo1 = this.f26713OooooOO[4]; o00oo1 != null; o00oo1 = o00oo1.f26654Oooo0oo) {
            ((o000OO) ((o0000oo) o00oo1).f26653Oooo0oO).Oooo00O(this);
        }
    }

    public final boolean o0000OO() {
        o0000Ooo o0000ooo = (o0000Ooo) this.f26713OooooOO[1];
        if (o0000ooo != null && o0000ooo.OooO0OO()) {
            return true;
        }
        oo000o oo000oVarO00000Oo = o00000Oo();
        return oo000oVarO00000Oo != null && oo000oVarO00000Oo.o0000OO();
    }

    public final void o0000OO0(@NotNull o0O0O00.o000000O value) {
        LayoutNode layoutNodeOooOOoo;
        Intrinsics.checkNotNullParameter(value, "value");
        o0O0O00.o000000O o000000o2 = this.f26707OoooOo0;
        if (value != o000000o2) {
            this.f26707OoooOo0 = value;
            if (o000000o2 == null || value.getWidth() != o000000o2.getWidth() || value.getHeight() != o000000o2.getHeight()) {
                int width = value.getWidth();
                int height = value.getHeight();
                o000000 o000000Var = this.f26715Oooooo;
                if (o000000Var != null) {
                    o000000Var.OooO0o(o0000O0O.o0OoOo0.OooO00o(width, height));
                } else {
                    oo000o oo000oVar = this.f26701OoooO0;
                    if (oo000oVar != null) {
                        oo000oVar.o0000();
                    }
                }
                LayoutNode layoutNode = this.f26702OoooO00;
                o00000 o00000Var = layoutNode.f6143OoooO0O;
                if (o00000Var != null) {
                    o00000Var.OooO0o(layoutNode);
                }
                o0OoOo0(o0000O0O.o0OoOo0.OooO00o(width, height));
                for (o00Oo0 o00oo1 = this.f26713OooooOO[0]; o00oo1 != null; o00oo1 = o00oo1.f26654Oooo0oo) {
                    ((o000000.OooOO0) o00oo1).f26596OoooO0O = true;
                }
            }
            Map<o0O0O00.OooO00o, Integer> map = this.f26708OoooOoO;
            if ((!(map == null || map.isEmpty()) || (!value.OooO0o0().isEmpty())) && !Intrinsics.areEqual(value.OooO0o0(), this.f26708OoooOoO)) {
                oo000o oo000oVarO00000Oo = o00000Oo();
                if (Intrinsics.areEqual(oo000oVarO00000Oo != null ? oo000oVarO00000Oo.f26702OoooO00 : null, this.f26702OoooO00)) {
                    LayoutNode layoutNodeOooOOoo2 = this.f26702OoooO00.OooOOoo();
                    if (layoutNodeOooOOoo2 != null) {
                        layoutNodeOooOOoo2.Oooo0O0();
                    }
                    LayoutNode layoutNode2 = this.f26702OoooO00;
                    o0OoOo0 o0oooo1 = layoutNode2.f6154OooooOo;
                    if (o0oooo1.f26680OooO0OO) {
                        LayoutNode layoutNodeOooOOoo3 = layoutNode2.OooOOoo();
                        if (layoutNodeOooOOoo3 != null) {
                            layoutNodeOooOOoo3.OoooOO0(false);
                        }
                    } else if (o0oooo1.f26681OooO0Oo && (layoutNodeOooOOoo = layoutNode2.OooOOoo()) != null) {
                        layoutNodeOooOOoo.OoooO0O(false);
                    }
                } else {
                    this.f26702OoooO00.Oooo0O0();
                }
                this.f26702OoooO00.f6154OooooOo.f26679OooO0O0 = true;
                Map linkedHashMap = this.f26708OoooOoO;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.f26708OoooOoO = linkedHashMap;
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(value.OooO0o0());
            }
        }
    }

    public final <T extends o00Oo0<T, M>, C, M extends o00OOOO0> void o0000OOO(T t, OooOO0<T, C, M> oooOO1, long j, o000000.OooOOO0<C> oooOOO0, boolean z, boolean z2, float f) {
        if (t == null) {
            o00000oo(oooOO1, j, oooOOO0, z, z2);
        } else {
            oooOO1.OooO00o(t);
            o0000OOO(t.f26654Oooo0oo, oooOO1, j, oooOOO0, z, z2, f);
        }
    }

    public final long o0000OOo(long j) {
        o000000 o000000Var = this.f26715Oooooo;
        if (o000000Var != null) {
            j = o000000Var.OooO0o0(j, false);
        }
        long j2 = this.f26709OoooOoo;
        float fOooO0OO = o00O0O.OooO.OooO0OO(j);
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
        return o00O0O.OooOO0.OooO00o(fOooO0OO + ((int) (j2 >> 32)), o00O0O.OooO.OooO0Oo(j) + o0000O0O.OooOo.OooO0OO(j2));
    }

    public final boolean o0000Oo(long j) {
        if (!o00O0O.OooOO0.OooO0O0(j)) {
            return false;
        }
        o000000 o000000Var = this.f26715Oooooo;
        return o000000Var == null || !this.f26703OoooO0O || o000000Var.OooO0Oo(j);
    }

    public final void o0000Oo0() {
        oo000o oo000oVar;
        o000000 o000000Var = this.f26715Oooooo;
        if (o000000Var != null) {
            Function1<? super p145o00Oo0.o0000, Unit> function1 = this.f26700OoooO;
            if (function1 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            o000O0O0 o000o0o1 = f26699ooOO;
            o000o0o1.f32084Oooo0o = 1.0f;
            o000o0o1.f32085Oooo0oO = 1.0f;
            o000o0o1.f32086Oooo0oo = 1.0f;
            o000o0o1.f32083Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            o000o0o1.f32089OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            o000o0o1.f32088OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            long j = p145o00Oo0.o0000O00.f32072OooO00o;
            o000o0o1.f32090OoooO0O = j;
            o000o0o1.f32087OoooO = j;
            o000o0o1.f32091OoooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            o000o0o1.f32098o000oOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            o000o0o1.f32092OoooOOO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            o000o0o1.f32093OoooOOo = 8.0f;
            o00O00.OooO00o oooO00o = o00O00.f32112OooO0O0;
            o000o0o1.f32094OoooOo0 = o00O00.f32113OooO0OO;
            o000O0Oo.OooO00o oooO00o2 = o000O0Oo.f32099OooO00o;
            Intrinsics.checkNotNullParameter(oooO00o2, "<set-?>");
            o000o0o1.f32095OoooOoO = oooO00o2;
            o000o0o1.f32096OoooOoo = false;
            o0000O0O.OooO oooO = this.f26702OoooO00.f6150Ooooo00;
            Intrinsics.checkNotNullParameter(oooO, "<set-?>");
            o000o0o1.f32097Ooooo00 = oooO;
            o00Ooo.OooO00o(this.f26702OoooO00).getSnapshotObserver().OooO00o(this, f26695Ooooooo, new OooOOOO(function1));
            float f = o000o0o1.f32084Oooo0o;
            float f2 = o000o0o1.f32085Oooo0oO;
            float f3 = o000o0o1.f32086Oooo0oo;
            float f4 = o000o0o1.f32083Oooo;
            float f5 = o000o0o1.f32089OoooO00;
            float f6 = o000o0o1.f32088OoooO0;
            long j2 = o000o0o1.f32090OoooO0O;
            long j3 = o000o0o1.f32087OoooO;
            float f7 = o000o0o1.f32091OoooOO0;
            float f8 = o000o0o1.f32098o000oOoO;
            float f9 = o000o0o1.f32092OoooOOO;
            float f10 = o000o0o1.f32093OoooOOo;
            long j4 = o000o0o1.f32094OoooOo0;
            o000OOo0 o000ooo1 = o000o0o1.f32095OoooOoO;
            boolean z = o000o0o1.f32096OoooOoo;
            LayoutNode layoutNode = this.f26702OoooO00;
            o000000Var.OooO00o(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j4, o000ooo1, z, j2, j3, layoutNode.f6152OooooO0, layoutNode.f6150Ooooo00);
            oo000oVar = this;
            oo000oVar.f26703OoooO0O = o000o0o1.f32096OoooOoo;
        } else {
            oo000oVar = this;
            if (!(oo000oVar.f26700OoooO == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        oo000oVar.f26705OoooOOO = f26699ooOO.f32086Oooo0oo;
        LayoutNode layoutNode2 = oo000oVar.f26702OoooO00;
        o00000 o00000Var = layoutNode2.f6143OoooO0O;
        if (o00000Var != null) {
            o00000Var.OooO0o(layoutNode2);
        }
    }

    public final <T extends o00Oo0<T, M>, C, M extends o00OOOO0> void o0000Ooo(T t, OooOO0<T, C, M> oooOO1, long j, o000000.OooOOO0<C> oooOOO0, boolean z, boolean z2, float f) {
        if (t == null) {
            o00000oo(oooOO1, j, oooOOO0, z, z2);
        } else {
            oooOOO0.OooO0O0(oooOO1.OooO0Oo(t), f, z2, new OooOOO0(t, oooOO1, j, oooOOO0, z, z2, f));
        }
    }

    public final void o0000oO() {
        if (o000000.OooOO0O.OooO00o(this.f26713OooooOO, 5)) {
            oo00o oo00oVarOooO0oO = oo0o0O0.OooO0oO(oo0o0O0.f4157OooO0O0.OooO00o(), null, false);
            try {
                oo00o oo00oVarOooO = oo00oVarOooO0oO.OooO();
                try {
                    for (o00Oo0 o00oo1 = this.f26713OooooOO[5]; o00oo1 != null; o00oo1 = o00oo1.f26654Oooo0oo) {
                        ((o0000O) ((o0000oo) o00oo1).f26653Oooo0oO).OooOoO(this.f35267Oooo0oo);
                    }
                    Unit unit = Unit.INSTANCE;
                    oo00oVarOooO0oO.OooOOOo(oo00oVarOooO);
                    oo00oVarOooO0oO.OooO0OO();
                } catch (Throwable th) {
                    oo00oVarOooO0oO.OooOOOo(oo00oVarOooO);
                    throw th;
                }
            } catch (Throwable th2) {
                oo00oVarOooO0oO.OooO0OO();
                throw th2;
            }
        }
    }

    public final void o0000oo(@Nullable Function1<? super p145o00Oo0.o0000, Unit> function1) {
        LayoutNode layoutNode;
        o00000 o00000Var;
        boolean z = (this.f26700OoooO == function1 && Intrinsics.areEqual(this.f26704OoooOO0, this.f26702OoooO00.f6150Ooooo00) && this.f26717o000oOoO == this.f26702OoooO00.f6152OooooO0) ? false : true;
        this.f26700OoooO = function1;
        LayoutNode layoutNode2 = this.f26702OoooO00;
        this.f26704OoooOO0 = layoutNode2.f6150Ooooo00;
        this.f26717o000oOoO = layoutNode2.f6152OooooO0;
        if (!OooOoO() || function1 == null) {
            o000000 o000000Var = this.f26715Oooooo;
            if (o000000Var != null) {
                o000000Var.destroy();
                this.f26702OoooO00.f6167o00oO0O = true;
                this.f26714OooooOo.invoke();
                if (OooOoO() && (o00000Var = (layoutNode = this.f26702OoooO00).f6143OoooO0O) != null) {
                    o00000Var.OooO0o(layoutNode);
                }
            }
            this.f26715Oooooo = null;
            this.f26716Oooooo0 = false;
            return;
        }
        if (this.f26715Oooooo != null) {
            if (z) {
                o0000Oo0();
                return;
            }
            return;
        }
        o000000 o000000VarOooOO0O = o00Ooo.OooO00o(this.f26702OoooO00).OooOO0O(this, this.f26714OooooOo);
        o000000VarOooOO0O.OooO0o(this.f35267Oooo0oo);
        o000000VarOooOO0O.OooO0oO(this.f26709OoooOoo);
        this.f26715Oooooo = o000000VarOooOO0O;
        o0000Oo0();
        this.f26702OoooO00.f6167o00oO0O = true;
        this.f26714OooooOo.invoke();
    }

    public void o000OO(@NotNull p145o00Oo0.o0O0O00 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        oo000o oo000oVarO00000Oo = o00000Oo();
        if (oo000oVarO00000Oo != null) {
            oo000oVarO00000Oo.o000OOo(canvas);
        }
    }

    public final void o000OOo(@NotNull p145o00Oo0.o0O0O00 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        o000000 o000000Var = this.f26715Oooooo;
        if (o000000Var != null) {
            o000000Var.OooO(canvas);
            return;
        }
        long j = this.f26709OoooOoo;
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
        float f = (int) (j >> 32);
        float fOooO0OO = o0000O0O.OooOo.OooO0OO(j);
        canvas.OooO0O0(f, fOooO0OO);
        o000000.OooOO0 oooOO1 = (o000000.OooOO0) this.f26713OooooOO[0];
        if (oooOO1 == null) {
            o000OO(canvas);
        } else {
            oooOO1.OooO0OO(canvas);
        }
        canvas.OooO0O0(-f, -fOooO0OO);
    }

    public final float o0O0O00(long j, long j2) {
        if (OoooOoO() >= o00O0O.OooOo00.OooO0Oo(j2) && OoooOOO() >= o00O0O.OooOo00.OooO0O0(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long jO0OO00O = o0OO00O(j2);
        float fOooO0Oo = o00O0O.OooOo00.OooO0Oo(jO0OO00O);
        float fOooO0O0 = o00O0O.OooOo00.OooO0O0(jO0OO00O);
        float fOooO0OO = o00O0O.OooO.OooO0OO(j);
        float fMax = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fOooO0OO < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? -fOooO0OO : fOooO0OO - OoooOoO());
        float fOooO0Oo2 = o00O0O.OooO.OooO0Oo(j);
        long jOooO00o = o00O0O.OooOO0.OooO00o(fMax, Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fOooO0Oo2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? -fOooO0Oo2 : fOooO0Oo2 - OoooOOO()));
        if ((fOooO0Oo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || fOooO0O0 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) && o00O0O.OooO.OooO0OO(jOooO00o) <= fOooO0Oo && o00O0O.OooO.OooO0Oo(jOooO00o) <= fOooO0O0) {
            return (o00O0O.OooO.OooO0Oo(jOooO00o) * o00O0O.OooO.OooO0Oo(jOooO00o)) + (o00O0O.OooO.OooO0OO(jOooO00o) * o00O0O.OooO.OooO0OO(jOooO00o));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final long o0OO00O(long j) {
        return o00O0O.OooOo.OooO00o(Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (o00O0O.OooOo00.OooO0Oo(j) - OoooOoO()) / 2.0f), Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (o00O0O.OooOo00.OooO0O0(j) - OoooOOO()) / 2.0f));
    }

    public final void o0OOO0o() {
        this.f26706OoooOOo = true;
        o0000oo(this.f26700OoooO);
        for (o00Oo0 o00oo1 : this.f26713OooooOO) {
            for (; o00oo1 != null; o00oo1 = o00oo1.f26654Oooo0oo) {
                o00oo1.OooO00o();
            }
        }
    }

    public abstract int o0Oo0oo(@NotNull o0O0O00.OooO00o oooO00o);

    public final void o0ooOO0(oo000o oo000oVar, o00O0O.OooO0o oooO0o, boolean z) {
        if (oo000oVar == this) {
            return;
        }
        oo000o oo000oVar2 = this.f26701OoooO0;
        if (oo000oVar2 != null) {
            oo000oVar2.o0ooOO0(oo000oVar, oooO0o, z);
        }
        long j = this.f26709OoooOoo;
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
        float f = (int) (j >> 32);
        oooO0o.f30398OooO00o -= f;
        oooO0o.f30400OooO0OO -= f;
        float fOooO0OO = o0000O0O.OooOo.OooO0OO(j);
        oooO0o.f30399OooO0O0 -= fOooO0OO;
        oooO0o.f30401OooO0Oo -= fOooO0OO;
        o000000 o000000Var = this.f26715Oooooo;
        if (o000000Var != null) {
            o000000Var.OooO0OO(oooO0o, true);
            if (this.f26703OoooO0O && z) {
                long j2 = this.f35267Oooo0oo;
                oooO0o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (int) (j2 >> 32), o0000O0O.o000oOoO.OooO0O0(j2));
            }
        }
    }

    public final long o0ooOoO(oo000o oo000oVar, long j) {
        if (oo000oVar == this) {
            return j;
        }
        oo000o oo000oVar2 = this.f26701OoooO0;
        return (oo000oVar2 == null || Intrinsics.areEqual(oo000oVar, oo000oVar2)) ? o000000o(j) : o000000o(oo000oVar2.o0ooOoO(oo000oVar, j));
    }

    public final void oo0o0Oo() {
        for (o00Oo0 o00oo1 : this.f26713OooooOO) {
            for (; o00oo1 != null; o00oo1 = o00oo1.f26654Oooo0oo) {
                o00oo1.OooO0O0();
            }
        }
        this.f26706OoooOOo = false;
        o0000oo(this.f26700OoooO);
        LayoutNode layoutNodeOooOOoo = this.f26702OoooO00.OooOOoo();
        if (layoutNodeOooOOoo != null) {
            layoutNodeOooOOoo.OooOoO0();
        }
    }
}
