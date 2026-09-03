package com.yalla.yalla.ui.activity.store;

import android.os.Bundle;
import com.app.base.base.activity.BaseActivity;
import com.weieyu.yalla.R;

/* JADX INFO: loaded from: classes3.dex */
public class SkillCarDescriptionActivity extends BaseActivity {
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_skill_card_description);
        OooOo(R.string.Instructions);
    }
}
