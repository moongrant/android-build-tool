package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.model.CommonListResult;
import com.yalla.yalla.ui.adapter.SelectorTagAdapter;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public class SelectRoomTagActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public SelectorTagAdapter f26258OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26259OooOOo0;

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_selector_tag);
        this.f22282OooOO0.setTitle(p562o0oOo000.o000000.tag);
        RecyclerView recyclerView = (RecyclerView) findViewById(p562o0oOo000.o0OO00O.rec_tag);
        this.f26259OooOOo0 = recyclerView;
        recyclerView.setLayoutManager(new FixLinearLayoutManager(this));
        SelectorTagAdapter selectorTagAdapter = new SelectorTagAdapter();
        this.f26258OooOOo = selectorTagAdapter;
        this.f26259OooOOo0.setAdapter(selectorTagAdapter);
        this.f26259OooOOo0.addItemDecoration(new p560o0oOo0.Oooo000(this));
        this.f26258OooOOo.f26991OooO0O0 = new o0O0O0O(this);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(this) { // from class: com.yalla.yalla.ui.activity.room.SelectRoomTagActivity.1
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(String str) {
                try {
                    CommonListResult commonListResult = (CommonListResult) oOOO00.OooO0O0(str, new TypeToken<CommonListResult<CategoryModel>>() { // from class: com.yalla.yalla.ui.activity.room.SelectRoomTagActivity.1.1
                    }.getType());
                    if (commonListResult != null) {
                        SelectorTagAdapter selectorTagAdapter2 = SelectRoomTagActivity.this.f26258OooOOo;
                        selectorTagAdapter2.f26990OooO00o = commonListResult.data;
                        selectorTagAdapter2.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43443o0ooOOo, p426o0OoO0o0.OooOOOO.OooO00o(), oooO0O0);
    }
}
