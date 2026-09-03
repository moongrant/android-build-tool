package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.app.appConfig.apiDataModela.ApiCountryUtils;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.CountryCodeItemModel;
import com.app.base.model.CountryCodeModel;
import com.app.base.model.CountryModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import p466o0OooO0.o00000O0;
import p566o0oOo00O.oo0oOO0;
import p617o0oo0o.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public class UserCountrySelectActivity extends BaseActivity {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final /* synthetic */ int f23419OooooOo = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f23420OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<CountryModel> f23421OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f23422OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ArrayList<CountryModel> f23423Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f23424Ooooo0o = true;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f23425OooooO0 = false;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f23426OooooOO = -1;

    public static void OooOoO(Context context, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) UserCountrySelectActivity.class);
        intent.putExtra("hot", z);
        intent.putExtra("KEY_ROOM", z2);
        context.startActivity(intent);
    }

    public final void OooOoOO() {
        List<CountryCodeItemModel> arrayList;
        if (this.f23424Ooooo0o) {
            o00Ooo o00ooo2 = new o00Ooo(this);
            CountryCodeModel countryCodeModelOooO0OO = o00ooo2.OooO0OO(o00ooo2.f48560OooO00o);
            if (countryCodeModelOooO0OO == null || (arrayList = countryCodeModelOooO0OO.getHotCountries()) == null) {
                arrayList = new ArrayList<>();
            }
            if (com.yalla.support.common.util.OooO0OO.OooO0O0(arrayList)) {
                this.f23422OoooOoo = arrayList.size();
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    CountryModel countryModel = new CountryModel();
                    countryModel.setHotico("1");
                    countryModel.setCid(arrayList.get(size).getId());
                    countryModel.setName(arrayList.get(size).getName());
                    this.f23421OoooOoO.addData(0, countryModel);
                }
            }
            this.f23421OoooOoO.setLoadComplete();
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_contry_select);
        this.f23424Ooooo0o = getIntent().getBooleanExtra("hot", true);
        this.f23425OooooO0 = getIntent().getBooleanExtra("KEY_ROOM", false);
        OooOo(R.string.countries);
        OooOo0O(1);
        this.f23420OoooOo0 = (RecyclerView) findViewById(R.id.rec_country_select);
        this.f23423Ooooo00 = new ArrayList<>();
        this.f23421OoooOoO = new oo0oOO0(this, this);
        ApiCountryUtils apiCountryUtils = ApiCountryUtils.INSTANCE;
        if (com.yalla.support.common.util.OooO0OO.OooO00o(apiCountryUtils.getListModel())) {
            apiCountryUtils.init(new o00000O0(this));
        } else {
            this.f23423Ooooo00.addAll(apiCountryUtils.getListModel());
            this.f23421OoooOoO.setNewData(this.f23423Ooooo00);
            OooOoOO();
        }
        this.f23421OoooOoO.setEmptyText(R.string.no_data);
        this.f23421OoooOoO.setEmptyImageRes(R.drawable.ic_empty_message_system);
        this.f23420OoooOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f23420OoooOo0.setAdapter(this.f23421OoooOoO);
    }
}
