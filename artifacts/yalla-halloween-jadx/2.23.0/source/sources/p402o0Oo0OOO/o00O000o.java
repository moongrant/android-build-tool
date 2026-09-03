package p402o0Oo0OOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final OooO0o f44489OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static int f44490OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static String f44491OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Oooo000 f44492OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooOo f44493OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f44494OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooOO0 f44495OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final OooO f44496OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final o00oO0o f44497OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f44498OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final o0OoOo0 f44499OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final o000oOoO f44500OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public static final OooOOO0 f44501OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f44502OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public static final o0ooOOo f44503OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public static final OooOO0O f44504OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public static final o00Ooo f44505OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public static final o0Oo0oo f44506OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public static final o00Oo0 f44507OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public static final OooOOOO f44508OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public static final OooOOO f44509OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public static final o00O0O f44510OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public static final o0OOO0o f44511OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public static final OooOo00 f44512OooOo0o;

    public static final class OooO extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.cache.SharedUrlManager$1", f = "SharedUrlManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: o0Oo0OOO.o00O000o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0464OooO00o extends Lambda implements Function1<Integer, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C0464OooO00o f44513OooO0Oo = new C0464OooO00o();

            public C0464OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Integer num) {
                Integer it = num;
                int i = o00O000o.f44490OooO00o;
                if (it == null || it.intValue() != i) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    o00O000o.f44490OooO00o = it.intValue();
                    o00O000o.f44492OooO0OO.postValue("");
                    o00O000o.f44493OooO0Oo.postValue("");
                    o00O000o.f44495OooO0o0.postValue("");
                    o00O000o.f44496OooO0oO.postValue("");
                    o00O000o.f44497OooO0oo.postValue("");
                    o00O000o.f44489OooO.postValue("");
                    o00O000o.f44498OooOO0.postValue("");
                    o00O000o.f44499OooOO0O.postValue("");
                    o00O000o.f44500OooOO0o.postValue("");
                    o00O000o.f44502OooOOO0.postValue("");
                    o00O000o.f44501OooOOO.postValue("");
                    o00O000o.f44503OooOOOO.postValue("");
                    o00O000o.f44510OooOo00.postValue("");
                    o00O000o.f44509OooOo0.postValue("");
                    o00O000o.f44511OooOo0O.postValue("");
                }
                return Unit.INSTANCE;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooOOO0().observeForever(new oo000o(C0464OooO00o.f44513OooO0Oo));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class OooO0OO extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class OooO0o extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class OooOO0 extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class OooOO0O extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class OooOOO extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class OooOOO0 extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class OooOOOO extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class OooOo extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class OooOo00 extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class Oooo0 extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class Oooo000 extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class o000oOoO extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class o00O0O extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class o00Oo0 extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class o00Ooo extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class o00oO0o extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class o0OOO0o extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class o0Oo0oo extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class o0OoOo0 extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class o0ooOOo extends MutableLiveData<String> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            String value = getValue();
            if (value == null || StringsKt.isBlank(value)) {
                o00O000o.OooO00o();
            }
        }
    }

    public static final class oo000o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f44514OooO0Oo;

        public oo000o(OooO00o.C0464OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f44514OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f44514OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f44514OooO0Oo;
        }

        public final int hashCode() {
            return this.f44514OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44514OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        T value = o000000O.OooOOO0().getValue();
        Intrinsics.checkNotNull(value);
        f44490OooO00o = ((Number) value).intValue();
        f44491OooO0O0 = "";
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new OooO00o(null), 2, null);
        f44492OooO0OO = new Oooo000();
        f44493OooO0Oo = new OooOo();
        f44495OooO0o0 = new OooOO0();
        f44494OooO0o = new OooO0O0();
        f44496OooO0oO = new OooO();
        f44497OooO0oo = new o00oO0o();
        f44489OooO = new OooO0o();
        f44498OooOO0 = new OooO0OO();
        f44499OooOO0O = new o0OoOo0();
        f44500OooOO0o = new o000oOoO();
        f44502OooOOO0 = new Oooo0();
        f44501OooOOO = new OooOOO0();
        f44503OooOOOO = new o0ooOOo();
        f44504OooOOOo = new OooOO0O();
        f44506OooOOo0 = new o0Oo0oo();
        f44505OooOOo = new o00Ooo();
        f44507OooOOoo = new o00Oo0();
        f44510OooOo00 = new o00O0O();
        f44509OooOo0 = new OooOOO();
        f44511OooOo0O = new o0OOO0o();
        f44512OooOo0o = new OooOo00();
        f44508OooOo = new OooOOOO();
    }

    public static final void OooO00o() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o00O00(null), 2, null);
    }
}
