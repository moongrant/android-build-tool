package p188o00o00oO;

import androidx.paging.Oooo0;
import androidx.paging.o000000;
import androidx.paging.o0O0O00;
import com.code.android.paging.PagingLoadException;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00O000;
import p101o000oo.o00O0OOO;
import p101o000oo.o00oOoo;
import p101o000oo.o0O0ooO;
import p101o000oo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f38494OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f38495OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function2<Integer, Continuation<? super o000Oo0<T>>, Object> f38496OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public List<T> f38497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Integer f38498OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f38499OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o000<T>.OooO00o f38500OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final SharedFlow f38501OooO0oo;

    public final class OooO00o extends o0O0O00<Integer, T> {

        /* JADX INFO: renamed from: o00o00oO.o000$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.code.android.paging.AndroidPagingSource$InnerPagingSource", f = "AndroidPagingSource.kt", i = {0, 0, 0}, l = {123, 132}, m = "load", n = {"this", NativeProtocol.WEB_DIALOG_PARAMS, "pageIndex"}, s = {"L$0", "L$1", "I$0"})
        public static final class C0431OooO00o extends ContinuationImpl {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public int f38503OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public OooO00o f38504OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public int f38505OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public o0O0O00.OooO00o f38506OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public /* synthetic */ Object f38507OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ o000<T>.OooO00o f38508OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0431OooO00o(o000<T>.OooO00o oooO00o, Continuation<? super C0431OooO00o> continuation) {
                super(continuation);
                this.f38508OooO0oo = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f38507OooO0oO = obj;
                this.f38503OooO |= Integer.MIN_VALUE;
                return this.f38508OooO0oo.OooO0Oo(null, this);
            }
        }

        public OooO00o() {
        }

        @Override // androidx.paging.o0O0O00
        public final Integer OooO0O0(o000000 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.paging.o0O0O00
        @Nullable
        public final Object OooO0Oo(@NotNull o0O0O00.OooO00o<Integer> oooO00o, @NotNull Continuation<? super o0O0O00.OooO0O0<Integer, T>> continuation) {
            C0431OooO00o c0431OooO00o;
            int iIntValue;
            Object objInvoke;
            OooO00o oooO00o2;
            if (continuation instanceof C0431OooO00o) {
                c0431OooO00o = (C0431OooO00o) continuation;
                int i = c0431OooO00o.f38503OooO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0431OooO00o.f38503OooO = i - Integer.MIN_VALUE;
                } else {
                    c0431OooO00o = new C0431OooO00o(this, continuation);
                }
            } else {
                c0431OooO00o = new C0431OooO00o(this, continuation);
            }
            Object obj = c0431OooO00o.f38507OooO0oO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c0431OooO00o.f38503OooO;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = oooO00o instanceof o0O0O00.OooO00o.OooO0OO;
                o000<T> o000Var = o000.this;
                if (z && o000Var.f38499OooO0o0) {
                    o000Var.f38499OooO0o0 = false;
                    return new o0O0O00.OooO0O0.OooO0OO(null, o000Var.f38498OooO0o, o000Var.f38497OooO0Oo);
                }
                if (oooO00o instanceof o0O0O00.OooO00o.C0174OooO00o) {
                    o000Var.f38499OooO0o0 = false;
                }
                Integer numOooO00o = oooO00o.OooO00o();
                iIntValue = numOooO00o != null ? numOooO00o.intValue() : o000Var.f38494OooO00o;
                Function2<Integer, Continuation<? super o000Oo0<T>>, Object> function2 = o000Var.f38496OooO0OO;
                Integer numBoxInt = Boxing.boxInt(iIntValue);
                c0431OooO00o.f38504OooO0Oo = this;
                c0431OooO00o.f38506OooO0o0 = oooO00o;
                c0431OooO00o.f38505OooO0o = iIntValue;
                c0431OooO00o.f38503OooO = 1;
                objInvoke = function2.invoke(numBoxInt, c0431OooO00o);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO00o2 = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                int i3 = c0431OooO00o.f38505OooO0o;
                o0O0O00.OooO00o<Integer> oooO00o3 = c0431OooO00o.f38506OooO0o0;
                oooO00o2 = c0431OooO00o.f38504OooO0Oo;
                ResultKt.throwOnFailure(obj);
                iIntValue = i3;
                oooO00o = oooO00o3;
                objInvoke = obj;
            }
            o000Oo0 o000oo1 = (o000Oo0) objInvoke;
            if (!o000oo1.f38512OooO00o) {
                o000<T> o000Var2 = o000.this;
                o000Var2.getClass();
                if (!(oooO00o instanceof o0O0O00.OooO00o.OooO0OO)) {
                    return new o0O0O00.OooO0O0.OooO00o(new PagingLoadException());
                }
                if (o000Var2.f38497OooO0Oo.isEmpty()) {
                    return new o0O0O00.OooO0O0.OooO00o(new PagingLoadException());
                }
                if (!o000Var2.f38495OooO0O0) {
                    return new o0O0O00.OooO0O0.OooO0OO(null, o000Var2.f38498OooO0o, o000Var2.f38497OooO0Oo);
                }
                o000Var2.f38497OooO0Oo.clear();
                return new o0O0O00.OooO0O0.OooO00o(new PagingLoadException());
            }
            if (oooO00o instanceof o0O0O00.OooO00o.OooO0OO) {
                o000.this.f38497OooO0Oo.clear();
            }
            List arrayList = o000oo1.f38513OooO0O0;
            if (arrayList != null) {
                o000<T> o000Var3 = o000.this;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(o000Var3.f38497OooO0Oo);
                arrayList2.addAll(arrayList);
                o000Var3.f38497OooO0Oo = arrayList2;
            }
            o000<T> o000Var4 = o000.this;
            c0431OooO00o.f38504OooO0Oo = null;
            c0431OooO00o.f38506OooO0o0 = null;
            c0431OooO00o.f38503OooO = 2;
            o000Var4.getClass();
            o000Var4.f38498OooO0o = o000oo1.f38514OooO0OO ? Boxing.boxInt(iIntValue + 1) : null;
            if (arrayList == null || arrayList.isEmpty()) {
                arrayList = new ArrayList();
            }
            o0O0O00.OooO0O0.OooO0OO oooO0OO = new o0O0O00.OooO0O0.OooO0OO(iIntValue > o000Var4.f38494OooO00o ? Boxing.boxInt(iIntValue - 1) : null, o000Var4.f38498OooO0o, arrayList);
            return oooO0OO == coroutine_suspended ? coroutine_suspended : oooO0OO;
        }
    }

    public o000() {
        throw null;
    }

    public o000(CoroutineScope viewModelScope, Function2 dataSource) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f38494OooO00o = 1;
        this.f38495OooO0O0 = false;
        this.f38496OooO0OO = dataSource;
        this.f38497OooO0Oo = new ArrayList();
        o00O000 config = new o00O000(20, 5, false, 20);
        o000O000 pagingSourceFactory = new o000O000(this);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.f38501OooO0oo = o0OOO0o.OooO00o(FlowKt.flowOn(new Oooo0(pagingSourceFactory instanceof o00O0OOO ? new o0O0ooO(pagingSourceFactory) : new o00oOoo(pagingSourceFactory, null), null, config).f10273OooO0o, Dispatchers.getIO()), viewModelScope);
    }

    public final void OooO00o() {
        o000<T>.OooO00o oooO00o = this.f38500OooO0oO;
        if (oooO00o != null) {
            oooO00o.OooO0OO();
        }
    }

    public final void OooO0O0() {
        o000<T>.OooO00o oooO00o = this.f38500OooO0oO;
        if (oooO00o != null) {
            this.f38499OooO0o0 = true;
            oooO00o.OooO0OO();
        }
    }
}
