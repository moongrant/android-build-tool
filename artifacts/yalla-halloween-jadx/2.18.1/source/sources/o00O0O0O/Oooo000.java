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
public final class Oooo000 extends oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0OO.OooO00o<?> f30503OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final p113o00O00Oo.OooO0o f30504OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final oOO00O.OooO0OO f30505OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o0OO00O f30506OooO0Oo;

    @DebugMetadata(c = "coil.memory.PoolableTargetDelegate", f = "TargetDelegate.kt", i = {0, 0, 1, 1, 1}, l = {227, 240}, m = "error", n = {ReportItem.QualityKeyResult, "eventListener$iv", ReportItem.QualityKeyResult, "this_$iv", "eventListener$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f30507Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00O0OO0.OooO f30508Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Object f30509Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public oOO00O.OooO0OO f30510Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f30511OoooO0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30507Oooo = obj;
            this.f30511OoooO0 |= Integer.MIN_VALUE;
            return Oooo000.this.OooO0O0(null, this);
        }
    }

    @DebugMetadata(c = "coil.memory.PoolableTargetDelegate", f = "TargetDelegate.kt", i = {0, 0, 1, 1, 1, 1}, l = {228, 251}, m = GraphResponse.SUCCESS_KEY, n = {ReportItem.QualityKeyResult, "eventListener$iv", ReportItem.QualityKeyResult, "this_$iv", "bitmap$iv", "eventListener$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public oOO00O.OooO0OO f30513Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public o00O0OO0.OooOo00 f30514Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Object f30515Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Bitmap f30516Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f30518OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f30519OoooO0O;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30518OoooO00 = obj;
            this.f30519OoooO0O |= Integer.MIN_VALUE;
            return Oooo000.this.OooO0o0(null, this);
        }
    }

    public Oooo000(@NotNull o00O0OO.OooO00o<?> target, @NotNull p113o00O00Oo.OooO0o referenceCounter, @NotNull oOO00O.OooO0OO eventListener, @Nullable o0OO00O o0oo00o2) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f30503OooO00o = target;
        this.f30504OooO0O0 = referenceCounter;
        this.f30505OooO0OO = eventListener;
        this.f30506OooO0Oo = o0oo00o2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    public static final void OooO0o(Oooo000 tag, Bitmap bitmap) {
        o00oO0o o00oo0oOooO0OO = p119o00O0Oo0.o00O0O.OooO0OO(tag.f30503OooO00o.getView());
        Intrinsics.checkNotNullParameter(tag, "tag");
        Bitmap bitmapPut = bitmap != null ? o00oo0oOooO0OO.f30543OoooO0.put(tag, bitmap) : o00oo0oOooO0OO.f30543OoooO0.remove(tag);
        if (bitmapPut == null) {
            return;
        }
        tag.f30504OooO0O0.OooO0O0(bitmapPut);
    }

    public static final void OooO0oO(Oooo000 oooo000, Bitmap bitmap) {
        Objects.requireNonNull(oooo000);
        if (bitmap == null) {
            return;
        }
        oooo000.f30504OooO0O0.OooO0OO(bitmap);
    }

    @Override // o00O0O0O.oo000o
    public final void OooO00o() {
        if (this.f30504OooO0O0 instanceof p113o00O00Oo.OooOO0) {
            this.f30503OooO00o.OooO0OO();
            return;
        }
        OooO0oO(this, null);
        this.f30503OooO00o.OooO0OO();
        OooO0o(this, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o00O0O0O.oo000o
    @Nullable
    public final Object OooO0O0(@NotNull o00O0OO0.OooO oooO, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        oOO00O.OooO0OO oooO0OO;
        Oooo000 oooo000;
        oOO00O.OooO0OO oooO0OO2;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f30511OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f30511OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f30507Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f30511OoooO0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f30504OooO0O0 instanceof p113o00O00Oo.OooOO0) {
                o00O0OO.OooO00o<?> oooO00o2 = this.f30503OooO00o;
                oooO0OO2 = this.f30505OooO0OO;
                o0OO00O o0oo00o2 = this.f30506OooO0Oo;
                coil.request.OooO00o oooO00o3 = oooO.f30552OooO0O0;
                p117o00O0OOo.OooO oooO2 = oooO00o3.f9892OooOOo0;
                if (oooO2 == p117o00O0OOo.OooO0o.f30606OooO00o) {
                    oooO00o2.onError();
                } else if (oooO00o2 instanceof p117o00O0OOo.OooOO0) {
                    oooO0OO2.OooOOO(oooO00o3);
                    oooO00o.f30508Oooo0o = oooO;
                    oooO00o.f30509Oooo0oO = oooO0OO2;
                    oooO00o.f30511OoooO0 = 1;
                    if (oooO2.OooO00o((p117o00O0OOo.OooOO0) oooO00o2, oooO, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooO0OO2.OooO(oooO.f30552OooO0O0);
                } else {
                    if (oooO00o3.f9907Oooo00O.f30574OooO0o0 != null && o0oo00o2 != null && o0oo00o2.getLevel() <= 3) {
                        Objects.toString(oooO2);
                        Objects.toString(oooO00o2);
                        o0oo00o2.OooO00o();
                    }
                    oooO00o2.onError();
                }
            } else {
                OooO0oO(this, null);
                o00O0OO.OooO00o<?> oooO00o4 = this.f30503OooO00o;
                oooO0OO = this.f30505OooO0OO;
                o0OO00O o0oo00o3 = this.f30506OooO0Oo;
                coil.request.OooO00o oooO00o5 = oooO.f30552OooO0O0;
                p117o00O0OOo.OooO oooO3 = oooO00o5.f9892OooOOo0;
                if (oooO3 == p117o00O0OOo.OooO0o.f30606OooO00o) {
                    oooO00o4.onError();
                } else if (oooO00o4 instanceof p117o00O0OOo.OooOO0) {
                    oooO0OO.OooOOO(oooO00o5);
                    oooO00o.f30508Oooo0o = oooO;
                    oooO00o.f30509Oooo0oO = this;
                    oooO00o.f30510Oooo0oo = oooO0OO;
                    oooO00o.f30511OoooO0 = 2;
                    if (oooO3.OooO00o((p117o00O0OOo.OooOO0) oooO00o4, oooO, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooo000 = this;
                    oooO0OO.OooO(oooO.f30552OooO0O0);
                    OooO0o(oooo000, null);
                } else {
                    if (oooO00o5.f9907Oooo00O.f30574OooO0o0 != null && o0oo00o3 != null && o0oo00o3.getLevel() <= 3) {
                        Objects.toString(oooO3);
                        Objects.toString(oooO00o4);
                        o0oo00o3.OooO00o();
                    }
                    oooO00o4.onError();
                }
                oooo000 = this;
                OooO0o(oooo000, null);
            }
        } else if (i2 == 1) {
            oOO00O.OooO0OO oooO0OO3 = (oOO00O.OooO0OO) oooO00o.f30509Oooo0oO;
            o00O0OO0.OooO oooO4 = oooO00o.f30508Oooo0o;
            ResultKt.throwOnFailure(obj);
            oooO0OO2 = oooO0OO3;
            oooO = oooO4;
            oooO0OO2.OooO(oooO.f30552OooO0O0);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oOO00O.OooO0OO oooO0OO4 = oooO00o.f30510Oooo0oo;
            oooo000 = (Oooo000) oooO00o.f30509Oooo0oO;
            o00O0OO0.OooO oooO5 = oooO00o.f30508Oooo0o;
            ResultKt.throwOnFailure(obj);
            oooO0OO = oooO0OO4;
            oooO = oooO5;
            oooO0OO.OooO(oooO.f30552OooO0O0);
            OooO0o(oooo000, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o00O0O0O.oo000o
    public final o00O0OO.OooO0O0 OooO0OO() {
        return this.f30503OooO00o;
    }

    @Override // o00O0O0O.oo000o
    public final void OooO0Oo(@Nullable Drawable drawable, @Nullable Bitmap bitmap) {
        if (this.f30504OooO0O0 instanceof p113o00O00Oo.OooOO0) {
            this.f30503OooO00o.OooO0O0(drawable);
            return;
        }
        OooO0oO(this, bitmap);
        this.f30503OooO00o.OooO0O0(drawable);
        OooO0o(this, bitmap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o00O0O0O.oo000o
    @Nullable
    public final Object OooO0o0(@NotNull o00O0OO0.OooOo00 oooOo00, @NotNull Continuation<? super Unit> continuation) {
        OooO0O0 oooO0O0;
        Bitmap bitmap;
        oOO00O.OooO0OO oooO0OO;
        Oooo000 oooo000;
        Bitmap bitmap2;
        oOO00O.OooO0OO oooO0OO2;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f30519OoooO0O;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f30519OoooO0O = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object obj = oooO0O0.f30518OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f30519OoooO0O;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Drawable drawable = oooOo00.f30592OooO00o;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            bitmap = bitmapDrawable == null ? null : bitmapDrawable.getBitmap();
            if (this.f30504OooO0O0 instanceof p113o00O00Oo.OooOO0) {
                o00O0OO.OooO00o<?> oooO00o = this.f30503OooO00o;
                oooO0OO2 = this.f30505OooO0OO;
                o0OO00O o0oo00o2 = this.f30506OooO0Oo;
                coil.request.OooO00o oooO00o2 = oooOo00.f30593OooO0O0;
                p117o00O0OOo.OooO oooO = oooO00o2.f9892OooOOo0;
                if (oooO == p117o00O0OOo.OooO0o.f30606OooO00o) {
                    oooO00o.OooO00o(oooOo00.f30592OooO00o);
                } else if (oooO00o instanceof p117o00O0OOo.OooOO0) {
                    oooO0OO2.OooOOO(oooO00o2);
                    oooO0O0.f30514Oooo0o = oooOo00;
                    oooO0O0.f30515Oooo0oO = oooO0OO2;
                    oooO0O0.f30519OoooO0O = 1;
                    if (oooO.OooO00o((p117o00O0OOo.OooOO0) oooO00o, oooOo00, oooO0O0) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooO0OO2.OooO(oooOo00.f30593OooO0O0);
                } else {
                    if (oooO00o2.f9907Oooo00O.f30574OooO0o0 != null && o0oo00o2 != null && o0oo00o2.getLevel() <= 3) {
                        Objects.toString(oooO);
                        Objects.toString(oooO00o);
                        o0oo00o2.OooO00o();
                    }
                    oooO00o.OooO00o(oooOo00.f30592OooO00o);
                }
            } else {
                OooO0oO(this, bitmap);
                o00O0OO.OooO00o<?> oooO00o3 = this.f30503OooO00o;
                oooO0OO = this.f30505OooO0OO;
                o0OO00O o0oo00o3 = this.f30506OooO0Oo;
                coil.request.OooO00o oooO00o4 = oooOo00.f30593OooO0O0;
                p117o00O0OOo.OooO oooO2 = oooO00o4.f9892OooOOo0;
                if (oooO2 == p117o00O0OOo.OooO0o.f30606OooO00o) {
                    oooO00o3.OooO00o(oooOo00.f30592OooO00o);
                } else if (oooO00o3 instanceof p117o00O0OOo.OooOO0) {
                    oooO0OO.OooOOO(oooO00o4);
                    oooO0O0.f30514Oooo0o = oooOo00;
                    oooO0O0.f30515Oooo0oO = this;
                    oooO0O0.f30516Oooo0oo = bitmap;
                    oooO0O0.f30513Oooo = oooO0OO;
                    oooO0O0.f30519OoooO0O = 2;
                    if (oooO2.OooO00o((p117o00O0OOo.OooOO0) oooO00o3, oooOo00, oooO0O0) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    oooo000 = this;
                    bitmap2 = bitmap;
                    oooO0OO.OooO(oooOo00.f30593OooO0O0);
                    bitmap = bitmap2;
                    OooO0o(oooo000, bitmap);
                } else {
                    if (oooO00o4.f9907Oooo00O.f30574OooO0o0 != null && o0oo00o3 != null && o0oo00o3.getLevel() <= 3) {
                        Objects.toString(oooO2);
                        Objects.toString(oooO00o3);
                        o0oo00o3.OooO00o();
                    }
                    oooO00o3.OooO00o(oooOo00.f30592OooO00o);
                }
                oooo000 = this;
                OooO0o(oooo000, bitmap);
            }
        } else if (i2 == 1) {
            oOO00O.OooO0OO oooO0OO3 = (oOO00O.OooO0OO) oooO0O0.f30515Oooo0oO;
            o00O0OO0.OooOo00 oooOo01 = oooO0O0.f30514Oooo0o;
            ResultKt.throwOnFailure(obj);
            oooO0OO2 = oooO0OO3;
            oooOo00 = oooOo01;
            oooO0OO2.OooO(oooOo00.f30593OooO0O0);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oOO00O.OooO0OO oooO0OO4 = oooO0O0.f30513Oooo;
            bitmap2 = oooO0O0.f30516Oooo0oo;
            oooo000 = (Oooo000) oooO0O0.f30515Oooo0oO;
            o00O0OO0.OooOo00 oooOo02 = oooO0O0.f30514Oooo0o;
            ResultKt.throwOnFailure(obj);
            oooO0OO = oooO0OO4;
            oooOo00 = oooOo02;
            oooO0OO.OooO(oooOo00.f30593OooO0O0);
            bitmap = bitmap2;
            OooO0o(oooo000, bitmap);
        }
        return Unit.INSTANCE;
    }
}
