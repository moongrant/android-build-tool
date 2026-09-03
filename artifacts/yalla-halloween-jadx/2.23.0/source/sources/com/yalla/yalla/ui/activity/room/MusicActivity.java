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
import p403o0Oo0OOo.oO0000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public class MusicActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f26579OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public RecyclerView f26580OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public EditText f26581OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Button f26582OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f26583OooOo = false;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ImageView f26584OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TextView f26585OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public o000OOo0 f26586OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public TextView f26587OooOo0o;

    public class OooO00o implements p599o0oo00oo.o0000O {
        @Override // p599o0oo00oo.o0000O
        public final void onActivityResult(int i, Intent intent) {
        }
    }

    public final void OooOo0(String str) {
        if (str.length() == 0) {
            this.f26585OooOo00.setVisibility(8);
            this.f26584OooOo0.setVisibility(8);
            this.f26586OooOo0O.OooOoO0((List) MusicState.OooO00o().getValue());
            this.f26586OooOo0O.Oooo00o();
            return;
        }
        this.f26585OooOo00.setVisibility(0);
        this.f26584OooOo0.setVisibility(0);
        oO0000O oo0000oOooOo = p581o0oOoo00.o000OOo.OooO00o().OooOo();
        String strOooO00o = p004OooO0oO.o000oOoO.OooO00o("%", str, "%");
        String strOooO00o2 = p004OooO0oO.o000oOoO.OooO00o("%", str, "%");
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        this.f26586OooOo0O.OooOoO0(oo0000oOooOo.OooO0oO(strOooO00o, strOooO00o2, String.valueOf(p464o0Oooo.o000000O.OooOOo0().getValue())));
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        EditText editText = this.f26581OooOOo0;
        InputMethodManager inputMethodManagerOooO00o = android.support.v4.media.session.OooO0o.OooO00o(editText, ViewHierarchyConstants.VIEW_KEY, "view.context");
        p367o0OOo0o0.OooOO0O.OooO00o(editText.getContext().getApplicationContext(), new Handler(), inputMethodManagerOooO00o, editText.getWindowToken(), 0);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == oO00O0oO.tv_search) {
            OooOo0(this.f26581OooOOo0.getText().toString());
            return;
        }
        if (id == oO00O0oO.iv_clear) {
            this.f26581OooOOo0.setText("");
        } else if (id == oO00O0oO.bt_musiclist_search) {
            p587o0oOooo.o0OO000.OooO00o("102144");
            p599o0oo00oo.o000OO o000oo2 = new p599o0oo00oo.o000OO(this);
            o000oo2.f56864OooO0O0 = SearchMusicActivity.class;
            o000oo2.OooO0O0(new OooO00o());
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_music_list);
        OooOOo0(2);
        OooOOoo(oO00OOo0.title_activity_music);
        this.f26581OooOOo0 = (EditText) findViewById(oO00O0oO.et_search_music);
        this.f26580OooOOo = (RecyclerView) findViewById(oO00O0oO.rv_music);
        this.f26582OooOOoo = (Button) findViewById(oO00O0oO.bt_musiclist_search);
        this.f26585OooOo00 = (TextView) findViewById(oO00O0oO.tv_search);
        this.f26584OooOo0 = (ImageView) findViewById(oO00O0oO.iv_clear);
        this.f26585OooOo00.setOnClickListener(this);
        this.f26584OooOo0.setOnClickListener(this);
        this.f26582OooOOoo.setOnClickListener(this);
        this.f26587OooOo0o = this.f22755OooOO0.OooOoO0(oO00OOo0.button_editor, new o000OO00(this));
        o000OOo0 o000ooo1 = new o000OOo0(this, oO00OO0O.item_music_name);
        this.f26586OooOo0O = o000ooo1;
        o000ooo1.Oooo00O(false);
        this.f26586OooOo0O.Oooo000(oO00OOo0.No_music_available);
        this.f26586OooOo0O.OooOooo(oOo00OO0.icon_request_error_green);
        o000OOo0 o000ooo2 = this.f26586OooOo0O;
        o000ooo2.f56197OooOoO.setEmptyTextColor(oO00O0o.white_50);
        this.f26580OooOOo.setLayoutManager(new FixLinearLayoutManager(this));
        this.f26580OooOOo.setAdapter(this.f26586OooOo0O);
        o000OOo0 o000ooo3 = this.f26586OooOo0O;
        o000ooo3.f10098OooO0o = new o00(this);
        o000ooo3.f10100OooO0oO = new o00O0000(this);
        this.f26581OooOOo0.addTextChangedListener(new o0O0ooO(this));
        MusicState.OooO00o().observe(this, new o000O0Oo(this));
        MusicState.f22835OooO00o.observe(this, new o000OO0O(this));
        MusicState.f22836OooO0O0.observe(this, new o000O0O0(this));
        if (getIntent() != null && getIntent().hasExtra("MusicActivity_IsAddMusic")) {
            this.f26583OooOo = getIntent().getBooleanExtra("MusicActivity_IsAddMusic", false);
        }
        if (this.f26583OooOo) {
            p599o0oo00oo.o000OO o000oo2 = new p599o0oo00oo.o000OO(this);
            o000oo2.f56864OooO0O0 = SearchMusicActivity.class;
            o000oo2.OooO0O0(new o000O());
        }
    }
}
