package p114o00O00o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import coil.request.OooO00o;
import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Precision;
import coil.size.Scale;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
import o00O0O.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOO0;
import oOO00O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "coil.compose.ImagePainter$execute$1", f = "ImagePainter.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooOo00.OooO0O0 f30275Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooOo00 f30276Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f30277Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f30278Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(OooOo00 oooOo00, OooOo00.OooO0O0 oooO0O0, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f30278Oooo0oo = oooOo00;
        this.f30275Oooo = oooO0O0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOo(this.f30278Oooo0oo, this.f30275Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OooOo00 oooOo00;
        OooOo00.OooO0OO oooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f30277Oooo0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooOo00 oooOo01 = this.f30278Oooo0oo;
            OooOO0 oooOO1 = (OooOO0) oooOo01.f30289Ooooo0o.getValue();
            OooOo00 oooOo02 = this.f30278Oooo0oo;
            OooOo00.OooO0O0 oooO0O1 = this.f30275Oooo;
            OooO00o oooO00o = oooO0O1.f30293OooO0O0;
            long j = oooO0O1.f30294OooO0OO;
            Objects.requireNonNull(oooOo02);
            Context context = oooO00o.f9876OooO00o;
            Intrinsics.checkNotNullParameter(context, "context");
            OooO00o.C0072OooO00o c0072OooO00o = new OooO00o.C0072OooO00o(oooO00o, context);
            c0072OooO00o.f9913OooO0Oo = new Oooo000(oooOo02);
            c0072OooO00o.f9943Oooo00o = null;
            c0072OooO00o.f9940Oooo0 = null;
            c0072OooO00o.f9944Oooo0O0 = null;
            if (oooO00o.f9907Oooo00O.f30570OooO0O0 == null) {
                OooOo00.OooO00o oooO00o2 = OooOo00.f30416OooO0O0;
                if (j != OooOo00.f30418OooO0Oo) {
                    c0072OooO00o.OooO0o0(new PixelSize(MathKt.roundToInt(OooOo00.OooO0Oo(j)), MathKt.roundToInt(OooOo00.OooO0O0(j))));
                } else {
                    c0072OooO00o.OooO0o0(OriginalSize.f9945Oooo0o);
                }
            }
            if (oooO00o.f9907Oooo00O.f30571OooO0OO == null) {
                Scale scale = Scale.FILL;
                Intrinsics.checkNotNullParameter(scale, "scale");
                c0072OooO00o.f9924OooOOOo = scale;
            }
            if (oooO00o.f9907Oooo00O.f30573OooO0o != Precision.EXACT) {
                Precision precision = Precision.INEXACT;
                Intrinsics.checkNotNullParameter(precision, "precision");
                c0072OooO00o.f9927OooOOoo = precision;
            }
            OooO00o OooO00o2 = c0072OooO00o.OooO00o();
            this.f30276Oooo0o = oooOo01;
            this.f30277Oooo0oO = 1;
            Object objOooO0OO = oooOO1.OooO0OO(OooO00o2, this);
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooOo00 = oooOo01;
            obj = objOooO0OO;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oooOo00 = this.f30276Oooo0o;
            ResultKt.throwOnFailure(obj);
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        if (oooOOO0 instanceof o00O0OO0.OooOo00) {
            o00O0OO0.OooOo00 oooOo03 = (o00O0OO0.OooOo00) oooOOO0;
            oooO0O0 = new OooOo00.OooO0OO.OooO0o(OooOOO0.OooO00o(oooOo03.f30592OooO00o), oooOo03.f30594OooO0OO);
        } else {
            if (!(oooOOO0 instanceof OooO)) {
                throw new NoWhenBranchMatchedException();
            }
            Drawable drawableOooO00o = oooOOO0.OooO00o();
            oooO0O0 = new OooOo00.OooO0OO.OooO0O0(drawableOooO00o != null ? OooOOO0.OooO00o(drawableOooO00o) : null, ((OooO) oooOOO0).f30553OooO0OO);
        }
        OooOo00.OooOO0O(oooOo00, oooO0O0);
        return Unit.INSTANCE;
    }
}
