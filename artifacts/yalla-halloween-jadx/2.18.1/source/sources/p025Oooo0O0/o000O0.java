package p025Oooo0O0;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import o0000O0O.oo000o;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.oO0Oo;
import p346o0OOO0o.OooOOO;
import p346o0OOO0o.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 implements OooOOO {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f1516Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<o000OO00> f1517Oooo0oO;

    @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", i = {0}, l = {477}, m = "onPostFling-RZ2iAVY", n = {"available"}, s = {"J$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f1518Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public long f1519Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f1520Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f1520Oooo0oO = obj;
            this.f1518Oooo |= Integer.MIN_VALUE;
            return o000O0.this.OooO00o(0L, 0L, this);
        }
    }

    public o000O0(boolean z, oO0Oo<o000OO00> oo0oo) {
        this.f1516Oooo0o = z;
        this.f1517Oooo0oO = oo0oo;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p346o0OOO0o.OooOOO
    @Nullable
    public final Object OooO00o(long j, long j2, @NotNull Continuation<? super oo000o> continuation) {
        OooO00o oooO00o;
        long jOooO0Oo;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f1518Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f1518Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0O0 = oooO00o.f1520Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f1518Oooo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            if (this.f1516Oooo0o) {
                o000OO00 value = this.f1517Oooo0oO.getValue();
                oooO00o.f1519Oooo0o = j2;
                oooO00o.f1518Oooo = 1;
                objOooO0O0 = value.OooO0O0(j2, oooO00o);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                oo000o.OooO00o oooO00o2 = oo000o.f27328OooO0O0;
                jOooO0Oo = oo000o.f27329OooO0OO;
            }
            return new oo000o(jOooO0Oo);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2 = oooO00o.f1519Oooo0o;
        ResultKt.throwOnFailure(objOooO0O0);
        jOooO0Oo = oo000o.OooO0Oo(j2, ((oo000o) objOooO0O0).f27330OooO00o);
        return new oo000o(jOooO0Oo);
    }

    @Override // p346o0OOO0o.OooOOO
    public final long OooO0O0(long j, int i) {
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        return OooO.f30392OooO0OO;
    }

    @Override // p346o0OOO0o.OooOOO
    public final /* synthetic */ Object OooO0OO(long j, Continuation continuation) {
        return OooOOO0.OooO00o();
    }

    @Override // p346o0OOO0o.OooOOO
    public final long OooO0Oo(long j, long j2, int i) {
        if (!this.f1516Oooo0o) {
            OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
            return OooO.f30392OooO0OO;
        }
        o000OO00 value = this.f1517Oooo0oO.getValue();
        if (!value.f1552OooO0Oo.OooO00o()) {
            return value.OooO0oo(value.OooO0Oo(value.f1552OooO0Oo.OooO0OO(value.OooO0Oo(value.OooO0oO(j2)))));
        }
        OooO.OooO00o oooO00o2 = OooO.f30391OooO0O0;
        return OooO.f30392OooO0OO;
    }
}
