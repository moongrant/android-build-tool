package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import p519o0o0O0oO.O0000000;
import p528o0o0OOOo.oOO0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public class DeleteMusicActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ImageView f26518OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26519OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Button f26520OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o0O0O00 f26521OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public LinearLayout f26522OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f26523OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public O0000000 f26524OooOo0o;

    public static void OooOo0(DeleteMusicActivity deleteMusicActivity) {
        Iterator it = deleteMusicActivity.f26521OooOo0.f10111OooOOoo.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((MusicTable) it.next()).isSelect) {
                i++;
            }
        }
        deleteMusicActivity.OooOo0o(i);
    }

    public final void OooOo0O() {
        boolean z = !this.f26523OooOo0O;
        this.f26523OooOo0O = z;
        this.f26520OooOOoo.setEnabled(z);
        Iterator it = this.f26521OooOo0.f10111OooOOoo.iterator();
        while (it.hasNext()) {
            ((MusicTable) it.next()).isSelect = this.f26523OooOo0O;
        }
        this.f26521OooOo0.notifyDataSetChanged();
        OooOo0o(this.f26523OooOo0O ? this.f26521OooOo0.f10111OooOOoo.size() : 0);
    }

    public final void OooOo0o(int i) {
        this.f26520OooOOoo.setEnabled(i != 0);
        boolean z = i != 0 && i == this.f26521OooOo0.f10111OooOOoo.size();
        this.f26523OooOo0O = z;
        this.f26518OooOOo.setImageResource(z ? oOo00OO0.icon_music_selected : oOo00OO0.icon_music_unselect);
        String strOooO00o = i == 0 ? "" : OooO0OO.OooO00o.OooO00o("(", i, ")");
        this.f26520OooOOoo.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.delete) + strOooO00o);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        Iterator it = this.f26521OooOo0.f10111OooOOoo.iterator();
        while (it.hasNext()) {
            ((MusicTable) it.next()).isSelect = false;
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == oO00O0oO.iv_select_all) {
            OooOo0O();
            return;
        }
        if (id != oO00O0oO.bt_music_delete) {
            if (id == oO00O0oO.ll_select_all) {
                OooOo0O();
            }
        } else {
            p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(this);
            o0oo00o2.OooOOoo(oO00OOo0.Sure_delete_selected_music);
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOo0(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o0OO00O
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DeleteMusicActivity deleteMusicActivity = this.f26926OooO0Oo;
                    if (deleteMusicActivity.f26524OooOo0o == null) {
                        p519o0o0O0oO.o0O00O0o.OooO00o().getClass();
                        deleteMusicActivity.f26524OooOo0o = new O0000000();
                    }
                    deleteMusicActivity.f26524OooOo0o.OooO0OO(deleteMusicActivity, com.code.android.util.o0000.OooO0OO(oO00OOo0.Deleting));
                    ArrayList arrayList = new ArrayList();
                    for (T t : deleteMusicActivity.f26521OooOo0.f10111OooOOoo) {
                        if (t.isSelect) {
                            arrayList.add(t);
                        }
                    }
                    boolean z = oOO0.f54098OooO00o;
                    oOO0.OooO00o(arrayList);
                    deleteMusicActivity.runOnUiThread(new o000000(deleteMusicActivity));
                    return null;
                }
            });
            o0oo00o2.OooOO0o();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_delete_music);
        OooOOo0(2);
        this.f26519OooOOo0 = (RecyclerView) findViewById(oO00O0oO.rv_music);
        this.f26518OooOOo = (ImageView) findViewById(oO00O0oO.iv_select_all);
        this.f26520OooOOoo = (Button) findViewById(oO00O0oO.bt_music_delete);
        this.f26522OooOo00 = (LinearLayout) findViewById(oO00O0oO.ll_select_all);
        this.f26518OooOOo.setOnClickListener(this);
        this.f26520OooOOoo.setOnClickListener(this);
        this.f26522OooOo00.setOnClickListener(this);
        this.f26519OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        o0O0O00 o0o0o00 = new o0O0O00(this, oO00OO0O.item_music_delete);
        this.f26521OooOo0 = o0o0o00;
        o0o0o00.Oooo000(oO00OOo0.No_music_available);
        this.f26521OooOo0.OooOooo(oOo00OO0.icon_request_error_green);
        o0O0O00 o0o0o01 = this.f26521OooOo0;
        o0o0o01.f56197OooOoO.setEmptyTextColor(oO00O0o.white_50);
        o0O0O00 o0o0o02 = this.f26521OooOo0;
        o0o0o02.f10098OooO0o = new o000OOo(this);
        this.f26519OooOOo0.setAdapter(o0o0o02);
        MusicState.OooO00o().observe(this, new oo0o0Oo(this));
    }
}
