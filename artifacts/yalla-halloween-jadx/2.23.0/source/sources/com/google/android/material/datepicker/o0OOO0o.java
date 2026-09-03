package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f16957OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MonthsPagerAdapter f16958OooO0o0;

    public o0OOO0o(MonthsPagerAdapter monthsPagerAdapter, MaterialCalendarGridView materialCalendarGridView) {
        this.f16958OooO0o0 = monthsPagerAdapter;
        this.f16957OooO0Oo = materialCalendarGridView;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f16957OooO0Oo;
        o0ooOOo adapter = materialCalendarGridView.getAdapter();
        if (i >= adapter.OooO0O0() && i <= (adapter.OooO0O0() + adapter.f16963OooO0Oo.f16862OooO0oo) + (-1)) {
            OooOo00.OooO oooO = this.f16958OooO0o0.f16867OooO0Oo;
            long jLongValue = materialCalendarGridView.getAdapter().getItem(i).longValue();
            OooOo00 oooOo00 = OooOo00.this;
            if (oooOo00.f16904OooO0oO.f16806OooO0o.Oooo(jLongValue)) {
                oooOo00.f16902OooO0o.o0000OOO(jLongValue);
                Iterator it = oooOo00.f16956OooO0Oo.iterator();
                while (it.hasNext()) {
                    ((o0Oo0oo) it.next()).OooO0O0(oooOo00.f16902OooO0o.o0000oo());
                }
                oooOo00.f16910OooOOO0.getAdapter().notifyDataSetChanged();
                RecyclerView recyclerView = oooOo00.f16908OooOO0o;
                if (recyclerView != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
