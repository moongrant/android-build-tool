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
import p535o0o0Oo0.oO0O00;
import p650o0ooo.a;

/* JADX INFO: loaded from: classes4.dex */
public class DeleteMusicActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ImageView f26066OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26067OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Button f26068OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o0O0O00 f26069OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public LinearLayout f26070OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f26071OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public a f26072OooOo0o;

    public static void OooOo0(DeleteMusicActivity deleteMusicActivity) {
        Iterator it = deleteMusicActivity.f26069OooOo0.f13189OooOOoo.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((MusicTable) it.next()).isSelect) {
                i++;
            }
        }
        deleteMusicActivity.OooOo0o(i);
    }

    public final void OooOo0O() {
        boolean z = !this.f26071OooOo0O;
        this.f26071OooOo0O = z;
        this.f26068OooOOoo.setEnabled(z);
        Iterator it = this.f26069OooOo0.f13189OooOOoo.iterator();
        while (it.hasNext()) {
            ((MusicTable) it.next()).isSelect = this.f26071OooOo0O;
        }
        this.f26069OooOo0.notifyDataSetChanged();
        OooOo0o(this.f26071OooOo0O ? this.f26069OooOo0.f13189OooOOoo.size() : 0);
    }

    public final void OooOo0o(int i) {
        this.f26068OooOOoo.setEnabled(i != 0);
        boolean z = i != 0 && i == this.f26069OooOo0.f13189OooOOoo.size();
        this.f26071OooOo0O = z;
        this.f26066OooOOo.setImageResource(z ? p562o0oOo000.o0Oo0oo.icon_music_selected : p562o0oOo000.o0Oo0oo.icon_music_unselect);
        String strOooO00o = i == 0 ? "" : OooO0OO.OooO00o.OooO00o("(", i, ")");
        this.f26068OooOOoo.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.delete) + strOooO00o);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        Iterator it = this.f26069OooOo0.f13189OooOOoo.iterator();
        while (it.hasNext()) {
            ((MusicTable) it.next()).isSelect = false;
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == p562o0oOo000.o0OO00O.iv_select_all) {
            OooOo0O();
            return;
        }
        if (id != p562o0oOo000.o0OO00O.bt_music_delete) {
            if (id == p562o0oOo000.o0OO00O.ll_select_all) {
                OooOo0O();
            }
        } else {
            p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this);
            o000o.OooOOoo(p562o0oOo000.o000000.Sure_delete_selected_music);
            o000o.OooOo(true);
            o000o.OooOo0(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o0OO00O
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DeleteMusicActivity deleteMusicActivity = this.f26472OooO0Oo;
                    if (deleteMusicActivity.f26072OooOo0o == null) {
                        p650o0ooo.o00O0OO0.OooO00o().getClass();
                        deleteMusicActivity.f26072OooOo0o = new a();
                    }
                    deleteMusicActivity.f26072OooOo0o.OooO0OO(deleteMusicActivity, com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Deleting));
                    ArrayList arrayList = new ArrayList();
                    for (T t : deleteMusicActivity.f26069OooOo0.f13189OooOOoo) {
                        if (t.isSelect) {
                            arrayList.add(t);
                        }
                    }
                    boolean z = oO0O00.f53970OooO00o;
                    oO0O00.OooO00o(arrayList);
                    deleteMusicActivity.runOnUiThread(new o000000(deleteMusicActivity));
                    return null;
                }
            });
            o000o.OooOO0o();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_delete_music);
        OooOOo0(2);
        this.f26067OooOOo0 = (RecyclerView) findViewById(p562o0oOo000.o0OO00O.rv_music);
        this.f26066OooOOo = (ImageView) findViewById(p562o0oOo000.o0OO00O.iv_select_all);
        this.f26068OooOOoo = (Button) findViewById(p562o0oOo000.o0OO00O.bt_music_delete);
        this.f26070OooOo00 = (LinearLayout) findViewById(p562o0oOo000.o0OO00O.ll_select_all);
        this.f26066OooOOo.setOnClickListener(this);
        this.f26068OooOOoo.setOnClickListener(this);
        this.f26070OooOo00.setOnClickListener(this);
        this.f26067OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        o0O0O00 o0o0o00 = new o0O0O00(this, p562o0oOo000.oo0o0Oo.item_music_delete);
        this.f26069OooOo0 = o0o0o00;
        o0o0o00.Oooo000(p562o0oOo000.o000000.No_music_available);
        this.f26069OooOo0.OooOooo(p562o0oOo000.o0Oo0oo.icon_request_error_green);
        o0O0O00 o0o0o01 = this.f26069OooOo0;
        o0o0o01.f56424OooOoO.setEmptyTextColor(p562o0oOo000.o0OOO0o.white_50);
        o0O0O00 o0o0o02 = this.f26069OooOo0;
        o0o0o02.f13176OooO0o = new o000OOo(this);
        this.f26067OooOOo0.setAdapter(o0o0o02);
        MusicState.OooO00o().observe(this, new oo0o0Oo(this));
    }
}
