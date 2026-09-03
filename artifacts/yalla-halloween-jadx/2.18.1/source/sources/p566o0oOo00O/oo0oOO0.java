package p566o0oOo00O;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.app.base.model.CountryModel;
import com.app.base.model.RoomIndexModel;
import com.chad.library.adapter.base.OooO00o;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p168o00Ooo0.oo000o;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p255o00ooO0o.oo0oOO0;
import p487o0o000oO.o0ooOOo;
import p498o0o00Oo0.OooOOO;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0oOO0 extends OooO0OO<CountryModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserCountrySelectActivity f45401OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(UserCountrySelectActivity userCountrySelectActivity, Context context) {
        super(context, R.layout.item_country_select);
        this.f45401OooO00o = userCountrySelectActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(OooO00o oooO00o, Object obj) {
        final OooO0o oooO0o = (OooO0o) oooO00o;
        final CountryModel countryModel = (CountryModel) obj;
        if (this.f45401OooO00o.f23422OoooOoo == 0) {
            oooO0o.OooO0oO(R.id.tv_title, false);
        } else if (oooO0o.getPosition() == 0) {
            oooO0o.OooO0oO(R.id.tv_title, true);
            oooO0o.OooO(R.id.tv_title, R.string.select_country_Hot);
        } else if (oooO0o.getPosition() == this.f45401OooO00o.f23422OoooOoo) {
            oooO0o.OooO0oO(R.id.tv_title, true);
            oooO0o.OooO(R.id.tv_title, R.string.All);
        } else {
            oooO0o.OooO0oO(R.id.tv_title, false);
        }
        final boolean z = OooOOO.f41216OooO00o.OooO0Oo().getValue() == Integer.valueOf(countryModel.getCid());
        oooO0o.OooO0oO(R.id.ivSelected, z);
        if (this.f45401OooO00o.f23426OooooOO == oooO0o.getLayoutPosition()) {
            oooO0o.OooO0o0(R.id.ll_country_item, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_E9E9E9));
        } else {
            oooO0o.OooO0o(R.id.ll_country_item, R.drawable.ripple_border);
        }
        oooO0o.OooOO0(R.id.tv_country, countryModel.getName());
        UserCountrySelectActivity userCountrySelectActivity = this.f45401OooO00o;
        Objects.requireNonNull(userCountrySelectActivity);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(userCountrySelectActivity);
        oooO00o2.f48429OooO0OO = oo000o.OooO0OO(countryModel.getCid() + "");
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.niv_flag));
        oooO0o.OooOOOO(R.id.ll_country_item, new View.OnClickListener() { // from class: o0oOo00O.o00O0OOO
            /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                oo0oOO0 oo0ooo0 = this.f45268Oooo0o;
                final CountryModel countryModel2 = countryModel;
                boolean z2 = z;
                OooO0o oooO0o2 = oooO0o;
                UserCountrySelectActivity userCountrySelectActivity2 = oo0ooo0.f45401OooO00o;
                if (!userCountrySelectActivity2.f23424Ooooo0o) {
                    LiveEventBus.get("Recharge_Country_Temp").post(countryModel2);
                    oo0ooo0.f45401OooO00o.finish();
                    return;
                }
                if (z2) {
                    return;
                }
                userCountrySelectActivity2.f23426OooooOO = oooO0o2.getLayoutPosition();
                oo0ooo0.f45401OooO00o.f23421OoooOoO.notifyItemChanged(oooO0o2.getLayoutPosition());
                final UserCountrySelectActivity userCountrySelectActivity3 = oo0ooo0.f45401OooO00o;
                Objects.requireNonNull(userCountrySelectActivity3);
                o0ooOOo o0ooooo2 = o0ooOOo.f40960OooO00o;
                final boolean zContains = o0ooOOo.f40962OooO0OO.contains(Integer.valueOf(countryModel2.getCid()));
                OooOOO oooOOO = OooOOO.f41216OooO00o;
                RoomIndexModel value = OooOOO.f41251Oooo0OO.getValue();
                boolean z3 = value != null && value.ispwdroom == 1 && Integer.valueOf(value.isencrypt).intValue() > 0;
                String strOooO00o = OooOo.OooO00o(userCountrySelectActivity3.getString(R.string.UserInfoTag_ChangeCountry_HintContent), countryModel2.getName());
                if (zContains && !userCountrySelectActivity3.f23425OooooO0 && z3) {
                    strOooO00o = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.change_country_pas_room_limited);
                }
                oo0oOO0 oo0ooo1 = new oo0oOO0(userCountrySelectActivity3);
                oo0ooo1.OooOo0O(strOooO00o);
                oo0ooo1.OooOOOo(R.string.Change_Country);
                oo0ooo1.OooOo0o(new Function0() { // from class: o0oOo00O.o00O0OO
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        UserCountrySelectActivity userCountrySelectActivity4 = userCountrySelectActivity3;
                        CountryModel countryModel3 = countryModel2;
                        boolean z4 = zContains;
                        int i = UserCountrySelectActivity.f23419OooooOo;
                        Objects.requireNonNull(userCountrySelectActivity4);
                        HashMap map = new HashMap();
                        if (countryModel3 != null) {
                            map.put("countryid", countryModel3.getCid());
                        }
                        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
                        o00000OO.f32209OooO0OO.OooO0O0(userCountrySelectActivity4, map, new o00O(userCountrySelectActivity4, userCountrySelectActivity4, countryModel3, z4));
                        return null;
                    }
                });
                oo0ooo1.OooOoO();
                oo0ooo1.OooOO0O(new Function0() { // from class: o0oOo00O.oo0o0O0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        UserCountrySelectActivity userCountrySelectActivity4 = userCountrySelectActivity3;
                        int i = userCountrySelectActivity4.f23426OooooOO;
                        userCountrySelectActivity4.f23426OooooOO = -1;
                        userCountrySelectActivity4.f23421OoooOoO.notifyItemChanged(i);
                        return null;
                    }
                });
                oo0ooo1.OooOOO0();
            }
        });
    }
}
