package p630o0ooO00;

import com.facebook.internal.NativeProtocol;
import come.code.android.easypaging.PagingLoadException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.OooOOO;
import p089o000o000.o000OO;
import p089o000o000.o000OO00;
import p089o000o000.o000OOo0;
import p089o000o000.o00O0;
import p089o000o000.o00O0000;
import p089o000o000.o00O00o0;
import p089o000o000.o0O0ooO;
import p089o000o000.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f48679OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f48680OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function2<Integer, Continuation<? super o000OO0O<T>>, Object> f48681OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<T> f48682OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Integer f48683OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f48684OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o000O0<T>.OooO00o f48685OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Flow<o0O0ooO<T>> f48686OooO0oo;

    public final class OooO00o extends o00O00o0<Integer, T> {

        /* JADX INFO: renamed from: o0ooO00.o000O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "come.code.android.easypaging.EasyPagingSource$InnerPagingSource", f = "EasyPagingSource.kt", i = {0, 0, 0}, l = {122, 126}, m = "load", n = {"this", NativeProtocol.WEB_DIALOG_PARAMS, "pageIndex"}, s = {"L$0", "L$1", "I$0"})
        public static final class C0421OooO00o extends ContinuationImpl {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public /* synthetic */ Object f48688Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public OooO00o f48689Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public o00O00o0.OooO00o f48690Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public int f48691Oooo0oo;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public int f48692OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public final /* synthetic */ o000O0<T>.OooO00o f48693OoooO00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0421OooO00o(o000O0<T>.OooO00o oooO00o, Continuation<? super C0421OooO00o> continuation) {
                super(continuation);
                this.f48693OoooO00 = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f48688Oooo = obj;
                this.f48692OoooO0 |= Integer.MIN_VALUE;
                return this.f48693OoooO00.OooO0Oo(null, this);
            }
        }

        public OooO00o() {
        }

        @Override // p089o000o000.o00O00o0
        public final Integer OooO0O0(o00O0 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p089o000o000.o00O00o0
        @Nullable
        public final Object OooO0Oo(@NotNull o00O00o0.OooO00o<Integer> oooO00o, @NotNull Continuation<? super o00O00o0.OooO0O0<Integer, T>> continuation) {
            C0421OooO00o c0421OooO00o;
            int iIntValue;
            Object objInvoke;
            OooO00o oooO00o2;
            if (continuation instanceof C0421OooO00o) {
                c0421OooO00o = (C0421OooO00o) continuation;
                int i = c0421OooO00o.f48692OoooO0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0421OooO00o.f48692OoooO0 = i - Integer.MIN_VALUE;
                } else {
                    c0421OooO00o = new C0421OooO00o(this, continuation);
                }
            } else {
                c0421OooO00o = new C0421OooO00o(this, continuation);
            }
            Object obj = c0421OooO00o.f48688Oooo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c0421OooO00o.f48692OoooO0;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (oooO00o instanceof o00O00o0.OooO00o.OooO0OO) {
                    o000O0<T> o000o0 = o000O0.this;
                    if (o000o0.f48684OooO0o0) {
                        o000o0.f48684OooO0o0 = false;
                        o000O0<T> o000o1 = o000O0.this;
                        return new o00O00o0.OooO0O0.OooO0OO(o000o1.f48682OooO0Oo, null, o000o1.f48683OooO0o);
                    }
                }
                if (oooO00o instanceof o00O00o0.OooO00o.C0311OooO00o) {
                    o000O0.this.f48684OooO0o0 = false;
                }
                Integer numOooO00o = oooO00o.OooO00o();
                iIntValue = numOooO00o != null ? numOooO00o.intValue() : o000O0.this.f48679OooO00o;
                Function2<Integer, Continuation<? super o000OO0O<T>>, Object> function2 = o000O0.this.f48681OooO0OO;
                Integer numBoxInt = Boxing.boxInt(iIntValue);
                c0421OooO00o.f48689Oooo0o = this;
                c0421OooO00o.f48690Oooo0oO = oooO00o;
                c0421OooO00o.f48691Oooo0oo = iIntValue;
                c0421OooO00o.f48692OoooO0 = 1;
                objInvoke = function2.invoke(numBoxInt, c0421OooO00o);
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
                int i3 = c0421OooO00o.f48691Oooo0oo;
                o00O00o0.OooO00o<Integer> oooO00o3 = c0421OooO00o.f48690Oooo0oO;
                oooO00o2 = c0421OooO00o.f48689Oooo0o;
                ResultKt.throwOnFailure(obj);
                iIntValue = i3;
                oooO00o = oooO00o3;
                objInvoke = obj;
            }
            o000OO0O o000oo0o2 = (o000OO0O) objInvoke;
            if (!o000oo0o2.f48695OooO00o) {
                o000O0<T> o000o2 = o000O0.this;
                Objects.requireNonNull(o000o2);
                if (!(oooO00o instanceof o00O00o0.OooO00o.OooO0OO)) {
                    return new o00O00o0.OooO0O0.OooO00o(new PagingLoadException());
                }
                if (o000o2.f48682OooO0Oo.isEmpty()) {
                    return new o00O00o0.OooO0O0.OooO00o(new PagingLoadException());
                }
                if (!o000o2.f48680OooO0O0) {
                    return new o00O00o0.OooO0O0.OooO0OO(o000o2.f48682OooO0Oo, null, o000o2.f48683OooO0o);
                }
                o000o2.f48682OooO0Oo.clear();
                return new o00O00o0.OooO0O0.OooO00o(new PagingLoadException());
            }
            if (oooO00o instanceof o00O00o0.OooO00o.OooO0OO) {
                o000O0.this.f48682OooO0Oo.clear();
            }
            List<T> list = o000oo0o2.f48696OooO0O0;
            if (list != null) {
                Boxing.boxBoolean(o000O0.this.f48682OooO0Oo.addAll(list));
            }
            o000O0<T> o000o3 = o000O0.this;
            c0421OooO00o.f48689Oooo0o = null;
            c0421OooO00o.f48690Oooo0oO = null;
            c0421OooO00o.f48692OoooO0 = 2;
            Objects.requireNonNull(o000o3);
            o000o3.f48683OooO0o = o000oo0o2.f48697OooO0OO ? Boxing.boxInt(iIntValue + 1) : null;
            List<T> list2 = o000oo0o2.f48696OooO0O0;
            o00O00o0.OooO0O0.OooO0OO oooO0OO = new o00O00o0.OooO0O0.OooO0OO(list2 == null || list2.isEmpty() ? new ArrayList() : o000oo0o2.f48696OooO0O0, iIntValue > o000o3.f48679OooO00o ? Boxing.boxInt(iIntValue - 1) : null, o000o3.f48683OooO0o);
            return oooO0OO == coroutine_suspended ? coroutine_suspended : oooO0OO;
        }
    }

    public o000O0(CoroutineScope viewModelScope, Function2 dataSource) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f48679OooO00o = 1;
        this.f48680OooO0O0 = false;
        this.f48681OooO0OO = dataSource;
        this.f48682OooO0Oo = new ArrayList();
        o00O0000 config = new o00O0000(20, 5, false, 20, 48);
        o000O0Oo pagingSourceFactory = new o000O0Oo(this);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.f48686OooO0oo = (SharedFlow) OooOOO.OooO00o(FlowKt.flowOn(new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28877OooO0o, Dispatchers.getIO()), viewModelScope);
    }

    public final void OooO00o() {
        o000O0<T>.OooO00o oooO00o = this.f48685OooO0oO;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerPagingSource");
            oooO00o = null;
        }
        oooO00o.OooO0OO();
    }

    public final void OooO0O0() {
        this.f48684OooO0o0 = true;
        o000O0<T>.OooO00o oooO00o = this.f48685OooO0oO;
        if (oooO00o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("innerPagingSource");
            oooO00o = null;
        }
        oooO00o.OooO0OO();
    }
}
