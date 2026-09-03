package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.MusicSelecterModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public class SelectMusicActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ImageView f26706OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26707OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o0O0OOO0 f26709OooOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ArrayList f26708OooOOoo = new ArrayList();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f26710OooOo00 = false;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SelectMusicActivity selectMusicActivity = SelectMusicActivity.this;
            selectMusicActivity.f26709OooOo0.notifyDataSetChanged();
            selectMusicActivity.f26709OooOo0.Oooo00o();
            selectMusicActivity.OooOo0();
        }
    }

    public final void OooOo0() {
        Iterator it = this.f26708OooOOoo.iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            if (((MusicSelecterModel) it.next()).select) {
                i++;
            }
        }
        if (i != 0 && i == this.f26708OooOOoo.size()) {
            z = true;
        }
        this.f26710OooOo00 = z;
        this.f26706OooOOo.setImageResource(z ? oOo00OO0.icon_music_selected : oOo00OO0.icon_music_unselect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.ArrayList] */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        p418o0OoO000.OooOo oooOo = new p418o0OoO000.OooOo();
        oooOo.f45532OooO00o = 505;
        oooOo.f45534OooO0OO = this.f26708OooOOoo;
        p660o0oooO0O.o00OOO00 o00ooo00OooO0O0 = com.squareup.okhttp.OooOo.OooO0O0();
        synchronized (o00ooo00OooO0O0.f60269OooO0OO) {
            o00ooo00OooO0O0.f60269OooO0OO.put(p418o0OoO000.OooOo.class, oooOo);
        }
        o00ooo00OooO0O0.OooO0Oo(oooOo);
        super.finish();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_select_music);
        OooOOo0(2);
        this.f22755OooOO0.setTitle(oO00OOo0.add_music);
        this.f22755OooOO0.OooOoO0(oO00OOo0.Done, new o0O0OO0(this)).setTextColor(com.code.android.util.o0000.OooO00o(oO00O0o.color_white_80));
        this.f26707OooOOo0 = (RecyclerView) findViewById(oO00O0oO.rv_select_music);
        this.f26706OooOOo = (ImageView) findViewById(oO00O0oO.iv_select_all);
        o0O0OOO0 o0o0ooo0 = new o0O0OOO0(this, oO00OO0O.item_music_delete, this.f26708OooOOoo);
        this.f26709OooOo0 = o0o0ooo0;
        o0o0ooo0.f10098OooO0o = new o0O0OOOo(this);
        this.f26707OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f26707OooOOo0.setAdapter(this.f26709OooOo0);
        OooOo0();
        ((LinearLayout) findViewById(oO00O0oO.ll_select_all)).setOnClickListener(new oo0OOoo(this));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p418o0OoO000.Oooo000
    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onEvent(p418o0OoO000.OooOo oooOo) {
        if (oooOo.f45532OooO00o != 504) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f26708OooOOoo = arrayList;
        arrayList.addAll((List) oooOo.f45534OooO0OO);
        runOnUiThread(new OooO00o());
    }
}
