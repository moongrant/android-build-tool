package com.app.selectPicture.activity;

import OooO00o.OooO00o;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000OOo;
import com.app.selectPicture.model.FileModel;
import com.app.selectPicture.model.ImageModel;
import com.app.selectPicture.view.FixLinearLayoutManager;
import java.util.ArrayList;
import o0O0O00.o0ooOOo;
import p081o000OoO.Oooo000;
import p192o00o0O0.o0000;
import p192o00o0O0.o0000O00;
import p192o00o0O0.o0000O0O;
import p192o00o0O0.o0000Ooo;
import p194o00o0O0O.o0000OO0;
import p201o00o0OoO.o00;
import p202o00o0Ooo.o00oOoo;
import p203o00o0o.o000000O;
import p205o00o0o0O.o000O000;
import p400o0Oo0O.OooOOO;
import p400o0Oo0O.OooOOO0;
import p400o0Oo0O.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public class ShowImagesSelectActivity extends BaseFixOrientationActivity {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final /* synthetic */ int f12282Ooooo0o = 0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o00 f12284Oooo0oO;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f12286OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Oooo000 f12290OoooOO0;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public RecyclerView f12292OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public o0000OO0<ImageModel> f12293OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public FixLinearLayoutManager f12294OoooOoO;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public o000O000 f12296Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public FileModel f12297o000oOoO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ArrayList<ImageModel> f12285Oooo0oo = new ArrayList<>();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12283Oooo = 1;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f12288OoooO00 = 0;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f12287OoooO0 = false;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f12289OoooO0O = false;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f12291OoooOOO = 0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public o00oOoo f12295OoooOoo = new o00oOoo();

    public final boolean OooOOOo() {
        o00oOoo o00oooo2 = this.f12295OoooOoo;
        o00oooo2.OooO0OO();
        OooOOo0(this, 0, o00oooo2.f33233OooO0O0);
        return true;
    }

    public final void OooOOo() {
        StringBuilder sb = new StringBuilder();
        sb.append(getString(OooOOOO.select_picture_string_Selected));
        sb.append("(");
        o00oOoo o00oooo2 = this.f12295OoooOoo;
        o00oooo2.OooO0OO();
        sb.append(o00oooo2.f33233OooO0O0.size());
        sb.append("/");
        String strOooO00o = o0ooOOo.OooO00o(sb, this.f12283Oooo, ")");
        int iIndexOf = strOooO00o.indexOf("(") + 1;
        int iIndexOf2 = strOooO00o.indexOf("/");
        TextView textView = this.f12286OoooO;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strOooO00o);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-16721719), iIndexOf, iIndexOf2, 33);
        textView.setText(spannableStringBuilder);
    }

    public final void OooOOo0(Activity activity, int i, ArrayList arrayList) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("selectData", arrayList);
        activity.setResult(i, intent);
        activity.finish();
    }

    public final void OooOOoo(int i) {
        this.f12291OoooOOO = i;
        o00 o00Var = this.f12284Oooo0oO;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
        sbOooO0o0.append(this.f12291OoooOOO + 1);
        sbOooO0o0.append("/");
        sbOooO0o0.append(this.f12285Oooo0oo.size());
        o00Var.OooO0o0(sbOooO0o0.toString());
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        o000O000 o000o001 = this.f12296Ooooo00;
        if (o000o001 != null) {
            o000o001.OooO00o();
        }
    }

    @Override // com.app.selectPicture.activity.BaseFixOrientationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOOO.activity_show_images);
        o00 o00Var = new o00(this);
        this.f12284Oooo0oO = o00Var;
        o00Var.f33230OoooOoO = new o0000(this);
        o00Var.f33225OoooO0O.setVisibility(0);
        TextView textView = (TextView) findViewById(OooOOO0.activity_show_images_num);
        this.f12286OoooO = textView;
        textView.setVisibility(8);
        this.f12292OoooOOo = (RecyclerView) findViewById(OooOOO0.activity_show_images_recyclerView);
        new o000OOo().attachToRecyclerView(this.f12292OoooOOo);
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(this);
        this.f12294OoooOoO = fixLinearLayoutManager;
        fixLinearLayoutManager.setOrientation(0);
        this.f12292OoooOOo.setLayoutManager(this.f12294OoooOoO);
        this.f12292OoooOOo.addItemDecoration(new o000000O(this));
        this.f12292OoooOOo.addOnScrollListener(new o0000O00(this));
        this.f12297o000oOoO = (FileModel) getIntent().getParcelableExtra("currentImageFile");
        this.f12283Oooo = getIntent().getIntExtra("MaxCount", 1);
        ArrayList<ImageModel> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("selectData");
        this.f12288OoooO00 = getIntent().getIntExtra("File_Index", 0);
        this.f12287OoooO0 = getIntent().getBooleanExtra("IsTakePhoto", false);
        this.f12289OoooO0O = getIntent().getBooleanExtra("IsSupportGif", true);
        this.f12295OoooOoo.OooO0o0(parcelableArrayListExtra);
        o0000O0O o0000o0o2 = new o0000O0O(this, this, OooOOO.layout_show_image_select);
        this.f12293OoooOo0 = o0000o0o2;
        this.f12292OoooOOo.setAdapter(o0000o0o2);
        this.f12293OoooOo0.f33171OooO0O0 = this.f12285Oooo0oo;
        o000O000 o000o001 = new o000O000(this, true, this.f12289OoooO0O);
        this.f12296Ooooo00 = o000o001;
        o000o001.f33250OooO0Oo = true;
        o000o001.f33251OooO0o = new o0000Ooo(this);
        o000o001.f33248OooO0OO.postDelayed(o000o001.f33247OooO0O0, 0L);
        this.f12290OoooOO0 = new Oooo000();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 != i) {
            return super.onKeyDown(i, keyEvent);
        }
        OooOOOo();
        return true;
    }
}
