package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00oO0;
import p100o000oOoO.o0O0oo00;
import p100o000oOoO.o0oOo0O0;

/* JADX INFO: loaded from: classes.dex */
@InternalComposeUiApi
public interface o0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f6611OooO00o = OooO00o.f6612OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f6612OooO00o = new OooO00o();

        /* JADX INFO: renamed from: androidx.compose.ui.platform.o0O0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0038OooO00o implements o0O0o {

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public static final C0038OooO00o f6613OooO0O0 = new C0038OooO00o();

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.coroutines.CoroutineContext] */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v12 */
            /* JADX WARN: Type inference failed for: r3v7, types: [kotlin.coroutines.CoroutineContext] */
            /* JADX WARN: Type inference failed for: r3v9, types: [T, androidx.compose.ui.platform.oo00o] */
            @Override // androidx.compose.ui.platform.o0O0o
            @NotNull
            public final Recomposer OooO00o(@NotNull final View rootView) {
                CoroutineContext value;
                CoroutineContext coroutineContextPlus;
                final o0O00oO0 o0o00oo1;
                ?? oo00oVar;
                Intrinsics.checkNotNullParameter(rootView, "rootView");
                Map<Context, StateFlow<Float>> map = o0O000Oo.f6580OooO00o;
                CoroutineContext coroutineContext = EmptyCoroutineContext.INSTANCE;
                Intrinsics.checkNotNullParameter(rootView, "<this>");
                Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
                if (coroutineContext.get(ContinuationInterceptor.INSTANCE) == null || coroutineContext.get(o000oOoO.o0O000o0.OooO00o.f29528Oooo0o) == null) {
                    o0000Ooo.OooO0OO oooO0OO = o0000Ooo.f6411OoooOOO;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        value = o0000Ooo.f6412OoooOOo.getValue();
                    } else {
                        value = o0000Ooo.f6413OoooOo0.get();
                        if (value == null) {
                            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                        }
                    }
                    coroutineContextPlus = value.plus(coroutineContext);
                } else {
                    coroutineContextPlus = coroutineContext;
                }
                p100o000oOoO.o0O000o0 o0o000o1 = (p100o000oOoO.o0O000o0) coroutineContextPlus.get(o000oOoO.o0O000o0.OooO00o.f29528Oooo0o);
                if (o0o000o1 != null) {
                    o0O00oO0 o0o00oo2 = new o0O00oO0(o0o000o1);
                    p100o000oOoO.o0O000O o0o000o = o0o00oo2.f29542Oooo0oO;
                    synchronized (o0o000o.f29522OooO00o) {
                        o0o000o.f29525OooO0Oo = false;
                        Unit unit = Unit.INSTANCE;
                    }
                    o0o00oo1 = o0o00oo2;
                } else {
                    o0o00oo1 = null;
                }
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                p048OoooooO.o00Oo00 o00oo00 = (p048OoooooO.o00Oo00) coroutineContextPlus.get(OoooooO.o00Oo00.OooO00o.f4200Oooo0o);
                ?? r3 = o00oo00;
                if (o00oo00 == null) {
                    oo00oVar = new oo00o();
                    objectRef.element = oo00oVar;
                }
                if (o0o00oo1 != null) {
                    r3 = oo00oVar;
                    coroutineContext = o0o00oo1;
                }
                r3 = oo00oVar;
                CoroutineContext coroutineContextPlus2 = coroutineContextPlus.plus(coroutineContext).plus(r3);
                final Recomposer recomposer = new Recomposer(coroutineContextPlus2);
                final CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineContextPlus2);
                LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(rootView);
                Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
                if (lifecycle != null) {
                    rootView.addOnAttachStateChangeListener(new o0O000(rootView, recomposer));
                    lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                        public /* synthetic */ class OooO00o {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[Lifecycle.Event.values().length];
                                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
                                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
                                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
                                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {391}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
                        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                            public final /* synthetic */ Recomposer f6330Oooo;

                            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                            public int f6331Oooo0o;

                            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                            public /* synthetic */ Object f6332Oooo0oO;

                            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                            public final /* synthetic */ Ref.ObjectRef<oo00o> f6333Oooo0oo;

                            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
                            public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f6334OoooO0;

                            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
                            public final /* synthetic */ LifecycleOwner f6335OoooO00;

                            /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
                            public final /* synthetic */ View f6336OoooO0O;

                            @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", i = {}, l = {386}, m = "invokeSuspend", n = {}, s = {})
                            public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                                public int f6337Oooo0o;

                                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                                public final /* synthetic */ StateFlow<Float> f6338Oooo0oO;

                                /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
                                public final /* synthetic */ oo00o f6339Oooo0oo;

                                /* JADX INFO: renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
                                public static final class C0037OooO00o implements FlowCollector<Float> {

                                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                                    public final /* synthetic */ oo00o f6340Oooo0o;

                                    public C0037OooO00o(oo00o oo00oVar) {
                                        this.f6340Oooo0o = oo00oVar;
                                    }

                                    @Override // kotlinx.coroutines.flow.FlowCollector
                                    public final Object emit(Float f, Continuation continuation) {
                                        this.f6340Oooo0o.f6628Oooo0o.setValue(Float.valueOf(f.floatValue()));
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public OooO00o(StateFlow<Float> stateFlow, oo00o oo00oVar, Continuation<? super OooO00o> continuation) {
                                    super(2, continuation);
                                    this.f6338Oooo0oO = stateFlow;
                                    this.f6339Oooo0oo = oo00oVar;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new OooO00o(this.f6338Oooo0oO, this.f6339Oooo0oo, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.f6337Oooo0o;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        StateFlow<Float> stateFlow = this.f6338Oooo0oO;
                                        C0037OooO00o c0037OooO00o = new C0037OooO00o(this.f6339Oooo0oo);
                                        this.f6337Oooo0o = 1;
                                        if (stateFlow.collect(c0037OooO00o, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    throw new KotlinNothingValueException();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public OooO0O0(Ref.ObjectRef<oo00o> objectRef, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, Continuation<? super OooO0O0> continuation) {
                                super(2, continuation);
                                this.f6333Oooo0oo = objectRef;
                                this.f6330Oooo = recomposer;
                                this.f6335OoooO00 = lifecycleOwner;
                                this.f6334OoooO0 = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
                                this.f6336OoooO0O = view;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                OooO0O0 oooO0O0 = new OooO0O0(this.f6333Oooo0oo, this.f6330Oooo, this.f6335OoooO00, this.f6334OoooO0, this.f6336OoooO0O, continuation);
                                oooO0O0.f6332Oooo0oO = obj;
                                return oooO0O0;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Code duplicated, block: B:30:0x009e  */
                            /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                Job job;
                                Job jobLaunch$default;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.f6331Oooo0o;
                                if (i != 0) {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    job = (Job) this.f6332Oooo0oO;
                                    try {
                                        ResultKt.throwOnFailure(obj);
                                        if (job != null) {
                                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                        }
                                        this.f6335OoooO00.getLifecycle().removeObserver(this.f6334OoooO0);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (job != null) {
                                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                        }
                                        this.f6335OoooO00.getLifecycle().removeObserver(this.f6334OoooO0);
                                        throw th;
                                    }
                                }
                                ResultKt.throwOnFailure(obj);
                                CoroutineScope coroutineScope = (CoroutineScope) this.f6332Oooo0oO;
                                try {
                                    oo00o oo00oVar = this.f6333Oooo0oo.element;
                                    if (oo00oVar != null) {
                                        Context applicationContext = this.f6336OoooO0O.getContext().getApplicationContext();
                                        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                                        StateFlow stateFlowOooO00o = o0O000Oo.OooO00o(applicationContext);
                                        oo00oVar.f6628Oooo0o.setValue(Float.valueOf(((Number) stateFlowOooO00o.getValue()).floatValue()));
                                        jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OooO00o(stateFlowOooO00o, oo00oVar, null), 3, null);
                                    } else {
                                        jobLaunch$default = null;
                                    }
                                    try {
                                        Recomposer recomposer = this.f6330Oooo;
                                        this.f6332Oooo0oO = jobLaunch$default;
                                        this.f6331Oooo0o = 1;
                                        Objects.requireNonNull(recomposer);
                                        Object objWithContext = BuildersKt.withContext(recomposer.f5965OooO00o, new o0oOo0O0(recomposer, new o0O0oo00(recomposer, null), p100o000oOoO.o0O00.OooO00o(getContext()), null), this);
                                        if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                            objWithContext = Unit.INSTANCE;
                                        }
                                        if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                            objWithContext = Unit.INSTANCE;
                                        }
                                        if (objWithContext == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        job = jobLaunch$default;
                                        if (job != null) {
                                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                        }
                                        this.f6335OoooO00.getLifecycle().removeObserver(this.f6334OoooO0);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th2) {
                                        job = jobLaunch$default;
                                        th = th2;
                                        if (job != null) {
                                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                        }
                                        this.f6335OoooO00.getLifecycle().removeObserver(this.f6334OoooO0);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    job = null;
                                }
                            }
                        }

                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(@NotNull LifecycleOwner lifecycleOwner2, @NotNull Lifecycle.Event event) {
                            boolean z;
                            Intrinsics.checkNotNullParameter(lifecycleOwner2, "lifecycleOwner");
                            Intrinsics.checkNotNullParameter(event, "event");
                            int i = OooO00o.$EnumSwitchMapping$0[event.ordinal()];
                            if (i == 1) {
                                BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, CoroutineStart.UNDISPATCHED, new OooO0O0(objectRef, recomposer, lifecycleOwner2, this, rootView, null), 1, null);
                                return;
                            }
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        return;
                                    }
                                    recomposer.OooOo0();
                                    return;
                                }
                                o0O00oO0 o0o00oo3 = o0o00oo1;
                                if (o0o00oo3 != null) {
                                    p100o000oOoO.o0O000O o0o000o2 = o0o00oo3.f29542Oooo0oO;
                                    synchronized (o0o000o2.f29522OooO00o) {
                                        o0o000o2.f29525OooO0Oo = false;
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    return;
                                }
                                return;
                            }
                            o0O00oO0 o0o00oo4 = o0o00oo1;
                            if (o0o00oo4 != null) {
                                p100o000oOoO.o0O000O o0o000o3 = o0o00oo4.f29542Oooo0oO;
                                synchronized (o0o000o3.f29522OooO00o) {
                                    synchronized (o0o000o3.f29522OooO00o) {
                                        z = o0o000o3.f29525OooO0Oo;
                                    }
                                    if (z) {
                                        return;
                                    }
                                    List<Continuation<Unit>> list = o0o000o3.f29523OooO0O0;
                                    o0o000o3.f29523OooO0O0 = o0o000o3.f29524OooO0OO;
                                    o0o000o3.f29524OooO0OO = list;
                                    o0o000o3.f29525OooO0Oo = true;
                                    int size = list.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        Continuation<Unit> continuation = list.get(i2);
                                        Result.Companion companion = Result.INSTANCE;
                                        continuation.resumeWith(Result.m502constructorimpl(Unit.INSTANCE));
                                    }
                                    list.clear();
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            }
                        }
                    });
                    return recomposer;
                }
                throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + rootView).toString());
            }
        }
    }

    @NotNull
    Recomposer OooO00o(@NotNull View view);
}
