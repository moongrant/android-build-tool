package o00O0O0O;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.GraphResponse;
import com.qiniu.android.collect.ReportItem;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119o00O0Oo0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0OO.OooO0O0 f30478OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final p113o00O00Oo.OooO0o f30479OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final oOO00O.OooO0OO f30480OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o0OO00O f30481OooO0Oo;

    @DebugMetadata(c = "coil.memory.InvalidatableTargetDelegate", f = "TargetDelegate.kt", i = {0, 0}, l = {225}, m = "error", n = {ReportItem.QualityKeyResult, "eventListener$iv"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00O0OO0.OooO f30483Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public oOO00O.OooO0OO f30484Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f30485Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f30486OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30485Oooo0oo = obj;
            this.f30486OoooO00 |= Integer.MIN_VALUE;
            return OooOOOO.this.OooO0O0(null, this);
        }
    }

    @DebugMetadata(c = "coil.memory.InvalidatableTargetDelegate", f = "TargetDelegate.kt", i = {0, 0}, l = {228}, m = GraphResponse.SUCCESS_KEY, n = {ReportItem.QualityKeyResult, "eventListener$iv"}, s = {"L$0", "L$1"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00O0OO0.OooOo00 f30488Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public oOO00O.OooO0OO f30489Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f30490Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f30491OoooO00;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30490Oooo0oo = obj;
            this.f30491OoooO00 |= Integer.MIN_VALUE;
            return OooOOOO.this.OooO0o0(null, this);
        }
    }

    public OooOOOO(@NotNull o00O0OO.OooO0O0 target, @NotNull p113o00O00Oo.OooO0o referenceCounter, @NotNull oOO00O.OooO0OO eventListener, @Nullable o0OO00O o0oo00o2) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f30478OooO00o = target;
        this.f30479OooO0O0 = referenceCounter;
        this.f30480OooO0OO = eventListener;
        this.f30481OooO0Oo = o0oo00o2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o00O0O0O.oo000o
    @Nullable
    public final Object OooO0O0(@NotNull o00O0OO0.OooO oooO, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        oOO00O.OooO0OO oooO0OO;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f30486OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f30486OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f30485Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f30486OoooO00;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            o00O0OO.OooO0O0 oooO0O0 = this.f30478OooO00o;
            oooO0OO = this.f30480OooO0OO;
            o0OO00O o0oo00o2 = this.f30481OooO0Oo;
            coil.request.OooO00o oooO00o2 = oooO.f30552OooO0O0;
            p117o00O0OOo.OooO oooO2 = oooO00o2.f9892OooOOo0;
            if (oooO2 == p117o00O0OOo.OooO0o.f30606OooO00o) {
                oooO0O0.onError();
            } else if (oooO0O0 instanceof p117o00O0OOo.OooOO0) {
                oooO0OO.OooOOO(oooO00o2);
                oooO00o.f30483Oooo0o = oooO;
                oooO00o.f30484Oooo0oO = oooO0OO;
                oooO00o.f30486OoooO00 = 1;
                if (oooO2.OooO00o((p117o00O0OOo.OooOO0) oooO0O0, oooO, oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (oooO00o2.f9907Oooo00O.f30574OooO0o0 != null && o0oo00o2 != null && o0oo00o2.getLevel() <= 3) {
                    Objects.toString(oooO2);
                    Objects.toString(oooO0O0);
                    o0oo00o2.OooO00o();
                }
                oooO0O0.onError();
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oOO00O.OooO0OO oooO0OO2 = oooO00o.f30484Oooo0oO;
        o00O0OO0.OooO oooO3 = oooO00o.f30483Oooo0o;
        ResultKt.throwOnFailure(obj);
        oooO0OO = oooO0OO2;
        oooO = oooO3;
        oooO0OO.OooO(oooO.f30552OooO0O0);
        return Unit.INSTANCE;
    }

    @Override // o00O0O0O.oo000o
    @NotNull
    public final o00O0OO.OooO0O0 OooO0OO() {
        return this.f30478OooO00o;
    }

    @Override // o00O0O0O.oo000o
    public final void OooO0Oo(@Nullable Drawable drawable, @Nullable Bitmap bitmap) {
        p113o00O00Oo.OooO0o oooO0o = this.f30479OooO0O0;
        if (bitmap != null) {
            oooO0o.OooO00o(bitmap, false);
        }
        this.f30478OooO00o.OooO0O0(drawable);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o00O0O0O.oo000o
    @Nullable
    public final Object OooO0o0(@NotNull o00O0OO0.OooOo00 oooOo00, @NotNull Continuation<? super Unit> continuation) {
        OooO0O0 oooO0O0;
        oOO00O.OooO0OO oooO0OO;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f30491OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f30491OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object obj = oooO0O0.f30490Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f30491OoooO00;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            p113o00O00Oo.OooO0o oooO0o = this.f30479OooO0O0;
            Drawable drawable = oooOo00.f30592OooO00o;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
            if (bitmap != null) {
                oooO0o.OooO00o(bitmap, false);
            }
            o00O0OO.OooO0O0 oooO0O1 = this.f30478OooO00o;
            oooO0OO = this.f30480OooO0OO;
            o0OO00O o0oo00o2 = this.f30481OooO0Oo;
            coil.request.OooO00o oooO00o = oooOo00.f30593OooO0O0;
            p117o00O0OOo.OooO oooO = oooO00o.f9892OooOOo0;
            if (oooO == p117o00O0OOo.OooO0o.f30606OooO00o) {
                oooO0O1.OooO00o(oooOo00.f30592OooO00o);
            } else if (oooO0O1 instanceof p117o00O0OOo.OooOO0) {
                oooO0OO.OooOOO(oooO00o);
                oooO0O0.f30488Oooo0o = oooOo00;
                oooO0O0.f30489Oooo0oO = oooO0OO;
                oooO0O0.f30491OoooO00 = 1;
                if (oooO.OooO00o((p117o00O0OOo.OooOO0) oooO0O1, oooOo00, oooO0O0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (oooO00o.f9907Oooo00O.f30574OooO0o0 != null && o0oo00o2 != null && o0oo00o2.getLevel() <= 3) {
                    Objects.toString(oooO);
                    Objects.toString(oooO0O1);
                    o0oo00o2.OooO00o();
                }
                oooO0O1.OooO00o(oooOo00.f30592OooO00o);
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oOO00O.OooO0OO oooO0OO2 = oooO0O0.f30489Oooo0oO;
        o00O0OO0.OooOo00 oooOo01 = oooO0O0.f30488Oooo0o;
        ResultKt.throwOnFailure(obj);
        oooO0OO = oooO0OO2;
        oooOo00 = oooOo01;
        oooO0OO.OooO(oooOo00.f30593OooO0O0);
        return Unit.INSTANCE;
    }
}
