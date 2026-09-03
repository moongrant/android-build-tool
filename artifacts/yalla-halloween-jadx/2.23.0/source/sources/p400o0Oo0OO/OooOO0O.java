package p400o0Oo0OO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.OooOOO0;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.base.paging.PagingViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00O.OooOo;
import o000O00O.o000O0Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBasePagingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePagingAdapter.kt\ncom/yalla/yalla/base/paging/BasePagingAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1855#2,2:218\n1855#2,2:220\n*S KotlinDebug\n*F\n+ 1 BasePagingAdapter.kt\ncom/yalla/yalla/base/paging/BasePagingAdapter\n*L\n101#1:218,2\n113#1:220,2\n*E\n"})
public abstract class OooOO0O<T> extends o000O0Oo<T, PagingViewHolder> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ArrayList f44440OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooOOO f44441OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Integer f44442OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f44443OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f44444OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ArrayList f44445OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Function3<? super OooOO0O<T>, ? super View, ? super Integer, Unit> f44446OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function3<? super OooOO0O<T>, ? super View, ? super Integer, Unit> f44447OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Function3<? super OooOO0O<T>, ? super View, ? super Integer, Boolean> f44448OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function3<? super OooOO0O<T>, ? super View, ? super Integer, Boolean> f44449OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Integer> f44450OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Integer> f44451OooOOOo;

    @SourceDebugExtension({"SMAP\nBasePagingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePagingAdapter.kt\ncom/yalla/yalla/base/paging/BasePagingAdapter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1855#2,2:218\n1855#2,2:220\n*S KotlinDebug\n*F\n+ 1 BasePagingAdapter.kt\ncom/yalla/yalla/base/paging/BasePagingAdapter$1\n*L\n33#1:218,2\n45#1:220,2\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<OooOo, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O<T> f44452OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOO0O<T> oooOO0O) {
            super(1);
            this.f44452OooO0Oo = oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OooOo oooOo) {
            OooOo it = oooOo;
            Intrinsics.checkNotNullParameter(it, "it");
            OooOOO0 oooOOO0 = it.f34458OooO0Oo.f7160OooO00o;
            boolean z = oooOOO0 instanceof OooOOO0.OooO0O0;
            OooOO0O<T> oooOO0O = this.f44452OooO0Oo;
            if (z) {
                oooOO0O.f44443OooO0oO = true;
            } else if ((oooOOO0 instanceof OooOOO0.OooO0OO) && oooOO0O.f44443OooO0oO) {
                oooOO0O.f44443OooO0oO = false;
                Iterator it2 = oooOO0O.f44440OooO.iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
            }
            OooOOO0 oooOOO1 = it.f34458OooO0Oo.f7162OooO0OO;
            if (oooOOO1 instanceof OooOOO0.OooO0O0) {
                oooOO0O.f44444OooO0oo = true;
            } else if ((oooOOO1 instanceof OooOOO0.OooO0OO) && oooOO0O.f44444OooO0oo) {
                oooOO0O.f44444OooO0oo = false;
                Iterator it3 = oooOO0O.f44445OooOO0.iterator();
                while (it3.hasNext()) {
                    ((Function0) it3.next()).invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ OooOO0O() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(@Nullable Integer num, @NotNull androidx.recyclerview.widget.OooOo.OooO<T> diffCallback) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.f44442OooO0o0 = num;
        this.f44440OooO = new ArrayList();
        this.f44445OooOO0 = new ArrayList();
        OooO00o(new OooO00o(this));
        this.f44450OooOOOO = new LinkedHashSet<>();
        this.f44451OooOOOo = new LinkedHashSet<>();
    }

    public final void OooO0Oo(@IdRes @NotNull int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        for (int i : viewIds) {
            this.f44450OooOOOO.add(Integer.valueOf(i));
        }
    }

    public abstract void OooO0o(@NotNull PagingViewHolder pagingViewHolder, @NotNull T t);

    public final void OooO0o0(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f44440OooO.add(listener);
    }

    @NotNull
    public final T getData(int i) {
        T tOooO0O0 = OooO0O0(i);
        Intrinsics.checkNotNull(tOooO0O0);
        return tOooO0O0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.o0O0O00 o0o0o00, int i) {
        final PagingViewHolder holder = (PagingViewHolder) o0o0o00;
        Intrinsics.checkNotNullParameter(holder, "holder");
        int i2 = 0;
        if (this.f44446OooOO0O != null) {
            holder.itemView.setOnClickListener(new OooO0OO(this, holder, i2));
        } else {
            holder.itemView.setOnClickListener(null);
        }
        if (this.f44449OooOOO0 != null) {
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0Oo0OO.OooO0o
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View it) {
                    Boolean boolInvoke;
                    OooOO0O this$0 = this.f44436OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    PagingViewHolder holder2 = holder;
                    Intrinsics.checkNotNullParameter(holder2, "$holder");
                    int itemCount = this$0.getItemCount();
                    int bindingAdapterPosition = holder2.getBindingAdapterPosition();
                    if (!(bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount)) {
                        return false;
                    }
                    Function3<? super OooOO0O<T>, ? super View, ? super Integer, Boolean> function3 = this$0.f44449OooOOO0;
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
        Iterator<T> it = this.f44450OooOOOO.iterator();
        while (it.hasNext()) {
            View viewOrNull = holder.getViewOrNull(((Number) it.next()).intValue());
            if (this.f44447OooOO0o != null) {
                if (viewOrNull != null) {
                    viewOrNull.setOnClickListener(new OooO(this, holder, i2));
                }
            } else if (viewOrNull != null) {
                viewOrNull.setOnClickListener(null);
            }
        }
        Iterator<T> it2 = this.f44451OooOOOo.iterator();
        while (it2.hasNext()) {
            View viewOrNull2 = holder.getViewOrNull(((Number) it2.next()).intValue());
            if (this.f44448OooOOO != null) {
                if (viewOrNull2 != null) {
                    viewOrNull2.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0Oo0OO.OooOO0
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View it3) {
                            Boolean boolInvoke;
                            OooOO0O this$0 = this.f44438OooO0Oo;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            PagingViewHolder holder2 = holder;
                            Intrinsics.checkNotNullParameter(holder2, "$holder");
                            int itemCount = this$0.getItemCount();
                            int bindingAdapterPosition = holder2.getBindingAdapterPosition();
                            if (!(bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount)) {
                                return false;
                            }
                            Function3<? super OooOO0O<T>, ? super View, ? super Integer, Boolean> function3 = this$0.f44448OooOOO;
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
            } else if (viewOrNull2 != null) {
                viewOrNull2.setOnLongClickListener(null);
            }
        }
        T tOooO0O0 = OooO0O0(i);
        Intrinsics.checkNotNull(tOooO0O0);
        OooO0o(holder, tOooO0O0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.o0O0O00 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        OooOOO oooOOO = this.f44441OooO0o;
        Integer numValueOf = oooOOO != null ? Integer.valueOf(oooOOO.OooO00o(i)) : this.f44442OooO0o0;
        if (numValueOf == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(numValueOf.intValue(), parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context).inf…te(layout, parent, false)");
        return new PagingViewHolder(viewInflate);
    }
}
