package p117o00O0OOo;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import coil.annotation.ExperimentalCoilApi;
import coil.decode.DataSource;
import coil.size.Scale;
import com.qiniu.android.collect.ReportItem;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import o00O0OO0.OooO;
import o00O0OO0.OooOOO0;
import o00O0OO0.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;
import p103o000oo00.OooOO0O;
import p119o00O0Oo0.o00O0O;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalCoilApi
public final class OooO0OO implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f30595OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f30596OooO0O0;

    @DebugMetadata(c = "coil.transition.CrossfadeTransition", f = "CrossfadeTransition.kt", i = {0, 0, 0, 0}, l = {98}, m = "transition", n = {"this", "target", ReportItem.QualityKeyResult, "outerCrossfade"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Ref.ObjectRef f30597Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooO0OO f30598Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public OooOO0 f30599Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public OooOOO0 f30600Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f30602OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f30603OoooO0O;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30602OoooO00 = obj;
            this.f30603OoooO0O |= Integer.MIN_VALUE;
            return OooO0OO.this.OooO00o(null, null, this);
        }
    }

    public static final class OooO0O0 extends OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ oo00o.OooO00o f30604OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Unit> f30605OooO0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(oo00o.OooO00o oooO00o, CancellableContinuation<? super Unit> cancellableContinuation) {
            this.f30604OooO00o = oooO00o;
            this.f30605OooO0O0 = cancellableContinuation;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o000oo00.OooOO0O>] */
        @Override // p103o000oo00.OooOO0O
        public final void OooO00o() {
            oo00o.OooO00o oooO00o = this.f30604OooO00o;
            Objects.requireNonNull(oooO00o);
            Intrinsics.checkNotNullParameter(this, "callback");
            oooO00o.f53279OoooO00.remove(this);
            CancellableContinuation<Unit> cancellableContinuation = this.f30605OooO0O0;
            Unit unit = Unit.INSTANCE;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(unit));
        }
    }

    public OooO0OO(int i, int i2) {
        i = (i2 & 1) != 0 ? 100 : i;
        this.f30595OooO00o = i;
        this.f30596OooO0O0 = false;
        if (!(i > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, android.graphics.drawable.Drawable, oo00o.OooO00o] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p117o00O0OOo.OooO
    @Nullable
    public final Object OooO00o(@NotNull OooOO0 oooOO1, @NotNull OooOOO0 oooOOO0, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        OooO00o oooO00o;
        Throwable th;
        Ref.ObjectRef objectRef;
        oo00o.OooO00o oooO00o2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f30603OoooO0O;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f30603OoooO0O = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f30602OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f30603OoooO0O;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = oooO00o.f30597Oooo;
            try {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                oooO00o2 = (oo00o.OooO00o) objectRef.element;
                if (oooO00o2 != null) {
                    oooO00o2.stop();
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        boolean z = oooOOO0 instanceof OooOo00;
        if (z) {
            OooOo00 oooOo00 = (OooOo00) oooOOO0;
            if (oooOo00.f30594OooO0OO.f30586OooO0OO == DataSource.MEMORY_CACHE) {
                oooOO1.OooO00o(oooOo00.f30592OooO00o);
                return Unit.INSTANCE;
            }
        }
        if (!oooOO1.getView().isShown()) {
            if (z) {
                oooOO1.OooO00o(((OooOo00) oooOOO0).f30592OooO00o);
            } else if (oooOOO0 instanceof OooO) {
                oooOOO0.OooO00o();
                oooOO1.onError();
            }
            return Unit.INSTANCE;
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            oooO00o.f30598Oooo0o = this;
            oooO00o.f30599Oooo0oO = oooOO1;
            oooO00o.f30600Oooo0oo = oooOOO0;
            oooO00o.f30597Oooo = objectRef2;
            oooO00o.f30603OoooO0O = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO00o), 1);
            cancellableContinuationImpl.initCancellability();
            Drawable drawableOooO0Oo = oooOO1.OooO0Oo();
            Drawable drawableOooO00o = oooOOO0.OooO00o();
            View view = oooOO1.getView();
            Scale scaleOooO0Oo = null;
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView != null) {
                scaleOooO0Oo = o00O0O.OooO0Oo(imageView);
            }
            ?? oooO00o3 = new oo00o.OooO00o(drawableOooO0Oo, drawableOooO00o, scaleOooO0Oo == null ? Scale.FILL : scaleOooO0Oo, this.f30595OooO00o, ((oooOOO0 instanceof OooOo00) && ((OooOo00) oooOOO0).f30594OooO0OO.f30587OooO0Oo) ? false : true, this.f30596OooO0O0);
            objectRef2.element = oooO00o3;
            OooO0O0 callback = new OooO0O0(oooO00o3, cancellableContinuationImpl);
            Intrinsics.checkNotNullParameter(callback, "callback");
            oooO00o3.f53279OoooO00.add(callback);
            if (oooOOO0 instanceof OooOo00) {
                oooOO1.OooO00o(oooO00o3);
            } else if (oooOOO0 instanceof OooO) {
                oooOO1.onError();
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(oooO00o);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            objectRef = objectRef2;
            oooO00o2 = (oo00o.OooO00o) objectRef.element;
            if (oooO00o2 != null) {
                oooO00o2.stop();
            }
            throw th;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return this == obj || ((obj instanceof OooO0OO) && this.f30595OooO00o == ((OooO0OO) obj).f30595OooO00o);
    }

    public final int hashCode() {
        return this.f30595OooO00o;
    }

    @NotNull
    public final String toString() {
        return o0O0ooO.OooO00o(OooO00o.OooO00o.OooO0o0("CrossfadeTransition(durationMillis="), this.f30595OooO00o, ')');
    }

    @SinceKotlin(version = "999.9")
    public OooO0OO() {
        this(0, 3);
    }
}
