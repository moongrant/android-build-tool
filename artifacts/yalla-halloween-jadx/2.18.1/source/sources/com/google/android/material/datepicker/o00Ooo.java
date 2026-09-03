package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f17001Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo000o f17002Oooo0oO;

    public o00Ooo(oo000o oo000oVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f17002Oooo0oO = oo000oVar;
        this.f17001Oooo0o = materialCalendarGridView;
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
        o00Oo0 adapter = this.f17001Oooo0o.getAdapter();
        if (i >= adapter.OooO0OO() && i <= adapter.OooO0o0()) {
            OooOO0O.OooO oooO = this.f17002Oooo0oO.f17019OooO0OO;
            long jLongValue = this.f17001Oooo0o.getAdapter().getItem(i).longValue();
            OooOO0O.OooO0o oooO0o = (OooOO0O.OooO0o) oooO;
            if (OooOO0O.this.f16949Oooo.f16870Oooo0oo.oo000o(jLongValue)) {
                OooOO0O.this.f16951Oooo0oo.o0000O00(jLongValue);
                Iterator it = OooOO0O.this.f17016Oooo0o.iterator();
                while (it.hasNext()) {
                    ((o00oO0o) it.next()).OooO0O0(OooOO0O.this.f16951Oooo0oo.o000000O());
                }
                OooOO0O.this.f16956OoooOO0.getAdapter().notifyDataSetChanged();
                RecyclerView recyclerView = OooOO0O.this.f16952OoooO;
                if (recyclerView != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
