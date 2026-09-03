package com.yalantis.ucrop;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00000;
import com.yalantis.ucrop.model.CutInfo;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import p206o00o0o0o.o000O0O0;
import p400o0Oo0O.OooO;
import p400o0Oo0O.OooOOO;
import p400o0Oo0O.OooOOO0;
import p416o0Oo0oO0.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public class PictureMultiCuttingActivity extends UCropActivity {

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public String f20289o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public boolean f20290o000000O;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public int f20291o000OOo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f20292o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public ArrayList<CutInfo> f20293o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public RecyclerView f20294o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public OooO0o f20295o0Oo0oo;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f20296oo0o0Oo;

    @Override // com.yalantis.ucrop.UCropActivity
    public final void OooOo0O(Uri uri, float f, int i, int i2, int i3, int i4) {
        try {
            int size = this.f20293o0OO00O.size();
            int i5 = this.f20292o0O0O00;
            if (size < i5) {
                onBackPressed();
                return;
            }
            CutInfo cutInfo = this.f20293o0OO00O.get(i5);
            cutInfo.f20342Oooo0oo = uri.getPath();
            cutInfo.f20347OoooOO0 = true;
            cutInfo.f20348OoooOOO = f;
            cutInfo.f20345OoooO00 = i;
            cutInfo.f20344OoooO0 = i2;
            cutInfo.f20346OoooO0O = i3;
            cutInfo.f20343OoooO = i4;
            OooOoo0();
            int i6 = this.f20292o0O0O00 + 1;
            this.f20292o0O0O00 = i6;
            if (this.f20296oo0o0Oo && i6 < this.f20293o0OO00O.size() && o00oO0o.OooO00o(this.f20293o0OO00O.get(this.f20292o0O0O00).f20351o000oOoO)) {
                while (this.f20292o0O0O00 < this.f20293o0OO00O.size()) {
                    String str = this.f20293o0OO00O.get(this.f20292o0O0O00).f20351o000oOoO;
                    if (str != null && str.startsWith("image")) {
                        break;
                    } else {
                        this.f20292o0O0O00++;
                    }
                }
            }
            int i7 = this.f20292o0O0O00;
            this.f20291o000OOo = i7;
            if (i7 < this.f20293o0OO00O.size()) {
                OooOoO();
            } else {
                setResult(-1, new Intent().putExtra("UCrop.OutputUriList", this.f20293o0OO00O));
                onBackPressed();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooOoO() {
        String string;
        this.f20301OoooO.removeView(this.f20294o0OOO0o);
        View view = this.f20319Ooooooo;
        if (view != null) {
            this.f20301OoooO.removeView(view);
        }
        setContentView(OooOOO.ucrop_activity_photobox);
        this.f20301OoooO = (RelativeLayout) findViewById(OooOOO0.ucrop_photobox);
        OooOOOO();
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String str = this.f20293o0OO00O.get(this.f20292o0O0O00).f20341Oooo0oO;
        boolean zOooO0Oo = o00oO0o.OooO0Oo(str);
        String strOooO0O0 = o00oO0o.OooO0O0(str.startsWith("content://") ? p454o0Ooo0.OooOOO0.OooO0OO(this, Uri.parse(str)) : str);
        extras.putParcelable("UCrop.InputUri", (zOooO0Oo || str.startsWith("content://")) ? Uri.parse(str) : Uri.fromFile(new File(str)));
        File externalFilesDir = Environment.getExternalStorageState().equals("mounted") ? getExternalFilesDir(Environment.DIRECTORY_PICTURES) : getCacheDir();
        if (TextUtils.isEmpty(this.f20289o000000)) {
            StringBuilder sb = new StringBuilder();
            SimpleDateFormat simpleDateFormat = p454o0Ooo0.OooOOO0.f40366OooO00o;
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("IMG_");
            sbOooO0o0.append(p454o0Ooo0.OooOOO0.f40366OooO00o.format(Long.valueOf(jCurrentTimeMillis)));
            sb.append(sbOooO0o0.toString());
            sb.append(strOooO0O0);
            string = sb.toString();
        } else if (this.f20290o000000O) {
            string = this.f20289o000000;
        } else {
            String str2 = this.f20289o000000;
            SimpleDateFormat simpleDateFormat2 = p454o0Ooo0.OooOOO0.f40366OooO00o;
            String strSubstring = str2.substring(0, str2.lastIndexOf("."));
            String strSubstring2 = str2.substring(str2.lastIndexOf("."));
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(strSubstring);
            stringBuffer.append("_");
            stringBuffer.append(p454o0Ooo0.OooOOO0.f40366OooO00o.format(Long.valueOf(System.currentTimeMillis())));
            stringBuffer.append(strSubstring2);
            string = stringBuffer.toString();
        }
        extras.putParcelable("UCrop.OutputUri", Uri.fromFile(new File(externalFilesDir, string)));
        intent.putExtras(extras);
        OooOo(intent);
        OooOoOO();
        this.f20293o0OO00O.get(this.f20292o0O0O00).f20347OoooOO0 = true;
        this.f20295o0Oo0oo.notifyItemChanged(this.f20292o0O0O00);
        this.f20301OoooO.addView(this.f20294o0OOO0o);
        OooOoO0(this.f20304OoooO0O);
        ((RelativeLayout.LayoutParams) ((FrameLayout) findViewById(OooOOO0.ucrop_frame)).getLayoutParams()).addRule(2, OooOOO0.id_recycler);
        ((RelativeLayout.LayoutParams) this.f20294o0OOO0o.getLayoutParams()).addRule(2, OooOOO0.controls_wrapper);
        OooOOoo(intent);
        OooOo00();
        double dOooO00o = o000O0O0.OooO00o(60.0f) * this.f20292o0O0O00;
        int i = this.f20299Oooo0oO;
        if (dOooO00o > ((double) i) * 0.8d) {
            this.f20294o0OOO0o.scrollBy(o000O0O0.OooO00o(60.0f), 0);
        } else if (dOooO00o < ((double) i) * 0.4d) {
            this.f20294o0OOO0o.scrollBy(o000O0O0.OooO00o(-60.0f), 0);
        }
    }

    public final void OooOoO0(boolean z) {
        if (this.f20294o0OOO0o.getLayoutParams() == null) {
            return;
        }
        if (z) {
            ((RelativeLayout.LayoutParams) this.f20294o0OOO0o.getLayoutParams()).addRule(12, 0);
            ((RelativeLayout.LayoutParams) this.f20294o0OOO0o.getLayoutParams()).addRule(2, OooOOO0.wrapper_controls);
        } else {
            ((RelativeLayout.LayoutParams) this.f20294o0OOO0o.getLayoutParams()).addRule(12);
            ((RelativeLayout.LayoutParams) this.f20294o0OOO0o.getLayoutParams()).addRule(2, 0);
        }
    }

    public final void OooOoOO() {
        int size = this.f20293o0OO00O.size();
        for (int i = 0; i < size; i++) {
            this.f20293o0OO00O.get(i).f20347OoooOO0 = false;
        }
    }

    public final void OooOoo0() {
        int i;
        int size = this.f20293o0OO00O.size();
        if (size <= 1 || size <= (i = this.f20291o000OOo)) {
            return;
        }
        this.f20293o0OO00O.get(i).f20347OoooOO0 = false;
        this.f20295o0Oo0oo.notifyItemChanged(this.f20292o0O0O00);
    }

    @Override // com.yalantis.ucrop.UCropActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f20289o000000 = intent.getStringExtra("UCrop.RenameCropFileName");
        this.f20290o000000O = intent.getBooleanExtra("UCrop.isCamera", false);
        this.f20296oo0o0Oo = intent.getBooleanExtra("UCrop.isWithVideoImage", false);
        ArrayList<CutInfo> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("UCrop.cuts");
        this.f20293o0OO00O = parcelableArrayListExtra;
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.size() == 0) {
            onBackPressed();
            return;
        }
        if (this.f20293o0OO00O.size() > 1) {
            ArrayList<CutInfo> arrayList = this.f20293o0OO00O;
            if (arrayList == null || arrayList.size() == 0) {
                onBackPressed();
            } else {
                int size = this.f20293o0OO00O.size();
                if (this.f20296oo0o0Oo) {
                    for (int i = 0; i < size; i++) {
                        CutInfo cutInfo = this.f20293o0OO00O.get(i);
                        if (cutInfo != null) {
                            String str2 = cutInfo.f20351o000oOoO;
                            if (str2 != null && str2.startsWith("image")) {
                                this.f20292o0O0O00 = i;
                                break;
                            }
                        }
                    }
                }
                for (int i2 = 0; i2 < size; i2++) {
                    CutInfo cutInfo2 = this.f20293o0OO00O.get(i2);
                    if (o00oO0o.OooO0Oo(cutInfo2.f20341Oooo0oO)) {
                        String str3 = this.f20293o0OO00O.get(i2).f20341Oooo0oO;
                        String strOooO0O0 = o00oO0o.OooO0O0(str3);
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(strOooO0O0)) {
                            File externalFilesDir = Environment.getExternalStorageState().equals("mounted") ? getExternalFilesDir(Environment.DIRECTORY_PICTURES) : getCacheDir();
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("temporary_thumbnail_");
                            stringBuffer.append(i2);
                            stringBuffer.append(strOooO0O0);
                            File file = new File(externalFilesDir, stringBuffer.toString());
                            try {
                                if (TextUtils.isEmpty(str3)) {
                                    str = "image/jpeg";
                                } else {
                                    String name = new File(str3).getName();
                                    str = "image/" + name.substring(name.lastIndexOf(".") + 1);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            cutInfo2.f20351o000oOoO = str;
                            cutInfo2.f20350OoooOo0 = Uri.fromFile(file);
                        }
                    }
                }
            }
            boolean booleanExtra = getIntent().getBooleanExtra("UCrop.skip_multiple_crop", true);
            RecyclerView recyclerView = new RecyclerView(this);
            this.f20294o0OOO0o = recyclerView;
            int i3 = OooOOO0.id_recycler;
            recyclerView.setId(i3);
            this.f20294o0OOO0o.setBackgroundColor(o000O000.OooO00o.OooO0O0(this, OooO.ucrop_color_widget_background));
            this.f20294o0OOO0o.setLayoutParams(new RelativeLayout.LayoutParams(-1, o000O0O0.OooO00o(80.0f)));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setOrientation(0);
            this.f20294o0OOO0o.setLayoutManager(linearLayoutManager);
            ((o00000) this.f20294o0OOO0o.getItemAnimator()).f9140OooO0oO = false;
            OooOoOO();
            this.f20293o0OO00O.get(this.f20292o0O0O00).f20347OoooOO0 = true;
            OooO0o oooO0o = new OooO0o(this, this.f20293o0OO00O);
            this.f20295o0Oo0oo = oooO0o;
            this.f20294o0OOO0o.setAdapter(oooO0o);
            if (booleanExtra) {
                this.f20295o0Oo0oo.f20284OooO0Oo = new OooO00o(this);
            }
            this.f20301OoooO.addView(this.f20294o0OOO0o);
            OooOoO0(this.f20304OoooO0O);
            ((RelativeLayout.LayoutParams) ((FrameLayout) findViewById(OooOOO0.ucrop_frame)).getLayoutParams()).addRule(2, i3);
            ((RelativeLayout.LayoutParams) this.f20294o0OOO0o.getLayoutParams()).addRule(2, OooOOO0.controls_wrapper);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        OooO0o oooO0o = this.f20295o0Oo0oo;
        if (oooO0o != null) {
            oooO0o.f20284OooO0Oo = null;
        }
        super.onDestroy();
    }
}
