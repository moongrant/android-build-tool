package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.base.activity.BaseActivity;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Iterator;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p544o0o0OoOO.p3;
import p544o0o0OoOO.q3;
import p544o0o0OoOO.r3;
import p544o0o0OoOO.s3;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public class DeleteMusicActivity extends BaseActivity {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f22790OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public ImageView f22791OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public Button f22792OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public LinearLayout f22793Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<MusicTable> f22794Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f22795OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public o000O f22796OooooOO;

    public static void OooOoO(DeleteMusicActivity deleteMusicActivity) {
        Iterator<MusicTable> it = deleteMusicActivity.f22794Ooooo0o.getData().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().isSelect) {
                i++;
            }
        }
        deleteMusicActivity.OooOoo0(i);
    }

    public final void OooOoOO() {
        boolean z = !this.f22795OooooO0;
        this.f22795OooooO0 = z;
        this.f22792OoooOoo.setEnabled(z);
        Iterator<MusicTable> it = this.f22794Ooooo0o.getData().iterator();
        while (it.hasNext()) {
            it.next().isSelect = this.f22795OooooO0;
        }
        this.f22794Ooooo0o.notifyDataSetChanged();
        OooOoo0(this.f22795OooooO0 ? this.f22794Ooooo0o.getData().size() : 0);
    }

    public final void OooOoo0(int i) {
        boolean z = false;
        this.f22792OoooOoo.setEnabled(i != 0);
        if (i != 0 && i == this.f22794Ooooo0o.getData().size()) {
            z = true;
        }
        this.f22795OooooO0 = z;
        this.f22791OoooOoO.setImageResource(z ? R.drawable.icon_music_selected : R.drawable.icon_music_unselect);
        String strOooO00o = i == 0 ? "" : OooO0O0.OooO00o.OooO00o("(", i, ")");
        this.f22792OoooOoo.setText(o000O0O0.OooO0OO(R.string.delete) + strOooO00o);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        super.finish();
        Iterator<MusicTable> it = this.f22794Ooooo0o.getData().iterator();
        while (it.hasNext()) {
            it.next().isSelect = false;
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_select_all) {
            OooOoOO();
            return;
        }
        if (id != R.id.bt_music_delete) {
            if (id == R.id.ll_select_all) {
                OooOoOO();
            }
        } else {
            oo0oOO0 oo0ooo0 = new oo0oOO0(this);
            oo0ooo0.OooOo0(R.string.Sure_delete_selected_music);
            oo0ooo0.OooOoO();
            oo0ooo0.OooOo0o(new p3(this, 0));
            oo0ooo0.OooOOO0();
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_delete_music);
        OooOo0O(2);
        this.f22790OoooOo0 = (RecyclerView) findViewById(R.id.rv_music);
        this.f22791OoooOoO = (ImageView) findViewById(R.id.iv_select_all);
        this.f22792OoooOoo = (Button) findViewById(R.id.bt_music_delete);
        this.f22793Ooooo00 = (LinearLayout) findViewById(R.id.ll_select_all);
        this.f22791OoooOoO.setOnClickListener(this);
        this.f22792OoooOoo.setOnClickListener(this);
        this.f22793Ooooo00.setOnClickListener(this);
        this.f22790OoooOo0.setLayoutManager(new FixLinearLayoutManager(this));
        r3 r3Var = new r3(this);
        this.f22794Ooooo0o = r3Var;
        r3Var.setEmptyText(R.string.No_music_available);
        this.f22794Ooooo0o.setEmptyImageRes(R.drawable.icon_request_error_green);
        this.f22794Ooooo0o.setEmptyTextColor(R.color.white_50);
        this.f22794Ooooo0o.setOnItemClickListener(new s3(this));
        this.f22790OoooOo0.setAdapter(this.f22794Ooooo0o);
        MusicState musicState = MusicState.f21402OooO00o;
        MusicState.OooO00o().observe(this, new q3(this));
    }
}
