package p464o0Ooo0oO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.recyclerview.widget.RecyclerView;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.OooOo;
import p089o000o000.o000000;
import p089o000o000.o00O000o;
import p089o000o000.o0O0ooO;
import p350o0OOOOOo.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0000O0O<T> extends o00O000o<T, o000OO> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final List<Function0<Unit>> f40450OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooOO0O f40451OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Integer f40452OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f40453OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f40454OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final List<Function0<Unit>> f40455OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Function3<? super o0000O0O<T>, ? super View, ? super Integer, Unit> f40456OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function3<? super o0000O0O<T>, ? super View, ? super Integer, Unit> f40457OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Function3<? super o0000O0O<T>, ? super View, ? super Integer, Boolean> f40458OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function3<? super o0000O0O<T>, ? super View, ? super Integer, Boolean> f40459OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Integer> f40460OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Integer> f40461OooOOOo;

    public static final class OooO00o extends Lambda implements Function1<OooOo, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0000O0O<T> f40462Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0000O0O<T> o0000o0o2) {
            super(1);
            this.f40462Oooo0o = o0000o0o2;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>>] */
        /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>>] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OooOo oooOo) {
            OooOo it = oooOo;
            Intrinsics.checkNotNullParameter(it, "it");
            o000000 o000000Var = it.f28685OooO0Oo.f28702OooO00o;
            if (o000000Var instanceof o000000.OooO0O0) {
                this.f40462Oooo0o.f40453OooO0oO = true;
            } else if (o000000Var instanceof o000000.OooO0OO) {
                o0000O0O<T> o0000o0o2 = this.f40462Oooo0o;
                if (o0000o0o2.f40453OooO0oO) {
                    o0000o0o2.f40453OooO0oO = false;
                    Iterator it2 = o0000o0o2.f40450OooO.iterator();
                    while (it2.hasNext()) {
                        ((Function0) it2.next()).invoke();
                    }
                }
            }
            o000000 o000000Var2 = it.f28685OooO0Oo.f28704OooO0OO;
            if (o000000Var2 instanceof o000000.OooO0O0) {
                this.f40462Oooo0o.f40454OooO0oo = true;
            } else if (o000000Var2 instanceof o000000.OooO0OO) {
                o0000O0O<T> o0000o0o3 = this.f40462Oooo0o;
                if (o0000o0o3.f40454OooO0oo) {
                    o0000o0o3.f40454OooO0oo = false;
                    Iterator it3 = o0000o0o3.f40455OooOO0.iterator();
                    while (it3.hasNext()) {
                        ((Function0) it3.next()).invoke();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.support.common.paging.BasePagingAdapter$setPagerSource$1", f = "BasePagingAdapter.kt", i = {}, l = {Constants.ERR_MODULE_NOT_FOUND}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f40463Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0000O<K, T> f40464Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0000O0O<T> f40465Oooo0oo;

        @DebugMetadata(c = "com.yalla.support.common.paging.BasePagingAdapter$setPagerSource$1$1", f = "BasePagingAdapter.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<o0O0ooO<T>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f40466Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public /* synthetic */ Object f40467Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ o0000O0O<T> f40468Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(o0000O0O<T> o0000o0o2, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f40468Oooo0oo = o0000o0o2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f40468Oooo0oo, continuation);
                oooO00o.f40467Oooo0oO = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return ((OooO00o) create((o0O0ooO) obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f40466Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0O0ooO<T> o0o0ooo = (o0O0ooO) this.f40467Oooo0oO;
                    o0000O0O<T> o0000o0o2 = this.f40468Oooo0oo;
                    this.f40466Oooo0o = 1;
                    if (o0000o0o2.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0000O<K, T> o0000o2, o0000O0O<T> o0000o0o2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f40464Oooo0oO = o0000o2;
            this.f40465Oooo0oo = o0000o0o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f40464Oooo0oO, this.f40465Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f40463Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<o0O0ooO<Value>> flow = this.f40464Oooo0oO.f40445OooO0O0.f28690OooO00o;
                OooO00o oooO00o = new OooO00o(this.f40465Oooo0oo, null);
                this.f40463Oooo0o = 1;
                if (FlowKt.collectLatest(flow, oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(@Nullable Integer num, @NotNull androidx.recyclerview.widget.OooOo.OooO<T> diffCallback) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.f40452OooO0o0 = num;
        this.f40450OooO = new ArrayList();
        this.f40455OooOO0 = new ArrayList();
        OooO00o(new OooO00o(this));
        this.f40460OooOOOO = new LinkedHashSet<>();
        this.f40461OooOOOo = new LinkedHashSet<>();
    }

    public final void OooO0OO(@IdRes @NotNull int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        for (int i : viewIds) {
            this.f40460OooOOOO.add(Integer.valueOf(i));
        }
    }

    public final void OooO0Oo(@IdRes @NotNull int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        for (int i : viewIds) {
            this.f40461OooOOOo.add(Integer.valueOf(i));
        }
    }

    public abstract void OooO0o(@NotNull o000OO o000oo2, @NotNull T t);

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>>] */
    public final void OooO0o0(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f40450OooO.add(listener);
    }

    public final <K> void OooO0oO(@NotNull o0000O<K, T> pagerSource) {
        Intrinsics.checkNotNullParameter(pagerSource, "pagerSource");
        BuildersKt__Builders_commonKt.launch$default(pagerSource.f40444OooO00o, Dispatchers.getIO(), null, new OooO0O0(pagerSource, this, null), 2, null);
    }

    @NotNull
    public final T getData(int i) {
        T item = getItem(i);
        Intrinsics.checkNotNull(item);
        return item;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.oo0o0Oo oo0o0oo, int i) {
        final o000OO holder = (o000OO) oo0o0oo;
        Intrinsics.checkNotNullParameter(holder, "holder");
        int i2 = 0;
        if (this.f40456OooOO0O != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o0Ooo0oO.o0000O00
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // android.view.View.OnClickListener
                public final void onClick(View it) {
                    Function3<? super o0000O0O<T>, ? super View, ? super Integer, Unit> function3;
                    o0000O0O this$0 = this.f40448Oooo0o;
                    o000OO holder2 = holder;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(holder2, "$holder");
                    int itemCount = this$0.getItemCount();
                    int bindingAdapterPosition = holder2.getBindingAdapterPosition();
                    boolean z = false;
                    if (bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) {
                        z = true;
                    }
                    if (!z || (function3 = this$0.f40456OooOO0O) == 0) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    function3.invoke(this$0, it, Integer.valueOf(holder2.getBindingAdapterPosition()));
                }
            });
        } else {
            holder.itemView.setOnClickListener(null);
        }
        if (this.f40459OooOOO0 != null) {
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0Ooo0oO.o0000oo
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View it) {
                    Boolean boolInvoke;
                    o0000O0O this$0 = this.f40470Oooo0o;
                    o000OO holder2 = holder;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(holder2, "$holder");
                    int itemCount = this$0.getItemCount();
                    int bindingAdapterPosition = holder2.getBindingAdapterPosition();
                    if (!(bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount)) {
                        return false;
                    }
                    Function3<? super o0000O0O<T>, ? super View, ? super Integer, Boolean> function3 = this$0.f40459OooOOO0;
                    if (function3 != 0) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        boolInvoke = function3.invoke(this$0, it, Integer.valueOf(holder2.getBindingAdapterPosition()));
                    } else {
                        boolInvoke = null;
                    }
                    if (boolInvoke != null) {
                        return boolInvoke.booleanValue();
                    }
                    return false;
                }
            });
        } else {
            holder.itemView.setOnLongClickListener(null);
        }
        Iterator<T> it = this.f40460OooOOOO.iterator();
        while (it.hasNext()) {
            View viewOooO0O0 = holder.OooO0O0(((Number) it.next()).intValue());
            if (this.f40457OooOO0o != null) {
                if (viewOooO0O0 != null) {
                    viewOooO0O0.setOnClickListener(new o0000(this, holder, i2));
                }
            } else if (viewOooO0O0 != null) {
                viewOooO0O0.setOnClickListener(null);
            }
        }
        Iterator<T> it2 = this.f40461OooOOOo.iterator();
        while (it2.hasNext()) {
            View viewOooO0O1 = holder.OooO0O0(((Number) it2.next()).intValue());
            if (this.f40458OooOOO != null) {
                if (viewOooO0O1 != null) {
                    viewOooO0O1.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0Ooo0oO.o0000O0
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View it3) {
                            Boolean boolInvoke;
                            o0000O0O this$0 = this.f40446Oooo0o;
                            o000OO holder2 = holder;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(holder2, "$holder");
                            int itemCount = this$0.getItemCount();
                            int bindingAdapterPosition = holder2.getBindingAdapterPosition();
                            if (!(bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount)) {
                                return false;
                            }
                            Function3<? super o0000O0O<T>, ? super View, ? super Integer, Boolean> function3 = this$0.f40458OooOOO;
                            if (function3 != 0) {
                                Intrinsics.checkNotNullExpressionValue(it3, "it");
                                boolInvoke = function3.invoke(this$0, it3, Integer.valueOf(holder2.getBindingAdapterPosition()));
                            } else {
                                boolInvoke = null;
                            }
                            if (boolInvoke != null) {
                                return boolInvoke.booleanValue();
                            }
                            return false;
                        }
                    });
                }
            } else if (viewOooO0O1 != null) {
                viewOooO0O1.setOnLongClickListener(null);
            }
        }
        T item = getItem(i);
        Intrinsics.checkNotNull(item);
        OooO0o(holder, item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.oo0o0Oo onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        OooOO0O oooOO0O = this.f40451OooO0o;
        Integer numValueOf = oooOO0O != null ? Integer.valueOf(oooOO0O.OooO0O0(i)) : this.f40452OooO0o0;
        if (numValueOf == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(numValueOf.intValue(), parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inf…te(layout, parent, false)");
        return new o000OO(viewInflate);
    }
}
