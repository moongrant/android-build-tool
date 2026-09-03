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
import p664o0oooOO.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
public class SelectMusicActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ImageView f26252OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26253OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o0oO0Ooo f26255OooOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ArrayList f26254OooOOoo = new ArrayList();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f26256OooOo00 = false;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SelectMusicActivity selectMusicActivity = SelectMusicActivity.this;
            selectMusicActivity.f26255OooOo0.notifyDataSetChanged();
            selectMusicActivity.f26255OooOo0.Oooo00o();
            selectMusicActivity.OooOo0();
        }
    }

    public final void OooOo0() {
        Iterator it = this.f26254OooOOoo.iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            if (((MusicSelecterModel) it.next()).select) {
                i++;
            }
        }
        if (i != 0 && i == this.f26254OooOOoo.size()) {
            z = true;
        }
        this.f26256OooOo00 = z;
        this.f26252OooOOo.setImageResource(z ? p562o0oOo000.o0Oo0oo.icon_music_selected : p562o0oOo000.o0Oo0oo.icon_music_unselect);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.ArrayList] */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, android.app.Activity
    public final void finish() {
        p545o0oO0O00.OooOOO oooOOO = new p545o0oO0O00.OooOOO();
        oooOOO.f55758OooO00o = 505;
        oooOOO.f55760OooO0OO = this.f26254OooOOoo;
        oO00O0o oo00o0oOooO00o = p545o0oO0O00.OooOo00.OooO00o();
        synchronized (oo00o0oOooO00o.f59844OooO0OO) {
            oo00o0oOooO00o.f59844OooO0OO.put(p545o0oO0O00.OooOOO.class, oooOOO);
        }
        oo00o0oOooO00o.OooO0Oo(oooOOO);
        super.finish();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_select_music);
        OooOOo0(2);
        this.f22282OooOO0.setTitle(p562o0oOo000.o000000.add_music);
        this.f22282OooOO0.OooOoO0(p562o0oOo000.o000000.Done, new o0O00OOO(this)).setTextColor(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_white_80));
        this.f26253OooOOo0 = (RecyclerView) findViewById(p562o0oOo000.o0OO00O.rv_select_music);
        this.f26252OooOOo = (ImageView) findViewById(p562o0oOo000.o0OO00O.iv_select_all);
        o0oO0Ooo o0oo0ooo2 = new o0oO0Ooo(this, p562o0oOo000.oo0o0Oo.item_music_delete, this.f26254OooOOoo);
        this.f26255OooOo0 = o0oo0ooo2;
        o0oo0ooo2.f13176OooO0o = new o0O00o00(this);
        this.f26253OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f26253OooOOo0.setAdapter(this.f26255OooOo0);
        OooOo0();
        ((LinearLayout) findViewById(p562o0oOo000.o0OO00O.ll_select_all)).setOnClickListener(new o0O00oO0(this));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p545o0oO0O00.OooOOOO
    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onEvent(p545o0oO0O00.OooOOO oooOOO) {
        if (oooOOO.f55758OooO00o != 504) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.f26254OooOOoo = arrayList;
        arrayList.addAll((List) oooOOO.f55760OooO0OO);
        runOnUiThread(new OooO00o());
    }
}
