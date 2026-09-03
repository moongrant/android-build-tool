package com.yalla.yalla.ui.activity.room;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MusicActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f26127OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RecyclerView f26128OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public EditText f26129OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Button f26130OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f26131OooOo = false;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ImageView f26132OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TextView f26133OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o000O f26134OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TextView f26135OooOo0o;

    public class OooO00o implements p604o0oo0O0.Oooo000 {
        @Override // p604o0oo0O0.Oooo000
        public final void onActivityResult(int i, Intent intent) {
        }
    }

    public final void OooOo0(String str) {
        if (str.length() == 0) {
            this.f26133OooOo00.setVisibility(8);
            this.f26132OooOo0.setVisibility(8);
            this.f26134OooOo0O.OooOoO0((List) MusicState.OooO00o().getValue());
            this.f26134OooOo0O.Oooo00o();
            return;
        }
        this.f26133OooOo00.setVisibility(0);
        this.f26132OooOo0.setVisibility(0);
        p407o0Oo0Oo.oo00oO oo00ooOooOoO0 = p408o0Oo0Oo0.o00Oo0.OooO00o().OooOoO0();
        String strOooO0O0 = p004OooO0oO.o000oOoO.OooO0O0("%", str, "%");
        String strOooO0O1 = p004OooO0oO.o000oOoO.OooO0O0("%", str, "%");
        p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
        this.f26134OooOo0O.OooOoO0(oo00ooOooOoO0.OooO0oO(strOooO0O0, strOooO0O1, String.valueOf(p475o0Ooooo0.o0O00oO0.OooOOo0().getValue())));
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        EditText editText = this.f26129OooOOo0;
        InputMethodManager inputMethodManagerOooO00o = p371o0OOo0oO.o00O0O.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "getContext(...)");
        kotlin.collections.OooO00o.OooO0O0(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == p562o0oOo000.o0OO00O.tv_search) {
            OooOo0(this.f26129OooOOo0.getText().toString());
            return;
        }
        if (id == p562o0oOo000.o0OO00O.iv_clear) {
            this.f26129OooOOo0.setText("");
        } else if (id == p562o0oOo000.o0OO00O.bt_musiclist_search) {
            o0oo0000.OooO00o.OooO0O0("102144");
            p604o0oo0O0.OooOo oooOo = new p604o0oo0O0.OooOo(this);
            oooOo.f57388OooO0O0 = SearchMusicActivity.class;
            oooOo.OooO0O0(new OooO00o());
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_music_list);
        OooOOo0(2);
        OooOOoo(p562o0oOo000.o000000.title_activity_music);
        this.f26129OooOOo0 = (EditText) findViewById(p562o0oOo000.o0OO00O.et_search_music);
        this.f26128OooOOo = (RecyclerView) findViewById(p562o0oOo000.o0OO00O.rv_music);
        this.f26130OooOOoo = (Button) findViewById(p562o0oOo000.o0OO00O.bt_musiclist_search);
        this.f26133OooOo00 = (TextView) findViewById(p562o0oOo000.o0OO00O.tv_search);
        this.f26132OooOo0 = (ImageView) findViewById(p562o0oOo000.o0OO00O.iv_clear);
        this.f26133OooOo00.setOnClickListener(this);
        this.f26132OooOo0.setOnClickListener(this);
        this.f26130OooOOoo.setOnClickListener(this);
        this.f26135OooOo0o = this.f22282OooOO0.OooOoO0(p562o0oOo000.o000000.button_editor, new o000O0O0(this));
        o000O o000o = new o000O(this, p562o0oOo000.oo0o0Oo.item_music_name);
        this.f26134OooOo0O = o000o;
        o000o.Oooo00O(false);
        this.f26134OooOo0O.Oooo000(p562o0oOo000.o000000.No_music_available);
        this.f26134OooOo0O.OooOooo(p562o0oOo000.o0Oo0oo.icon_request_error_green);
        o000O o000o2 = this.f26134OooOo0O;
        o000o2.f56424OooOoO.setEmptyTextColor(p562o0oOo000.o0OOO0o.white_50);
        this.f26128OooOOo.setLayoutManager(new FixLinearLayoutManager(this));
        this.f26128OooOOo.setAdapter(this.f26134OooOo0O);
        o000O o000o3 = this.f26134OooOo0O;
        o000o3.f13176OooO0o = new o000OO00(this);
        o000o3.f13178OooO0oO = new o000OOo0(this);
        this.f26129OooOOo0.addTextChangedListener(new o00(this));
        MusicState.OooO00o().observe(this, new o000O00O(this));
        MusicState.f22362OooO00o.observe(this, new o000O0(this));
        MusicState.f22363OooO0O0.observe(this, new o000O0Oo(this));
        if (getIntent() != null && getIntent().hasExtra("MusicActivity_IsAddMusic")) {
            this.f26131OooOo = getIntent().getBooleanExtra("MusicActivity_IsAddMusic", false);
        }
        if (this.f26131OooOo) {
            p604o0oo0O0.OooOo oooOo = new p604o0oo0O0.OooOo(this);
            oooOo.f57388OooO0O0 = SearchMusicActivity.class;
            oooOo.OooO0O0(new o000OO0O());
        }
    }
}
