package com.app.base.adapter.roomExplore;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.TextView;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.abs.AbsView.AbsView;
import com.app.base.model.CountryModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p168o00Ooo0.oo000o;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public class RoomExploreCountryItemView extends AbsView<CountryModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public NetImageView f11389OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public TextView f11390o000oOoO;

    public RoomExploreCountryItemView(Activity activity) {
        super(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.framework.abs.AbsView.AbsView
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public final void OooO0oo(CountryModel countryModel, int i) {
        this.f11708Oooo = countryModel;
        this.f11714OoooO00 = i;
        OooO0o0();
        if (countryModel == 0) {
            return;
        }
        if (!TextUtils.isEmpty(countryModel.getCid())) {
            this.f11389OoooOOO.setVisibility(0);
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f11715OoooO0O);
            oooO00o.f48429OooO0OO = oo000o.OooO0OO(countryModel.getCid());
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(this.f11389OoooOOO);
        }
        if (TextUtils.isEmpty(countryModel.getName())) {
            return;
        }
        this.f11390o000oOoO.setVisibility(0);
        this.f11390o000oOoO.setText(countryModel.getName());
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final int OooO0OO() {
        return R.layout.item_room_explore_country;
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f11390o000oOoO = (TextView) OooO00o(R.id.item_room_explore_country_layout_name_tv);
        this.f11389OoooOOO = (NetImageView) OooO0O0(R.id.item_room_explore_country_layout_picture_iv);
        OooO0o0();
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o0() {
        this.f11390o000oOoO.setText("");
        this.f11390o000oOoO.setVisibility(8);
        this.f11389OoooOOO.setImageDrawable(null);
        this.f11389OoooOOO.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v4 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(android.view.View r4) {
        /*
            r3 = this;
            int r4 = r4.getId()
            r0 = 2131297491(0x7f0904d3, float:1.8212928E38)
            if (r4 == r0) goto L13
            r0 = 2131297492(0x7f0904d4, float:1.821293E38)
            if (r4 == r0) goto L13
            r0 = 2131297493(0x7f0904d5, float:1.8212932E38)
            if (r4 != r0) goto L25
        L13:
            Model r4 = r3.f11708Oooo
            if (r4 != 0) goto L18
            return
        L18:
            com.app.base.model.CountryModel r4 = (com.app.base.model.CountryModel) r4
            int r0 = r3.f11714OoooO00
            com.app.base.framework.abs.AbsListener.AbsListenerTag r1 = com.app.base.framework.abs.AbsListener.AbsListenerTag.Default
            o00Oo00.OooO0O0<Model, ListenerTag> r2 = r3.f11710Oooo0oO
            if (r2 == 0) goto L25
            r2.OooO0O0(r4, r0, r1)
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.base.adapter.roomExplore.RoomExploreCountryItemView.onClickNotDouble(android.view.View):void");
    }
}
