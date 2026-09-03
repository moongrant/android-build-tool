package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.model.CommonListResult;
import com.yalla.yalla.ui.adapter.SelectorTagAdapter;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import p555o0oOOooO.o0OOo000;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public class SelectRoomTagActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public SelectorTagAdapter f26712OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26713OooOOo0;

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_selector_tag);
        this.f22755OooOO0.setTitle(oO00OOo0.tag);
        RecyclerView recyclerView = (RecyclerView) findViewById(oO00O0oO.rec_tag);
        this.f26713OooOOo0 = recyclerView;
        recyclerView.setLayoutManager(new FixLinearLayoutManager(this));
        SelectorTagAdapter selectorTagAdapter = new SelectorTagAdapter();
        this.f26712OooOOo = selectorTagAdapter;
        this.f26713OooOOo0.setAdapter(selectorTagAdapter);
        this.f26713OooOOo0.addItemDecoration(new o0OOo000(this));
        this.f26712OooOOo.f27456OooO0O0 = new o0O0o000(this);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(this) { // from class: com.yalla.yalla.ui.activity.room.SelectRoomTagActivity.1
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(String str) {
                try {
                    CommonListResult commonListResult = (CommonListResult) oOo00OO0.OooO0O0(str, new TypeToken<CommonListResult<CategoryModel>>() { // from class: com.yalla.yalla.ui.activity.room.SelectRoomTagActivity.1.1
                    }.getType());
                    if (commonListResult != null) {
                        SelectorTagAdapter selectorTagAdapter2 = SelectRoomTagActivity.this.f26712OooOOo;
                        selectorTagAdapter2.f27455OooO00o = commonListResult.data;
                        selectorTagAdapter2.notifyDataSetChanged();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44184o0ooOOo, oO00o000.OooO00o(), oooO0O0);
    }
}
