package p143o00Oo000;

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
import o000O00O.OooOOO;
import o000O00O.o000O000;
import o000O00O.o000O0o;
import o000O00O.o000Oo0;
import o000O00O.o00O000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f37660OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f37661OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Function2<Integer, Continuation<? super OooO<T>>, Object> f37662OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public List<T> f37663OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Integer f37664OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f37665OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooO0O0<T>.OooO00o f37666OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final SharedFlow f37667OooO0oo;

    public final class OooO00o extends o0O0O00<Integer, T> {

        /* JADX INFO: renamed from: o00Oo000.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.code.android.paging.AndroidPagingSource$InnerPagingSource", f = "AndroidPagingSource.kt", i = {0, 0, 0}, l = {123, 132}, m = "load", n = {"this", NativeProtocol.WEB_DIALOG_PARAMS, "pageIndex"}, s = {"L$0", "L$1", "I$0"})
        public static final class C0436OooO00o extends ContinuationImpl {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public int f37669OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public OooO00o f37670OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public int f37671OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public o0O0O00.OooO00o f37672OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public /* synthetic */ Object f37673OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ OooO0O0<T>.OooO00o f37674OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0436OooO00o(OooO0O0<T>.OooO00o oooO00o, Continuation<? super C0436OooO00o> continuation) {
                super(continuation);
                this.f37674OooO0oo = oooO00o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f37673OooO0oO = obj;
                this.f37669OooO |= Integer.MIN_VALUE;
                return this.f37674OooO0oo.OooO0Oo(null, this);
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
            C0436OooO00o c0436OooO00o;
            int iIntValue;
            Object objInvoke;
            OooO00o oooO00o2;
            if (continuation instanceof C0436OooO00o) {
                c0436OooO00o = (C0436OooO00o) continuation;
                int i = c0436OooO00o.f37669OooO;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0436OooO00o.f37669OooO = i - Integer.MIN_VALUE;
                } else {
                    c0436OooO00o = new C0436OooO00o(this, continuation);
                }
            } else {
                c0436OooO00o = new C0436OooO00o(this, continuation);
            }
            Object obj = c0436OooO00o.f37673OooO0oO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c0436OooO00o.f37669OooO;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = oooO00o instanceof o0O0O00.OooO00o.OooO0OO;
                OooO0O0<T> oooO0O0 = OooO0O0.this;
                if (z && oooO0O0.f37665OooO0o0) {
                    oooO0O0.f37665OooO0o0 = false;
                    return new o0O0O00.OooO0O0.OooO0OO(null, oooO0O0.f37664OooO0o, oooO0O0.f37663OooO0Oo);
                }
                if (oooO00o instanceof o0O0O00.OooO00o.C0155OooO00o) {
                    oooO0O0.f37665OooO0o0 = false;
                }
                Integer numOooO00o = oooO00o.OooO00o();
                iIntValue = numOooO00o != null ? numOooO00o.intValue() : oooO0O0.f37660OooO00o;
                Function2<Integer, Continuation<? super OooO<T>>, Object> function2 = oooO0O0.f37662OooO0OO;
                Integer numBoxInt = Boxing.boxInt(iIntValue);
                c0436OooO00o.f37670OooO0Oo = this;
                c0436OooO00o.f37672OooO0o0 = oooO00o;
                c0436OooO00o.f37671OooO0o = iIntValue;
                c0436OooO00o.f37669OooO = 1;
                objInvoke = function2.invoke(numBoxInt, c0436OooO00o);
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
                int i3 = c0436OooO00o.f37671OooO0o;
                o0O0O00.OooO00o<Integer> oooO00o3 = c0436OooO00o.f37672OooO0o0;
                oooO00o2 = c0436OooO00o.f37670OooO0Oo;
                ResultKt.throwOnFailure(obj);
                iIntValue = i3;
                oooO00o = oooO00o3;
                objInvoke = obj;
            }
            OooO oooO = (OooO) objInvoke;
            if (!oooO.f37657OooO00o) {
                OooO0O0<T> oooO0O1 = OooO0O0.this;
                oooO0O1.getClass();
                if (!(oooO00o instanceof o0O0O00.OooO00o.OooO0OO)) {
                    return new o0O0O00.OooO0O0.OooO00o(new PagingLoadException());
                }
                if (oooO0O1.f37663OooO0Oo.isEmpty()) {
                    return new o0O0O00.OooO0O0.OooO00o(new PagingLoadException());
                }
                if (!oooO0O1.f37661OooO0O0) {
                    return new o0O0O00.OooO0O0.OooO0OO(null, oooO0O1.f37664OooO0o, oooO0O1.f37663OooO0Oo);
                }
                oooO0O1.f37663OooO0Oo.clear();
                return new o0O0O00.OooO0O0.OooO00o(new PagingLoadException());
            }
            if (oooO00o instanceof o0O0O00.OooO00o.OooO0OO) {
                OooO0O0.this.f37663OooO0Oo.clear();
            }
            List arrayList = oooO.f37658OooO0O0;
            if (arrayList != null) {
                OooO0O0<T> oooO0O2 = OooO0O0.this;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(oooO0O2.f37663OooO0Oo);
                arrayList2.addAll(arrayList);
                oooO0O2.f37663OooO0Oo = arrayList2;
            }
            OooO0O0<T> oooO0O3 = OooO0O0.this;
            c0436OooO00o.f37670OooO0Oo = null;
            c0436OooO00o.f37672OooO0o0 = null;
            c0436OooO00o.f37669OooO = 2;
            oooO0O3.getClass();
            oooO0O3.f37664OooO0o = oooO.f37659OooO0OO ? Boxing.boxInt(iIntValue + 1) : null;
            if (arrayList == null || arrayList.isEmpty()) {
                arrayList = new ArrayList();
            }
            o0O0O00.OooO0O0.OooO0OO oooO0OO = new o0O0O00.OooO0O0.OooO0OO(iIntValue > oooO0O3.f37660OooO00o ? Boxing.boxInt(iIntValue - 1) : null, oooO0O3.f37664OooO0o, arrayList);
            return oooO0OO == coroutine_suspended ? coroutine_suspended : oooO0OO;
        }
    }

    public OooO0O0() {
        throw null;
    }

    public OooO0O0(CoroutineScope viewModelScope, Function2 dataSource) {
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f37660OooO00o = 1;
        this.f37661OooO0O0 = false;
        this.f37662OooO0OO = dataSource;
        this.f37663OooO0Oo = new ArrayList();
        o000Oo0 config = new o000Oo0(20, 5, false, 20);
        OooO0OO pagingSourceFactory = new OooO0OO(this);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.f37667OooO0oo = OooOOO.OooO00o(FlowKt.flowOn(new Oooo0(pagingSourceFactory instanceof o00O000o ? new o000O000(pagingSourceFactory) : new o000O0o(pagingSourceFactory, null), null, config).f7179OooO0o, Dispatchers.getIO()), viewModelScope);
    }

    public final void OooO00o() {
        OooO0O0<T>.OooO00o oooO00o = this.f37666OooO0oO;
        if (oooO00o != null) {
            oooO00o.OooO0OO();
        }
    }

    public final void OooO0O0() {
        OooO0O0<T>.OooO00o oooO00o = this.f37666OooO0oO;
        if (oooO00o != null) {
            this.f37665OooO0o0 = true;
            oooO00o.OooO0OO();
        }
    }
}
