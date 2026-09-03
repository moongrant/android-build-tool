package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.app.base.app.appConfig.apiDataModela.ApiTagUtils;
import com.app.base.base.activity.BaseActivity;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.weieyu.yalla.R;

/* JADX INFO: loaded from: classes2.dex */
public class RoomReTagActivity extends BaseActivity {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final /* synthetic */ int f22964Ooooo00 = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public o00OO0OO.OooO0O0 f22965OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public ListView f22966OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public RoomConfiguration f22967OoooOoo;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f22968OooO00o;

        static {
            int[] iArr = new int[AbsListenerTag.values().length];
            f22968OooO00o = iArr;
            try {
                iArr[AbsListenerTag.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_room_re_tag);
        if (getIntent() == null) {
            finish();
        } else {
            this.f22967OoooOoo = (RoomConfiguration) getIntent().getSerializableExtra("Module");
        }
        this.f11463OoooO.setTitle(R.string.createBar_txt_Category);
        this.f22966OoooOoO = (ListView) findViewById(R.id.activity_room_re_tag_listview);
        o00OO0OO.OooO0O0 oooO0O0 = new o00OO0OO.OooO0O0(this);
        this.f22965OoooOo0 = oooO0O0;
        oooO0O0.f32546Oooo0o = new OooOOO0(this);
        this.f22966OoooOoO.setAdapter((ListAdapter) oooO0O0);
        o00OO0OO.OooO0O0 oooO0O1 = this.f22965OoooOo0;
        ApiTagUtils apiTagUtils = ApiTagUtils.INSTANCE;
        oooO0O1.OooO0o0(apiTagUtils.getListModel());
        apiTagUtils.init();
    }
}
