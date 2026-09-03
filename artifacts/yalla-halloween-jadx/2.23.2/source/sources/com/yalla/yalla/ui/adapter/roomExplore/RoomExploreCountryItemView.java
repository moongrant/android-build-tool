package com.yalla.yalla.ui.adapter.roomExplore;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.abs.AbsView.AbsView;
import com.yalla.yalla.model.CountryModel;
import p368o0OOo0Oo.Oooo000;
import p400o0Oo0O0.OooOOO0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public class RoomExploreCountryItemView extends AbsView<CountryModel, AbsListenerTag> {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public TextView f27268OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public NetImageView f27269OooOOO0;

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final int OooO0OO() {
        return oo0o0Oo.item_room_explore_country;
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f27268OooOO0o = (TextView) OooO00o(o0OO00O.item_room_explore_country_layout_name_tv);
        this.f27269OooOOO0 = (NetImageView) OooO0O0(o0OO00O.item_room_explore_country_layout_picture_iv);
        OooO0o0();
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final void OooO0o0() {
        this.f27268OooOO0o.setText("");
        this.f27268OooOO0o.setVisibility(8);
        this.f27269OooOOO0.setImageDrawable(null);
        this.f27269OooOOO0.setVisibility(8);
    }

    @Override // com.yalla.yalla.base.abs.AbsView.AbsView
    public final /* bridge */ /* synthetic */ void OooO0oO(Object obj) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0oo(CountryModel countryModel, int i) {
        this.f22261OooO0oO = countryModel;
        this.f22262OooO0oo = i;
        OooO0o0();
        if (countryModel == 0) {
            return;
        }
        if (!TextUtils.isEmpty(countryModel.getCid())) {
            this.f27269OooOOO0.setVisibility(0);
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f22263OooOO0);
            oooO00o.f43126OooO0OO = OooOo00.OooO00o(countryModel.getCid());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(this.f27269OooOOO0);
        }
        if (TextUtils.isEmpty(countryModel.getName())) {
            return;
        }
        this.f27268OooOO0o.setVisibility(0);
        this.f27268OooOO0o.setText(countryModel.getName());
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
    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        Model model;
        int id = view.getId();
        if ((id == o0OO00O.item_room_explore_country_layout_item_bg || id == o0OO00O.item_room_explore_country_layout_name_tv || id == o0OO00O.item_room_explore_country_layout_picture_iv) && (model = this.f22261OooO0oO) != 0) {
            CountryModel countryModel = (CountryModel) model;
            int i = this.f22262OooO0oo;
            AbsListenerTag absListenerTag = AbsListenerTag.Default;
            OooOOO0<Model, ListenerTag> oooOOO0 = this.f22260OooO0o0;
            if (oooOOO0 != 0) {
                oooOOO0.OooO00o(i, countryModel, absListenerTag);
            }
        }
    }
}
