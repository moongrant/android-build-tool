package p114o00O00o;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import coil.annotation.ExperimentalCoilApi;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o00O0OO0.OooOOO0;
import oOO00O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oo0oO0;
import p145o00Oo0.o00000O;
import p191o00o0O.o0Oo0oo;
import p263o00ooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class OooOo00 extends o000OO0O implements oo0oO0 {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public Job f30279OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f30280OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public CoroutineScope f30281OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30282OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30283OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30284OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public OooO00o f30285OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f30286OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30287OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30288Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30289Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f30290o000oOoO;

    @ExperimentalCoilApi
    public interface OooO00o {

        /* JADX INFO: renamed from: o00O00o.OooOo00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0330OooO00o implements OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C0330OooO00o f30291OooO00o = new C0330OooO00o();

            @Override // o00O00o.OooOo00.OooO00o
            public final boolean OooO00o(@Nullable OooO0O0 oooO0O0, @NotNull OooO0O0 current) {
                Intrinsics.checkNotNullParameter(current, "current");
                if (!Intrinsics.areEqual(current.f30292OooO00o, OooO0OO.OooO00o.f30295OooO00o)) {
                    if (Intrinsics.areEqual(oooO0O0 == null ? null : oooO0O0.f30293OooO0O0, current.f30293OooO0O0)) {
                        return false;
                    }
                }
                return true;
            }
        }

        boolean OooO00o(@Nullable OooO0O0 oooO0O0, @NotNull OooO0O0 oooO0O1);
    }

    @StabilityInferred(parameters = 0)
    @ExperimentalCoilApi
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final OooO0OO f30292OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final coil.request.OooO00o f30293OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f30294OooO0OO;

        public OooO0O0(OooO0OO oooO0OO, coil.request.OooO00o oooO00o, long j) {
            this.f30292OooO00o = oooO0OO;
            this.f30293OooO0O0 = oooO00o;
            this.f30294OooO0OO = j;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return Intrinsics.areEqual(this.f30292OooO00o, oooO0O0.f30292OooO00o) && Intrinsics.areEqual(this.f30293OooO0O0, oooO0O0.f30293OooO0O0) && o00O0O.OooOo00.OooO00o(this.f30294OooO0OO, oooO0O0.f30294OooO0OO);
        }

        public final int hashCode() {
            return o00O0O.OooOo00.OooO0o0(this.f30294OooO0OO) + ((this.f30293OooO0O0.hashCode() + (this.f30292OooO00o.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Snapshot(state=");
            sbOooO0o0.append(this.f30292OooO00o);
            sbOooO0o0.append(", request=");
            sbOooO0o0.append(this.f30293OooO0O0);
            sbOooO0o0.append(", size=");
            sbOooO0o0.append((Object) o00O0O.OooOo00.OooO0oO(this.f30294OooO0OO));
            sbOooO0o0.append(')');
            return sbOooO0o0.toString();
        }
    }

    @StabilityInferred(parameters = 0)
    @ExperimentalCoilApi
    public static abstract class OooO0OO {

        @StabilityInferred(parameters = 0)
        public static final class OooO00o extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public static final OooO00o f30295OooO00o = new OooO00o();

            public OooO00o() {
                super(null);
            }

            @Override // o00O00o.OooOo00.OooO0OO
            @Nullable
            public final o000OO0O OooO00o() {
                return null;
            }
        }

        @StabilityInferred(parameters = 0)
        public static final class OooO0O0 extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @Nullable
            public final o000OO0O f30296OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @NotNull
            public final Throwable f30297OooO0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(@Nullable o000OO0O o000oo0o2, @NotNull Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f30296OooO00o = o000oo0o2;
                this.f30297OooO0O0 = throwable;
            }

            @Override // o00O00o.OooOo00.OooO0OO
            @Nullable
            public final o000OO0O OooO00o() {
                return this.f30296OooO00o;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0O0)) {
                    return false;
                }
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                return Intrinsics.areEqual(this.f30296OooO00o, oooO0O0.f30296OooO00o) && Intrinsics.areEqual(this.f30297OooO0O0, oooO0O0.f30297OooO0O0);
            }

            public final int hashCode() {
                o000OO0O o000oo0o2 = this.f30296OooO00o;
                return this.f30297OooO0O0.hashCode() + ((o000oo0o2 == null ? 0 : o000oo0o2.hashCode()) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Error(painter=");
                sbOooO0o0.append(this.f30296OooO00o);
                sbOooO0o0.append(", throwable=");
                sbOooO0o0.append(this.f30297OooO0O0);
                sbOooO0o0.append(')');
                return sbOooO0o0.toString();
            }
        }

        /* JADX INFO: renamed from: o00O00o.OooOo00$OooO0OO$OooO0OO, reason: collision with other inner class name */
        @StabilityInferred(parameters = 0)
        public static final class C0331OooO0OO extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @Nullable
            public final o000OO0O f30298OooO00o;

            public C0331OooO0OO(@Nullable o000OO0O o000oo0o2) {
                super(null);
                this.f30298OooO00o = o000oo0o2;
            }

            @Override // o00O00o.OooOo00.OooO0OO
            @Nullable
            public final o000OO0O OooO00o() {
                return this.f30298OooO00o;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0331OooO0OO) && Intrinsics.areEqual(this.f30298OooO00o, ((C0331OooO0OO) obj).f30298OooO00o);
            }

            public final int hashCode() {
                o000OO0O o000oo0o2 = this.f30298OooO00o;
                if (o000oo0o2 == null) {
                    return 0;
                }
                return o000oo0o2.hashCode();
            }

            @NotNull
            public final String toString() {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Loading(painter=");
                sbOooO0o0.append(this.f30298OooO00o);
                sbOooO0o0.append(')');
                return sbOooO0o0.toString();
            }
        }

        @StabilityInferred(parameters = 0)
        public static final class OooO0o extends OooO0OO {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public final o000OO0O f30299OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @NotNull
            public final OooOOO0.OooO00o f30300OooO0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(@NotNull o000OO0O painter, @NotNull OooOOO0.OooO00o metadata) {
                super(null);
                Intrinsics.checkNotNullParameter(painter, "painter");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                this.f30299OooO00o = painter;
                this.f30300OooO0O0 = metadata;
            }

            @Override // o00O00o.OooOo00.OooO0OO
            @NotNull
            public final o000OO0O OooO00o() {
                return this.f30299OooO00o;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OooO0o)) {
                    return false;
                }
                OooO0o oooO0o = (OooO0o) obj;
                return Intrinsics.areEqual(this.f30299OooO00o, oooO0o.f30299OooO00o) && Intrinsics.areEqual(this.f30300OooO0O0, oooO0o.f30300OooO0O0);
            }

            public final int hashCode() {
                return this.f30300OooO0O0.hashCode() + (this.f30299OooO00o.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Success(painter=");
                sbOooO0o0.append(this.f30299OooO00o);
                sbOooO0o0.append(", metadata=");
                sbOooO0o0.append(this.f30300OooO0O0);
                sbOooO0o0.append(')');
                return sbOooO0o0.toString();
            }
        }

        public OooO0OO() {
        }

        @Nullable
        public abstract o000OO0O OooO00o();

        public OooO0OO(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @DebugMetadata(c = "coil.compose.ImagePainter$onRemembered$1", f = "ImagePainter.kt", i = {}, l = {379}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f30301Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f30302Oooo0oO;

        public static final class OooO00o extends Lambda implements Function0<coil.request.OooO00o> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ OooOo00 f30304Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooOo00 oooOo00) {
                super(0);
                this.f30304Oooo0o = oooOo00;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final coil.request.OooO00o invoke() {
                return (coil.request.OooO00o) this.f30304Oooo0o.f30288Ooooo00.getValue();
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<o00O0O.OooOo00> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ OooOo00 f30305Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(OooOo00 oooOo00) {
                super(0);
                this.f30305Oooo0o = oooOo00;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final o00O0O.OooOo00 invoke() {
                return new o00O0O.OooOo00(((o00O0O.OooOo00) this.f30305Oooo0o.f30282OoooOO0.getValue()).f30419OooO00o);
            }
        }

        public /* synthetic */ class OooO0OO extends AdaptedFunctionReference implements Function3, SuspendFunction {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public static final OooO0OO f30306Oooo0o = new OooO0OO();

            public OooO0OO() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new Pair((coil.request.OooO00o) obj, new o00O0O.OooOo00(((o00O0O.OooOo00) obj2).f30419OooO00o));
            }
        }

        /* JADX INFO: renamed from: o00O00o.OooOo00$OooO0o$OooO0o, reason: collision with other inner class name */
        public static final class C0332OooO0o implements FlowCollector<Pair<? extends coil.request.OooO00o, ? extends o00O0O.OooOo00>> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f30307Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ OooOo00 f30308Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f30309Oooo0oo;

            public C0332OooO0o(Ref.ObjectRef objectRef, OooOo00 oooOo00, CoroutineScope coroutineScope) {
                this.f30307Oooo0o = objectRef;
                this.f30308Oooo0oO = oooOo00;
                this.f30309Oooo0oo = coroutineScope;
            }

            /* JADX WARN: Code duplicated, block: B:14:0x0057  */
            /* JADX WARN: Code duplicated, block: B:17:0x0064  */
            /* JADX WARN: Code duplicated, block: B:20:0x006a  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [T, o00O00o.OooOo00$OooO0O0] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(Pair<? extends coil.request.OooO00o, ? extends o00O0O.OooOo00> pair, @NotNull Continuation<? super Unit> continuation) {
                OooOo00 oooOo00;
                CoroutineScope coroutineScope;
                Job job;
                Pair<? extends coil.request.OooO00o, ? extends o00O0O.OooOo00> pair2 = pair;
                coil.request.OooO00o oooO00oComponent1 = pair2.component1();
                long j = pair2.component2().f30419OooO00o;
                OooO0O0 oooO0O0 = (OooO0O0) this.f30307Oooo0o.element;
                ?? oooO0O1 = new OooO0O0((OooO0OO) this.f30308Oooo0oO.f30287OoooOoo.getValue(), oooO00oComponent1, j);
                this.f30307Oooo0o.element = oooO0O1;
                if (oooO00oComponent1.f9907Oooo00O.f30570OooO0O0 == null) {
                    o00O0O.OooOo00.OooO00o oooO00o = o00O0O.OooOo00.f30416OooO0O0;
                    if (!(j != o00O0O.OooOo00.f30418OooO0Oo) || (o00O0O.OooOo00.OooO0Oo(j) > 0.5f && o00O0O.OooOo00.OooO0O0(j) > 0.5f)) {
                        oooOo00 = this.f30308Oooo0oO;
                        coroutineScope = this.f30309Oooo0oo;
                        if (oooOo00.f30285OoooOo0.OooO00o(oooO0O0, oooO0O1)) {
                            job = oooOo00.f30279OoooO;
                            if (job != null) {
                                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                            }
                            oooOo00.f30279OoooO = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OooOo(oooOo00, oooO0O1, null), 3, null);
                        }
                    } else {
                        OooOo00.OooOO0O(this.f30308Oooo0oO, OooO0OO.OooO00o.f30295OooO00o);
                    }
                } else {
                    oooOo00 = this.f30308Oooo0oO;
                    coroutineScope = this.f30309Oooo0oo;
                    if (oooOo00.f30285OoooOo0.OooO00o(oooO0O0, oooO0O1)) {
                        job = oooOo00.f30279OoooO;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        oooOo00.f30279OoooO = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OooOo(oooOo00, oooO0O1, null), 3, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = OooOo00.this.new OooO0o(continuation);
            oooO0o.f30302Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30301Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f30302Oooo0oO;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Flow flowCombine = FlowKt.combine(o0OOO00.OooO0oO(new OooO00o(OooOo00.this)), o0OOO00.OooO0oO(new OooO0O0(OooOo00.this)), OooO0OO.f30306Oooo0o);
                C0332OooO0o c0332OooO0o = new C0332OooO0o(objectRef, OooOo00.this, coroutineScope);
                this.f30301Oooo0o = 1;
                if (flowCombine.collect(c0332OooO0o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public OooOo00(@NotNull CoroutineScope parentScope, @NotNull coil.request.OooO00o request, @NotNull OooOO0 imageLoader) {
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.f30280OoooO0 = parentScope;
        o00O0O.OooOo00.OooO00o oooO00o = o00O0O.OooOo00.f30416OooO0O0;
        this.f30282OoooOO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new o00O0O.OooOo00(o00O0O.OooOo00.f30417OooO0OO));
        this.f30290o000oOoO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Float.valueOf(1.0f));
        this.f30283OoooOOO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f30284OoooOOo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f30285OoooOo0 = OooO00o.C0330OooO00o.f30291OooO00o;
        this.f30287OoooOoo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(OooO0OO.OooO00o.f30295OooO00o);
        this.f30288Ooooo00 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(request);
        this.f30289Ooooo0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(imageLoader);
    }

    public static final void OooOO0O(OooOo00 oooOo00, OooO0OO oooO0OO) {
        oooOo00.f30287OoooOoo.setValue(oooO0OO);
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO00o() {
        OooO0O0();
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0O0() {
        CoroutineScope coroutineScope = this.f30281OoooO0O;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.f30281OoooO0O = null;
        Job job = this.f30279OoooO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f30279OoooO = null;
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0OO(float f) {
        this.f30290o000oOoO.setValue(Float.valueOf(f));
        return true;
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0Oo() {
        if (this.f30286OoooOoO) {
            return;
        }
        CoroutineScope coroutineScope = this.f30281OoooO0O;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        CoroutineContext coroutineContext = this.f30280OoooO0.getCoroutineContext();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineContext.plus(SupervisorKt.SupervisorJob((Job) coroutineContext.get(Job.INSTANCE))));
        this.f30281OoooO0O = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new OooO0o(null), 3, null);
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0o0(@Nullable o00000O o00000o) {
        this.f30283OoooOOO.setValue(o00000o);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p263o00ooo.o000OO0O
    public final long OooO0oo() {
        o000OO0O o000oo0o2 = (o000OO0O) this.f30284OoooOOo.getValue();
        o00O0O.OooOo00 oooOo00 = o000oo0o2 == null ? null : new o00O0O.OooOo00(o000oo0o2.OooO0oo());
        if (oooOo00 != null) {
            return oooOo00.f30419OooO00o;
        }
        o00O0O.OooOo00.OooO00o oooO00o = o00O0O.OooOo00.f30416OooO0O0;
        return o00O0O.OooOo00.f30418OooO0Oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p263o00ooo.o000OO0O
    public final void OooOO0(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        this.f30282OoooOO0.setValue(new o00O0O.OooOo00(o0oo0oo2.OooO0OO()));
        o000OO0O o000oo0o2 = (o000OO0O) this.f30284OoooOOo.getValue();
        if (o000oo0o2 == null) {
            return;
        }
        o000oo0o2.OooO0oO(o0oo0oo2, o0oo0oo2.OooO0OO(), ((Number) this.f30290o000oOoO.getValue()).floatValue(), (o00000O) this.f30283OoooOOO.getValue());
    }

    public final void OooOO0o(@Nullable o000OO0O o000oo0o2) {
        this.f30284OoooOOo.setValue(o000oo0o2);
    }
}
