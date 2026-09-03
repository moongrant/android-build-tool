package com.yalla.yalla.ui.activity.room;

import Oooo000.o00O0O;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.base.activity.BaseActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import p025Oooo0O0.o000O0Oo;
import p391o0OOooOo.o0O00000;
import p544o0o0OoOO.d5;
import p544o0o0OoOO.e5;
import p544o0o0OoOO.f5;
import p544o0o0OoOO.g5;
import p544o0o0OoOO.h5;
import p544o0o0OoOO.i5;
import p544o0o0OoOO.j5;
import p544o0o0OoOO.k5;
import p544o0o0OoOO.l5;
import p620o0oo0o0O.o00O00OO;
import p620o0oo0o0O.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
public class MusicActivity extends BaseActivity {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final /* synthetic */ int f22903Oooooo0 = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public EditText f22904OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public RecyclerView f22905OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public Button f22906OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TextView f22907Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ImageView f22908Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<MusicTable> f22909OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public TextView f22910OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f22911OooooOo = false;

    public class OooO00o implements o00O00o0 {
        @Override // p620o0oo0o0O.o00O00o0
        public final void onActivityResult(int i, Intent intent) {
        }
    }

    public final void OooOoO(String str) {
        if (str.length() != 0) {
            this.f22907Ooooo00.setVisibility(0);
            this.f22908Ooooo0o.setVisibility(0);
            this.f22909OooooO0.setNewData(p491o0o00O00.OooO0OO.OooO00o().OooOoO().OooO0Oo(OooO0o.OooO0OO.OooO00o("%", str, "%"), OooO0o.OooO0OO.OooO00o("%", str, "%"), String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue())));
            return;
        }
        this.f22907Ooooo00.setVisibility(8);
        this.f22908Ooooo0o.setVisibility(8);
        MusicState musicState = MusicState.f21402OooO00o;
        this.f22909OooooO0.setNewData((List) MusicState.OooO00o().getValue());
        this.f22909OooooO0.setLoadComplete();
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        EditText editText = this.f22904OoooOo0;
        o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editText.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editText, "view.context"), new Handler()));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tv_search) {
            OooOoO(this.f22904OoooOo0.getText().toString());
            return;
        }
        if (id == R.id.iv_clear) {
            this.f22904OoooOo0.setText("");
        } else if (id == R.id.bt_musiclist_search) {
            o0O00000.OooO0OO("InRoom_music_local");
            o00O00OO o00o00oo2 = new o00O00OO(this);
            o00o00oo2.f48618OooO0O0 = SearchMusicActivity.class;
            o00o00oo2.OooO0O0(new OooO00o());
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_music_list);
        o0O00000.OooO0OO("InRoom_music_mymusic");
        OooOo0O(2);
        OooOo(R.string.title_activity_music);
        this.f22904OoooOo0 = (EditText) findViewById(R.id.et_search_music);
        this.f22905OoooOoO = (RecyclerView) findViewById(R.id.rv_music);
        this.f22906OoooOoo = (Button) findViewById(R.id.bt_musiclist_search);
        this.f22907Ooooo00 = (TextView) findViewById(R.id.tv_search);
        this.f22908Ooooo0o = (ImageView) findViewById(R.id.iv_clear);
        this.f22907Ooooo00.setOnClickListener(this);
        this.f22908Ooooo0o.setOnClickListener(this);
        this.f22906OoooOoo.setOnClickListener(this);
        this.f22910OooooOO = this.f11463OoooO.OooOoo0(R.string.button_editor, new h5(this));
        i5 i5Var = new i5(this);
        this.f22909OooooO0 = i5Var;
        i5Var.setFirstLoading(false);
        this.f22909OooooO0.setEmptyText(R.string.No_music_available);
        this.f22909OooooO0.setEmptyImageRes(R.drawable.icon_request_error_green);
        this.f22909OooooO0.setEmptyTextColor(R.color.white_50);
        this.f22905OoooOoO.setLayoutManager(new FixLinearLayoutManager(this));
        this.f22905OoooOoO.setAdapter(this.f22909OooooO0);
        this.f22909OooooO0.setOnItemClickListener(new j5(this));
        this.f22909OooooO0.setOnItemLongClickListener(new k5(this));
        this.f22904OoooOo0.addTextChangedListener(new l5(this));
        MusicState musicState = MusicState.f21402OooO00o;
        MusicState.OooO00o().observe(this, new d5(this));
        MusicState.f21403OooO0O0.observe(this, new e5(this));
        MusicState.f21404OooO0OO.observe(this, new f5(this));
        if (getIntent() != null && getIntent().hasExtra("MusicActivity_IsAddMusic")) {
            this.f22911OooooOo = getIntent().getBooleanExtra("MusicActivity_IsAddMusic", false);
        }
        if (this.f22911OooooOo) {
            o00O00OO o00o00oo2 = new o00O00OO(this);
            o00o00oo2.f48618OooO0O0 = SearchMusicActivity.class;
            o00o00oo2.OooO0O0(new g5());
        }
    }
}
