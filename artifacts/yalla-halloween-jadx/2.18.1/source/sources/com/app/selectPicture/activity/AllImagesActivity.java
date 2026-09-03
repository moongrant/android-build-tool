package com.app.selectPicture.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.selectPicture.activity.AllImagesActivity;
import com.app.selectPicture.model.FileModel;
import com.app.selectPicture.model.ImageModel;
import com.app.selectPicture.model.SelectImageData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p081o000OoO.Oooo000;
import p192o00o0O0.o00000;
import p192o00o0O0.o00oO0o;
import p192o00o0O0.o0OOO0o;
import p192o00o0O0.o0ooOOo;
import p193o00o0O00.Oooo0;
import p195o00o0OO.o00O000;
import p196o00o0OO0.o00000O0;
import p201o00o0OoO.o000OO00;
import p202o00o0Ooo.o0O0ooO;
import p205o00o0o0O.o000O000;
import p206o00o0o0o.o000O00O;
import p400o0Oo0O.OooOOO;
import p400o0Oo0O.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public class AllImagesActivity extends BaseFixOrientationActivity {

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final /* synthetic */ int f12251ooOO = 0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Oooo000 f12253Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o0O0ooO f12254Oooo0oo;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public o000OO00 f12259OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public ListView f12260OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public o00000O0 f12261OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f12262OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public o00O000 f12263OoooOoO;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public FileModel f12265Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ArrayList<ImageModel> f12266Ooooo0o;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public SelectImageData f12273Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public LinearLayout f12274o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public o000O000 f12275o0OoOo0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12252Oooo = 1;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f12257OoooO00 = false;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f12256OoooO0 = false;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f12258OoooO0O = 1.0f;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f12255OoooO = 1.0f;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ArrayList<ImageModel> f12264OoooOoo = new ArrayList<>();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f12267OooooO0 = 0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f12268OooooOO = true;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f12269OooooOo = false;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f12271Oooooo0 = false;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f12270Oooooo = 3;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f12272OoooooO = true;

    public final ArrayList<Uri> OooOOOo(ArrayList<ImageModel> arrayList, Uri uri) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator<ImageModel> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().f12326o000oOoO);
            }
        }
        if (uri != null) {
            arrayList2.add(uri);
        }
        return o000O00O.OooO00o(arrayList2);
    }

    public final void OooOOo() {
        o00O000 o00o001 = this.f12263OoooOoO;
        if (o00o001 == null || o00o001.OooO0OO() == null || this.f12263OoooOoO.OooO0OO().isEmpty()) {
            this.f12259OoooOO0.f33225OoooO0O.setClickable(false);
            o000OO00 o000oo01 = this.f12259OoooOO0;
            o000oo01.f33225OoooO0O.setTextColor(o000oo01.f33229OoooOo0.f33167OooOoO);
        } else {
            this.f12259OoooOO0.f33225OoooO0O.setClickable(true);
            o000OO00 o000oo02 = this.f12259OoooOO0;
            o000oo02.f33225OoooO0O.setTextColor(o000oo02.f33229OoooOo0.f33168OooOoO0);
        }
    }

    public final void OooOOo0(int i) {
        if (this.f12254Oooo0oo.OooO0O0() == null || i >= this.f12254Oooo0oo.OooO0O0().size()) {
            return;
        }
        this.f12267OooooO0 = i;
        FileModel fileModel = this.f12254Oooo0oo.OooO0O0().get(this.f12267OooooO0);
        this.f12265Ooooo00 = fileModel;
        this.f12266Ooooo0o = this.f12253Oooo0oO.OooO0OO(fileModel, this.f12254Oooo0oo.OooO00o());
        o000OO00 o000oo01 = this.f12259OoooOO0;
        String title = this.f12265Ooooo00.f12309Oooo0oo + "(" + this.f12265Ooooo00.f12306Oooo + ")";
        Objects.requireNonNull(o000oo01);
        Intrinsics.checkNotNullParameter(title, "title");
        if (o000oo01.f33220OoooOoo) {
            o000oo01.OooO0o0(title);
        } else if (TextUtils.isEmpty(title)) {
            o000oo01.f33231o000oOoO.setVisibility(8);
        } else {
            o000oo01.f33222OoooO.setVisibility(8);
            o000oo01.f33226OoooOO0.setVisibility(0);
            o000oo01.f33231o000oOoO.setVisibility(0);
            o000oo01.f33231o000oOoO.setText(title);
        }
        this.f12261OoooOOo.OooO0O0(this.f12254Oooo0oo.OooO0O0());
        this.f12263OoooOoO.OooO0Oo(this.f12266Ooooo0o, this.f12265Ooooo00);
        this.f12263OoooOoO.OooO0o0(this.f12264OoooOoo);
    }

    public final void OooOOoo(boolean z) {
        this.f12259OoooOO0.OooO0oO(z);
        if (z) {
            this.f12274o000oOoO.setVisibility(0);
        } else {
            this.f12274o000oOoO.setVisibility(8);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        o000O000 o000o001 = this.f12275o0OoOo0;
        if (o000o001 != null) {
            o000o001.OooO00o();
        }
        Oooo0.f33131OooO0O0 = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        SelectImageData selectImageData = new SelectImageData();
        selectImageData.f12327Oooo0o = OooOOOo(this.f12263OoooOoO.OooO0OO(), null);
        intent.putExtra("selectData", selectImageData);
        setResult(-1, intent);
        Function1<? super SelectImageData, Unit> function1 = Oooo0.f33131OooO0O0;
        if (function1 != null) {
            function1.invoke(selectImageData);
        }
        Oooo0.f33131OooO0O0 = null;
        finish();
    }

    @Override // com.app.selectPicture.activity.BaseFixOrientationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOOO.activity_all_images);
        this.f12259OoooOO0 = new o000OO00(this);
        this.f12262OoooOo0 = (RecyclerView) findViewById(OooOOO0.activity_all_images_recyclerView);
        this.f12260OoooOOO = (ListView) findViewById(OooOOO0.activity_all_images_listView);
        LinearLayout linearLayout = (LinearLayout) findViewById(OooOOO0.activity_all_images_listView_layout);
        this.f12274o000oOoO = linearLayout;
        linearLayout.setVisibility(8);
        this.f12259OoooOO0.f33230OoooOoO = new o0ooOOo(this);
        OooOOo();
        OooOOoo(false);
        this.f12252Oooo = getIntent().getIntExtra("MaxCount", 1);
        this.f12257OoooO00 = getIntent().getBooleanExtra("IsTakePhoto", false);
        this.f12256OoooO0 = getIntent().getBooleanExtra("IsClipPhoto", false);
        this.f12258OoooO0O = getIntent().getFloatExtra("ClipWidthRatio", 1.0f);
        this.f12255OoooO = getIntent().getFloatExtra("ClipHeightRatio", 1.0f);
        this.f12269OooooOo = getIntent().getBooleanExtra("IsSupportGif", false);
        this.f12271Oooooo0 = getIntent().getBooleanExtra("IsSupportGifClip", false);
        this.f12272OoooooO = getIntent().getBooleanExtra("clipType", false);
        SelectImageData selectImageData = (SelectImageData) getIntent().getParcelableExtra("selectData");
        this.f12273Ooooooo = selectImageData;
        if (selectImageData == null) {
            this.f12273Ooooooo = new SelectImageData();
        }
        SelectImageData selectImageData2 = this.f12273Ooooooo;
        selectImageData2.f12327Oooo0o = o000O00O.OooO00o(selectImageData2.OooO00o());
        this.f12259OoooOO0.f33225OoooO0O.setVisibility(8);
        if (this.f12252Oooo > 1) {
            this.f12259OoooOO0.f33225OoooO0O.setVisibility(0);
        }
        o00000O0 o00000o1 = new o00000O0(this, this.f12259OoooOO0);
        this.f12261OoooOOo = o00000o1;
        this.f12260OoooOOO.setAdapter((ListAdapter) o00000o1);
        this.f12260OoooOOO.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o00o0O0.oo000o
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AllImagesActivity allImagesActivity = this.f33106Oooo0o;
                int i2 = AllImagesActivity.f12251ooOO;
                allImagesActivity.OooOOoo(false);
                allImagesActivity.OooOOo0(i);
                allImagesActivity.f12262OoooOo0.smoothScrollToPosition(0);
            }
        });
        this.f12262OoooOo0.setLayoutManager(new GridLayoutManager(this, this.f12270Oooooo));
        o00O000 o00o001 = new o00O000(this, this.f12252Oooo, this.f12257OoooO00, this.f12256OoooO0);
        this.f12263OoooOoO = o00o001;
        o00o001.f33184OooOO0o = this.f12270Oooooo;
        o00o001.f33183OooOO0O = new o00000(this);
        o00o001.f33181OooO0oo = true;
        o00o001.f33173OooO = false;
        o00o001.f33178OooO0o = new o0OOO0o(this);
        this.f12262OoooOo0.setAdapter(o00o001);
        o000O000 o000o001 = new o000O000(this, this.f12268OooooOO, this.f12269OooooOo);
        this.f12275o0OoOo0 = o000o001;
        o000o001.f33251OooO0o = new o00oO0o(this);
        o000o001.f33248OooO0OO.postDelayed(o000o001.f33247OooO0O0, 0L);
        this.f12253Oooo0oO = new Oooo000();
    }

    public void onGoneListView(View view) {
        this.f12274o000oOoO.setVisibility(8);
    }
}
