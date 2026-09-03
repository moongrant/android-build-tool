package p643o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.OooOOO0;
import androidx.recyclerview.widget.Oooo000;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.oOO00O;
import p101o000oo.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBasePagingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePagingAdapter.kt\ncom/yalla/yalla/base/paging/BasePagingAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1855#2,2:218\n1855#2,2:220\n*S KotlinDebug\n*F\n+ 1 BasePagingAdapter.kt\ncom/yalla/yalla/base/paging/BasePagingAdapter\n*L\n101#1:218,2\n113#1:220,2\n*E\n"})
public abstract class h3<T> extends oOO00O<T, PagingViewHolder> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ArrayList f57999OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public j3 f58000OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Integer f58001OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f58002OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f58003OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ArrayList f58004OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Function3<? super h3<T>, ? super View, ? super Integer, Unit> f58005OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Function3<? super h3<T>, ? super View, ? super Integer, Unit> f58006OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Function3<? super h3<T>, ? super View, ? super Integer, Boolean> f58007OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Function3<? super h3<T>, ? super View, ? super Integer, Boolean> f58008OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Integer> f58009OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Integer> f58010OooOOOo;

    @SourceDebugExtension({"SMAP\nBasePagingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePagingAdapter.kt\ncom/yalla/yalla/base/paging/BasePagingAdapter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1855#2,2:218\n1855#2,2:220\n*S KotlinDebug\n*F\n+ 1 BasePagingAdapter.kt\ncom/yalla/yalla/base/paging/BasePagingAdapter$1\n*L\n33#1:218,2\n45#1:220,2\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<oo0o0Oo, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ h3<T> f58011OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(h3<T> h3Var) {
            super(1);
            this.f58011OooO0Oo = h3Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oo0o0Oo oo0o0oo) {
            oo0o0Oo it = oo0o0oo;
            Intrinsics.checkNotNullParameter(it, "it");
            OooOOO0 oooOOO0 = it.f35621OooO0Oo.f10254OooO00o;
            boolean z = oooOOO0 instanceof OooOOO0.OooO0O0;
            h3<T> h3Var = this.f58011OooO0Oo;
            if (z) {
                h3Var.f58002OooO0oO = true;
            } else if ((oooOOO0 instanceof OooOOO0.OooO0OO) && h3Var.f58002OooO0oO) {
                h3Var.f58002OooO0oO = false;
                Iterator it2 = h3Var.f57999OooO.iterator();
                while (it2.hasNext()) {
                    ((Function0) it2.next()).invoke();
                }
            }
            OooOOO0 oooOOO1 = it.f35621OooO0Oo.f10256OooO0OO;
            if (oooOOO1 instanceof OooOOO0.OooO0O0) {
                h3Var.f58003OooO0oo = true;
            } else if ((oooOOO1 instanceof OooOOO0.OooO0OO) && h3Var.f58003OooO0oo) {
                h3Var.f58003OooO0oo = false;
                Iterator it3 = h3Var.f58004OooOO0.iterator();
                while (it3.hasNext()) {
                    ((Function0) it3.next()).invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h3() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(@Nullable Integer num, @NotNull Oooo000.OooO<T> diffCallback) {
        super(diffCallback);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.f58001OooO0o0 = num;
        this.f57999OooO = new ArrayList();
        this.f58004OooOO0 = new ArrayList();
        OooO00o(new OooO00o(this));
        this.f58009OooOOOO = new LinkedHashSet<>();
        this.f58010OooOOOo = new LinkedHashSet<>();
    }

    public final void OooO0Oo(@IdRes @NotNull int... viewIds) {
        Intrinsics.checkNotNullParameter(viewIds, "viewIds");
        for (int i : viewIds) {
            this.f58009OooOOOO.add(Integer.valueOf(i));
        }
    }

    public abstract void OooO0o(@NotNull PagingViewHolder pagingViewHolder, @NotNull T t);

    public final void OooO0o0(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f57999OooO.add(listener);
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
        if (this.f58005OooOO0O != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o0ooOOOO.d3
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Function3<? super h3<T>, ? super View, ? super Integer, Unit> function3;
                    h3 this$0 = this.f57990OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    PagingViewHolder holder2 = holder;
                    Intrinsics.checkNotNullParameter(holder2, "$holder");
                    int itemCount = this$0.getItemCount();
                    int bindingAdapterPosition = holder2.getBindingAdapterPosition();
                    if (!(bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) || (function3 = this$0.f58005OooOO0O) == 0) {
                        return;
                    }
                    Intrinsics.checkNotNull(view);
                    function3.invoke(this$0, view, Integer.valueOf(holder2.getBindingAdapterPosition()));
                }
            });
        } else {
            holder.itemView.setOnClickListener(null);
        }
        if (this.f58008OooOOO0 != null) {
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0ooOOOO.e3
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    Boolean boolInvoke;
                    h3 this$0 = this.f57992OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    PagingViewHolder holder2 = holder;
                    Intrinsics.checkNotNullParameter(holder2, "$holder");
                    int itemCount = this$0.getItemCount();
                    int bindingAdapterPosition = holder2.getBindingAdapterPosition();
                    if (!(bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount)) {
                        return false;
                    }
                    Function3<? super h3<T>, ? super View, ? super Integer, Boolean> function3 = this$0.f58008OooOOO0;
                    if (function3 != 0) {
                        Intrinsics.checkNotNull(view);
                        boolInvoke = function3.invoke(this$0, view, Integer.valueOf(holder2.getBindingAdapterPosition()));
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
        Iterator<T> it = this.f58009OooOOOO.iterator();
        while (it.hasNext()) {
            View viewOrNull = holder.getViewOrNull(((Number) it.next()).intValue());
            if (this.f58006OooOO0o != null) {
                if (viewOrNull != null) {
                    viewOrNull.setOnClickListener(new f3(0, this, holder));
                }
            } else if (viewOrNull != null) {
                viewOrNull.setOnClickListener(null);
            }
        }
        Iterator<T> it2 = this.f58010OooOOOo.iterator();
        while (it2.hasNext()) {
            View viewOrNull2 = holder.getViewOrNull(((Number) it2.next()).intValue());
            if (this.f58007OooOOO != null) {
                if (viewOrNull2 != null) {
                    viewOrNull2.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0ooOOOO.g3
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            Boolean boolInvoke;
                            h3 this$0 = this.f57997OooO0Oo;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            PagingViewHolder holder2 = holder;
                            Intrinsics.checkNotNullParameter(holder2, "$holder");
                            int itemCount = this$0.getItemCount();
                            int bindingAdapterPosition = holder2.getBindingAdapterPosition();
                            if (!(bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount)) {
                                return false;
                            }
                            Function3<? super h3<T>, ? super View, ? super Integer, Boolean> function3 = this$0.f58007OooOOO;
                            if (function3 != 0) {
                                Intrinsics.checkNotNull(view);
                                boolInvoke = function3.invoke(this$0, view, Integer.valueOf(holder2.getBindingAdapterPosition()));
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
        j3 j3Var = this.f58000OooO0o;
        Integer numValueOf = j3Var != null ? Integer.valueOf(j3Var.OooO00o(i)) : this.f58001OooO0o0;
        if (numValueOf == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(numValueOf.intValue(), parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new PagingViewHolder(viewInflate);
    }
}
