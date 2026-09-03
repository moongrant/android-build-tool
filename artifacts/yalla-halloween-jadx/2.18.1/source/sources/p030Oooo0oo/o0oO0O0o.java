package p030Oooo0oo;

import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import o0000O0O.o0OoOo0;
import o00O0O.OooOO0O;
import o00O0O.OooOo;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
public final class o0oO0O0o implements o0O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OOo<o0O0O0Oo> f2535OooO00o = new o000OOo<>(new o0O0O0Oo[16]);

    @DebugMetadata(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {121}, m = "bringIntoView", n = {"rect", "content$iv", "size$iv", "i$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f2536Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooOO0O f2537Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Object[] f2538Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f2539Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f2541OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f2542OoooO0O;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2541OoooO00 = obj;
            this.f2542OoooO0O |= Integer.MIN_VALUE;
            return o0oO0O0o.this.OooO00o(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        if (r10 >= r2) goto L39;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x008c -> B:37:0x008f). Please report as a decompilation issue!!! */
    @Override // p030Oooo0oo.o0O0O0O
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(@Nullable OooOO0O oooOO0O, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        int i;
        Object[] objArr;
        OooOO0O oooOO0O2;
        int i2;
        Object objOooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i3 = oooO00o.f2542OoooO0O;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO00o.f2542OoooO0O = i3 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f2541OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO00o.f2542OoooO0O;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            o000OOo<o0O0O0Oo> o000ooo2 = this.f2535OooO00o;
            i = o000ooo2.f3664Oooo0oo;
            if (i > 0) {
                objArr = o000ooo2.f3662Oooo0o;
                oooOO0O2 = oooOO0O;
                i2 = 0;
                o0O0O0Oo o0o0o0oo = (o0O0O0Oo) objArr[i2];
                oooO00o.f2537Oooo0o = oooOO0O2;
                oooO00o.f2538Oooo0oO = objArr;
                oooO00o.f2539Oooo0oo = i;
                oooO00o.f2536Oooo = i2;
                oooO00o.f2542OoooO0O = 1;
                Oooo000 oooo000 = o0o0o0oo.f2545Oooo0oo;
                if (oooo000 == null || !oooo000.OooOoO()) {
                    oooo000 = null;
                }
                if (oooo000 != null) {
                    OooOO0O oooOO0OOooO0OO = oooOO0O2 == null ? OooOo.OooO0OO(o0OoOo0.OooO0O0(oooo000.OooO00o())) : oooOO0O2;
                    o0O00oO0 o0o00oo1 = o0o0o0oo.f2544Oooo0oO;
                    if (o0o00oo1 == null) {
                        o0o00oo1 = o0o0o0oo.f2543Oooo0o;
                    }
                    objOooO00o = o0o00oo1.OooO00o(oooOO0OOooO0OO, oooo000, oooO00o);
                    if (objOooO00o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objOooO00o = Unit.INSTANCE;
                    }
                } else {
                    objOooO00o = Unit.INSTANCE;
                }
                if (objOooO00o == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2++;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = oooO00o.f2536Oooo;
            i = oooO00o.f2539Oooo0oo;
            objArr = oooO00o.f2538Oooo0oO;
            OooOO0O oooOO0O3 = oooO00o.f2537Oooo0o;
            ResultKt.throwOnFailure(obj);
            oooOO0O2 = oooOO0O3;
            i2++;
        }
        return Unit.INSTANCE;
    }
}
