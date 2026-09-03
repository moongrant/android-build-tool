package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.base.activity.BaseActivity;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Map;
import p133o00OO00o.o000oOoO;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p544o0o0OoOO.c7;
import p544o0o0OoOO.d7;
import p603o0oo00o0.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public class SelectRoomTagActivity extends BaseActivity {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f23032OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public o000oOoO f23033OoooOoO;

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_selector_tag);
        this.f11463OoooO.setTitle(R.string.tag);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rec_tag);
        this.f23032OoooOo0 = recyclerView;
        recyclerView.setLayoutManager(new FixLinearLayoutManager(this));
        o000oOoO o000oooo2 = new o000oOoO();
        this.f23033OoooOoO = o000oooo2;
        this.f23032OoooOo0.setAdapter(o000oooo2);
        this.f23032OoooOo0.addItemDecoration(new o00000OO(this));
        this.f23033OoooOoO.f31273OooO0O0 = new d7(this);
        c7 c7Var = new c7(this, this);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32333o0OO00O, mapOooO0O0, c7Var);
    }
}
