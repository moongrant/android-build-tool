package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.MusicSelecterModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p034OoooO0O.o0Oo0oo;
import p544o0o0OoOO.a7;
import p544o0o0OoOO.b7;
import p544o0o0OoOO.y6;
import p544o0o0OoOO.z6;

/* JADX INFO: loaded from: classes2.dex */
public class SelectMusicActivity extends BaseActivity {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f23026OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public ImageView f23027OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public List<MusicSelecterModel> f23028OoooOoo = new ArrayList();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f23029Ooooo00 = false;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<MusicSelecterModel> f23030Ooooo0o;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SelectMusicActivity.this.f23030Ooooo0o.notifyDataSetChanged();
            SelectMusicActivity.this.f23030Ooooo0o.setLoadComplete();
            SelectMusicActivity.this.OooOoOO();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.app.base.model.MusicSelecterModel>] */
    public final void OooOoO(int i) {
        boolean z = i != 0 && i == this.f23028OoooOoo.size();
        this.f23029Ooooo00 = z;
        this.f23027OoooOoO.setImageResource(z ? R.drawable.icon_music_selected : R.drawable.icon_music_unselect);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.MusicSelecterModel>] */
    public final void OooOoOO() {
        Iterator it = this.f23028OoooOoo.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((MusicSelecterModel) it.next()).select) {
                i++;
            }
        }
        OooOoO(i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.List<com.app.base.model.MusicSelecterModel>] */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        p140o00OOOoO.OooO0OO oooO0OO = new p140o00OOOoO.OooO0OO();
        oooO0OO.f31885OooO00o = 505;
        oooO0OO.f31887OooO0OO = this.f23028OoooOoo;
        o0Oo0oo.OooO0oO(oooO0OO);
        super.finish();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_select_music);
        OooOo0O(2);
        this.f11463OoooO.setTitle(R.string.add_music);
        this.f11463OoooO.OooOoo0(R.string.Done, new y6(this)).setTextColor(com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_white_80));
        this.f23026OoooOo0 = (RecyclerView) findViewById(R.id.rv_select_music);
        this.f23027OoooOoO = (ImageView) findViewById(R.id.iv_select_all);
        z6 z6Var = new z6(this, this.f23028OoooOoo);
        this.f23030Ooooo0o = z6Var;
        z6Var.setOnItemClickListener(new a7(this));
        this.f23026OoooOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f23026OoooOo0.setAdapter(this.f23030Ooooo0o);
        OooOoOO();
        ((LinearLayout) findViewById(R.id.ll_select_all)).setOnClickListener(new b7(this));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, p140o00OOOoO.OooO0o
    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onEvent(p140o00OOOoO.OooO0OO oooO0OO) {
        if (oooO0OO.f31885OooO00o != 504) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f23028OoooOoo = arrayList;
        arrayList.addAll((List) oooO0OO.f31887OooO0OO);
        runOnUiThread(new OooO00o());
    }
}
